package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IpNamedLocation extends NamedLocation implements Parsable {
    /**
     * List of IP address ranges in IPv4 CIDR format (e.g. 1.2.3.4/32) or any allowable IPv6 format from IETF RFC5969. Required.
     */
    private java.util.List<IpRange> ipRanges;
    /**
     * true if this location is explicitly trusted. Optional. Default value is false.
     */
    private Boolean isTrusted;
    /**
     * Instantiates a new ipNamedLocation and sets the default values.
     */
    public IpNamedLocation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ipNamedLocation
     */
    @jakarta.annotation.Nonnull
    public static IpNamedLocation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IpNamedLocation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("ipRanges", (n) -> { this.setIpRanges(n.getCollectionOfObjectValues(IpRange::createFromDiscriminatorValue)); });
        deserializerMap.put("isTrusted", (n) -> { this.setIsTrusted(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ipRanges property value. List of IP address ranges in IPv4 CIDR format (e.g. 1.2.3.4/32) or any allowable IPv6 format from IETF RFC5969. Required.
     * @return a ipRange
     */
    @jakarta.annotation.Nullable
    public java.util.List<IpRange> getIpRanges() {
        return this.ipRanges;
    }
    /**
     * Gets the isTrusted property value. true if this location is explicitly trusted. Optional. Default value is false.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsTrusted() {
        return this.isTrusted;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("ipRanges", this.getIpRanges());
        writer.writeBooleanValue("isTrusted", this.getIsTrusted());
    }
    /**
     * Sets the ipRanges property value. List of IP address ranges in IPv4 CIDR format (e.g. 1.2.3.4/32) or any allowable IPv6 format from IETF RFC5969. Required.
     * @param value Value to set for the ipRanges property.
     */
    public void setIpRanges(@jakarta.annotation.Nullable final java.util.List<IpRange> value) {
        this.ipRanges = value;
    }
    /**
     * Sets the isTrusted property value. true if this location is explicitly trusted. Optional. Default value is false.
     * @param value Value to set for the isTrusted property.
     */
    public void setIsTrusted(@jakarta.annotation.Nullable final Boolean value) {
        this.isTrusted = value;
    }
}
