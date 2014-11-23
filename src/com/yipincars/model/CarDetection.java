package com.yipincars.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CarDetection entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "car_detection", catalog = "yipincars")
public class CarDetection implements java.io.Serializable {

	// Fields

	private Long id;
	private Long carBaseId;
	private String outsideFrameInfo;
	private String outsideHeadBumper;
	private String outsideTailBumper;
	private String outsideLeftMirror;
	private String outsideRightMirror;
	private String outsideLeftHeadlight;
	private String outsideRightHeadlight;
	private String outsideLeftTaillight;
	private String outsideRightTaillight;
	private String outsideWheelCover;
	private String outsideAntenna;
	private String outsideHeadScreen;
	private String outsideTailScreen;
	private String outsideGrille;
	private String outsideHeadGlass;
	private String outsideTailGlass;
	private String outsideHeadLeftGlass;
	private String outsideHeadRightGlass;
	private String outsideTailRightGlass;
	private String outsideTailLeftGlass;
	private String insideDashboard;
	private String insideSteeringWheel;
	private String insideInnerMirror;
	private String insideSunvisor;
	private String insideGlovebox;
	private String insideRoof;
	private String insideMainlandGlue;
	private String insideDriveSeat;
	private String insideAssistantSeat;
	private String insideRearSeats;
	private String insideSeatAdjustmentHandle;
	private String insideLeftFrontTrimPanel;
	private String insideRightFrontTrimPanel;
	private String insideLeftTailTrimPanel;
	private String insideRightTailTrimPanel;
	private String insideGearLeverCap;
	private String insideGearLeverHandle;
	private String insideCentreArmrest;
	private String insideCigarLighter;
	private String insideAColumnTrim;
	private String insideBColumnTrim;
	private String insideCColumnTrim;
	private String insideLeftFrontArmrests;
	private String insideRightFrontArmrests;
	private String insideLeftTailArmrests;
	private String insideRightTailArmrests;
	private String configureDrivingMode;
	private String configureAirNumbers;
	private String configureWheelMaterial;
	private String configureRemoteKey;
	private String configureInstrumentLights;
	private String configureWindshieldWiper;
	private String configureSound;
	private String configureSpeaker;
	private String configurePowerSteering;
	private String configureAbs;
	private String configureEsp;
	private String configurePowerWindow;
	private String configureSkylight;
	private String configureMainDrivingPowerSeats;
	private String configureChairDrivingPowerSeats;
	private String configureAutomaticAirConditioning;
	private String configureExteriorMirrorsElectricallyFolding;
	private String configureCruiseControl;
	private String configureMultifunctionSteeringWheel;
	private String configureSpareTire;
	private String configureLeatherSeat;
	private String configureCd;
	private String configureDvd;
	private String configureGps;
	private String configureParkingSensors;
	private String configureRearViewCamera;
	private String configureSeatHeating;
	private String machineClutch;
	private String machineEngine;
	private String machineGasketLeak;
	private String machineExhaustColorBlue;
	private String machineExhaustColorBlack;
	private String machineGearboxSound;
	private String machineThroughFile;
	private String machineCltuchSlipping;
	private String roadtestDrivingSound;
	private String roadtestBrakeSystem;
	private String roadtestTurnSystem;
	private String roadtestSuspensionSystem;

	// Constructors

	/** default constructor */
	public CarDetection() {
	}

