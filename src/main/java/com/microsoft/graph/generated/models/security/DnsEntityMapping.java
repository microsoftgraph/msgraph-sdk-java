package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DnsEntityMapping extends EntityMapping implements Parsable {
    /**
     * Instantiates a new {@link DnsEntityMapping} and sets the default values.
     */
    public DnsEntityMapping() {
        super();
        this.setOdataType("#microsoft.graph.security.dnsEntityMapping");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DnsEntityMapping}
     */
    @jakarta.annotation.Nonnull
    public static DnsEntityMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DnsEntityMapping();
    }
    /**
     * Gets the domainNameColumn property value. Name of the detection query column that maps to the domain name of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDomainNameColumn() {
        return this.backingStore.get("domainNameColumn");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("domainNameColumn", (n) -> { this.setDomainNameColumn(n.getStringValue()); });
        deserializerMap.put("hostIpAddressColumn", (n) -> { this.setHostIpAddressColumn(n.getStringValue()); });
        deserializerMap.put("serverIpColumn", (n) -> { this.setServerIpColumn(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hostIpAddressColumn property value. Name of the detection query column that maps to the host IP address of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHostIpAddressColumn() {
        return this.backingStore.get("hostIpAddressColumn");
    }
    /**
     * Gets the serverIpColumn property value. Name of the detection query column that maps to the server IP address of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServerIpColumn() {
        return this.backingStore.get("serverIpColumn");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("domainNameColumn", this.getDomainNameColumn());
        writer.writeStringValue("hostIpAddressColumn", this.getHostIpAddressColumn());
        writer.writeStringValue("serverIpColumn", this.getServerIpColumn());
    }
    /**
     * Sets the domainNameColumn property value. Name of the detection query column that maps to the domain name of the alert entity.
     * @param value Value to set for the domainNameColumn property.
     */
    public void setDomainNameColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("domainNameColumn", value);
    }
    /**
     * Sets the hostIpAddressColumn property value. Name of the detection query column that maps to the host IP address of the alert entity.
     * @param value Value to set for the hostIpAddressColumn property.
     */
    public void setHostIpAddressColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("hostIpAddressColumn", value);
    }
    /**
     * Sets the serverIpColumn property value. Name of the detection query column that maps to the server IP address of the alert entity.
     * @param value Value to set for the serverIpColumn property.
     */
    public void setServerIpColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serverIpColumn", value);
    }
}
