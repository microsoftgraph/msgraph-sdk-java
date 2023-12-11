package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * A class containing the properties for Audit Event.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuditEvent extends Entity implements Parsable {
    /**
     * Instantiates a new AuditEvent and sets the default values.
     */
    public AuditEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuditEvent
     */
    @jakarta.annotation.Nonnull
    public static AuditEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuditEvent();
    }
    /**
     * Gets the activity property value. Friendly name of the activity.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getActivity() {
        return this.backingStore.get("activity");
    }
    /**
     * Gets the activityDateTime property value. The date time in UTC when the activity was performed.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getActivityDateTime() {
        return this.backingStore.get("activityDateTime");
    }
    /**
     * Gets the activityOperationType property value. The HTTP operation type of the activity.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getActivityOperationType() {
        return this.backingStore.get("activityOperationType");
    }
    /**
     * Gets the activityResult property value. The result of the activity.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getActivityResult() {
        return this.backingStore.get("activityResult");
    }
    /**
     * Gets the activityType property value. The type of activity that was being performed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getActivityType() {
        return this.backingStore.get("activityType");
    }
    /**
     * Gets the actor property value. AAD user and application that are associated with the audit event.
     * @return a AuditActor
     */
    @jakarta.annotation.Nullable
    public AuditActor getActor() {
        return this.backingStore.get("actor");
    }
    /**
     * Gets the category property value. Audit category.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory() {
        return this.backingStore.get("category");
    }
    /**
     * Gets the componentName property value. Component name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getComponentName() {
        return this.backingStore.get("componentName");
    }
    /**
     * Gets the correlationId property value. The client request Id that is used to correlate activity within the system.
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getCorrelationId() {
        return this.backingStore.get("correlationId");
    }
    /**
     * Gets the displayName property value. Event display name.
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
     * @return a java.util.List<AuditResource>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuditResource> getResources() {
        return this.backingStore.get("resources");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setActivity(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("activity", value);
    }
    /**
     * Sets the activityDateTime property value. The date time in UTC when the activity was performed.
     * @param value Value to set for the activityDateTime property.
     */
    public void setActivityDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("activityDateTime", value);
    }
    /**
     * Sets the activityOperationType property value. The HTTP operation type of the activity.
     * @param value Value to set for the activityOperationType property.
     */
    public void setActivityOperationType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("activityOperationType", value);
    }
    /**
     * Sets the activityResult property value. The result of the activity.
     * @param value Value to set for the activityResult property.
     */
    public void setActivityResult(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("activityResult", value);
    }
    /**
     * Sets the activityType property value. The type of activity that was being performed.
     * @param value Value to set for the activityType property.
     */
    public void setActivityType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("activityType", value);
    }
    /**
     * Sets the actor property value. AAD user and application that are associated with the audit event.
     * @param value Value to set for the actor property.
     */
    public void setActor(@jakarta.annotation.Nullable final AuditActor value) {
        this.backingStore.set("actor", value);
    }
    /**
     * Sets the category property value. Audit category.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category", value);
    }
    /**
     * Sets the componentName property value. Component name.
     * @param value Value to set for the componentName property.
     */
    public void setComponentName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("componentName", value);
    }
    /**
     * Sets the correlationId property value. The client request Id that is used to correlate activity within the system.
     * @param value Value to set for the correlationId property.
     */
    public void setCorrelationId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("correlationId", value);
    }
    /**
     * Sets the displayName property value. Event display name.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the resources property value. Resources being modified.
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<AuditResource> value) {
        this.backingStore.set("resources", value);
    }
}
