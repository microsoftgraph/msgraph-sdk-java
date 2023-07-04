package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserRegistrationDetails extends Entity implements Parsable {
    /**
     * The isAdmin property
     */
    private Boolean isAdmin;
    /**
     * The isMfaCapable property
     */
    private Boolean isMfaCapable;
    /**
     * The isMfaRegistered property
     */
    private Boolean isMfaRegistered;
    /**
     * The isPasswordlessCapable property
     */
    private Boolean isPasswordlessCapable;
    /**
     * The isSsprCapable property
     */
    private Boolean isSsprCapable;
    /**
     * The isSsprEnabled property
     */
    private Boolean isSsprEnabled;
    /**
     * The isSsprRegistered property
     */
    private Boolean isSsprRegistered;
    /**
     * The isSystemPreferredAuthenticationMethodEnabled property
     */
    private Boolean isSystemPreferredAuthenticationMethodEnabled;
    /**
     * The lastUpdatedDateTime property
     */
    private OffsetDateTime lastUpdatedDateTime;
    /**
     * The methodsRegistered property
     */
    private java.util.List<String> methodsRegistered;
    /**
     * The systemPreferredAuthenticationMethods property
     */
    private java.util.List<String> systemPreferredAuthenticationMethods;
    /**
     * The userDisplayName property
     */
    private String userDisplayName;
    /**
     * The userPreferredMethodForSecondaryAuthentication property
     */
    private UserDefaultAuthenticationMethod userPreferredMethodForSecondaryAuthentication;
    /**
     * The userPrincipalName property
     */
    private String userPrincipalName;
    /**
     * The userType property
     */
    private SignInUserType userType;
    /**
     * Instantiates a new userRegistrationDetails and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserRegistrationDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userRegistrationDetails
     */
    @javax.annotation.Nonnull
    public static UserRegistrationDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserRegistrationDetails();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
        deserializerMap.put("userPreferredMethodForSecondaryAuthentication", (n) -> { this.setUserPreferredMethodForSecondaryAuthentication(n.getEnumValue(UserDefaultAuthenticationMethod.class)); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("userType", (n) -> { this.setUserType(n.getEnumValue(SignInUserType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isAdmin property value. The isAdmin property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }
    /**
     * Gets the isMfaCapable property value. The isMfaCapable property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMfaCapable() {
        return this.isMfaCapable;
    }
    /**
     * Gets the isMfaRegistered property value. The isMfaRegistered property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMfaRegistered() {
        return this.isMfaRegistered;
    }
    /**
     * Gets the isPasswordlessCapable property value. The isPasswordlessCapable property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPasswordlessCapable() {
        return this.isPasswordlessCapable;
    }
    /**
     * Gets the isSsprCapable property value. The isSsprCapable property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSsprCapable() {
        return this.isSsprCapable;
    }
    /**
     * Gets the isSsprEnabled property value. The isSsprEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSsprEnabled() {
        return this.isSsprEnabled;
    }
    /**
     * Gets the isSsprRegistered property value. The isSsprRegistered property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSsprRegistered() {
        return this.isSsprRegistered;
    }
    /**
     * Gets the isSystemPreferredAuthenticationMethodEnabled property value. The isSystemPreferredAuthenticationMethodEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSystemPreferredAuthenticationMethodEnabled() {
        return this.isSystemPreferredAuthenticationMethodEnabled;
    }
    /**
     * Gets the lastUpdatedDateTime property value. The lastUpdatedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }
    /**
     * Gets the methodsRegistered property value. The methodsRegistered property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMethodsRegistered() {
        return this.methodsRegistered;
    }
    /**
     * Gets the systemPreferredAuthenticationMethods property value. The systemPreferredAuthenticationMethods property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSystemPreferredAuthenticationMethods() {
        return this.systemPreferredAuthenticationMethods;
    }
    /**
     * Gets the userDisplayName property value. The userDisplayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this.userDisplayName;
    }
    /**
     * Gets the userPreferredMethodForSecondaryAuthentication property value. The userPreferredMethodForSecondaryAuthentication property
     * @return a userDefaultAuthenticationMethod
     */
    @javax.annotation.Nullable
    public UserDefaultAuthenticationMethod getUserPreferredMethodForSecondaryAuthentication() {
        return this.userPreferredMethodForSecondaryAuthentication;
    }
    /**
     * Gets the userPrincipalName property value. The userPrincipalName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Gets the userType property value. The userType property
     * @return a signInUserType
     */
    @javax.annotation.Nullable
    public SignInUserType getUserType() {
        return this.userType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the isAdmin property value. The isAdmin property
     * @param value Value to set for the isAdmin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAdmin(@javax.annotation.Nullable final Boolean value) {
        this.isAdmin = value;
    }
    /**
     * Sets the isMfaCapable property value. The isMfaCapable property
     * @param value Value to set for the isMfaCapable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsMfaCapable(@javax.annotation.Nullable final Boolean value) {
        this.isMfaCapable = value;
    }
    /**
     * Sets the isMfaRegistered property value. The isMfaRegistered property
     * @param value Value to set for the isMfaRegistered property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsMfaRegistered(@javax.annotation.Nullable final Boolean value) {
        this.isMfaRegistered = value;
    }
    /**
     * Sets the isPasswordlessCapable property value. The isPasswordlessCapable property
     * @param value Value to set for the isPasswordlessCapable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsPasswordlessCapable(@javax.annotation.Nullable final Boolean value) {
        this.isPasswordlessCapable = value;
    }
    /**
     * Sets the isSsprCapable property value. The isSsprCapable property
     * @param value Value to set for the isSsprCapable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSsprCapable(@javax.annotation.Nullable final Boolean value) {
        this.isSsprCapable = value;
    }
    /**
     * Sets the isSsprEnabled property value. The isSsprEnabled property
     * @param value Value to set for the isSsprEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSsprEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isSsprEnabled = value;
    }
    /**
     * Sets the isSsprRegistered property value. The isSsprRegistered property
     * @param value Value to set for the isSsprRegistered property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSsprRegistered(@javax.annotation.Nullable final Boolean value) {
        this.isSsprRegistered = value;
    }
    /**
     * Sets the isSystemPreferredAuthenticationMethodEnabled property value. The isSystemPreferredAuthenticationMethodEnabled property
     * @param value Value to set for the isSystemPreferredAuthenticationMethodEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSystemPreferredAuthenticationMethodEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isSystemPreferredAuthenticationMethodEnabled = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. The lastUpdatedDateTime property
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdatedDateTime = value;
    }
    /**
     * Sets the methodsRegistered property value. The methodsRegistered property
     * @param value Value to set for the methodsRegistered property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMethodsRegistered(@javax.annotation.Nullable final java.util.List<String> value) {
        this.methodsRegistered = value;
    }
    /**
     * Sets the systemPreferredAuthenticationMethods property value. The systemPreferredAuthenticationMethods property
     * @param value Value to set for the systemPreferredAuthenticationMethods property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemPreferredAuthenticationMethods(@javax.annotation.Nullable final java.util.List<String> value) {
        this.systemPreferredAuthenticationMethods = value;
    }
    /**
     * Sets the userDisplayName property value. The userDisplayName property
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this.userDisplayName = value;
    }
    /**
     * Sets the userPreferredMethodForSecondaryAuthentication property value. The userPreferredMethodForSecondaryAuthentication property
     * @param value Value to set for the userPreferredMethodForSecondaryAuthentication property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPreferredMethodForSecondaryAuthentication(@javax.annotation.Nullable final UserDefaultAuthenticationMethod value) {
        this.userPreferredMethodForSecondaryAuthentication = value;
    }
    /**
     * Sets the userPrincipalName property value. The userPrincipalName property
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
    /**
     * Sets the userType property value. The userType property
     * @param value Value to set for the userType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserType(@javax.annotation.Nullable final SignInUserType value) {
        this.userType = value;
    }
}
