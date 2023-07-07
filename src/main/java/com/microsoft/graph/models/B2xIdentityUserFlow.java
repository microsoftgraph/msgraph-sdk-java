package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class B2xIdentityUserFlow extends IdentityUserFlow implements Parsable {
    /**
     * Configuration for enabling an API connector for use as part of the self-service sign-up user flow. You can only obtain the value of this object using Get userFlowApiConnectorConfiguration.
     */
    private UserFlowApiConnectorConfiguration apiConnectorConfiguration;
    /**
     * The identity providers included in the user flow.
     */
    private java.util.List<IdentityProvider> identityProviders;
    /**
     * The languages supported for customization within the user flow. Language customization is enabled by default in self-service sign-up user flow. You cannot create custom languages in self-service sign-up user flows.
     */
    private java.util.List<UserFlowLanguageConfiguration> languages;
    /**
     * The user attribute assignments included in the user flow.
     */
    private java.util.List<IdentityUserFlowAttributeAssignment> userAttributeAssignments;
    /**
     * The userFlowIdentityProviders property
     */
    private java.util.List<IdentityProviderBase> userFlowIdentityProviders;
    /**
     * Instantiates a new B2xIdentityUserFlow and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public B2xIdentityUserFlow() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a B2xIdentityUserFlow
     */
    @javax.annotation.Nonnull
    public static B2xIdentityUserFlow createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new B2xIdentityUserFlow();
    }
    /**
     * Gets the apiConnectorConfiguration property value. Configuration for enabling an API connector for use as part of the self-service sign-up user flow. You can only obtain the value of this object using Get userFlowApiConnectorConfiguration.
     * @return a userFlowApiConnectorConfiguration
     */
    @javax.annotation.Nullable
    public UserFlowApiConnectorConfiguration getApiConnectorConfiguration() {
        return this.apiConnectorConfiguration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("apiConnectorConfiguration", (n) -> { this.setApiConnectorConfiguration(n.getObjectValue(UserFlowApiConnectorConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("identityProviders", (n) -> { this.setIdentityProviders(n.getCollectionOfObjectValues(IdentityProvider::createFromDiscriminatorValue)); });
        deserializerMap.put("languages", (n) -> { this.setLanguages(n.getCollectionOfObjectValues(UserFlowLanguageConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("userAttributeAssignments", (n) -> { this.setUserAttributeAssignments(n.getCollectionOfObjectValues(IdentityUserFlowAttributeAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("userFlowIdentityProviders", (n) -> { this.setUserFlowIdentityProviders(n.getCollectionOfObjectValues(IdentityProviderBase::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identityProviders property value. The identity providers included in the user flow.
     * @return a identityProvider
     */
    @javax.annotation.Nullable
    public java.util.List<IdentityProvider> getIdentityProviders() {
        return this.identityProviders;
    }
    /**
     * Gets the languages property value. The languages supported for customization within the user flow. Language customization is enabled by default in self-service sign-up user flow. You cannot create custom languages in self-service sign-up user flows.
     * @return a userFlowLanguageConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<UserFlowLanguageConfiguration> getLanguages() {
        return this.languages;
    }
    /**
     * Gets the userAttributeAssignments property value. The user attribute assignments included in the user flow.
     * @return a identityUserFlowAttributeAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<IdentityUserFlowAttributeAssignment> getUserAttributeAssignments() {
        return this.userAttributeAssignments;
    }
    /**
     * Gets the userFlowIdentityProviders property value. The userFlowIdentityProviders property
     * @return a identityProviderBase
     */
    @javax.annotation.Nullable
    public java.util.List<IdentityProviderBase> getUserFlowIdentityProviders() {
        return this.userFlowIdentityProviders;
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
        writer.writeObjectValue("apiConnectorConfiguration", this.getApiConnectorConfiguration());
        writer.writeCollectionOfObjectValues("identityProviders", this.getIdentityProviders());
        writer.writeCollectionOfObjectValues("languages", this.getLanguages());
        writer.writeCollectionOfObjectValues("userAttributeAssignments", this.getUserAttributeAssignments());
        writer.writeCollectionOfObjectValues("userFlowIdentityProviders", this.getUserFlowIdentityProviders());
    }
    /**
     * Sets the apiConnectorConfiguration property value. Configuration for enabling an API connector for use as part of the self-service sign-up user flow. You can only obtain the value of this object using Get userFlowApiConnectorConfiguration.
     * @param value Value to set for the apiConnectorConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApiConnectorConfiguration(@javax.annotation.Nullable final UserFlowApiConnectorConfiguration value) {
        this.apiConnectorConfiguration = value;
    }
    /**
     * Sets the identityProviders property value. The identity providers included in the user flow.
     * @param value Value to set for the identityProviders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityProviders(@javax.annotation.Nullable final java.util.List<IdentityProvider> value) {
        this.identityProviders = value;
    }
    /**
     * Sets the languages property value. The languages supported for customization within the user flow. Language customization is enabled by default in self-service sign-up user flow. You cannot create custom languages in self-service sign-up user flows.
     * @param value Value to set for the languages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLanguages(@javax.annotation.Nullable final java.util.List<UserFlowLanguageConfiguration> value) {
        this.languages = value;
    }
    /**
     * Sets the userAttributeAssignments property value. The user attribute assignments included in the user flow.
     * @param value Value to set for the userAttributeAssignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserAttributeAssignments(@javax.annotation.Nullable final java.util.List<IdentityUserFlowAttributeAssignment> value) {
        this.userAttributeAssignments = value;
    }
    /**
     * Sets the userFlowIdentityProviders property value. The userFlowIdentityProviders property
     * @param value Value to set for the userFlowIdentityProviders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserFlowIdentityProviders(@javax.annotation.Nullable final java.util.List<IdentityProviderBase> value) {
        this.userFlowIdentityProviders = value;
    }
}
