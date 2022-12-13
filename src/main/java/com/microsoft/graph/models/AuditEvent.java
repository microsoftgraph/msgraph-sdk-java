package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class AuditEvent extends Entity implements Parsable {
    /** Friendly name of the activity. */
    private String _activity;
    /** The date time in UTC when the activity was performed. */
    private OffsetDateTime _activityDateTime;
    /** The HTTP operation type of the activity. */
    private String _activityOperationType;
    /** The result of the activity. */
    private String _activityResult;
    /** The type of activity that was being performed. */
    private String _activityType;
    /** AAD user and application that are associated with the audit event. */
    private AuditActor _actor;
    /** Audit category. */
    private String _category;
    /** Component name. */
    private String _componentName;
    /** The client request Id that is used to correlate activity within the system. */
    private UUID _correlationId;
    /** Event display name. */
    private String _displayName;
    /** Resources being modified. */
    private java.util.List<AuditResource> _resources;
    /**
     * Instantiates a new AuditEvent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuditEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuditEvent
     */
    @javax.annotation.Nonnull
    public static AuditEvent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuditEvent();
    }
    /**
     * Gets the activity property value. Friendly name of the activity.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivity() {
        return this._activity;
    }
    /**
     * Gets the activityDateTime property value. The date time in UTC when the activity was performed.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getActivityDateTime() {
        return this._activityDateTime;
    }
    /**
     * Gets the activityOperationType property value. The HTTP operation type of the activity.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivityOperationType() {
        return this._activityOperationType;
    }
    /**
     * Gets the activityResult property value. The result of the activity.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivityResult() {
        return this._activityResult;
    }
    /**
     * Gets the activityType property value. The type of activity that was being performed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivityType() {
        return this._activityType;
    }
    /**
     * Gets the actor property value. AAD user and application that are associated with the audit event.
     * @return a auditActor
     */
    @javax.annotation.Nullable
    public AuditActor getActor() {
        return this._actor;
    }
    /**
     * Gets the category property value. Audit category.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory() {
        return this._category;
    }
    /**
     * Gets the componentName property value. Component name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComponentName() {
        return this._componentName;
    }
    /**
     * Gets the correlationId property value. The client request Id that is used to correlate activity within the system.
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getCorrelationId() {
        return this._correlationId;
    }
    /**
     * Gets the displayName property value. Event display name.
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getStringValue()); });
        deserializerMap.put("activityDateTime", (n) -> { this.setActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("activityOperationType", (n) -> { this.setActivityOperationType(n.getStringValue()); });
        deserializerMap.put("activityResult", (n) -> { this.setActivityResult(n.getStringValue()); });
        deserializerMap.put("activityType", (n) -> { this.setActivityType(n.getStringValue()); });
        deserializerMap.put("actor", (n) -> { this.setActor(n.getObjectValue(AuditActor::createFromDiscriminatorValue)); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getStringValue()); });
        deserializerMap.put("componentName", (n) -> { this.setComponentName(n.getStringValue()); });
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getUUIDValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(AuditResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resources property value. Resources being modified.
     * @return a auditResource
     */
    @javax.annotation.Nullable
    public java.util.List<AuditResource> getResources() {
        return this._resources;
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
        writer.writeStringValue("activity", this.getActivity());
        writer.writeOffsetDateTimeValue("activityDateTime", this.getActivityDateTime());
        writer.writeStringValue("activityOperationType", this.getActivityOperationType());
        writer.writeStringValue("activityResult", this.getActivityResult());
        writer.writeStringValue("activityType", this.getActivityType());
        writer.writeObjectValue("actor", this.getActor());
        writer.writeStringValue("category", this.getCategory());
        writer.writeStringValue("componentName", this.getComponentName());
        writer.writeUUIDValue("correlationId", this.getCorrelationId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
    }
    /**
     * Sets the activity property value. Friendly name of the activity.
     * @param value Value to set for the activity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivity(@javax.annotation.Nullable final String value) {
        this._activity = value;
    }
    /**
     * Sets the activityDateTime property value. The date time in UTC when the activity was performed.
     * @param value Value to set for the activityDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivityDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._activityDateTime = value;
    }
    /**
     * Sets the activityOperationType property value. The HTTP operation type of the activity.
     * @param value Value to set for the activityOperationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivityOperationType(@javax.annotation.Nullable final String value) {
        this._activityOperationType = value;
    }
    /**
     * Sets the activityResult property value. The result of the activity.
     * @param value Value to set for the activityResult property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivityResult(@javax.annotation.Nullable final String value) {
        this._activityResult = value;
    }
    /**
     * Sets the activityType property value. The type of activity that was being performed.
     * @param value Value to set for the activityType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivityType(@javax.annotation.Nullable final String value) {
        this._activityType = value;
    }
    /**
     * Sets the actor property value. AAD user and application that are associated with the audit event.
     * @param value Value to set for the actor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActor(@javax.annotation.Nullable final AuditActor value) {
        this._actor = value;
    }
    /**
     * Sets the category property value. Audit category.
     * @param value Value to set for the category property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategory(@javax.annotation.Nullable final String value) {
        this._category = value;
    }
    /**
     * Sets the componentName property value. Component name.
     * @param value Value to set for the componentName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComponentName(@javax.annotation.Nullable final String value) {
        this._componentName = value;
    }
    /**
     * Sets the correlationId property value. The client request Id that is used to correlate activity within the system.
     * @param value Value to set for the correlationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCorrelationId(@javax.annotation.Nullable final UUID value) {
        this._correlationId = value;
    }
    /**
     * Sets the displayName property value. Event display name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the resources property value. Resources being modified.
     * @param value Value to set for the resources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResources(@javax.annotation.Nullable final java.util.List<AuditResource> value) {
        this._resources = value;
    }
}
