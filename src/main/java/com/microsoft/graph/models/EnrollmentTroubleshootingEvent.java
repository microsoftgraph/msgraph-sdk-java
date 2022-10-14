package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EnrollmentTroubleshootingEvent extends DeviceManagementTroubleshootingEvent implements Parsable {
    /** Azure AD device identifier. */
    private String _deviceId;
    /** Possible ways of adding a mobile device to management. */
    private DeviceEnrollmentType _enrollmentType;
    /** Top level failure categories for enrollment. */
    private DeviceEnrollmentFailureReason _failureCategory;
    /** Detailed failure reason. */
    private String _failureReason;
    /** Device identifier created or collected by Intune. */
    private String _managedDeviceIdentifier;
    /** Operating System. */
    private String _operatingSystem;
    /** OS Version. */
    private String _osVersion;
    /** Identifier for the user that tried to enroll the device. */
    private String _userId;
    /**
     * Instantiates a new EnrollmentTroubleshootingEvent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EnrollmentTroubleshootingEvent() {
        super();
        this.setOdataType("#microsoft.graph.enrollmentTroubleshootingEvent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EnrollmentTroubleshootingEvent
     */
    @javax.annotation.Nonnull
    public static EnrollmentTroubleshootingEvent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnrollmentTroubleshootingEvent();
    }
    /**
     * Gets the deviceId property value. Azure AD device identifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the enrollmentType property value. Possible ways of adding a mobile device to management.
     * @return a deviceEnrollmentType
     */
    @javax.annotation.Nullable
    public DeviceEnrollmentType getEnrollmentType() {
        return this._enrollmentType;
    }
    /**
     * Gets the failureCategory property value. Top level failure categories for enrollment.
     * @return a deviceEnrollmentFailureReason
     */
    @javax.annotation.Nullable
    public DeviceEnrollmentFailureReason getFailureCategory() {
        return this._failureCategory;
    }
    /**
     * Gets the failureReason property value. Detailed failure reason.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFailureReason() {
        return this._failureReason;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EnrollmentTroubleshootingEvent currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("enrollmentType", (n) -> { currentObject.setEnrollmentType(n.getEnumValue(DeviceEnrollmentType.class)); });
            this.put("failureCategory", (n) -> { currentObject.setFailureCategory(n.getEnumValue(DeviceEnrollmentFailureReason.class)); });
            this.put("failureReason", (n) -> { currentObject.setFailureReason(n.getStringValue()); });
            this.put("managedDeviceIdentifier", (n) -> { currentObject.setManagedDeviceIdentifier(n.getStringValue()); });
            this.put("operatingSystem", (n) -> { currentObject.setOperatingSystem(n.getStringValue()); });
            this.put("osVersion", (n) -> { currentObject.setOsVersion(n.getStringValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the managedDeviceIdentifier property value. Device identifier created or collected by Intune.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceIdentifier() {
        return this._managedDeviceIdentifier;
    }
    /**
     * Gets the operatingSystem property value. Operating System.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystem() {
        return this._operatingSystem;
    }
    /**
     * Gets the osVersion property value. OS Version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this._osVersion;
    }
    /**
     * Gets the userId property value. Identifier for the user that tried to enroll the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
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
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeEnumValue("enrollmentType", this.getEnrollmentType());
        writer.writeEnumValue("failureCategory", this.getFailureCategory());
        writer.writeStringValue("failureReason", this.getFailureReason());
        writer.writeStringValue("managedDeviceIdentifier", this.getManagedDeviceIdentifier());
        writer.writeStringValue("operatingSystem", this.getOperatingSystem());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the deviceId property value. Azure AD device identifier.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the enrollmentType property value. Possible ways of adding a mobile device to management.
     * @param value Value to set for the enrollmentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentType(@javax.annotation.Nullable final DeviceEnrollmentType value) {
        this._enrollmentType = value;
    }
    /**
     * Sets the failureCategory property value. Top level failure categories for enrollment.
     * @param value Value to set for the failureCategory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailureCategory(@javax.annotation.Nullable final DeviceEnrollmentFailureReason value) {
        this._failureCategory = value;
    }
    /**
     * Sets the failureReason property value. Detailed failure reason.
     * @param value Value to set for the failureReason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailureReason(@javax.annotation.Nullable final String value) {
        this._failureReason = value;
    }
    /**
     * Sets the managedDeviceIdentifier property value. Device identifier created or collected by Intune.
     * @param value Value to set for the managedDeviceIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceIdentifier(@javax.annotation.Nullable final String value) {
        this._managedDeviceIdentifier = value;
    }
    /**
     * Sets the operatingSystem property value. Operating System.
     * @param value Value to set for the operatingSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperatingSystem(@javax.annotation.Nullable final String value) {
        this._operatingSystem = value;
    }
    /**
     * Sets the osVersion property value. OS Version.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this._osVersion = value;
    }
    /**
     * Sets the userId property value. Identifier for the user that tried to enroll the device.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
}
