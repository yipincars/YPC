package com.yipincars.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Buyer entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "buyer", catalog = "yipincars")
public class Buyer implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private Long telephone;
	private Long carId;

	// Constructors

	/** default constructor */
	public Buyer() {
	}

	/** minimal constructor */
	public Buyer(Long telephone) {
		this.telephone = telephone;
	}

	/** full constructor */
	public Buyer(String name, Long telephone, Long carId) {
		this.name = name;
		this.telephone = telephone;
		this.carId = carId;
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

	@Column(name = "name", length = 8)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "telephone", nullable = false)
	public Long getTelephone() {
		return this.telephone;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

	@Column(name = "car_id")
	public Long getCarId() {
		return this.carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}

}