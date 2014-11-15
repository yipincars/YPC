package com.yipincars.admin.servlet;

import com.yipincars.admin.model.CarDetection;
import net.sf.json.JSONObject;
import sun.rmi.runtime.Log;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddCarDetectionServlet extends AbstractServlet {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

        CarDetection carDetection = validateParamsAndBuild(request);
        carDetectionService.addCarDetection(carDetection);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", true);

        output(response, jsonObject.toString());

		// TODO Auto-generated method stub


	}

	@Override
	public CarDetection validateParamsAndBuild(HttpServletRequest request) {








        String outsideFrameInfo = request.getParameter("outsideFrameInfo");
        String outsideHeadBumper = request.getParameter("outsideHeadBumper");
        String outsideTailBumper = request.getParameter("outsideTailBumper");
        String outsideLeftMirror = request.getParameter("outsideLeftMirror");
        String outsideRightMirror = request.getParameter("outsideRightMirror");
        String outsideLeftHeadlight = request.getParameter("outsideLeftHeadlight");
        String outsideRightHeadlight = request.getParameter("outsideRightHeadlight");
        String outsideLeftTaillight = request.getParameter("outsideLeftTaillight");
        String outsideRightTaillight = request.getParameter("outsideRightTaillight");
        String outsideWheelCover = request.getParameter("outsideWheelCover");
        String outsideAntenna = request.getParameter("outsideAntenna");
        String outsideHeadScreen = request.getParameter("outsideHeadScreen");
        String outsideTailScreen = request.getParameter("outsideTailScreen");
        String outsideGrille = request.getParameter("outsideGrille");
        String outsideHeadGlass = request.getParameter("outsideHeadGlass");
        String outsideTailGlass = request.getParameter("outsideTailGlass");
        String outsideHeadLeftGlass = request.getParameter("outsideHeadLeftGlass");
        String outsideHeadRightGlass = request.getParameter("outsideHeadRightGlass");
        String outsideTailRightGlass = request.getParameter("outsideTailRightGlass");
        String outsideTailLeftGlass = request.getParameter("outsideTailLeftGlass");
        String insideDashboard = request.getParameter("insideDashboard");
        String insideSteeringWheel = request.getParameter("insideSteeringWheel");
        String insideInnerMirror = request.getParameter("insideInnerMirror");
        String insideSunvisor = request.getParameter("insideSunvisor");
        String insideGlovebox = request.getParameter("insideGlovebox");
        String insideRoof = request.getParameter("insideRoof");
        String insideMainlandGlue = request.getParameter("insideMainlandGlue");
        String insideDriveSeat = request.getParameter("insideDriveSeat");
        String insideAssistantSeat = request.getParameter("insideAssistantSeat");
        String insideRearSeats = request.getParameter("insideRearSeats");
        String insideSeatAdjustmentHandle = request.getParameter("insideSeatAdjustmentHandle");
        String insideLeftFrontTrimPanel = request.getParameter("insideLeftFrontTrimPanel");
        String insideRightFrontTrimPanel = request.getParameter("insideRightFrontTrimPanel");
        String insideLeftTailTrimPanel = request.getParameter("insideLeftTailTrimPanel");
        String insideRightTailTrimPanel = request.getParameter("insideRightTailTrimPanel");
        String insideGearLeverCap = request.getParameter("insideGearLeverCap");
        String insideGearLeverHandle = request.getParameter("insideGearLeverHandle");
        String insideCentreArmrest = request.getParameter("insideCentreArmrest");
        String insideCigarLighter = request.getParameter("insideCigarLighter");
        String insideAColumnTrim = request.getParameter("insideAColumnTrim");
        String insideBColumnTrim = request.getParameter("insideBColumnTrim");
        String insideCColumnTrim = request.getParameter("insideCColumnTrim");
        String insideLeftFrontArmrests = request.getParameter("insideLeftFrontArmrests");
        String insideRightFrontArmrests = request.getParameter("insideRightFrontArmrests");
        String insideLeftTailArmrests = request.getParameter("insideLeftTailArmrests");
        String insideRightTailArmrests = request.getParameter("insideRightTailArmrests");
        String configureDrivingMode = request.getParameter("configureDrivingMode");
        String configureAirNumbers = request.getParameter("configureAirNumbers");
        String configureWheelMaterial = request.getParameter("configureWheelMaterial");
        String configureRemoteKey = request.getParameter("configureRemoteKey");
        String configureInstrumentLights = request.getParameter("configureInstrumentLights");
        String windshieldWiper = request.getParameter("windshieldWiper");
        String configureSound = request.getParameter("configureSound");
        String configureSpeaker = request.getParameter("configureSpeaker");
        String configurePowerSteering = request.getParameter("configurePowerSteering");
        String configureAbs = request.getParameter("configureAbs");
        String configureEsp = request.getParameter("configureEsp");
        String configurePowerWindow = request.getParameter("configurePowerWindow");
        String configureSkylight = request.getParameter("configureSkylight");
        String configureMainDrivingPowerSeats = request.getParameter("configureMainDrivingPowerSeats");
        String configureChairDrivingPowerSeats = request.getParameter("configureChairDrivingPowerSeats");
        String configureAutomaticAirConditioning = request.getParameter("configureAutomaticAirConditioning");
        String configureExteriorMirrorsElectricallyFolding = request.getParameter("configureExteriorMirrorsElectricallyFolding");
        String configureCruiseControl = request.getParameter("configureCruiseControl");
        String configureMultifunctionSteeringWheel = request.getParameter("configureMultifunctionSteeringWheel");
        String configureSpareTire = request.getParameter("configureSpareTire");
        String configureLeatherSeat = request.getParameter("configureLeatherSeat");
        String configureCd = request.getParameter("configureCd");
        String configureDvd = request.getParameter("configureDvd");
        String configureGps = request.getParameter("configureGps");
        String configureParkingSensors = request.getParameter("configureParkingSensors");
        String configureRearViewCamera = request.getParameter("configureRearViewCamera");
        String configureSeatHeating = request.getParameter("configureSeatHeating");
        String machineClutch = request.getParameter("machineClutch");
        String machineEngine = request.getParameter("machineEngine");
        String machineGasketLeak = request.getParameter("machineGasketLeak");
        String machineExhaustColorBlue = request.getParameter("machineExhaustColorBlue");
        String machineExhaustColorBlack = request.getParameter("machineExhaustColorBlack");
        String machineGearboxSound = request.getParameter("machineGearboxSound");
        String machineThroughFile = request.getParameter("machineThroughFile");
        String machineCltuchSlipping = request.getParameter("machineCltuchSlipping");
        String roadtestDrivingSound = request.getParameter("roadtestDrivingSound");
        String roadtestBrakeSystem = request.getParameter("roadtestBrakeSystem");
        String roadtestSuspensionSystem = request.getParameter("roadtestSuspensionSystem");


        LOG.info("outsideFrameInfo=" + outsideFrameInfo + "," +
                "outsideHeadBumper=" + outsideHeadBumper + "," +
                "outsideTailBumper=" + outsideTailBumper + "," +
                "outsideLeftMirror=" + outsideLeftMirror + "," +
                "outsideRightMirror=" + outsideRightMirror + "," +
                "outsideLeftHeadlight=" + outsideLeftHeadlight + "," +
                "outsideRightHeadlight=" + outsideRightHeadlight + "," +
                "outsideLeftTaillight=" + outsideLeftTaillight + "," +
                "outsideRightTaillight=" + outsideRightTaillight + "," +
                "outsideWheelCover=" + outsideWheelCover + "," +
                "outsideAntenna=" + outsideAntenna + "," +
                "outsideHeadScreen=" + outsideHeadScreen + "," +
                "outsideTailScreen=" + outsideTailScreen + "," +
                "outsideGrille=" + outsideGrille + "," +
                "outsideHeadGlass=" + outsideHeadGlass + "," +
                "outsideTailGlass=" + outsideTailGlass + "," +
                "outsideHeadLeftGlass=" + outsideHeadLeftGlass + "," +
                "outsideHeadRightGlass=" + outsideHeadRightGlass + "," +
                "outsideTailRightGlass=" + outsideTailRightGlass + "," +
                "outsideTailLeftGlass=" + outsideTailLeftGlass + "," +
                "insideDashboard=" + insideDashboard + "," +
                "insideSteeringWheel=" + insideSteeringWheel + "," +
                "insideInnerMirror=" + insideInnerMirror + "," +
                "insideSunvisor=" + insideSunvisor + "," +
                "insideGlovebox=" + insideGlovebox + "," +
                "insideRoof=" + insideRoof + "," +
                "insideMainlandGlue=" + insideMainlandGlue + "," +
                "insideDriveSeat=" + insideDriveSeat + "," +
                "insideAssistantSeat=" + insideAssistantSeat + "," +
                "insideRearSeats=" + insideRearSeats + "," +
                "insideSeatAdjustmentHandle=" + insideSeatAdjustmentHandle + "," +
                "insideLeftFrontTrimPanel=" + insideLeftFrontTrimPanel + "," +
                "insideRightFrontTrimPanel=" + insideRightFrontTrimPanel + "," +
                "insideLeftTailTrimPanel=" + insideLeftTailTrimPanel + "," +
                "insideRightTailTrimPanel=" + insideRightTailTrimPanel + "," +
                "insideGearLeverCap=" + insideGearLeverCap + "," +
                "insideGearLeverHandle=" + insideGearLeverHandle + "," +
                "insideCentreArmrest=" + insideCentreArmrest + "," +
                "insideCigarLighter=" + insideCigarLighter + "," +
                "insideAColumnTrim=" + insideAColumnTrim + "," +
                "insideBColumnTrim=" + insideBColumnTrim + "," +
                "insideCColumnTrim=" + insideCColumnTrim + "," +
                "insideLeftFrontArmrests=" + insideLeftFrontArmrests + "," +
                "insideRightFrontArmrests=" + insideRightFrontArmrests + "," +
                "insideLeftTailArmrests=" + insideLeftTailArmrests + "," +
                "insideRightTailArmrests=" + insideRightTailArmrests + "," +
                "configureDrivingMode=" + configureDrivingMode + "," +
                "configureAirNumbers=" + configureAirNumbers + "," +
                "configureWheelMaterial=" + configureWheelMaterial + "," +
                "configureRemoteKey=" + configureRemoteKey + "," +
                "configureInstrumentLights=" + configureInstrumentLights + "," +
                "windshieldWiper=" + windshieldWiper + "," +
                "configureSound=" + configureSound + "," +
                "configureSpeaker=" + configureSpeaker + "," +
                "configurePowerSteering=" + configurePowerSteering + "," +
                "configureAbs=" + configureAbs + "," +
                "configureEsp=" + configureEsp + "," +
                "configurePowerWindow=" + configurePowerWindow + "," +
                "configureSkylight=" + configureSkylight + "," +
                "configureMainDrivingPowerSeats=" + configureMainDrivingPowerSeats + "," +
                "configureChairDrivingPowerSeats=" + configureChairDrivingPowerSeats + "," +
                "configureAutomaticAirConditioning=" + configureAutomaticAirConditioning + "," +
                "configureExteriorMirrorsElectricallyFolding=" + configureExteriorMirrorsElectricallyFolding + "," +
                "configureCruiseControl=" + configureCruiseControl + "," +
                "configureMultifunctionSteeringWheel=" + configureMultifunctionSteeringWheel + "," +
                "configureSpareTire=" + configureSpareTire + "," +
                "configureLeatherSeat=" + configureLeatherSeat + "," +
                "configureCd=" + configureCd + "," +
                "configureDvd=" + configureDvd + "," +
                "configureGps=" + configureGps + "," +
                "configureParkingSensors=" + configureParkingSensors + "," +
                "configureRearViewCamera=" + configureRearViewCamera + "," +
                "configureSeatHeating=" + configureSeatHeating + "," +
                "machineClutch=" + machineClutch + "," +
                "machineEngine=" + machineEngine + "," +
                "machineGasketLeak=" + machineGasketLeak + "," +
                "machineExhaustColorBlue=" + machineExhaustColorBlue + "," +
                "machineExhaustColorBlack=" + machineExhaustColorBlack + "," +
                "machineGearboxSound=" + machineGearboxSound + "," +
                "machineThroughFile=" + machineThroughFile + "," +
                "machineCltuchSlipping=" + machineCltuchSlipping + "," +
                "roadtestDrivingSound=" + roadtestDrivingSound + "," +
                "roadtestBrakeSystem=" + roadtestBrakeSystem + "," +
                "roadtestSuspensionSystem=" + roadtestSuspensionSystem);

        //return result
//        return new CarDetection(outsideFrameInfo,outsideHeadBumper,outsideTailBumper,outsideLeftMirror,outsideRightMirror,
//                outsideLeftHeadlight,outsideRightHeadlight,outsideLeftTaillight,outsideRightTaillight,outsideWheelCover,
//                outsideAntenna,outsideHeadScreen,outsideTailScreen,outsideGrille,outsideHeadGlass,
//                outsideTailGlass,outsideHeadLeftGlass,outsideHeadRightGlass,outsideTailRightGlass,outsideTailLeftGlass,
//                insideDashboard,insideSteeringWheel,insideInnerMirror,insideSunvisor,insideGlovebox,
//                insideRoof,insideMainlandGlue,insideDriveSeat,insideAssistantSeat,insideRearSeats,
//                insideSeatAdjustmentHandle,insideLeftFrontTrimPanel,insideRightFrontTrimPanel,insideLeftTailTrimPanel,insideRightTailTrimPanel,
//                insideGearLeverCap,insideGearLeverHandle,insideCentreArmrest,insideCigarLighter,insideAColumnTrim,
//                insideBColumnTrim,insideCColumnTrim,insideLeftFrontArmrests,insideRightFrontArmrests,insideLeftTailArmrests,
//                insideRightTailArmrests,configureDrivingMode,configureAirNumbers,configureWheelMaterial,configureRemoteKey,
//                configureInstrumentLights,windshieldWiper,configureSound,configureSpeaker,configurePowerSteering,
//                configureAbs,configureEsp,configurePowerWindow,configureSkylight,configureMainDrivingPowerSeats,
//                configureChairDrivingPowerSeats,configureAutomaticAirConditioning,configureExteriorMirrorsElectricallyFolding,configureCruiseControl,
//                configureMultifunctionSteeringWheel,configureSpareTire,configureLeatherSeat,configureCd,
//                configureDvd,configureGps,configureParkingSensors,configureRearViewCamera,configureSeatHeating,
//                machineClutch,machineEngine,machineGasketLeak,machineExhaustColorBlue,machineExhaustColorBlack,
//                machineGearboxSound,machineThroughFile,machineCltuchSlipping,roadtestDrivingSound,roadtestBrakeSystem,
//                roadtestSuspensionSystem);
        return new CarDetection();
	}

}
