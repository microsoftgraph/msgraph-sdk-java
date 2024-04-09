package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessageRule extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MessageRule} and sets the default values.
     */
    public MessageRule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MessageRule}
     */
    @jakarta.annotation.Nonnull
    public static MessageRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageRule();
    }
    /**
     * Gets the actions property value. Actions to be taken on a message when the corresponding conditions are fulfilled.
     * @return a {@link MessageRuleActions}
     */
    @jakarta.annotation.Nullable
    public MessageRuleActions getActions() {
        return this.backingStore.get("actions");
    }
    /**
     * Gets the conditions property value. Conditions that when fulfilled trigger the corresponding actions for that rule.
     * @return a {@link MessageRulePredicates}
     */
    @jakarta.annotation.Nullable
    public MessageRulePredicates getConditions() {
        return this.backingStore.get("conditions");
    }
    /**
     * Gets the displayName property value. The display name of the rule.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the exceptions property value. Exception conditions for the rule.
     * @return a {@link MessageRulePredicates}
     */
    @jakarta.annotation.Nullable
    public MessageRulePredicates getExceptions() {
        return this.backingStore.get("exceptions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actions", (n) -> { this.setActions(n.getObjectValue(MessageRuleActions::createFromDiscriminatorValue)); });
        deserializerMap.put("conditions", (n) -> { this.setConditions(n.getObjectValue(MessageRulePredicates::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("exceptions", (n) -> { this.setExceptions(n.getObjectValue(MessageRulePredicates::createFromDiscriminatorValue)); });
        deserializerMap.put("hasError", (n) -> { this.setHasError(n.getBooleanValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("isReadOnly", (n) -> { this.setIsReadOnly(n.getBooleanValue()); });
        deserializerMap.put("sequence", (n) -> { this.setSequence(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hasError property value. Indicates whether the rule is in an error condition. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasError() {
        return this.backingStore.get("hasError");
    }
    /**
     * Gets the isEnabled property value. Indicates whether the rule is enabled to be applied to messages.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the isReadOnly property value. Indicates if the rule is read-only and cannot be modified or deleted by the rules REST API.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsReadOnly() {
        return this.backingStore.get("isReadOnly");
    }
    /**
     * Gets the sequence property value. Indicates the order in which the rule is executed, among other rules.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSequence() {
        return this.backingStore.get("sequence");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("actions", this.getActions());
        writer.writeObjectValue("conditions", this.getConditions());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("exceptions", this.getExceptions());
        writer.writeBooleanValue("hasError", this.getHasError());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeBooleanValue("isReadOnly", this.getIsReadOnly());
        writer.writeIntegerValue("sequence", this.getSequence());
    }
    /**
     * Sets the actions property value. Actions to be taken on a message when the corresponding conditions are fulfilled.
     * @param value Value to set for the actions property.
     */
    public void setActions(@jakarta.annotation.Nullable final MessageRuleActions value) {
        this.backingStore.set("actions", value);
    }
    /**
     * Sets the conditions property value. Conditions that when fulfilled trigger the corresponding actions for that rule.
     * @param value Value to set for the conditions property.
     */
    public void setConditions(@jakarta.annotation.Nullable final MessageRulePredicates value) {
        this.backingStore.set("conditions", value);
    }
    /**
     * Sets the displayName property value. The display name of the rule.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the exceptions property value. Exception conditions for the rule.
     * @param value Value to set for the exceptions property.
     */
    public void setExceptions(@jakarta.annotation.Nullable final MessageRulePredicates value) {
        this.backingStore.set("exceptions", value);
    }
    /**
     * Sets the hasError property value. Indicates whether the rule is in an error condition. Read-only.
     * @param value Value to set for the hasError property.
     */
    public void setHasError(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasError", value);
    }
    /**
     * Sets the isEnabled property value. Indicates whether the rule is enabled to be applied to messages.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the isReadOnly property value. Indicates if the rule is read-only and cannot be modified or deleted by the rules REST API.
     * @param value Value to set for the isReadOnly property.
     */
    public void setIsReadOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isReadOnly", value);
    }
    /**
     * Sets the sequence property value. Indicates the order in which the rule is executed, among other rules.
     * @param value Value to set for the sequence property.
     */
    public void setSequence(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("sequence", value);
    }
}
