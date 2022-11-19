package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IdentityContainer extends Entity implements Parsable {
    /** Represents entry point for API connectors. */
    private java.util.List<IdentityApiConnector> _apiConnectors;
    /** Represents entry point for B2X/self-service sign-up identity userflows. */
    private java.util.List<B2xIdentityUserFlow> _b2xUserFlows;
    /** the entry point for the Conditional Access (CA) object model. */
    private ConditionalAccessRoot _conditionalAccess;
    /** The identityProviders property */
    private java.util.List<IdentityProviderBase> _identityProviders;
    /** Represents entry point for identity userflow attributes. */
    private java.util.List<IdentityUserFlowAttribute> _userFlowAttributes;
    /**
     * Instantiates a new IdentityContainer and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IdentityContainer() {
        super();
        this.setOdataType("#microsoft.graph.identityContainer");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IdentityContainer
     */
    @javax.annotation.Nonnull
    public static IdentityContainer createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityContainer();
    }
    /**
     * Gets the apiConnectors property value. Represents entry point for API connectors.
     * @return a identityApiConnector
     */
    @javax.annotation.Nullable
    public java.util.List<IdentityApiConnector> getApiConnectors() {
        return this._apiConnectors;
    }
    /**
     * Gets the b2xUserFlows property value. Represents entry point for B2X/self-service sign-up identity userflows.
     * @return a b2xIdentityUserFlow
     */
    @javax.annotation.Nullable
    public java.util.List<B2xIdentityUserFlow> getB2xUserFlows() {
        return this._b2xUserFlows;
    }
    /**
     * Gets the conditionalAccess property value. the entry point for the Conditional Access (CA) object model.
     * @return a conditionalAccessRoot
     */
    @javax.annotation.Nullable
    public ConditionalAccessRoot getConditionalAccess() {
        return this._conditionalAccess;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IdentityContainer currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("apiConnectors", (n) -> { currentObject.setApiConnectors(n.getCollectionOfObjectValues(IdentityApiConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("b2xUserFlows", (n) -> { currentObject.setB2xUserFlows(n.getCollectionOfObjectValues(B2xIdentityUserFlow::createFromDiscriminatorValue)); });
        deserializerMap.put("conditionalAccess", (n) -> { currentObject.setConditionalAccess(n.getObjectValue(ConditionalAccessRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("identityProviders", (n) -> { currentObject.setIdentityProviders(n.getCollectionOfObjectValues(IdentityProviderBase::createFromDiscriminatorValue)); });
        deserializerMap.put("userFlowAttributes", (n) -> { currentObject.setUserFlowAttributes(n.getCollectionOfObjectValues(IdentityUserFlowAttribute::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the identityProviders property value. The identityProviders property
     * @return a identityProviderBase
     */
    @javax.annotation.Nullable
    public java.util.List<IdentityProviderBase> getIdentityProviders() {
        return this._identityProviders;
    }
    /**
     * Gets the userFlowAttributes property value. Represents entry point for identity userflow attributes.
     * @return a identityUserFlowAttribute
     */
    @javax.annotation.Nullable
    public java.util.List<IdentityUserFlowAttribute> getUserFlowAttributes() {
        return this._userFlowAttributes;
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
        writer.writeCollectionOfObjectValues("apiConnectors", this.getApiConnectors());
        writer.writeCollectionOfObjectValues("b2xUserFlows", this.getB2xUserFlows());
        writer.writeObjectValue("conditionalAccess", this.getConditionalAccess());
        writer.writeCollectionOfObjectValues("identityProviders", this.getIdentityProviders());
        writer.writeCollectionOfObjectValues("userFlowAttributes", this.getUserFlowAttributes());
    }
    /**
     * Sets the apiConnectors property value. Represents entry point for API connectors.
     * @param value Value to set for the apiConnectors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApiConnectors(@javax.annotation.Nullable final java.util.List<IdentityApiConnector> value) {
        this._apiConnectors = value;
    }
    /**
     * Sets the b2xUserFlows property value. Represents entry point for B2X/self-service sign-up identity userflows.
     * @param value Value to set for the b2xUserFlows property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setB2xUserFlows(@javax.annotation.Nullable final java.util.List<B2xIdentityUserFlow> value) {
        this._b2xUserFlows = value;
    }
    /**
     * Sets the conditionalAccess property value. the entry point for the Conditional Access (CA) object model.
     * @param value Value to set for the conditionalAccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConditionalAccess(@javax.annotation.Nullable final ConditionalAccessRoot value) {
        this._conditionalAccess = value;
    }
    /**
     * Sets the identityProviders property value. The identityProviders property
     * @param value Value to set for the identityProviders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityProviders(@javax.annotation.Nullable final java.util.List<IdentityProviderBase> value) {
        this._identityProviders = value;
    }
    /**
     * Sets the userFlowAttributes property value. Represents entry point for identity userflow attributes.
     * @param value Value to set for the userFlowAttributes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserFlowAttributes(@javax.annotation.Nullable final java.util.List<IdentityUserFlowAttribute> value) {
        this._userFlowAttributes = value;
    }
}
