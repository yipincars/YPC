package com.yipincars.admin.dao.impl;

import java.io.Serializable;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.yipincars.admin.dao.CarDetectionDao;
import com.yipincars.admin.model.CarDetection;

public class CarDetectionDaoImpl implements CarDetectionDao{

	private JdbcTemplate jdbcTemplate;
	private HibernateTemplate hibernateTemplate;
	
	private static final String DELETE_CARDETECTION = "DELETE FROM car_base WHERE ";
	private static final String QUERY_CARDETECTION = "SELECT * FROM car_base WHERE ";
	
	public long addCarDetection(CarDetection carDetection) {
		Serializable id = hibernateTemplate.save(carDetection);
		return Long.valueOf(id.toString());
	}

	public void delCarDetection(String id) {
		// TODO Auto-generated method stub
		
	}

	public void updateCarDetection(CarDetection carDetection) {
		hibernateTemplate.update(carDetection);
	}

}
