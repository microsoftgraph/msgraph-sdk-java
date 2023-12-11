package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConditionalAccessPolicy extends Entity implements Parsable {
    /**
     * Instantiates a new ConditionalAccessPolicy and sets the default values.
     */
    public ConditionalAccessPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConditionalAccessPolicy
     */
    @jakarta.annotation.Nonnull
    public static ConditionalAccessPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessPolicy();
    }
    /**
     * Gets the conditions property value. The conditions property
     * @return a ConditionalAccessConditionSet
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessConditionSet getConditions() {
        return this.backingStore.get("conditions");
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Readonly.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. The description property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Specifies a display name for the conditionalAccessPolicy object.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("conditions", (n) -> { this.setConditions(n.getObjectValue(ConditionalAccessConditionSet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("grantControls", (n) -> { this.setGrantControls(n.getObjectValue(ConditionalAccessGrantControls::createFromDiscriminatorValue)); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sessionControls", (n) -> { this.setSessionControls(n.getObjectValue(ConditionalAccessSessionControls::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ConditionalAccessPolicyState::forValue)); });
        deserializerMap.put("templateId", (n) -> { this.setTemplateId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the grantControls property value. Specifies the grant controls that must be fulfilled to pass the policy.
     * @return a ConditionalAccessGrantControls
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessGrantControls getGrantControls() {
        return this.backingStore.get("grantControls");
    }
    /**
     * Gets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Readonly.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.backingStore.get("modifiedDateTime");
    }
    /**
     * Gets the sessionControls property value. Specifies the session controls that are enforced after sign-in.
     * @return a ConditionalAccessSessionControls
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessSessionControls getSessionControls() {
        return this.backingStore.get("sessionControls");
    }
    /**
     * Gets the state property value. The state property
     * @return a ConditionalAccessPolicyState
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessPolicyState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the templateId property value. The templateId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTemplateId() {
        return this.backingStore.get("templateId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("conditions", this.getConditions());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("grantControls", this.getGrantControls());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeObjectValue("sessionControls", this.getSessionControls());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("templateId", this.getTemplateId());
    }
    /**
     * Sets the conditions property value. The conditions property
     * @param value Value to set for the conditions property.
     */
    public void setConditions(@jakarta.annotation.Nullable final ConditionalAccessConditionSet value) {
        this.backingStore.set("conditions", value);
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Readonly.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Specifies a display name for the conditionalAccessPolicy object.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the grantControls property value. Specifies the grant controls that must be fulfilled to pass the policy.
     * @param value Value to set for the grantControls property.
     */
    public void setGrantControls(@jakarta.annotation.Nullable final ConditionalAccessGrantControls value) {
        this.backingStore.set("grantControls", value);
    }
    /**
     * Sets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Readonly.
     * @param value Value to set for the modifiedDateTime property.
     */
    public void setModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("modifiedDateTime", value);
    }
    /**
     * Sets the sessionControls property value. Specifies the session controls that are enforced after sign-in.
     * @param value Value to set for the sessionControls property.
     */
    public void setSessionControls(@jakarta.annotation.Nullable final ConditionalAccessSessionControls value) {
        this.backingStore.set("sessionControls", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ConditionalAccessPolicyState value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the templateId property value. The templateId property
     * @param value Value to set for the templateId property.
     */
    public void setTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("templateId", value);
    }
}
