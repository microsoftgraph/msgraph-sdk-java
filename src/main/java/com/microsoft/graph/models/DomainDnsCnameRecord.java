package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DomainDnsCnameRecord extends DomainDnsRecord implements Parsable {
    /** The canonical name of the CNAME record. Used to configure the CNAME record at the DNS host. */
    private String _canonicalName;
    /**
     * Instantiates a new DomainDnsCnameRecord and sets the default values.
     * @return a void
     */
    public DomainDnsCnameRecord() {
        super();
        this.setOdataType("#microsoft.graph.domainDnsCnameRecord");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DomainDnsCnameRecord
     */
    @javax.annotation.Nonnull
    public static DomainDnsCnameRecord createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DomainDnsCnameRecord();
    }
    /**
     * Gets the canonicalName property value. The canonical name of the CNAME record. Used to configure the CNAME record at the DNS host.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCanonicalName() {
        return this._canonicalName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DomainDnsCnameRecord currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("canonicalName", (n) -> { currentObject.setCanonicalName(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("canonicalName", this.getCanonicalName());
    }
    /**
     * Sets the canonicalName property value. The canonical name of the CNAME record. Used to configure the CNAME record at the DNS host.
     * @param value Value to set for the canonicalName property.
     * @return a void
     */
    public void setCanonicalName(@javax.annotation.Nullable final String value) {
        this._canonicalName = value;
    }
}
