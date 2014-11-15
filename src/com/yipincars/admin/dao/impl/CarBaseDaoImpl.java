package com.yipincars.admin.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.yipincars.admin.dao.CarBaseDao;
import com.yipincars.admin.model.CarBase;

public class CarBaseDaoImpl implements CarBaseDao{

	private JdbcTemplate jdbcTemplate;
	
	private static final String INSERT_CARBASE = "INSERT INTO car_base(new_car_id, place, price, older, gearbox," +
			"classify, register_time, mileage, platen_number, exhaust, annual_inspection, forced_insurance, business_insurance, transfor_number," +
			"transfor_last_time, detect_time, seller_name, seller_job, seller_home_address, seller_telephone,seller_description, master_name, master_number," +
			"master_description,quality_level) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	private static final String DELETE_CARBASE = "DELETE FROM car_base WHERE ";
	private static final String UPDATE_CARBASE = "UPDATE car_base SET new_car_id=?, place=?, price=?, older=?, gearbox=?," +
			"classify=?, register_time=?, mileage=?, platen_number=?, exhaust=?, annual_inspection=?, forced_insurance=?, " +
			"business_insurance=?, transfor_number=?, transfor_last_time=?, detect_time=?, seller_name=?, seller_job=?, " +
			"seller_home_address=?, seller_telephone=?,seller_description=?, master_name=?, master_number=?," +
			"master_description=?,quality_level=? WHERE id=?";
	
	private static final String QUERY_CARBASES = "SELECT * FROM car_base where ";
	
	public long addCarBase(CarBase carBase) {

		final Object[] values = {carBase.getNewCarId(), carBase.getPrice(), carBase.getOlder(), carBase.getGearbox(),
				carBase.getClassify(), carBase.getRegisterTime(), carBase.getMileage(), carBase.getPlatenNumber(),
				carBase.getExhaust(), carBase.getAnnualInspection(), carBase.getForcedInsurance(), 
				carBase.getBusinessInsurance(), carBase.getTransforNumber(), carBase.getTransforLastTime(),
				carBase.getDetectTime(), carBase.getSellerName(), carBase.getSellerJob(), carBase.getSellerHomeAddress(),
				carBase.getSellerDescription(), carBase.getMasterName(), carBase.getMasterNumber(), carBase.getMasterDescription()};
		
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator(){
			
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement(INSERT_CARBASE,Statement.RETURN_GENERATED_KEYS);
				for(int i=0; i < values.length; i++){
					ps.setObject(i + 1, values[i]);
				}
				return ps;
			}
			
		},keyHolder);
		return keyHolder.getKey().longValue();
	}

	
	public void delCarBase(String ids) {
		String sql = DELETE_CARBASE  + " id in (" + ids + ")";
		jdbcTemplate.update(sql);
		
	}

	public void updateCarBase(CarBase carBase) {
		Object[] values = {carBase.getNewCarId(), carBase.getPrice(), carBase.getOlder(), carBase.getGearbox(),
				carBase.getClassify(), carBase.getRegisterTime(), carBase.getMileage(), carBase.getPlatenNumber(),
				carBase.getExhaust(), carBase.getAnnualInspection(), carBase.getForcedInsurance(), 
				carBase.getBusinessInsurance(), carBase.getTransforNumber(), carBase.getTransforLastTime(),
				carBase.getDetectTime(), carBase.getSellerName(), carBase.getSellerJob(), carBase.getSellerHomeAddress(),
				carBase.getSellerDescription(), carBase.getMasterName(), carBase.getMasterNumber(), 
				carBase.getMasterDescription(), carBase.getId()};
		
		jdbcTemplate.update(UPDATE_CARBASE, values);
	}

	@SuppressWarnings("unchecked")
	public List<CarBase> getCarBase4Admin(Map<String, Object> queryCondition) {
		
		String sql = QUERY_CARBASES;
		List<Object> values = new ArrayList<Object>();
		
		for(String key : queryCondition.keySet()){
			sql += (key + "=? AND ");
			values.add(queryCondition.get(key));
		}
		StringUtils.removeEnd(sql, "AND ");
		
		return jdbcTemplate.query(sql, values.toArray(), new RowMapper(){
			
			public CarBase mapRow(ResultSet rs,int rowNum) throws SQLException{
				CarBase carBase = new CarBase();
				
				carBase.setId(rs.getLong("id"));
				
				
				
				return carBase;
			}
		});
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


}
