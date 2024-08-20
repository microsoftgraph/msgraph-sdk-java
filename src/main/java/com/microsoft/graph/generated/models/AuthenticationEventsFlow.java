package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationEventsFlow extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AuthenticationEventsFlow} and sets the default values.
     */
    public AuthenticationEventsFlow() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AuthenticationEventsFlow}
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationEventsFlow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.externalUsersSelfServiceSignUpEventsFlow": return new ExternalUsersSelfServiceSignUpEventsFlow();
            }
        }
        return new AuthenticationEventsFlow();
    }
    /**
     * Gets the conditions property value. The conditions representing the context of the authentication request that's used to decide whether the events policy is invoked.  Supports $filter (eq). See support for filtering on user flows for syntax information.
     * @return a {@link AuthenticationConditions}
     */
    @jakarta.annotation.Nullable
    public AuthenticationConditions getConditions() {
        return this.backingStore.get("conditions");
    }
    /**
     * Gets the description property value. The description of the events policy.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Required. The display name for the events policy.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("conditions", (n) -> { this.setConditions(n.getObjectValue(AuthenticationConditions::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("conditions", this.getConditions());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the conditions property value. The conditions representing the context of the authentication request that's used to decide whether the events policy is invoked.  Supports $filter (eq). See support for filtering on user flows for syntax information.
     * @param value Value to set for the conditions property.
     */
    public void setConditions(@jakarta.annotation.Nullable final AuthenticationConditions value) {
        this.backingStore.set("conditions", value);
    }
    /**
     * Sets the description property value. The description of the events policy.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Required. The display name for the events policy.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
}
