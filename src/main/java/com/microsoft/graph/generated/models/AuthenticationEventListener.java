package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationEventListener extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AuthenticationEventListener} and sets the default values.
     */
    public AuthenticationEventListener() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AuthenticationEventListener}
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationEventListener createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.onTokenIssuanceStartListener": return new OnTokenIssuanceStartListener();
            }
        }
        return new AuthenticationEventListener();
    }
    /**
     * Gets the authenticationEventsFlowId property value. The authenticationEventsFlowId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAuthenticationEventsFlowId() {
        return this.backingStore.get("authenticationEventsFlowId");
    }
    /**
     * Gets the conditions property value. The conditions on which this authenticationEventListener should trigger.
     * @return a {@link AuthenticationConditions}
     */
    @jakarta.annotation.Nullable
    public AuthenticationConditions getConditions() {
        return this.backingStore.get("conditions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationEventsFlowId", (n) -> { this.setAuthenticationEventsFlowId(n.getStringValue()); });
        deserializerMap.put("conditions", (n) -> { this.setConditions(n.getObjectValue(AuthenticationConditions::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("authenticationEventsFlowId", this.getAuthenticationEventsFlowId());
        writer.writeObjectValue("conditions", this.getConditions());
    }
    /**
     * Sets the authenticationEventsFlowId property value. The authenticationEventsFlowId property
     * @param value Value to set for the authenticationEventsFlowId property.
     */
    public void setAuthenticationEventsFlowId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("authenticationEventsFlowId", value);
    }
    /**
     * Sets the conditions property value. The conditions on which this authenticationEventListener should trigger.
     * @param value Value to set for the conditions property.
     */
    public void setConditions(@jakarta.annotation.Nullable final AuthenticationConditions value) {
        this.backingStore.set("conditions", value);
    }
}
