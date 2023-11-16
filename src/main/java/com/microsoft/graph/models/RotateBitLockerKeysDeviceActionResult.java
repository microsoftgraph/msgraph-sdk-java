package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * RotateBitLockerKeys device action result
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RotateBitLockerKeysDeviceActionResult extends DeviceActionResult implements Parsable {
    /**
     * Instantiates a new RotateBitLockerKeysDeviceActionResult and sets the default values.
     */
    public RotateBitLockerKeysDeviceActionResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RotateBitLockerKeysDeviceActionResult
     */
    @jakarta.annotation.Nonnull
    public static RotateBitLockerKeysDeviceActionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RotateBitLockerKeysDeviceActionResult();
    }
    /**
     * Gets the errorCode property value. RotateBitLockerKeys action error code
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getErrorCode() {
        return this.BackingStore.get("errorCode");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("errorCode", this.getErrorCode());
    }
    /**
     * Sets the errorCode property value. RotateBitLockerKeys action error code
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("errorCode", value);
    }
}
