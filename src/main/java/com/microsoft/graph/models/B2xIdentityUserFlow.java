package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the identityContainer singleton. */
public class B2xIdentityUserFlow extends IdentityUserFlow implements Parsable {
    /** Configuration for enabling an API connector for use as part of the self-service sign up user flow. You can only obtain the value of this object using Get userFlowApiConnectorConfiguration. */
    private UserFlowApiConnectorConfiguration _apiConnectorConfiguration;
    /** The identity providers included in the user flow. */
    private java.util.List<IdentityProvider> _identityProviders;
    /** The languages supported for customization within the user flow. Language customization is enabled by default in self-service sign up user flow. You cannot create custom languages in self-service sign up user flows. */
    private java.util.List<UserFlowLanguageConfiguration> _languages;
    /** The user attribute assignments included in the user flow. */
    private java.util.List<IdentityUserFlowAttributeAssignment> _userAttributeAssignments;
    /** The userFlowIdentityProviders property */
    private java.util.List<IdentityProviderBase> _userFlowIdentityProviders;
    /**
     * Instantiates a new b2xIdentityUserFlow and sets the default values.
     * @return a void
     */
    public B2xIdentityUserFlow() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a b2xIdentityUserFlow
     */
    @javax.annotation.Nonnull
    public static B2xIdentityUserFlow createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new B2xIdentityUserFlow();
    }
    /**
     * Gets the apiConnectorConfiguration property value. Configuration for enabling an API connector for use as part of the self-service sign up user flow. You can only obtain the value of this object using Get userFlowApiConnectorConfiguration.
     * @return a userFlowApiConnectorConfiguration
     */
    @javax.annotation.Nullable
    public UserFlowApiConnectorConfiguration getApiConnectorConfiguration() {
        return this._apiConnectorConfiguration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final B2xIdentityUserFlow currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("apiConnectorConfiguration", (n) -> { currentObject.setApiConnectorConfiguration(n.getObjectValue(UserFlowApiConnectorConfiguration::createFromDiscriminatorValue)); });
            this.put("identityProviders", (n) -> { currentObject.setIdentityProviders(n.getCollectionOfObjectValues(IdentityProvider::createFromDiscriminatorValue)); });
            this.put("languages", (n) -> { currentObject.setLanguages(n.getCollectionOfObjectValues(UserFlowLanguageConfiguration::createFromDiscriminatorValue)); });
            this.put("userAttributeAssignments", (n) -> { currentObject.setUserAttributeAssignments(n.getCollectionOfObjectValues(IdentityUserFlowAttributeAssignment::createFromDiscriminatorValue)); });
            this.put("userFlowIdentityProviders", (n) -> { currentObject.setUserFlowIdentityProviders(n.getCollectionOfObjectValues(IdentityProviderBase::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the identityProviders property value. The identity providers included in the user flow.
     * @return a identityProvider
     */
    @javax.annotation.Nullable
    public java.util.List<IdentityProvider> getIdentityProviders() {
        return this._identityProviders;
    }
    /**
     * Gets the languages property value. The languages supported for customization within the user flow. Language customization is enabled by default in self-service sign up user flow. You cannot create custom languages in self-service sign up user flows.
     * @return a userFlowLanguageConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<UserFlowLanguageConfiguration> getLanguages() {
        return this._languages;
    }
    /**
     * Gets the userAttributeAssignments property value. The user attribute assignments included in the user flow.
     * @return a identityUserFlowAttributeAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<IdentityUserFlowAttributeAssignment> getUserAttributeAssignments() {
        return this._userAttributeAssignments;
    }
    /**
     * Gets the userFlowIdentityProviders property value. The userFlowIdentityProviders property
     * @return a identityProviderBase
     */
    @javax.annotation.Nullable
    public java.util.List<IdentityProviderBase> getUserFlowIdentityProviders() {
        return this._userFlowIdentityProviders;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
     * Sets the apiConnectorConfiguration property value. Configuration for enabling an API connector for use as part of the self-service sign up user flow. You can only obtain the value of this object using Get userFlowApiConnectorConfiguration.
     * @param value Value to set for the apiConnectorConfiguration property.
     * @return a void
     */
    public void setApiConnectorConfiguration(@javax.annotation.Nullable final UserFlowApiConnectorConfiguration value) {
        this._apiConnectorConfiguration = value;
    }
    /**
     * Sets the identityProviders property value. The identity providers included in the user flow.
     * @param value Value to set for the identityProviders property.
     * @return a void
     */
    public void setIdentityProviders(@javax.annotation.Nullable final java.util.List<IdentityProvider> value) {
        this._identityProviders = value;
    }
    /**
     * Sets the languages property value. The languages supported for customization within the user flow. Language customization is enabled by default in self-service sign up user flow. You cannot create custom languages in self-service sign up user flows.
     * @param value Value to set for the languages property.
     * @return a void
     */
    public void setLanguages(@javax.annotation.Nullable final java.util.List<UserFlowLanguageConfiguration> value) {
        this._languages = value;
    }
    /**
     * Sets the userAttributeAssignments property value. The user attribute assignments included in the user flow.
     * @param value Value to set for the userAttributeAssignments property.
     * @return a void
     */
    public void setUserAttributeAssignments(@javax.annotation.Nullable final java.util.List<IdentityUserFlowAttributeAssignment> value) {
        this._userAttributeAssignments = value;
    }
    /**
     * Sets the userFlowIdentityProviders property value. The userFlowIdentityProviders property
     * @param value Value to set for the userFlowIdentityProviders property.
     * @return a void
     */
    public void setUserFlowIdentityProviders(@javax.annotation.Nullable final java.util.List<IdentityProviderBase> value) {
        this._userFlowIdentityProviders = value;
    }
}
