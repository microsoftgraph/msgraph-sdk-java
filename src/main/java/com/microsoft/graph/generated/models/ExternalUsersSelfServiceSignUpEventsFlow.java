package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExternalUsersSelfServiceSignUpEventsFlow extends AuthenticationEventsFlow implements Parsable {
    /**
     * Instantiates a new {@link ExternalUsersSelfServiceSignUpEventsFlow} and sets the default values.
     */
    public ExternalUsersSelfServiceSignUpEventsFlow() {
        super();
        this.setOdataType("#microsoft.graph.externalUsersSelfServiceSignUpEventsFlow");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExternalUsersSelfServiceSignUpEventsFlow}
     */
    @jakarta.annotation.Nonnull
    public static ExternalUsersSelfServiceSignUpEventsFlow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalUsersSelfServiceSignUpEventsFlow();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("onAttributeCollection", (n) -> { this.setOnAttributeCollection(n.getObjectValue(OnAttributeCollectionHandler::createFromDiscriminatorValue)); });
        deserializerMap.put("onAuthenticationMethodLoadStart", (n) -> { this.setOnAuthenticationMethodLoadStart(n.getObjectValue(OnAuthenticationMethodLoadStartHandler::createFromDiscriminatorValue)); });
        deserializerMap.put("onInteractiveAuthFlowStart", (n) -> { this.setOnInteractiveAuthFlowStart(n.getObjectValue(OnInteractiveAuthFlowStartHandler::createFromDiscriminatorValue)); });
        deserializerMap.put("onUserCreateStart", (n) -> { this.setOnUserCreateStart(n.getObjectValue(OnUserCreateStartHandler::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the onAttributeCollection property value. The configuration for what to invoke when attributes are ready to be collected from the user.
     * @return a {@link OnAttributeCollectionHandler}
     */
    @jakarta.annotation.Nullable
    public OnAttributeCollectionHandler getOnAttributeCollection() {
        return this.backingStore.get("onAttributeCollection");
    }
    /**
     * Gets the onAuthenticationMethodLoadStart property value. Required. The configuration for what to invoke when authentication methods are ready to be presented to the user. Must have at least one identity provider linked.  Supports $filter (eq). See support for filtering on user flows for syntax information.
     * @return a {@link OnAuthenticationMethodLoadStartHandler}
     */
    @jakarta.annotation.Nullable
    public OnAuthenticationMethodLoadStartHandler getOnAuthenticationMethodLoadStart() {
        return this.backingStore.get("onAuthenticationMethodLoadStart");
    }
    /**
     * Gets the onInteractiveAuthFlowStart property value. Required. The configuration for what to invoke when an authentication flow is ready to be initiated.
     * @return a {@link OnInteractiveAuthFlowStartHandler}
     */
    @jakarta.annotation.Nullable
    public OnInteractiveAuthFlowStartHandler getOnInteractiveAuthFlowStart() {
        return this.backingStore.get("onInteractiveAuthFlowStart");
    }
    /**
     * Gets the onUserCreateStart property value. The configuration for what to invoke during user creation.
     * @return a {@link OnUserCreateStartHandler}
     */
    @jakarta.annotation.Nullable
    public OnUserCreateStartHandler getOnUserCreateStart() {
        return this.backingStore.get("onUserCreateStart");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("onAttributeCollection", this.getOnAttributeCollection());
        writer.writeObjectValue("onAuthenticationMethodLoadStart", this.getOnAuthenticationMethodLoadStart());
        writer.writeObjectValue("onInteractiveAuthFlowStart", this.getOnInteractiveAuthFlowStart());
        writer.writeObjectValue("onUserCreateStart", this.getOnUserCreateStart());
    }
    /**
     * Sets the onAttributeCollection property value. The configuration for what to invoke when attributes are ready to be collected from the user.
     * @param value Value to set for the onAttributeCollection property.
     */
    public void setOnAttributeCollection(@jakarta.annotation.Nullable final OnAttributeCollectionHandler value) {
        this.backingStore.set("onAttributeCollection", value);
    }
    /**
     * Sets the onAuthenticationMethodLoadStart property value. Required. The configuration for what to invoke when authentication methods are ready to be presented to the user. Must have at least one identity provider linked.  Supports $filter (eq). See support for filtering on user flows for syntax information.
     * @param value Value to set for the onAuthenticationMethodLoadStart property.
     */
    public void setOnAuthenticationMethodLoadStart(@jakarta.annotation.Nullable final OnAuthenticationMethodLoadStartHandler value) {
        this.backingStore.set("onAuthenticationMethodLoadStart", value);
    }
    /**
     * Sets the onInteractiveAuthFlowStart property value. Required. The configuration for what to invoke when an authentication flow is ready to be initiated.
     * @param value Value to set for the onInteractiveAuthFlowStart property.
     */
    public void setOnInteractiveAuthFlowStart(@jakarta.annotation.Nullable final OnInteractiveAuthFlowStartHandler value) {
        this.backingStore.set("onInteractiveAuthFlowStart", value);
    }
    /**
     * Sets the onUserCreateStart property value. The configuration for what to invoke during user creation.
     * @param value Value to set for the onUserCreateStart property.
     */
    public void setOnUserCreateStart(@jakarta.annotation.Nullable final OnUserCreateStartHandler value) {
        this.backingStore.set("onUserCreateStart", value);
    }
}
