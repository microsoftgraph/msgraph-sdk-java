package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreementAcceptance entities. */
public class DeviceConfigurationUserStatus extends Entity implements Parsable {
    /** Devices count for that user. */
    private Integer _devicesCount;
    /** Last modified date time of the policy report. */
    private OffsetDateTime _lastReportedDateTime;
    /** The status property */
    private ComplianceStatus _status;
    /** User name of the DevicePolicyStatus. */
    private String _userDisplayName;
    /** UserPrincipalName. */
    private String _userPrincipalName;
    /**
     * Instantiates a new deviceConfigurationUserStatus and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceConfigurationUserStatus() {
        super();
        this.setOdataType("#microsoft.graph.deviceConfigurationUserStatus");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceConfigurationUserStatus
     */
    @javax.annotation.Nonnull
    public static DeviceConfigurationUserStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceConfigurationUserStatus();
    }
    /**
     * Gets the devicesCount property value. Devices count for that user.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDevicesCount() {
        return this._devicesCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceConfigurationUserStatus currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("devicesCount", (n) -> { currentObject.setDevicesCount(n.getIntegerValue()); });
            this.put("lastReportedDateTime", (n) -> { currentObject.setLastReportedDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(ComplianceStatus.class)); });
            this.put("userDisplayName", (n) -> { currentObject.setUserDisplayName(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastReportedDateTime property value. Last modified date time of the policy report.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastReportedDateTime() {
        return this._lastReportedDateTime;
    }
    /**
     * Gets the status property value. The status property
     * @return a complianceStatus
     */
    @javax.annotation.Nullable
    public ComplianceStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the userDisplayName property value. User name of the DevicePolicyStatus.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this._userDisplayName;
    }
    /**
     * Gets the userPrincipalName property value. UserPrincipalName.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
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
        writer.writeIntegerValue("devicesCount", this.getDevicesCount());
        writer.writeOffsetDateTimeValue("lastReportedDateTime", this.getLastReportedDateTime());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the devicesCount property value. Devices count for that user.
     * @param value Value to set for the devicesCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDevicesCount(@javax.annotation.Nullable final Integer value) {
        this._devicesCount = value;
    }
    /**
     * Sets the lastReportedDateTime property value. Last modified date time of the policy report.
     * @param value Value to set for the lastReportedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastReportedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastReportedDateTime = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final ComplianceStatus value) {
        this._status = value;
    }
    /**
     * Sets the userDisplayName property value. User name of the DevicePolicyStatus.
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this._userDisplayName = value;
    }
    /**
     * Sets the userPrincipalName property value. UserPrincipalName.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
