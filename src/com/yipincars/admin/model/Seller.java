package com.yipincars.admin.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Seller entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "seller", catalog = "yipincars")
public class Seller implements java.io.Serializable {

	// Fields

	private Long id;
	private Long newCarId;
	private Long telephone;
	private Timestamp timestamp;
	private String remark;

	// Constructors

	/** default constructor */
	public Seller() {
	}

	/** minimal constructor */
	public Seller(Long newCarId, Long telephone, Timestamp timestamp) {
		this.newCarId = newCarId;
		this.telephone = telephone;
		this.timestamp = timestamp;
	}

	/** full constructor */
	public Seller(Long newCarId, Long telephone, Timestamp timestamp,
			String remark) {
		this.newCarId = newCarId;
		this.telephone = telephone;
		this.timestamp = timestamp;
		this.remark = remark;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "Id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "new_car_id", nullable = false)
	public Long getNewCarId() {
		return this.newCarId;
	}

	public void setNewCarId(Long newCarId) {
		this.newCarId = newCarId;
	}

	@Column(name = "telephone", nullable = false)
	public Long getTelephone() {
		return this.telephone;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

	@Column(name = "timestamp", nullable = false, length = 19)
	public Timestamp getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	@Column(name = "remark", length = 200)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}