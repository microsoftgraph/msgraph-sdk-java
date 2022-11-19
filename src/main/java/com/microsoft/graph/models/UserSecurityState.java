package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserSecurityState implements AdditionalDataHolder, Parsable {
    /** AAD User object identifier (GUID) - represents the physical/multi-account user entity. */
    private String _aadUserId;
    /** Account name of user account (without Active Directory domain or DNS domain) - (also called mailNickName). */
    private String _accountName;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** NetBIOS/Active Directory domain of user account (that is, domain/account format). */
    private String _domainName;
    /** For email-related alerts - user account's email 'role'. Possible values are: unknown, sender, recipient. */
    private EmailRole _emailRole;
    /** Indicates whether the user logged on through a VPN. */
    private Boolean _isVpn;
    /** Time at which the sign-in occurred. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _logonDateTime;
    /** User sign-in ID. */
    private String _logonId;
    /** IP Address the sign-in request originated from. */
    private String _logonIp;
    /** Location (by IP address mapping) associated with a user sign-in event by this user. */
    private String _logonLocation;
    /** Method of user sign in. Possible values are: unknown, interactive, remoteInteractive, network, batch, service. */
    private LogonType _logonType;
    /** The OdataType property */
    private String _odataType;
    /** Active Directory (on-premises) Security Identifier (SID) of the user. */
    private String _onPremisesSecurityIdentifier;
    /** Provider-generated/calculated risk score of the user account. Recommended value range of 0-1, which equates to a percentage. */
    private String _riskScore;
    /** User account type (group membership), per Windows definition. Possible values are: unknown, standard, power, administrator. */
    private UserAccountSecurityType _userAccountType;
    /** User sign-in name - internet format: (user account name)@(user account DNS domain name). */
    private String _userPrincipalName;
    /**
     * Instantiates a new userSecurityState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserSecurityState() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.userSecurityState");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userSecurityState
     */
    @javax.annotation.Nonnull
    public static UserSecurityState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserSecurityState();
    }
    /**
     * Gets the aadUserId property value. AAD User object identifier (GUID) - represents the physical/multi-account user entity.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAadUserId() {
        return this._aadUserId;
    }
    /**
     * Gets the accountName property value. Account name of user account (without Active Directory domain or DNS domain) - (also called mailNickName).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountName() {
        return this._accountName;
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
     * Gets the domainName property value. NetBIOS/Active Directory domain of user account (that is, domain/account format).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDomainName() {
        return this._domainName;
    }
    /**
     * Gets the emailRole property value. For email-related alerts - user account's email 'role'. Possible values are: unknown, sender, recipient.
     * @return a emailRole
     */
    @javax.annotation.Nullable
    public EmailRole getEmailRole() {
        return this._emailRole;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserSecurityState currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(15);
        deserializerMap.put("aadUserId", (n) -> { currentObject.setAadUserId(n.getStringValue()); });
        deserializerMap.put("accountName", (n) -> { currentObject.setAccountName(n.getStringValue()); });
        deserializerMap.put("domainName", (n) -> { currentObject.setDomainName(n.getStringValue()); });
        deserializerMap.put("emailRole", (n) -> { currentObject.setEmailRole(n.getEnumValue(EmailRole.class)); });
        deserializerMap.put("isVpn", (n) -> { currentObject.setIsVpn(n.getBooleanValue()); });
        deserializerMap.put("logonDateTime", (n) -> { currentObject.setLogonDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("logonId", (n) -> { currentObject.setLogonId(n.getStringValue()); });
        deserializerMap.put("logonIp", (n) -> { currentObject.setLogonIp(n.getStringValue()); });
        deserializerMap.put("logonLocation", (n) -> { currentObject.setLogonLocation(n.getStringValue()); });
        deserializerMap.put("logonType", (n) -> { currentObject.setLogonType(n.getEnumValue(LogonType.class)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("onPremisesSecurityIdentifier", (n) -> { currentObject.setOnPremisesSecurityIdentifier(n.getStringValue()); });
        deserializerMap.put("riskScore", (n) -> { currentObject.setRiskScore(n.getStringValue()); });
        deserializerMap.put("userAccountType", (n) -> { currentObject.setUserAccountType(n.getEnumValue(UserAccountSecurityType.class)); });
        deserializerMap.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the isVpn property value. Indicates whether the user logged on through a VPN.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsVpn() {
        return this._isVpn;
    }
    /**
     * Gets the logonDateTime property value. Time at which the sign-in occurred. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLogonDateTime() {
        return this._logonDateTime;
    }
    /**
     * Gets the logonId property value. User sign-in ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLogonId() {
        return this._logonId;
    }
    /**
     * Gets the logonIp property value. IP Address the sign-in request originated from.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLogonIp() {
        return this._logonIp;
    }
    /**
     * Gets the logonLocation property value. Location (by IP address mapping) associated with a user sign-in event by this user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLogonLocation() {
        return this._logonLocation;
    }
    /**
     * Gets the logonType property value. Method of user sign in. Possible values are: unknown, interactive, remoteInteractive, network, batch, service.
     * @return a logonType
     */
    @javax.annotation.Nullable
    public LogonType getLogonType() {
        return this._logonType;
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
     * Gets the onPremisesSecurityIdentifier property value. Active Directory (on-premises) Security Identifier (SID) of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnPremisesSecurityIdentifier() {
        return this._onPremisesSecurityIdentifier;
    }
    /**
     * Gets the riskScore property value. Provider-generated/calculated risk score of the user account. Recommended value range of 0-1, which equates to a percentage.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRiskScore() {
        return this._riskScore;
    }
    /**
     * Gets the userAccountType property value. User account type (group membership), per Windows definition. Possible values are: unknown, standard, power, administrator.
     * @return a userAccountSecurityType
     */
    @javax.annotation.Nullable
    public UserAccountSecurityType getUserAccountType() {
        return this._userAccountType;
    }
    /**
     * Gets the userPrincipalName property value. User sign-in name - internet format: (user account name)@(user account DNS domain name).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("aadUserId", this.getAadUserId());
        writer.writeStringValue("accountName", this.getAccountName());
        writer.writeStringValue("domainName", this.getDomainName());
        writer.writeEnumValue("emailRole", this.getEmailRole());
        writer.writeBooleanValue("isVpn", this.getIsVpn());
        writer.writeOffsetDateTimeValue("logonDateTime", this.getLogonDateTime());
        writer.writeStringValue("logonId", this.getLogonId());
        writer.writeStringValue("logonIp", this.getLogonIp());
        writer.writeStringValue("logonLocation", this.getLogonLocation());
        writer.writeEnumValue("logonType", this.getLogonType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("onPremisesSecurityIdentifier", this.getOnPremisesSecurityIdentifier());
        writer.writeStringValue("riskScore", this.getRiskScore());
        writer.writeEnumValue("userAccountType", this.getUserAccountType());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the aadUserId property value. AAD User object identifier (GUID) - represents the physical/multi-account user entity.
     * @param value Value to set for the aadUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAadUserId(@javax.annotation.Nullable final String value) {
        this._aadUserId = value;
    }
    /**
     * Sets the accountName property value. Account name of user account (without Active Directory domain or DNS domain) - (also called mailNickName).
     * @param value Value to set for the accountName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountName(@javax.annotation.Nullable final String value) {
        this._accountName = value;
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
     * Sets the domainName property value. NetBIOS/Active Directory domain of user account (that is, domain/account format).
     * @param value Value to set for the domainName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDomainName(@javax.annotation.Nullable final String value) {
        this._domainName = value;
    }
    /**
     * Sets the emailRole property value. For email-related alerts - user account's email 'role'. Possible values are: unknown, sender, recipient.
     * @param value Value to set for the emailRole property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailRole(@javax.annotation.Nullable final EmailRole value) {
        this._emailRole = value;
    }
    /**
     * Sets the isVpn property value. Indicates whether the user logged on through a VPN.
     * @param value Value to set for the isVpn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsVpn(@javax.annotation.Nullable final Boolean value) {
        this._isVpn = value;
    }
    /**
     * Sets the logonDateTime property value. Time at which the sign-in occurred. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the logonDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLogonDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._logonDateTime = value;
    }
    /**
     * Sets the logonId property value. User sign-in ID.
     * @param value Value to set for the logonId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLogonId(@javax.annotation.Nullable final String value) {
        this._logonId = value;
    }
    /**
     * Sets the logonIp property value. IP Address the sign-in request originated from.
     * @param value Value to set for the logonIp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLogonIp(@javax.annotation.Nullable final String value) {
        this._logonIp = value;
    }
    /**
     * Sets the logonLocation property value. Location (by IP address mapping) associated with a user sign-in event by this user.
     * @param value Value to set for the logonLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLogonLocation(@javax.annotation.Nullable final String value) {
        this._logonLocation = value;
    }
    /**
     * Sets the logonType property value. Method of user sign in. Possible values are: unknown, interactive, remoteInteractive, network, batch, service.
     * @param value Value to set for the logonType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLogonType(@javax.annotation.Nullable final LogonType value) {
        this._logonType = value;
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
     * Sets the onPremisesSecurityIdentifier property value. Active Directory (on-premises) Security Identifier (SID) of the user.
     * @param value Value to set for the onPremisesSecurityIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesSecurityIdentifier(@javax.annotation.Nullable final String value) {
        this._onPremisesSecurityIdentifier = value;
    }
    /**
     * Sets the riskScore property value. Provider-generated/calculated risk score of the user account. Recommended value range of 0-1, which equates to a percentage.
     * @param value Value to set for the riskScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRiskScore(@javax.annotation.Nullable final String value) {
        this._riskScore = value;
    }
    /**
     * Sets the userAccountType property value. User account type (group membership), per Windows definition. Possible values are: unknown, standard, power, administrator.
     * @param value Value to set for the userAccountType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserAccountType(@javax.annotation.Nullable final UserAccountSecurityType value) {
        this._userAccountType = value;
    }
    /**
     * Sets the userPrincipalName property value. User sign-in name - internet format: (user account name)@(user account DNS domain name).
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
