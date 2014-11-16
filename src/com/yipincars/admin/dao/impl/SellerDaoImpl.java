package com.yipincars.admin.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yipincars.admin.dao.SellerDao;
import com.yipincars.admin.model.CarBase;
import com.yipincars.admin.model.Seller;

public class SellerDaoImpl implements SellerDao {

	private JdbcTemplate jdbcTemplate;
	
	public static final String INSERT_SELLER = "INSERT INTO seller(new_car_id, telephone, timestamp)"
			+ " VALUES (?, ?, ?)";
	public static final String DELETE_SELLER = "DELETE FROM seller WHERE ";
	public static final String UPDATE_REMARK = "UPDATE seller SET remark=? where id=?";
	public static final String GET_SELLER = "";
	private static final String QUERY_SELLER = "SELECT * FROM seller WHERE ";

	
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

	@SuppressWarnings("unchecked")
	public List<Seller> getSellers(Map<String, Object> queryCondition) {
		
		Long pageNo = Long.valueOf((String)queryCondition.remove("pageNo"));
		Long pageCount = Long.valueOf((String)queryCondition.remove("pageCount"));
		
		String sql = QUERY_SELLER;
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
			
			public Seller mapRow(ResultSet rs,int rowNum) throws SQLException{
				Seller seller = new Seller();
				
				seller.setId(rs.getLong("id"));
				seller.setNewCarId(rs.getLong("new_car_id"));
				seller.setRemark(rs.getString("remark"));
				seller.setTelephone(rs.getLong("telephone"));
				
				return seller;
			}
		});
	}
	
	public List<Seller> getUnDealed() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
