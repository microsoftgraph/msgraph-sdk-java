package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class B2xIdentityUserFlow extends IdentityUserFlow implements Parsable {
    /**
     * Instantiates a new B2xIdentityUserFlow and sets the default values.
     */
    public B2xIdentityUserFlow() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a B2xIdentityUserFlow
     */
    @jakarta.annotation.Nonnull
    public static B2xIdentityUserFlow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new B2xIdentityUserFlow();
    }
    /**
     * Gets the apiConnectorConfiguration property value. Configuration for enabling an API connector for use as part of the self-service sign-up user flow. You can only obtain the value of this object using Get userFlowApiConnectorConfiguration.
     * @return a UserFlowApiConnectorConfiguration
     */
    @jakarta.annotation.Nullable
    public UserFlowApiConnectorConfiguration getApiConnectorConfiguration() {
        return this.backingStore.get("apiConnectorConfiguration");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a java.util.List<IdentityProvider>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentityProvider> getIdentityProviders() {
        return this.backingStore.get("identityProviders");
    }
    /**
     * Gets the languages property value. The languages supported for customization within the user flow. Language customization is enabled by default in self-service sign-up user flow. You can't create custom languages in self-service sign-up user flows.
     * @return a java.util.List<UserFlowLanguageConfiguration>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserFlowLanguageConfiguration> getLanguages() {
        return this.backingStore.get("languages");
    }
    /**
     * Gets the userAttributeAssignments property value. The user attribute assignments included in the user flow.
     * @return a java.util.List<IdentityUserFlowAttributeAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentityUserFlowAttributeAssignment> getUserAttributeAssignments() {
        return this.backingStore.get("userAttributeAssignments");
    }
    /**
     * Gets the userFlowIdentityProviders property value. The userFlowIdentityProviders property
     * @return a java.util.List<IdentityProviderBase>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentityProviderBase> getUserFlowIdentityProviders() {
        return this.backingStore.get("userFlowIdentityProviders");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setApiConnectorConfiguration(@jakarta.annotation.Nullable final UserFlowApiConnectorConfiguration value) {
        this.backingStore.set("apiConnectorConfiguration", value);
    }
    /**
     * Sets the identityProviders property value. The identity providers included in the user flow.
     * @param value Value to set for the identityProviders property.
     */
    public void setIdentityProviders(@jakarta.annotation.Nullable final java.util.List<IdentityProvider> value) {
        this.backingStore.set("identityProviders", value);
    }
    /**
     * Sets the languages property value. The languages supported for customization within the user flow. Language customization is enabled by default in self-service sign-up user flow. You can't create custom languages in self-service sign-up user flows.
     * @param value Value to set for the languages property.
     */
    public void setLanguages(@jakarta.annotation.Nullable final java.util.List<UserFlowLanguageConfiguration> value) {
        this.backingStore.set("languages", value);
    }
    /**
     * Sets the userAttributeAssignments property value. The user attribute assignments included in the user flow.
     * @param value Value to set for the userAttributeAssignments property.
     */
    public void setUserAttributeAssignments(@jakarta.annotation.Nullable final java.util.List<IdentityUserFlowAttributeAssignment> value) {
        this.backingStore.set("userAttributeAssignments", value);
    }
    /**
     * Sets the userFlowIdentityProviders property value. The userFlowIdentityProviders property
     * @param value Value to set for the userFlowIdentityProviders property.
     */
    public void setUserFlowIdentityProviders(@jakarta.annotation.Nullable final java.util.List<IdentityProviderBase> value) {
        this.backingStore.set("userFlowIdentityProviders", value);
    }
}
