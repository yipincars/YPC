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
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.yipincars.admin.dao.NewCarDao;
import com.yipincars.admin.model.NewCar;
import com.yipincars.admin.model.Seller;

public class NewCarDaoImpl implements NewCarDao{

	
	private JdbcTemplate jdbcTemplate;
	private HibernateTemplate hibernateTemplate;
	
	private static final String INSERT_NEWCAR = "INSERT INTO new_car(base_make, base_produce_place, base_line, base_market_time, base_model," +
			"base_color, base_gearbox, base_seat, base_lwh, base_trunk_volume, base_wheel_hub, drive_oil_consumption, drive_output_volume, " +
			"drive_air_type, drive_max_torque, drive_discharge, safe_children_seat, safe_middle_lock, safe_tire_pressure, underpan_drive_type," +
			"underpan_turn_system, underpan_head_suspension, underpan_tail_suspension, brake_head, brake_tail, brake_head_tire_norm, " +
			"brake_tail_tire_norm, current_price) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	private static final String DELETE_NEWCAR = "DELETE FROM new_car WHERE ";
	
	private static final String UPDATE_NEWCAR = "UPDATE new_car SET base_make=?, base_produce_place=?, base_line=?, base_market_time=?, base_model=?," +
			"base_color=?, base_gearbox=?, base_seat=?, base_lwh=?, base_trunk_volume=?, base_wheel_hub=?, drive_oil_consumption=?, drive_output_volume=?, " +
			"drive_air_type=?, drive_max_torque=?, drive_discharge=?, safe_children_seat=?, safe_middle_lock=?, safe_tire_pressure=?, underpan_drive_type=?," +
			"underpan_turn_system=?, underpan_head_suspension=?, underpan_tail_suspension=?, brake_head=?, brake_tail=?, brake_head_tire_norm=?, " +
			"brake_tail_tire_norm=?, current_price=? WHERE id=?";
	
	private static final String QUERY_ALL_NEWCARS = "FROM NewCar";
	private static final String QUERY_NEWCARS = "SELECT * FROM new_car WHERE ";
	
	public long addNewCar(NewCar newCar) {
		final Object[] values = {newCar.getBaseMake(), newCar.getBaseProducePlace(), newCar.getBaseLine(), newCar.getBaseMarketTime(), 
				newCar.getBaseModel(), newCar.getBaseColor(), newCar.getBaseGearbox(), newCar.getBaseSeat(), newCar.getBaseLwh(),
				newCar.getBaseTrunkVolume(), newCar.getBaseWheelHub(), newCar.getDriveOilConsumption(), newCar.getDriveOutputVolume(),
				newCar.getDriveAirType(), newCar.getDriveMaxTorque(), newCar.getDriveDischarge(), newCar.getSafeChildrenSeat(),
				newCar.getSafeMiddleLock(), newCar.getSafeTirePressure(), newCar.getUnderpanDriveType(), newCar.getUnderpanTurnSystem(), 
				newCar.getUnderpanHeadSuspension(), newCar.getUnderpanTailSuspension(), newCar.getBrakeHead(), newCar.getBrakeTail(),
				newCar.getBrakeHeadTireNorm(), newCar.getBrakeTailTireNorm(), newCar.getCurrentPrice()};
		
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator(){
			
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement(INSERT_NEWCAR,Statement.RETURN_GENERATED_KEYS);
				for(int i=0; i < values.length; i++){
					ps.setObject(i + 1, values[i]);
				}
				return ps;
			}
			
		},keyHolder);
		return keyHolder.getKey().longValue();
	}

	public void delNewCars(String ids) {
		String sql = DELETE_NEWCAR  + " id in (" + ids + ")";
		jdbcTemplate.update(sql);
	}

	public void updateNewCar(NewCar newCar) {
		Object[] values = {newCar.getBaseMake(), newCar.getBaseProducePlace(), newCar.getBaseLine(), newCar.getBaseMarketTime(), 
				newCar.getBaseModel(), newCar.getBaseColor(), newCar.getBaseGearbox(), newCar.getBaseSeat(), newCar.getBaseLwh(),
				newCar.getBaseTrunkVolume(), newCar.getBaseWheelHub(), newCar.getDriveOilConsumption(), newCar.getDriveOutputVolume(),
				newCar.getDriveAirType(), newCar.getDriveMaxTorque(), newCar.getDriveDischarge(), newCar.getSafeChildrenSeat(),
				newCar.getSafeMiddleLock(), newCar.getSafeTirePressure(), newCar.getUnderpanDriveType(), newCar.getUnderpanTurnSystem(), 
				newCar.getUnderpanHeadSuspension(), newCar.getUnderpanTailSuspension(), newCar.getBrakeHead(), newCar.getBrakeTail(),
				newCar.getBrakeHeadTireNorm(), newCar.getBrakeTailTireNorm(), newCar.getCurrentPrice(), newCar.getId()};
		
		jdbcTemplate.update(UPDATE_NEWCAR, values);
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<NewCar> getAllNewCars() {
		return hibernateTemplate.find(QUERY_ALL_NEWCARS);
		
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@SuppressWarnings("unchecked")
	public List<NewCar> getNewCars(Map<String, Object> queryCondition) {
		Long pageNo = Long.valueOf((String)queryCondition.remove("pageNo"));
		Long pageCount = Long.valueOf((String)queryCondition.remove("pageCount"));
		
		String sql = QUERY_NEWCARS;
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
			
			public NewCar mapRow(ResultSet rs,int rowNum) throws SQLException{
				NewCar newCar = new NewCar();
				newCar.setId(rs.getLong("id"));
				
				return newCar;
			}
		});
	}
	
}
