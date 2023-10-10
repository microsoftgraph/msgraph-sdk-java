package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HostSecurityState implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Host FQDN (Fully Qualified Domain Name) (for example, machine.company.com).
     */
    private String fqdn;
    /**
     * The isAzureAdJoined property
     */
    private Boolean isAzureAdJoined;
    /**
     * The isAzureAdRegistered property
     */
    private Boolean isAzureAdRegistered;
    /**
     * True if the host is domain joined to an on-premises Active Directory domain.
     */
    private Boolean isHybridAzureDomainJoined;
    /**
     * The local host name, without the DNS domain name.
     */
    private String netBiosName;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Host Operating System. (For example, Windows 10, macOS, RHEL, etc.).
     */
    private String os;
    /**
     * Private (not routable) IPv4 or IPv6 address (see RFC 1918) at the time of the alert.
     */
    private String privateIpAddress;
    /**
     * Publicly routable IPv4 or IPv6 address (see RFC 1918) at time of the alert.
     */
    private String publicIpAddress;
    /**
     * Provider-generated/calculated risk score of the host.  Recommended value range of 0-1, which equates to a percentage.
     */
    private String riskScore;
    /**
     * Instantiates a new HostSecurityState and sets the default values.
     */
    public HostSecurityState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a HostSecurityState
     */
    @jakarta.annotation.Nonnull
    public static HostSecurityState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HostSecurityState();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("fqdn", (n) -> { this.setFqdn(n.getStringValue()); });
        deserializerMap.put("isAzureAdJoined", (n) -> { this.setIsAzureAdJoined(n.getBooleanValue()); });
        deserializerMap.put("isAzureAdRegistered", (n) -> { this.setIsAzureAdRegistered(n.getBooleanValue()); });
        deserializerMap.put("isHybridAzureDomainJoined", (n) -> { this.setIsHybridAzureDomainJoined(n.getBooleanValue()); });
        deserializerMap.put("netBiosName", (n) -> { this.setNetBiosName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("os", (n) -> { this.setOs(n.getStringValue()); });
        deserializerMap.put("privateIpAddress", (n) -> { this.setPrivateIpAddress(n.getStringValue()); });
        deserializerMap.put("publicIpAddress", (n) -> { this.setPublicIpAddress(n.getStringValue()); });
        deserializerMap.put("riskScore", (n) -> { this.setRiskScore(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fqdn property value. Host FQDN (Fully Qualified Domain Name) (for example, machine.company.com).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFqdn() {
        return this.fqdn;
    }
    /**
     * Gets the isAzureAdJoined property value. The isAzureAdJoined property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAzureAdJoined() {
        return this.isAzureAdJoined;
    }
    /**
     * Gets the isAzureAdRegistered property value. The isAzureAdRegistered property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAzureAdRegistered() {
        return this.isAzureAdRegistered;
    }
    /**
     * Gets the isHybridAzureDomainJoined property value. True if the host is domain joined to an on-premises Active Directory domain.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHybridAzureDomainJoined() {
        return this.isHybridAzureDomainJoined;
    }
    /**
     * Gets the netBiosName property value. The local host name, without the DNS domain name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNetBiosName() {
        return this.netBiosName;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the os property value. Host Operating System. (For example, Windows 10, macOS, RHEL, etc.).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOs() {
        return this.os;
    }
    /**
     * Gets the privateIpAddress property value. Private (not routable) IPv4 or IPv6 address (see RFC 1918) at the time of the alert.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * Gets the publicIpAddress property value. Publicly routable IPv4 or IPv6 address (see RFC 1918) at time of the alert.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }
    /**
     * Gets the riskScore property value. Provider-generated/calculated risk score of the host.  Recommended value range of 0-1, which equates to a percentage.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRiskScore() {
        return this.riskScore;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("fqdn", this.getFqdn());
        writer.writeBooleanValue("isAzureAdJoined", this.getIsAzureAdJoined());
        writer.writeBooleanValue("isAzureAdRegistered", this.getIsAzureAdRegistered());
        writer.writeBooleanValue("isHybridAzureDomainJoined", this.getIsHybridAzureDomainJoined());
        writer.writeStringValue("netBiosName", this.getNetBiosName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("os", this.getOs());
        writer.writeStringValue("privateIpAddress", this.getPrivateIpAddress());
        writer.writeStringValue("publicIpAddress", this.getPublicIpAddress());
        writer.writeStringValue("riskScore", this.getRiskScore());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the fqdn property value. Host FQDN (Fully Qualified Domain Name) (for example, machine.company.com).
     * @param value Value to set for the fqdn property.
     */
    public void setFqdn(@jakarta.annotation.Nullable final String value) {
        this.fqdn = value;
    }
    /**
     * Sets the isAzureAdJoined property value. The isAzureAdJoined property
     * @param value Value to set for the isAzureAdJoined property.
     */
    public void setIsAzureAdJoined(@jakarta.annotation.Nullable final Boolean value) {
        this.isAzureAdJoined = value;
    }
    /**
     * Sets the isAzureAdRegistered property value. The isAzureAdRegistered property
     * @param value Value to set for the isAzureAdRegistered property.
     */
    public void setIsAzureAdRegistered(@jakarta.annotation.Nullable final Boolean value) {
        this.isAzureAdRegistered = value;
    }
    /**
     * Sets the isHybridAzureDomainJoined property value. True if the host is domain joined to an on-premises Active Directory domain.
     * @param value Value to set for the isHybridAzureDomainJoined property.
     */
    public void setIsHybridAzureDomainJoined(@jakarta.annotation.Nullable final Boolean value) {
        this.isHybridAzureDomainJoined = value;
    }
    /**
     * Sets the netBiosName property value. The local host name, without the DNS domain name.
     * @param value Value to set for the netBiosName property.
     */
    public void setNetBiosName(@jakarta.annotation.Nullable final String value) {
        this.netBiosName = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the os property value. Host Operating System. (For example, Windows 10, macOS, RHEL, etc.).
     * @param value Value to set for the os property.
     */
    public void setOs(@jakarta.annotation.Nullable final String value) {
        this.os = value;
    }
    /**
     * Sets the privateIpAddress property value. Private (not routable) IPv4 or IPv6 address (see RFC 1918) at the time of the alert.
     * @param value Value to set for the privateIpAddress property.
     */
    public void setPrivateIpAddress(@jakarta.annotation.Nullable final String value) {
        this.privateIpAddress = value;
    }
    /**
     * Sets the publicIpAddress property value. Publicly routable IPv4 or IPv6 address (see RFC 1918) at time of the alert.
     * @param value Value to set for the publicIpAddress property.
     */
    public void setPublicIpAddress(@jakarta.annotation.Nullable final String value) {
        this.publicIpAddress = value;
    }
    /**
     * Sets the riskScore property value. Provider-generated/calculated risk score of the host.  Recommended value range of 0-1, which equates to a percentage.
     * @param value Value to set for the riskScore property.
     */
    public void setRiskScore(@jakarta.annotation.Nullable final String value) {
        this.riskScore = value;
    }
}
