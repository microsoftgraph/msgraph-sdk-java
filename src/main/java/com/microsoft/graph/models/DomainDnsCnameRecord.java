package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DomainDnsCnameRecord extends DomainDnsRecord implements Parsable {
    /**
     * The canonical name of the CNAME record. Used to configure the CNAME record at the DNS host.
     */
    private String canonicalName;
    /**
     * Instantiates a new DomainDnsCnameRecord and sets the default values.
     */
    public DomainDnsCnameRecord() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DomainDnsCnameRecord
     */
    @jakarta.annotation.Nonnull
    public static DomainDnsCnameRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DomainDnsCnameRecord();
    }
    /**
     * Gets the canonicalName property value. The canonical name of the CNAME record. Used to configure the CNAME record at the DNS host.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCanonicalName() {
        return this.canonicalName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("canonicalName", (n) -> { this.setCanonicalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("canonicalName", this.getCanonicalName());
    }
    /**
     * Sets the canonicalName property value. The canonical name of the CNAME record. Used to configure the CNAME record at the DNS host.
     * @param value Value to set for the canonicalName property.
     */
    public void setCanonicalName(@jakarta.annotation.Nullable final String value) {
        this.canonicalName = value;
    }
}
