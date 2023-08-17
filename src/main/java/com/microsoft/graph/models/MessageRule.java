package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MessageRule extends Entity implements Parsable {
    /**
     * Actions to be taken on a message when the corresponding conditions are fulfilled.
     */
    private MessageRuleActions actions;
    /**
     * Conditions that when fulfilled, will trigger the corresponding actions for that rule.
     */
    private MessageRulePredicates conditions;
    /**
     * The display name of the rule.
     */
    private String displayName;
    /**
     * Exception conditions for the rule.
     */
    private MessageRulePredicates exceptions;
    /**
     * Indicates whether the rule is in an error condition. Read-only.
     */
    private Boolean hasError;
    /**
     * Indicates whether the rule is enabled to be applied to messages.
     */
    private Boolean isEnabled;
    /**
     * Indicates if the rule is read-only and cannot be modified or deleted by the rules REST API.
     */
    private Boolean isReadOnly;
    /**
     * Indicates the order in which the rule is executed, among other rules.
     */
    private Integer sequence;
    /**
     * Instantiates a new messageRule and sets the default values.
     */
    public MessageRule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a messageRule
     */
    @jakarta.annotation.Nonnull
    public static MessageRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageRule();
    }
    /**
     * Gets the actions property value. Actions to be taken on a message when the corresponding conditions are fulfilled.
     * @return a messageRuleActions
     */
    @jakarta.annotation.Nullable
    public MessageRuleActions getActions() {
        return this.actions;
    }
    /**
     * Gets the conditions property value. Conditions that when fulfilled, will trigger the corresponding actions for that rule.
     * @return a messageRulePredicates
     */
    @jakarta.annotation.Nullable
    public MessageRulePredicates getConditions() {
        return this.conditions;
    }
    /**
     * Gets the displayName property value. The display name of the rule.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the exceptions property value. Exception conditions for the rule.
     * @return a messageRulePredicates
     */
    @jakarta.annotation.Nullable
    public MessageRulePredicates getExceptions() {
        return this.exceptions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHasError() {
        return this.hasError;
    }
    /**
     * Gets the isEnabled property value. Indicates whether the rule is enabled to be applied to messages.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Gets the isReadOnly property value. Indicates if the rule is read-only and cannot be modified or deleted by the rules REST API.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsReadOnly() {
        return this.isReadOnly;
    }
    /**
     * Gets the sequence property value. Indicates the order in which the rule is executed, among other rules.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSequence() {
        return this.sequence;
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
        this.actions = value;
    }
    /**
     * Sets the conditions property value. Conditions that when fulfilled, will trigger the corresponding actions for that rule.
     * @param value Value to set for the conditions property.
     */
    public void setConditions(@jakarta.annotation.Nullable final MessageRulePredicates value) {
        this.conditions = value;
    }
    /**
     * Sets the displayName property value. The display name of the rule.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the exceptions property value. Exception conditions for the rule.
     * @param value Value to set for the exceptions property.
     */
    public void setExceptions(@jakarta.annotation.Nullable final MessageRulePredicates value) {
        this.exceptions = value;
    }
    /**
     * Sets the hasError property value. Indicates whether the rule is in an error condition. Read-only.
     * @param value Value to set for the hasError property.
     */
    public void setHasError(@jakarta.annotation.Nullable final Boolean value) {
        this.hasError = value;
    }
    /**
     * Sets the isEnabled property value. Indicates whether the rule is enabled to be applied to messages.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isEnabled = value;
    }
    /**
     * Sets the isReadOnly property value. Indicates if the rule is read-only and cannot be modified or deleted by the rules REST API.
     * @param value Value to set for the isReadOnly property.
     */
    public void setIsReadOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.isReadOnly = value;
    }
    /**
     * Sets the sequence property value. Indicates the order in which the rule is executed, among other rules.
     * @param value Value to set for the sequence property.
     */
    public void setSequence(@jakarta.annotation.Nullable final Integer value) {
        this.sequence = value;
    }
}
