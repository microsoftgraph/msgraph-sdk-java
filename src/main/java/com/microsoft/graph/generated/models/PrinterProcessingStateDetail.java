package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PrinterProcessingStateDetail implements ValuedEnum {
    Paused("paused"),
    MediaJam("mediaJam"),
    MediaNeeded("mediaNeeded"),
    MediaLow("mediaLow"),
    MediaEmpty("mediaEmpty"),
    CoverOpen("coverOpen"),
    InterlockOpen("interlockOpen"),
    OutputTrayMissing("outputTrayMissing"),
    OutputAreaFull("outputAreaFull"),
    MarkerSupplyLow("markerSupplyLow"),
    MarkerSupplyEmpty("markerSupplyEmpty"),
    InputTrayMissing("inputTrayMissing"),
    OutputAreaAlmostFull("outputAreaAlmostFull"),
    MarkerWasteAlmostFull("markerWasteAlmostFull"),
    MarkerWasteFull("markerWasteFull"),
    FuserOverTemp("fuserOverTemp"),
    FuserUnderTemp("fuserUnderTemp"),
    Other("other"),
    None("none"),
    MovingToPaused("movingToPaused"),
    Shutdown("shutdown"),
    ConnectingToDevice("connectingToDevice"),
    TimedOut("timedOut"),
    Stopping("stopping"),
    StoppedPartially("stoppedPartially"),
    TonerLow("tonerLow"),
    TonerEmpty("tonerEmpty"),
    SpoolAreaFull("spoolAreaFull"),
    DoorOpen("doorOpen"),
    OpticalPhotoConductorNearEndOfLife("opticalPhotoConductorNearEndOfLife"),
    OpticalPhotoConductorLifeOver("opticalPhotoConductorLifeOver"),
    DeveloperLow("developerLow"),
    DeveloperEmpty("developerEmpty"),
    InterpreterResourceUnavailable("interpreterResourceUnavailable"),
    UnknownFutureValue("unknownFutureValue"),
    AlertRemovalOfBinaryChangeEntry("alertRemovalOfBinaryChangeEntry"),
    BanderAdded("banderAdded"),
    BanderAlmostEmpty("banderAlmostEmpty"),
    BanderAlmostFull("banderAlmostFull"),
    BanderAtLimit("banderAtLimit"),
    BanderClosed("banderClosed"),
    BanderConfigurationChange("banderConfigurationChange"),
    BanderCoverClosed("banderCoverClosed"),
    BanderCoverOpen("banderCoverOpen"),
    BanderEmpty("banderEmpty"),
    BanderFull("banderFull"),
    BanderInterlockClosed("banderInterlockClosed"),
    BanderInterlockOpen("banderInterlockOpen"),
    BanderJam("banderJam"),
    BanderLifeAlmostOver("banderLifeAlmostOver"),
    BanderLifeOver("banderLifeOver"),
    BanderMemoryExhausted("banderMemoryExhausted"),
    BanderMissing("banderMissing"),
    BanderMotorFailure("banderMotorFailure"),
    BanderNearLimit("banderNearLimit"),
    BanderOffline("banderOffline"),
    BanderOpened("banderOpened"),
    BanderOverTemperature("banderOverTemperature"),
    BanderPowerSaver("banderPowerSaver"),
    BanderRecoverableFailure("banderRecoverableFailure"),
    BanderRecoverableStorage("banderRecoverableStorage"),
    BanderRemoved("banderRemoved"),
    BanderResourceAdded("banderResourceAdded"),
    BanderResourceRemoved("banderResourceRemoved"),
    BanderThermistorFailure("banderThermistorFailure"),
    BanderTimingFailure("banderTimingFailure"),
    BanderTurnedOff("banderTurnedOff"),
    BanderTurnedOn("banderTurnedOn"),
    BanderUnderTemperature("banderUnderTemperature"),
    BanderUnrecoverableFailure("banderUnrecoverableFailure"),
    BanderUnrecoverableStorageError("banderUnrecoverableStorageError"),
    BanderWarmingUp("banderWarmingUp"),
    BinderAdded("binderAdded"),
    BinderAlmostEmpty("binderAlmostEmpty"),
    BinderAlmostFull("binderAlmostFull"),
    BinderAtLimit("binderAtLimit"),
    BinderClosed("binderClosed"),
    BinderConfigurationChange("binderConfigurationChange"),
    BinderCoverClosed("binderCoverClosed"),
    BinderCoverOpen("binderCoverOpen"),
    BinderEmpty("binderEmpty"),
    BinderFull("binderFull"),
    BinderInterlockClosed("binderInterlockClosed"),
    BinderInterlockOpen("binderInterlockOpen"),
    BinderJam("binderJam"),
    BinderLifeAlmostOver("binderLifeAlmostOver"),
    BinderLifeOver("binderLifeOver"),
    BinderMemoryExhausted("binderMemoryExhausted"),
    BinderMissing("binderMissing"),
    BinderMotorFailure("binderMotorFailure"),
    BinderNearLimit("binderNearLimit"),
    BinderOffline("binderOffline"),
    BinderOpened("binderOpened"),
    BinderOverTemperature("binderOverTemperature"),
    BinderPowerSaver("binderPowerSaver"),
    BinderRecoverableFailure("binderRecoverableFailure"),
    BinderRecoverableStorage("binderRecoverableStorage"),
    BinderRemoved("binderRemoved"),
    BinderResourceAdded("binderResourceAdded"),
    BinderResourceRemoved("binderResourceRemoved"),
    BinderThermistorFailure("binderThermistorFailure"),
    BinderTimingFailure("binderTimingFailure"),
    BinderTurnedOff("binderTurnedOff"),
    BinderTurnedOn("binderTurnedOn"),
    BinderUnderTemperature("binderUnderTemperature"),
    BinderUnrecoverableFailure("binderUnrecoverableFailure"),
    BinderUnrecoverableStorageError("binderUnrecoverableStorageError"),
    BinderWarmingUp("binderWarmingUp"),
    CameraFailure("cameraFailure"),
    ChamberCooling("chamberCooling"),
    ChamberFailure("chamberFailure"),
    ChamberHeating("chamberHeating"),
    ChamberTemperatureHigh("chamberTemperatureHigh"),
    ChamberTemperatureLow("chamberTemperatureLow"),
    CleanerLifeAlmostOver("cleanerLifeAlmostOver"),
    CleanerLifeOver("cleanerLifeOver"),
    ConfigurationChange("configurationChange"),
    Deactivated("deactivated"),
    Deleted("deleted"),
    DieCutterAdded("dieCutterAdded"),
    DieCutterAlmostEmpty("dieCutterAlmostEmpty"),
    DieCutterAlmostFull("dieCutterAlmostFull"),
    DieCutterAtLimit("dieCutterAtLimit"),
    DieCutterClosed("dieCutterClosed"),
    DieCutterConfigurationChange("dieCutterConfigurationChange"),
    DieCutterCoverClosed("dieCutterCoverClosed"),
    DieCutterCoverOpen("dieCutterCoverOpen"),
    DieCutterEmpty("dieCutterEmpty"),
    DieCutterFull("dieCutterFull"),
    DieCutterInterlockClosed("dieCutterInterlockClosed"),
    DieCutterInterlockOpen("dieCutterInterlockOpen"),
    DieCutterJam("dieCutterJam"),
    DieCutterLifeAlmostOver("dieCutterLifeAlmostOver"),
    DieCutterLifeOver("dieCutterLifeOver"),
    DieCutterMemoryExhausted("dieCutterMemoryExhausted"),
    DieCutterMissing("dieCutterMissing"),
    DieCutterMotorFailure("dieCutterMotorFailure"),
    DieCutterNearLimit("dieCutterNearLimit"),
    DieCutterOffline("dieCutterOffline"),
    DieCutterOpened("dieCutterOpened"),
    DieCutterOverTemperature("dieCutterOverTemperature"),
    DieCutterPowerSaver("dieCutterPowerSaver"),
    DieCutterRecoverableFailure("dieCutterRecoverableFailure"),
    DieCutterRecoverableStorage("dieCutterRecoverableStorage"),
    DieCutterRemoved("dieCutterRemoved"),
    DieCutterResourceAdded("dieCutterResourceAdded"),
    DieCutterResourceRemoved("dieCutterResourceRemoved"),
    DieCutterThermistorFailure("dieCutterThermistorFailure"),
    DieCutterTimingFailure("dieCutterTimingFailure"),
    DieCutterTurnedOff("dieCutterTurnedOff"),
    DieCutterTurnedOn("dieCutterTurnedOn"),
    DieCutterUnderTemperature("dieCutterUnderTemperature"),
    DieCutterUnrecoverableFailure("dieCutterUnrecoverableFailure"),
    DieCutterUnrecoverableStorageError("dieCutterUnrecoverableStorageError"),
    DieCutterWarmingUp("dieCutterWarmingUp"),
    ExtruderCooling("extruderCooling"),
    ExtruderFailure("extruderFailure"),
    ExtruderHeating("extruderHeating"),
    ExtruderJam("extruderJam"),
    ExtruderTemperatureHigh("extruderTemperatureHigh"),
    ExtruderTemperatureLow("extruderTemperatureLow"),
    FanFailure("fanFailure"),
    FaxModemLifeAlmostOver("faxModemLifeAlmostOver"),
    FaxModemLifeOver("faxModemLifeOver"),
    FaxModemMissing("faxModemMissing"),
    FaxModemTurnedOff("faxModemTurnedOff"),
    FaxModemTurnedOn("faxModemTurnedOn"),
    FolderAdded("folderAdded"),
    FolderAlmostEmpty("folderAlmostEmpty"),
    FolderAlmostFull("folderAlmostFull"),
    FolderAtLimit("folderAtLimit"),
    FolderClosed("folderClosed"),
    FolderConfigurationChange("folderConfigurationChange"),
    FolderCoverClosed("folderCoverClosed"),
    FolderCoverOpen("folderCoverOpen"),
    FolderEmpty("folderEmpty"),
    FolderFull("folderFull"),
    FolderInterlockClosed("folderInterlockClosed"),
    FolderInterlockOpen("folderInterlockOpen"),
    FolderJam("folderJam"),
    FolderLifeAlmostOver("folderLifeAlmostOver"),
    FolderLifeOver("folderLifeOver"),
    FolderMemoryExhausted("folderMemoryExhausted"),
    FolderMissing("folderMissing"),
    FolderMotorFailure("folderMotorFailure"),
    FolderNearLimit("folderNearLimit"),
    FolderOffline("folderOffline"),
    FolderOpened("folderOpened"),
    FolderOverTemperature("folderOverTemperature"),
    FolderPowerSaver("folderPowerSaver"),
    FolderRecoverableFailure("folderRecoverableFailure"),
    FolderRecoverableStorage("folderRecoverableStorage"),
    FolderRemoved("folderRemoved"),
    FolderResourceAdded("folderResourceAdded"),
    FolderResourceRemoved("folderResourceRemoved"),
    FolderThermistorFailure("folderThermistorFailure"),
    FolderTimingFailure("folderTimingFailure"),
    FolderTurnedOff("folderTurnedOff"),
    FolderTurnedOn("folderTurnedOn"),
    FolderUnderTemperature("folderUnderTemperature"),
    FolderUnrecoverableFailure("folderUnrecoverableFailure"),
    FolderUnrecoverableStorageError("folderUnrecoverableStorageError"),
    FolderWarmingUp("folderWarmingUp"),
    Hibernate("hibernate"),
    HoldNewJobs("holdNewJobs"),
    IdentifyPrinterRequested("identifyPrinterRequested"),
    ImprinterAdded("imprinterAdded"),
    ImprinterAlmostEmpty("imprinterAlmostEmpty"),
    ImprinterAlmostFull("imprinterAlmostFull"),
    ImprinterAtLimit("imprinterAtLimit"),
    ImprinterClosed("imprinterClosed"),
    ImprinterConfigurationChange("imprinterConfigurationChange"),
    ImprinterCoverClosed("imprinterCoverClosed"),
    ImprinterCoverOpen("imprinterCoverOpen"),
    ImprinterEmpty("imprinterEmpty"),
    ImprinterFull("imprinterFull"),
    ImprinterInterlockClosed("imprinterInterlockClosed"),
    ImprinterInterlockOpen("imprinterInterlockOpen"),
    ImprinterJam("imprinterJam"),
    ImprinterLifeAlmostOver("imprinterLifeAlmostOver"),
    ImprinterLifeOver("imprinterLifeOver"),
    ImprinterMemoryExhausted("imprinterMemoryExhausted"),
    ImprinterMissing("imprinterMissing"),
    ImprinterMotorFailure("imprinterMotorFailure"),
    ImprinterNearLimit("imprinterNearLimit"),
    ImprinterOffline("imprinterOffline"),
    ImprinterOpened("imprinterOpened"),
    ImprinterOverTemperature("imprinterOverTemperature"),
    ImprinterPowerSaver("imprinterPowerSaver"),
    ImprinterRecoverableFailure("imprinterRecoverableFailure"),
    ImprinterRecoverableStorage("imprinterRecoverableStorage"),
    ImprinterRemoved("imprinterRemoved"),
    ImprinterResourceAdded("imprinterResourceAdded"),
    ImprinterResourceRemoved("imprinterResourceRemoved"),
    ImprinterThermistorFailure("imprinterThermistorFailure"),
    ImprinterTimingFailure("imprinterTimingFailure"),
    ImprinterTurnedOff("imprinterTurnedOff"),
    ImprinterTurnedOn("imprinterTurnedOn"),
    ImprinterUnderTemperature("imprinterUnderTemperature"),
    ImprinterUnrecoverableFailure("imprinterUnrecoverableFailure"),
    ImprinterUnrecoverableStorageError("imprinterUnrecoverableStorageError"),
    ImprinterWarmingUp("imprinterWarmingUp"),
    InputCannotFeedSizeSelected("inputCannotFeedSizeSelected"),
    InputManualInputRequest("inputManualInputRequest"),
    InputMediaColorChange("inputMediaColorChange"),
    InputMediaFormPartsChange("inputMediaFormPartsChange"),
    InputMediaSizeChange("inputMediaSizeChange"),
    InputMediaTrayFailure("inputMediaTrayFailure"),
    InputMediaTrayFeedError("inputMediaTrayFeedError"),
    InputMediaTrayJam("inputMediaTrayJam"),
    InputMediaTypeChange("inputMediaTypeChange"),
    InputMediaWeightChange("inputMediaWeightChange"),
    InputPickRollerFailure("inputPickRollerFailure"),
    InputPickRollerLifeOver("inputPickRollerLifeOver"),
    InputPickRollerLifeWarn("inputPickRollerLifeWarn"),
    InputPickRollerMissing("inputPickRollerMissing"),
    InputTrayElevationFailure("inputTrayElevationFailure"),
    InputTrayPositionFailure("inputTrayPositionFailure"),
    InserterAdded("inserterAdded"),
    InserterAlmostEmpty("inserterAlmostEmpty"),
    InserterAlmostFull("inserterAlmostFull"),
    InserterAtLimit("inserterAtLimit"),
    InserterClosed("inserterClosed"),
    InserterConfigurationChange("inserterConfigurationChange"),
    InserterCoverClosed("inserterCoverClosed"),
    InserterCoverOpen("inserterCoverOpen"),
    InserterEmpty("inserterEmpty"),
    InserterFull("inserterFull"),
    InserterInterlockClosed("inserterInterlockClosed"),
    InserterInterlockOpen("inserterInterlockOpen"),
    InserterJam("inserterJam"),
    InserterLifeAlmostOver("inserterLifeAlmostOver"),
    InserterLifeOver("inserterLifeOver"),
    InserterMemoryExhausted("inserterMemoryExhausted"),
    InserterMissing("inserterMissing"),
    InserterMotorFailure("inserterMotorFailure"),
    InserterNearLimit("inserterNearLimit"),
    InserterOffline("inserterOffline"),
    InserterOpened("inserterOpened"),
    InserterOverTemperature("inserterOverTemperature"),
    InserterPowerSaver("inserterPowerSaver"),
    InserterRecoverableFailure("inserterRecoverableFailure"),
    InserterRecoverableStorage("inserterRecoverableStorage"),
    InserterRemoved("inserterRemoved"),
    InserterResourceAdded("inserterResourceAdded"),
    InserterResourceRemoved("inserterResourceRemoved"),
    InserterThermistorFailure("inserterThermistorFailure"),
    InserterTimingFailure("inserterTimingFailure"),
    InserterTurnedOff("inserterTurnedOff"),
    InserterTurnedOn("inserterTurnedOn"),
    InserterUnderTemperature("inserterUnderTemperature"),
    InserterUnrecoverableFailure("inserterUnrecoverableFailure"),
    InserterUnrecoverableStorageError("inserterUnrecoverableStorageError"),
    InserterWarmingUp("inserterWarmingUp"),
    InterlockClosed("interlockClosed"),
    InterpreterCartridgeAdded("interpreterCartridgeAdded"),
    InterpreterCartridgeDeleted("interpreterCartridgeDeleted"),
    InterpreterComplexPageEncountered("interpreterComplexPageEncountered"),
    InterpreterMemoryDecrease("interpreterMemoryDecrease"),
    InterpreterMemoryIncrease("interpreterMemoryIncrease"),
    InterpreterResourceAdded("interpreterResourceAdded"),
    InterpreterResourceDeleted("interpreterResourceDeleted"),
    LampAtEol("lampAtEol"),
    LampFailure("lampFailure"),
    LampNearEol("lampNearEol"),
    LaserAtEol("laserAtEol"),
    LaserFailure("laserFailure"),
    LaserNearEol("laserNearEol"),
    MakeEnvelopeAdded("makeEnvelopeAdded"),
    MakeEnvelopeAlmostEmpty("makeEnvelopeAlmostEmpty"),
    MakeEnvelopeAlmostFull("makeEnvelopeAlmostFull"),
    MakeEnvelopeAtLimit("makeEnvelopeAtLimit"),
    MakeEnvelopeClosed("makeEnvelopeClosed"),
    MakeEnvelopeConfigurationChange("makeEnvelopeConfigurationChange"),
    MakeEnvelopeCoverClosed("makeEnvelopeCoverClosed"),
    MakeEnvelopeCoverOpen("makeEnvelopeCoverOpen"),
    MakeEnvelopeEmpty("makeEnvelopeEmpty"),
    MakeEnvelopeFull("makeEnvelopeFull"),
    MakeEnvelopeInterlockClosed("makeEnvelopeInterlockClosed"),
    MakeEnvelopeInterlockOpen("makeEnvelopeInterlockOpen"),
    MakeEnvelopeJam("makeEnvelopeJam"),
    MakeEnvelopeLifeAlmostOver("makeEnvelopeLifeAlmostOver"),
    MakeEnvelopeLifeOver("makeEnvelopeLifeOver"),
    MakeEnvelopeMemoryExhausted("makeEnvelopeMemoryExhausted"),
    MakeEnvelopeMissing("makeEnvelopeMissing"),
    MakeEnvelopeMotorFailure("makeEnvelopeMotorFailure"),
    MakeEnvelopeNearLimit("makeEnvelopeNearLimit"),
    MakeEnvelopeOffline("makeEnvelopeOffline"),
    MakeEnvelopeOpened("makeEnvelopeOpened"),
    MakeEnvelopeOverTemperature("makeEnvelopeOverTemperature"),
    MakeEnvelopePowerSaver("makeEnvelopePowerSaver"),
    MakeEnvelopeRecoverableFailure("makeEnvelopeRecoverableFailure"),
    MakeEnvelopeRecoverableStorage("makeEnvelopeRecoverableStorage"),
    MakeEnvelopeRemoved("makeEnvelopeRemoved"),
    MakeEnvelopeResourceAdded("makeEnvelopeResourceAdded"),
    MakeEnvelopeResourceRemoved("makeEnvelopeResourceRemoved"),
    MakeEnvelopeThermistorFailure("makeEnvelopeThermistorFailure"),
    MakeEnvelopeTimingFailure("makeEnvelopeTimingFailure"),
    MakeEnvelopeTurnedOff("makeEnvelopeTurnedOff"),
    MakeEnvelopeTurnedOn("makeEnvelopeTurnedOn"),
    MakeEnvelopeUnderTemperature("makeEnvelopeUnderTemperature"),
    MakeEnvelopeUnrecoverableFailure("makeEnvelopeUnrecoverableFailure"),
    MakeEnvelopeUnrecoverableStorageError("makeEnvelopeUnrecoverableStorageError"),
    MakeEnvelopeWarmingUp("makeEnvelopeWarmingUp"),
    MarkerAdjustingPrintQuality("markerAdjustingPrintQuality"),
    MarkerCleanerMissing("markerCleanerMissing"),
    MarkerDeveloperAlmostEmpty("markerDeveloperAlmostEmpty"),
    MarkerDeveloperEmpty("markerDeveloperEmpty"),
    MarkerDeveloperMissing("markerDeveloperMissing"),
    MarkerFuserMissing("markerFuserMissing"),
    MarkerFuserThermistorFailure("markerFuserThermistorFailure"),
    MarkerFuserTimingFailure("markerFuserTimingFailure"),
    MarkerInkAlmostEmpty("markerInkAlmostEmpty"),
    MarkerInkEmpty("markerInkEmpty"),
    MarkerInkMissing("markerInkMissing"),
    MarkerOpcMissing("markerOpcMissing"),
    MarkerPrintRibbonAlmostEmpty("markerPrintRibbonAlmostEmpty"),
    MarkerPrintRibbonEmpty("markerPrintRibbonEmpty"),
    MarkerPrintRibbonMissing("markerPrintRibbonMissing"),
    MarkerSupplyAlmostEmpty("markerSupplyAlmostEmpty"),
    MarkerSupplyMissing("markerSupplyMissing"),
    MarkerTonerCartridgeMissing("markerTonerCartridgeMissing"),
    MarkerTonerMissing("markerTonerMissing"),
    MarkerWasteInkReceptacleAlmostFull("markerWasteInkReceptacleAlmostFull"),
    MarkerWasteInkReceptacleFull("markerWasteInkReceptacleFull"),
    MarkerWasteInkReceptacleMissing("markerWasteInkReceptacleMissing"),
    MarkerWasteMissing("markerWasteMissing"),
    MarkerWasteTonerReceptacleAlmostFull("markerWasteTonerReceptacleAlmostFull"),
    MarkerWasteTonerReceptacleFull("markerWasteTonerReceptacleFull"),
    MarkerWasteTonerReceptacleMissing("markerWasteTonerReceptacleMissing"),
    MaterialEmpty("materialEmpty"),
    MaterialLow("materialLow"),
    MaterialNeeded("materialNeeded"),
    MediaDrying("mediaDrying"),
    MediaPathCannotDuplexMediaSelected("mediaPathCannotDuplexMediaSelected"),
    MediaPathFailure("mediaPathFailure"),
    MediaPathInputEmpty("mediaPathInputEmpty"),
    MediaPathInputFeedError("mediaPathInputFeedError"),
    MediaPathInputJam("mediaPathInputJam"),
    MediaPathInputRequest("mediaPathInputRequest"),
    MediaPathJam("mediaPathJam"),
    MediaPathMediaTrayAlmostFull("mediaPathMediaTrayAlmostFull"),
    MediaPathMediaTrayFull("mediaPathMediaTrayFull"),
    MediaPathMediaTrayMissing("mediaPathMediaTrayMissing"),
    MediaPathOutputFeedError("mediaPathOutputFeedError"),
    MediaPathOutputFull("mediaPathOutputFull"),
    MediaPathOutputJam("mediaPathOutputJam"),
    MediaPathPickRollerFailure("mediaPathPickRollerFailure"),
    MediaPathPickRollerLifeOver("mediaPathPickRollerLifeOver"),
    MediaPathPickRollerLifeWarn("mediaPathPickRollerLifeWarn"),
    MediaPathPickRollerMissing("mediaPathPickRollerMissing"),
    MotorFailure("motorFailure"),
    OutputMailboxSelectFailure("outputMailboxSelectFailure"),
    OutputMediaTrayFailure("outputMediaTrayFailure"),
    OutputMediaTrayFeedError("outputMediaTrayFeedError"),
    OutputMediaTrayJam("outputMediaTrayJam"),
    PerforaterAdded("perforaterAdded"),
    PerforaterAlmostEmpty("perforaterAlmostEmpty"),
    PerforaterAlmostFull("perforaterAlmostFull"),
    PerforaterAtLimit("perforaterAtLimit"),
    PerforaterClosed("perforaterClosed"),
    PerforaterConfigurationChange("perforaterConfigurationChange"),
    PerforaterCoverClosed("perforaterCoverClosed"),
    PerforaterCoverOpen("perforaterCoverOpen"),
    PerforaterEmpty("perforaterEmpty"),
    PerforaterFull("perforaterFull"),
    PerforaterInterlockClosed("perforaterInterlockClosed"),
    PerforaterInterlockOpen("perforaterInterlockOpen"),
    PerforaterJam("perforaterJam"),
    PerforaterLifeAlmostOver("perforaterLifeAlmostOver"),
    PerforaterLifeOver("perforaterLifeOver"),
    PerforaterMemoryExhausted("perforaterMemoryExhausted"),
    PerforaterMissing("perforaterMissing"),
    PerforaterMotorFailure("perforaterMotorFailure"),
    PerforaterNearLimit("perforaterNearLimit"),
    PerforaterOffline("perforaterOffline"),
    PerforaterOpened("perforaterOpened"),
    PerforaterOverTemperature("perforaterOverTemperature"),
    PerforaterPowerSaver("perforaterPowerSaver"),
    PerforaterRecoverableFailure("perforaterRecoverableFailure"),
    PerforaterRecoverableStorage("perforaterRecoverableStorage"),
    PerforaterRemoved("perforaterRemoved"),
    PerforaterResourceAdded("perforaterResourceAdded"),
    PerforaterResourceRemoved("perforaterResourceRemoved"),
    PerforaterThermistorFailure("perforaterThermistorFailure"),
    PerforaterTimingFailure("perforaterTimingFailure"),
    PerforaterTurnedOff("perforaterTurnedOff"),
    PerforaterTurnedOn("perforaterTurnedOn"),
    PerforaterUnderTemperature("perforaterUnderTemperature"),
    PerforaterUnrecoverableFailure("perforaterUnrecoverableFailure"),
    PerforaterUnrecoverableStorageError("perforaterUnrecoverableStorageError"),
    PerforaterWarmingUp("perforaterWarmingUp"),
    PlatformCooling("platformCooling"),
    PlatformFailure("platformFailure"),
    PlatformHeating("platformHeating"),
    PlatformTemperatureHigh("platformTemperatureHigh"),
    PlatformTemperatureLow("platformTemperatureLow"),
    PowerDown("powerDown"),
    PowerUp("powerUp"),
    PrinterManualReset("printerManualReset"),
    PrinterNmsReset("printerNmsReset"),
    PrinterReadyToPrint("printerReadyToPrint"),
    PuncherAdded("puncherAdded"),
    PuncherAlmostEmpty("puncherAlmostEmpty"),
    PuncherAlmostFull("puncherAlmostFull"),
    PuncherAtLimit("puncherAtLimit"),
    PuncherClosed("puncherClosed"),
    PuncherConfigurationChange("puncherConfigurationChange"),
    PuncherCoverClosed("puncherCoverClosed"),
    PuncherCoverOpen("puncherCoverOpen"),
    PuncherEmpty("puncherEmpty"),
    PuncherFull("puncherFull"),
    PuncherInterlockClosed("puncherInterlockClosed"),
    PuncherInterlockOpen("puncherInterlockOpen"),
    PuncherJam("puncherJam"),
    PuncherLifeAlmostOver("puncherLifeAlmostOver"),
    PuncherLifeOver("puncherLifeOver"),
    PuncherMemoryExhausted("puncherMemoryExhausted"),
    PuncherMissing("puncherMissing"),
    PuncherMotorFailure("puncherMotorFailure"),
    PuncherNearLimit("puncherNearLimit"),
    PuncherOffline("puncherOffline"),
    PuncherOpened("puncherOpened"),
    PuncherOverTemperature("puncherOverTemperature"),
    PuncherPowerSaver("puncherPowerSaver"),
    PuncherRecoverableFailure("puncherRecoverableFailure"),
    PuncherRecoverableStorage("puncherRecoverableStorage"),
    PuncherRemoved("puncherRemoved"),
    PuncherResourceAdded("puncherResourceAdded"),
    PuncherResourceRemoved("puncherResourceRemoved"),
    PuncherThermistorFailure("puncherThermistorFailure"),
    PuncherTimingFailure("puncherTimingFailure"),
    PuncherTurnedOff("puncherTurnedOff"),
    PuncherTurnedOn("puncherTurnedOn"),
    PuncherUnderTemperature("puncherUnderTemperature"),
    PuncherUnrecoverableFailure("puncherUnrecoverableFailure"),
    PuncherUnrecoverableStorageError("puncherUnrecoverableStorageError"),
    PuncherWarmingUp("puncherWarmingUp"),
    Resuming("resuming"),
    ScanMediaPathFailure("scanMediaPathFailure"),
    ScanMediaPathInputEmpty("scanMediaPathInputEmpty"),
    ScanMediaPathInputFeedError("scanMediaPathInputFeedError"),
    ScanMediaPathInputJam("scanMediaPathInputJam"),
    ScanMediaPathInputRequest("scanMediaPathInputRequest"),
    ScanMediaPathJam("scanMediaPathJam"),
    ScanMediaPathOutputFeedError("scanMediaPathOutputFeedError"),
    ScanMediaPathOutputFull("scanMediaPathOutputFull"),
    ScanMediaPathOutputJam("scanMediaPathOutputJam"),
    ScanMediaPathPickRollerFailure("scanMediaPathPickRollerFailure"),
    ScanMediaPathPickRollerLifeOver("scanMediaPathPickRollerLifeOver"),
    ScanMediaPathPickRollerLifeWarn("scanMediaPathPickRollerLifeWarn"),
    ScanMediaPathPickRollerMissing("scanMediaPathPickRollerMissing"),
    ScanMediaPathTrayAlmostFull("scanMediaPathTrayAlmostFull"),
    ScanMediaPathTrayFull("scanMediaPathTrayFull"),
    ScanMediaPathTrayMissing("scanMediaPathTrayMissing"),
    ScannerLightFailure("scannerLightFailure"),
    ScannerLightLifeAlmostOver("scannerLightLifeAlmostOver"),
    ScannerLightLifeOver("scannerLightLifeOver"),
    ScannerLightMissing("scannerLightMissing"),
    ScannerSensorFailure("scannerSensorFailure"),
    ScannerSensorLifeAlmostOver("scannerSensorLifeAlmostOver"),
    ScannerSensorLifeOver("scannerSensorLifeOver"),
    ScannerSensorMissing("scannerSensorMissing"),
    SeparationCutterAdded("separationCutterAdded"),
    SeparationCutterAlmostEmpty("separationCutterAlmostEmpty"),
    SeparationCutterAlmostFull("separationCutterAlmostFull"),
    SeparationCutterAtLimit("separationCutterAtLimit"),
    SeparationCutterClosed("separationCutterClosed"),
    SeparationCutterConfigurationChange("separationCutterConfigurationChange"),
    SeparationCutterCoverClosed("separationCutterCoverClosed"),
    SeparationCutterCoverOpen("separationCutterCoverOpen"),
    SeparationCutterEmpty("separationCutterEmpty"),
    SeparationCutterFull("separationCutterFull"),
    SeparationCutterInterlockClosed("separationCutterInterlockClosed"),
    SeparationCutterInterlockOpen("separationCutterInterlockOpen"),
    SeparationCutterJam("separationCutterJam"),
    SeparationCutterLifeAlmostOver("separationCutterLifeAlmostOver"),
    SeparationCutterLifeOver("separationCutterLifeOver"),
    SeparationCutterMemoryExhausted("separationCutterMemoryExhausted"),
    SeparationCutterMissing("separationCutterMissing"),
    SeparationCutterMotorFailure("separationCutterMotorFailure"),
    SeparationCutterNearLimit("separationCutterNearLimit"),
    SeparationCutterOffline("separationCutterOffline"),
    SeparationCutterOpened("separationCutterOpened"),
    SeparationCutterOverTemperature("separationCutterOverTemperature"),
    SeparationCutterPowerSaver("separationCutterPowerSaver"),
    SeparationCutterRecoverableFailure("separationCutterRecoverableFailure"),
    SeparationCutterRecoverableStorage("separationCutterRecoverableStorage"),
    SeparationCutterRemoved("separationCutterRemoved"),
    SeparationCutterResourceAdded("separationCutterResourceAdded"),
    SeparationCutterResourceRemoved("separationCutterResourceRemoved"),
    SeparationCutterThermistorFailure("separationCutterThermistorFailure"),
    SeparationCutterTimingFailure("separationCutterTimingFailure"),
    SeparationCutterTurnedOff("separationCutterTurnedOff"),
    SeparationCutterTurnedOn("separationCutterTurnedOn"),
    SeparationCutterUnderTemperature("separationCutterUnderTemperature"),
    SeparationCutterUnrecoverableFailure("separationCutterUnrecoverableFailure"),
    SeparationCutterUnrecoverableStorageError("separationCutterUnrecoverableStorageError"),
    SeparationCutterWarmingUp("separationCutterWarmingUp"),
    SheetRotatorAdded("sheetRotatorAdded"),
    SheetRotatorAlmostEmpty("sheetRotatorAlmostEmpty"),
    SheetRotatorAlmostFull("sheetRotatorAlmostFull"),
    SheetRotatorAtLimit("sheetRotatorAtLimit"),
    SheetRotatorClosed("sheetRotatorClosed"),
    SheetRotatorConfigurationChange("sheetRotatorConfigurationChange"),
    SheetRotatorCoverClosed("sheetRotatorCoverClosed"),
    SheetRotatorCoverOpen("sheetRotatorCoverOpen"),
    SheetRotatorEmpty("sheetRotatorEmpty"),
    SheetRotatorFull("sheetRotatorFull"),
    SheetRotatorInterlockClosed("sheetRotatorInterlockClosed"),
    SheetRotatorInterlockOpen("sheetRotatorInterlockOpen"),
    SheetRotatorJam("sheetRotatorJam"),
    SheetRotatorLifeAlmostOver("sheetRotatorLifeAlmostOver"),
    SheetRotatorLifeOver("sheetRotatorLifeOver"),
    SheetRotatorMemoryExhausted("sheetRotatorMemoryExhausted"),
    SheetRotatorMissing("sheetRotatorMissing"),
    SheetRotatorMotorFailure("sheetRotatorMotorFailure"),
    SheetRotatorNearLimit("sheetRotatorNearLimit"),
    SheetRotatorOffline("sheetRotatorOffline"),
    SheetRotatorOpened("sheetRotatorOpened"),
    SheetRotatorOverTemperature("sheetRotatorOverTemperature"),
    SheetRotatorPowerSaver("sheetRotatorPowerSaver"),
    SheetRotatorRecoverableFailure("sheetRotatorRecoverableFailure"),
    SheetRotatorRecoverableStorage("sheetRotatorRecoverableStorage"),
    SheetRotatorRemoved("sheetRotatorRemoved"),
    SheetRotatorResourceAdded("sheetRotatorResourceAdded"),
    SheetRotatorResourceRemoved("sheetRotatorResourceRemoved"),
    SheetRotatorThermistorFailure("sheetRotatorThermistorFailure"),
    SheetRotatorTimingFailure("sheetRotatorTimingFailure"),
    SheetRotatorTurnedOff("sheetRotatorTurnedOff"),
    SheetRotatorTurnedOn("sheetRotatorTurnedOn"),
    SheetRotatorUnderTemperature("sheetRotatorUnderTemperature"),
    SheetRotatorUnrecoverableFailure("sheetRotatorUnrecoverableFailure"),
    SheetRotatorUnrecoverableStorageError("sheetRotatorUnrecoverableStorageError"),
    SheetRotatorWarmingUp("sheetRotatorWarmingUp"),
    SlitterAdded("slitterAdded"),
    SlitterAlmostEmpty("slitterAlmostEmpty"),
    SlitterAlmostFull("slitterAlmostFull"),
    SlitterAtLimit("slitterAtLimit"),
    SlitterClosed("slitterClosed"),
    SlitterConfigurationChange("slitterConfigurationChange"),
    SlitterCoverClosed("slitterCoverClosed"),
    SlitterCoverOpen("slitterCoverOpen"),
    SlitterEmpty("slitterEmpty"),
    SlitterFull("slitterFull"),
    SlitterInterlockClosed("slitterInterlockClosed"),
    SlitterInterlockOpen("slitterInterlockOpen"),
    SlitterJam("slitterJam"),
    SlitterLifeAlmostOver("slitterLifeAlmostOver"),
    SlitterLifeOver("slitterLifeOver"),
    SlitterMemoryExhausted("slitterMemoryExhausted"),
    SlitterMissing("slitterMissing"),
    SlitterMotorFailure("slitterMotorFailure"),
    SlitterNearLimit("slitterNearLimit"),
    SlitterOffline("slitterOffline"),
    SlitterOpened("slitterOpened"),
    SlitterOverTemperature("slitterOverTemperature"),
    SlitterPowerSaver("slitterPowerSaver"),
    SlitterRecoverableFailure("slitterRecoverableFailure"),
    SlitterRecoverableStorage("slitterRecoverableStorage"),
    SlitterRemoved("slitterRemoved"),
    SlitterResourceAdded("slitterResourceAdded"),
    SlitterResourceRemoved("slitterResourceRemoved"),
    SlitterThermistorFailure("slitterThermistorFailure"),
    SlitterTimingFailure("slitterTimingFailure"),
    SlitterTurnedOff("slitterTurnedOff"),
    SlitterTurnedOn("slitterTurnedOn"),
    SlitterUnderTemperature("slitterUnderTemperature"),
    SlitterUnrecoverableFailure("slitterUnrecoverableFailure"),
    SlitterUnrecoverableStorageError("slitterUnrecoverableStorageError"),
    SlitterWarmingUp("slitterWarmingUp"),
    StackerAdded("stackerAdded"),
    StackerAlmostEmpty("stackerAlmostEmpty"),
    StackerAlmostFull("stackerAlmostFull"),
    StackerAtLimit("stackerAtLimit"),
    StackerClosed("stackerClosed"),
    StackerConfigurationChange("stackerConfigurationChange"),
    StackerCoverClosed("stackerCoverClosed"),
    StackerCoverOpen("stackerCoverOpen"),
    StackerEmpty("stackerEmpty"),
    StackerFull("stackerFull"),
    StackerInterlockClosed("stackerInterlockClosed"),
    StackerInterlockOpen("stackerInterlockOpen"),
    StackerJam("stackerJam"),
    StackerLifeAlmostOver("stackerLifeAlmostOver"),
    StackerLifeOver("stackerLifeOver"),
    StackerMemoryExhausted("stackerMemoryExhausted"),
    StackerMissing("stackerMissing"),
    StackerMotorFailure("stackerMotorFailure"),
    StackerNearLimit("stackerNearLimit"),
    StackerOffline("stackerOffline"),
    StackerOpened("stackerOpened"),
    StackerOverTemperature("stackerOverTemperature"),
    StackerPowerSaver("stackerPowerSaver"),
    StackerRecoverableFailure("stackerRecoverableFailure"),
    StackerRecoverableStorage("stackerRecoverableStorage"),
    StackerRemoved("stackerRemoved"),
    StackerResourceAdded("stackerResourceAdded"),
    StackerResourceRemoved("stackerResourceRemoved"),
    StackerThermistorFailure("stackerThermistorFailure"),
    StackerTimingFailure("stackerTimingFailure"),
    StackerTurnedOff("stackerTurnedOff"),
    StackerTurnedOn("stackerTurnedOn"),
    StackerUnderTemperature("stackerUnderTemperature"),
    StackerUnrecoverableFailure("stackerUnrecoverableFailure"),
    StackerUnrecoverableStorageError("stackerUnrecoverableStorageError"),
    StackerWarmingUp("stackerWarmingUp"),
    Standby("standby"),
    StaplerAdded("staplerAdded"),
    StaplerAlmostEmpty("staplerAlmostEmpty"),
    StaplerAlmostFull("staplerAlmostFull"),
    StaplerAtLimit("staplerAtLimit"),
    StaplerClosed("staplerClosed"),
    StaplerConfigurationChange("staplerConfigurationChange"),
    StaplerCoverClosed("staplerCoverClosed"),
    StaplerCoverOpen("staplerCoverOpen"),
    StaplerEmpty("staplerEmpty"),
    StaplerFull("staplerFull"),
    StaplerInterlockClosed("staplerInterlockClosed"),
    StaplerInterlockOpen("staplerInterlockOpen"),
    StaplerJam("staplerJam"),
    StaplerLifeAlmostOver("staplerLifeAlmostOver"),
    StaplerLifeOver("staplerLifeOver"),
    StaplerMemoryExhausted("staplerMemoryExhausted"),
    StaplerMissing("staplerMissing"),
    StaplerMotorFailure("staplerMotorFailure"),
    StaplerNearLimit("staplerNearLimit"),
    StaplerOffline("staplerOffline"),
    StaplerOpened("staplerOpened"),
    StaplerOverTemperature("staplerOverTemperature"),
    StaplerPowerSaver("staplerPowerSaver"),
    StaplerRecoverableFailure("staplerRecoverableFailure"),
    StaplerRecoverableStorage("staplerRecoverableStorage"),
    StaplerRemoved("staplerRemoved"),
    StaplerResourceAdded("staplerResourceAdded"),
    StaplerResourceRemoved("staplerResourceRemoved"),
    StaplerThermistorFailure("staplerThermistorFailure"),
    StaplerTimingFailure("staplerTimingFailure"),
    StaplerTurnedOff("staplerTurnedOff"),
    StaplerTurnedOn("staplerTurnedOn"),
    StaplerUnderTemperature("staplerUnderTemperature"),
    StaplerUnrecoverableFailure("staplerUnrecoverableFailure"),
    StaplerUnrecoverableStorageError("staplerUnrecoverableStorageError"),
    StaplerWarmingUp("staplerWarmingUp"),
    StitcherAdded("stitcherAdded"),
    StitcherAlmostEmpty("stitcherAlmostEmpty"),
    StitcherAlmostFull("stitcherAlmostFull"),
    StitcherAtLimit("stitcherAtLimit"),
    StitcherClosed("stitcherClosed"),
    StitcherConfigurationChange("stitcherConfigurationChange"),
    StitcherCoverClosed("stitcherCoverClosed"),
    StitcherCoverOpen("stitcherCoverOpen"),
    StitcherEmpty("stitcherEmpty"),
    StitcherFull("stitcherFull"),
    StitcherInterlockClosed("stitcherInterlockClosed"),
    StitcherInterlockOpen("stitcherInterlockOpen"),
    StitcherJam("stitcherJam"),
    StitcherLifeAlmostOver("stitcherLifeAlmostOver"),
    StitcherLifeOver("stitcherLifeOver"),
    StitcherMemoryExhausted("stitcherMemoryExhausted"),
    StitcherMissing("stitcherMissing"),
    StitcherMotorFailure("stitcherMotorFailure"),
    StitcherNearLimit("stitcherNearLimit"),
    StitcherOffline("stitcherOffline"),
    StitcherOpened("stitcherOpened"),
    StitcherOverTemperature("stitcherOverTemperature"),
    StitcherPowerSaver("stitcherPowerSaver"),
    StitcherRecoverableFailure("stitcherRecoverableFailure"),
    StitcherRecoverableStorage("stitcherRecoverableStorage"),
    StitcherRemoved("stitcherRemoved"),
    StitcherResourceAdded("stitcherResourceAdded"),
    StitcherResourceRemoved("stitcherResourceRemoved"),
    StitcherThermistorFailure("stitcherThermistorFailure"),
    StitcherTimingFailure("stitcherTimingFailure"),
    StitcherTurnedOff("stitcherTurnedOff"),
    StitcherTurnedOn("stitcherTurnedOn"),
    StitcherUnderTemperature("stitcherUnderTemperature"),
    StitcherUnrecoverableFailure("stitcherUnrecoverableFailure"),
    StitcherUnrecoverableStorageError("stitcherUnrecoverableStorageError"),
    StitcherWarmingUp("stitcherWarmingUp"),
    SubunitAdded("subunitAdded"),
    SubunitAlmostEmpty("subunitAlmostEmpty"),
    SubunitAlmostFull("subunitAlmostFull"),
    SubunitAtLimit("subunitAtLimit"),
    SubunitClosed("subunitClosed"),
    SubunitCoolingDown("subunitCoolingDown"),
    SubunitEmpty("subunitEmpty"),
    SubunitFull("subunitFull"),
    SubunitLifeAlmostOver("subunitLifeAlmostOver"),
    SubunitLifeOver("subunitLifeOver"),
    SubunitMemoryExhausted("subunitMemoryExhausted"),
    SubunitMissing("subunitMissing"),
    SubunitMotorFailure("subunitMotorFailure"),
    SubunitNearLimit("subunitNearLimit"),
    SubunitOffline("subunitOffline"),
    SubunitOpened("subunitOpened"),
    SubunitOverTemperature("subunitOverTemperature"),
    SubunitPowerSaver("subunitPowerSaver"),
    SubunitRecoverableFailure("subunitRecoverableFailure"),
    SubunitRecoverableStorage("subunitRecoverableStorage"),
    SubunitRemoved("subunitRemoved"),
    SubunitResourceAdded("subunitResourceAdded"),
    SubunitResourceRemoved("subunitResourceRemoved"),
    SubunitThermistorFailure("subunitThermistorFailure"),
    SubunitTimingFailure("subunitTimingFailure"),
    SubunitTurnedOff("subunitTurnedOff"),
    SubunitTurnedOn("subunitTurnedOn"),
    SubunitUnderTemperature("subunitUnderTemperature"),
    SubunitUnrecoverableFailure("subunitUnrecoverableFailure"),
    SubunitUnrecoverableStorage("subunitUnrecoverableStorage"),
    SubunitWarmingUp("subunitWarmingUp"),
    Suspend("suspend"),
    Testing("testing"),
    TrimmerAdded("trimmerAdded"),
    TrimmerAlmostEmpty("trimmerAlmostEmpty"),
    TrimmerAlmostFull("trimmerAlmostFull"),
    TrimmerAtLimit("trimmerAtLimit"),
    TrimmerClosed("trimmerClosed"),
    TrimmerConfigurationChange("trimmerConfigurationChange"),
    TrimmerCoverClosed("trimmerCoverClosed"),
    TrimmerCoverOpen("trimmerCoverOpen"),
    TrimmerEmpty("trimmerEmpty"),
    TrimmerFull("trimmerFull"),
    TrimmerInterlockClosed("trimmerInterlockClosed"),
    TrimmerInterlockOpen("trimmerInterlockOpen"),
    TrimmerJam("trimmerJam"),
    TrimmerLifeAlmostOver("trimmerLifeAlmostOver"),
    TrimmerLifeOver("trimmerLifeOver"),
    TrimmerMemoryExhausted("trimmerMemoryExhausted"),
    TrimmerMissing("trimmerMissing"),
    TrimmerMotorFailure("trimmerMotorFailure"),
    TrimmerNearLimit("trimmerNearLimit"),
    TrimmerOffline("trimmerOffline"),
    TrimmerOpened("trimmerOpened"),
    TrimmerOverTemperature("trimmerOverTemperature"),
    TrimmerPowerSaver("trimmerPowerSaver"),
    TrimmerRecoverableFailure("trimmerRecoverableFailure"),
    TrimmerRecoverableStorage("trimmerRecoverableStorage"),
    TrimmerRemoved("trimmerRemoved"),
    TrimmerResourceAdded("trimmerResourceAdded"),
    TrimmerResourceRemoved("trimmerResourceRemoved"),
    TrimmerThermistorFailure("trimmerThermistorFailure"),
    TrimmerTimingFailure("trimmerTimingFailure"),
    TrimmerTurnedOff("trimmerTurnedOff"),
    TrimmerTurnedOn("trimmerTurnedOn"),
    TrimmerUnderTemperature("trimmerUnderTemperature"),
    TrimmerUnrecoverableFailure("trimmerUnrecoverableFailure"),
    TrimmerUnrecoverableStorageError("trimmerUnrecoverableStorageError"),
    TrimmerWarmingUp("trimmerWarmingUp"),
    Unknown("unknown"),
    WrapperAdded("wrapperAdded"),
    WrapperAlmostEmpty("wrapperAlmostEmpty"),
    WrapperAlmostFull("wrapperAlmostFull"),
    WrapperAtLimit("wrapperAtLimit"),
    WrapperClosed("wrapperClosed"),
    WrapperConfigurationChange("wrapperConfigurationChange"),
    WrapperCoverClosed("wrapperCoverClosed"),
    WrapperCoverOpen("wrapperCoverOpen"),
    WrapperEmpty("wrapperEmpty"),
    WrapperFull("wrapperFull"),
    WrapperInterlockClosed("wrapperInterlockClosed"),
    WrapperInterlockOpen("wrapperInterlockOpen"),
    WrapperJam("wrapperJam"),
    WrapperLifeAlmostOver("wrapperLifeAlmostOver"),
    WrapperLifeOver("wrapperLifeOver"),
    WrapperMemoryExhausted("wrapperMemoryExhausted"),
    WrapperMissing("wrapperMissing"),
    WrapperMotorFailure("wrapperMotorFailure"),
    WrapperNearLimit("wrapperNearLimit"),
    WrapperOffline("wrapperOffline"),
    WrapperOpened("wrapperOpened"),
    WrapperOverTemperature("wrapperOverTemperature"),
    WrapperPowerSaver("wrapperPowerSaver"),
    WrapperRecoverableFailure("wrapperRecoverableFailure"),
    WrapperRecoverableStorage("wrapperRecoverableStorage"),
    WrapperRemoved("wrapperRemoved"),
    WrapperResourceAdded("wrapperResourceAdded"),
    WrapperResourceRemoved("wrapperResourceRemoved"),
    WrapperThermistorFailure("wrapperThermistorFailure"),
    WrapperTimingFailure("wrapperTimingFailure"),
    WrapperTurnedOff("wrapperTurnedOff"),
    WrapperTurnedOn("wrapperTurnedOn"),
    WrapperUnderTemperature("wrapperUnderTemperature"),
    WrapperUnrecoverableFailure("wrapperUnrecoverableFailure"),
    WrapperUnrecoverableStorageError("wrapperUnrecoverableStorageError"),
    WrapperWarmingUp("wrapperWarmingUp");
    public final String value;
    PrinterProcessingStateDetail(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PrinterProcessingStateDetail forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "paused": return Paused;
            case "mediaJam": return MediaJam;
            case "mediaNeeded": return MediaNeeded;
            case "mediaLow": return MediaLow;
            case "mediaEmpty": return MediaEmpty;
            case "coverOpen": return CoverOpen;
            case "interlockOpen": return InterlockOpen;
            case "outputTrayMissing": return OutputTrayMissing;
            case "outputAreaFull": return OutputAreaFull;
            case "markerSupplyLow": return MarkerSupplyLow;
            case "markerSupplyEmpty": return MarkerSupplyEmpty;
            case "inputTrayMissing": return InputTrayMissing;
            case "outputAreaAlmostFull": return OutputAreaAlmostFull;
            case "markerWasteAlmostFull": return MarkerWasteAlmostFull;
            case "markerWasteFull": return MarkerWasteFull;
            case "fuserOverTemp": return FuserOverTemp;
            case "fuserUnderTemp": return FuserUnderTemp;
            case "other": return Other;
            case "none": return None;
            case "movingToPaused": return MovingToPaused;
            case "shutdown": return Shutdown;
            case "connectingToDevice": return ConnectingToDevice;
            case "timedOut": return TimedOut;
            case "stopping": return Stopping;
            case "stoppedPartially": return StoppedPartially;
            case "tonerLow": return TonerLow;
            case "tonerEmpty": return TonerEmpty;
            case "spoolAreaFull": return SpoolAreaFull;
            case "doorOpen": return DoorOpen;
            case "opticalPhotoConductorNearEndOfLife": return OpticalPhotoConductorNearEndOfLife;
            case "opticalPhotoConductorLifeOver": return OpticalPhotoConductorLifeOver;
            case "developerLow": return DeveloperLow;
            case "developerEmpty": return DeveloperEmpty;
            case "interpreterResourceUnavailable": return InterpreterResourceUnavailable;
            case "unknownFutureValue": return UnknownFutureValue;
            case "alertRemovalOfBinaryChangeEntry": return AlertRemovalOfBinaryChangeEntry;
            case "banderAdded": return BanderAdded;
            case "banderAlmostEmpty": return BanderAlmostEmpty;
            case "banderAlmostFull": return BanderAlmostFull;
            case "banderAtLimit": return BanderAtLimit;
            case "banderClosed": return BanderClosed;
            case "banderConfigurationChange": return BanderConfigurationChange;
            case "banderCoverClosed": return BanderCoverClosed;
            case "banderCoverOpen": return BanderCoverOpen;
            case "banderEmpty": return BanderEmpty;
            case "banderFull": return BanderFull;
            case "banderInterlockClosed": return BanderInterlockClosed;
            case "banderInterlockOpen": return BanderInterlockOpen;
            case "banderJam": return BanderJam;
            case "banderLifeAlmostOver": return BanderLifeAlmostOver;
            case "banderLifeOver": return BanderLifeOver;
            case "banderMemoryExhausted": return BanderMemoryExhausted;
            case "banderMissing": return BanderMissing;
            case "banderMotorFailure": return BanderMotorFailure;
            case "banderNearLimit": return BanderNearLimit;
            case "banderOffline": return BanderOffline;
            case "banderOpened": return BanderOpened;
            case "banderOverTemperature": return BanderOverTemperature;
            case "banderPowerSaver": return BanderPowerSaver;
            case "banderRecoverableFailure": return BanderRecoverableFailure;
            case "banderRecoverableStorage": return BanderRecoverableStorage;
            case "banderRemoved": return BanderRemoved;
            case "banderResourceAdded": return BanderResourceAdded;
            case "banderResourceRemoved": return BanderResourceRemoved;
            case "banderThermistorFailure": return BanderThermistorFailure;
            case "banderTimingFailure": return BanderTimingFailure;
            case "banderTurnedOff": return BanderTurnedOff;
            case "banderTurnedOn": return BanderTurnedOn;
            case "banderUnderTemperature": return BanderUnderTemperature;
            case "banderUnrecoverableFailure": return BanderUnrecoverableFailure;
            case "banderUnrecoverableStorageError": return BanderUnrecoverableStorageError;
            case "banderWarmingUp": return BanderWarmingUp;
            case "binderAdded": return BinderAdded;
            case "binderAlmostEmpty": return BinderAlmostEmpty;
            case "binderAlmostFull": return BinderAlmostFull;
            case "binderAtLimit": return BinderAtLimit;
            case "binderClosed": return BinderClosed;
            case "binderConfigurationChange": return BinderConfigurationChange;
            case "binderCoverClosed": return BinderCoverClosed;
            case "binderCoverOpen": return BinderCoverOpen;
            case "binderEmpty": return BinderEmpty;
            case "binderFull": return BinderFull;
            case "binderInterlockClosed": return BinderInterlockClosed;
            case "binderInterlockOpen": return BinderInterlockOpen;
            case "binderJam": return BinderJam;
            case "binderLifeAlmostOver": return BinderLifeAlmostOver;
            case "binderLifeOver": return BinderLifeOver;
            case "binderMemoryExhausted": return BinderMemoryExhausted;
            case "binderMissing": return BinderMissing;
            case "binderMotorFailure": return BinderMotorFailure;
            case "binderNearLimit": return BinderNearLimit;
            case "binderOffline": return BinderOffline;
            case "binderOpened": return BinderOpened;
            case "binderOverTemperature": return BinderOverTemperature;
            case "binderPowerSaver": return BinderPowerSaver;
            case "binderRecoverableFailure": return BinderRecoverableFailure;
            case "binderRecoverableStorage": return BinderRecoverableStorage;
            case "binderRemoved": return BinderRemoved;
            case "binderResourceAdded": return BinderResourceAdded;
            case "binderResourceRemoved": return BinderResourceRemoved;
            case "binderThermistorFailure": return BinderThermistorFailure;
            case "binderTimingFailure": return BinderTimingFailure;
            case "binderTurnedOff": return BinderTurnedOff;
            case "binderTurnedOn": return BinderTurnedOn;
            case "binderUnderTemperature": return BinderUnderTemperature;
            case "binderUnrecoverableFailure": return BinderUnrecoverableFailure;
            case "binderUnrecoverableStorageError": return BinderUnrecoverableStorageError;
            case "binderWarmingUp": return BinderWarmingUp;
            case "cameraFailure": return CameraFailure;
            case "chamberCooling": return ChamberCooling;
            case "chamberFailure": return ChamberFailure;
            case "chamberHeating": return ChamberHeating;
            case "chamberTemperatureHigh": return ChamberTemperatureHigh;
            case "chamberTemperatureLow": return ChamberTemperatureLow;
            case "cleanerLifeAlmostOver": return CleanerLifeAlmostOver;
            case "cleanerLifeOver": return CleanerLifeOver;
            case "configurationChange": return ConfigurationChange;
            case "deactivated": return Deactivated;
            case "deleted": return Deleted;
            case "dieCutterAdded": return DieCutterAdded;
            case "dieCutterAlmostEmpty": return DieCutterAlmostEmpty;
            case "dieCutterAlmostFull": return DieCutterAlmostFull;
            case "dieCutterAtLimit": return DieCutterAtLimit;
            case "dieCutterClosed": return DieCutterClosed;
            case "dieCutterConfigurationChange": return DieCutterConfigurationChange;
            case "dieCutterCoverClosed": return DieCutterCoverClosed;
            case "dieCutterCoverOpen": return DieCutterCoverOpen;
            case "dieCutterEmpty": return DieCutterEmpty;
            case "dieCutterFull": return DieCutterFull;
            case "dieCutterInterlockClosed": return DieCutterInterlockClosed;
            case "dieCutterInterlockOpen": return DieCutterInterlockOpen;
            case "dieCutterJam": return DieCutterJam;
            case "dieCutterLifeAlmostOver": return DieCutterLifeAlmostOver;
            case "dieCutterLifeOver": return DieCutterLifeOver;
            case "dieCutterMemoryExhausted": return DieCutterMemoryExhausted;
            case "dieCutterMissing": return DieCutterMissing;
            case "dieCutterMotorFailure": return DieCutterMotorFailure;
            case "dieCutterNearLimit": return DieCutterNearLimit;
            case "dieCutterOffline": return DieCutterOffline;
            case "dieCutterOpened": return DieCutterOpened;
            case "dieCutterOverTemperature": return DieCutterOverTemperature;
            case "dieCutterPowerSaver": return DieCutterPowerSaver;
            case "dieCutterRecoverableFailure": return DieCutterRecoverableFailure;
            case "dieCutterRecoverableStorage": return DieCutterRecoverableStorage;
            case "dieCutterRemoved": return DieCutterRemoved;
            case "dieCutterResourceAdded": return DieCutterResourceAdded;
            case "dieCutterResourceRemoved": return DieCutterResourceRemoved;
            case "dieCutterThermistorFailure": return DieCutterThermistorFailure;
            case "dieCutterTimingFailure": return DieCutterTimingFailure;
            case "dieCutterTurnedOff": return DieCutterTurnedOff;
            case "dieCutterTurnedOn": return DieCutterTurnedOn;
            case "dieCutterUnderTemperature": return DieCutterUnderTemperature;
            case "dieCutterUnrecoverableFailure": return DieCutterUnrecoverableFailure;
            case "dieCutterUnrecoverableStorageError": return DieCutterUnrecoverableStorageError;
            case "dieCutterWarmingUp": return DieCutterWarmingUp;
            case "extruderCooling": return ExtruderCooling;
            case "extruderFailure": return ExtruderFailure;
            case "extruderHeating": return ExtruderHeating;
            case "extruderJam": return ExtruderJam;
            case "extruderTemperatureHigh": return ExtruderTemperatureHigh;
            case "extruderTemperatureLow": return ExtruderTemperatureLow;
            case "fanFailure": return FanFailure;
            case "faxModemLifeAlmostOver": return FaxModemLifeAlmostOver;
            case "faxModemLifeOver": return FaxModemLifeOver;
            case "faxModemMissing": return FaxModemMissing;
            case "faxModemTurnedOff": return FaxModemTurnedOff;
            case "faxModemTurnedOn": return FaxModemTurnedOn;
            case "folderAdded": return FolderAdded;
            case "folderAlmostEmpty": return FolderAlmostEmpty;
            case "folderAlmostFull": return FolderAlmostFull;
            case "folderAtLimit": return FolderAtLimit;
            case "folderClosed": return FolderClosed;
            case "folderConfigurationChange": return FolderConfigurationChange;
            case "folderCoverClosed": return FolderCoverClosed;
            case "folderCoverOpen": return FolderCoverOpen;
            case "folderEmpty": return FolderEmpty;
            case "folderFull": return FolderFull;
            case "folderInterlockClosed": return FolderInterlockClosed;
            case "folderInterlockOpen": return FolderInterlockOpen;
            case "folderJam": return FolderJam;
            case "folderLifeAlmostOver": return FolderLifeAlmostOver;
            case "folderLifeOver": return FolderLifeOver;
            case "folderMemoryExhausted": return FolderMemoryExhausted;
            case "folderMissing": return FolderMissing;
            case "folderMotorFailure": return FolderMotorFailure;
            case "folderNearLimit": return FolderNearLimit;
            case "folderOffline": return FolderOffline;
            case "folderOpened": return FolderOpened;
            case "folderOverTemperature": return FolderOverTemperature;
            case "folderPowerSaver": return FolderPowerSaver;
            case "folderRecoverableFailure": return FolderRecoverableFailure;
            case "folderRecoverableStorage": return FolderRecoverableStorage;
            case "folderRemoved": return FolderRemoved;
            case "folderResourceAdded": return FolderResourceAdded;
            case "folderResourceRemoved": return FolderResourceRemoved;
            case "folderThermistorFailure": return FolderThermistorFailure;
            case "folderTimingFailure": return FolderTimingFailure;
            case "folderTurnedOff": return FolderTurnedOff;
            case "folderTurnedOn": return FolderTurnedOn;
            case "folderUnderTemperature": return FolderUnderTemperature;
            case "folderUnrecoverableFailure": return FolderUnrecoverableFailure;
            case "folderUnrecoverableStorageError": return FolderUnrecoverableStorageError;
            case "folderWarmingUp": return FolderWarmingUp;
            case "hibernate": return Hibernate;
            case "holdNewJobs": return HoldNewJobs;
            case "identifyPrinterRequested": return IdentifyPrinterRequested;
            case "imprinterAdded": return ImprinterAdded;
            case "imprinterAlmostEmpty": return ImprinterAlmostEmpty;
            case "imprinterAlmostFull": return ImprinterAlmostFull;
            case "imprinterAtLimit": return ImprinterAtLimit;
            case "imprinterClosed": return ImprinterClosed;
            case "imprinterConfigurationChange": return ImprinterConfigurationChange;
            case "imprinterCoverClosed": return ImprinterCoverClosed;
            case "imprinterCoverOpen": return ImprinterCoverOpen;
            case "imprinterEmpty": return ImprinterEmpty;
            case "imprinterFull": return ImprinterFull;
            case "imprinterInterlockClosed": return ImprinterInterlockClosed;
            case "imprinterInterlockOpen": return ImprinterInterlockOpen;
            case "imprinterJam": return ImprinterJam;
            case "imprinterLifeAlmostOver": return ImprinterLifeAlmostOver;
            case "imprinterLifeOver": return ImprinterLifeOver;
            case "imprinterMemoryExhausted": return ImprinterMemoryExhausted;
            case "imprinterMissing": return ImprinterMissing;
            case "imprinterMotorFailure": return ImprinterMotorFailure;
            case "imprinterNearLimit": return ImprinterNearLimit;
            case "imprinterOffline": return ImprinterOffline;
            case "imprinterOpened": return ImprinterOpened;
            case "imprinterOverTemperature": return ImprinterOverTemperature;
            case "imprinterPowerSaver": return ImprinterPowerSaver;
            case "imprinterRecoverableFailure": return ImprinterRecoverableFailure;
            case "imprinterRecoverableStorage": return ImprinterRecoverableStorage;
            case "imprinterRemoved": return ImprinterRemoved;
            case "imprinterResourceAdded": return ImprinterResourceAdded;
            case "imprinterResourceRemoved": return ImprinterResourceRemoved;
            case "imprinterThermistorFailure": return ImprinterThermistorFailure;
            case "imprinterTimingFailure": return ImprinterTimingFailure;
            case "imprinterTurnedOff": return ImprinterTurnedOff;
            case "imprinterTurnedOn": return ImprinterTurnedOn;
            case "imprinterUnderTemperature": return ImprinterUnderTemperature;
            case "imprinterUnrecoverableFailure": return ImprinterUnrecoverableFailure;
            case "imprinterUnrecoverableStorageError": return ImprinterUnrecoverableStorageError;
            case "imprinterWarmingUp": return ImprinterWarmingUp;
            case "inputCannotFeedSizeSelected": return InputCannotFeedSizeSelected;
            case "inputManualInputRequest": return InputManualInputRequest;
            case "inputMediaColorChange": return InputMediaColorChange;
            case "inputMediaFormPartsChange": return InputMediaFormPartsChange;
            case "inputMediaSizeChange": return InputMediaSizeChange;
            case "inputMediaTrayFailure": return InputMediaTrayFailure;
            case "inputMediaTrayFeedError": return InputMediaTrayFeedError;
            case "inputMediaTrayJam": return InputMediaTrayJam;
            case "inputMediaTypeChange": return InputMediaTypeChange;
            case "inputMediaWeightChange": return InputMediaWeightChange;
            case "inputPickRollerFailure": return InputPickRollerFailure;
            case "inputPickRollerLifeOver": return InputPickRollerLifeOver;
            case "inputPickRollerLifeWarn": return InputPickRollerLifeWarn;
            case "inputPickRollerMissing": return InputPickRollerMissing;
            case "inputTrayElevationFailure": return InputTrayElevationFailure;
            case "inputTrayPositionFailure": return InputTrayPositionFailure;
            case "inserterAdded": return InserterAdded;
            case "inserterAlmostEmpty": return InserterAlmostEmpty;
            case "inserterAlmostFull": return InserterAlmostFull;
            case "inserterAtLimit": return InserterAtLimit;
            case "inserterClosed": return InserterClosed;
            case "inserterConfigurationChange": return InserterConfigurationChange;
            case "inserterCoverClosed": return InserterCoverClosed;
            case "inserterCoverOpen": return InserterCoverOpen;
            case "inserterEmpty": return InserterEmpty;
            case "inserterFull": return InserterFull;
            case "inserterInterlockClosed": return InserterInterlockClosed;
            case "inserterInterlockOpen": return InserterInterlockOpen;
            case "inserterJam": return InserterJam;
            case "inserterLifeAlmostOver": return InserterLifeAlmostOver;
            case "inserterLifeOver": return InserterLifeOver;
            case "inserterMemoryExhausted": return InserterMemoryExhausted;
            case "inserterMissing": return InserterMissing;
            case "inserterMotorFailure": return InserterMotorFailure;
            case "inserterNearLimit": return InserterNearLimit;
            case "inserterOffline": return InserterOffline;
            case "inserterOpened": return InserterOpened;
            case "inserterOverTemperature": return InserterOverTemperature;
            case "inserterPowerSaver": return InserterPowerSaver;
            case "inserterRecoverableFailure": return InserterRecoverableFailure;
            case "inserterRecoverableStorage": return InserterRecoverableStorage;
            case "inserterRemoved": return InserterRemoved;
            case "inserterResourceAdded": return InserterResourceAdded;
            case "inserterResourceRemoved": return InserterResourceRemoved;
            case "inserterThermistorFailure": return InserterThermistorFailure;
            case "inserterTimingFailure": return InserterTimingFailure;
            case "inserterTurnedOff": return InserterTurnedOff;
            case "inserterTurnedOn": return InserterTurnedOn;
            case "inserterUnderTemperature": return InserterUnderTemperature;
            case "inserterUnrecoverableFailure": return InserterUnrecoverableFailure;
            case "inserterUnrecoverableStorageError": return InserterUnrecoverableStorageError;
            case "inserterWarmingUp": return InserterWarmingUp;
            case "interlockClosed": return InterlockClosed;
            case "interpreterCartridgeAdded": return InterpreterCartridgeAdded;
            case "interpreterCartridgeDeleted": return InterpreterCartridgeDeleted;
            case "interpreterComplexPageEncountered": return InterpreterComplexPageEncountered;
            case "interpreterMemoryDecrease": return InterpreterMemoryDecrease;
            case "interpreterMemoryIncrease": return InterpreterMemoryIncrease;
            case "interpreterResourceAdded": return InterpreterResourceAdded;
            case "interpreterResourceDeleted": return InterpreterResourceDeleted;
            case "lampAtEol": return LampAtEol;
            case "lampFailure": return LampFailure;
            case "lampNearEol": return LampNearEol;
            case "laserAtEol": return LaserAtEol;
            case "laserFailure": return LaserFailure;
            case "laserNearEol": return LaserNearEol;
            case "makeEnvelopeAdded": return MakeEnvelopeAdded;
            case "makeEnvelopeAlmostEmpty": return MakeEnvelopeAlmostEmpty;
            case "makeEnvelopeAlmostFull": return MakeEnvelopeAlmostFull;
            case "makeEnvelopeAtLimit": return MakeEnvelopeAtLimit;
            case "makeEnvelopeClosed": return MakeEnvelopeClosed;
            case "makeEnvelopeConfigurationChange": return MakeEnvelopeConfigurationChange;
            case "makeEnvelopeCoverClosed": return MakeEnvelopeCoverClosed;
            case "makeEnvelopeCoverOpen": return MakeEnvelopeCoverOpen;
            case "makeEnvelopeEmpty": return MakeEnvelopeEmpty;
            case "makeEnvelopeFull": return MakeEnvelopeFull;
            case "makeEnvelopeInterlockClosed": return MakeEnvelopeInterlockClosed;
            case "makeEnvelopeInterlockOpen": return MakeEnvelopeInterlockOpen;
            case "makeEnvelopeJam": return MakeEnvelopeJam;
            case "makeEnvelopeLifeAlmostOver": return MakeEnvelopeLifeAlmostOver;
            case "makeEnvelopeLifeOver": return MakeEnvelopeLifeOver;
            case "makeEnvelopeMemoryExhausted": return MakeEnvelopeMemoryExhausted;
            case "makeEnvelopeMissing": return MakeEnvelopeMissing;
            case "makeEnvelopeMotorFailure": return MakeEnvelopeMotorFailure;
            case "makeEnvelopeNearLimit": return MakeEnvelopeNearLimit;
            case "makeEnvelopeOffline": return MakeEnvelopeOffline;
            case "makeEnvelopeOpened": return MakeEnvelopeOpened;
            case "makeEnvelopeOverTemperature": return MakeEnvelopeOverTemperature;
            case "makeEnvelopePowerSaver": return MakeEnvelopePowerSaver;
            case "makeEnvelopeRecoverableFailure": return MakeEnvelopeRecoverableFailure;
            case "makeEnvelopeRecoverableStorage": return MakeEnvelopeRecoverableStorage;
            case "makeEnvelopeRemoved": return MakeEnvelopeRemoved;
            case "makeEnvelopeResourceAdded": return MakeEnvelopeResourceAdded;
            case "makeEnvelopeResourceRemoved": return MakeEnvelopeResourceRemoved;
            case "makeEnvelopeThermistorFailure": return MakeEnvelopeThermistorFailure;
            case "makeEnvelopeTimingFailure": return MakeEnvelopeTimingFailure;
            case "makeEnvelopeTurnedOff": return MakeEnvelopeTurnedOff;
            case "makeEnvelopeTurnedOn": return MakeEnvelopeTurnedOn;
            case "makeEnvelopeUnderTemperature": return MakeEnvelopeUnderTemperature;
            case "makeEnvelopeUnrecoverableFailure": return MakeEnvelopeUnrecoverableFailure;
            case "makeEnvelopeUnrecoverableStorageError": return MakeEnvelopeUnrecoverableStorageError;
            case "makeEnvelopeWarmingUp": return MakeEnvelopeWarmingUp;
            case "markerAdjustingPrintQuality": return MarkerAdjustingPrintQuality;
            case "markerCleanerMissing": return MarkerCleanerMissing;
            case "markerDeveloperAlmostEmpty": return MarkerDeveloperAlmostEmpty;
            case "markerDeveloperEmpty": return MarkerDeveloperEmpty;
            case "markerDeveloperMissing": return MarkerDeveloperMissing;
            case "markerFuserMissing": return MarkerFuserMissing;
            case "markerFuserThermistorFailure": return MarkerFuserThermistorFailure;
            case "markerFuserTimingFailure": return MarkerFuserTimingFailure;
            case "markerInkAlmostEmpty": return MarkerInkAlmostEmpty;
            case "markerInkEmpty": return MarkerInkEmpty;
            case "markerInkMissing": return MarkerInkMissing;
            case "markerOpcMissing": return MarkerOpcMissing;
            case "markerPrintRibbonAlmostEmpty": return MarkerPrintRibbonAlmostEmpty;
            case "markerPrintRibbonEmpty": return MarkerPrintRibbonEmpty;
            case "markerPrintRibbonMissing": return MarkerPrintRibbonMissing;
            case "markerSupplyAlmostEmpty": return MarkerSupplyAlmostEmpty;
            case "markerSupplyMissing": return MarkerSupplyMissing;
            case "markerTonerCartridgeMissing": return MarkerTonerCartridgeMissing;
            case "markerTonerMissing": return MarkerTonerMissing;
            case "markerWasteInkReceptacleAlmostFull": return MarkerWasteInkReceptacleAlmostFull;
            case "markerWasteInkReceptacleFull": return MarkerWasteInkReceptacleFull;
            case "markerWasteInkReceptacleMissing": return MarkerWasteInkReceptacleMissing;
            case "markerWasteMissing": return MarkerWasteMissing;
            case "markerWasteTonerReceptacleAlmostFull": return MarkerWasteTonerReceptacleAlmostFull;
            case "markerWasteTonerReceptacleFull": return MarkerWasteTonerReceptacleFull;
            case "markerWasteTonerReceptacleMissing": return MarkerWasteTonerReceptacleMissing;
            case "materialEmpty": return MaterialEmpty;
            case "materialLow": return MaterialLow;
            case "materialNeeded": return MaterialNeeded;
            case "mediaDrying": return MediaDrying;
            case "mediaPathCannotDuplexMediaSelected": return MediaPathCannotDuplexMediaSelected;
            case "mediaPathFailure": return MediaPathFailure;
            case "mediaPathInputEmpty": return MediaPathInputEmpty;
            case "mediaPathInputFeedError": return MediaPathInputFeedError;
            case "mediaPathInputJam": return MediaPathInputJam;
            case "mediaPathInputRequest": return MediaPathInputRequest;
            case "mediaPathJam": return MediaPathJam;
            case "mediaPathMediaTrayAlmostFull": return MediaPathMediaTrayAlmostFull;
            case "mediaPathMediaTrayFull": return MediaPathMediaTrayFull;
            case "mediaPathMediaTrayMissing": return MediaPathMediaTrayMissing;
            case "mediaPathOutputFeedError": return MediaPathOutputFeedError;
            case "mediaPathOutputFull": return MediaPathOutputFull;
            case "mediaPathOutputJam": return MediaPathOutputJam;
            case "mediaPathPickRollerFailure": return MediaPathPickRollerFailure;
            case "mediaPathPickRollerLifeOver": return MediaPathPickRollerLifeOver;
            case "mediaPathPickRollerLifeWarn": return MediaPathPickRollerLifeWarn;
            case "mediaPathPickRollerMissing": return MediaPathPickRollerMissing;
            case "motorFailure": return MotorFailure;
            case "outputMailboxSelectFailure": return OutputMailboxSelectFailure;
            case "outputMediaTrayFailure": return OutputMediaTrayFailure;
            case "outputMediaTrayFeedError": return OutputMediaTrayFeedError;
            case "outputMediaTrayJam": return OutputMediaTrayJam;
            case "perforaterAdded": return PerforaterAdded;
            case "perforaterAlmostEmpty": return PerforaterAlmostEmpty;
            case "perforaterAlmostFull": return PerforaterAlmostFull;
            case "perforaterAtLimit": return PerforaterAtLimit;
            case "perforaterClosed": return PerforaterClosed;
            case "perforaterConfigurationChange": return PerforaterConfigurationChange;
            case "perforaterCoverClosed": return PerforaterCoverClosed;
            case "perforaterCoverOpen": return PerforaterCoverOpen;
            case "perforaterEmpty": return PerforaterEmpty;
            case "perforaterFull": return PerforaterFull;
            case "perforaterInterlockClosed": return PerforaterInterlockClosed;
            case "perforaterInterlockOpen": return PerforaterInterlockOpen;
            case "perforaterJam": return PerforaterJam;
            case "perforaterLifeAlmostOver": return PerforaterLifeAlmostOver;
            case "perforaterLifeOver": return PerforaterLifeOver;
            case "perforaterMemoryExhausted": return PerforaterMemoryExhausted;
            case "perforaterMissing": return PerforaterMissing;
            case "perforaterMotorFailure": return PerforaterMotorFailure;
            case "perforaterNearLimit": return PerforaterNearLimit;
            case "perforaterOffline": return PerforaterOffline;
            case "perforaterOpened": return PerforaterOpened;
            case "perforaterOverTemperature": return PerforaterOverTemperature;
            case "perforaterPowerSaver": return PerforaterPowerSaver;
            case "perforaterRecoverableFailure": return PerforaterRecoverableFailure;
            case "perforaterRecoverableStorage": return PerforaterRecoverableStorage;
            case "perforaterRemoved": return PerforaterRemoved;
            case "perforaterResourceAdded": return PerforaterResourceAdded;
            case "perforaterResourceRemoved": return PerforaterResourceRemoved;
            case "perforaterThermistorFailure": return PerforaterThermistorFailure;
            case "perforaterTimingFailure": return PerforaterTimingFailure;
            case "perforaterTurnedOff": return PerforaterTurnedOff;
            case "perforaterTurnedOn": return PerforaterTurnedOn;
            case "perforaterUnderTemperature": return PerforaterUnderTemperature;
            case "perforaterUnrecoverableFailure": return PerforaterUnrecoverableFailure;
            case "perforaterUnrecoverableStorageError": return PerforaterUnrecoverableStorageError;
            case "perforaterWarmingUp": return PerforaterWarmingUp;
            case "platformCooling": return PlatformCooling;
            case "platformFailure": return PlatformFailure;
            case "platformHeating": return PlatformHeating;
            case "platformTemperatureHigh": return PlatformTemperatureHigh;
            case "platformTemperatureLow": return PlatformTemperatureLow;
            case "powerDown": return PowerDown;
            case "powerUp": return PowerUp;
            case "printerManualReset": return PrinterManualReset;
            case "printerNmsReset": return PrinterNmsReset;
            case "printerReadyToPrint": return PrinterReadyToPrint;
            case "puncherAdded": return PuncherAdded;
            case "puncherAlmostEmpty": return PuncherAlmostEmpty;
            case "puncherAlmostFull": return PuncherAlmostFull;
            case "puncherAtLimit": return PuncherAtLimit;
            case "puncherClosed": return PuncherClosed;
            case "puncherConfigurationChange": return PuncherConfigurationChange;
            case "puncherCoverClosed": return PuncherCoverClosed;
            case "puncherCoverOpen": return PuncherCoverOpen;
            case "puncherEmpty": return PuncherEmpty;
            case "puncherFull": return PuncherFull;
            case "puncherInterlockClosed": return PuncherInterlockClosed;
            case "puncherInterlockOpen": return PuncherInterlockOpen;
            case "puncherJam": return PuncherJam;
            case "puncherLifeAlmostOver": return PuncherLifeAlmostOver;
            case "puncherLifeOver": return PuncherLifeOver;
            case "puncherMemoryExhausted": return PuncherMemoryExhausted;
            case "puncherMissing": return PuncherMissing;
            case "puncherMotorFailure": return PuncherMotorFailure;
            case "puncherNearLimit": return PuncherNearLimit;
            case "puncherOffline": return PuncherOffline;
            case "puncherOpened": return PuncherOpened;
            case "puncherOverTemperature": return PuncherOverTemperature;
            case "puncherPowerSaver": return PuncherPowerSaver;
            case "puncherRecoverableFailure": return PuncherRecoverableFailure;
            case "puncherRecoverableStorage": return PuncherRecoverableStorage;
            case "puncherRemoved": return PuncherRemoved;
            case "puncherResourceAdded": return PuncherResourceAdded;
            case "puncherResourceRemoved": return PuncherResourceRemoved;
            case "puncherThermistorFailure": return PuncherThermistorFailure;
            case "puncherTimingFailure": return PuncherTimingFailure;
            case "puncherTurnedOff": return PuncherTurnedOff;
            case "puncherTurnedOn": return PuncherTurnedOn;
            case "puncherUnderTemperature": return PuncherUnderTemperature;
            case "puncherUnrecoverableFailure": return PuncherUnrecoverableFailure;
            case "puncherUnrecoverableStorageError": return PuncherUnrecoverableStorageError;
            case "puncherWarmingUp": return PuncherWarmingUp;
            case "resuming": return Resuming;
            case "scanMediaPathFailure": return ScanMediaPathFailure;
            case "scanMediaPathInputEmpty": return ScanMediaPathInputEmpty;
            case "scanMediaPathInputFeedError": return ScanMediaPathInputFeedError;
            case "scanMediaPathInputJam": return ScanMediaPathInputJam;
            case "scanMediaPathInputRequest": return ScanMediaPathInputRequest;
            case "scanMediaPathJam": return ScanMediaPathJam;
            case "scanMediaPathOutputFeedError": return ScanMediaPathOutputFeedError;
            case "scanMediaPathOutputFull": return ScanMediaPathOutputFull;
            case "scanMediaPathOutputJam": return ScanMediaPathOutputJam;
            case "scanMediaPathPickRollerFailure": return ScanMediaPathPickRollerFailure;
            case "scanMediaPathPickRollerLifeOver": return ScanMediaPathPickRollerLifeOver;
            case "scanMediaPathPickRollerLifeWarn": return ScanMediaPathPickRollerLifeWarn;
            case "scanMediaPathPickRollerMissing": return ScanMediaPathPickRollerMissing;
            case "scanMediaPathTrayAlmostFull": return ScanMediaPathTrayAlmostFull;
            case "scanMediaPathTrayFull": return ScanMediaPathTrayFull;
            case "scanMediaPathTrayMissing": return ScanMediaPathTrayMissing;
            case "scannerLightFailure": return ScannerLightFailure;
            case "scannerLightLifeAlmostOver": return ScannerLightLifeAlmostOver;
            case "scannerLightLifeOver": return ScannerLightLifeOver;
            case "scannerLightMissing": return ScannerLightMissing;
            case "scannerSensorFailure": return ScannerSensorFailure;
            case "scannerSensorLifeAlmostOver": return ScannerSensorLifeAlmostOver;
            case "scannerSensorLifeOver": return ScannerSensorLifeOver;
            case "scannerSensorMissing": return ScannerSensorMissing;
            case "separationCutterAdded": return SeparationCutterAdded;
            case "separationCutterAlmostEmpty": return SeparationCutterAlmostEmpty;
            case "separationCutterAlmostFull": return SeparationCutterAlmostFull;
            case "separationCutterAtLimit": return SeparationCutterAtLimit;
            case "separationCutterClosed": return SeparationCutterClosed;
            case "separationCutterConfigurationChange": return SeparationCutterConfigurationChange;
            case "separationCutterCoverClosed": return SeparationCutterCoverClosed;
            case "separationCutterCoverOpen": return SeparationCutterCoverOpen;
            case "separationCutterEmpty": return SeparationCutterEmpty;
            case "separationCutterFull": return SeparationCutterFull;
            case "separationCutterInterlockClosed": return SeparationCutterInterlockClosed;
            case "separationCutterInterlockOpen": return SeparationCutterInterlockOpen;
            case "separationCutterJam": return SeparationCutterJam;
            case "separationCutterLifeAlmostOver": return SeparationCutterLifeAlmostOver;
            case "separationCutterLifeOver": return SeparationCutterLifeOver;
            case "separationCutterMemoryExhausted": return SeparationCutterMemoryExhausted;
            case "separationCutterMissing": return SeparationCutterMissing;
            case "separationCutterMotorFailure": return SeparationCutterMotorFailure;
            case "separationCutterNearLimit": return SeparationCutterNearLimit;
            case "separationCutterOffline": return SeparationCutterOffline;
            case "separationCutterOpened": return SeparationCutterOpened;
            case "separationCutterOverTemperature": return SeparationCutterOverTemperature;
            case "separationCutterPowerSaver": return SeparationCutterPowerSaver;
            case "separationCutterRecoverableFailure": return SeparationCutterRecoverableFailure;
            case "separationCutterRecoverableStorage": return SeparationCutterRecoverableStorage;
            case "separationCutterRemoved": return SeparationCutterRemoved;
            case "separationCutterResourceAdded": return SeparationCutterResourceAdded;
            case "separationCutterResourceRemoved": return SeparationCutterResourceRemoved;
            case "separationCutterThermistorFailure": return SeparationCutterThermistorFailure;
            case "separationCutterTimingFailure": return SeparationCutterTimingFailure;
            case "separationCutterTurnedOff": return SeparationCutterTurnedOff;
            case "separationCutterTurnedOn": return SeparationCutterTurnedOn;
            case "separationCutterUnderTemperature": return SeparationCutterUnderTemperature;
            case "separationCutterUnrecoverableFailure": return SeparationCutterUnrecoverableFailure;
            case "separationCutterUnrecoverableStorageError": return SeparationCutterUnrecoverableStorageError;
            case "separationCutterWarmingUp": return SeparationCutterWarmingUp;
            case "sheetRotatorAdded": return SheetRotatorAdded;
            case "sheetRotatorAlmostEmpty": return SheetRotatorAlmostEmpty;
            case "sheetRotatorAlmostFull": return SheetRotatorAlmostFull;
            case "sheetRotatorAtLimit": return SheetRotatorAtLimit;
            case "sheetRotatorClosed": return SheetRotatorClosed;
            case "sheetRotatorConfigurationChange": return SheetRotatorConfigurationChange;
            case "sheetRotatorCoverClosed": return SheetRotatorCoverClosed;
            case "sheetRotatorCoverOpen": return SheetRotatorCoverOpen;
            case "sheetRotatorEmpty": return SheetRotatorEmpty;
            case "sheetRotatorFull": return SheetRotatorFull;
            case "sheetRotatorInterlockClosed": return SheetRotatorInterlockClosed;
            case "sheetRotatorInterlockOpen": return SheetRotatorInterlockOpen;
            case "sheetRotatorJam": return SheetRotatorJam;
            case "sheetRotatorLifeAlmostOver": return SheetRotatorLifeAlmostOver;
            case "sheetRotatorLifeOver": return SheetRotatorLifeOver;
            case "sheetRotatorMemoryExhausted": return SheetRotatorMemoryExhausted;
            case "sheetRotatorMissing": return SheetRotatorMissing;
            case "sheetRotatorMotorFailure": return SheetRotatorMotorFailure;
            case "sheetRotatorNearLimit": return SheetRotatorNearLimit;
            case "sheetRotatorOffline": return SheetRotatorOffline;
            case "sheetRotatorOpened": return SheetRotatorOpened;
            case "sheetRotatorOverTemperature": return SheetRotatorOverTemperature;
            case "sheetRotatorPowerSaver": return SheetRotatorPowerSaver;
            case "sheetRotatorRecoverableFailure": return SheetRotatorRecoverableFailure;
            case "sheetRotatorRecoverableStorage": return SheetRotatorRecoverableStorage;
            case "sheetRotatorRemoved": return SheetRotatorRemoved;
            case "sheetRotatorResourceAdded": return SheetRotatorResourceAdded;
            case "sheetRotatorResourceRemoved": return SheetRotatorResourceRemoved;
            case "sheetRotatorThermistorFailure": return SheetRotatorThermistorFailure;
            case "sheetRotatorTimingFailure": return SheetRotatorTimingFailure;
            case "sheetRotatorTurnedOff": return SheetRotatorTurnedOff;
            case "sheetRotatorTurnedOn": return SheetRotatorTurnedOn;
            case "sheetRotatorUnderTemperature": return SheetRotatorUnderTemperature;
            case "sheetRotatorUnrecoverableFailure": return SheetRotatorUnrecoverableFailure;
            case "sheetRotatorUnrecoverableStorageError": return SheetRotatorUnrecoverableStorageError;
            case "sheetRotatorWarmingUp": return SheetRotatorWarmingUp;
            case "slitterAdded": return SlitterAdded;
            case "slitterAlmostEmpty": return SlitterAlmostEmpty;
            case "slitterAlmostFull": return SlitterAlmostFull;
            case "slitterAtLimit": return SlitterAtLimit;
            case "slitterClosed": return SlitterClosed;
            case "slitterConfigurationChange": return SlitterConfigurationChange;
            case "slitterCoverClosed": return SlitterCoverClosed;
            case "slitterCoverOpen": return SlitterCoverOpen;
            case "slitterEmpty": return SlitterEmpty;
            case "slitterFull": return SlitterFull;
            case "slitterInterlockClosed": return SlitterInterlockClosed;
            case "slitterInterlockOpen": return SlitterInterlockOpen;
            case "slitterJam": return SlitterJam;
            case "slitterLifeAlmostOver": return SlitterLifeAlmostOver;
            case "slitterLifeOver": return SlitterLifeOver;
            case "slitterMemoryExhausted": return SlitterMemoryExhausted;
            case "slitterMissing": return SlitterMissing;
            case "slitterMotorFailure": return SlitterMotorFailure;
            case "slitterNearLimit": return SlitterNearLimit;
            case "slitterOffline": return SlitterOffline;
            case "slitterOpened": return SlitterOpened;
            case "slitterOverTemperature": return SlitterOverTemperature;
            case "slitterPowerSaver": return SlitterPowerSaver;
            case "slitterRecoverableFailure": return SlitterRecoverableFailure;
            case "slitterRecoverableStorage": return SlitterRecoverableStorage;
            case "slitterRemoved": return SlitterRemoved;
            case "slitterResourceAdded": return SlitterResourceAdded;
            case "slitterResourceRemoved": return SlitterResourceRemoved;
            case "slitterThermistorFailure": return SlitterThermistorFailure;
            case "slitterTimingFailure": return SlitterTimingFailure;
            case "slitterTurnedOff": return SlitterTurnedOff;
            case "slitterTurnedOn": return SlitterTurnedOn;
            case "slitterUnderTemperature": return SlitterUnderTemperature;
            case "slitterUnrecoverableFailure": return SlitterUnrecoverableFailure;
            case "slitterUnrecoverableStorageError": return SlitterUnrecoverableStorageError;
            case "slitterWarmingUp": return SlitterWarmingUp;
            case "stackerAdded": return StackerAdded;
            case "stackerAlmostEmpty": return StackerAlmostEmpty;
            case "stackerAlmostFull": return StackerAlmostFull;
            case "stackerAtLimit": return StackerAtLimit;
            case "stackerClosed": return StackerClosed;
            case "stackerConfigurationChange": return StackerConfigurationChange;
            case "stackerCoverClosed": return StackerCoverClosed;
            case "stackerCoverOpen": return StackerCoverOpen;
            case "stackerEmpty": return StackerEmpty;
            case "stackerFull": return StackerFull;
            case "stackerInterlockClosed": return StackerInterlockClosed;
            case "stackerInterlockOpen": return StackerInterlockOpen;
            case "stackerJam": return StackerJam;
            case "stackerLifeAlmostOver": return StackerLifeAlmostOver;
            case "stackerLifeOver": return StackerLifeOver;
            case "stackerMemoryExhausted": return StackerMemoryExhausted;
            case "stackerMissing": return StackerMissing;
            case "stackerMotorFailure": return StackerMotorFailure;
            case "stackerNearLimit": return StackerNearLimit;
            case "stackerOffline": return StackerOffline;
            case "stackerOpened": return StackerOpened;
            case "stackerOverTemperature": return StackerOverTemperature;
            case "stackerPowerSaver": return StackerPowerSaver;
            case "stackerRecoverableFailure": return StackerRecoverableFailure;
            case "stackerRecoverableStorage": return StackerRecoverableStorage;
            case "stackerRemoved": return StackerRemoved;
            case "stackerResourceAdded": return StackerResourceAdded;
            case "stackerResourceRemoved": return StackerResourceRemoved;
            case "stackerThermistorFailure": return StackerThermistorFailure;
            case "stackerTimingFailure": return StackerTimingFailure;
            case "stackerTurnedOff": return StackerTurnedOff;
            case "stackerTurnedOn": return StackerTurnedOn;
            case "stackerUnderTemperature": return StackerUnderTemperature;
            case "stackerUnrecoverableFailure": return StackerUnrecoverableFailure;
            case "stackerUnrecoverableStorageError": return StackerUnrecoverableStorageError;
            case "stackerWarmingUp": return StackerWarmingUp;
            case "standby": return Standby;
            case "staplerAdded": return StaplerAdded;
            case "staplerAlmostEmpty": return StaplerAlmostEmpty;
            case "staplerAlmostFull": return StaplerAlmostFull;
            case "staplerAtLimit": return StaplerAtLimit;
            case "staplerClosed": return StaplerClosed;
            case "staplerConfigurationChange": return StaplerConfigurationChange;
            case "staplerCoverClosed": return StaplerCoverClosed;
            case "staplerCoverOpen": return StaplerCoverOpen;
            case "staplerEmpty": return StaplerEmpty;
            case "staplerFull": return StaplerFull;
            case "staplerInterlockClosed": return StaplerInterlockClosed;
            case "staplerInterlockOpen": return StaplerInterlockOpen;
            case "staplerJam": return StaplerJam;
            case "staplerLifeAlmostOver": return StaplerLifeAlmostOver;
            case "staplerLifeOver": return StaplerLifeOver;
            case "staplerMemoryExhausted": return StaplerMemoryExhausted;
            case "staplerMissing": return StaplerMissing;
            case "staplerMotorFailure": return StaplerMotorFailure;
            case "staplerNearLimit": return StaplerNearLimit;
            case "staplerOffline": return StaplerOffline;
            case "staplerOpened": return StaplerOpened;
            case "staplerOverTemperature": return StaplerOverTemperature;
            case "staplerPowerSaver": return StaplerPowerSaver;
            case "staplerRecoverableFailure": return StaplerRecoverableFailure;
            case "staplerRecoverableStorage": return StaplerRecoverableStorage;
            case "staplerRemoved": return StaplerRemoved;
            case "staplerResourceAdded": return StaplerResourceAdded;
            case "staplerResourceRemoved": return StaplerResourceRemoved;
            case "staplerThermistorFailure": return StaplerThermistorFailure;
            case "staplerTimingFailure": return StaplerTimingFailure;
            case "staplerTurnedOff": return StaplerTurnedOff;
            case "staplerTurnedOn": return StaplerTurnedOn;
            case "staplerUnderTemperature": return StaplerUnderTemperature;
            case "staplerUnrecoverableFailure": return StaplerUnrecoverableFailure;
            case "staplerUnrecoverableStorageError": return StaplerUnrecoverableStorageError;
            case "staplerWarmingUp": return StaplerWarmingUp;
            case "stitcherAdded": return StitcherAdded;
            case "stitcherAlmostEmpty": return StitcherAlmostEmpty;
            case "stitcherAlmostFull": return StitcherAlmostFull;
            case "stitcherAtLimit": return StitcherAtLimit;
            case "stitcherClosed": return StitcherClosed;
            case "stitcherConfigurationChange": return StitcherConfigurationChange;
            case "stitcherCoverClosed": return StitcherCoverClosed;
            case "stitcherCoverOpen": return StitcherCoverOpen;
            case "stitcherEmpty": return StitcherEmpty;
            case "stitcherFull": return StitcherFull;
            case "stitcherInterlockClosed": return StitcherInterlockClosed;
            case "stitcherInterlockOpen": return StitcherInterlockOpen;
            case "stitcherJam": return StitcherJam;
            case "stitcherLifeAlmostOver": return StitcherLifeAlmostOver;
            case "stitcherLifeOver": return StitcherLifeOver;
            case "stitcherMemoryExhausted": return StitcherMemoryExhausted;
            case "stitcherMissing": return StitcherMissing;
            case "stitcherMotorFailure": return StitcherMotorFailure;
            case "stitcherNearLimit": return StitcherNearLimit;
            case "stitcherOffline": return StitcherOffline;
            case "stitcherOpened": return StitcherOpened;
            case "stitcherOverTemperature": return StitcherOverTemperature;
            case "stitcherPowerSaver": return StitcherPowerSaver;
            case "stitcherRecoverableFailure": return StitcherRecoverableFailure;
            case "stitcherRecoverableStorage": return StitcherRecoverableStorage;
            case "stitcherRemoved": return StitcherRemoved;
            case "stitcherResourceAdded": return StitcherResourceAdded;
            case "stitcherResourceRemoved": return StitcherResourceRemoved;
            case "stitcherThermistorFailure": return StitcherThermistorFailure;
            case "stitcherTimingFailure": return StitcherTimingFailure;
            case "stitcherTurnedOff": return StitcherTurnedOff;
            case "stitcherTurnedOn": return StitcherTurnedOn;
            case "stitcherUnderTemperature": return StitcherUnderTemperature;
            case "stitcherUnrecoverableFailure": return StitcherUnrecoverableFailure;
            case "stitcherUnrecoverableStorageError": return StitcherUnrecoverableStorageError;
            case "stitcherWarmingUp": return StitcherWarmingUp;
            case "subunitAdded": return SubunitAdded;
            case "subunitAlmostEmpty": return SubunitAlmostEmpty;
            case "subunitAlmostFull": return SubunitAlmostFull;
            case "subunitAtLimit": return SubunitAtLimit;
            case "subunitClosed": return SubunitClosed;
            case "subunitCoolingDown": return SubunitCoolingDown;
            case "subunitEmpty": return SubunitEmpty;
            case "subunitFull": return SubunitFull;
            case "subunitLifeAlmostOver": return SubunitLifeAlmostOver;
            case "subunitLifeOver": return SubunitLifeOver;
            case "subunitMemoryExhausted": return SubunitMemoryExhausted;
            case "subunitMissing": return SubunitMissing;
            case "subunitMotorFailure": return SubunitMotorFailure;
            case "subunitNearLimit": return SubunitNearLimit;
            case "subunitOffline": return SubunitOffline;
            case "subunitOpened": return SubunitOpened;
            case "subunitOverTemperature": return SubunitOverTemperature;
            case "subunitPowerSaver": return SubunitPowerSaver;
            case "subunitRecoverableFailure": return SubunitRecoverableFailure;
            case "subunitRecoverableStorage": return SubunitRecoverableStorage;
            case "subunitRemoved": return SubunitRemoved;
            case "subunitResourceAdded": return SubunitResourceAdded;
            case "subunitResourceRemoved": return SubunitResourceRemoved;
            case "subunitThermistorFailure": return SubunitThermistorFailure;
            case "subunitTimingFailure": return SubunitTimingFailure;
            case "subunitTurnedOff": return SubunitTurnedOff;
            case "subunitTurnedOn": return SubunitTurnedOn;
            case "subunitUnderTemperature": return SubunitUnderTemperature;
            case "subunitUnrecoverableFailure": return SubunitUnrecoverableFailure;
            case "subunitUnrecoverableStorage": return SubunitUnrecoverableStorage;
            case "subunitWarmingUp": return SubunitWarmingUp;
            case "suspend": return Suspend;
            case "testing": return Testing;
            case "trimmerAdded": return TrimmerAdded;
            case "trimmerAlmostEmpty": return TrimmerAlmostEmpty;
            case "trimmerAlmostFull": return TrimmerAlmostFull;
            case "trimmerAtLimit": return TrimmerAtLimit;
            case "trimmerClosed": return TrimmerClosed;
            case "trimmerConfigurationChange": return TrimmerConfigurationChange;
            case "trimmerCoverClosed": return TrimmerCoverClosed;
            case "trimmerCoverOpen": return TrimmerCoverOpen;
            case "trimmerEmpty": return TrimmerEmpty;
            case "trimmerFull": return TrimmerFull;
            case "trimmerInterlockClosed": return TrimmerInterlockClosed;
            case "trimmerInterlockOpen": return TrimmerInterlockOpen;
            case "trimmerJam": return TrimmerJam;
            case "trimmerLifeAlmostOver": return TrimmerLifeAlmostOver;
            case "trimmerLifeOver": return TrimmerLifeOver;
            case "trimmerMemoryExhausted": return TrimmerMemoryExhausted;
            case "trimmerMissing": return TrimmerMissing;
            case "trimmerMotorFailure": return TrimmerMotorFailure;
            case "trimmerNearLimit": return TrimmerNearLimit;
            case "trimmerOffline": return TrimmerOffline;
            case "trimmerOpened": return TrimmerOpened;
            case "trimmerOverTemperature": return TrimmerOverTemperature;
            case "trimmerPowerSaver": return TrimmerPowerSaver;
            case "trimmerRecoverableFailure": return TrimmerRecoverableFailure;
            case "trimmerRecoverableStorage": return TrimmerRecoverableStorage;
            case "trimmerRemoved": return TrimmerRemoved;
            case "trimmerResourceAdded": return TrimmerResourceAdded;
            case "trimmerResourceRemoved": return TrimmerResourceRemoved;
            case "trimmerThermistorFailure": return TrimmerThermistorFailure;
            case "trimmerTimingFailure": return TrimmerTimingFailure;
            case "trimmerTurnedOff": return TrimmerTurnedOff;
            case "trimmerTurnedOn": return TrimmerTurnedOn;
            case "trimmerUnderTemperature": return TrimmerUnderTemperature;
            case "trimmerUnrecoverableFailure": return TrimmerUnrecoverableFailure;
            case "trimmerUnrecoverableStorageError": return TrimmerUnrecoverableStorageError;
            case "trimmerWarmingUp": return TrimmerWarmingUp;
            case "unknown": return Unknown;
            case "wrapperAdded": return WrapperAdded;
            case "wrapperAlmostEmpty": return WrapperAlmostEmpty;
            case "wrapperAlmostFull": return WrapperAlmostFull;
            case "wrapperAtLimit": return WrapperAtLimit;
            case "wrapperClosed": return WrapperClosed;
            case "wrapperConfigurationChange": return WrapperConfigurationChange;
            case "wrapperCoverClosed": return WrapperCoverClosed;
            case "wrapperCoverOpen": return WrapperCoverOpen;
            case "wrapperEmpty": return WrapperEmpty;
            case "wrapperFull": return WrapperFull;
            case "wrapperInterlockClosed": return WrapperInterlockClosed;
            case "wrapperInterlockOpen": return WrapperInterlockOpen;
            case "wrapperJam": return WrapperJam;
            case "wrapperLifeAlmostOver": return WrapperLifeAlmostOver;
            case "wrapperLifeOver": return WrapperLifeOver;
            case "wrapperMemoryExhausted": return WrapperMemoryExhausted;
            case "wrapperMissing": return WrapperMissing;
            case "wrapperMotorFailure": return WrapperMotorFailure;
            case "wrapperNearLimit": return WrapperNearLimit;
            case "wrapperOffline": return WrapperOffline;
            case "wrapperOpened": return WrapperOpened;
            case "wrapperOverTemperature": return WrapperOverTemperature;
            case "wrapperPowerSaver": return WrapperPowerSaver;
            case "wrapperRecoverableFailure": return WrapperRecoverableFailure;
            case "wrapperRecoverableStorage": return WrapperRecoverableStorage;
            case "wrapperRemoved": return WrapperRemoved;
            case "wrapperResourceAdded": return WrapperResourceAdded;
            case "wrapperResourceRemoved": return WrapperResourceRemoved;
            case "wrapperThermistorFailure": return WrapperThermistorFailure;
            case "wrapperTimingFailure": return WrapperTimingFailure;
            case "wrapperTurnedOff": return WrapperTurnedOff;
            case "wrapperTurnedOn": return WrapperTurnedOn;
            case "wrapperUnderTemperature": return WrapperUnderTemperature;
            case "wrapperUnrecoverableFailure": return WrapperUnrecoverableFailure;
            case "wrapperUnrecoverableStorageError": return WrapperUnrecoverableStorageError;
            case "wrapperWarmingUp": return WrapperWarmingUp;
            default: return null;
        }
    }
}
