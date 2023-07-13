package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Event representing an enrollment failure.
 */
public class EnrollmentTroubleshootingEvent extends DeviceManagementTroubleshootingEvent implements Parsable {
    /**
     * Azure AD device identifier.
     */
    private String deviceId;
    /**
     * Possible ways of adding a mobile device to management.
     */
    private DeviceEnrollmentType enrollmentType;
    /**
     * Top level failure categories for enrollment.
     */
    private DeviceEnrollmentFailureReason failureCategory;
    /**
     * Detailed failure reason.
     */
    private String failureReason;
    /**
     * Device identifier created or collected by Intune.
     */
    private String managedDeviceIdentifier;
    /**
     * Operating System.
     */
    private String operatingSystem;
    /**
     * OS Version.
     */
    private String osVersion;
    /**
     * Identifier for the user that tried to enroll the device.
     */
    private String userId;
    /**
     * Instantiates a new enrollmentTroubleshootingEvent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EnrollmentTroubleshootingEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a enrollmentTroubleshootingEvent
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
        return this.deviceId;
    }
    /**
     * Gets the enrollmentType property value. Possible ways of adding a mobile device to management.
     * @return a deviceEnrollmentType
     */
    @javax.annotation.Nullable
    public DeviceEnrollmentType getEnrollmentType() {
        return this.enrollmentType;
    }
    /**
     * Gets the failureCategory property value. Top level failure categories for enrollment.
     * @return a deviceEnrollmentFailureReason
     */
    @javax.annotation.Nullable
    public DeviceEnrollmentFailureReason getFailureCategory() {
        return this.failureCategory;
    }
    /**
     * Gets the failureReason property value. Detailed failure reason.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFailureReason() {
        return this.failureReason;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("enrollmentType", (n) -> { this.setEnrollmentType(n.getEnumValue(DeviceEnrollmentType.class)); });
        deserializerMap.put("failureCategory", (n) -> { this.setFailureCategory(n.getEnumValue(DeviceEnrollmentFailureReason.class)); });
        deserializerMap.put("failureReason", (n) -> { this.setFailureReason(n.getStringValue()); });
        deserializerMap.put("managedDeviceIdentifier", (n) -> { this.setManagedDeviceIdentifier(n.getStringValue()); });
        deserializerMap.put("operatingSystem", (n) -> { this.setOperatingSystem(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedDeviceIdentifier property value. Device identifier created or collected by Intune.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceIdentifier() {
        return this.managedDeviceIdentifier;
    }
    /**
     * Gets the operatingSystem property value. Operating System.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystem() {
        return this.operatingSystem;
    }
    /**
     * Gets the osVersion property value. OS Version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this.osVersion;
    }
    /**
     * Gets the userId property value. Identifier for the user that tried to enroll the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
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
        this.deviceId = value;
    }
    /**
     * Sets the enrollmentType property value. Possible ways of adding a mobile device to management.
     * @param value Value to set for the enrollmentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentType(@javax.annotation.Nullable final DeviceEnrollmentType value) {
        this.enrollmentType = value;
    }
    /**
     * Sets the failureCategory property value. Top level failure categories for enrollment.
     * @param value Value to set for the failureCategory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailureCategory(@javax.annotation.Nullable final DeviceEnrollmentFailureReason value) {
        this.failureCategory = value;
    }
    /**
     * Sets the failureReason property value. Detailed failure reason.
     * @param value Value to set for the failureReason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailureReason(@javax.annotation.Nullable final String value) {
        this.failureReason = value;
    }
    /**
     * Sets the managedDeviceIdentifier property value. Device identifier created or collected by Intune.
     * @param value Value to set for the managedDeviceIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceIdentifier(@javax.annotation.Nullable final String value) {
        this.managedDeviceIdentifier = value;
    }
    /**
     * Sets the operatingSystem property value. Operating System.
     * @param value Value to set for the operatingSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperatingSystem(@javax.annotation.Nullable final String value) {
        this.operatingSystem = value;
    }
    /**
     * Sets the osVersion property value. OS Version.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this.osVersion = value;
    }
    /**
     * Sets the userId property value. Identifier for the user that tried to enroll the device.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
}
