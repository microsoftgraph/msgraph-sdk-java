package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NicEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new NicEvidence and sets the default values.
     */
    public NicEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.nicEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a NicEvidence
     */
    @jakarta.annotation.Nonnull
    public static NicEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NicEvidence();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getObjectValue(IpEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("macAddress", (n) -> { this.setMacAddress(n.getStringValue()); });
        deserializerMap.put("vlans", (n) -> { this.setVlans(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the ipAddress property value. The ipAddress property
     * @return a IpEvidence
     */
    @jakarta.annotation.Nullable
    public IpEvidence getIpAddress() {
        return this.backingStore.get("ipAddress");
    }
    /**
     * Gets the macAddress property value. The macAddress property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMacAddress() {
        return this.backingStore.get("macAddress");
    }
    /**
     * Gets the vlans property value. The vlans property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getVlans() {
        return this.backingStore.get("vlans");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("ipAddress", this.getIpAddress());
        writer.writeStringValue("macAddress", this.getMacAddress());
        writer.writeCollectionOfPrimitiveValues("vlans", this.getVlans());
    }
    /**
     * Sets the ipAddress property value. The ipAddress property
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final IpEvidence value) {
        this.backingStore.set("ipAddress", value);
    }
    /**
     * Sets the macAddress property value. The macAddress property
     * @param value Value to set for the macAddress property.
     */
    public void setMacAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("macAddress", value);
    }
    /**
     * Sets the vlans property value. The vlans property
     * @param value Value to set for the vlans property.
     */
    public void setVlans(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("vlans", value);
    }
}
