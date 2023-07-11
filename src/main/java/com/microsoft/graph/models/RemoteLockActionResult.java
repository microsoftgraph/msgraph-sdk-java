package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Lock action result with a pin to unlock
 */
public class RemoteLockActionResult extends DeviceActionResult implements Parsable {
    /**
     * Pin to unlock the client
     */
    private String unlockPin;
    /**
     * Instantiates a new remoteLockActionResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RemoteLockActionResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a remoteLockActionResult
     */
    @javax.annotation.Nonnull
    public static RemoteLockActionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemoteLockActionResult();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("unlockPin", (n) -> { this.setUnlockPin(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the unlockPin property value. Pin to unlock the client
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUnlockPin() {
        return this.unlockPin;
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
        writer.writeStringValue("unlockPin", this.getUnlockPin());
    }
    /**
     * Sets the unlockPin property value. Pin to unlock the client
     * @param value Value to set for the unlockPin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnlockPin(@javax.annotation.Nullable final String value) {
        this.unlockPin = value;
    }
}
