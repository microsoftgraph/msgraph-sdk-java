package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IpNamedLocation extends NamedLocation implements Parsable {
    /** List of IP address ranges in IPv4 CIDR format (e.g. 1.2.3.4/32) or any allowable IPv6 format from IETF RFC596. Required. */
    private java.util.List<IpRange> _ipRanges;
    /** true if this location is explicitly trusted. Optional. Default value is false. */
    private Boolean _isTrusted;
    /**
     * Instantiates a new IpNamedLocation and sets the default values.
     * @return a void
     */
    public IpNamedLocation() {
        super();
        this.setOdataType("#microsoft.graph.ipNamedLocation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IpNamedLocation
     */
    @javax.annotation.Nonnull
    public static IpNamedLocation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IpNamedLocation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IpNamedLocation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("ipRanges", (n) -> { currentObject.setIpRanges(n.getCollectionOfObjectValues(IpRange::createFromDiscriminatorValue)); });
            this.put("isTrusted", (n) -> { currentObject.setIsTrusted(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the ipRanges property value. List of IP address ranges in IPv4 CIDR format (e.g. 1.2.3.4/32) or any allowable IPv6 format from IETF RFC596. Required.
     * @return a ipRange
     */
    @javax.annotation.Nullable
    public java.util.List<IpRange> getIpRanges() {
        return this._ipRanges;
    }
    /**
     * Gets the isTrusted property value. true if this location is explicitly trusted. Optional. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsTrusted() {
        return this._isTrusted;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("ipRanges", this.getIpRanges());
        writer.writeBooleanValue("isTrusted", this.getIsTrusted());
    }
    /**
     * Sets the ipRanges property value. List of IP address ranges in IPv4 CIDR format (e.g. 1.2.3.4/32) or any allowable IPv6 format from IETF RFC596. Required.
     * @param value Value to set for the ipRanges property.
     * @return a void
     */
    public void setIpRanges(@javax.annotation.Nullable final java.util.List<IpRange> value) {
        this._ipRanges = value;
    }
    /**
     * Sets the isTrusted property value. true if this location is explicitly trusted. Optional. Default value is false.
     * @param value Value to set for the isTrusted property.
     * @return a void
     */
    public void setIsTrusted(@javax.annotation.Nullable final Boolean value) {
        this._isTrusted = value;
    }
}
