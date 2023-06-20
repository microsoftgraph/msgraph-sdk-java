package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity which represents a connection to Mobile Threat Defense partner.
 */
public class MobileThreatDefenseConnector extends Entity implements Parsable {
    /** When TRUE, indicates the Mobile Threat Defense partner may collect metadata about installed applications from Intune for IOS devices. When FALSE, indicates the Mobile Threat Defense partner may not collect metadata about installed applications from Intune for IOS devices. Default value is FALSE. */
    private Boolean allowPartnerToCollectIOSApplicationMetadata;
    /** When TRUE, indicates the Mobile Threat Defense partner may collect metadata about personally installed applications from Intune for IOS devices. When FALSE, indicates the Mobile Threat Defense partner may not collect metadata about personally installed applications from Intune for IOS devices. Default value is FALSE. */
    private Boolean allowPartnerToCollectIOSPersonalApplicationMetadata;
    /** For Android, set whether Intune must receive data from the Mobile Threat Defense partner prior to marking a device compliant */
    private Boolean androidDeviceBlockedOnMissingPartnerData;
    /** For Android, set whether data from the Mobile Threat Defense partner should be used during compliance evaluations */
    private Boolean androidEnabled;
    /** When TRUE, inidicates that data from the Mobile Threat Defense partner can be used during Mobile Application Management (MAM) evaluations for Android devices. When FALSE, inidicates that data from the Mobile Threat Defense partner should not be used during Mobile Application Management (MAM) evaluations for Android devices. Only one partner per platform may be enabled for Mobile Application Management (MAM) evaluation. Default value is FALSE. */
    private Boolean androidMobileApplicationManagementEnabled;
    /** For IOS, set whether Intune must receive data from the Mobile Threat Defense partner prior to marking a device compliant */
    private Boolean iosDeviceBlockedOnMissingPartnerData;
    /** For IOS, get or set whether data from the Mobile Threat Defense partner should be used during compliance evaluations */
    private Boolean iosEnabled;
    /** When TRUE, inidicates that data from the Mobile Threat Defense partner can be used during Mobile Application Management (MAM) evaluations for IOS devices. When FALSE, inidicates that data from the Mobile Threat Defense partner should not be used during Mobile Application Management (MAM) evaluations for IOS devices. Only one partner per platform may be enabled for Mobile Application Management (MAM) evaluation. Default value is FALSE. */
    private Boolean iosMobileApplicationManagementEnabled;
    /** DateTime of last Heartbeat recieved from the Mobile Threat Defense partner */
    private OffsetDateTime lastHeartbeatDateTime;
    /** When TRUE, inidicates that configuration profile management via Microsoft Defender for Endpoint is enabled. When FALSE, inidicates that configuration profile management via Microsoft Defender for Endpoint is disabled. Default value is FALSE. */
    private Boolean microsoftDefenderForEndpointAttachEnabled;
    /** Partner state of this tenant. */
    private MobileThreatPartnerTenantState partnerState;
    /** Get or Set days the per tenant tolerance to unresponsiveness for this partner integration */
    private Integer partnerUnresponsivenessThresholdInDays;
    /** Get or set whether to block devices on the enabled platforms that do not meet the minimum version requirements of the Mobile Threat Defense partner */
    private Boolean partnerUnsupportedOsVersionBlocked;
    /** When TRUE, inidicates that Intune must receive data from the Mobile Threat Defense partner prior to marking a device compliant for Windows. When FALSE, inidicates that Intune may make a device compliant without receiving data from the Mobile Threat Defense partner for Windows. Default value is FALSE. */
    private Boolean windowsDeviceBlockedOnMissingPartnerData;
    /** When TRUE, inidicates that data from the Mobile Threat Defense partner can be used during compliance evaluations for Windows. When FALSE, inidicates that data from the Mobile Threat Defense partner should not be used during compliance evaluations for Windows. Default value is FALSE. */
    private Boolean windowsEnabled;
    /**
     * Instantiates a new mobileThreatDefenseConnector and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MobileThreatDefenseConnector() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileThreatDefenseConnector
     */
    @javax.annotation.Nonnull
    public static MobileThreatDefenseConnector createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileThreatDefenseConnector();
    }
    /**
     * Gets the allowPartnerToCollectIOSApplicationMetadata property value. When TRUE, indicates the Mobile Threat Defense partner may collect metadata about installed applications from Intune for IOS devices. When FALSE, indicates the Mobile Threat Defense partner may not collect metadata about installed applications from Intune for IOS devices. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowPartnerToCollectIOSApplicationMetadata() {
        return this.allowPartnerToCollectIOSApplicationMetadata;
    }
    /**
     * Gets the allowPartnerToCollectIOSPersonalApplicationMetadata property value. When TRUE, indicates the Mobile Threat Defense partner may collect metadata about personally installed applications from Intune for IOS devices. When FALSE, indicates the Mobile Threat Defense partner may not collect metadata about personally installed applications from Intune for IOS devices. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowPartnerToCollectIOSPersonalApplicationMetadata() {
        return this.allowPartnerToCollectIOSPersonalApplicationMetadata;
    }
    /**
     * Gets the androidDeviceBlockedOnMissingPartnerData property value. For Android, set whether Intune must receive data from the Mobile Threat Defense partner prior to marking a device compliant
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAndroidDeviceBlockedOnMissingPartnerData() {
        return this.androidDeviceBlockedOnMissingPartnerData;
    }
    /**
     * Gets the androidEnabled property value. For Android, set whether data from the Mobile Threat Defense partner should be used during compliance evaluations
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAndroidEnabled() {
        return this.androidEnabled;
    }
    /**
     * Gets the androidMobileApplicationManagementEnabled property value. When TRUE, inidicates that data from the Mobile Threat Defense partner can be used during Mobile Application Management (MAM) evaluations for Android devices. When FALSE, inidicates that data from the Mobile Threat Defense partner should not be used during Mobile Application Management (MAM) evaluations for Android devices. Only one partner per platform may be enabled for Mobile Application Management (MAM) evaluation. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAndroidMobileApplicationManagementEnabled() {
        return this.androidMobileApplicationManagementEnabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowPartnerToCollectIOSApplicationMetadata", (n) -> { this.setAllowPartnerToCollectIOSApplicationMetadata(n.getBooleanValue()); });
        deserializerMap.put("allowPartnerToCollectIOSPersonalApplicationMetadata", (n) -> { this.setAllowPartnerToCollectIOSPersonalApplicationMetadata(n.getBooleanValue()); });
        deserializerMap.put("androidDeviceBlockedOnMissingPartnerData", (n) -> { this.setAndroidDeviceBlockedOnMissingPartnerData(n.getBooleanValue()); });
        deserializerMap.put("androidEnabled", (n) -> { this.setAndroidEnabled(n.getBooleanValue()); });
        deserializerMap.put("androidMobileApplicationManagementEnabled", (n) -> { this.setAndroidMobileApplicationManagementEnabled(n.getBooleanValue()); });
        deserializerMap.put("iosDeviceBlockedOnMissingPartnerData", (n) -> { this.setIosDeviceBlockedOnMissingPartnerData(n.getBooleanValue()); });
        deserializerMap.put("iosEnabled", (n) -> { this.setIosEnabled(n.getBooleanValue()); });
        deserializerMap.put("iosMobileApplicationManagementEnabled", (n) -> { this.setIosMobileApplicationManagementEnabled(n.getBooleanValue()); });
        deserializerMap.put("lastHeartbeatDateTime", (n) -> { this.setLastHeartbeatDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("microsoftDefenderForEndpointAttachEnabled", (n) -> { this.setMicrosoftDefenderForEndpointAttachEnabled(n.getBooleanValue()); });
        deserializerMap.put("partnerState", (n) -> { this.setPartnerState(n.getEnumValue(MobileThreatPartnerTenantState.class)); });
        deserializerMap.put("partnerUnresponsivenessThresholdInDays", (n) -> { this.setPartnerUnresponsivenessThresholdInDays(n.getIntegerValue()); });
        deserializerMap.put("partnerUnsupportedOsVersionBlocked", (n) -> { this.setPartnerUnsupportedOsVersionBlocked(n.getBooleanValue()); });
        deserializerMap.put("windowsDeviceBlockedOnMissingPartnerData", (n) -> { this.setWindowsDeviceBlockedOnMissingPartnerData(n.getBooleanValue()); });
        deserializerMap.put("windowsEnabled", (n) -> { this.setWindowsEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the iosDeviceBlockedOnMissingPartnerData property value. For IOS, set whether Intune must receive data from the Mobile Threat Defense partner prior to marking a device compliant
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIosDeviceBlockedOnMissingPartnerData() {
        return this.iosDeviceBlockedOnMissingPartnerData;
    }
    /**
     * Gets the iosEnabled property value. For IOS, get or set whether data from the Mobile Threat Defense partner should be used during compliance evaluations
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIosEnabled() {
        return this.iosEnabled;
    }
    /**
     * Gets the iosMobileApplicationManagementEnabled property value. When TRUE, inidicates that data from the Mobile Threat Defense partner can be used during Mobile Application Management (MAM) evaluations for IOS devices. When FALSE, inidicates that data from the Mobile Threat Defense partner should not be used during Mobile Application Management (MAM) evaluations for IOS devices. Only one partner per platform may be enabled for Mobile Application Management (MAM) evaluation. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIosMobileApplicationManagementEnabled() {
        return this.iosMobileApplicationManagementEnabled;
    }
    /**
     * Gets the lastHeartbeatDateTime property value. DateTime of last Heartbeat recieved from the Mobile Threat Defense partner
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastHeartbeatDateTime() {
        return this.lastHeartbeatDateTime;
    }
    /**
     * Gets the microsoftDefenderForEndpointAttachEnabled property value. When TRUE, inidicates that configuration profile management via Microsoft Defender for Endpoint is enabled. When FALSE, inidicates that configuration profile management via Microsoft Defender for Endpoint is disabled. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftDefenderForEndpointAttachEnabled() {
        return this.microsoftDefenderForEndpointAttachEnabled;
    }
    /**
     * Gets the partnerState property value. Partner state of this tenant.
     * @return a MobileThreatPartnerTenantState
     */
    @javax.annotation.Nullable
    public MobileThreatPartnerTenantState getPartnerState() {
        return this.partnerState;
    }
    /**
     * Gets the partnerUnresponsivenessThresholdInDays property value. Get or Set days the per tenant tolerance to unresponsiveness for this partner integration
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPartnerUnresponsivenessThresholdInDays() {
        return this.partnerUnresponsivenessThresholdInDays;
    }
    /**
     * Gets the partnerUnsupportedOsVersionBlocked property value. Get or set whether to block devices on the enabled platforms that do not meet the minimum version requirements of the Mobile Threat Defense partner
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPartnerUnsupportedOsVersionBlocked() {
        return this.partnerUnsupportedOsVersionBlocked;
    }
    /**
     * Gets the windowsDeviceBlockedOnMissingPartnerData property value. When TRUE, inidicates that Intune must receive data from the Mobile Threat Defense partner prior to marking a device compliant for Windows. When FALSE, inidicates that Intune may make a device compliant without receiving data from the Mobile Threat Defense partner for Windows. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsDeviceBlockedOnMissingPartnerData() {
        return this.windowsDeviceBlockedOnMissingPartnerData;
    }
    /**
     * Gets the windowsEnabled property value. When TRUE, inidicates that data from the Mobile Threat Defense partner can be used during compliance evaluations for Windows. When FALSE, inidicates that data from the Mobile Threat Defense partner should not be used during compliance evaluations for Windows. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsEnabled() {
        return this.windowsEnabled;
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
        writer.writeBooleanValue("allowPartnerToCollectIOSApplicationMetadata", this.getAllowPartnerToCollectIOSApplicationMetadata());
        writer.writeBooleanValue("allowPartnerToCollectIOSPersonalApplicationMetadata", this.getAllowPartnerToCollectIOSPersonalApplicationMetadata());
        writer.writeBooleanValue("androidDeviceBlockedOnMissingPartnerData", this.getAndroidDeviceBlockedOnMissingPartnerData());
        writer.writeBooleanValue("androidEnabled", this.getAndroidEnabled());
        writer.writeBooleanValue("androidMobileApplicationManagementEnabled", this.getAndroidMobileApplicationManagementEnabled());
        writer.writeBooleanValue("iosDeviceBlockedOnMissingPartnerData", this.getIosDeviceBlockedOnMissingPartnerData());
        writer.writeBooleanValue("iosEnabled", this.getIosEnabled());
        writer.writeBooleanValue("iosMobileApplicationManagementEnabled", this.getIosMobileApplicationManagementEnabled());
        writer.writeOffsetDateTimeValue("lastHeartbeatDateTime", this.getLastHeartbeatDateTime());
        writer.writeBooleanValue("microsoftDefenderForEndpointAttachEnabled", this.getMicrosoftDefenderForEndpointAttachEnabled());
        writer.writeEnumValue("partnerState", this.getPartnerState());
        writer.writeIntegerValue("partnerUnresponsivenessThresholdInDays", this.getPartnerUnresponsivenessThresholdInDays());
        writer.writeBooleanValue("partnerUnsupportedOsVersionBlocked", this.getPartnerUnsupportedOsVersionBlocked());
        writer.writeBooleanValue("windowsDeviceBlockedOnMissingPartnerData", this.getWindowsDeviceBlockedOnMissingPartnerData());
        writer.writeBooleanValue("windowsEnabled", this.getWindowsEnabled());
    }
    /**
     * Sets the allowPartnerToCollectIOSApplicationMetadata property value. When TRUE, indicates the Mobile Threat Defense partner may collect metadata about installed applications from Intune for IOS devices. When FALSE, indicates the Mobile Threat Defense partner may not collect metadata about installed applications from Intune for IOS devices. Default value is FALSE.
     * @param value Value to set for the allowPartnerToCollectIOSApplicationMetadata property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowPartnerToCollectIOSApplicationMetadata(@javax.annotation.Nullable final Boolean value) {
        this.allowPartnerToCollectIOSApplicationMetadata = value;
    }
    /**
     * Sets the allowPartnerToCollectIOSPersonalApplicationMetadata property value. When TRUE, indicates the Mobile Threat Defense partner may collect metadata about personally installed applications from Intune for IOS devices. When FALSE, indicates the Mobile Threat Defense partner may not collect metadata about personally installed applications from Intune for IOS devices. Default value is FALSE.
     * @param value Value to set for the allowPartnerToCollectIOSPersonalApplicationMetadata property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowPartnerToCollectIOSPersonalApplicationMetadata(@javax.annotation.Nullable final Boolean value) {
        this.allowPartnerToCollectIOSPersonalApplicationMetadata = value;
    }
    /**
     * Sets the androidDeviceBlockedOnMissingPartnerData property value. For Android, set whether Intune must receive data from the Mobile Threat Defense partner prior to marking a device compliant
     * @param value Value to set for the androidDeviceBlockedOnMissingPartnerData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidDeviceBlockedOnMissingPartnerData(@javax.annotation.Nullable final Boolean value) {
        this.androidDeviceBlockedOnMissingPartnerData = value;
    }
    /**
     * Sets the androidEnabled property value. For Android, set whether data from the Mobile Threat Defense partner should be used during compliance evaluations
     * @param value Value to set for the androidEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidEnabled(@javax.annotation.Nullable final Boolean value) {
        this.androidEnabled = value;
    }
    /**
     * Sets the androidMobileApplicationManagementEnabled property value. When TRUE, inidicates that data from the Mobile Threat Defense partner can be used during Mobile Application Management (MAM) evaluations for Android devices. When FALSE, inidicates that data from the Mobile Threat Defense partner should not be used during Mobile Application Management (MAM) evaluations for Android devices. Only one partner per platform may be enabled for Mobile Application Management (MAM) evaluation. Default value is FALSE.
     * @param value Value to set for the androidMobileApplicationManagementEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidMobileApplicationManagementEnabled(@javax.annotation.Nullable final Boolean value) {
        this.androidMobileApplicationManagementEnabled = value;
    }
    /**
     * Sets the iosDeviceBlockedOnMissingPartnerData property value. For IOS, set whether Intune must receive data from the Mobile Threat Defense partner prior to marking a device compliant
     * @param value Value to set for the iosDeviceBlockedOnMissingPartnerData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIosDeviceBlockedOnMissingPartnerData(@javax.annotation.Nullable final Boolean value) {
        this.iosDeviceBlockedOnMissingPartnerData = value;
    }
    /**
     * Sets the iosEnabled property value. For IOS, get or set whether data from the Mobile Threat Defense partner should be used during compliance evaluations
     * @param value Value to set for the iosEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIosEnabled(@javax.annotation.Nullable final Boolean value) {
        this.iosEnabled = value;
    }
    /**
     * Sets the iosMobileApplicationManagementEnabled property value. When TRUE, inidicates that data from the Mobile Threat Defense partner can be used during Mobile Application Management (MAM) evaluations for IOS devices. When FALSE, inidicates that data from the Mobile Threat Defense partner should not be used during Mobile Application Management (MAM) evaluations for IOS devices. Only one partner per platform may be enabled for Mobile Application Management (MAM) evaluation. Default value is FALSE.
     * @param value Value to set for the iosMobileApplicationManagementEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIosMobileApplicationManagementEnabled(@javax.annotation.Nullable final Boolean value) {
        this.iosMobileApplicationManagementEnabled = value;
    }
    /**
     * Sets the lastHeartbeatDateTime property value. DateTime of last Heartbeat recieved from the Mobile Threat Defense partner
     * @param value Value to set for the lastHeartbeatDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastHeartbeatDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastHeartbeatDateTime = value;
    }
    /**
     * Sets the microsoftDefenderForEndpointAttachEnabled property value. When TRUE, inidicates that configuration profile management via Microsoft Defender for Endpoint is enabled. When FALSE, inidicates that configuration profile management via Microsoft Defender for Endpoint is disabled. Default value is FALSE.
     * @param value Value to set for the microsoftDefenderForEndpointAttachEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftDefenderForEndpointAttachEnabled(@javax.annotation.Nullable final Boolean value) {
        this.microsoftDefenderForEndpointAttachEnabled = value;
    }
    /**
     * Sets the partnerState property value. Partner state of this tenant.
     * @param value Value to set for the partnerState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPartnerState(@javax.annotation.Nullable final MobileThreatPartnerTenantState value) {
        this.partnerState = value;
    }
    /**
     * Sets the partnerUnresponsivenessThresholdInDays property value. Get or Set days the per tenant tolerance to unresponsiveness for this partner integration
     * @param value Value to set for the partnerUnresponsivenessThresholdInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPartnerUnresponsivenessThresholdInDays(@javax.annotation.Nullable final Integer value) {
        this.partnerUnresponsivenessThresholdInDays = value;
    }
    /**
     * Sets the partnerUnsupportedOsVersionBlocked property value. Get or set whether to block devices on the enabled platforms that do not meet the minimum version requirements of the Mobile Threat Defense partner
     * @param value Value to set for the partnerUnsupportedOsVersionBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPartnerUnsupportedOsVersionBlocked(@javax.annotation.Nullable final Boolean value) {
        this.partnerUnsupportedOsVersionBlocked = value;
    }
    /**
     * Sets the windowsDeviceBlockedOnMissingPartnerData property value. When TRUE, inidicates that Intune must receive data from the Mobile Threat Defense partner prior to marking a device compliant for Windows. When FALSE, inidicates that Intune may make a device compliant without receiving data from the Mobile Threat Defense partner for Windows. Default value is FALSE.
     * @param value Value to set for the windowsDeviceBlockedOnMissingPartnerData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsDeviceBlockedOnMissingPartnerData(@javax.annotation.Nullable final Boolean value) {
        this.windowsDeviceBlockedOnMissingPartnerData = value;
    }
    /**
     * Sets the windowsEnabled property value. When TRUE, inidicates that data from the Mobile Threat Defense partner can be used during compliance evaluations for Windows. When FALSE, inidicates that data from the Mobile Threat Defense partner should not be used during compliance evaluations for Windows. Default value is FALSE.
     * @param value Value to set for the windowsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.windowsEnabled = value;
    }
}
