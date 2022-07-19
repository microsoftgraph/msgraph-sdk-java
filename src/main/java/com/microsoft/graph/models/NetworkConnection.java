package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class NetworkConnection implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Name of the application managing the network connection (for example, Facebook, SMTP, etc.). */
    private String _applicationName;
    /** Destination IP address (of the network connection). */
    private String _destinationAddress;
    /** Destination domain portion of the destination URL. (for example 'www.contoso.com'). */
    private String _destinationDomain;
    /** Location (by IP address mapping) associated with the destination of a network connection. */
    private String _destinationLocation;
    /** Destination port (of the network connection). */
    private String _destinationPort;
    /** Network connection URL/URI string - excluding parameters. (for example 'www.contoso.com/products/default.html') */
    private String _destinationUrl;
    /** Network connection direction. Possible values are: unknown, inbound, outbound. */
    private ConnectionDirection _direction;
    /** Date when the destination domain was registered. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _domainRegisteredDateTime;
    /** The local DNS name resolution as it appears in the host's local DNS cache (for example, in case the 'hosts' file was tampered with). */
    private String _localDnsName;
    /** Network Address Translation destination IP address. */
    private String _natDestinationAddress;
    /** Network Address Translation destination port. */
    private String _natDestinationPort;
    /** Network Address Translation source IP address. */
    private String _natSourceAddress;
    /** Network Address Translation source port. */
    private String _natSourcePort;
    /** The OdataType property */
    private String _odataType;
    /** Network protocol. Possible values are: unknown, ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader, ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader, ipv6DestinationOptions, nd, raw, ipx, spx, spxII. */
    private SecurityNetworkProtocol _protocol;
    /** Provider generated/calculated risk score of the network connection. Recommended value range of 0-1, which equates to a percentage. */
    private String _riskScore;
    /** Source (i.e. origin) IP address (of the network connection). */
    private String _sourceAddress;
    /** Location (by IP address mapping) associated with the source of a network connection. */
    private String _sourceLocation;
    /** Source (i.e. origin) IP port (of the network connection). */
    private String _sourcePort;
    /** Network connection status. Possible values are: unknown, attempted, succeeded, blocked, failed. */
    private ConnectionStatus _status;
    /** Parameters (suffix) of the destination URL. */
    private String _urlParameters;
    /**
     * Instantiates a new networkConnection and sets the default values.
     * @return a void
     */
    public NetworkConnection() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.networkConnection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a networkConnection
     */
    @javax.annotation.Nonnull
    public static NetworkConnection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NetworkConnection();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the applicationName property value. Name of the application managing the network connection (for example, Facebook, SMTP, etc.).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationName() {
        return this._applicationName;
    }
    /**
     * Gets the destinationAddress property value. Destination IP address (of the network connection).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDestinationAddress() {
        return this._destinationAddress;
    }
    /**
     * Gets the destinationDomain property value. Destination domain portion of the destination URL. (for example 'www.contoso.com').
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDestinationDomain() {
        return this._destinationDomain;
    }
    /**
     * Gets the destinationLocation property value. Location (by IP address mapping) associated with the destination of a network connection.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDestinationLocation() {
        return this._destinationLocation;
    }
    /**
     * Gets the destinationPort property value. Destination port (of the network connection).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDestinationPort() {
        return this._destinationPort;
    }
    /**
     * Gets the destinationUrl property value. Network connection URL/URI string - excluding parameters. (for example 'www.contoso.com/products/default.html')
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDestinationUrl() {
        return this._destinationUrl;
    }
    /**
     * Gets the direction property value. Network connection direction. Possible values are: unknown, inbound, outbound.
     * @return a connectionDirection
     */
    @javax.annotation.Nullable
    public ConnectionDirection getDirection() {
        return this._direction;
    }
    /**
     * Gets the domainRegisteredDateTime property value. Date when the destination domain was registered. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDomainRegisteredDateTime() {
        return this._domainRegisteredDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final NetworkConnection currentObject = this;
        return new HashMap<>(21) {{
            this.put("applicationName", (n) -> { currentObject.setApplicationName(n.getStringValue()); });
            this.put("destinationAddress", (n) -> { currentObject.setDestinationAddress(n.getStringValue()); });
            this.put("destinationDomain", (n) -> { currentObject.setDestinationDomain(n.getStringValue()); });
            this.put("destinationLocation", (n) -> { currentObject.setDestinationLocation(n.getStringValue()); });
            this.put("destinationPort", (n) -> { currentObject.setDestinationPort(n.getStringValue()); });
            this.put("destinationUrl", (n) -> { currentObject.setDestinationUrl(n.getStringValue()); });
            this.put("direction", (n) -> { currentObject.setDirection(n.getEnumValue(ConnectionDirection.class)); });
            this.put("domainRegisteredDateTime", (n) -> { currentObject.setDomainRegisteredDateTime(n.getOffsetDateTimeValue()); });
            this.put("localDnsName", (n) -> { currentObject.setLocalDnsName(n.getStringValue()); });
            this.put("natDestinationAddress", (n) -> { currentObject.setNatDestinationAddress(n.getStringValue()); });
            this.put("natDestinationPort", (n) -> { currentObject.setNatDestinationPort(n.getStringValue()); });
            this.put("natSourceAddress", (n) -> { currentObject.setNatSourceAddress(n.getStringValue()); });
            this.put("natSourcePort", (n) -> { currentObject.setNatSourcePort(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("protocol", (n) -> { currentObject.setProtocol(n.getEnumValue(SecurityNetworkProtocol.class)); });
            this.put("riskScore", (n) -> { currentObject.setRiskScore(n.getStringValue()); });
            this.put("sourceAddress", (n) -> { currentObject.setSourceAddress(n.getStringValue()); });
            this.put("sourceLocation", (n) -> { currentObject.setSourceLocation(n.getStringValue()); });
            this.put("sourcePort", (n) -> { currentObject.setSourcePort(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(ConnectionStatus.class)); });
            this.put("urlParameters", (n) -> { currentObject.setUrlParameters(n.getStringValue()); });
        }};
    }
    /**
     * Gets the localDnsName property value. The local DNS name resolution as it appears in the host's local DNS cache (for example, in case the 'hosts' file was tampered with).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocalDnsName() {
        return this._localDnsName;
    }
    /**
     * Gets the natDestinationAddress property value. Network Address Translation destination IP address.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNatDestinationAddress() {
        return this._natDestinationAddress;
    }
    /**
     * Gets the natDestinationPort property value. Network Address Translation destination port.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNatDestinationPort() {
        return this._natDestinationPort;
    }
    /**
     * Gets the natSourceAddress property value. Network Address Translation source IP address.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNatSourceAddress() {
        return this._natSourceAddress;
    }
    /**
     * Gets the natSourcePort property value. Network Address Translation source port.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNatSourcePort() {
        return this._natSourcePort;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the protocol property value. Network protocol. Possible values are: unknown, ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader, ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader, ipv6DestinationOptions, nd, raw, ipx, spx, spxII.
     * @return a securityNetworkProtocol
     */
    @javax.annotation.Nullable
    public SecurityNetworkProtocol getProtocol() {
        return this._protocol;
    }
    /**
     * Gets the riskScore property value. Provider generated/calculated risk score of the network connection. Recommended value range of 0-1, which equates to a percentage.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRiskScore() {
        return this._riskScore;
    }
    /**
     * Gets the sourceAddress property value. Source (i.e. origin) IP address (of the network connection).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceAddress() {
        return this._sourceAddress;
    }
    /**
     * Gets the sourceLocation property value. Location (by IP address mapping) associated with the source of a network connection.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceLocation() {
        return this._sourceLocation;
    }
    /**
     * Gets the sourcePort property value. Source (i.e. origin) IP port (of the network connection).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourcePort() {
        return this._sourcePort;
    }
    /**
     * Gets the status property value. Network connection status. Possible values are: unknown, attempted, succeeded, blocked, failed.
     * @return a connectionStatus
     */
    @javax.annotation.Nullable
    public ConnectionStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the urlParameters property value. Parameters (suffix) of the destination URL.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUrlParameters() {
        return this._urlParameters;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the applicationName property value. Name of the application managing the network connection (for example, Facebook, SMTP, etc.).
     * @param value Value to set for the applicationName property.
     * @return a void
     */
    public void setApplicationName(@javax.annotation.Nullable final String value) {
        this._applicationName = value;
    }
    /**
     * Sets the destinationAddress property value. Destination IP address (of the network connection).
     * @param value Value to set for the destinationAddress property.
     * @return a void
     */
    public void setDestinationAddress(@javax.annotation.Nullable final String value) {
        this._destinationAddress = value;
    }
    /**
     * Sets the destinationDomain property value. Destination domain portion of the destination URL. (for example 'www.contoso.com').
     * @param value Value to set for the destinationDomain property.
     * @return a void
     */
    public void setDestinationDomain(@javax.annotation.Nullable final String value) {
        this._destinationDomain = value;
    }
    /**
     * Sets the destinationLocation property value. Location (by IP address mapping) associated with the destination of a network connection.
     * @param value Value to set for the destinationLocation property.
     * @return a void
     */
    public void setDestinationLocation(@javax.annotation.Nullable final String value) {
        this._destinationLocation = value;
    }
    /**
     * Sets the destinationPort property value. Destination port (of the network connection).
     * @param value Value to set for the destinationPort property.
     * @return a void
     */
    public void setDestinationPort(@javax.annotation.Nullable final String value) {
        this._destinationPort = value;
    }
    /**
     * Sets the destinationUrl property value. Network connection URL/URI string - excluding parameters. (for example 'www.contoso.com/products/default.html')
     * @param value Value to set for the destinationUrl property.
     * @return a void
     */
    public void setDestinationUrl(@javax.annotation.Nullable final String value) {
        this._destinationUrl = value;
    }
    /**
     * Sets the direction property value. Network connection direction. Possible values are: unknown, inbound, outbound.
     * @param value Value to set for the direction property.
     * @return a void
     */
    public void setDirection(@javax.annotation.Nullable final ConnectionDirection value) {
        this._direction = value;
    }
    /**
     * Sets the domainRegisteredDateTime property value. Date when the destination domain was registered. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the domainRegisteredDateTime property.
     * @return a void
     */
    public void setDomainRegisteredDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._domainRegisteredDateTime = value;
    }
    /**
     * Sets the localDnsName property value. The local DNS name resolution as it appears in the host's local DNS cache (for example, in case the 'hosts' file was tampered with).
     * @param value Value to set for the localDnsName property.
     * @return a void
     */
    public void setLocalDnsName(@javax.annotation.Nullable final String value) {
        this._localDnsName = value;
    }
    /**
     * Sets the natDestinationAddress property value. Network Address Translation destination IP address.
     * @param value Value to set for the natDestinationAddress property.
     * @return a void
     */
    public void setNatDestinationAddress(@javax.annotation.Nullable final String value) {
        this._natDestinationAddress = value;
    }
    /**
     * Sets the natDestinationPort property value. Network Address Translation destination port.
     * @param value Value to set for the natDestinationPort property.
     * @return a void
     */
    public void setNatDestinationPort(@javax.annotation.Nullable final String value) {
        this._natDestinationPort = value;
    }
    /**
     * Sets the natSourceAddress property value. Network Address Translation source IP address.
     * @param value Value to set for the natSourceAddress property.
     * @return a void
     */
    public void setNatSourceAddress(@javax.annotation.Nullable final String value) {
        this._natSourceAddress = value;
    }
    /**
     * Sets the natSourcePort property value. Network Address Translation source port.
     * @param value Value to set for the natSourcePort property.
     * @return a void
     */
    public void setNatSourcePort(@javax.annotation.Nullable final String value) {
        this._natSourcePort = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the protocol property value. Network protocol. Possible values are: unknown, ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader, ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader, ipv6DestinationOptions, nd, raw, ipx, spx, spxII.
     * @param value Value to set for the protocol property.
     * @return a void
     */
    public void setProtocol(@javax.annotation.Nullable final SecurityNetworkProtocol value) {
        this._protocol = value;
    }
    /**
     * Sets the riskScore property value. Provider generated/calculated risk score of the network connection. Recommended value range of 0-1, which equates to a percentage.
     * @param value Value to set for the riskScore property.
     * @return a void
     */
    public void setRiskScore(@javax.annotation.Nullable final String value) {
        this._riskScore = value;
    }
    /**
     * Sets the sourceAddress property value. Source (i.e. origin) IP address (of the network connection).
     * @param value Value to set for the sourceAddress property.
     * @return a void
     */
    public void setSourceAddress(@javax.annotation.Nullable final String value) {
        this._sourceAddress = value;
    }
    /**
     * Sets the sourceLocation property value. Location (by IP address mapping) associated with the source of a network connection.
     * @param value Value to set for the sourceLocation property.
     * @return a void
     */
    public void setSourceLocation(@javax.annotation.Nullable final String value) {
        this._sourceLocation = value;
    }
    /**
     * Sets the sourcePort property value. Source (i.e. origin) IP port (of the network connection).
     * @param value Value to set for the sourcePort property.
     * @return a void
     */
    public void setSourcePort(@javax.annotation.Nullable final String value) {
        this._sourcePort = value;
    }
    /**
     * Sets the status property value. Network connection status. Possible values are: unknown, attempted, succeeded, blocked, failed.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final ConnectionStatus value) {
        this._status = value;
    }
    /**
     * Sets the urlParameters property value. Parameters (suffix) of the destination URL.
     * @param value Value to set for the urlParameters property.
     * @return a void
     */
    public void setUrlParameters(@javax.annotation.Nullable final String value) {
        this._urlParameters = value;
    }
}
