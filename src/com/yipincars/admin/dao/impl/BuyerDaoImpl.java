package com.yipincars.admin.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yipincars.admin.dao.BuyerDao;
import com.yipincars.admin.model.Buyer;

public class BuyerDaoImpl implements BuyerDao {

	private JdbcTemplate jdbcTemplate;

	private static final String QUERY_BUYER = "SELECT * FROM buyer WHERE ";

	@SuppressWarnings("unchecked")
	public List<Buyer> getBuyer(Map<String, Object> queryCondition) {

		Long pageNo = Long.valueOf((String) queryCondition.remove("pageNo"));
		Long pageCount = Long.valueOf((String) queryCondition.remove("pageCount"));

		String sql = QUERY_BUYER;
		List<Object> values = new ArrayList<Object>();

		for (String key : queryCondition.keySet()) {
			sql += (key + "=? AND ");
			values.add(queryCondition.get(key));
		}
		if (sql.contains("AND")) {
			sql = StringUtils.removeEnd(sql, "AND ");
		} else {
			sql = StringUtils.remove(sql, "WHERE ");
		}
		sql += ("LIMIT " + (pageNo - 1) * pageCount + "," + pageCount);

		return jdbcTemplate.query(sql, values.toArray(), new RowMapper() {

			public Buyer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Buyer buyer = new Buyer();

				buyer.setId(rs.getLong("id"));
				buyer.setCarId(rs.getLong("car_id"));
				buyer.setName(rs.getString("name"));
				buyer.setTelephone(rs.getLong("telephone"));
				
				return buyer;
			}
		});
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
