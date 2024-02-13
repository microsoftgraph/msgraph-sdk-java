package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DnsEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new {@link DnsEvidence} and sets the default values.
     */
    public DnsEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.dnsEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DnsEvidence}
     */
    @jakarta.annotation.Nonnull
    public static DnsEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DnsEvidence();
    }
    /**
     * Gets the dnsServerIp property value. The dnsServerIp property
     * @return a {@link IpEvidence}
     */
    @jakarta.annotation.Nullable
    public IpEvidence getDnsServerIp() {
        return this.backingStore.get("dnsServerIp");
    }
    /**
     * Gets the domainName property value. The domainName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDomainName() {
        return this.backingStore.get("domainName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("dnsServerIp", (n) -> { this.setDnsServerIp(n.getObjectValue(IpEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("domainName", (n) -> { this.setDomainName(n.getStringValue()); });
        deserializerMap.put("hostIpAddress", (n) -> { this.setHostIpAddress(n.getObjectValue(IpEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("ipAddresses", (n) -> { this.setIpAddresses(n.getCollectionOfObjectValues(IpEvidence::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hostIpAddress property value. The hostIpAddress property
     * @return a {@link IpEvidence}
     */
    @jakarta.annotation.Nullable
    public IpEvidence getHostIpAddress() {
        return this.backingStore.get("hostIpAddress");
    }
    /**
     * Gets the ipAddresses property value. The ipAddresses property
     * @return a {@link java.util.List<IpEvidence>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IpEvidence> getIpAddresses() {
        return this.backingStore.get("ipAddresses");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("dnsServerIp", this.getDnsServerIp());
        writer.writeStringValue("domainName", this.getDomainName());
        writer.writeObjectValue("hostIpAddress", this.getHostIpAddress());
        writer.writeCollectionOfObjectValues("ipAddresses", this.getIpAddresses());
    }
    /**
     * Sets the dnsServerIp property value. The dnsServerIp property
     * @param value Value to set for the dnsServerIp property.
     */
    public void setDnsServerIp(@jakarta.annotation.Nullable final IpEvidence value) {
        this.backingStore.set("dnsServerIp", value);
    }
    /**
     * Sets the domainName property value. The domainName property
     * @param value Value to set for the domainName property.
     */
    public void setDomainName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("domainName", value);
    }
    /**
     * Sets the hostIpAddress property value. The hostIpAddress property
     * @param value Value to set for the hostIpAddress property.
     */
    public void setHostIpAddress(@jakarta.annotation.Nullable final IpEvidence value) {
        this.backingStore.set("hostIpAddress", value);
    }
    /**
     * Sets the ipAddresses property value. The ipAddresses property
     * @param value Value to set for the ipAddresses property.
     */
    public void setIpAddresses(@jakarta.annotation.Nullable final java.util.List<IpEvidence> value) {
        this.backingStore.set("ipAddresses", value);
    }
}
