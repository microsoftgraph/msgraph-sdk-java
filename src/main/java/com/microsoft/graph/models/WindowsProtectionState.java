package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
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
     * Computer's state (like clean or pending full scan or pending reboot etc). Possible values are: clean, fullScanPending, rebootPending, manualStepsPending, offlineScanPending, critical.
     */
    private WindowsDeviceHealthState deviceState;
    /**
     * Current endpoint protection engine's version
     */
    private String engineVersion;
    /**
     * Full scan overdue or not?
     */
    private Boolean fullScanOverdue;
    /**
     * Full scan required or not?
     */
    private Boolean fullScanRequired;
    /**
     * Indicates whether the device is a virtual machine.
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
     * Anti malware is enabled or not
     */
    private Boolean malwareProtectionEnabled;
    /**
     * Network inspection system enabled or not?
     */
    private Boolean networkInspectionSystemEnabled;
    /**
     * Product Status of Windows Defender Antivirus. Possible values are: noStatus, serviceNotRunning, serviceStartedWithoutMalwareProtection, pendingFullScanDueToThreatAction, pendingRebootDueToThreatAction, pendingManualStepsDueToThreatAction, avSignaturesOutOfDate, asSignaturesOutOfDate, noQuickScanHappenedForSpecifiedPeriod, noFullScanHappenedForSpecifiedPeriod, systemInitiatedScanInProgress, systemInitiatedCleanInProgress, samplesPendingSubmission, productRunningInEvaluationMode, productRunningInNonGenuineMode, productExpired, offlineScanRequired, serviceShutdownAsPartOfSystemShutdown, threatRemediationFailedCritically, threatRemediationFailedNonCritically, noStatusFlagsSet, platformOutOfDate, platformUpdateInProgress, platformAboutToBeOutdated, signatureOrPlatformEndOfLifeIsPastOrIsImpending, windowsSModeSignaturesInUseOnNonWin10SInstall.
     */
    private WindowsDefenderProductStatus productStatus;
    /**
     * Quick scan overdue or not?
     */
    private Boolean quickScanOverdue;
    /**
     * Real time protection is enabled or not?
     */
    private Boolean realTimeProtectionEnabled;
    /**
     * Reboot required or not?
     */
    private Boolean rebootRequired;
    /**
     * Signature out of date or not?
     */
    private Boolean signatureUpdateOverdue;
    /**
     * Current malware definitions version
     */
    private String signatureVersion;
    /**
     * Indicates whether the Windows Defender tamper protection feature is enabled.
     */
    private Boolean tamperProtectionEnabled;
    /**
     * Instantiates a new windowsProtectionState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsProtectionState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsProtectionState
     */
    @javax.annotation.Nonnull
    public static WindowsProtectionState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsProtectionState();
    }
    /**
     * Gets the antiMalwareVersion property value. Current anti malware version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAntiMalwareVersion() {
        return this.antiMalwareVersion;
    }
    /**
     * Gets the detectedMalwareState property value. Device malware list
     * @return a windowsDeviceMalwareState
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsDeviceMalwareState> getDetectedMalwareState() {
        return this.detectedMalwareState;
    }
    /**
     * Gets the deviceState property value. Computer's state (like clean or pending full scan or pending reboot etc). Possible values are: clean, fullScanPending, rebootPending, manualStepsPending, offlineScanPending, critical.
     * @return a windowsDeviceHealthState
     */
    @javax.annotation.Nullable
    public WindowsDeviceHealthState getDeviceState() {
        return this.deviceState;
    }
    /**
     * Gets the engineVersion property value. Current endpoint protection engine's version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEngineVersion() {
        return this.engineVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("antiMalwareVersion", (n) -> { this.setAntiMalwareVersion(n.getStringValue()); });
        deserializerMap.put("detectedMalwareState", (n) -> { this.setDetectedMalwareState(n.getCollectionOfObjectValues(WindowsDeviceMalwareState::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceState", (n) -> { this.setDeviceState(n.getEnumValue(WindowsDeviceHealthState.class)); });
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
        deserializerMap.put("productStatus", (n) -> { this.setProductStatus(n.getEnumValue(WindowsDefenderProductStatus.class)); });
        deserializerMap.put("quickScanOverdue", (n) -> { this.setQuickScanOverdue(n.getBooleanValue()); });
        deserializerMap.put("realTimeProtectionEnabled", (n) -> { this.setRealTimeProtectionEnabled(n.getBooleanValue()); });
        deserializerMap.put("rebootRequired", (n) -> { this.setRebootRequired(n.getBooleanValue()); });
        deserializerMap.put("signatureUpdateOverdue", (n) -> { this.setSignatureUpdateOverdue(n.getBooleanValue()); });
        deserializerMap.put("signatureVersion", (n) -> { this.setSignatureVersion(n.getStringValue()); });
        deserializerMap.put("tamperProtectionEnabled", (n) -> { this.setTamperProtectionEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fullScanOverdue property value. Full scan overdue or not?
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFullScanOverdue() {
        return this.fullScanOverdue;
    }
    /**
     * Gets the fullScanRequired property value. Full scan required or not?
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFullScanRequired() {
        return this.fullScanRequired;
    }
    /**
     * Gets the isVirtualMachine property value. Indicates whether the device is a virtual machine.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsVirtualMachine() {
        return this.isVirtualMachine;
    }
    /**
     * Gets the lastFullScanDateTime property value. Last quick scan datetime
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastFullScanDateTime() {
        return this.lastFullScanDateTime;
    }
    /**
     * Gets the lastFullScanSignatureVersion property value. Last full scan signature version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastFullScanSignatureVersion() {
        return this.lastFullScanSignatureVersion;
    }
    /**
     * Gets the lastQuickScanDateTime property value. Last quick scan datetime
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastQuickScanDateTime() {
        return this.lastQuickScanDateTime;
    }
    /**
     * Gets the lastQuickScanSignatureVersion property value. Last quick scan signature version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastQuickScanSignatureVersion() {
        return this.lastQuickScanSignatureVersion;
    }
    /**
     * Gets the lastReportedDateTime property value. Last device health status reported time
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastReportedDateTime() {
        return this.lastReportedDateTime;
    }
    /**
     * Gets the malwareProtectionEnabled property value. Anti malware is enabled or not
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMalwareProtectionEnabled() {
        return this.malwareProtectionEnabled;
    }
    /**
     * Gets the networkInspectionSystemEnabled property value. Network inspection system enabled or not?
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNetworkInspectionSystemEnabled() {
        return this.networkInspectionSystemEnabled;
    }
    /**
     * Gets the productStatus property value. Product Status of Windows Defender Antivirus. Possible values are: noStatus, serviceNotRunning, serviceStartedWithoutMalwareProtection, pendingFullScanDueToThreatAction, pendingRebootDueToThreatAction, pendingManualStepsDueToThreatAction, avSignaturesOutOfDate, asSignaturesOutOfDate, noQuickScanHappenedForSpecifiedPeriod, noFullScanHappenedForSpecifiedPeriod, systemInitiatedScanInProgress, systemInitiatedCleanInProgress, samplesPendingSubmission, productRunningInEvaluationMode, productRunningInNonGenuineMode, productExpired, offlineScanRequired, serviceShutdownAsPartOfSystemShutdown, threatRemediationFailedCritically, threatRemediationFailedNonCritically, noStatusFlagsSet, platformOutOfDate, platformUpdateInProgress, platformAboutToBeOutdated, signatureOrPlatformEndOfLifeIsPastOrIsImpending, windowsSModeSignaturesInUseOnNonWin10SInstall.
     * @return a windowsDefenderProductStatus
     */
    @javax.annotation.Nullable
    public WindowsDefenderProductStatus getProductStatus() {
        return this.productStatus;
    }
    /**
     * Gets the quickScanOverdue property value. Quick scan overdue or not?
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getQuickScanOverdue() {
        return this.quickScanOverdue;
    }
    /**
     * Gets the realTimeProtectionEnabled property value. Real time protection is enabled or not?
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRealTimeProtectionEnabled() {
        return this.realTimeProtectionEnabled;
    }
    /**
     * Gets the rebootRequired property value. Reboot required or not?
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRebootRequired() {
        return this.rebootRequired;
    }
    /**
     * Gets the signatureUpdateOverdue property value. Signature out of date or not?
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSignatureUpdateOverdue() {
        return this.signatureUpdateOverdue;
    }
    /**
     * Gets the signatureVersion property value. Current malware definitions version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSignatureVersion() {
        return this.signatureVersion;
    }
    /**
     * Gets the tamperProtectionEnabled property value. Indicates whether the Windows Defender tamper protection feature is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTamperProtectionEnabled() {
        return this.tamperProtectionEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("antiMalwareVersion", this.getAntiMalwareVersion());
        writer.writeCollectionOfObjectValues("detectedMalwareState", this.getDetectedMalwareState());
        writer.writeEnumValue("deviceState", this.getDeviceState());
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
        writer.writeEnumValue("productStatus", this.getProductStatus());
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAntiMalwareVersion(@javax.annotation.Nullable final String value) {
        this.antiMalwareVersion = value;
    }
    /**
     * Sets the detectedMalwareState property value. Device malware list
     * @param value Value to set for the detectedMalwareState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectedMalwareState(@javax.annotation.Nullable final java.util.List<WindowsDeviceMalwareState> value) {
        this.detectedMalwareState = value;
    }
    /**
     * Sets the deviceState property value. Computer's state (like clean or pending full scan or pending reboot etc). Possible values are: clean, fullScanPending, rebootPending, manualStepsPending, offlineScanPending, critical.
     * @param value Value to set for the deviceState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceState(@javax.annotation.Nullable final WindowsDeviceHealthState value) {
        this.deviceState = value;
    }
    /**
     * Sets the engineVersion property value. Current endpoint protection engine's version
     * @param value Value to set for the engineVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEngineVersion(@javax.annotation.Nullable final String value) {
        this.engineVersion = value;
    }
    /**
     * Sets the fullScanOverdue property value. Full scan overdue or not?
     * @param value Value to set for the fullScanOverdue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFullScanOverdue(@javax.annotation.Nullable final Boolean value) {
        this.fullScanOverdue = value;
    }
    /**
     * Sets the fullScanRequired property value. Full scan required or not?
     * @param value Value to set for the fullScanRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFullScanRequired(@javax.annotation.Nullable final Boolean value) {
        this.fullScanRequired = value;
    }
    /**
     * Sets the isVirtualMachine property value. Indicates whether the device is a virtual machine.
     * @param value Value to set for the isVirtualMachine property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsVirtualMachine(@javax.annotation.Nullable final Boolean value) {
        this.isVirtualMachine = value;
    }
    /**
     * Sets the lastFullScanDateTime property value. Last quick scan datetime
     * @param value Value to set for the lastFullScanDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastFullScanDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastFullScanDateTime = value;
    }
    /**
     * Sets the lastFullScanSignatureVersion property value. Last full scan signature version
     * @param value Value to set for the lastFullScanSignatureVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastFullScanSignatureVersion(@javax.annotation.Nullable final String value) {
        this.lastFullScanSignatureVersion = value;
    }
    /**
     * Sets the lastQuickScanDateTime property value. Last quick scan datetime
     * @param value Value to set for the lastQuickScanDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastQuickScanDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastQuickScanDateTime = value;
    }
    /**
     * Sets the lastQuickScanSignatureVersion property value. Last quick scan signature version
     * @param value Value to set for the lastQuickScanSignatureVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastQuickScanSignatureVersion(@javax.annotation.Nullable final String value) {
        this.lastQuickScanSignatureVersion = value;
    }
    /**
     * Sets the lastReportedDateTime property value. Last device health status reported time
     * @param value Value to set for the lastReportedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastReportedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastReportedDateTime = value;
    }
    /**
     * Sets the malwareProtectionEnabled property value. Anti malware is enabled or not
     * @param value Value to set for the malwareProtectionEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMalwareProtectionEnabled(@javax.annotation.Nullable final Boolean value) {
        this.malwareProtectionEnabled = value;
    }
    /**
     * Sets the networkInspectionSystemEnabled property value. Network inspection system enabled or not?
     * @param value Value to set for the networkInspectionSystemEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkInspectionSystemEnabled(@javax.annotation.Nullable final Boolean value) {
        this.networkInspectionSystemEnabled = value;
    }
    /**
     * Sets the productStatus property value. Product Status of Windows Defender Antivirus. Possible values are: noStatus, serviceNotRunning, serviceStartedWithoutMalwareProtection, pendingFullScanDueToThreatAction, pendingRebootDueToThreatAction, pendingManualStepsDueToThreatAction, avSignaturesOutOfDate, asSignaturesOutOfDate, noQuickScanHappenedForSpecifiedPeriod, noFullScanHappenedForSpecifiedPeriod, systemInitiatedScanInProgress, systemInitiatedCleanInProgress, samplesPendingSubmission, productRunningInEvaluationMode, productRunningInNonGenuineMode, productExpired, offlineScanRequired, serviceShutdownAsPartOfSystemShutdown, threatRemediationFailedCritically, threatRemediationFailedNonCritically, noStatusFlagsSet, platformOutOfDate, platformUpdateInProgress, platformAboutToBeOutdated, signatureOrPlatformEndOfLifeIsPastOrIsImpending, windowsSModeSignaturesInUseOnNonWin10SInstall.
     * @param value Value to set for the productStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductStatus(@javax.annotation.Nullable final WindowsDefenderProductStatus value) {
        this.productStatus = value;
    }
    /**
     * Sets the quickScanOverdue property value. Quick scan overdue or not?
     * @param value Value to set for the quickScanOverdue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuickScanOverdue(@javax.annotation.Nullable final Boolean value) {
        this.quickScanOverdue = value;
    }
    /**
     * Sets the realTimeProtectionEnabled property value. Real time protection is enabled or not?
     * @param value Value to set for the realTimeProtectionEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRealTimeProtectionEnabled(@javax.annotation.Nullable final Boolean value) {
        this.realTimeProtectionEnabled = value;
    }
    /**
     * Sets the rebootRequired property value. Reboot required or not?
     * @param value Value to set for the rebootRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRebootRequired(@javax.annotation.Nullable final Boolean value) {
        this.rebootRequired = value;
    }
    /**
     * Sets the signatureUpdateOverdue property value. Signature out of date or not?
     * @param value Value to set for the signatureUpdateOverdue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSignatureUpdateOverdue(@javax.annotation.Nullable final Boolean value) {
        this.signatureUpdateOverdue = value;
    }
    /**
     * Sets the signatureVersion property value. Current malware definitions version
     * @param value Value to set for the signatureVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSignatureVersion(@javax.annotation.Nullable final String value) {
        this.signatureVersion = value;
    }
    /**
     * Sets the tamperProtectionEnabled property value. Indicates whether the Windows Defender tamper protection feature is enabled.
     * @param value Value to set for the tamperProtectionEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTamperProtectionEnabled(@javax.annotation.Nullable final Boolean value) {
        this.tamperProtectionEnabled = value;
    }
}
