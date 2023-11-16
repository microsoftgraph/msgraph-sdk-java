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
public class UserSecurityState implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new UserSecurityState and sets the default values.
     */
    public UserSecurityState() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserSecurityState
     */
    @jakarta.annotation.Nonnull
    public static UserSecurityState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserSecurityState();
    }
    /**
     * Gets the aadUserId property value. AAD User object identifier (GUID) - represents the physical/multi-account user entity.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAadUserId() {
        return this.BackingStore.get("aadUserId");
    }
    /**
     * Gets the accountName property value. Account name of user account (without Active Directory domain or DNS domain) - (also called mailNickName).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccountName() {
        return this.BackingStore.get("accountName");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the domainName property value. NetBIOS/Active Directory domain of user account (that is, domain/account format).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDomainName() {
        return this.BackingStore.get("domainName");
    }
    /**
     * Gets the emailRole property value. For email-related alerts - user account's email 'role'. Possible values are: unknown, sender, recipient.
     * @return a EmailRole
     */
    @jakarta.annotation.Nullable
    public EmailRole getEmailRole() {
        return this.BackingStore.get("emailRole");
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
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsVpn() {
        return this.BackingStore.get("isVpn");
    }
    /**
     * Gets the logonDateTime property value. Time at which the sign-in occurred. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLogonDateTime() {
        return this.BackingStore.get("logonDateTime");
    }
    /**
     * Gets the logonId property value. User sign-in ID.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLogonId() {
        return this.BackingStore.get("logonId");
    }
    /**
     * Gets the logonIp property value. IP Address the sign-in request originated from.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLogonIp() {
        return this.BackingStore.get("logonIp");
    }
    /**
     * Gets the logonLocation property value. Location (by IP address mapping) associated with a user sign-in event by this user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLogonLocation() {
        return this.BackingStore.get("logonLocation");
    }
    /**
     * Gets the logonType property value. Method of user sign in. Possible values are: unknown, interactive, remoteInteractive, network, batch, service.
     * @return a LogonType
     */
    @jakarta.annotation.Nullable
    public LogonType getLogonType() {
        return this.BackingStore.get("logonType");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the onPremisesSecurityIdentifier property value. Active Directory (on-premises) Security Identifier (SID) of the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOnPremisesSecurityIdentifier() {
        return this.BackingStore.get("onPremisesSecurityIdentifier");
    }
    /**
     * Gets the riskScore property value. Provider-generated/calculated risk score of the user account. Recommended value range of 0-1, which equates to a percentage.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRiskScore() {
        return this.BackingStore.get("riskScore");
    }
    /**
     * Gets the userAccountType property value. User account type (group membership), per Windows definition. Possible values are: unknown, standard, power, administrator.
     * @return a UserAccountSecurityType
     */
    @jakarta.annotation.Nullable
    public UserAccountSecurityType getUserAccountType() {
        return this.BackingStore.get("userAccountType");
    }
    /**
     * Gets the userPrincipalName property value. User sign-in name - internet format: (user account name)@(user account DNS domain name).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.BackingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     */
    public void setAadUserId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("aadUserId", value);
    }
    /**
     * Sets the accountName property value. Account name of user account (without Active Directory domain or DNS domain) - (also called mailNickName).
     * @param value Value to set for the accountName property.
     */
    public void setAccountName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("accountName", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the domainName property value. NetBIOS/Active Directory domain of user account (that is, domain/account format).
     * @param value Value to set for the domainName property.
     */
    public void setDomainName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("domainName", value);
    }
    /**
     * Sets the emailRole property value. For email-related alerts - user account's email 'role'. Possible values are: unknown, sender, recipient.
     * @param value Value to set for the emailRole property.
     */
    public void setEmailRole(@jakarta.annotation.Nullable final EmailRole value) {
        this.BackingStore.set("emailRole", value);
    }
    /**
     * Sets the isVpn property value. Indicates whether the user logged on through a VPN.
     * @param value Value to set for the isVpn property.
     */
    public void setIsVpn(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isVpn", value);
    }
    /**
     * Sets the logonDateTime property value. Time at which the sign-in occurred. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the logonDateTime property.
     */
    public void setLogonDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("logonDateTime", value);
    }
    /**
     * Sets the logonId property value. User sign-in ID.
     * @param value Value to set for the logonId property.
     */
    public void setLogonId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("logonId", value);
    }
    /**
     * Sets the logonIp property value. IP Address the sign-in request originated from.
     * @param value Value to set for the logonIp property.
     */
    public void setLogonIp(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("logonIp", value);
    }
    /**
     * Sets the logonLocation property value. Location (by IP address mapping) associated with a user sign-in event by this user.
     * @param value Value to set for the logonLocation property.
     */
    public void setLogonLocation(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("logonLocation", value);
    }
    /**
     * Sets the logonType property value. Method of user sign in. Possible values are: unknown, interactive, remoteInteractive, network, batch, service.
     * @param value Value to set for the logonType property.
     */
    public void setLogonType(@jakarta.annotation.Nullable final LogonType value) {
        this.BackingStore.set("logonType", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the onPremisesSecurityIdentifier property value. Active Directory (on-premises) Security Identifier (SID) of the user.
     * @param value Value to set for the onPremisesSecurityIdentifier property.
     */
    public void setOnPremisesSecurityIdentifier(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("onPremisesSecurityIdentifier", value);
    }
    /**
     * Sets the riskScore property value. Provider-generated/calculated risk score of the user account. Recommended value range of 0-1, which equates to a percentage.
     * @param value Value to set for the riskScore property.
     */
    public void setRiskScore(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("riskScore", value);
    }
    /**
     * Sets the userAccountType property value. User account type (group membership), per Windows definition. Possible values are: unknown, standard, power, administrator.
     * @param value Value to set for the userAccountType property.
     */
    public void setUserAccountType(@jakarta.annotation.Nullable final UserAccountSecurityType value) {
        this.BackingStore.set("userAccountType", value);
    }
    /**
     * Sets the userPrincipalName property value. User sign-in name - internet format: (user account name)@(user account DNS domain name).
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("userPrincipalName", value);
    }
}
