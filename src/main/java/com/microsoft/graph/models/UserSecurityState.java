package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserSecurityState implements AdditionalDataHolder, Parsable {
    /**
     * AAD User object identifier (GUID) - represents the physical/multi-account user entity.
     */
    private String aadUserId;
    /**
     * Account name of user account (without Active Directory domain or DNS domain) - (also called mailNickName).
     */
    private String accountName;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * NetBIOS/Active Directory domain of user account (that is, domain/account format).
     */
    private String domainName;
    /**
     * For email-related alerts - user account's email 'role'. Possible values are: unknown, sender, recipient.
     */
    private EmailRole emailRole;
    /**
     * Indicates whether the user logged on through a VPN.
     */
    private Boolean isVpn;
    /**
     * Time at which the sign-in occurred. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime logonDateTime;
    /**
     * User sign-in ID.
     */
    private String logonId;
    /**
     * IP Address the sign-in request originated from.
     */
    private String logonIp;
    /**
     * Location (by IP address mapping) associated with a user sign-in event by this user.
     */
    private String logonLocation;
    /**
     * Method of user sign in. Possible values are: unknown, interactive, remoteInteractive, network, batch, service.
     */
    private LogonType logonType;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Active Directory (on-premises) Security Identifier (SID) of the user.
     */
    private String onPremisesSecurityIdentifier;
    /**
     * Provider-generated/calculated risk score of the user account. Recommended value range of 0-1, which equates to a percentage.
     */
    private String riskScore;
    /**
     * User account type (group membership), per Windows definition. Possible values are: unknown, standard, power, administrator.
     */
    private UserAccountSecurityType userAccountType;
    /**
     * User sign-in name - internet format: (user account name)@(user account DNS domain name).
     */
    private String userPrincipalName;
    /**
     * Instantiates a new userSecurityState and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public UserSecurityState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userSecurityState
     */
    @jakarta.annotation.Nonnull
    public static UserSecurityState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserSecurityState();
    }
    /**
     * Gets the aadUserId property value. AAD User object identifier (GUID) - represents the physical/multi-account user entity.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAadUserId() {
        return this.aadUserId;
    }
    /**
     * Gets the accountName property value. Account name of user account (without Active Directory domain or DNS domain) - (also called mailNickName).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAccountName() {
        return this.accountName;
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
     * Gets the domainName property value. NetBIOS/Active Directory domain of user account (that is, domain/account format).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDomainName() {
        return this.domainName;
    }
    /**
     * Gets the emailRole property value. For email-related alerts - user account's email 'role'. Possible values are: unknown, sender, recipient.
     * @return a emailRole
     */
    @jakarta.annotation.Nullable
    public EmailRole getEmailRole() {
        return this.emailRole;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("aadUserId", (n) -> { this.setAadUserId(n.getStringValue()); });
        deserializerMap.put("accountName", (n) -> { this.setAccountName(n.getStringValue()); });
        deserializerMap.put("domainName", (n) -> { this.setDomainName(n.getStringValue()); });
        deserializerMap.put("emailRole", (n) -> { this.setEmailRole(n.getEnumValue(EmailRole.class)); });
        deserializerMap.put("isVpn", (n) -> { this.setIsVpn(n.getBooleanValue()); });
        deserializerMap.put("logonDateTime", (n) -> { this.setLogonDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("logonId", (n) -> { this.setLogonId(n.getStringValue()); });
        deserializerMap.put("logonIp", (n) -> { this.setLogonIp(n.getStringValue()); });
        deserializerMap.put("logonLocation", (n) -> { this.setLogonLocation(n.getStringValue()); });
        deserializerMap.put("logonType", (n) -> { this.setLogonType(n.getEnumValue(LogonType.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("onPremisesSecurityIdentifier", (n) -> { this.setOnPremisesSecurityIdentifier(n.getStringValue()); });
        deserializerMap.put("riskScore", (n) -> { this.setRiskScore(n.getStringValue()); });
        deserializerMap.put("userAccountType", (n) -> { this.setUserAccountType(n.getEnumValue(UserAccountSecurityType.class)); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isVpn property value. Indicates whether the user logged on through a VPN.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsVpn() {
        return this.isVpn;
    }
    /**
     * Gets the logonDateTime property value. Time at which the sign-in occurred. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLogonDateTime() {
        return this.logonDateTime;
    }
    /**
     * Gets the logonId property value. User sign-in ID.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLogonId() {
        return this.logonId;
    }
    /**
     * Gets the logonIp property value. IP Address the sign-in request originated from.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLogonIp() {
        return this.logonIp;
    }
    /**
     * Gets the logonLocation property value. Location (by IP address mapping) associated with a user sign-in event by this user.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLogonLocation() {
        return this.logonLocation;
    }
    /**
     * Gets the logonType property value. Method of user sign in. Possible values are: unknown, interactive, remoteInteractive, network, batch, service.
     * @return a logonType
     */
    @jakarta.annotation.Nullable
    public LogonType getLogonType() {
        return this.logonType;
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
     * Gets the onPremisesSecurityIdentifier property value. Active Directory (on-premises) Security Identifier (SID) of the user.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOnPremisesSecurityIdentifier() {
        return this.onPremisesSecurityIdentifier;
    }
    /**
     * Gets the riskScore property value. Provider-generated/calculated risk score of the user account. Recommended value range of 0-1, which equates to a percentage.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRiskScore() {
        return this.riskScore;
    }
    /**
     * Gets the userAccountType property value. User account type (group membership), per Windows definition. Possible values are: unknown, standard, power, administrator.
     * @return a userAccountSecurityType
     */
    @jakarta.annotation.Nullable
    public UserAccountSecurityType getUserAccountType() {
        return this.userAccountType;
    }
    /**
     * Gets the userPrincipalName property value. User sign-in name - internet format: (user account name)@(user account DNS domain name).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    @jakarta.annotation.Nonnull
    public void setAadUserId(@jakarta.annotation.Nullable final String value) {
        this.aadUserId = value;
    }
    /**
     * Sets the accountName property value. Account name of user account (without Active Directory domain or DNS domain) - (also called mailNickName).
     * @param value Value to set for the accountName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAccountName(@jakarta.annotation.Nullable final String value) {
        this.accountName = value;
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
     * Sets the domainName property value. NetBIOS/Active Directory domain of user account (that is, domain/account format).
     * @param value Value to set for the domainName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDomainName(@jakarta.annotation.Nullable final String value) {
        this.domainName = value;
    }
    /**
     * Sets the emailRole property value. For email-related alerts - user account's email 'role'. Possible values are: unknown, sender, recipient.
     * @param value Value to set for the emailRole property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEmailRole(@jakarta.annotation.Nullable final EmailRole value) {
        this.emailRole = value;
    }
    /**
     * Sets the isVpn property value. Indicates whether the user logged on through a VPN.
     * @param value Value to set for the isVpn property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsVpn(@jakarta.annotation.Nullable final Boolean value) {
        this.isVpn = value;
    }
    /**
     * Sets the logonDateTime property value. Time at which the sign-in occurred. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the logonDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLogonDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.logonDateTime = value;
    }
    /**
     * Sets the logonId property value. User sign-in ID.
     * @param value Value to set for the logonId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLogonId(@jakarta.annotation.Nullable final String value) {
        this.logonId = value;
    }
    /**
     * Sets the logonIp property value. IP Address the sign-in request originated from.
     * @param value Value to set for the logonIp property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLogonIp(@jakarta.annotation.Nullable final String value) {
        this.logonIp = value;
    }
    /**
     * Sets the logonLocation property value. Location (by IP address mapping) associated with a user sign-in event by this user.
     * @param value Value to set for the logonLocation property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLogonLocation(@jakarta.annotation.Nullable final String value) {
        this.logonLocation = value;
    }
    /**
     * Sets the logonType property value. Method of user sign in. Possible values are: unknown, interactive, remoteInteractive, network, batch, service.
     * @param value Value to set for the logonType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLogonType(@jakarta.annotation.Nullable final LogonType value) {
        this.logonType = value;
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
     * Sets the onPremisesSecurityIdentifier property value. Active Directory (on-premises) Security Identifier (SID) of the user.
     * @param value Value to set for the onPremisesSecurityIdentifier property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOnPremisesSecurityIdentifier(@jakarta.annotation.Nullable final String value) {
        this.onPremisesSecurityIdentifier = value;
    }
    /**
     * Sets the riskScore property value. Provider-generated/calculated risk score of the user account. Recommended value range of 0-1, which equates to a percentage.
     * @param value Value to set for the riskScore property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRiskScore(@jakarta.annotation.Nullable final String value) {
        this.riskScore = value;
    }
    /**
     * Sets the userAccountType property value. User account type (group membership), per Windows definition. Possible values are: unknown, standard, power, administrator.
     * @param value Value to set for the userAccountType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserAccountType(@jakarta.annotation.Nullable final UserAccountSecurityType value) {
        this.userAccountType = value;
    }
    /**
     * Sets the userPrincipalName property value. User sign-in name - internet format: (user account name)@(user account DNS domain name).
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
