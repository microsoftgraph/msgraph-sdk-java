package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosUpdateDeviceStatus extends Entity implements Parsable {
    /** The DateTime when device compliance grace period expires */
    private OffsetDateTime complianceGracePeriodExpirationDateTime;
    /** Device name of the DevicePolicyStatus. */
    private String deviceDisplayName;
    /** The device id that is being reported. */
    private String deviceId;
    /** The device model that is being reported */
    private String deviceModel;
    /** The installStatus property */
    private IosUpdatesInstallStatus installStatus;
    /** Last modified date time of the policy report. */
    private OffsetDateTime lastReportedDateTime;
    /** The device version that is being reported. */
    private String osVersion;
    /** The status property */
    private ComplianceStatus status;
    /** The User id that is being reported. */
    private String userId;
    /** The User Name that is being reported */
    private String userName;
    /** UserPrincipalName. */
    private String userPrincipalName;
    /**
     * Instantiates a new iosUpdateDeviceStatus and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosUpdateDeviceStatus() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosUpdateDeviceStatus
     */
    @javax.annotation.Nonnull
    public static IosUpdateDeviceStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosUpdateDeviceStatus();
    }
    /**
     * Gets the complianceGracePeriodExpirationDateTime property value. The DateTime when device compliance grace period expires
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getComplianceGracePeriodExpirationDateTime() {
        return this.complianceGracePeriodExpirationDateTime;
    }
    /**
     * Gets the deviceDisplayName property value. Device name of the DevicePolicyStatus.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceDisplayName() {
        return this.deviceDisplayName;
    }
    /**
     * Gets the deviceId property value. The device id that is being reported.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the deviceModel property value. The device model that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceModel() {
        return this.deviceModel;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("complianceGracePeriodExpirationDateTime", (n) -> { this.setComplianceGracePeriodExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deviceDisplayName", (n) -> { this.setDeviceDisplayName(n.getStringValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceModel", (n) -> { this.setDeviceModel(n.getStringValue()); });
        deserializerMap.put("installStatus", (n) -> { this.setInstallStatus(n.getEnumValue(IosUpdatesInstallStatus.class)); });
        deserializerMap.put("lastReportedDateTime", (n) -> { this.setLastReportedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ComplianceStatus.class)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installStatus property value. The installStatus property
     * @return a iosUpdatesInstallStatus
     */
    @javax.annotation.Nullable
    public IosUpdatesInstallStatus getInstallStatus() {
        return this.installStatus;
    }
    /**
     * Gets the lastReportedDateTime property value. Last modified date time of the policy report.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastReportedDateTime() {
        return this.lastReportedDateTime;
    }
    /**
     * Gets the osVersion property value. The device version that is being reported.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this.osVersion;
    }
    /**
     * Gets the status property value. The status property
     * @return a complianceStatus
     */
    @javax.annotation.Nullable
    public ComplianceStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the userId property value. The User id that is being reported.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userName property value. The User Name that is being reported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this.userName;
    }
    /**
     * Gets the userPrincipalName property value. UserPrincipalName.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
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
        writer.writeOffsetDateTimeValue("complianceGracePeriodExpirationDateTime", this.getComplianceGracePeriodExpirationDateTime());
        writer.writeStringValue("deviceDisplayName", this.getDeviceDisplayName());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceModel", this.getDeviceModel());
        writer.writeEnumValue("installStatus", this.getInstallStatus());
        writer.writeOffsetDateTimeValue("lastReportedDateTime", this.getLastReportedDateTime());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userName", this.getUserName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the complianceGracePeriodExpirationDateTime property value. The DateTime when device compliance grace period expires
     * @param value Value to set for the complianceGracePeriodExpirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComplianceGracePeriodExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.complianceGracePeriodExpirationDateTime = value;
    }
    /**
     * Sets the deviceDisplayName property value. Device name of the DevicePolicyStatus.
     * @param value Value to set for the deviceDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceDisplayName(@javax.annotation.Nullable final String value) {
        this.deviceDisplayName = value;
    }
    /**
     * Sets the deviceId property value. The device id that is being reported.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the deviceModel property value. The device model that is being reported
     * @param value Value to set for the deviceModel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceModel(@javax.annotation.Nullable final String value) {
        this.deviceModel = value;
    }
    /**
     * Sets the installStatus property value. The installStatus property
     * @param value Value to set for the installStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstallStatus(@javax.annotation.Nullable final IosUpdatesInstallStatus value) {
        this.installStatus = value;
    }
    /**
     * Sets the lastReportedDateTime property value. Last modified date time of the policy report.
     * @param value Value to set for the lastReportedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastReportedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastReportedDateTime = value;
    }
    /**
     * Sets the osVersion property value. The device version that is being reported.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this.osVersion = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final ComplianceStatus value) {
        this.status = value;
    }
    /**
     * Sets the userId property value. The User id that is being reported.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userName property value. The User Name that is being reported
     * @param value Value to set for the userName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserName(@javax.annotation.Nullable final String value) {
        this.userName = value;
    }
    /**
     * Sets the userPrincipalName property value. UserPrincipalName.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
