package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IPv6CidrRange extends IpRange implements Parsable {
    /**
     * IPv6 address in CIDR notation. Not nullable.
     */
    private String cidrAddress;
    /**
     * Instantiates a new iPv6CidrRange and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IPv6CidrRange() {
        super();
        this.setOdataType("#microsoft.graph.iPv6CidrRange");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iPv6CidrRange
     */
    @javax.annotation.Nonnull
    public static IPv6CidrRange createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IPv6CidrRange();
    }
    /**
     * Gets the cidrAddress property value. IPv6 address in CIDR notation. Not nullable.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCidrAddress() {
        return this.cidrAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cidrAddress", (n) -> { this.setCidrAddress(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeStringValue("cidrAddress", this.getCidrAddress());
    }
    /**
     * Sets the cidrAddress property value. IPv6 address in CIDR notation. Not nullable.
     * @param value Value to set for the cidrAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCidrAddress(@javax.annotation.Nullable final String value) {
        this.cidrAddress = value;
    }
}
