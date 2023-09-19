package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device protection status entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsProtectionState extends Entity implements Parsable {
    /**
     * Current anti malware version
     */
    private String antiMalwareVersion;
    /**
     * Device malware list
     */
    private java.util.List<WindowsDeviceMalwareState> detectedMalwareState;
    /**
     * Indicates device's health state. Possible values are: clean, fullScanPending, rebootPending, manualStepsPending, offlineScanPending, critical. Possible values are: clean, fullScanPending, rebootPending, manualStepsPending, offlineScanPending, critical.
     */
    private EnumSet<WindowsDeviceHealthState> deviceState;
    /**
     * Current endpoint protection engine's version
     */
    private String engineVersion;
    /**
     * When TRUE indicates full scan is overdue, when FALSE indicates full scan is not overdue. Defaults to setting on client device.
     */
    private Boolean fullScanOverdue;
    /**
     * When TRUE indicates full scan is required, when FALSE indicates full scan is not required. Defaults to setting on client device.
     */
    private Boolean fullScanRequired;
    /**
     * When TRUE indicates the device is a virtual machine, when FALSE indicates the device is not a virtual machine. Defaults to setting on client device.
     */
    private Boolean isVirtualMachine;
    /**
     * Last quick scan datetime
     */
    private OffsetDateTime lastFullScanDateTime;
    /**
     * Last full scan signature version
     */
    private String lastFullScanSignatureVersion;
    /**
     * Last quick scan datetime
     */
    private OffsetDateTime lastQuickScanDateTime;
    /**
     * Last quick scan signature version
     */
    private String lastQuickScanSignatureVersion;
    /**
     * Last device health status reported time
     */
    private OffsetDateTime lastReportedDateTime;
    /**
     * When TRUE indicates anti malware is enabled when FALSE indicates anti malware is not enabled.
     */
    private Boolean malwareProtectionEnabled;
    /**
     * When TRUE indicates network inspection system enabled, when FALSE indicates network inspection system is not enabled. Defaults to setting on client device.
     */
    private Boolean networkInspectionSystemEnabled;
    /**
     * Product Status of Windows Defender Antivirus. Possible values are: noStatus, serviceNotRunning, serviceStartedWithoutMalwareProtection, pendingFullScanDueToThreatAction, pendingRebootDueToThreatAction, pendingManualStepsDueToThreatAction, avSignaturesOutOfDate, asSignaturesOutOfDate, noQuickScanHappenedForSpecifiedPeriod, noFullScanHappenedForSpecifiedPeriod, systemInitiatedScanInProgress, systemInitiatedCleanInProgress, samplesPendingSubmission, productRunningInEvaluationMode, productRunningInNonGenuineMode, productExpired, offlineScanRequired, serviceShutdownAsPartOfSystemShutdown, threatRemediationFailedCritically, threatRemediationFailedNonCritically, noStatusFlagsSet, platformOutOfDate, platformUpdateInProgress, platformAboutToBeOutdated, signatureOrPlatformEndOfLifeIsPastOrIsImpending, windowsSModeSignaturesInUseOnNonWin10SInstall. Possible values are: noStatus, serviceNotRunning, serviceStartedWithoutMalwareProtection, pendingFullScanDueToThreatAction, pendingRebootDueToThreatAction, pendingManualStepsDueToThreatAction, avSignaturesOutOfDate, asSignaturesOutOfDate, noQuickScanHappenedForSpecifiedPeriod, noFullScanHappenedForSpecifiedPeriod, systemInitiatedScanInProgress, systemInitiatedCleanInProgress, samplesPendingSubmission, productRunningInEvaluationMode, productRunningInNonGenuineMode, productExpired, offlineScanRequired, serviceShutdownAsPartOfSystemShutdown, threatRemediationFailedCritically, threatRemediationFailedNonCritically, noStatusFlagsSet, platformOutOfDate, platformUpdateInProgress, platformAboutToBeOutdated, signatureOrPlatformEndOfLifeIsPastOrIsImpending, windowsSModeSignaturesInUseOnNonWin10SInstall.
     */
    private EnumSet<WindowsDefenderProductStatus> productStatus;
    /**
     * When TRUE indicates quick scan is overdue, when FALSE indicates quick scan is not overdue. Defaults to setting on client device.
     */
    private Boolean quickScanOverdue;
    /**
     * When TRUE indicates real time protection is enabled, when FALSE indicates real time protection is not enabled. Defaults to setting on client device.
     */
    private Boolean realTimeProtectionEnabled;
    /**
     * When TRUE indicates reboot is required, when FALSE indicates when TRUE indicates reboot is not required. Defaults to setting on client device.
     */
    private Boolean rebootRequired;
    /**
     * When TRUE indicates signature is out of date, when FALSE indicates signature is not out of date. Defaults to setting on client device.
     */
    private Boolean signatureUpdateOverdue;
    /**
     * Current malware definitions version
     */
    private String signatureVersion;
    /**
     * When TRUE indicates the Windows Defender tamper protection feature is enabled, when FALSE indicates the Windows Defender tamper protection feature is not enabled. Defaults to setting on client device.
     */
    private Boolean tamperProtectionEnabled;
    /**
     * Instantiates a new windowsProtectionState and sets the default values.
     */
    public WindowsProtectionState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsProtectionState
     */
    @jakarta.annotation.Nonnull
    public static WindowsProtectionState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsProtectionState();
    }
    /**
     * Gets the antiMalwareVersion property value. Current anti malware version
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAntiMalwareVersion() {
        return this.antiMalwareVersion;
    }
    /**
     * Gets the detectedMalwareState property value. Device malware list
     * @return a windowsDeviceMalwareState
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsDeviceMalwareState> getDetectedMalwareState() {
        return this.detectedMalwareState;
    }
    /**
     * Gets the deviceState property value. Indicates device's health state. Possible values are: clean, fullScanPending, rebootPending, manualStepsPending, offlineScanPending, critical. Possible values are: clean, fullScanPending, rebootPending, manualStepsPending, offlineScanPending, critical.
     * @return a windowsDeviceHealthState
     */
    @jakarta.annotation.Nullable
    public EnumSet<WindowsDeviceHealthState> getDeviceState() {
        return this.deviceState;
    }
    /**
     * Gets the engineVersion property value. Current endpoint protection engine's version
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEngineVersion() {
        return this.engineVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("antiMalwareVersion", (n) -> { this.setAntiMalwareVersion(n.getStringValue()); });
        deserializerMap.put("detectedMalwareState", (n) -> { this.setDetectedMalwareState(n.getCollectionOfObjectValues(WindowsDeviceMalwareState::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceState", (n) -> { this.setDeviceState(n.getEnumSetValue(WindowsDeviceHealthState.class)); });
        deserializerMap.put("engineVersion", (n) -> { this.setEngineVersion(n.getStringValue()); });
        deserializerMap.put("fullScanOverdue", (n) -> { this.setFullScanOverdue(n.getBooleanValue()); });
        deserializerMap.put("fullScanRequired", (n) -> { this.setFullScanRequired(n.getBooleanValue()); });
        deserializerMap.put("isVirtualMachine", (n) -> { this.setIsVirtualMachine(n.getBooleanValue()); });
        deserializerMap.put("lastFullScanDateTime", (n) -> { this.setLastFullScanDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastFullScanSignatureVersion", (n) -> { this.setLastFullScanSignatureVersion(n.getStringValue()); });
        deserializerMap.put("lastQuickScanDateTime", (n) -> { this.setLastQuickScanDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastQuickScanSignatureVersion", (n) -> { this.setLastQuickScanSignatureVersion(n.getStringValue()); });
        deserializerMap.put("lastReportedDateTime", (n) -> { this.setLastReportedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("malwareProtectionEnabled", (n) -> { this.setMalwareProtectionEnabled(n.getBooleanValue()); });
        deserializerMap.put("networkInspectionSystemEnabled", (n) -> { this.setNetworkInspectionSystemEnabled(n.getBooleanValue()); });
        deserializerMap.put("productStatus", (n) -> { this.setProductStatus(n.getEnumSetValue(WindowsDefenderProductStatus.class)); });
        deserializerMap.put("quickScanOverdue", (n) -> { this.setQuickScanOverdue(n.getBooleanValue()); });
        deserializerMap.put("realTimeProtectionEnabled", (n) -> { this.setRealTimeProtectionEnabled(n.getBooleanValue()); });
        deserializerMap.put("rebootRequired", (n) -> { this.setRebootRequired(n.getBooleanValue()); });
        deserializerMap.put("signatureUpdateOverdue", (n) -> { this.setSignatureUpdateOverdue(n.getBooleanValue()); });
        deserializerMap.put("signatureVersion", (n) -> { this.setSignatureVersion(n.getStringValue()); });
        deserializerMap.put("tamperProtectionEnabled", (n) -> { this.setTamperProtectionEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fullScanOverdue property value. When TRUE indicates full scan is overdue, when FALSE indicates full scan is not overdue. Defaults to setting on client device.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFullScanOverdue() {
        return this.fullScanOverdue;
    }
    /**
     * Gets the fullScanRequired property value. When TRUE indicates full scan is required, when FALSE indicates full scan is not required. Defaults to setting on client device.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFullScanRequired() {
        return this.fullScanRequired;
    }
    /**
     * Gets the isVirtualMachine property value. When TRUE indicates the device is a virtual machine, when FALSE indicates the device is not a virtual machine. Defaults to setting on client device.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsVirtualMachine() {
        return this.isVirtualMachine;
    }
    /**
     * Gets the lastFullScanDateTime property value. Last quick scan datetime
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastFullScanDateTime() {
        return this.lastFullScanDateTime;
    }
    /**
     * Gets the lastFullScanSignatureVersion property value. Last full scan signature version
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLastFullScanSignatureVersion() {
        return this.lastFullScanSignatureVersion;
    }
    /**
     * Gets the lastQuickScanDateTime property value. Last quick scan datetime
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastQuickScanDateTime() {
        return this.lastQuickScanDateTime;
    }
    /**
     * Gets the lastQuickScanSignatureVersion property value. Last quick scan signature version
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLastQuickScanSignatureVersion() {
        return this.lastQuickScanSignatureVersion;
    }
    /**
     * Gets the lastReportedDateTime property value. Last device health status reported time
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastReportedDateTime() {
        return this.lastReportedDateTime;
    }
    /**
     * Gets the malwareProtectionEnabled property value. When TRUE indicates anti malware is enabled when FALSE indicates anti malware is not enabled.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMalwareProtectionEnabled() {
        return this.malwareProtectionEnabled;
    }
    /**
     * Gets the networkInspectionSystemEnabled property value. When TRUE indicates network inspection system enabled, when FALSE indicates network inspection system is not enabled. Defaults to setting on client device.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getNetworkInspectionSystemEnabled() {
        return this.networkInspectionSystemEnabled;
    }
    /**
     * Gets the productStatus property value. Product Status of Windows Defender Antivirus. Possible values are: noStatus, serviceNotRunning, serviceStartedWithoutMalwareProtection, pendingFullScanDueToThreatAction, pendingRebootDueToThreatAction, pendingManualStepsDueToThreatAction, avSignaturesOutOfDate, asSignaturesOutOfDate, noQuickScanHappenedForSpecifiedPeriod, noFullScanHappenedForSpecifiedPeriod, systemInitiatedScanInProgress, systemInitiatedCleanInProgress, samplesPendingSubmission, productRunningInEvaluationMode, productRunningInNonGenuineMode, productExpired, offlineScanRequired, serviceShutdownAsPartOfSystemShutdown, threatRemediationFailedCritically, threatRemediationFailedNonCritically, noStatusFlagsSet, platformOutOfDate, platformUpdateInProgress, platformAboutToBeOutdated, signatureOrPlatformEndOfLifeIsPastOrIsImpending, windowsSModeSignaturesInUseOnNonWin10SInstall. Possible values are: noStatus, serviceNotRunning, serviceStartedWithoutMalwareProtection, pendingFullScanDueToThreatAction, pendingRebootDueToThreatAction, pendingManualStepsDueToThreatAction, avSignaturesOutOfDate, asSignaturesOutOfDate, noQuickScanHappenedForSpecifiedPeriod, noFullScanHappenedForSpecifiedPeriod, systemInitiatedScanInProgress, systemInitiatedCleanInProgress, samplesPendingSubmission, productRunningInEvaluationMode, productRunningInNonGenuineMode, productExpired, offlineScanRequired, serviceShutdownAsPartOfSystemShutdown, threatRemediationFailedCritically, threatRemediationFailedNonCritically, noStatusFlagsSet, platformOutOfDate, platformUpdateInProgress, platformAboutToBeOutdated, signatureOrPlatformEndOfLifeIsPastOrIsImpending, windowsSModeSignaturesInUseOnNonWin10SInstall.
     * @return a windowsDefenderProductStatus
     */
    @jakarta.annotation.Nullable
    public EnumSet<WindowsDefenderProductStatus> getProductStatus() {
        return this.productStatus;
    }
    /**
     * Gets the quickScanOverdue property value. When TRUE indicates quick scan is overdue, when FALSE indicates quick scan is not overdue. Defaults to setting on client device.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getQuickScanOverdue() {
        return this.quickScanOverdue;
    }
    /**
     * Gets the realTimeProtectionEnabled property value. When TRUE indicates real time protection is enabled, when FALSE indicates real time protection is not enabled. Defaults to setting on client device.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRealTimeProtectionEnabled() {
        return this.realTimeProtectionEnabled;
    }
    /**
     * Gets the rebootRequired property value. When TRUE indicates reboot is required, when FALSE indicates when TRUE indicates reboot is not required. Defaults to setting on client device.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRebootRequired() {
        return this.rebootRequired;
    }
    /**
     * Gets the signatureUpdateOverdue property value. When TRUE indicates signature is out of date, when FALSE indicates signature is not out of date. Defaults to setting on client device.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSignatureUpdateOverdue() {
        return this.signatureUpdateOverdue;
    }
    /**
     * Gets the signatureVersion property value. Current malware definitions version
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSignatureVersion() {
        return this.signatureVersion;
    }
    /**
     * Gets the tamperProtectionEnabled property value. When TRUE indicates the Windows Defender tamper protection feature is enabled, when FALSE indicates the Windows Defender tamper protection feature is not enabled. Defaults to setting on client device.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTamperProtectionEnabled() {
        return this.tamperProtectionEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("antiMalwareVersion", this.getAntiMalwareVersion());
        writer.writeCollectionOfObjectValues("detectedMalwareState", this.getDetectedMalwareState());
        writer.writeEnumSetValue("deviceState", this.getDeviceState());
        writer.writeStringValue("engineVersion", this.getEngineVersion());
        writer.writeBooleanValue("fullScanOverdue", this.getFullScanOverdue());
        writer.writeBooleanValue("fullScanRequired", this.getFullScanRequired());
        writer.writeBooleanValue("isVirtualMachine", this.getIsVirtualMachine());
        writer.writeOffsetDateTimeValue("lastFullScanDateTime", this.getLastFullScanDateTime());
        writer.writeStringValue("lastFullScanSignatureVersion", this.getLastFullScanSignatureVersion());
        writer.writeOffsetDateTimeValue("lastQuickScanDateTime", this.getLastQuickScanDateTime());
        writer.writeStringValue("lastQuickScanSignatureVersion", this.getLastQuickScanSignatureVersion());
        writer.writeOffsetDateTimeValue("lastReportedDateTime", this.getLastReportedDateTime());
        writer.writeBooleanValue("malwareProtectionEnabled", this.getMalwareProtectionEnabled());
        writer.writeBooleanValue("networkInspectionSystemEnabled", this.getNetworkInspectionSystemEnabled());
        writer.writeEnumSetValue("productStatus", this.getProductStatus());
        writer.writeBooleanValue("quickScanOverdue", this.getQuickScanOverdue());
        writer.writeBooleanValue("realTimeProtectionEnabled", this.getRealTimeProtectionEnabled());
        writer.writeBooleanValue("rebootRequired", this.getRebootRequired());
        writer.writeBooleanValue("signatureUpdateOverdue", this.getSignatureUpdateOverdue());
        writer.writeStringValue("signatureVersion", this.getSignatureVersion());
        writer.writeBooleanValue("tamperProtectionEnabled", this.getTamperProtectionEnabled());
    }
    /**
     * Sets the antiMalwareVersion property value. Current anti malware version
     * @param value Value to set for the antiMalwareVersion property.
     */
    public void setAntiMalwareVersion(@jakarta.annotation.Nullable final String value) {
        this.antiMalwareVersion = value;
    }
    /**
     * Sets the detectedMalwareState property value. Device malware list
     * @param value Value to set for the detectedMalwareState property.
     */
    public void setDetectedMalwareState(@jakarta.annotation.Nullable final java.util.List<WindowsDeviceMalwareState> value) {
        this.detectedMalwareState = value;
    }
    /**
     * Sets the deviceState property value. Indicates device's health state. Possible values are: clean, fullScanPending, rebootPending, manualStepsPending, offlineScanPending, critical. Possible values are: clean, fullScanPending, rebootPending, manualStepsPending, offlineScanPending, critical.
     * @param value Value to set for the deviceState property.
     */
    public void setDeviceState(@jakarta.annotation.Nullable final EnumSet<WindowsDeviceHealthState> value) {
        this.deviceState = value;
    }
    /**
     * Sets the engineVersion property value. Current endpoint protection engine's version
     * @param value Value to set for the engineVersion property.
     */
    public void setEngineVersion(@jakarta.annotation.Nullable final String value) {
        this.engineVersion = value;
    }
    /**
     * Sets the fullScanOverdue property value. When TRUE indicates full scan is overdue, when FALSE indicates full scan is not overdue. Defaults to setting on client device.
     * @param value Value to set for the fullScanOverdue property.
     */
    public void setFullScanOverdue(@jakarta.annotation.Nullable final Boolean value) {
        this.fullScanOverdue = value;
    }
    /**
     * Sets the fullScanRequired property value. When TRUE indicates full scan is required, when FALSE indicates full scan is not required. Defaults to setting on client device.
     * @param value Value to set for the fullScanRequired property.
     */
    public void setFullScanRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.fullScanRequired = value;
    }
    /**
     * Sets the isVirtualMachine property value. When TRUE indicates the device is a virtual machine, when FALSE indicates the device is not a virtual machine. Defaults to setting on client device.
     * @param value Value to set for the isVirtualMachine property.
     */
    public void setIsVirtualMachine(@jakarta.annotation.Nullable final Boolean value) {
        this.isVirtualMachine = value;
    }
    /**
     * Sets the lastFullScanDateTime property value. Last quick scan datetime
     * @param value Value to set for the lastFullScanDateTime property.
     */
    public void setLastFullScanDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastFullScanDateTime = value;
    }
    /**
     * Sets the lastFullScanSignatureVersion property value. Last full scan signature version
     * @param value Value to set for the lastFullScanSignatureVersion property.
     */
    public void setLastFullScanSignatureVersion(@jakarta.annotation.Nullable final String value) {
        this.lastFullScanSignatureVersion = value;
    }
    /**
     * Sets the lastQuickScanDateTime property value. Last quick scan datetime
     * @param value Value to set for the lastQuickScanDateTime property.
     */
    public void setLastQuickScanDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastQuickScanDateTime = value;
    }
    /**
     * Sets the lastQuickScanSignatureVersion property value. Last quick scan signature version
     * @param value Value to set for the lastQuickScanSignatureVersion property.
     */
    public void setLastQuickScanSignatureVersion(@jakarta.annotation.Nullable final String value) {
        this.lastQuickScanSignatureVersion = value;
    }
    /**
     * Sets the lastReportedDateTime property value. Last device health status reported time
     * @param value Value to set for the lastReportedDateTime property.
     */
    public void setLastReportedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastReportedDateTime = value;
    }
    /**
     * Sets the malwareProtectionEnabled property value. When TRUE indicates anti malware is enabled when FALSE indicates anti malware is not enabled.
     * @param value Value to set for the malwareProtectionEnabled property.
     */
    public void setMalwareProtectionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.malwareProtectionEnabled = value;
    }
    /**
     * Sets the networkInspectionSystemEnabled property value. When TRUE indicates network inspection system enabled, when FALSE indicates network inspection system is not enabled. Defaults to setting on client device.
     * @param value Value to set for the networkInspectionSystemEnabled property.
     */
    public void setNetworkInspectionSystemEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.networkInspectionSystemEnabled = value;
    }
    /**
     * Sets the productStatus property value. Product Status of Windows Defender Antivirus. Possible values are: noStatus, serviceNotRunning, serviceStartedWithoutMalwareProtection, pendingFullScanDueToThreatAction, pendingRebootDueToThreatAction, pendingManualStepsDueToThreatAction, avSignaturesOutOfDate, asSignaturesOutOfDate, noQuickScanHappenedForSpecifiedPeriod, noFullScanHappenedForSpecifiedPeriod, systemInitiatedScanInProgress, systemInitiatedCleanInProgress, samplesPendingSubmission, productRunningInEvaluationMode, productRunningInNonGenuineMode, productExpired, offlineScanRequired, serviceShutdownAsPartOfSystemShutdown, threatRemediationFailedCritically, threatRemediationFailedNonCritically, noStatusFlagsSet, platformOutOfDate, platformUpdateInProgress, platformAboutToBeOutdated, signatureOrPlatformEndOfLifeIsPastOrIsImpending, windowsSModeSignaturesInUseOnNonWin10SInstall. Possible values are: noStatus, serviceNotRunning, serviceStartedWithoutMalwareProtection, pendingFullScanDueToThreatAction, pendingRebootDueToThreatAction, pendingManualStepsDueToThreatAction, avSignaturesOutOfDate, asSignaturesOutOfDate, noQuickScanHappenedForSpecifiedPeriod, noFullScanHappenedForSpecifiedPeriod, systemInitiatedScanInProgress, systemInitiatedCleanInProgress, samplesPendingSubmission, productRunningInEvaluationMode, productRunningInNonGenuineMode, productExpired, offlineScanRequired, serviceShutdownAsPartOfSystemShutdown, threatRemediationFailedCritically, threatRemediationFailedNonCritically, noStatusFlagsSet, platformOutOfDate, platformUpdateInProgress, platformAboutToBeOutdated, signatureOrPlatformEndOfLifeIsPastOrIsImpending, windowsSModeSignaturesInUseOnNonWin10SInstall.
     * @param value Value to set for the productStatus property.
     */
    public void setProductStatus(@jakarta.annotation.Nullable final EnumSet<WindowsDefenderProductStatus> value) {
        this.productStatus = value;
    }
    /**
     * Sets the quickScanOverdue property value. When TRUE indicates quick scan is overdue, when FALSE indicates quick scan is not overdue. Defaults to setting on client device.
     * @param value Value to set for the quickScanOverdue property.
     */
    public void setQuickScanOverdue(@jakarta.annotation.Nullable final Boolean value) {
        this.quickScanOverdue = value;
    }
    /**
     * Sets the realTimeProtectionEnabled property value. When TRUE indicates real time protection is enabled, when FALSE indicates real time protection is not enabled. Defaults to setting on client device.
     * @param value Value to set for the realTimeProtectionEnabled property.
     */
    public void setRealTimeProtectionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.realTimeProtectionEnabled = value;
    }
    /**
     * Sets the rebootRequired property value. When TRUE indicates reboot is required, when FALSE indicates when TRUE indicates reboot is not required. Defaults to setting on client device.
     * @param value Value to set for the rebootRequired property.
     */
    public void setRebootRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.rebootRequired = value;
    }
    /**
     * Sets the signatureUpdateOverdue property value. When TRUE indicates signature is out of date, when FALSE indicates signature is not out of date. Defaults to setting on client device.
     * @param value Value to set for the signatureUpdateOverdue property.
     */
    public void setSignatureUpdateOverdue(@jakarta.annotation.Nullable final Boolean value) {
        this.signatureUpdateOverdue = value;
    }
    /**
     * Sets the signatureVersion property value. Current malware definitions version
     * @param value Value to set for the signatureVersion property.
     */
    public void setSignatureVersion(@jakarta.annotation.Nullable final String value) {
        this.signatureVersion = value;
    }
    /**
     * Sets the tamperProtectionEnabled property value. When TRUE indicates the Windows Defender tamper protection feature is enabled, when FALSE indicates the Windows Defender tamper protection feature is not enabled. Defaults to setting on client device.
     * @param value Value to set for the tamperProtectionEnabled property.
     */
    public void setTamperProtectionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.tamperProtectionEnabled = value;
    }
}
