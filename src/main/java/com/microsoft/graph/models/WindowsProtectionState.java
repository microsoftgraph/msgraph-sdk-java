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
     * Instantiates a new WindowsProtectionState and sets the default values.
     */
    public WindowsProtectionState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsProtectionState
     */
    @jakarta.annotation.Nonnull
    public static WindowsProtectionState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsProtectionState();
    }
    /**
     * Gets the antiMalwareVersion property value. Current anti malware version
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAntiMalwareVersion() {
        return this.backingStore.get("antiMalwareVersion");
    }
    /**
     * Gets the detectedMalwareState property value. Device malware list
     * @return a java.util.List<WindowsDeviceMalwareState>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsDeviceMalwareState> getDetectedMalwareState() {
        return this.backingStore.get("detectedMalwareState");
    }
    /**
     * Gets the deviceState property value. Indicates device's health state. Possible values are: clean, fullScanPending, rebootPending, manualStepsPending, offlineScanPending, critical. Possible values are: clean, fullScanPending, rebootPending, manualStepsPending, offlineScanPending, critical.
     * @return a EnumSet<WindowsDeviceHealthState>
     */
    @jakarta.annotation.Nullable
    public EnumSet<WindowsDeviceHealthState> getDeviceState() {
        return this.backingStore.get("deviceState");
    }
    /**
     * Gets the engineVersion property value. Current endpoint protection engine's version
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEngineVersion() {
        return this.backingStore.get("engineVersion");
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
        deserializerMap.put("deviceState", (n) -> { this.setDeviceState(n.getEnumSetValue(WindowsDeviceHealthState::forValue)); });
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
        deserializerMap.put("productStatus", (n) -> { this.setProductStatus(n.getEnumSetValue(WindowsDefenderProductStatus::forValue)); });
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
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFullScanOverdue() {
        return this.backingStore.get("fullScanOverdue");
    }
    /**
     * Gets the fullScanRequired property value. When TRUE indicates full scan is required, when FALSE indicates full scan is not required. Defaults to setting on client device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFullScanRequired() {
        return this.backingStore.get("fullScanRequired");
    }
    /**
     * Gets the isVirtualMachine property value. When TRUE indicates the device is a virtual machine, when FALSE indicates the device is not a virtual machine. Defaults to setting on client device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsVirtualMachine() {
        return this.backingStore.get("isVirtualMachine");
    }
    /**
     * Gets the lastFullScanDateTime property value. Last quick scan datetime
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastFullScanDateTime() {
        return this.backingStore.get("lastFullScanDateTime");
    }
    /**
     * Gets the lastFullScanSignatureVersion property value. Last full scan signature version
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastFullScanSignatureVersion() {
        return this.backingStore.get("lastFullScanSignatureVersion");
    }
    /**
     * Gets the lastQuickScanDateTime property value. Last quick scan datetime
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastQuickScanDateTime() {
        return this.backingStore.get("lastQuickScanDateTime");
    }
    /**
     * Gets the lastQuickScanSignatureVersion property value. Last quick scan signature version
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastQuickScanSignatureVersion() {
        return this.backingStore.get("lastQuickScanSignatureVersion");
    }
    /**
     * Gets the lastReportedDateTime property value. Last device health status reported time
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastReportedDateTime() {
        return this.backingStore.get("lastReportedDateTime");
    }
    /**
     * Gets the malwareProtectionEnabled property value. When TRUE indicates anti malware is enabled when FALSE indicates anti malware is not enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMalwareProtectionEnabled() {
        return this.backingStore.get("malwareProtectionEnabled");
    }
    /**
     * Gets the networkInspectionSystemEnabled property value. When TRUE indicates network inspection system enabled, when FALSE indicates network inspection system is not enabled. Defaults to setting on client device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getNetworkInspectionSystemEnabled() {
        return this.backingStore.get("networkInspectionSystemEnabled");
    }
    /**
     * Gets the productStatus property value. Product Status of Windows Defender Antivirus. Possible values are: noStatus, serviceNotRunning, serviceStartedWithoutMalwareProtection, pendingFullScanDueToThreatAction, pendingRebootDueToThreatAction, pendingManualStepsDueToThreatAction, avSignaturesOutOfDate, asSignaturesOutOfDate, noQuickScanHappenedForSpecifiedPeriod, noFullScanHappenedForSpecifiedPeriod, systemInitiatedScanInProgress, systemInitiatedCleanInProgress, samplesPendingSubmission, productRunningInEvaluationMode, productRunningInNonGenuineMode, productExpired, offlineScanRequired, serviceShutdownAsPartOfSystemShutdown, threatRemediationFailedCritically, threatRemediationFailedNonCritically, noStatusFlagsSet, platformOutOfDate, platformUpdateInProgress, platformAboutToBeOutdated, signatureOrPlatformEndOfLifeIsPastOrIsImpending, windowsSModeSignaturesInUseOnNonWin10SInstall. Possible values are: noStatus, serviceNotRunning, serviceStartedWithoutMalwareProtection, pendingFullScanDueToThreatAction, pendingRebootDueToThreatAction, pendingManualStepsDueToThreatAction, avSignaturesOutOfDate, asSignaturesOutOfDate, noQuickScanHappenedForSpecifiedPeriod, noFullScanHappenedForSpecifiedPeriod, systemInitiatedScanInProgress, systemInitiatedCleanInProgress, samplesPendingSubmission, productRunningInEvaluationMode, productRunningInNonGenuineMode, productExpired, offlineScanRequired, serviceShutdownAsPartOfSystemShutdown, threatRemediationFailedCritically, threatRemediationFailedNonCritically, noStatusFlagsSet, platformOutOfDate, platformUpdateInProgress, platformAboutToBeOutdated, signatureOrPlatformEndOfLifeIsPastOrIsImpending, windowsSModeSignaturesInUseOnNonWin10SInstall.
     * @return a EnumSet<WindowsDefenderProductStatus>
     */
    @jakarta.annotation.Nullable
    public EnumSet<WindowsDefenderProductStatus> getProductStatus() {
        return this.backingStore.get("productStatus");
    }
    /**
     * Gets the quickScanOverdue property value. When TRUE indicates quick scan is overdue, when FALSE indicates quick scan is not overdue. Defaults to setting on client device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getQuickScanOverdue() {
        return this.backingStore.get("quickScanOverdue");
    }
    /**
     * Gets the realTimeProtectionEnabled property value. When TRUE indicates real time protection is enabled, when FALSE indicates real time protection is not enabled. Defaults to setting on client device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRealTimeProtectionEnabled() {
        return this.backingStore.get("realTimeProtectionEnabled");
    }
    /**
     * Gets the rebootRequired property value. When TRUE indicates reboot is required, when FALSE indicates when TRUE indicates reboot is not required. Defaults to setting on client device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRebootRequired() {
        return this.backingStore.get("rebootRequired");
    }
    /**
     * Gets the signatureUpdateOverdue property value. When TRUE indicates signature is out of date, when FALSE indicates signature is not out of date. Defaults to setting on client device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSignatureUpdateOverdue() {
        return this.backingStore.get("signatureUpdateOverdue");
    }
    /**
     * Gets the signatureVersion property value. Current malware definitions version
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSignatureVersion() {
        return this.backingStore.get("signatureVersion");
    }
    /**
     * Gets the tamperProtectionEnabled property value. When TRUE indicates the Windows Defender tamper protection feature is enabled, when FALSE indicates the Windows Defender tamper protection feature is not enabled. Defaults to setting on client device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTamperProtectionEnabled() {
        return this.backingStore.get("tamperProtectionEnabled");
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
        this.backingStore.set("antiMalwareVersion", value);
    }
    /**
     * Sets the detectedMalwareState property value. Device malware list
     * @param value Value to set for the detectedMalwareState property.
     */
    public void setDetectedMalwareState(@jakarta.annotation.Nullable final java.util.List<WindowsDeviceMalwareState> value) {
        this.backingStore.set("detectedMalwareState", value);
    }
    /**
     * Sets the deviceState property value. Indicates device's health state. Possible values are: clean, fullScanPending, rebootPending, manualStepsPending, offlineScanPending, critical. Possible values are: clean, fullScanPending, rebootPending, manualStepsPending, offlineScanPending, critical.
     * @param value Value to set for the deviceState property.
     */
    public void setDeviceState(@jakarta.annotation.Nullable final EnumSet<WindowsDeviceHealthState> value) {
        this.backingStore.set("deviceState", value);
    }
    /**
     * Sets the engineVersion property value. Current endpoint protection engine's version
     * @param value Value to set for the engineVersion property.
     */
    public void setEngineVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("engineVersion", value);
    }
    /**
     * Sets the fullScanOverdue property value. When TRUE indicates full scan is overdue, when FALSE indicates full scan is not overdue. Defaults to setting on client device.
     * @param value Value to set for the fullScanOverdue property.
     */
    public void setFullScanOverdue(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("fullScanOverdue", value);
    }
    /**
     * Sets the fullScanRequired property value. When TRUE indicates full scan is required, when FALSE indicates full scan is not required. Defaults to setting on client device.
     * @param value Value to set for the fullScanRequired property.
     */
    public void setFullScanRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("fullScanRequired", value);
    }
    /**
     * Sets the isVirtualMachine property value. When TRUE indicates the device is a virtual machine, when FALSE indicates the device is not a virtual machine. Defaults to setting on client device.
     * @param value Value to set for the isVirtualMachine property.
     */
    public void setIsVirtualMachine(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isVirtualMachine", value);
    }
    /**
     * Sets the lastFullScanDateTime property value. Last quick scan datetime
     * @param value Value to set for the lastFullScanDateTime property.
     */
    public void setLastFullScanDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastFullScanDateTime", value);
    }
    /**
     * Sets the lastFullScanSignatureVersion property value. Last full scan signature version
     * @param value Value to set for the lastFullScanSignatureVersion property.
     */
    public void setLastFullScanSignatureVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastFullScanSignatureVersion", value);
    }
    /**
     * Sets the lastQuickScanDateTime property value. Last quick scan datetime
     * @param value Value to set for the lastQuickScanDateTime property.
     */
    public void setLastQuickScanDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastQuickScanDateTime", value);
    }
    /**
     * Sets the lastQuickScanSignatureVersion property value. Last quick scan signature version
     * @param value Value to set for the lastQuickScanSignatureVersion property.
     */
    public void setLastQuickScanSignatureVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastQuickScanSignatureVersion", value);
    }
    /**
     * Sets the lastReportedDateTime property value. Last device health status reported time
     * @param value Value to set for the lastReportedDateTime property.
     */
    public void setLastReportedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastReportedDateTime", value);
    }
    /**
     * Sets the malwareProtectionEnabled property value. When TRUE indicates anti malware is enabled when FALSE indicates anti malware is not enabled.
     * @param value Value to set for the malwareProtectionEnabled property.
     */
    public void setMalwareProtectionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("malwareProtectionEnabled", value);
    }
    /**
     * Sets the networkInspectionSystemEnabled property value. When TRUE indicates network inspection system enabled, when FALSE indicates network inspection system is not enabled. Defaults to setting on client device.
     * @param value Value to set for the networkInspectionSystemEnabled property.
     */
    public void setNetworkInspectionSystemEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("networkInspectionSystemEnabled", value);
    }
    /**
     * Sets the productStatus property value. Product Status of Windows Defender Antivirus. Possible values are: noStatus, serviceNotRunning, serviceStartedWithoutMalwareProtection, pendingFullScanDueToThreatAction, pendingRebootDueToThreatAction, pendingManualStepsDueToThreatAction, avSignaturesOutOfDate, asSignaturesOutOfDate, noQuickScanHappenedForSpecifiedPeriod, noFullScanHappenedForSpecifiedPeriod, systemInitiatedScanInProgress, systemInitiatedCleanInProgress, samplesPendingSubmission, productRunningInEvaluationMode, productRunningInNonGenuineMode, productExpired, offlineScanRequired, serviceShutdownAsPartOfSystemShutdown, threatRemediationFailedCritically, threatRemediationFailedNonCritically, noStatusFlagsSet, platformOutOfDate, platformUpdateInProgress, platformAboutToBeOutdated, signatureOrPlatformEndOfLifeIsPastOrIsImpending, windowsSModeSignaturesInUseOnNonWin10SInstall. Possible values are: noStatus, serviceNotRunning, serviceStartedWithoutMalwareProtection, pendingFullScanDueToThreatAction, pendingRebootDueToThreatAction, pendingManualStepsDueToThreatAction, avSignaturesOutOfDate, asSignaturesOutOfDate, noQuickScanHappenedForSpecifiedPeriod, noFullScanHappenedForSpecifiedPeriod, systemInitiatedScanInProgress, systemInitiatedCleanInProgress, samplesPendingSubmission, productRunningInEvaluationMode, productRunningInNonGenuineMode, productExpired, offlineScanRequired, serviceShutdownAsPartOfSystemShutdown, threatRemediationFailedCritically, threatRemediationFailedNonCritically, noStatusFlagsSet, platformOutOfDate, platformUpdateInProgress, platformAboutToBeOutdated, signatureOrPlatformEndOfLifeIsPastOrIsImpending, windowsSModeSignaturesInUseOnNonWin10SInstall.
     * @param value Value to set for the productStatus property.
     */
    public void setProductStatus(@jakarta.annotation.Nullable final EnumSet<WindowsDefenderProductStatus> value) {
        this.backingStore.set("productStatus", value);
    }
    /**
     * Sets the quickScanOverdue property value. When TRUE indicates quick scan is overdue, when FALSE indicates quick scan is not overdue. Defaults to setting on client device.
     * @param value Value to set for the quickScanOverdue property.
     */
    public void setQuickScanOverdue(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("quickScanOverdue", value);
    }
    /**
     * Sets the realTimeProtectionEnabled property value. When TRUE indicates real time protection is enabled, when FALSE indicates real time protection is not enabled. Defaults to setting on client device.
     * @param value Value to set for the realTimeProtectionEnabled property.
     */
    public void setRealTimeProtectionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("realTimeProtectionEnabled", value);
    }
    /**
     * Sets the rebootRequired property value. When TRUE indicates reboot is required, when FALSE indicates when TRUE indicates reboot is not required. Defaults to setting on client device.
     * @param value Value to set for the rebootRequired property.
     */
    public void setRebootRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("rebootRequired", value);
    }
    /**
     * Sets the signatureUpdateOverdue property value. When TRUE indicates signature is out of date, when FALSE indicates signature is not out of date. Defaults to setting on client device.
     * @param value Value to set for the signatureUpdateOverdue property.
     */
    public void setSignatureUpdateOverdue(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("signatureUpdateOverdue", value);
    }
    /**
     * Sets the signatureVersion property value. Current malware definitions version
     * @param value Value to set for the signatureVersion property.
     */
    public void setSignatureVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("signatureVersion", value);
    }
    /**
     * Sets the tamperProtectionEnabled property value. When TRUE indicates the Windows Defender tamper protection feature is enabled, when FALSE indicates the Windows Defender tamper protection feature is not enabled. Defaults to setting on client device.
     * @param value Value to set for the tamperProtectionEnabled property.
     */
    public void setTamperProtectionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("tamperProtectionEnabled", value);
    }
}
