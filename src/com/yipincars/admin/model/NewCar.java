package com.yipincars.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * NewCar entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "new_car", catalog = "yipincars", uniqueConstraints = @UniqueConstraint(columnNames = "base_make"))
public class NewCar implements java.io.Serializable {

	// Fields

	private Long id;
	private String baseMake;
	private String baseProducePlace;
	private String baseLine;
	private String baseMarketTime;
	private String baseModel;
	private String baseColor;
	private String baseGearbox;
	private String baseSeat;
	private String baseLwh;
	private String baseTrunkVolume;
	private String baseWheelHub;
	private String driveOilConsumption;
	private String driveOutputVolume;
	private String driveAirType;
	private String driveMaxTorque;
	private String driveDischarge;
	private String safeChildrenSeat;
	private String safeMiddleLock;
	private String safeTirePressure;
	private String underpanDriveType;
	private String underpanTurnSystem;
	private String underpanHeadSuspension;
	private String underpanTailSuspension;
	private String brakeHead;
	private String brakeTail;
	private String brakeHeadTireNorm;
	private String brakeTailTireNorm;
	private Float currentPrice;

	// Constructors

	/** default constructor */
	public NewCar() {
	}

	/** full constructor */
	public NewCar(String baseMake, String baseProducePlace, String baseLine,
			String baseMarketTime, String baseModel, String baseColor,
			String baseGearbox, String baseSeat, String baseLwh,
			String baseTrunkVolume, String baseWheelHub,
			String driveOilConsumption, String driveOutputVolume,
			String driveAirType, String driveMaxTorque, String driveDischarge,
			String safeChildrenSeat, String safeMiddleLock,
			String safeTirePressure, String underpanDriveType,
			String underpanTurnSystem, String underpanHeadSuspension,
			String underpanTailSuspension, String brakeHead, String brakeTail,
			String brakeHeadTireNorm, String brakeTailTireNorm,
			Float currentPrice) {
		this.baseMake = baseMake;
		this.baseProducePlace = baseProducePlace;
		this.baseLine = baseLine;
		this.baseMarketTime = baseMarketTime;
		this.baseModel = baseModel;
		this.baseColor = baseColor;
		this.baseGearbox = baseGearbox;
		this.baseSeat = baseSeat;
		this.baseLwh = baseLwh;
		this.baseTrunkVolume = baseTrunkVolume;
		this.baseWheelHub = baseWheelHub;
		this.driveOilConsumption = driveOilConsumption;
		this.driveOutputVolume = driveOutputVolume;
		this.driveAirType = driveAirType;
		this.driveMaxTorque = driveMaxTorque;
		this.driveDischarge = driveDischarge;
		this.safeChildrenSeat = safeChildrenSeat;
		this.safeMiddleLock = safeMiddleLock;
		this.safeTirePressure = safeTirePressure;
		this.underpanDriveType = underpanDriveType;
		this.underpanTurnSystem = underpanTurnSystem;
		this.underpanHeadSuspension = underpanHeadSuspension;
		this.underpanTailSuspension = underpanTailSuspension;
		this.brakeHead = brakeHead;
		this.brakeTail = brakeTail;
		this.brakeHeadTireNorm = brakeHeadTireNorm;
		this.brakeTailTireNorm = brakeTailTireNorm;
		this.currentPrice = currentPrice;
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

	@Column(name = "base_make", unique = true)
	public String getBaseMake() {
		return this.baseMake;
	}

	public void setBaseMake(String baseMake) {
		this.baseMake = baseMake;
	}

	@Column(name = "base_produce_place")
	public String getBaseProducePlace() {
		return this.baseProducePlace;
	}

	public void setBaseProducePlace(String baseProducePlace) {
		this.baseProducePlace = baseProducePlace;
	}

	@Column(name = "base_line")
	public String getBaseLine() {
		return this.baseLine;
	}

	public void setBaseLine(String baseLine) {
		this.baseLine = baseLine;
	}

	@Column(name = "base_market_time")
	public String getBaseMarketTime() {
		return this.baseMarketTime;
	}

	public void setBaseMarketTime(String baseMarketTime) {
		this.baseMarketTime = baseMarketTime;
	}

	@Column(name = "base_model")
	public String getBaseModel() {
		return this.baseModel;
	}

	public void setBaseModel(String baseModel) {
		this.baseModel = baseModel;
	}

	@Column(name = "base_color")
	public String getBaseColor() {
		return this.baseColor;
	}

	public void setBaseColor(String baseColor) {
		this.baseColor = baseColor;
	}

	@Column(name = "base_gearbox")
	public String getBaseGearbox() {
		return this.baseGearbox;
	}

	public void setBaseGearbox(String baseGearbox) {
		this.baseGearbox = baseGearbox;
	}

	@Column(name = "base_seat")
	public String getBaseSeat() {
		return this.baseSeat;
	}

	public void setBaseSeat(String baseSeat) {
		this.baseSeat = baseSeat;
	}

	@Column(name = "base_lwh")
	public String getBaseLwh() {
		return this.baseLwh;
	}

	public void setBaseLwh(String baseLwh) {
		this.baseLwh = baseLwh;
	}

	@Column(name = "base_trunk_volume")
	public String getBaseTrunkVolume() {
		return this.baseTrunkVolume;
	}

	public void setBaseTrunkVolume(String baseTrunkVolume) {
		this.baseTrunkVolume = baseTrunkVolume;
	}

	@Column(name = "base_wheel_hub")
	public String getBaseWheelHub() {
		return this.baseWheelHub;
	}

	public void setBaseWheelHub(String baseWheelHub) {
		this.baseWheelHub = baseWheelHub;
	}

	@Column(name = "drive_oil_consumption")
	public String getDriveOilConsumption() {
		return this.driveOilConsumption;
	}

	public void setDriveOilConsumption(String driveOilConsumption) {
		this.driveOilConsumption = driveOilConsumption;
	}

	@Column(name = "drive_output_volume")
	public String getDriveOutputVolume() {
		return this.driveOutputVolume;
	}

	public void setDriveOutputVolume(String driveOutputVolume) {
		this.driveOutputVolume = driveOutputVolume;
	}

	@Column(name = "drive_air_type")
	public String getDriveAirType() {
		return this.driveAirType;
	}

	public void setDriveAirType(String driveAirType) {
		this.driveAirType = driveAirType;
	}

	@Column(name = "drive_max_torque")
	public String getDriveMaxTorque() {
		return this.driveMaxTorque;
	}

	public void setDriveMaxTorque(String driveMaxTorque) {
		this.driveMaxTorque = driveMaxTorque;
	}

	@Column(name = "drive_discharge")
	public String getDriveDischarge() {
		return this.driveDischarge;
	}

	public void setDriveDischarge(String driveDischarge) {
		this.driveDischarge = driveDischarge;
	}

	@Column(name = "safe_children_seat")
	public String getSafeChildrenSeat() {
		return this.safeChildrenSeat;
	}

	public void setSafeChildrenSeat(String safeChildrenSeat) {
		this.safeChildrenSeat = safeChildrenSeat;
	}

	@Column(name = "safe_middle_lock")
	public String getSafeMiddleLock() {
		return this.safeMiddleLock;
	}

	public void setSafeMiddleLock(String safeMiddleLock) {
		this.safeMiddleLock = safeMiddleLock;
	}

	@Column(name = "safe_tire_pressure")
	public String getSafeTirePressure() {
		return this.safeTirePressure;
	}

	public void setSafeTirePressure(String safeTirePressure) {
		this.safeTirePressure = safeTirePressure;
	}

	@Column(name = "underpan_drive_type")
	public String getUnderpanDriveType() {
		return this.underpanDriveType;
	}

	public void setUnderpanDriveType(String underpanDriveType) {
		this.underpanDriveType = underpanDriveType;
	}

	@Column(name = "underpan_turn_system")
	public String getUnderpanTurnSystem() {
		return this.underpanTurnSystem;
	}

	public void setUnderpanTurnSystem(String underpanTurnSystem) {
		this.underpanTurnSystem = underpanTurnSystem;
	}

	@Column(name = "underpan_head_suspension")
	public String getUnderpanHeadSuspension() {
		return this.underpanHeadSuspension;
	}

	public void setUnderpanHeadSuspension(String underpanHeadSuspension) {
		this.underpanHeadSuspension = underpanHeadSuspension;
	}

	@Column(name = "underpan_tail_suspension")
	public String getUnderpanTailSuspension() {
		return this.underpanTailSuspension;
	}

	public void setUnderpanTailSuspension(String underpanTailSuspension) {
		this.underpanTailSuspension = underpanTailSuspension;
	}

	@Column(name = "brake_head")
	public String getBrakeHead() {
		return this.brakeHead;
	}

	public void setBrakeHead(String brakeHead) {
		this.brakeHead = brakeHead;
	}

	@Column(name = "brake_tail")
	public String getBrakeTail() {
		return this.brakeTail;
	}

	public void setBrakeTail(String brakeTail) {
		this.brakeTail = brakeTail;
	}

	@Column(name = "brake_head_tire_norm")
	public String getBrakeHeadTireNorm() {
		return this.brakeHeadTireNorm;
	}

	public void setBrakeHeadTireNorm(String brakeHeadTireNorm) {
		this.brakeHeadTireNorm = brakeHeadTireNorm;
	}

	@Column(name = "brake_tail_tire_norm")
	public String getBrakeTailTireNorm() {
		return this.brakeTailTireNorm;
	}

	public void setBrakeTailTireNorm(String brakeTailTireNorm) {
		this.brakeTailTireNorm = brakeTailTireNorm;
	}

	@Column(name = "current_price", precision = 10, scale = 0)
	public Float getCurrentPrice() {
		return this.currentPrice;
	}

	public void setCurrentPrice(Float currentPrice) {
		this.currentPrice = currentPrice;
	}

}