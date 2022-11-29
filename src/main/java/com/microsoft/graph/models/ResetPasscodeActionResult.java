package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ResetPasscodeActionResult extends DeviceActionResult implements Parsable {
    /** Newly generated passcode for the device */
    private String _passcode;
    /**
     * Instantiates a new ResetPasscodeActionResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ResetPasscodeActionResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ResetPasscodeActionResult
     */
    @javax.annotation.Nonnull
    public static ResetPasscodeActionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResetPasscodeActionResult();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ResetPasscodeActionResult currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("passcode", (n) -> { currentObject.setPasscode(n.getStringValue()); });
        }};
    }
    /**
     * Gets the passcode property value. Newly generated passcode for the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPasscode() {
        return this._passcode;
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
        writer.writeStringValue("passcode", this.getPasscode());
    }
    /**
     * Sets the passcode property value. Newly generated passcode for the device
     * @param value Value to set for the passcode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasscode(@javax.annotation.Nullable final String value) {
        this._passcode = value;
    }
}
