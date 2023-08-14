package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessPolicy extends Entity implements Parsable {
    /**
     * The conditions property
     */
    private ConditionalAccessConditionSet conditions;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Readonly.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The description property
     */
    private String description;
    /**
     * Specifies a display name for the conditionalAccessPolicy object.
     */
    private String displayName;
    /**
     * Specifies the grant controls that must be fulfilled to pass the policy.
     */
    private ConditionalAccessGrantControls grantControls;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Readonly.
     */
    private OffsetDateTime modifiedDateTime;
    /**
     * Specifies the session controls that are enforced after sign-in.
     */
    private ConditionalAccessSessionControls sessionControls;
    /**
     * The state property
     */
    private ConditionalAccessPolicyState state;
    /**
     * Instantiates a new conditionalAccessPolicy and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conditionalAccessPolicy
     */
    @jakarta.annotation.Nonnull
    public static ConditionalAccessPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessPolicy();
    }
    /**
     * Gets the conditions property value. The conditions property
     * @return a conditionalAccessConditionSet
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessConditionSet getConditions() {
        return this.conditions;
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Readonly.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Specifies a display name for the conditionalAccessPolicy object.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
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
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ConditionalAccessPolicyState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the grantControls property value. Specifies the grant controls that must be fulfilled to pass the policy.
     * @return a conditionalAccessGrantControls
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessGrantControls getGrantControls() {
        return this.grantControls;
    }
    /**
     * Gets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Readonly.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.modifiedDateTime;
    }
    /**
     * Gets the sessionControls property value. Specifies the session controls that are enforced after sign-in.
     * @return a conditionalAccessSessionControls
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessSessionControls getSessionControls() {
        return this.sessionControls;
    }
    /**
     * Gets the state property value. The state property
     * @return a conditionalAccessPolicyState
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessPolicyState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
    }
    /**
     * Sets the conditions property value. The conditions property
     * @param value Value to set for the conditions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setConditions(@jakarta.annotation.Nullable final ConditionalAccessConditionSet value) {
        this.conditions = value;
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Readonly.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Specifies a display name for the conditionalAccessPolicy object.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the grantControls property value. Specifies the grant controls that must be fulfilled to pass the policy.
     * @param value Value to set for the grantControls property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setGrantControls(@jakarta.annotation.Nullable final ConditionalAccessGrantControls value) {
        this.grantControls = value;
    }
    /**
     * Sets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Readonly.
     * @param value Value to set for the modifiedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedDateTime = value;
    }
    /**
     * Sets the sessionControls property value. Specifies the session controls that are enforced after sign-in.
     * @param value Value to set for the sessionControls property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSessionControls(@jakarta.annotation.Nullable final ConditionalAccessSessionControls value) {
        this.sessionControls = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setState(@jakarta.annotation.Nullable final ConditionalAccessPolicyState value) {
        this.state = value;
    }
}
