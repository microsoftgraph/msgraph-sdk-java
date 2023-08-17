package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IdentityContainer extends Entity implements Parsable {
    /**
     * Represents entry point for API connectors.
     */
    private java.util.List<IdentityApiConnector> apiConnectors;
    /**
     * Represents entry point for B2X/self-service sign-up identity userflows.
     */
    private java.util.List<B2xIdentityUserFlow> b2xUserFlows;
    /**
     * the entry point for the Conditional Access (CA) object model.
     */
    private ConditionalAccessRoot conditionalAccess;
    /**
     * The identityProviders property
     */
    private java.util.List<IdentityProviderBase> identityProviders;
    /**
     * Represents entry point for identity userflow attributes.
     */
    private java.util.List<IdentityUserFlowAttribute> userFlowAttributes;
    /**
     * Instantiates a new identityContainer and sets the default values.
     */
    public IdentityContainer() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a identityContainer
     */
    @jakarta.annotation.Nonnull
    public static IdentityContainer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityContainer();
    }
    /**
     * Gets the apiConnectors property value. Represents entry point for API connectors.
     * @return a identityApiConnector
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentityApiConnector> getApiConnectors() {
        return this.apiConnectors;
    }
    /**
     * Gets the b2xUserFlows property value. Represents entry point for B2X/self-service sign-up identity userflows.
     * @return a b2xIdentityUserFlow
     */
    @jakarta.annotation.Nullable
    public java.util.List<B2xIdentityUserFlow> getB2xUserFlows() {
        return this.b2xUserFlows;
    }
    /**
     * Gets the conditionalAccess property value. the entry point for the Conditional Access (CA) object model.
     * @return a conditionalAccessRoot
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessRoot getConditionalAccess() {
        return this.conditionalAccess;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("apiConnectors", (n) -> { this.setApiConnectors(n.getCollectionOfObjectValues(IdentityApiConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("b2xUserFlows", (n) -> { this.setB2xUserFlows(n.getCollectionOfObjectValues(B2xIdentityUserFlow::createFromDiscriminatorValue)); });
        deserializerMap.put("conditionalAccess", (n) -> { this.setConditionalAccess(n.getObjectValue(ConditionalAccessRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("identityProviders", (n) -> { this.setIdentityProviders(n.getCollectionOfObjectValues(IdentityProviderBase::createFromDiscriminatorValue)); });
        deserializerMap.put("userFlowAttributes", (n) -> { this.setUserFlowAttributes(n.getCollectionOfObjectValues(IdentityUserFlowAttribute::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identityProviders property value. The identityProviders property
     * @return a identityProviderBase
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentityProviderBase> getIdentityProviders() {
        return this.identityProviders;
    }
    /**
     * Gets the userFlowAttributes property value. Represents entry point for identity userflow attributes.
     * @return a identityUserFlowAttribute
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentityUserFlowAttribute> getUserFlowAttributes() {
        return this.userFlowAttributes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("apiConnectors", this.getApiConnectors());
        writer.writeCollectionOfObjectValues("b2xUserFlows", this.getB2xUserFlows());
        writer.writeObjectValue("conditionalAccess", this.getConditionalAccess());
        writer.writeCollectionOfObjectValues("identityProviders", this.getIdentityProviders());
        writer.writeCollectionOfObjectValues("userFlowAttributes", this.getUserFlowAttributes());
    }
    /**
     * Sets the apiConnectors property value. Represents entry point for API connectors.
     * @param value Value to set for the apiConnectors property.
     */
    public void setApiConnectors(@jakarta.annotation.Nullable final java.util.List<IdentityApiConnector> value) {
        this.apiConnectors = value;
    }
    /**
     * Sets the b2xUserFlows property value. Represents entry point for B2X/self-service sign-up identity userflows.
     * @param value Value to set for the b2xUserFlows property.
     */
    public void setB2xUserFlows(@jakarta.annotation.Nullable final java.util.List<B2xIdentityUserFlow> value) {
        this.b2xUserFlows = value;
    }
    /**
     * Sets the conditionalAccess property value. the entry point for the Conditional Access (CA) object model.
     * @param value Value to set for the conditionalAccess property.
     */
    public void setConditionalAccess(@jakarta.annotation.Nullable final ConditionalAccessRoot value) {
        this.conditionalAccess = value;
    }
    /**
     * Sets the identityProviders property value. The identityProviders property
     * @param value Value to set for the identityProviders property.
     */
    public void setIdentityProviders(@jakarta.annotation.Nullable final java.util.List<IdentityProviderBase> value) {
        this.identityProviders = value;
    }
    /**
     * Sets the userFlowAttributes property value. Represents entry point for identity userflow attributes.
     * @param value Value to set for the userFlowAttributes property.
     */
    public void setUserFlowAttributes(@jakarta.annotation.Nullable final java.util.List<IdentityUserFlowAttribute> value) {
        this.userFlowAttributes = value;
    }
}
