package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This topic provides descriptions of the declared methods, properties and relationships exposed by the iosCustomConfiguration resource.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosCustomConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Payload. (UTF8 encoded byte array)
     */
    private byte[] payload;
    /**
     * Payload file name (.mobileconfig
     */
    private String payloadFileName;
    /**
     * Name that is displayed to the user.
     */
    private String payloadName;
    /**
     * Instantiates a new IosCustomConfiguration and sets the default values.
     */
    public IosCustomConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosCustomConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosCustomConfiguration
     */
    @jakarta.annotation.Nonnull
    public static IosCustomConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosCustomConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("payload", (n) -> { this.setPayload(n.getByteArrayValue()); });
        deserializerMap.put("payloadFileName", (n) -> { this.setPayloadFileName(n.getStringValue()); });
        deserializerMap.put("payloadName", (n) -> { this.setPayloadName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the payload property value. Payload. (UTF8 encoded byte array)
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getPayload() {
        return this.payload;
    }
    /**
     * Gets the payloadFileName property value. Payload file name (.mobileconfig
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPayloadFileName() {
        return this.payloadFileName;
    }
    /**
     * Gets the payloadName property value. Name that is displayed to the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPayloadName() {
        return this.payloadName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("payload", this.getPayload());
        writer.writeStringValue("payloadFileName", this.getPayloadFileName());
        writer.writeStringValue("payloadName", this.getPayloadName());
    }
    /**
     * Sets the payload property value. Payload. (UTF8 encoded byte array)
     * @param value Value to set for the payload property.
     */
    public void setPayload(@jakarta.annotation.Nullable final byte[] value) {
        this.payload = value;
    }
    /**
     * Sets the payloadFileName property value. Payload file name (.mobileconfig
     * @param value Value to set for the payloadFileName property.
     */
    public void setPayloadFileName(@jakarta.annotation.Nullable final String value) {
        this.payloadFileName = value;
    }
    /**
     * Sets the payloadName property value. Name that is displayed to the user.
     * @param value Value to set for the payloadName property.
     */
    public void setPayloadName(@jakarta.annotation.Nullable final String value) {
        this.payloadName = value;
    }
}
