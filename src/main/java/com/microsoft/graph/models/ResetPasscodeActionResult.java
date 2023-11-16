package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Reset passcode action result
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ResetPasscodeActionResult extends DeviceActionResult implements Parsable {
    /**
     * Instantiates a new ResetPasscodeActionResult and sets the default values.
     */
    public ResetPasscodeActionResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ResetPasscodeActionResult
     */
    @jakarta.annotation.Nonnull
    public static ResetPasscodeActionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResetPasscodeActionResult();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("passcode", (n) -> { this.setPasscode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the passcode property value. Newly generated passcode for the device
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPasscode() {
        return this.BackingStore.get("passcode");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("passcode", this.getPasscode());
    }
    /**
     * Sets the passcode property value. Newly generated passcode for the device
     * @param value Value to set for the passcode property.
     */
    public void setPasscode(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("passcode", value);
    }
}
