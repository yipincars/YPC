package com.yipincars.admin.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.yipincars.admin.dao.SellerDao;
import com.yipincars.admin.model.Seller;

public class SellerDaoImpl implements SellerDao {

	private JdbcTemplate jdbcTemplate;
	
	public static final String INSERT_SELLER = "INSERT INTO seller(new_car_id, telephone, timestamp)"
			+ " VALUES (?, ?, ?)";
	public static final String DELETE_SELLER = "DELETE FROM seller WHERE ";
	public static final String UPDATE_REMARK = "UPDATE seller SET remark=? where id=?";
	public static final String GET_SELLER = "";

	
	public void addSeller(Seller seller) {
		Object[] values = {seller.getNewCarId(),seller.getTelephone(),new Date()};
		jdbcTemplate.update(INSERT_SELLER, values);
	}

	public void delSellers(String ids) {
		String sql = DELETE_SELLER  + " id in (" + ids + ")";
		jdbcTemplate.update(sql);
	}

	
	public void updateRemark(Long id, String remark) {
		
		Object[] values = {remark, id};
		jdbcTemplate.update(UPDATE_REMARK, values);

	}

	
	public List<Seller> getUnDealed() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
