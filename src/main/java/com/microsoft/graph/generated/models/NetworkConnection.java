package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NetworkConnection implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link NetworkConnection} and sets the default values.
     */
    public NetworkConnection() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link NetworkConnection}
     */
    @jakarta.annotation.Nonnull
    public static NetworkConnection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NetworkConnection();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the applicationName property value. Name of the application managing the network connection (for example, Facebook or SMTP).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplicationName() {
        return this.backingStore.get("applicationName");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the destinationAddress property value. Destination IP address (of the network connection).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationAddress() {
        return this.backingStore.get("destinationAddress");
    }
    /**
     * Gets the destinationDomain property value. Destination domain portion of the destination URL. (for example &apos;www.contoso.com&apos;).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationDomain() {
        return this.backingStore.get("destinationDomain");
    }
    /**
     * Gets the destinationLocation property value. Location (by IP address mapping) associated with the destination of a network connection.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationLocation() {
        return this.backingStore.get("destinationLocation");
    }
    /**
     * Gets the destinationPort property value. Destination port (of the network connection).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationPort() {
        return this.backingStore.get("destinationPort");
    }
    /**
     * Gets the destinationUrl property value. Network connection URL/URI string - excluding parameters. (for example &apos;www.contoso.com/products/default.html&apos;)
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationUrl() {
        return this.backingStore.get("destinationUrl");
    }
    /**
     * Gets the direction property value. Network connection direction. The possible values are: unknown, inbound, outbound.
     * @return a {@link ConnectionDirection}
     */
    @jakarta.annotation.Nullable
    public ConnectionDirection getDirection() {
        return this.backingStore.get("direction");
    }
    /**
     * Gets the domainRegisteredDateTime property value. Date when the destination domain was registered. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDomainRegisteredDateTime() {
        return this.backingStore.get("domainRegisteredDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(21);
        deserializerMap.put("applicationName", (n) -> { this.setApplicationName(n.getStringValue()); });
        deserializerMap.put("destinationAddress", (n) -> { this.setDestinationAddress(n.getStringValue()); });
        deserializerMap.put("destinationDomain", (n) -> { this.setDestinationDomain(n.getStringValue()); });
        deserializerMap.put("destinationLocation", (n) -> { this.setDestinationLocation(n.getStringValue()); });
        deserializerMap.put("destinationPort", (n) -> { this.setDestinationPort(n.getStringValue()); });
        deserializerMap.put("destinationUrl", (n) -> { this.setDestinationUrl(n.getStringValue()); });
        deserializerMap.put("direction", (n) -> { this.setDirection(n.getEnumValue(ConnectionDirection::forValue)); });
        deserializerMap.put("domainRegisteredDateTime", (n) -> { this.setDomainRegisteredDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("localDnsName", (n) -> { this.setLocalDnsName(n.getStringValue()); });
        deserializerMap.put("natDestinationAddress", (n) -> { this.setNatDestinationAddress(n.getStringValue()); });
        deserializerMap.put("natDestinationPort", (n) -> { this.setNatDestinationPort(n.getStringValue()); });
        deserializerMap.put("natSourceAddress", (n) -> { this.setNatSourceAddress(n.getStringValue()); });
        deserializerMap.put("natSourcePort", (n) -> { this.setNatSourcePort(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("protocol", (n) -> { this.setProtocol(n.getEnumValue(SecurityNetworkProtocol::forValue)); });
        deserializerMap.put("riskScore", (n) -> { this.setRiskScore(n.getStringValue()); });
        deserializerMap.put("sourceAddress", (n) -> { this.setSourceAddress(n.getStringValue()); });
        deserializerMap.put("sourceLocation", (n) -> { this.setSourceLocation(n.getStringValue()); });
        deserializerMap.put("sourcePort", (n) -> { this.setSourcePort(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ConnectionStatus::forValue)); });
        deserializerMap.put("urlParameters", (n) -> { this.setUrlParameters(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the localDnsName property value. The local DNS name resolution as it appears in the host&apos;s local DNS cache (for example, in case the &apos;hosts&apos; file was tampered with).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocalDnsName() {
        return this.backingStore.get("localDnsName");
    }
    /**
     * Gets the natDestinationAddress property value. Network Address Translation destination IP address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNatDestinationAddress() {
        return this.backingStore.get("natDestinationAddress");
    }
    /**
     * Gets the natDestinationPort property value. Network Address Translation destination port.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNatDestinationPort() {
        return this.backingStore.get("natDestinationPort");
    }
    /**
     * Gets the natSourceAddress property value. Network Address Translation source IP address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNatSourceAddress() {
        return this.backingStore.get("natSourceAddress");
    }
    /**
     * Gets the natSourcePort property value. Network Address Translation source port.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNatSourcePort() {
        return this.backingStore.get("natSourcePort");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the protocol property value. Network protocol. The possible values are: unknown, ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader, ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader, ipv6DestinationOptions, nd, raw, ipx, spx, spxII.
     * @return a {@link SecurityNetworkProtocol}
     */
    @jakarta.annotation.Nullable
    public SecurityNetworkProtocol getProtocol() {
        return this.backingStore.get("protocol");
    }
    /**
     * Gets the riskScore property value. Provider generated/calculated risk score of the network connection. Recommended value range of 0-1, which equates to a percentage.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRiskScore() {
        return this.backingStore.get("riskScore");
    }
    /**
     * Gets the sourceAddress property value. Source (i.e. origin) IP address (of the network connection).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceAddress() {
        return this.backingStore.get("sourceAddress");
    }
    /**
     * Gets the sourceLocation property value. Location (by IP address mapping) associated with the source of a network connection.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceLocation() {
        return this.backingStore.get("sourceLocation");
    }
    /**
     * Gets the sourcePort property value. Source (i.e. origin) IP port (of the network connection).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourcePort() {
        return this.backingStore.get("sourcePort");
    }
    /**
     * Gets the status property value. Network connection status. The possible values are: unknown, attempted, succeeded, blocked, failed.
     * @return a {@link ConnectionStatus}
     */
    @jakarta.annotation.Nullable
    public ConnectionStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the urlParameters property value. Parameters (suffix) of the destination URL.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUrlParameters() {
        return this.backingStore.get("urlParameters");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("applicationName", this.getApplicationName());
        writer.writeStringValue("destinationAddress", this.getDestinationAddress());
        writer.writeStringValue("destinationDomain", this.getDestinationDomain());
        writer.writeStringValue("destinationLocation", this.getDestinationLocation());
        writer.writeStringValue("destinationPort", this.getDestinationPort());
        writer.writeStringValue("destinationUrl", this.getDestinationUrl());
        writer.writeEnumValue("direction", this.getDirection());
        writer.writeOffsetDateTimeValue("domainRegisteredDateTime", this.getDomainRegisteredDateTime());
        writer.writeStringValue("localDnsName", this.getLocalDnsName());
        writer.writeStringValue("natDestinationAddress", this.getNatDestinationAddress());
        writer.writeStringValue("natDestinationPort", this.getNatDestinationPort());
        writer.writeStringValue("natSourceAddress", this.getNatSourceAddress());
        writer.writeStringValue("natSourcePort", this.getNatSourcePort());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("protocol", this.getProtocol());
        writer.writeStringValue("riskScore", this.getRiskScore());
        writer.writeStringValue("sourceAddress", this.getSourceAddress());
        writer.writeStringValue("sourceLocation", this.getSourceLocation());
        writer.writeStringValue("sourcePort", this.getSourcePort());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("urlParameters", this.getUrlParameters());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the applicationName property value. Name of the application managing the network connection (for example, Facebook or SMTP).
     * @param value Value to set for the applicationName property.
     */
    public void setApplicationName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("applicationName", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the destinationAddress property value. Destination IP address (of the network connection).
     * @param value Value to set for the destinationAddress property.
     */
    public void setDestinationAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("destinationAddress", value);
    }
    /**
     * Sets the destinationDomain property value. Destination domain portion of the destination URL. (for example &apos;www.contoso.com&apos;).
     * @param value Value to set for the destinationDomain property.
     */
    public void setDestinationDomain(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("destinationDomain", value);
    }
    /**
     * Sets the destinationLocation property value. Location (by IP address mapping) associated with the destination of a network connection.
     * @param value Value to set for the destinationLocation property.
     */
    public void setDestinationLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("destinationLocation", value);
    }
    /**
     * Sets the destinationPort property value. Destination port (of the network connection).
     * @param value Value to set for the destinationPort property.
     */
    public void setDestinationPort(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("destinationPort", value);
    }
    /**
     * Sets the destinationUrl property value. Network connection URL/URI string - excluding parameters. (for example &apos;www.contoso.com/products/default.html&apos;)
     * @param value Value to set for the destinationUrl property.
     */
    public void setDestinationUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("destinationUrl", value);
    }
    /**
     * Sets the direction property value. Network connection direction. The possible values are: unknown, inbound, outbound.
     * @param value Value to set for the direction property.
     */
    public void setDirection(@jakarta.annotation.Nullable final ConnectionDirection value) {
        this.backingStore.set("direction", value);
    }
    /**
     * Sets the domainRegisteredDateTime property value. Date when the destination domain was registered. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the domainRegisteredDateTime property.
     */
    public void setDomainRegisteredDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("domainRegisteredDateTime", value);
    }
    /**
     * Sets the localDnsName property value. The local DNS name resolution as it appears in the host&apos;s local DNS cache (for example, in case the &apos;hosts&apos; file was tampered with).
     * @param value Value to set for the localDnsName property.
     */
    public void setLocalDnsName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("localDnsName", value);
    }
    /**
     * Sets the natDestinationAddress property value. Network Address Translation destination IP address.
     * @param value Value to set for the natDestinationAddress property.
     */
    public void setNatDestinationAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("natDestinationAddress", value);
    }
    /**
     * Sets the natDestinationPort property value. Network Address Translation destination port.
     * @param value Value to set for the natDestinationPort property.
     */
    public void setNatDestinationPort(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("natDestinationPort", value);
    }
    /**
     * Sets the natSourceAddress property value. Network Address Translation source IP address.
     * @param value Value to set for the natSourceAddress property.
     */
    public void setNatSourceAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("natSourceAddress", value);
    }
    /**
     * Sets the natSourcePort property value. Network Address Translation source port.
     * @param value Value to set for the natSourcePort property.
     */
    public void setNatSourcePort(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("natSourcePort", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the protocol property value. Network protocol. The possible values are: unknown, ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader, ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader, ipv6DestinationOptions, nd, raw, ipx, spx, spxII.
     * @param value Value to set for the protocol property.
     */
    public void setProtocol(@jakarta.annotation.Nullable final SecurityNetworkProtocol value) {
        this.backingStore.set("protocol", value);
    }
    /**
     * Sets the riskScore property value. Provider generated/calculated risk score of the network connection. Recommended value range of 0-1, which equates to a percentage.
     * @param value Value to set for the riskScore property.
     */
    public void setRiskScore(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("riskScore", value);
    }
    /**
     * Sets the sourceAddress property value. Source (i.e. origin) IP address (of the network connection).
     * @param value Value to set for the sourceAddress property.
     */
    public void setSourceAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceAddress", value);
    }
    /**
     * Sets the sourceLocation property value. Location (by IP address mapping) associated with the source of a network connection.
     * @param value Value to set for the sourceLocation property.
     */
    public void setSourceLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceLocation", value);
    }
    /**
     * Sets the sourcePort property value. Source (i.e. origin) IP port (of the network connection).
     * @param value Value to set for the sourcePort property.
     */
    public void setSourcePort(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourcePort", value);
    }
    /**
     * Sets the status property value. Network connection status. The possible values are: unknown, attempted, succeeded, blocked, failed.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ConnectionStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the urlParameters property value. Parameters (suffix) of the destination URL.
     * @param value Value to set for the urlParameters property.
     */
    public void setUrlParameters(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("urlParameters", value);
    }
}
