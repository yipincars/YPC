package com.yipincars.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Business entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "business", catalog = "yipincars")
public class Business implements java.io.Serializable {

	// Fields

	private Long id;
	private String carBaseinfoId;
	private String carDetectionInfoId;
	private String sellerInfoId;
	private String remark;

	// Constructors

	/** default constructor */
	public Business() {
	}

	/** full constructor */
	public Business(String carBaseinfoId, String carDetectionInfoId,
			String sellerInfoId, String remark) {
		this.carBaseinfoId = carBaseinfoId;
		this.carDetectionInfoId = carDetectionInfoId;
		this.sellerInfoId = sellerInfoId;
		this.remark = remark;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "car_baseinfo_id", length = 45)
	public String getCarBaseinfoId() {
		return this.carBaseinfoId;
	}

	public void setCarBaseinfoId(String carBaseinfoId) {
		this.carBaseinfoId = carBaseinfoId;
	}

	@Column(name = "car_detection_info_id", length = 45)
	public String getCarDetectionInfoId() {
		return this.carDetectionInfoId;
	}

	public void setCarDetectionInfoId(String carDetectionInfoId) {
		this.carDetectionInfoId = carDetectionInfoId;
	}

	@Column(name = "seller_info_id", length = 45)
	public String getSellerInfoId() {
		return this.sellerInfoId;
	}

	public void setSellerInfoId(String sellerInfoId) {
		this.sellerInfoId = sellerInfoId;
	}

	@Column(name = "remark", length = 45)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}