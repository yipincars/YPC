package com.yipincars.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.yipincars.dao.CarDetectionDao;
import com.yipincars.model.CarDetection;

public class CarDetectionDaoImpl implements CarDetectionDao{

	private JdbcTemplate jdbcTemplate;
	private HibernateTemplate hibernateTemplate;
	
	private static final String DELETE_CARDETECTION = "DELETE FROM car_base WHERE ";
	private static final String QUERY_CARDETECTION_BY_CARBASEID = "SELECT * FROM car_detection WHERE car_base_id=?";
	
	public long addCarDetection(CarDetection carDetection) {
		Serializable id = hibernateTemplate.save(carDetection);
		return Long.valueOf(id.toString());
	}

	public void delCarDetection(String id) {
		// TODO Auto-generated method stub
		
	}

	public CarDetection getCarDetectionByCarBaseId(long carBaseId){
		List<CarDetection> carDetections = hibernateTemplate.find(QUERY_CARDETECTION_BY_CARBASEID, carBaseId);
		if(carDetections == null || carDetections.isEmpty()){
			return null;
		}else{
			return carDetections.get(0);
		}
	}
	public void updateCarDetection(CarDetection carDetection) {
		hibernateTemplate.update(carDetection);
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
