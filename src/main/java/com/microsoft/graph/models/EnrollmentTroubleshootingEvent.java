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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EnrollmentTroubleshootingEvent extends DeviceManagementTroubleshootingEvent implements Parsable {
    /**
     * Instantiates a new EnrollmentTroubleshootingEvent and sets the default values.
     */
    public EnrollmentTroubleshootingEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EnrollmentTroubleshootingEvent
     */
    @jakarta.annotation.Nonnull
    public static EnrollmentTroubleshootingEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnrollmentTroubleshootingEvent();
    }
    /**
     * Gets the deviceId property value. Azure AD device identifier.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.BackingStore.get("deviceId");
    }
    /**
     * Gets the enrollmentType property value. Possible ways of adding a mobile device to management.
     * @return a DeviceEnrollmentType
     */
    @jakarta.annotation.Nullable
    public DeviceEnrollmentType getEnrollmentType() {
        return this.BackingStore.get("enrollmentType");
    }
    /**
     * Gets the failureCategory property value. Top level failure categories for enrollment.
     * @return a DeviceEnrollmentFailureReason
     */
    @jakarta.annotation.Nullable
    public DeviceEnrollmentFailureReason getFailureCategory() {
        return this.BackingStore.get("failureCategory");
    }
    /**
     * Gets the failureReason property value. Detailed failure reason.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFailureReason() {
        return this.BackingStore.get("failureReason");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceIdentifier() {
        return this.BackingStore.get("managedDeviceIdentifier");
    }
    /**
     * Gets the operatingSystem property value. Operating System.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystem() {
        return this.BackingStore.get("operatingSystem");
    }
    /**
     * Gets the osVersion property value. OS Version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.BackingStore.get("osVersion");
    }
    /**
     * Gets the userId property value. Identifier for the user that tried to enroll the device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.BackingStore.get("userId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("deviceId", value);
    }
    /**
     * Sets the enrollmentType property value. Possible ways of adding a mobile device to management.
     * @param value Value to set for the enrollmentType property.
     */
    public void setEnrollmentType(@jakarta.annotation.Nullable final DeviceEnrollmentType value) {
        this.BackingStore.set("enrollmentType", value);
    }
    /**
     * Sets the failureCategory property value. Top level failure categories for enrollment.
     * @param value Value to set for the failureCategory property.
     */
    public void setFailureCategory(@jakarta.annotation.Nullable final DeviceEnrollmentFailureReason value) {
        this.BackingStore.set("failureCategory", value);
    }
    /**
     * Sets the failureReason property value. Detailed failure reason.
     * @param value Value to set for the failureReason property.
     */
    public void setFailureReason(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("failureReason", value);
    }
    /**
     * Sets the managedDeviceIdentifier property value. Device identifier created or collected by Intune.
     * @param value Value to set for the managedDeviceIdentifier property.
     */
    public void setManagedDeviceIdentifier(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("managedDeviceIdentifier", value);
    }
    /**
     * Sets the operatingSystem property value. Operating System.
     * @param value Value to set for the operatingSystem property.
     */
    public void setOperatingSystem(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("operatingSystem", value);
    }
    /**
     * Sets the osVersion property value. OS Version.
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("osVersion", value);
    }
    /**
     * Sets the userId property value. Identifier for the user that tried to enroll the device.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("userId", value);
    }
}
