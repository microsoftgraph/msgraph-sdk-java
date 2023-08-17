package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows Information Protection AppLearning Summary entity.
 */
public class WindowsInformationProtectionAppLearningSummary extends Entity implements Parsable {
    /**
     * Application Name
     */
    private String applicationName;
    /**
     * Possible types of Application
     */
    private ApplicationType applicationType;
    /**
     * Device Count
     */
    private Integer deviceCount;
    /**
     * Instantiates a new windowsInformationProtectionAppLearningSummary and sets the default values.
     */
    public WindowsInformationProtectionAppLearningSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsInformationProtectionAppLearningSummary
     */
    @jakarta.annotation.Nonnull
    public static WindowsInformationProtectionAppLearningSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsInformationProtectionAppLearningSummary();
    }
    /**
     * Gets the applicationName property value. Application Name
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getApplicationName() {
        return this.applicationName;
    }
    /**
     * Gets the applicationType property value. Possible types of Application
     * @return a applicationType
     */
    @jakarta.annotation.Nullable
    public ApplicationType getApplicationType() {
        return this.applicationType;
    }
    /**
     * Gets the deviceCount property value. Device Count
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceCount() {
        return this.deviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationName", (n) -> { this.setApplicationName(n.getStringValue()); });
        deserializerMap.put("applicationType", (n) -> { this.setApplicationType(n.getEnumValue(ApplicationType.class)); });
        deserializerMap.put("deviceCount", (n) -> { this.setDeviceCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("applicationName", this.getApplicationName());
        writer.writeEnumValue("applicationType", this.getApplicationType());
        writer.writeIntegerValue("deviceCount", this.getDeviceCount());
    }
    /**
     * Sets the applicationName property value. Application Name
     * @param value Value to set for the applicationName property.
     */
    public void setApplicationName(@jakarta.annotation.Nullable final String value) {
        this.applicationName = value;
    }
    /**
     * Sets the applicationType property value. Possible types of Application
     * @param value Value to set for the applicationType property.
     */
    public void setApplicationType(@jakarta.annotation.Nullable final ApplicationType value) {
        this.applicationType = value;
    }
    /**
     * Sets the deviceCount property value. Device Count
     * @param value Value to set for the deviceCount property.
     */
    public void setDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.deviceCount = value;
    }
}
