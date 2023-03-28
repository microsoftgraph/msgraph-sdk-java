package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationMethodsPolicy extends Entity implements Parsable {
    /** Represents the settings for each authentication method. Automatically expanded on GET /policies/authenticationMethodsPolicy. */
    private java.util.List<AuthenticationMethodConfiguration> authenticationMethodConfigurations;
    /** A description of the policy. Read-only. */
    private String description;
    /** The name of the policy. Read-only. */
    private String displayName;
    /** The date and time of the last update to the policy. Read-only. */
    private OffsetDateTime lastModifiedDateTime;
    /** The state of migration of the authentication methods policy from the legacy multifactor authentication and self-service password reset (SSPR) policies. The possible values are: premigration - means the authentication methods policy is used for authentication only, legacy policies are respected. migrationInProgress - means the authentication methods policy is used for both authentication and SSPR, legacy policies are respected. migrationComplete - means the authentication methods policy is used for authentication and SSPR, legacy policies are ignored. unknownFutureValue - Evolvable enumeration sentinel value. Do not use. */
    private AuthenticationMethodsPolicyMigrationState policyMigrationState;
    /** The version of the policy in use. Read-only. */
    private String policyVersion;
    /** The reconfirmationInDays property */
    private Integer reconfirmationInDays;
    /** Enforce registration at sign-in time. This property can be used to remind users to set up targeted authentication methods. */
    private RegistrationEnforcement registrationEnforcement;
    /**
     * Instantiates a new AuthenticationMethodsPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthenticationMethodsPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuthenticationMethodsPolicy
     */
    @javax.annotation.Nonnull
    public static AuthenticationMethodsPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationMethodsPolicy();
    }
    /**
     * Gets the authenticationMethodConfigurations property value. Represents the settings for each authentication method. Automatically expanded on GET /policies/authenticationMethodsPolicy.
     * @return a authenticationMethodConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationMethodConfiguration> getAuthenticationMethodConfigurations() {
        return this.authenticationMethodConfigurations;
    }
    /**
     * Gets the description property value. A description of the policy. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The name of the policy. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationMethodConfigurations", (n) -> { this.setAuthenticationMethodConfigurations(n.getCollectionOfObjectValues(AuthenticationMethodConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("policyMigrationState", (n) -> { this.setPolicyMigrationState(n.getEnumValue(AuthenticationMethodsPolicyMigrationState.class)); });
        deserializerMap.put("policyVersion", (n) -> { this.setPolicyVersion(n.getStringValue()); });
        deserializerMap.put("reconfirmationInDays", (n) -> { this.setReconfirmationInDays(n.getIntegerValue()); });
        deserializerMap.put("registrationEnforcement", (n) -> { this.setRegistrationEnforcement(n.getObjectValue(RegistrationEnforcement::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time of the last update to the policy. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the policyMigrationState property value. The state of migration of the authentication methods policy from the legacy multifactor authentication and self-service password reset (SSPR) policies. The possible values are: premigration - means the authentication methods policy is used for authentication only, legacy policies are respected. migrationInProgress - means the authentication methods policy is used for both authentication and SSPR, legacy policies are respected. migrationComplete - means the authentication methods policy is used for authentication and SSPR, legacy policies are ignored. unknownFutureValue - Evolvable enumeration sentinel value. Do not use.
     * @return a authenticationMethodsPolicyMigrationState
     */
    @javax.annotation.Nullable
    public AuthenticationMethodsPolicyMigrationState getPolicyMigrationState() {
        return this.policyMigrationState;
    }
    /**
     * Gets the policyVersion property value. The version of the policy in use. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyVersion() {
        return this.policyVersion;
    }
    /**
     * Gets the reconfirmationInDays property value. The reconfirmationInDays property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getReconfirmationInDays() {
        return this.reconfirmationInDays;
    }
    /**
     * Gets the registrationEnforcement property value. Enforce registration at sign-in time. This property can be used to remind users to set up targeted authentication methods.
     * @return a registrationEnforcement
     */
    @javax.annotation.Nullable
    public RegistrationEnforcement getRegistrationEnforcement() {
        return this.registrationEnforcement;
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
        writer.writeCollectionOfObjectValues("authenticationMethodConfigurations", this.getAuthenticationMethodConfigurations());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("policyMigrationState", this.getPolicyMigrationState());
        writer.writeStringValue("policyVersion", this.getPolicyVersion());
        writer.writeIntegerValue("reconfirmationInDays", this.getReconfirmationInDays());
        writer.writeObjectValue("registrationEnforcement", this.getRegistrationEnforcement());
    }
    /**
     * Sets the authenticationMethodConfigurations property value. Represents the settings for each authentication method. Automatically expanded on GET /policies/authenticationMethodsPolicy.
     * @param value Value to set for the authenticationMethodConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationMethodConfigurations(@javax.annotation.Nullable final java.util.List<AuthenticationMethodConfiguration> value) {
        this.authenticationMethodConfigurations = value;
    }
    /**
     * Sets the description property value. A description of the policy. Read-only.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The name of the policy. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time of the last update to the policy. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the policyMigrationState property value. The state of migration of the authentication methods policy from the legacy multifactor authentication and self-service password reset (SSPR) policies. The possible values are: premigration - means the authentication methods policy is used for authentication only, legacy policies are respected. migrationInProgress - means the authentication methods policy is used for both authentication and SSPR, legacy policies are respected. migrationComplete - means the authentication methods policy is used for authentication and SSPR, legacy policies are ignored. unknownFutureValue - Evolvable enumeration sentinel value. Do not use.
     * @param value Value to set for the policyMigrationState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyMigrationState(@javax.annotation.Nullable final AuthenticationMethodsPolicyMigrationState value) {
        this.policyMigrationState = value;
    }
    /**
     * Sets the policyVersion property value. The version of the policy in use. Read-only.
     * @param value Value to set for the policyVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyVersion(@javax.annotation.Nullable final String value) {
        this.policyVersion = value;
    }
    /**
     * Sets the reconfirmationInDays property value. The reconfirmationInDays property
     * @param value Value to set for the reconfirmationInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReconfirmationInDays(@javax.annotation.Nullable final Integer value) {
        this.reconfirmationInDays = value;
    }
    /**
     * Sets the registrationEnforcement property value. Enforce registration at sign-in time. This property can be used to remind users to set up targeted authentication methods.
     * @param value Value to set for the registrationEnforcement property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistrationEnforcement(@javax.annotation.Nullable final RegistrationEnforcement value) {
        this.registrationEnforcement = value;
    }
}
