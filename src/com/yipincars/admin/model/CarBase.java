package com.yipincars.admin.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * CarBase entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "car_base", catalog = "yipincars", uniqueConstraints = {
		@UniqueConstraint(columnNames = "price"),
		@UniqueConstraint(columnNames = "gearbox"),
		@UniqueConstraint(columnNames = "older"),
		@UniqueConstraint(columnNames = "mileage"),
		@UniqueConstraint(columnNames = "classify") })
public class CarBase implements java.io.Serializable {

	// Fields

	private Long id;
	private Long newCarId;
	private String place;
	private Float price;
	private Integer older;
	private String gearbox;
	private String classify;
	private Date registerTime;
	private Float mileage;
	private String platenNumber;
	private String exhaust;
	private Date annualInspection;
	private Date forcedInsurance;
	private Date businessInsurance;
	private Integer transforNumber;
	private Date transforLastTime;
	private Date detectTime;
	private String sellerName;
	private String sellerJob;
	private String sellerHomeAddress;
	private String sellerTelephone;
	private String sellerDescription;
	private String masterName;
	private String masterNumber;
	private String masterDescription;
	private String qualityLevel;
	private Date inputTime;

	// Constructors

	/** default constructor */
	public CarBase() {
	}

	/** full constructor */
	public CarBase(Long newCarId, String place, Float price, Integer older,
			String gearbox, String classify, Date registerTime, Float mileage,
			String platenNumber, String exhaust, Date annualInspection,
			Date forcedInsurance, Date businessInsurance,
			Integer transforNumber, Date transforLastTime, Date detectTime,
			String sellerName, String sellerJob, String sellerHomeAddress,
			String sellerTelephone, String sellerDescription,
			String masterName, String masterNumber, String masterDescription,
			String qualityLevel, Date inputTime) {
		this.newCarId = newCarId;
		this.place = place;
		this.price = price;
		this.older = older;
		this.gearbox = gearbox;
		this.classify = classify;
		this.registerTime = registerTime;
		this.mileage = mileage;
		this.platenNumber = platenNumber;
		this.exhaust = exhaust;
		this.annualInspection = annualInspection;
		this.forcedInsurance = forcedInsurance;
		this.businessInsurance = businessInsurance;
		this.transforNumber = transforNumber;
		this.transforLastTime = transforLastTime;
		this.detectTime = detectTime;
		this.sellerName = sellerName;
		this.sellerJob = sellerJob;
		this.sellerHomeAddress = sellerHomeAddress;
		this.sellerTelephone = sellerTelephone;
		this.sellerDescription = sellerDescription;
		this.masterName = masterName;
		this.masterNumber = masterNumber;
		this.masterDescription = masterDescription;
		this.qualityLevel = qualityLevel;
		this.inputTime = inputTime;
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

	@Column(name = "new_car_id")
	public Long getNewCarId() {
		return this.newCarId;
	}

	public void setNewCarId(Long newCarId) {
		this.newCarId = newCarId;
	}

	@Column(name = "place")
	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Column(name = "price", unique = true, precision = 12, scale = 0)
	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Column(name = "older", unique = true)
	public Integer getOlder() {
		return this.older;
	}

	public void setOlder(Integer older) {
		this.older = older;
	}

	@Column(name = "gearbox", unique = true, length = 10)
	public String getGearbox() {
		return this.gearbox;
	}

	public void setGearbox(String gearbox) {
		this.gearbox = gearbox;
	}

	@Column(name = "classify", unique = true, length = 10)
	public String getClassify() {
		return this.classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "register_time", length = 10)
	public Date getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	@Column(name = "mileage", unique = true, precision = 12, scale = 0)
	public Float getMileage() {
		return this.mileage;
	}

	public void setMileage(Float mileage) {
		this.mileage = mileage;
	}

	@Column(name = "platen_number", length = 8)
	public String getPlatenNumber() {
		return this.platenNumber;
	}

	public void setPlatenNumber(String platenNumber) {
		this.platenNumber = platenNumber;
	}

	@Column(name = "exhaust", length = 8)
	public String getExhaust() {
		return this.exhaust;
	}

	public void setExhaust(String exhaust) {
		this.exhaust = exhaust;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "annual_inspection", length = 10)
	public Date getAnnualInspection() {
		return this.annualInspection;
	}

	public void setAnnualInspection(Date annualInspection) {
		this.annualInspection = annualInspection;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "forced_insurance", length = 10)
	public Date getForcedInsurance() {
		return this.forcedInsurance;
	}

	public void setForcedInsurance(Date forcedInsurance) {
		this.forcedInsurance = forcedInsurance;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "business_insurance", length = 10)
	public Date getBusinessInsurance() {
		return this.businessInsurance;
	}

	public void setBusinessInsurance(Date businessInsurance) {
		this.businessInsurance = businessInsurance;
	}

	@Column(name = "transfor_number")
	public Integer getTransforNumber() {
		return this.transforNumber;
	}

	public void setTransforNumber(Integer transforNumber) {
		this.transforNumber = transforNumber;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "transfor_last_time", length = 10)
	public Date getTransforLastTime() {
		return this.transforLastTime;
	}

	public void setTransforLastTime(Date transforLastTime) {
		this.transforLastTime = transforLastTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "detect_time", length = 10)
	public Date getDetectTime() {
		return this.detectTime;
	}

	public void setDetectTime(Date detectTime) {
		this.detectTime = detectTime;
	}

	@Column(name = "seller_name", length = 45)
	public String getSellerName() {
		return this.sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	@Column(name = "seller_job", length = 45)
	public String getSellerJob() {
		return this.sellerJob;
	}

	public void setSellerJob(String sellerJob) {
		this.sellerJob = sellerJob;
	}

	@Column(name = "seller_home_address", length = 45)
	public String getSellerHomeAddress() {
		return this.sellerHomeAddress;
	}

	public void setSellerHomeAddress(String sellerHomeAddress) {
		this.sellerHomeAddress = sellerHomeAddress;
	}

	@Column(name = "seller_telephone", length = 45)
	public String getSellerTelephone() {
		return this.sellerTelephone;
	}

	public void setSellerTelephone(String sellerTelephone) {
		this.sellerTelephone = sellerTelephone;
	}

	@Column(name = "seller_description", length = 65535)
	public String getSellerDescription() {
		return this.sellerDescription;
	}

	public void setSellerDescription(String sellerDescription) {
		this.sellerDescription = sellerDescription;
	}

	@Column(name = "master_name", length = 45)
	public String getMasterName() {
		return this.masterName;
	}

	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}

	@Column(name = "master_number", length = 45)
	public String getMasterNumber() {
		return this.masterNumber;
	}

	public void setMasterNumber(String masterNumber) {
		this.masterNumber = masterNumber;
	}

	@Column(name = "master_description", length = 65535)
	public String getMasterDescription() {
		return this.masterDescription;
	}

	public void setMasterDescription(String masterDescription) {
		this.masterDescription = masterDescription;
	}

	@Column(name = "quality_level", length = 10)
	public String getQualityLevel() {
		return this.qualityLevel;
	}

	public void setQualityLevel(String qualityLevel) {
		this.qualityLevel = qualityLevel;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "input_time", length = 10)
	public Date getInputTime() {
		return this.inputTime;
	}

	public void setInputTime(Date inputTime) {
		this.inputTime = inputTime;
	}

}