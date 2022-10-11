package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RemoteLockActionResult extends DeviceActionResult implements Parsable {
    /** Pin to unlock the client */
    private String _unlockPin;
    /**
     * Instantiates a new RemoteLockActionResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RemoteLockActionResult() {
        super();
        this.setOdataType("#microsoft.graph.remoteLockActionResult");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RemoteLockActionResult
     */
    @javax.annotation.Nonnull
    public static RemoteLockActionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemoteLockActionResult();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RemoteLockActionResult currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("unlockPin", (n) -> { currentObject.setUnlockPin(n.getStringValue()); });
        }};
    }
    /**
     * Gets the unlockPin property value. Pin to unlock the client
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUnlockPin() {
        return this._unlockPin;
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
        this._unlockPin = value;
    }
}
