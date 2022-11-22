package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class HostSecurityState implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Host FQDN (Fully Qualified Domain Name) (for example, machine.company.com). */
    private String _fqdn;
    /** The isAzureAdJoined property */
    private Boolean _isAzureAdJoined;
    /** The isAzureAdRegistered property */
    private Boolean _isAzureAdRegistered;
    /** True if the host is domain joined to an on-premises Active Directory domain. */
    private Boolean _isHybridAzureDomainJoined;
    /** The local host name, without the DNS domain name. */
    private String _netBiosName;
    /** The OdataType property */
    private String _odataType;
    /** Host Operating System. (For example, Windows10, MacOS, RHEL, etc.). */
    private String _os;
    /** Private (not routable) IPv4 or IPv6 address (see RFC 1918) at the time of the alert. */
    private String _privateIpAddress;
    /** Publicly routable IPv4 or IPv6 address (see RFC 1918) at time of the alert. */
    private String _publicIpAddress;
    /** Provider-generated/calculated risk score of the host.  Recommended value range of 0-1, which equates to a percentage. */
    private String _riskScore;
    /**
     * Instantiates a new hostSecurityState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public HostSecurityState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a hostSecurityState
     */
    @javax.annotation.Nonnull
    public static HostSecurityState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HostSecurityState();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(10);
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFqdn() {
        return this._fqdn;
    }
    /**
     * Gets the isAzureAdJoined property value. The isAzureAdJoined property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAzureAdJoined() {
        return this._isAzureAdJoined;
    }
    /**
     * Gets the isAzureAdRegistered property value. The isAzureAdRegistered property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAzureAdRegistered() {
        return this._isAzureAdRegistered;
    }
    /**
     * Gets the isHybridAzureDomainJoined property value. True if the host is domain joined to an on-premises Active Directory domain.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsHybridAzureDomainJoined() {
        return this._isHybridAzureDomainJoined;
    }
    /**
     * Gets the netBiosName property value. The local host name, without the DNS domain name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetBiosName() {
        return this._netBiosName;
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
     * Gets the os property value. Host Operating System. (For example, Windows10, MacOS, RHEL, etc.).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOs() {
        return this._os;
    }
    /**
     * Gets the privateIpAddress property value. Private (not routable) IPv4 or IPv6 address (see RFC 1918) at the time of the alert.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrivateIpAddress() {
        return this._privateIpAddress;
    }
    /**
     * Gets the publicIpAddress property value. Publicly routable IPv4 or IPv6 address (see RFC 1918) at time of the alert.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublicIpAddress() {
        return this._publicIpAddress;
    }
    /**
     * Gets the riskScore property value. Provider-generated/calculated risk score of the host.  Recommended value range of 0-1, which equates to a percentage.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRiskScore() {
        return this._riskScore;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the fqdn property value. Host FQDN (Fully Qualified Domain Name) (for example, machine.company.com).
     * @param value Value to set for the fqdn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFqdn(@javax.annotation.Nullable final String value) {
        this._fqdn = value;
    }
    /**
     * Sets the isAzureAdJoined property value. The isAzureAdJoined property
     * @param value Value to set for the isAzureAdJoined property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAzureAdJoined(@javax.annotation.Nullable final Boolean value) {
        this._isAzureAdJoined = value;
    }
    /**
     * Sets the isAzureAdRegistered property value. The isAzureAdRegistered property
     * @param value Value to set for the isAzureAdRegistered property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAzureAdRegistered(@javax.annotation.Nullable final Boolean value) {
        this._isAzureAdRegistered = value;
    }
    /**
     * Sets the isHybridAzureDomainJoined property value. True if the host is domain joined to an on-premises Active Directory domain.
     * @param value Value to set for the isHybridAzureDomainJoined property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsHybridAzureDomainJoined(@javax.annotation.Nullable final Boolean value) {
        this._isHybridAzureDomainJoined = value;
    }
    /**
     * Sets the netBiosName property value. The local host name, without the DNS domain name.
     * @param value Value to set for the netBiosName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetBiosName(@javax.annotation.Nullable final String value) {
        this._netBiosName = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the os property value. Host Operating System. (For example, Windows10, MacOS, RHEL, etc.).
     * @param value Value to set for the os property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOs(@javax.annotation.Nullable final String value) {
        this._os = value;
    }
    /**
     * Sets the privateIpAddress property value. Private (not routable) IPv4 or IPv6 address (see RFC 1918) at the time of the alert.
     * @param value Value to set for the privateIpAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivateIpAddress(@javax.annotation.Nullable final String value) {
        this._privateIpAddress = value;
    }
    /**
     * Sets the publicIpAddress property value. Publicly routable IPv4 or IPv6 address (see RFC 1918) at time of the alert.
     * @param value Value to set for the publicIpAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublicIpAddress(@javax.annotation.Nullable final String value) {
        this._publicIpAddress = value;
    }
    /**
     * Sets the riskScore property value. Provider-generated/calculated risk score of the host.  Recommended value range of 0-1, which equates to a percentage.
     * @param value Value to set for the riskScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRiskScore(@javax.annotation.Nullable final String value) {
        this._riskScore = value;
    }
}