	/** full constructor */
	public CarDetection(Long carBaseId, String outsideFrameInfo,
			String outsideHeadBumper, String outsideTailBumper,
			String outsideLeftMirror, String outsideRightMirror,
			String outsideLeftHeadlight, String outsideRightHeadlight,
			String outsideLeftTaillight, String outsideRightTaillight,
			String outsideWheelCover, String outsideAntenna,
			String outsideHeadScreen, String outsideTailScreen,
			String outsideGrille, String outsideHeadGlass,
			String outsideTailGlass, String outsideHeadLeftGlass,
			String outsideHeadRightGlass, String outsideTailRightGlass,
			String outsideTailLeftGlass, String insideDashboard,
			String insideSteeringWheel, String insideInnerMirror,
			String insideSunvisor, String insideGlovebox, String insideRoof,
			String insideMainlandGlue, String insideDriveSeat,
			String insideAssistantSeat, String insideRearSeats,
			String insideSeatAdjustmentHandle, String insideLeftFrontTrimPanel,
			String insideRightFrontTrimPanel, String insideLeftTailTrimPanel,
			String insideRightTailTrimPanel, String insideGearLeverCap,
			String insideGearLeverHandle, String insideCentreArmrest,
			String insideCigarLighter, String insideAColumnTrim,
			String insideBColumnTrim, String insideCColumnTrim,
			String insideLeftFrontArmrests, String insideRightFrontArmrests,
			String insideLeftTailArmrests, String insideRightTailArmrests,
			String configureDrivingMode, String configureAirNumbers,
			String configureWheelMaterial, String configureRemoteKey,
			String configureInstrumentLights, String configureWindshieldWiper,
			String configureSound, String configureSpeaker,
			String configurePowerSteering, String configureAbs,
			String configureEsp, String configurePowerWindow,
			String configureSkylight, String configureMainDrivingPowerSeats,
			String configureChairDrivingPowerSeats,
			String configureAutomaticAirConditioning,
			String configureExteriorMirrorsElectricallyFolding,
			String configureCruiseControl,
			String configureMultifunctionSteeringWheel,
			String configureSpareTire, String configureLeatherSeat,
			String configureCd, String configureDvd, String configureGps,
			String configureParkingSensors, String configureRearViewCamera,
			String configureSeatHeating, String machineClutch,
			String machineEngine, String machineGasketLeak,
			String machineExhaustColorBlue, String machineExhaustColorBlack,
			String machineGearboxSound, String machineThroughFile,
			String machineCltuchSlipping, String roadtestDrivingSound,
			String roadtestBrakeSystem, String roadtestTurnSystem,
			String roadtestSuspensionSystem) {
		this.carBaseId = carBaseId;
		this.outsideFrameInfo = outsideFrameInfo;
		this.outsideHeadBumper = outsideHeadBumper;
		this.outsideTailBumper = outsideTailBumper;
		this.outsideLeftMirror = outsideLeftMirror;
		this.outsideRightMirror = outsideRightMirror;
		this.outsideLeftHeadlight = outsideLeftHeadlight;
		this.outsideRightHeadlight = outsideRightHeadlight;
		this.outsideLeftTaillight = outsideLeftTaillight;
		this.outsideRightTaillight = outsideRightTaillight;
		this.outsideWheelCover = outsideWheelCover;
		this.outsideAntenna = outsideAntenna;
		this.outsideHeadScreen = outsideHeadScreen;
		this.outsideTailScreen = outsideTailScreen;
		this.outsideGrille = outsideGrille;
		this.outsideHeadGlass = outsideHeadGlass;
		this.outsideTailGlass = outsideTailGlass;
		this.outsideHeadLeftGlass = outsideHeadLeftGlass;
		this.outsideHeadRightGlass = outsideHeadRightGlass;
		this.outsideTailRightGlass = outsideTailRightGlass;
		this.outsideTailLeftGlass = outsideTailLeftGlass;
		this.insideDashboard = insideDashboard;
		this.insideSteeringWheel = insideSteeringWheel;
		this.insideInnerMirror = insideInnerMirror;
		this.insideSunvisor = insideSunvisor;
		this.insideGlovebox = insideGlovebox;
		this.insideRoof = insideRoof;
		this.insideMainlandGlue = insideMainlandGlue;
		this.insideDriveSeat = insideDriveSeat;
		this.insideAssistantSeat = insideAssistantSeat;
		this.insideRearSeats = insideRearSeats;
		this.insideSeatAdjustmentHandle = insideSeatAdjustmentHandle;
		this.insideLeftFrontTrimPanel = insideLeftFrontTrimPanel;
		this.insideRightFrontTrimPanel = insideRightFrontTrimPanel;
		this.insideLeftTailTrimPanel = insideLeftTailTrimPanel;
		this.insideRightTailTrimPanel = insideRightTailTrimPanel;
		this.insideGearLeverCap = insideGearLeverCap;
		this.insideGearLeverHandle = insideGearLeverHandle;
		this.insideCentreArmrest = insideCentreArmrest;
		this.insideCigarLighter = insideCigarLighter;
		this.insideAColumnTrim = insideAColumnTrim;
		this.insideBColumnTrim = insideBColumnTrim;
		this.insideCColumnTrim = insideCColumnTrim;
		this.insideLeftFrontArmrests = insideLeftFrontArmrests;
		this.insideRightFrontArmrests = insideRightFrontArmrests;
		this.insideLeftTailArmrests = insideLeftTailArmrests;
		this.insideRightTailArmrests = insideRightTailArmrests;
		this.configureDrivingMode = configureDrivingMode;
		this.configureAirNumbers = configureAirNumbers;
		this.configureWheelMaterial = configureWheelMaterial;
		this.configureRemoteKey = configureRemoteKey;
		this.configureInstrumentLights = configureInstrumentLights;
		this.configureWindshieldWiper = configureWindshieldWiper;
		this.configureSound = configureSound;
		this.configureSpeaker = configureSpeaker;
		this.configurePowerSteering = configurePowerSteering;
		this.configureAbs = configureAbs;
		this.configureEsp = configureEsp;
		this.configurePowerWindow = configurePowerWindow;
		this.configureSkylight = configureSkylight;
		this.configureMainDrivingPowerSeats = configureMainDrivingPowerSeats;
		this.configureChairDrivingPowerSeats = configureChairDrivingPowerSeats;
		this.configureAutomaticAirConditioning = configureAutomaticAirConditioning;
		this.configureExteriorMirrorsElectricallyFolding = configureExteriorMirrorsElectricallyFolding;
		this.configureCruiseControl = configureCruiseControl;
		this.configureMultifunctionSteeringWheel = configureMultifunctionSteeringWheel;
		this.configureSpareTire = configureSpareTire;
		this.configureLeatherSeat = configureLeatherSeat;
		this.configureCd = configureCd;
		this.configureDvd = configureDvd;
		this.configureGps = configureGps;
		this.configureParkingSensors = configureParkingSensors;
		this.configureRearViewCamera = configureRearViewCamera;
		this.configureSeatHeating = configureSeatHeating;
		this.machineClutch = machineClutch;
		this.machineEngine = machineEngine;
		this.machineGasketLeak = machineGasketLeak;
		this.machineExhaustColorBlue = machineExhaustColorBlue;
		this.machineExhaustColorBlack = machineExhaustColorBlack;
		this.machineGearboxSound = machineGearboxSound;
		this.machineThroughFile = machineThroughFile;
		this.machineCltuchSlipping = machineCltuchSlipping;
		this.roadtestDrivingSound = roadtestDrivingSound;
		this.roadtestBrakeSystem = roadtestBrakeSystem;
		this.roadtestTurnSystem = roadtestTurnSystem;
		this.roadtestSuspensionSystem = roadtestSuspensionSystem;
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

	@Column(name = "car_base_id")
	public Long getCarBaseId() {
		return this.carBaseId;
	}

	public void setCarBaseId(Long carBaseId) {
		this.carBaseId = carBaseId;
	}

	@Column(name = "outside_frame_info", length = 45)
	public String getOutsideFrameInfo() {
		return this.outsideFrameInfo;
	}

	public void setOutsideFrameInfo(String outsideFrameInfo) {
		this.outsideFrameInfo = outsideFrameInfo;
	}

	@Column(name = "outside_head_bumper", length = 45)
	public String getOutsideHeadBumper() {
		return this.outsideHeadBumper;
	}

	public void setOutsideHeadBumper(String outsideHeadBumper) {
		this.outsideHeadBumper = outsideHeadBumper;
	}

	@Column(name = "outside_tail_bumper", length = 45)
	public String getOutsideTailBumper() {
		return this.outsideTailBumper;
	}

	public void setOutsideTailBumper(String outsideTailBumper) {
		this.outsideTailBumper = outsideTailBumper;
	}

	@Column(name = "outside_left_mirror", length = 45)
	public String getOutsideLeftMirror() {
		return this.outsideLeftMirror;
	}

	public void setOutsideLeftMirror(String outsideLeftMirror) {
		this.outsideLeftMirror = outsideLeftMirror;
	}

	@Column(name = "outside_right_mirror", length = 45)
	public String getOutsideRightMirror() {
		return this.outsideRightMirror;
	}

	public void setOutsideRightMirror(String outsideRightMirror) {
		this.outsideRightMirror = outsideRightMirror;
	}

	@Column(name = "outside_left_headlight", length = 45)
	public String getOutsideLeftHeadlight() {
		return this.outsideLeftHeadlight;
	}

	public void setOutsideLeftHeadlight(String outsideLeftHeadlight) {
		this.outsideLeftHeadlight = outsideLeftHeadlight;
	}

	@Column(name = "outside_right_headlight", length = 45)
	public String getOutsideRightHeadlight() {
		return this.outsideRightHeadlight;
	}

	public void setOutsideRightHeadlight(String outsideRightHeadlight) {
		this.outsideRightHeadlight = outsideRightHeadlight;
	}

	@Column(name = "outside_left_taillight", length = 45)
	public String getOutsideLeftTaillight() {
		return this.outsideLeftTaillight;
	}

	public void setOutsideLeftTaillight(String outsideLeftTaillight) {
		this.outsideLeftTaillight = outsideLeftTaillight;
	}

	@Column(name = "outside_right_taillight", length = 45)
	public String getOutsideRightTaillight() {
		return this.outsideRightTaillight;
	}

	public void setOutsideRightTaillight(String outsideRightTaillight) {
		this.outsideRightTaillight = outsideRightTaillight;
	}

	@Column(name = "outside_wheel_cover", length = 45)
	public String getOutsideWheelCover() {
		return this.outsideWheelCover;
	}

	public void setOutsideWheelCover(String outsideWheelCover) {
		this.outsideWheelCover = outsideWheelCover;
	}

	@Column(name = "outside_antenna", length = 45)
	public String getOutsideAntenna() {
		return this.outsideAntenna;
	}

	public void setOutsideAntenna(String outsideAntenna) {
		this.outsideAntenna = outsideAntenna;
	}

	@Column(name = "outside_head_screen", length = 45)
	public String getOutsideHeadScreen() {
		return this.outsideHeadScreen;
	}

	public void setOutsideHeadScreen(String outsideHeadScreen) {
		this.outsideHeadScreen = outsideHeadScreen;
	}

	@Column(name = "outside_tail_screen", length = 45)
	public String getOutsideTailScreen() {
		return this.outsideTailScreen;
	}

	public void setOutsideTailScreen(String outsideTailScreen) {
		this.outsideTailScreen = outsideTailScreen;
	}

	@Column(name = "outside_grille", length = 45)
	public String getOutsideGrille() {
		return this.outsideGrille;
	}

	public void setOutsideGrille(String outsideGrille) {
		this.outsideGrille = outsideGrille;
	}

	@Column(name = "outside_head_glass", length = 45)
	public String getOutsideHeadGlass() {
		return this.outsideHeadGlass;
	}

	public void setOutsideHeadGlass(String outsideHeadGlass) {
		this.outsideHeadGlass = outsideHeadGlass;
	}

	@Column(name = "outside_tail_glass", length = 45)
	public String getOutsideTailGlass() {
		return this.outsideTailGlass;
	}

	public void setOutsideTailGlass(String outsideTailGlass) {
		this.outsideTailGlass = outsideTailGlass;
	}

	@Column(name = "outside_head_left_glass", length = 45)
	public String getOutsideHeadLeftGlass() {
		return this.outsideHeadLeftGlass;
	}

	public void setOutsideHeadLeftGlass(String outsideHeadLeftGlass) {
		this.outsideHeadLeftGlass = outsideHeadLeftGlass;
	}

	@Column(name = "outside_head_right_glass", length = 45)
	public String getOutsideHeadRightGlass() {
		return this.outsideHeadRightGlass;
	}

	public void setOutsideHeadRightGlass(String outsideHeadRightGlass) {
		this.outsideHeadRightGlass = outsideHeadRightGlass;
	}

	@Column(name = "outside_tail_right_glass", length = 45)
	public String getOutsideTailRightGlass() {
		return this.outsideTailRightGlass;
	}

	public void setOutsideTailRightGlass(String outsideTailRightGlass) {
		this.outsideTailRightGlass = outsideTailRightGlass;
	}

	@Column(name = "outside_tail_left_glass", length = 45)
	public String getOutsideTailLeftGlass() {
		return this.outsideTailLeftGlass;
	}

	public void setOutsideTailLeftGlass(String outsideTailLeftGlass) {
		this.outsideTailLeftGlass = outsideTailLeftGlass;
	}

	@Column(name = "inside_dashboard", length = 45)
	public String getInsideDashboard() {
		return this.insideDashboard;
	}

	public void setInsideDashboard(String insideDashboard) {
		this.insideDashboard = insideDashboard;
	}

	@Column(name = "inside_steering_wheel", length = 45)
	public String getInsideSteeringWheel() {
		return this.insideSteeringWheel;
	}

	public void setInsideSteeringWheel(String insideSteeringWheel) {
		this.insideSteeringWheel = insideSteeringWheel;
	}

	@Column(name = "inside_inner_mirror", length = 45)
	public String getInsideInnerMirror() {
		return this.insideInnerMirror;
	}

	public void setInsideInnerMirror(String insideInnerMirror) {
		this.insideInnerMirror = insideInnerMirror;
	}

	@Column(name = "inside_sunvisor", length = 45)
	public String getInsideSunvisor() {
		return this.insideSunvisor;
	}

	public void setInsideSunvisor(String insideSunvisor) {
		this.insideSunvisor = insideSunvisor;
	}

	@Column(name = "inside_glovebox", length = 45)
	public String getInsideGlovebox() {
		return this.insideGlovebox;
	}

	public void setInsideGlovebox(String insideGlovebox) {
		this.insideGlovebox = insideGlovebox;
	}

	@Column(name = "inside_roof", length = 45)
	public String getInsideRoof() {
		return this.insideRoof;
	}

	public void setInsideRoof(String insideRoof) {
		this.insideRoof = insideRoof;
	}

	@Column(name = "inside_mainland_glue", length = 45)
	public String getInsideMainlandGlue() {
		return this.insideMainlandGlue;
	}

	public void setInsideMainlandGlue(String insideMainlandGlue) {
		this.insideMainlandGlue = insideMainlandGlue;
	}

	@Column(name = "inside_drive_seat", length = 45)
	public String getInsideDriveSeat() {
		return this.insideDriveSeat;
	}

	public void setInsideDriveSeat(String insideDriveSeat) {
		this.insideDriveSeat = insideDriveSeat;
	}

	@Column(name = "inside_assistant_seat", length = 45)
	public String getInsideAssistantSeat() {
		return this.insideAssistantSeat;
	}

	public void setInsideAssistantSeat(String insideAssistantSeat) {
		this.insideAssistantSeat = insideAssistantSeat;
	}

	@Column(name = "inside_rear_seats", length = 45)
	public String getInsideRearSeats() {
		return this.insideRearSeats;
	}

	public void setInsideRearSeats(String insideRearSeats) {
		this.insideRearSeats = insideRearSeats;
	}

	@Column(name = "inside_seat_adjustment_handle", length = 45)
	public String getInsideSeatAdjustmentHandle() {
		return this.insideSeatAdjustmentHandle;
	}

	public void setInsideSeatAdjustmentHandle(String insideSeatAdjustmentHandle) {
		this.insideSeatAdjustmentHandle = insideSeatAdjustmentHandle;
	}

	@Column(name = "inside_left_front_trim_panel", length = 45)
	public String getInsideLeftFrontTrimPanel() {
		return this.insideLeftFrontTrimPanel;
	}

	public void setInsideLeftFrontTrimPanel(String insideLeftFrontTrimPanel) {
		this.insideLeftFrontTrimPanel = insideLeftFrontTrimPanel;
	}

	@Column(name = "inside_right_front_trim_panel", length = 45)
	public String getInsideRightFrontTrimPanel() {
		return this.insideRightFrontTrimPanel;
	}

	public void setInsideRightFrontTrimPanel(String insideRightFrontTrimPanel) {
		this.insideRightFrontTrimPanel = insideRightFrontTrimPanel;
	}

	@Column(name = "inside_left_tail_trim_panel", length = 45)
	public String getInsideLeftTailTrimPanel() {
		return this.insideLeftTailTrimPanel;
	}

	public void setInsideLeftTailTrimPanel(String insideLeftTailTrimPanel) {
		this.insideLeftTailTrimPanel = insideLeftTailTrimPanel;
	}

	@Column(name = "inside_right_tail_trim_panel", length = 45)
	public String getInsideRightTailTrimPanel() {
		return this.insideRightTailTrimPanel;
	}

	public void setInsideRightTailTrimPanel(String insideRightTailTrimPanel) {
		this.insideRightTailTrimPanel = insideRightTailTrimPanel;
	}

	@Column(name = "inside_gear_lever_cap", length = 45)
	public String getInsideGearLeverCap() {
		return this.insideGearLeverCap;
	}

	public void setInsideGearLeverCap(String insideGearLeverCap) {
		this.insideGearLeverCap = insideGearLeverCap;
	}

	@Column(name = "inside_gear_lever_handle", length = 45)
	public String getInsideGearLeverHandle() {
		return this.insideGearLeverHandle;
	}

	public void setInsideGearLeverHandle(String insideGearLeverHandle) {
		this.insideGearLeverHandle = insideGearLeverHandle;
	}

	@Column(name = "inside_centre_armrest", length = 45)
	public String getInsideCentreArmrest() {
		return this.insideCentreArmrest;
	}

	public void setInsideCentreArmrest(String insideCentreArmrest) {
		this.insideCentreArmrest = insideCentreArmrest;
	}

	@Column(name = "inside_cigar_lighter", length = 45)
	public String getInsideCigarLighter() {
		return this.insideCigarLighter;
	}

	public void setInsideCigarLighter(String insideCigarLighter) {
		this.insideCigarLighter = insideCigarLighter;
	}

	@Column(name = "inside_a_column_trim", length = 45)
	public String getInsideAColumnTrim() {
		return this.insideAColumnTrim;
	}

	public void setInsideAColumnTrim(String insideAColumnTrim) {
		this.insideAColumnTrim = insideAColumnTrim;
	}

	@Column(name = "inside_b_column_trim", length = 45)
	public String getInsideBColumnTrim() {
		return this.insideBColumnTrim;
	}

	public void setInsideBColumnTrim(String insideBColumnTrim) {
		this.insideBColumnTrim = insideBColumnTrim;
	}

	@Column(name = "inside_c_column_trim", length = 45)
	public String getInsideCColumnTrim() {
		return this.insideCColumnTrim;
	}

	public void setInsideCColumnTrim(String insideCColumnTrim) {
		this.insideCColumnTrim = insideCColumnTrim;
	}

	@Column(name = "inside_left_front_armrests", length = 45)
	public String getInsideLeftFrontArmrests() {
		return this.insideLeftFrontArmrests;
	}

	public void setInsideLeftFrontArmrests(String insideLeftFrontArmrests) {
		this.insideLeftFrontArmrests = insideLeftFrontArmrests;
	}

	@Column(name = "inside_right_front_armrests", length = 45)
	public String getInsideRightFrontArmrests() {
		return this.insideRightFrontArmrests;
	}

	public void setInsideRightFrontArmrests(String insideRightFrontArmrests) {
		this.insideRightFrontArmrests = insideRightFrontArmrests;
	}

	@Column(name = "inside_left_tail_armrests", length = 45)
	public String getInsideLeftTailArmrests() {
		return this.insideLeftTailArmrests;
	}

	public void setInsideLeftTailArmrests(String insideLeftTailArmrests) {
		this.insideLeftTailArmrests = insideLeftTailArmrests;
	}

	@Column(name = "inside_right_tail_armrests", length = 45)
	public String getInsideRightTailArmrests() {
		return this.insideRightTailArmrests;
	}

	public void setInsideRightTailArmrests(String insideRightTailArmrests) {
		this.insideRightTailArmrests = insideRightTailArmrests;
	}

	@Column(name = "configure_driving_mode", length = 45)
	public String getConfigureDrivingMode() {
		return this.configureDrivingMode;
	}

	public void setConfigureDrivingMode(String configureDrivingMode) {
		this.configureDrivingMode = configureDrivingMode;
	}

	@Column(name = "configure_air_numbers", length = 45)
	public String getConfigureAirNumbers() {
		return this.configureAirNumbers;
	}

	public void setConfigureAirNumbers(String configureAirNumbers) {
		this.configureAirNumbers = configureAirNumbers;
	}

	@Column(name = "configure_wheel_material", length = 45)
	public String getConfigureWheelMaterial() {
		return this.configureWheelMaterial;
	}

	public void setConfigureWheelMaterial(String configureWheelMaterial) {
		this.configureWheelMaterial = configureWheelMaterial;
	}

	@Column(name = "configure_remote_key", length = 45)
	public String getConfigureRemoteKey() {
		return this.configureRemoteKey;
	}

	public void setConfigureRemoteKey(String configureRemoteKey) {
		this.configureRemoteKey = configureRemoteKey;
	}

	@Column(name = "configure_instrument_lights", length = 45)
	public String getConfigureInstrumentLights() {
		return this.configureInstrumentLights;
	}

	public void setConfigureInstrumentLights(String configureInstrumentLights) {
		this.configureInstrumentLights = configureInstrumentLights;
	}

	@Column(name = "configure_windshield_wiper", length = 45)
	public String getConfigureWindshieldWiper() {
		return this.configureWindshieldWiper;
	}

	public void setConfigureWindshieldWiper(String configureWindshieldWiper) {
		this.configureWindshieldWiper = configureWindshieldWiper;
	}

	@Column(name = "configure_sound", length = 45)
	public String getConfigureSound() {
		return this.configureSound;
	}

	public void setConfigureSound(String configureSound) {
		this.configureSound = configureSound;
	}

	@Column(name = "configure_speaker", length = 45)
	public String getConfigureSpeaker() {
		return this.configureSpeaker;
	}

	public void setConfigureSpeaker(String configureSpeaker) {
		this.configureSpeaker = configureSpeaker;
	}

	@Column(name = "configure_power_steering", length = 45)
	public String getConfigurePowerSteering() {
		return this.configurePowerSteering;
	}

	public void setConfigurePowerSteering(String configurePowerSteering) {
		this.configurePowerSteering = configurePowerSteering;
	}

	@Column(name = "configure_ABS", length = 45)
	public String getConfigureAbs() {
		return this.configureAbs;
	}

	public void setConfigureAbs(String configureAbs) {
		this.configureAbs = configureAbs;
	}

	@Column(name = "configure_ESP", length = 45)
	public String getConfigureEsp() {
		return this.configureEsp;
	}

	public void setConfigureEsp(String configureEsp) {
		this.configureEsp = configureEsp;
	}

	@Column(name = "configure_power_window", length = 45)
	public String getConfigurePowerWindow() {
		return this.configurePowerWindow;
	}

	public void setConfigurePowerWindow(String configurePowerWindow) {
		this.configurePowerWindow = configurePowerWindow;
	}

	@Column(name = "configure_skylight", length = 45)
	public String getConfigureSkylight() {
		return this.configureSkylight;
	}

	public void setConfigureSkylight(String configureSkylight) {
		this.configureSkylight = configureSkylight;
	}

	@Column(name = "configure_main_driving_power_seats", length = 45)
	public String getConfigureMainDrivingPowerSeats() {
		return this.configureMainDrivingPowerSeats;
	}

	public void setConfigureMainDrivingPowerSeats(
			String configureMainDrivingPowerSeats) {
		this.configureMainDrivingPowerSeats = configureMainDrivingPowerSeats;
	}

	@Column(name = "configure_chair_driving_power_seats", length = 45)
	public String getConfigureChairDrivingPowerSeats() {
		return this.configureChairDrivingPowerSeats;
	}

	public void setConfigureChairDrivingPowerSeats(
			String configureChairDrivingPowerSeats) {
		this.configureChairDrivingPowerSeats = configureChairDrivingPowerSeats;
	}

	@Column(name = "configure_automatic_air_conditioning", length = 45)
	public String getConfigureAutomaticAirConditioning() {
		return this.configureAutomaticAirConditioning;
	}

	public void setConfigureAutomaticAirConditioning(
			String configureAutomaticAirConditioning) {
		this.configureAutomaticAirConditioning = configureAutomaticAirConditioning;
	}

	@Column(name = "configure_exterior_mirrors_electrically_folding", length = 45)
	public String getConfigureExteriorMirrorsElectricallyFolding() {
		return this.configureExteriorMirrorsElectricallyFolding;
	}

	public void setConfigureExteriorMirrorsElectricallyFolding(
			String configureExteriorMirrorsElectricallyFolding) {
		this.configureExteriorMirrorsElectricallyFolding = configureExteriorMirrorsElectricallyFolding;
	}

	@Column(name = "configure_cruise_control", length = 45)
	public String getConfigureCruiseControl() {
		return this.configureCruiseControl;
	}

	public void setConfigureCruiseControl(String configureCruiseControl) {
		this.configureCruiseControl = configureCruiseControl;
	}

	@Column(name = "configure_multifunction_steering_wheel", length = 45)
	public String getConfigureMultifunctionSteeringWheel() {
		return this.configureMultifunctionSteeringWheel;
	}

	public void setConfigureMultifunctionSteeringWheel(
			String configureMultifunctionSteeringWheel) {
		this.configureMultifunctionSteeringWheel = configureMultifunctionSteeringWheel;
	}

	@Column(name = "configure_spare_tire", length = 45)
	public String getConfigureSpareTire() {
		return this.configureSpareTire;
	}

	public void setConfigureSpareTire(String configureSpareTire) {
		this.configureSpareTire = configureSpareTire;
	}

	@Column(name = "configure_leather_seat", length = 45)
	public String getConfigureLeatherSeat() {
		return this.configureLeatherSeat;
	}

	public void setConfigureLeatherSeat(String configureLeatherSeat) {
		this.configureLeatherSeat = configureLeatherSeat;
	}

	@Column(name = "configure_CD", length = 45)
	public String getConfigureCd() {
		return this.configureCd;
	}

	public void setConfigureCd(String configureCd) {
		this.configureCd = configureCd;
	}

	@Column(name = "configure_DVD", length = 45)
	public String getConfigureDvd() {
		return this.configureDvd;
	}

	public void setConfigureDvd(String configureDvd) {
		this.configureDvd = configureDvd;
	}

	@Column(name = "configure_GPS", length = 45)
	public String getConfigureGps() {
		return this.configureGps;
	}

	public void setConfigureGps(String configureGps) {
		this.configureGps = configureGps;
	}

	@Column(name = "configure_parking_sensors", length = 45)
	public String getConfigureParkingSensors() {
		return this.configureParkingSensors;
	}

	public void setConfigureParkingSensors(String configureParkingSensors) {
		this.configureParkingSensors = configureParkingSensors;
	}

	@Column(name = "configure_rear_view_camera", length = 45)
	public String getConfigureRearViewCamera() {
		return this.configureRearViewCamera;
	}

	public void setConfigureRearViewCamera(String configureRearViewCamera) {
		this.configureRearViewCamera = configureRearViewCamera;
	}

	@Column(name = "configure_seat_heating", length = 45)
	public String getConfigureSeatHeating() {
		return this.configureSeatHeating;
	}

	public void setConfigureSeatHeating(String configureSeatHeating) {
		this.configureSeatHeating = configureSeatHeating;
	}

	@Column(name = "machine_clutch", length = 45)
	public String getMachineClutch() {
		return this.machineClutch;
	}

	public void setMachineClutch(String machineClutch) {
		this.machineClutch = machineClutch;
	}

	@Column(name = "machine_engine", length = 45)
	public String getMachineEngine() {
		return this.machineEngine;
	}

	public void setMachineEngine(String machineEngine) {
		this.machineEngine = machineEngine;
	}

	@Column(name = "machine_gasket_leak", length = 45)
	public String getMachineGasketLeak() {
		return this.machineGasketLeak;
	}

	public void setMachineGasketLeak(String machineGasketLeak) {
		this.machineGasketLeak = machineGasketLeak;
	}

	@Column(name = "machine_exhaust_color_blue", length = 45)
	public String getMachineExhaustColorBlue() {
		return this.machineExhaustColorBlue;
	}

	public void setMachineExhaustColorBlue(String machineExhaustColorBlue) {
		this.machineExhaustColorBlue = machineExhaustColorBlue;
	}

	@Column(name = "machine_exhaust_color_black", length = 45)
	public String getMachineExhaustColorBlack() {
		return this.machineExhaustColorBlack;
	}

	public void setMachineExhaustColorBlack(String machineExhaustColorBlack) {
		this.machineExhaustColorBlack = machineExhaustColorBlack;
	}

	@Column(name = "machine_gearbox_sound", length = 45)
	public String getMachineGearboxSound() {
		return this.machineGearboxSound;
	}

	public void setMachineGearboxSound(String machineGearboxSound) {
		this.machineGearboxSound = machineGearboxSound;
	}

	@Column(name = "machine_through_file", length = 45)
	public String getMachineThroughFile() {
		return this.machineThroughFile;
	}

	public void setMachineThroughFile(String machineThroughFile) {
		this.machineThroughFile = machineThroughFile;
	}

	@Column(name = "machine_cltuch_slipping", length = 45)
	public String getMachineCltuchSlipping() {
		return this.machineCltuchSlipping;
	}

	public void setMachineCltuchSlipping(String machineCltuchSlipping) {
		this.machineCltuchSlipping = machineCltuchSlipping;
	}

	@Column(name = "roadtest_driving_sound", length = 45)
	public String getRoadtestDrivingSound() {
		return this.roadtestDrivingSound;
	}

	public void setRoadtestDrivingSound(String roadtestDrivingSound) {
		this.roadtestDrivingSound = roadtestDrivingSound;
	}

	@Column(name = "roadtest_brake_system", length = 45)
	public String getRoadtestBrakeSystem() {
		return this.roadtestBrakeSystem;
	}

	public void setRoadtestBrakeSystem(String roadtestBrakeSystem) {
		this.roadtestBrakeSystem = roadtestBrakeSystem;
	}

	@Column(name = "roadtest_turn_system", length = 45)
	public String getRoadtestTurnSystem() {
		return this.roadtestTurnSystem;
	}

	public void setRoadtestTurnSystem(String roadtestTurnSystem) {
		this.roadtestTurnSystem = roadtestTurnSystem;
	}

	@Column(name = "roadtest_suspension_system", length = 45)
	public String getRoadtestSuspensionSystem() {
		return this.roadtestSuspensionSystem;
	}

	public void setRoadtestSuspensionSystem(String roadtestSuspensionSystem) {
		this.roadtestSuspensionSystem = roadtestSuspensionSystem;
	}

}