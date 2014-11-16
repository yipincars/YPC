package com.yipincars.admin.dao.impl;

import java.io.Serializable;
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
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.yipincars.admin.dao.CarBaseDao;
import com.yipincars.admin.model.CarBase;

public class CarBaseDaoImpl implements CarBaseDao{

	private JdbcTemplate jdbcTemplate;
	private HibernateTemplate hibernateTemplate;
	
	private static final String DELETE_CARBASE = "DELETE FROM car_base WHERE ";
	private static final String QUERY_CARBASE_BY_ID = "SELECT * FROM car_base WHERE=";
	
	private static final String QUERY_CARBASES = "SELECT * FROM car_base WHERE ";
	private static final String QUERY_ALL_CARBASES = "FROM CarBase";
	
	public long addCarBase(CarBase carBase) {

		Serializable id = hibernateTemplate.save(carBase);
		System.out.println(id.toString());
		return Long.valueOf(id.toString());
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
		
//		jdbcTemplate.update(UPDATE_CARBASE, values);
	}

	@SuppressWarnings("unchecked")
	public List<CarBase> getCarBase4Admin(Map<String, Object> queryCondition) {
		
		Long pageNo = Long.valueOf((String)queryCondition.remove("pageNo"));
		Long pageCount = Long.valueOf((String)queryCondition.remove("pageCount"));
		
		String sql = QUERY_CARBASES;
		List<Object> values = new ArrayList<Object>();
		
		for(String key : queryCondition.keySet()){
			sql += (key + "=? AND ");
			values.add(queryCondition.get(key));
		}
		if(sql.contains("AND")){
			sql = StringUtils.removeEnd(sql, "AND ");
		}else{
			sql = StringUtils.remove(sql, "WHERE ");
		}
		sql += ("LIMIT " + (pageNo - 1) * pageCount + "," + pageCount);
		
		return jdbcTemplate.query(sql, values.toArray(), new RowMapper(){
			
			public CarBase mapRow(ResultSet rs,int rowNum) throws SQLException{
				CarBase carBase = new CarBase();
				carBase.setId(rs.getLong("id"));
				carBase.setNewCarId(rs.getLong("new_car_id"));
				carBase.setPrice(rs.getFloat("price"));
				carBase.setQualityLevel(rs.getString("quality_level"));
				carBase.setRegisterTime(rs.getDate("register_time"));
				carBase.setDetectTime(rs.getDate("detect_time"));
				carBase.setMasterDescription(rs.getString("master_description"));
				carBase.setSellerDescription(rs.getString("seller_description"));
				carBase.setSellerTelephone(rs.getString("seller_telephone"));
				
				return carBase;
			}
		});
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	public CarBase getCarBaseById(String id) {
		return (CarBase) hibernateTemplate.find(QUERY_CARBASE_BY_ID).get(0);
		
	}


	public List<CarBase> getAllCarBases() {
		return hibernateTemplate.find(QUERY_ALL_CARBASES);
	}


}
