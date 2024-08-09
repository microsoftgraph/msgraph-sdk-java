package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserRegistrationDetails extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UserRegistrationDetails} and sets the default values.
     */
    public UserRegistrationDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserRegistrationDetails}
     */
    @jakarta.annotation.Nonnull
    public static UserRegistrationDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserRegistrationDetails();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isAdmin", (n) -> { this.setIsAdmin(n.getBooleanValue()); });
        deserializerMap.put("isMfaCapable", (n) -> { this.setIsMfaCapable(n.getBooleanValue()); });
        deserializerMap.put("isMfaRegistered", (n) -> { this.setIsMfaRegistered(n.getBooleanValue()); });
        deserializerMap.put("isPasswordlessCapable", (n) -> { this.setIsPasswordlessCapable(n.getBooleanValue()); });
        deserializerMap.put("isSsprCapable", (n) -> { this.setIsSsprCapable(n.getBooleanValue()); });
        deserializerMap.put("isSsprEnabled", (n) -> { this.setIsSsprEnabled(n.getBooleanValue()); });
        deserializerMap.put("isSsprRegistered", (n) -> { this.setIsSsprRegistered(n.getBooleanValue()); });
        deserializerMap.put("isSystemPreferredAuthenticationMethodEnabled", (n) -> { this.setIsSystemPreferredAuthenticationMethodEnabled(n.getBooleanValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("methodsRegistered", (n) -> { this.setMethodsRegistered(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("systemPreferredAuthenticationMethods", (n) -> { this.setSystemPreferredAuthenticationMethods(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("userDisplayName", (n) -> { this.setUserDisplayName(n.getStringValue()); });
        deserializerMap.put("userPreferredMethodForSecondaryAuthentication", (n) -> { this.setUserPreferredMethodForSecondaryAuthentication(n.getEnumValue(UserDefaultAuthenticationMethod::forValue)); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("userType", (n) -> { this.setUserType(n.getEnumValue(SignInUserType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isAdmin property value. Indicates whether the user has an admin role in the tenant. This value can be used to check the authentication methods that privileged accounts are registered for and capable of.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAdmin() {
        return this.backingStore.get("isAdmin");
    }
    /**
     * Gets the isMfaCapable property value. Indicates whether the user has registered a strong authentication method for multifactor authentication. The method must be allowed by the authentication methods policy. Supports $filter (eq).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMfaCapable() {
        return this.backingStore.get("isMfaCapable");
    }
    /**
     * Gets the isMfaRegistered property value. Indicates whether the user has registered a strong authentication method for multifactor authentication. The method may not necessarily be allowed by the authentication methods policy. Supports $filter (eq).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMfaRegistered() {
        return this.backingStore.get("isMfaRegistered");
    }
    /**
     * Gets the isPasswordlessCapable property value. Indicates whether the user has registered a passwordless strong authentication method (including FIDO2, Windows Hello for Business, and Microsoft Authenticator (Passwordless)) that is allowed by the authentication methods policy. Supports $filter (eq).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPasswordlessCapable() {
        return this.backingStore.get("isPasswordlessCapable");
    }
    /**
     * Gets the isSsprCapable property value. Indicates whether the user has registered the required number of authentication methods for self-service password reset and the user is allowed to perform self-service password reset by policy. Supports $filter (eq).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSsprCapable() {
        return this.backingStore.get("isSsprCapable");
    }
    /**
     * Gets the isSsprEnabled property value. Indicates whether the user is allowed to perform self-service password reset by policy. The user may not necessarily have registered the required number of authentication methods for self-service password reset. Supports $filter (eq).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSsprEnabled() {
        return this.backingStore.get("isSsprEnabled");
    }
    /**
     * Gets the isSsprRegistered property value. Indicates whether the user has registered the required number of authentication methods for self-service password reset. The user may not necessarily be allowed to perform self-service password reset by policy. Supports $filter (eq).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSsprRegistered() {
        return this.backingStore.get("isSsprRegistered");
    }
    /**
     * Gets the isSystemPreferredAuthenticationMethodEnabled property value. Indicates whether system preferred authentication method is enabled. If enabled, the system dynamically determines the most secure authentication method among the methods registered by the user. Supports $filter (eq).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSystemPreferredAuthenticationMethodEnabled() {
        return this.backingStore.get("isSystemPreferredAuthenticationMethodEnabled");
    }
    /**
     * Gets the lastUpdatedDateTime property value. The date and time (UTC) when the report was last updated. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.backingStore.get("lastUpdatedDateTime");
    }
    /**
     * Gets the methodsRegistered property value. Collection of authentication methods registered, such as mobilePhone, email, passKeyDeviceBound. Supports $filter (any with eq).
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMethodsRegistered() {
        return this.backingStore.get("methodsRegistered");
    }
    /**
     * Gets the systemPreferredAuthenticationMethods property value. Collection of authentication methods that the system determined to be the most secure authentication methods among the registered methods for second factor authentication. Possible values are: push, oath, voiceMobile, voiceAlternateMobile, voiceOffice, sms, none, unknownFutureValue. Supports $filter (any with eq).
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSystemPreferredAuthenticationMethods() {
        return this.backingStore.get("systemPreferredAuthenticationMethods");
    }
    /**
     * Gets the userDisplayName property value. The user display name, such as Adele Vance. Supports $filter (eq, startsWith) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserDisplayName() {
        return this.backingStore.get("userDisplayName");
    }
    /**
     * Gets the userPreferredMethodForSecondaryAuthentication property value. The method the user selected as the default second-factor for performing multifactor authentication. Possible values are: push, oath, voiceMobile, voiceAlternateMobile, voiceOffice, sms, none, unknownFutureValue. This property is used as preferred MFA method when isSystemPreferredAuthenticationMethodEnabled is false. Supports $filter (any with eq).
     * @return a {@link UserDefaultAuthenticationMethod}
     */
    @jakarta.annotation.Nullable
    public UserDefaultAuthenticationMethod getUserPreferredMethodForSecondaryAuthentication() {
        return this.backingStore.get("userPreferredMethodForSecondaryAuthentication");
    }
    /**
     * Gets the userPrincipalName property value. The user principal name, such as AdeleV@contoso.com. Supports $filter (eq, startsWith) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Gets the userType property value. Identifies whether the user is a member or guest in the tenant. The possible values are: member, guest, unknownFutureValue.
     * @return a {@link SignInUserType}
     */
    @jakarta.annotation.Nullable
    public SignInUserType getUserType() {
        return this.backingStore.get("userType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isAdmin", this.getIsAdmin());
        writer.writeBooleanValue("isMfaCapable", this.getIsMfaCapable());
        writer.writeBooleanValue("isMfaRegistered", this.getIsMfaRegistered());
        writer.writeBooleanValue("isPasswordlessCapable", this.getIsPasswordlessCapable());
        writer.writeBooleanValue("isSsprCapable", this.getIsSsprCapable());
        writer.writeBooleanValue("isSsprEnabled", this.getIsSsprEnabled());
        writer.writeBooleanValue("isSsprRegistered", this.getIsSsprRegistered());
        writer.writeBooleanValue("isSystemPreferredAuthenticationMethodEnabled", this.getIsSystemPreferredAuthenticationMethodEnabled());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeCollectionOfPrimitiveValues("methodsRegistered", this.getMethodsRegistered());
        writer.writeCollectionOfPrimitiveValues("systemPreferredAuthenticationMethods", this.getSystemPreferredAuthenticationMethods());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeEnumValue("userPreferredMethodForSecondaryAuthentication", this.getUserPreferredMethodForSecondaryAuthentication());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeEnumValue("userType", this.getUserType());
    }
    /**
     * Sets the isAdmin property value. Indicates whether the user has an admin role in the tenant. This value can be used to check the authentication methods that privileged accounts are registered for and capable of.
     * @param value Value to set for the isAdmin property.
     */
    public void setIsAdmin(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAdmin", value);
    }
    /**
     * Sets the isMfaCapable property value. Indicates whether the user has registered a strong authentication method for multifactor authentication. The method must be allowed by the authentication methods policy. Supports $filter (eq).
     * @param value Value to set for the isMfaCapable property.
     */
    public void setIsMfaCapable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isMfaCapable", value);
    }
    /**
     * Sets the isMfaRegistered property value. Indicates whether the user has registered a strong authentication method for multifactor authentication. The method may not necessarily be allowed by the authentication methods policy. Supports $filter (eq).
     * @param value Value to set for the isMfaRegistered property.
     */
    public void setIsMfaRegistered(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isMfaRegistered", value);
    }
    /**
     * Sets the isPasswordlessCapable property value. Indicates whether the user has registered a passwordless strong authentication method (including FIDO2, Windows Hello for Business, and Microsoft Authenticator (Passwordless)) that is allowed by the authentication methods policy. Supports $filter (eq).
     * @param value Value to set for the isPasswordlessCapable property.
     */
    public void setIsPasswordlessCapable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isPasswordlessCapable", value);
    }
    /**
     * Sets the isSsprCapable property value. Indicates whether the user has registered the required number of authentication methods for self-service password reset and the user is allowed to perform self-service password reset by policy. Supports $filter (eq).
     * @param value Value to set for the isSsprCapable property.
     */
    public void setIsSsprCapable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSsprCapable", value);
    }
    /**
     * Sets the isSsprEnabled property value. Indicates whether the user is allowed to perform self-service password reset by policy. The user may not necessarily have registered the required number of authentication methods for self-service password reset. Supports $filter (eq).
     * @param value Value to set for the isSsprEnabled property.
     */
    public void setIsSsprEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSsprEnabled", value);
    }
    /**
     * Sets the isSsprRegistered property value. Indicates whether the user has registered the required number of authentication methods for self-service password reset. The user may not necessarily be allowed to perform self-service password reset by policy. Supports $filter (eq).
     * @param value Value to set for the isSsprRegistered property.
     */
    public void setIsSsprRegistered(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSsprRegistered", value);
    }
    /**
     * Sets the isSystemPreferredAuthenticationMethodEnabled property value. Indicates whether system preferred authentication method is enabled. If enabled, the system dynamically determines the most secure authentication method among the methods registered by the user. Supports $filter (eq).
     * @param value Value to set for the isSystemPreferredAuthenticationMethodEnabled property.
     */
    public void setIsSystemPreferredAuthenticationMethodEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSystemPreferredAuthenticationMethodEnabled", value);
    }
    /**
     * Sets the lastUpdatedDateTime property value. The date and time (UTC) when the report was last updated. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUpdatedDateTime", value);
    }
    /**
     * Sets the methodsRegistered property value. Collection of authentication methods registered, such as mobilePhone, email, passKeyDeviceBound. Supports $filter (any with eq).
     * @param value Value to set for the methodsRegistered property.
     */
    public void setMethodsRegistered(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("methodsRegistered", value);
    }
    /**
     * Sets the systemPreferredAuthenticationMethods property value. Collection of authentication methods that the system determined to be the most secure authentication methods among the registered methods for second factor authentication. Possible values are: push, oath, voiceMobile, voiceAlternateMobile, voiceOffice, sms, none, unknownFutureValue. Supports $filter (any with eq).
     * @param value Value to set for the systemPreferredAuthenticationMethods property.
     */
    public void setSystemPreferredAuthenticationMethods(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("systemPreferredAuthenticationMethods", value);
    }
    /**
     * Sets the userDisplayName property value. The user display name, such as Adele Vance. Supports $filter (eq, startsWith) and $orderby.
     * @param value Value to set for the userDisplayName property.
     */
    public void setUserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userDisplayName", value);
    }
    /**
     * Sets the userPreferredMethodForSecondaryAuthentication property value. The method the user selected as the default second-factor for performing multifactor authentication. Possible values are: push, oath, voiceMobile, voiceAlternateMobile, voiceOffice, sms, none, unknownFutureValue. This property is used as preferred MFA method when isSystemPreferredAuthenticationMethodEnabled is false. Supports $filter (any with eq).
     * @param value Value to set for the userPreferredMethodForSecondaryAuthentication property.
     */
    public void setUserPreferredMethodForSecondaryAuthentication(@jakarta.annotation.Nullable final UserDefaultAuthenticationMethod value) {
        this.backingStore.set("userPreferredMethodForSecondaryAuthentication", value);
    }
    /**
     * Sets the userPrincipalName property value. The user principal name, such as AdeleV@contoso.com. Supports $filter (eq, startsWith) and $orderby.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
    /**
     * Sets the userType property value. Identifies whether the user is a member or guest in the tenant. The possible values are: member, guest, unknownFutureValue.
     * @param value Value to set for the userType property.
     */
    public void setUserType(@jakarta.annotation.Nullable final SignInUserType value) {
        this.backingStore.set("userType", value);
    }
}
