package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class NetworkConnection implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Name of the application managing the network connection (for example, Facebook or SMTP).
     */
    private String applicationName;
    /**
     * Destination IP address (of the network connection).
     */
    private String destinationAddress;
    /**
     * Destination domain portion of the destination URL. (for example 'www.contoso.com').
     */
    private String destinationDomain;
    /**
     * Location (by IP address mapping) associated with the destination of a network connection.
     */
    private String destinationLocation;
    /**
     * Destination port (of the network connection).
     */
    private String destinationPort;
    /**
     * Network connection URL/URI string - excluding parameters. (for example 'www.contoso.com/products/default.html')
     */
    private String destinationUrl;
    /**
     * Network connection direction. Possible values are: unknown, inbound, outbound.
     */
    private ConnectionDirection direction;
    /**
     * Date when the destination domain was registered. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime domainRegisteredDateTime;
    /**
     * The local DNS name resolution as it appears in the host's local DNS cache (for example, in case the 'hosts' file was tampered with).
     */
    private String localDnsName;
    /**
     * Network Address Translation destination IP address.
     */
    private String natDestinationAddress;
    /**
     * Network Address Translation destination port.
     */
    private String natDestinationPort;
    /**
     * Network Address Translation source IP address.
     */
    private String natSourceAddress;
    /**
     * Network Address Translation source port.
     */
    private String natSourcePort;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Network protocol. Possible values are: unknown, ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader, ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader, ipv6DestinationOptions, nd, raw, ipx, spx, spxII.
     */
    private SecurityNetworkProtocol protocol;
    /**
     * Provider generated/calculated risk score of the network connection. Recommended value range of 0-1, which equates to a percentage.
     */
    private String riskScore;
    /**
     * Source (i.e. origin) IP address (of the network connection).
     */
    private String sourceAddress;
    /**
     * Location (by IP address mapping) associated with the source of a network connection.
     */
    private String sourceLocation;
    /**
     * Source (i.e. origin) IP port (of the network connection).
     */
    private String sourcePort;
    /**
     * Network connection status. Possible values are: unknown, attempted, succeeded, blocked, failed.
     */
    private ConnectionStatus status;
    /**
     * Parameters (suffix) of the destination URL.
     */
    private String urlParameters;
    /**
     * Instantiates a new networkConnection and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public NetworkConnection() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a networkConnection
     */
    @jakarta.annotation.Nonnull
    public static NetworkConnection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NetworkConnection();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the applicationName property value. Name of the application managing the network connection (for example, Facebook or SMTP).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getApplicationName() {
        return this.applicationName;
    }
    /**
     * Gets the destinationAddress property value. Destination IP address (of the network connection).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDestinationAddress() {
        return this.destinationAddress;
    }
    /**
     * Gets the destinationDomain property value. Destination domain portion of the destination URL. (for example 'www.contoso.com').
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDestinationDomain() {
        return this.destinationDomain;
    }
    /**
     * Gets the destinationLocation property value. Location (by IP address mapping) associated with the destination of a network connection.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDestinationLocation() {
        return this.destinationLocation;
    }
    /**
     * Gets the destinationPort property value. Destination port (of the network connection).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDestinationPort() {
        return this.destinationPort;
    }
    /**
     * Gets the destinationUrl property value. Network connection URL/URI string - excluding parameters. (for example 'www.contoso.com/products/default.html')
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDestinationUrl() {
        return this.destinationUrl;
    }
    /**
     * Gets the direction property value. Network connection direction. Possible values are: unknown, inbound, outbound.
     * @return a connectionDirection
     */
    @jakarta.annotation.Nullable
    public ConnectionDirection getDirection() {
        return this.direction;
    }
    /**
     * Gets the domainRegisteredDateTime property value. Date when the destination domain was registered. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDomainRegisteredDateTime() {
        return this.domainRegisteredDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
        deserializerMap.put("direction", (n) -> { this.setDirection(n.getEnumValue(ConnectionDirection.class)); });
        deserializerMap.put("domainRegisteredDateTime", (n) -> { this.setDomainRegisteredDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("localDnsName", (n) -> { this.setLocalDnsName(n.getStringValue()); });
        deserializerMap.put("natDestinationAddress", (n) -> { this.setNatDestinationAddress(n.getStringValue()); });
        deserializerMap.put("natDestinationPort", (n) -> { this.setNatDestinationPort(n.getStringValue()); });
        deserializerMap.put("natSourceAddress", (n) -> { this.setNatSourceAddress(n.getStringValue()); });
        deserializerMap.put("natSourcePort", (n) -> { this.setNatSourcePort(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("protocol", (n) -> { this.setProtocol(n.getEnumValue(SecurityNetworkProtocol.class)); });
        deserializerMap.put("riskScore", (n) -> { this.setRiskScore(n.getStringValue()); });
        deserializerMap.put("sourceAddress", (n) -> { this.setSourceAddress(n.getStringValue()); });
        deserializerMap.put("sourceLocation", (n) -> { this.setSourceLocation(n.getStringValue()); });
        deserializerMap.put("sourcePort", (n) -> { this.setSourcePort(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ConnectionStatus.class)); });
        deserializerMap.put("urlParameters", (n) -> { this.setUrlParameters(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the localDnsName property value. The local DNS name resolution as it appears in the host's local DNS cache (for example, in case the 'hosts' file was tampered with).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLocalDnsName() {
        return this.localDnsName;
    }
    /**
     * Gets the natDestinationAddress property value. Network Address Translation destination IP address.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNatDestinationAddress() {
        return this.natDestinationAddress;
    }
    /**
     * Gets the natDestinationPort property value. Network Address Translation destination port.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNatDestinationPort() {
        return this.natDestinationPort;
    }
    /**
     * Gets the natSourceAddress property value. Network Address Translation source IP address.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNatSourceAddress() {
        return this.natSourceAddress;
    }
    /**
     * Gets the natSourcePort property value. Network Address Translation source port.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNatSourcePort() {
        return this.natSourcePort;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the protocol property value. Network protocol. Possible values are: unknown, ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader, ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader, ipv6DestinationOptions, nd, raw, ipx, spx, spxII.
     * @return a securityNetworkProtocol
     */
    @jakarta.annotation.Nullable
    public SecurityNetworkProtocol getProtocol() {
        return this.protocol;
    }
    /**
     * Gets the riskScore property value. Provider generated/calculated risk score of the network connection. Recommended value range of 0-1, which equates to a percentage.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRiskScore() {
        return this.riskScore;
    }
    /**
     * Gets the sourceAddress property value. Source (i.e. origin) IP address (of the network connection).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSourceAddress() {
        return this.sourceAddress;
    }
    /**
     * Gets the sourceLocation property value. Location (by IP address mapping) associated with the source of a network connection.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSourceLocation() {
        return this.sourceLocation;
    }
    /**
     * Gets the sourcePort property value. Source (i.e. origin) IP port (of the network connection).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSourcePort() {
        return this.sourcePort;
    }
    /**
     * Gets the status property value. Network connection status. Possible values are: unknown, attempted, succeeded, blocked, failed.
     * @return a connectionStatus
     */
    @jakarta.annotation.Nullable
    public ConnectionStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the urlParameters property value. Parameters (suffix) of the destination URL.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUrlParameters() {
        return this.urlParameters;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the applicationName property value. Name of the application managing the network connection (for example, Facebook or SMTP).
     * @param value Value to set for the applicationName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setApplicationName(@jakarta.annotation.Nullable final String value) {
        this.applicationName = value;
    }
    /**
     * Sets the destinationAddress property value. Destination IP address (of the network connection).
     * @param value Value to set for the destinationAddress property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDestinationAddress(@jakarta.annotation.Nullable final String value) {
        this.destinationAddress = value;
    }
    /**
     * Sets the destinationDomain property value. Destination domain portion of the destination URL. (for example 'www.contoso.com').
     * @param value Value to set for the destinationDomain property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDestinationDomain(@jakarta.annotation.Nullable final String value) {
        this.destinationDomain = value;
    }
    /**
     * Sets the destinationLocation property value. Location (by IP address mapping) associated with the destination of a network connection.
     * @param value Value to set for the destinationLocation property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDestinationLocation(@jakarta.annotation.Nullable final String value) {
        this.destinationLocation = value;
    }
    /**
     * Sets the destinationPort property value. Destination port (of the network connection).
     * @param value Value to set for the destinationPort property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDestinationPort(@jakarta.annotation.Nullable final String value) {
        this.destinationPort = value;
    }
    /**
     * Sets the destinationUrl property value. Network connection URL/URI string - excluding parameters. (for example 'www.contoso.com/products/default.html')
     * @param value Value to set for the destinationUrl property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDestinationUrl(@jakarta.annotation.Nullable final String value) {
        this.destinationUrl = value;
    }
    /**
     * Sets the direction property value. Network connection direction. Possible values are: unknown, inbound, outbound.
     * @param value Value to set for the direction property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDirection(@jakarta.annotation.Nullable final ConnectionDirection value) {
        this.direction = value;
    }
    /**
     * Sets the domainRegisteredDateTime property value. Date when the destination domain was registered. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the domainRegisteredDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDomainRegisteredDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.domainRegisteredDateTime = value;
    }
    /**
     * Sets the localDnsName property value. The local DNS name resolution as it appears in the host's local DNS cache (for example, in case the 'hosts' file was tampered with).
     * @param value Value to set for the localDnsName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLocalDnsName(@jakarta.annotation.Nullable final String value) {
        this.localDnsName = value;
    }
    /**
     * Sets the natDestinationAddress property value. Network Address Translation destination IP address.
     * @param value Value to set for the natDestinationAddress property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNatDestinationAddress(@jakarta.annotation.Nullable final String value) {
        this.natDestinationAddress = value;
    }
    /**
     * Sets the natDestinationPort property value. Network Address Translation destination port.
     * @param value Value to set for the natDestinationPort property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNatDestinationPort(@jakarta.annotation.Nullable final String value) {
        this.natDestinationPort = value;
    }
    /**
     * Sets the natSourceAddress property value. Network Address Translation source IP address.
     * @param value Value to set for the natSourceAddress property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNatSourceAddress(@jakarta.annotation.Nullable final String value) {
        this.natSourceAddress = value;
    }
    /**
     * Sets the natSourcePort property value. Network Address Translation source port.
     * @param value Value to set for the natSourcePort property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNatSourcePort(@jakarta.annotation.Nullable final String value) {
        this.natSourcePort = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the protocol property value. Network protocol. Possible values are: unknown, ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader, ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader, ipv6DestinationOptions, nd, raw, ipx, spx, spxII.
     * @param value Value to set for the protocol property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setProtocol(@jakarta.annotation.Nullable final SecurityNetworkProtocol value) {
        this.protocol = value;
    }
    /**
     * Sets the riskScore property value. Provider generated/calculated risk score of the network connection. Recommended value range of 0-1, which equates to a percentage.
     * @param value Value to set for the riskScore property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRiskScore(@jakarta.annotation.Nullable final String value) {
        this.riskScore = value;
    }
    /**
     * Sets the sourceAddress property value. Source (i.e. origin) IP address (of the network connection).
     * @param value Value to set for the sourceAddress property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSourceAddress(@jakarta.annotation.Nullable final String value) {
        this.sourceAddress = value;
    }
    /**
     * Sets the sourceLocation property value. Location (by IP address mapping) associated with the source of a network connection.
     * @param value Value to set for the sourceLocation property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSourceLocation(@jakarta.annotation.Nullable final String value) {
        this.sourceLocation = value;
    }
    /**
     * Sets the sourcePort property value. Source (i.e. origin) IP port (of the network connection).
     * @param value Value to set for the sourcePort property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSourcePort(@jakarta.annotation.Nullable final String value) {
        this.sourcePort = value;
    }
    /**
     * Sets the status property value. Network connection status. Possible values are: unknown, attempted, succeeded, blocked, failed.
     * @param value Value to set for the status property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStatus(@jakarta.annotation.Nullable final ConnectionStatus value) {
        this.status = value;
    }
    /**
     * Sets the urlParameters property value. Parameters (suffix) of the destination URL.
     * @param value Value to set for the urlParameters property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUrlParameters(@jakarta.annotation.Nullable final String value) {
        this.urlParameters = value;
    }
}
