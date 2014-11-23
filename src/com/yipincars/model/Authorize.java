package com.yipincars.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Authorize entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "authorize", catalog = "yipincars")
public class Authorize implements java.io.Serializable {

	// Fields

	private Long id;
	private String username;
	private String password;
	private String level;

	// Constructors

	/** default constructor */
	public Authorize() {
	}

	/** full constructor */
	public Authorize(String username, String password, String level) {
		this.username = username;
		this.password = password;
		this.level = level;
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

	@Column(name = "username", nullable = false)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "level", nullable = false, length = 2)
	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

}