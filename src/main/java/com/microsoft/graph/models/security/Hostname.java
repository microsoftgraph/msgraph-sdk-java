package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Hostname extends Host implements Parsable {
    /**
     * The company or individual who registered this hostname, from WHOIS data.
     */
    private String registrant;
    /**
     * The registrar for this hostname, from WHOIS data.
     */
    private String registrar;
    /**
     * Instantiates a new hostname and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Hostname() {
        super();
        this.setOdataType("#microsoft.graph.security.hostname");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a hostname
     */
    @javax.annotation.Nonnull
    public static Hostname createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Hostname();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("registrant", (n) -> { this.setRegistrant(n.getStringValue()); });
        deserializerMap.put("registrar", (n) -> { this.setRegistrar(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the registrant property value. The company or individual who registered this hostname, from WHOIS data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegistrant() {
        return this.registrant;
    }
    /**
     * Gets the registrar property value. The registrar for this hostname, from WHOIS data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegistrar() {
        return this.registrar;
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
        writer.writeStringValue("registrant", this.getRegistrant());
        writer.writeStringValue("registrar", this.getRegistrar());
    }
    /**
     * Sets the registrant property value. The company or individual who registered this hostname, from WHOIS data.
     * @param value Value to set for the registrant property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistrant(@javax.annotation.Nullable final String value) {
        this.registrant = value;
    }
    /**
     * Sets the registrar property value. The registrar for this hostname, from WHOIS data.
     * @param value Value to set for the registrar property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistrar(@javax.annotation.Nullable final String value) {
        this.registrar = value;
    }
}
