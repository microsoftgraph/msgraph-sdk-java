package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Locate device action result
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LocateDeviceActionResult extends DeviceActionResult implements Parsable {
    /**
     * Instantiates a new LocateDeviceActionResult and sets the default values.
     */
    public LocateDeviceActionResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LocateDeviceActionResult
     */
    @jakarta.annotation.Nonnull
    public static LocateDeviceActionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LocateDeviceActionResult();
    }
    /**
     * Gets the deviceLocation property value. device location
     * @return a DeviceGeoLocation
     */
    @jakarta.annotation.Nullable
    public DeviceGeoLocation getDeviceLocation() {
        return this.backingStore.get("deviceLocation");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceLocation", (n) -> { this.setDeviceLocation(n.getObjectValue(DeviceGeoLocation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("deviceLocation", this.getDeviceLocation());
    }
    /**
     * Sets the deviceLocation property value. device location
     * @param value Value to set for the deviceLocation property.
     */
    public void setDeviceLocation(@jakarta.annotation.Nullable final DeviceGeoLocation value) {
        this.backingStore.set("deviceLocation", value);
    }
}
