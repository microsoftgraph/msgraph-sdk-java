package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Hostname extends Host implements Parsable {
    /**
     * Instantiates a new Hostname and sets the default values.
     */
    public Hostname() {
        super();
        this.setOdataType("#microsoft.graph.security.hostname");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Hostname
     */
    @jakarta.annotation.Nonnull
    public static Hostname createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Hostname();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("registrant", (n) -> { this.setRegistrant(n.getStringValue()); });
        deserializerMap.put("registrar", (n) -> { this.setRegistrar(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the registrant property value. The company or individual who registered this hostname, from WHOIS data.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRegistrant() {
        return this.backingStore.get("registrant");
    }
    /**
     * Gets the registrar property value. The registrar for this hostname, from WHOIS data.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRegistrar() {
        return this.backingStore.get("registrar");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("registrant", this.getRegistrant());
        writer.writeStringValue("registrar", this.getRegistrar());
    }
    /**
     * Sets the registrant property value. The company or individual who registered this hostname, from WHOIS data.
     * @param value Value to set for the registrant property.
     */
    public void setRegistrant(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("registrant", value);
    }
    /**
     * Sets the registrar property value. The registrar for this hostname, from WHOIS data.
     * @param value Value to set for the registrar property.
     */
    public void setRegistrar(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("registrar", value);
    }
}
