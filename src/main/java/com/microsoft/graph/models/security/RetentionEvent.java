package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RetentionEvent extends Entity implements Parsable {
    /**
     * Instantiates a new RetentionEvent and sets the default values.
     */
    public RetentionEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RetentionEvent
     */
    @jakarta.annotation.Nonnull
    public static RetentionEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RetentionEvent();
    }
    /**
     * Gets the createdBy property value. The user who created the retentionEvent.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The date time when the retentionEvent was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. Optional information about the event.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Name of the event.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the eventPropagationResults property value. The eventPropagationResults property
     * @return a java.util.List<EventPropagationResult>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EventPropagationResult> getEventPropagationResults() {
        return this.backingStore.get("eventPropagationResults");
    }
    /**
     * Gets the eventQueries property value. Represents the workload (SharePoint Online, OneDrive for Business, Exchange Online) and identification information associated with a retention event.
     * @return a java.util.List<EventQuery>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EventQuery> getEventQueries() {
        return this.backingStore.get("eventQueries");
    }
    /**
     * Gets the eventStatus property value. The eventStatus property
     * @return a RetentionEventStatus
     */
    @jakarta.annotation.Nullable
    public RetentionEventStatus getEventStatus() {
        return this.backingStore.get("eventStatus");
    }
    /**
     * Gets the eventTriggerDateTime property value. Optional time when the event should be triggered.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEventTriggerDateTime() {
        return this.backingStore.get("eventTriggerDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("eventPropagationResults", (n) -> { this.setEventPropagationResults(n.getCollectionOfObjectValues(EventPropagationResult::createFromDiscriminatorValue)); });
        deserializerMap.put("eventQueries", (n) -> { this.setEventQueries(n.getCollectionOfObjectValues(EventQuery::createFromDiscriminatorValue)); });
        deserializerMap.put("eventStatus", (n) -> { this.setEventStatus(n.getObjectValue(RetentionEventStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("eventTriggerDateTime", (n) -> { this.setEventTriggerDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastStatusUpdateDateTime", (n) -> { this.setLastStatusUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("retentionEventType", (n) -> { this.setRetentionEventType(n.getObjectValue(RetentionEventType::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. The user who last modified the retentionEvent.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The latest date time when the retentionEvent was modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the lastStatusUpdateDateTime property value. Last time the status of the event was updated.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastStatusUpdateDateTime() {
        return this.backingStore.get("lastStatusUpdateDateTime");
    }
    /**
     * Gets the retentionEventType property value. Specifies the event that will start the retention period for labels that use this event type when an event is created.
     * @return a RetentionEventType
     */
    @jakarta.annotation.Nullable
    public RetentionEventType getRetentionEventType() {
        return this.backingStore.get("retentionEventType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("eventPropagationResults", this.getEventPropagationResults());
        writer.writeCollectionOfObjectValues("eventQueries", this.getEventQueries());
        writer.writeObjectValue("eventStatus", this.getEventStatus());
        writer.writeOffsetDateTimeValue("eventTriggerDateTime", this.getEventTriggerDateTime());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeOffsetDateTimeValue("lastStatusUpdateDateTime", this.getLastStatusUpdateDateTime());
        writer.writeObjectValue("retentionEventType", this.getRetentionEventType());
    }
    /**
     * Sets the createdBy property value. The user who created the retentionEvent.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The date time when the retentionEvent was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. Optional information about the event.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Name of the event.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the eventPropagationResults property value. The eventPropagationResults property
     * @param value Value to set for the eventPropagationResults property.
     */
    public void setEventPropagationResults(@jakarta.annotation.Nullable final java.util.List<EventPropagationResult> value) {
        this.backingStore.set("eventPropagationResults", value);
    }
    /**
     * Sets the eventQueries property value. Represents the workload (SharePoint Online, OneDrive for Business, Exchange Online) and identification information associated with a retention event.
     * @param value Value to set for the eventQueries property.
     */
    public void setEventQueries(@jakarta.annotation.Nullable final java.util.List<EventQuery> value) {
        this.backingStore.set("eventQueries", value);
    }
    /**
     * Sets the eventStatus property value. The eventStatus property
     * @param value Value to set for the eventStatus property.
     */
    public void setEventStatus(@jakarta.annotation.Nullable final RetentionEventStatus value) {
        this.backingStore.set("eventStatus", value);
    }
    /**
     * Sets the eventTriggerDateTime property value. Optional time when the event should be triggered.
     * @param value Value to set for the eventTriggerDateTime property.
     */
    public void setEventTriggerDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("eventTriggerDateTime", value);
    }
    /**
     * Sets the lastModifiedBy property value. The user who last modified the retentionEvent.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The latest date time when the retentionEvent was modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the lastStatusUpdateDateTime property value. Last time the status of the event was updated.
     * @param value Value to set for the lastStatusUpdateDateTime property.
     */
    public void setLastStatusUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastStatusUpdateDateTime", value);
    }
    /**
     * Sets the retentionEventType property value. Specifies the event that will start the retention period for labels that use this event type when an event is created.
     * @param value Value to set for the retentionEventType property.
     */
    public void setRetentionEventType(@jakarta.annotation.Nullable final RetentionEventType value) {
        this.backingStore.set("retentionEventType", value);
    }
}
