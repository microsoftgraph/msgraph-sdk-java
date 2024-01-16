package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NetworkConnectionEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new NetworkConnectionEvidence and sets the default values.
     */
    public NetworkConnectionEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.networkConnectionEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a NetworkConnectionEvidence
     */
    @jakarta.annotation.Nonnull
    public static NetworkConnectionEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NetworkConnectionEvidence();
    }
    /**
     * Gets the destinationAddress property value. The destinationAddress property
     * @return a IpEvidence
     */
    @jakarta.annotation.Nullable
    public IpEvidence getDestinationAddress() {
        return this.backingStore.get("destinationAddress");
    }
    /**
     * Gets the destinationPort property value. The destinationPort property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDestinationPort() {
        return this.backingStore.get("destinationPort");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("destinationAddress", (n) -> { this.setDestinationAddress(n.getObjectValue(IpEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("destinationPort", (n) -> { this.setDestinationPort(n.getIntegerValue()); });
        deserializerMap.put("protocol", (n) -> { this.setProtocol(n.getEnumValue(ProtocolType::forValue)); });
        deserializerMap.put("sourceAddress", (n) -> { this.setSourceAddress(n.getObjectValue(IpEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("sourcePort", (n) -> { this.setSourcePort(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the protocol property value. The protocol property
     * @return a ProtocolType
     */
    @jakarta.annotation.Nullable
    public ProtocolType getProtocol() {
        return this.backingStore.get("protocol");
    }
    /**
     * Gets the sourceAddress property value. The sourceAddress property
     * @return a IpEvidence
     */
    @jakarta.annotation.Nullable
    public IpEvidence getSourceAddress() {
        return this.backingStore.get("sourceAddress");
    }
    /**
     * Gets the sourcePort property value. The sourcePort property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSourcePort() {
        return this.backingStore.get("sourcePort");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("destinationAddress", this.getDestinationAddress());
        writer.writeIntegerValue("destinationPort", this.getDestinationPort());
        writer.writeEnumValue("protocol", this.getProtocol());
        writer.writeObjectValue("sourceAddress", this.getSourceAddress());
        writer.writeIntegerValue("sourcePort", this.getSourcePort());
    }
    /**
     * Sets the destinationAddress property value. The destinationAddress property
     * @param value Value to set for the destinationAddress property.
     */
    public void setDestinationAddress(@jakarta.annotation.Nullable final IpEvidence value) {
        this.backingStore.set("destinationAddress", value);
    }
    /**
     * Sets the destinationPort property value. The destinationPort property
     * @param value Value to set for the destinationPort property.
     */
    public void setDestinationPort(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("destinationPort", value);
    }
    /**
     * Sets the protocol property value. The protocol property
     * @param value Value to set for the protocol property.
     */
    public void setProtocol(@jakarta.annotation.Nullable final ProtocolType value) {
        this.backingStore.set("protocol", value);
    }
    /**
     * Sets the sourceAddress property value. The sourceAddress property
     * @param value Value to set for the sourceAddress property.
     */
    public void setSourceAddress(@jakarta.annotation.Nullable final IpEvidence value) {
        this.backingStore.set("sourceAddress", value);
    }
    /**
     * Sets the sourcePort property value. The sourcePort property
     * @param value Value to set for the sourcePort property.
     */
    public void setSourcePort(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("sourcePort", value);
    }
}
