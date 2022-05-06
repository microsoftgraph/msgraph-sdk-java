package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessPolicy extends Entity implements Parsable {
    /** The conditions property  */
    private ConditionalAccessConditionSet _conditions;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Readonly.  */
    private OffsetDateTime _createdDateTime;
    /** Not used.  */
    private String _description;
    /** Specifies a display name for the conditionalAccessPolicy object.  */
    private String _displayName;
    /** Specifies the grant controls that must be fulfilled to pass the policy.  */
    private ConditionalAccessGrantControls _grantControls;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Readonly.  */
    private OffsetDateTime _modifiedDateTime;
    /** Specifies the session controls that are enforced after sign-in.  */
    private ConditionalAccessSessionControls _sessionControls;
    /** Specifies the state of the conditionalAccessPolicy object. Possible values are: enabled, disabled, enabledForReportingButNotEnforced. Required.  */
    private ConditionalAccessPolicyState _state;
    /**
     * Instantiates a new conditionalAccessPolicy and sets the default values.
     * @return a void
     */
    public ConditionalAccessPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conditionalAccessPolicy
     */
    @javax.annotation.Nonnull
    public static ConditionalAccessPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessPolicy();
    }
    /**
     * Gets the conditions property value. The conditions property
     * @return a conditionalAccessConditionSet
     */
    @javax.annotation.Nullable
    public ConditionalAccessConditionSet getConditions() {
        return this._conditions;
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Readonly.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. Not used.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Specifies a display name for the conditionalAccessPolicy object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConditionalAccessPolicy currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("conditions", (n) -> { currentObject.setConditions(n.getObjectValue(ConditionalAccessConditionSet::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("grantControls", (n) -> { currentObject.setGrantControls(n.getObjectValue(ConditionalAccessGrantControls::createFromDiscriminatorValue)); });
            this.put("modifiedDateTime", (n) -> { currentObject.setModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("sessionControls", (n) -> { currentObject.setSessionControls(n.getObjectValue(ConditionalAccessSessionControls::createFromDiscriminatorValue)); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(ConditionalAccessPolicyState.class)); });
        }};
    }
    /**
     * Gets the grantControls property value. Specifies the grant controls that must be fulfilled to pass the policy.
     * @return a conditionalAccessGrantControls
     */
    @javax.annotation.Nullable
    public ConditionalAccessGrantControls getGrantControls() {
        return this._grantControls;
    }
    /**
     * Gets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Readonly.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this._modifiedDateTime;
    }
    /**
     * Gets the sessionControls property value. Specifies the session controls that are enforced after sign-in.
     * @return a conditionalAccessSessionControls
     */
    @javax.annotation.Nullable
    public ConditionalAccessSessionControls getSessionControls() {
        return this._sessionControls;
    }
    /**
     * Gets the state property value. Specifies the state of the conditionalAccessPolicy object. Possible values are: enabled, disabled, enabledForReportingButNotEnforced. Required.
     * @return a conditionalAccessPolicyState
     */
    @javax.annotation.Nullable
    public ConditionalAccessPolicyState getState() {
        return this._state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
    public void setConditions(@javax.annotation.Nullable final ConditionalAccessConditionSet value) {
        this._conditions = value;
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Readonly.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. Not used.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Specifies a display name for the conditionalAccessPolicy object.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the grantControls property value. Specifies the grant controls that must be fulfilled to pass the policy.
     * @param value Value to set for the grantControls property.
     * @return a void
     */
    public void setGrantControls(@javax.annotation.Nullable final ConditionalAccessGrantControls value) {
        this._grantControls = value;
    }
    /**
     * Sets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Readonly.
     * @param value Value to set for the modifiedDateTime property.
     * @return a void
     */
    public void setModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._modifiedDateTime = value;
    }
    /**
     * Sets the sessionControls property value. Specifies the session controls that are enforced after sign-in.
     * @param value Value to set for the sessionControls property.
     * @return a void
     */
    public void setSessionControls(@javax.annotation.Nullable final ConditionalAccessSessionControls value) {
        this._sessionControls = value;
    }
    /**
     * Sets the state property value. Specifies the state of the conditionalAccessPolicy object. Possible values are: enabled, disabled, enabledForReportingButNotEnforced. Required.
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final ConditionalAccessPolicyState value) {
        this._state = value;
    }
}
