package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Enrollment Configuration that restricts the number of devices a user can enroll
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceEnrollmentLimitConfiguration extends DeviceEnrollmentConfiguration implements Parsable {
    /**
     * Instantiates a new DeviceEnrollmentLimitConfiguration and sets the default values.
     */
    public DeviceEnrollmentLimitConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.deviceEnrollmentLimitConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceEnrollmentLimitConfiguration
     */
    @jakarta.annotation.Nonnull
    public static DeviceEnrollmentLimitConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceEnrollmentLimitConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the limit property value. The maximum number of devices that a user can enroll
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.BackingStore.get("limit");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("limit", this.getLimit());
    }
    /**
     * Sets the limit property value. The maximum number of devices that a user can enroll
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("limit", value);
    }
}
