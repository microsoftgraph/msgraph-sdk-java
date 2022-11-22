package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MacOSCustomConfiguration extends DeviceConfiguration implements Parsable {
    /** Payload. (UTF8 encoded byte array) */
    private byte[] _payload;
    /** Payload file name (.mobileconfig */
    private String _payloadFileName;
    /** Name that is displayed to the user. */
    private String _payloadName;
    /**
     * Instantiates a new MacOSCustomConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOSCustomConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.macOSCustomConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSCustomConfiguration
     */
    @javax.annotation.Nonnull
    public static MacOSCustomConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSCustomConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("payload", (n) -> { this.setPayload(n.getByteArrayValue()); });
        deserializerMap.put("payloadFileName", (n) -> { this.setPayloadFileName(n.getStringValue()); });
        deserializerMap.put("payloadName", (n) -> { this.setPayloadName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the payload property value. Payload. (UTF8 encoded byte array)
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getPayload() {
        return this._payload;
    }
    /**
     * Gets the payloadFileName property value. Payload file name (.mobileconfig
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPayloadFileName() {
        return this._payloadFileName;
    }
    /**
     * Gets the payloadName property value. Name that is displayed to the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPayloadName() {
        return this._payloadName;
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
        writer.writeByteArrayValue("payload", this.getPayload());
        writer.writeStringValue("payloadFileName", this.getPayloadFileName());
        writer.writeStringValue("payloadName", this.getPayloadName());
    }
    /**
     * Sets the payload property value. Payload. (UTF8 encoded byte array)
     * @param value Value to set for the payload property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPayload(@javax.annotation.Nullable final byte[] value) {
        this._payload = value;
    }
    /**
     * Sets the payloadFileName property value. Payload file name (.mobileconfig
     * @param value Value to set for the payloadFileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPayloadFileName(@javax.annotation.Nullable final String value) {
        this._payloadFileName = value;
    }
    /**
     * Sets the payloadName property value. Name that is displayed to the user.
     * @param value Value to set for the payloadName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPayloadName(@javax.annotation.Nullable final String value) {
        this._payloadName = value;
    }
}
