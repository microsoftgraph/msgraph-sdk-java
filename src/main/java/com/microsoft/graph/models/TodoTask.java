package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TodoTask extends Entity implements Parsable {
    /**
     * A collection of file attachments for the task.
     */
    private java.util.List<AttachmentBase> attachments;
    /**
     * The attachmentSessions property
     */
    private java.util.List<AttachmentSession> attachmentSessions;
    /**
     * The task body that typically contains information about the task.
     */
    private ItemBody body;
    /**
     * The date and time when the task body was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     */
    private OffsetDateTime bodyLastModifiedDateTime;
    /**
     * The categories associated with the task. Each category corresponds to the displayName property of an outlookCategory that the user has defined.
     */
    private java.util.List<String> categories;
    /**
     * A collection of checklistItems linked to a task.
     */
    private java.util.List<ChecklistItem> checklistItems;
    /**
     * The date and time in the specified time zone that the task was finished.
     */
    private DateTimeTimeZone completedDateTime;
    /**
     * The date and time when the task was created. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The date and time in the specified time zone that the task is to be finished.
     */
    private DateTimeTimeZone dueDateTime;
    /**
     * The collection of open extensions defined for the task. Nullable.
     */
    private java.util.List<Extension> extensions;
    /**
     * Indicates whether the task has attachments.
     */
    private Boolean hasAttachments;
    /**
     * The importance property
     */
    private Importance importance;
    /**
     * Set to true if an alert is set to remind the user of the task.
     */
    private Boolean isReminderOn;
    /**
     * The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * A collection of resources linked to the task.
     */
    private java.util.List<LinkedResource> linkedResources;
    /**
     * The recurrence pattern for the task.
     */
    private PatternedRecurrence recurrence;
    /**
     * The date and time in the specified time zone for a reminder alert of the task to occur.
     */
    private DateTimeTimeZone reminderDateTime;
    /**
     * The date and time in the specified time zone at which the task is scheduled to start.
     */
    private DateTimeTimeZone startDateTime;
    /**
     * The status property
     */
    private TaskStatus status;
    /**
     * A brief description of the task.
     */
    private String title;
    /**
     * Instantiates a new todoTask and sets the default values.
     */
    public TodoTask() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a todoTask
     */
    @jakarta.annotation.Nonnull
    public static TodoTask createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TodoTask();
    }
    /**
     * Gets the attachments property value. A collection of file attachments for the task.
     * @return a attachmentBase
     */
    @jakarta.annotation.Nullable
    public java.util.List<AttachmentBase> getAttachments() {
        return this.attachments;
    }
    /**
     * Gets the attachmentSessions property value. The attachmentSessions property
     * @return a attachmentSession
     */
    @jakarta.annotation.Nullable
    public java.util.List<AttachmentSession> getAttachmentSessions() {
        return this.attachmentSessions;
    }
    /**
     * Gets the body property value. The task body that typically contains information about the task.
     * @return a itemBody
     */
    @jakarta.annotation.Nullable
    public ItemBody getBody() {
        return this.body;
    }
    /**
     * Gets the bodyLastModifiedDateTime property value. The date and time when the task body was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getBodyLastModifiedDateTime() {
        return this.bodyLastModifiedDateTime;
    }
    /**
     * Gets the categories property value. The categories associated with the task. Each category corresponds to the displayName property of an outlookCategory that the user has defined.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCategories() {
        return this.categories;
    }
    /**
     * Gets the checklistItems property value. A collection of checklistItems linked to a task.
     * @return a checklistItem
     */
    @jakarta.annotation.Nullable
    public java.util.List<ChecklistItem> getChecklistItems() {
        return this.checklistItems;
    }
    /**
     * Gets the completedDateTime property value. The date and time in the specified time zone that the task was finished.
     * @return a dateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getCompletedDateTime() {
        return this.completedDateTime;
    }
    /**
     * Gets the createdDateTime property value. The date and time when the task was created. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the dueDateTime property value. The date and time in the specified time zone that the task is to be finished.
     * @return a dateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getDueDateTime() {
        return this.dueDateTime;
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the task. Nullable.
     * @return a extension
     */
    @jakarta.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this.extensions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("attachments", (n) -> { this.setAttachments(n.getCollectionOfObjectValues(AttachmentBase::createFromDiscriminatorValue)); });
        deserializerMap.put("attachmentSessions", (n) -> { this.setAttachmentSessions(n.getCollectionOfObjectValues(AttachmentSession::createFromDiscriminatorValue)); });
        deserializerMap.put("body", (n) -> { this.setBody(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("bodyLastModifiedDateTime", (n) -> { this.setBodyLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("checklistItems", (n) -> { this.setChecklistItems(n.getCollectionOfObjectValues(ChecklistItem::createFromDiscriminatorValue)); });
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("dueDateTime", (n) -> { this.setDueDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
        deserializerMap.put("hasAttachments", (n) -> { this.setHasAttachments(n.getBooleanValue()); });
        deserializerMap.put("importance", (n) -> { this.setImportance(n.getEnumValue(Importance.class)); });
        deserializerMap.put("isReminderOn", (n) -> { this.setIsReminderOn(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("linkedResources", (n) -> { this.setLinkedResources(n.getCollectionOfObjectValues(LinkedResource::createFromDiscriminatorValue)); });
        deserializerMap.put("recurrence", (n) -> { this.setRecurrence(n.getObjectValue(PatternedRecurrence::createFromDiscriminatorValue)); });
        deserializerMap.put("reminderDateTime", (n) -> { this.setReminderDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(TaskStatus.class)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hasAttachments property value. Indicates whether the task has attachments.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHasAttachments() {
        return this.hasAttachments;
    }
    /**
     * Gets the importance property value. The importance property
     * @return a importance
     */
    @jakarta.annotation.Nullable
    public Importance getImportance() {
        return this.importance;
    }
    /**
     * Gets the isReminderOn property value. Set to true if an alert is set to remind the user of the task.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsReminderOn() {
        return this.isReminderOn;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the linkedResources property value. A collection of resources linked to the task.
     * @return a linkedResource
     */
    @jakarta.annotation.Nullable
    public java.util.List<LinkedResource> getLinkedResources() {
        return this.linkedResources;
    }
    /**
     * Gets the recurrence property value. The recurrence pattern for the task.
     * @return a patternedRecurrence
     */
    @jakarta.annotation.Nullable
    public PatternedRecurrence getRecurrence() {
        return this.recurrence;
    }
    /**
     * Gets the reminderDateTime property value. The date and time in the specified time zone for a reminder alert of the task to occur.
     * @return a dateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getReminderDateTime() {
        return this.reminderDateTime;
    }
    /**
     * Gets the startDateTime property value. The date and time in the specified time zone at which the task is scheduled to start.
     * @return a dateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the status property value. The status property
     * @return a taskStatus
     */
    @jakarta.annotation.Nullable
    public TaskStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the title property value. A brief description of the task.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("attachments", this.getAttachments());
        writer.writeCollectionOfObjectValues("attachmentSessions", this.getAttachmentSessions());
        writer.writeObjectValue("body", this.getBody());
        writer.writeOffsetDateTimeValue("bodyLastModifiedDateTime", this.getBodyLastModifiedDateTime());
        writer.writeCollectionOfPrimitiveValues("categories", this.getCategories());
        writer.writeCollectionOfObjectValues("checklistItems", this.getChecklistItems());
        writer.writeObjectValue("completedDateTime", this.getCompletedDateTime());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("dueDateTime", this.getDueDateTime());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeBooleanValue("hasAttachments", this.getHasAttachments());
        writer.writeEnumValue("importance", this.getImportance());
        writer.writeBooleanValue("isReminderOn", this.getIsReminderOn());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("linkedResources", this.getLinkedResources());
        writer.writeObjectValue("recurrence", this.getRecurrence());
        writer.writeObjectValue("reminderDateTime", this.getReminderDateTime());
        writer.writeObjectValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("title", this.getTitle());
    }
    /**
     * Sets the attachments property value. A collection of file attachments for the task.
     * @param value Value to set for the attachments property.
     */
    public void setAttachments(@jakarta.annotation.Nullable final java.util.List<AttachmentBase> value) {
        this.attachments = value;
    }
    /**
     * Sets the attachmentSessions property value. The attachmentSessions property
     * @param value Value to set for the attachmentSessions property.
     */
    public void setAttachmentSessions(@jakarta.annotation.Nullable final java.util.List<AttachmentSession> value) {
        this.attachmentSessions = value;
    }
    /**
     * Sets the body property value. The task body that typically contains information about the task.
     * @param value Value to set for the body property.
     */
    public void setBody(@jakarta.annotation.Nullable final ItemBody value) {
        this.body = value;
    }
    /**
     * Sets the bodyLastModifiedDateTime property value. The date and time when the task body was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     * @param value Value to set for the bodyLastModifiedDateTime property.
     */
    public void setBodyLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.bodyLastModifiedDateTime = value;
    }
    /**
     * Sets the categories property value. The categories associated with the task. Each category corresponds to the displayName property of an outlookCategory that the user has defined.
     * @param value Value to set for the categories property.
     */
    public void setCategories(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.categories = value;
    }
    /**
     * Sets the checklistItems property value. A collection of checklistItems linked to a task.
     * @param value Value to set for the checklistItems property.
     */
    public void setChecklistItems(@jakarta.annotation.Nullable final java.util.List<ChecklistItem> value) {
        this.checklistItems = value;
    }
    /**
     * Sets the completedDateTime property value. The date and time in the specified time zone that the task was finished.
     * @param value Value to set for the completedDateTime property.
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.completedDateTime = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time when the task was created. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the dueDateTime property value. The date and time in the specified time zone that the task is to be finished.
     * @param value Value to set for the dueDateTime property.
     */
    public void setDueDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.dueDateTime = value;
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the task. Nullable.
     * @param value Value to set for the extensions property.
     */
    public void setExtensions(@jakarta.annotation.Nullable final java.util.List<Extension> value) {
        this.extensions = value;
    }
    /**
     * Sets the hasAttachments property value. Indicates whether the task has attachments.
     * @param value Value to set for the hasAttachments property.
     */
    public void setHasAttachments(@jakarta.annotation.Nullable final Boolean value) {
        this.hasAttachments = value;
    }
    /**
     * Sets the importance property value. The importance property
     * @param value Value to set for the importance property.
     */
    public void setImportance(@jakarta.annotation.Nullable final Importance value) {
        this.importance = value;
    }
    /**
     * Sets the isReminderOn property value. Set to true if an alert is set to remind the user of the task.
     * @param value Value to set for the isReminderOn property.
     */
    public void setIsReminderOn(@jakarta.annotation.Nullable final Boolean value) {
        this.isReminderOn = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the linkedResources property value. A collection of resources linked to the task.
     * @param value Value to set for the linkedResources property.
     */
    public void setLinkedResources(@jakarta.annotation.Nullable final java.util.List<LinkedResource> value) {
        this.linkedResources = value;
    }
    /**
     * Sets the recurrence property value. The recurrence pattern for the task.
     * @param value Value to set for the recurrence property.
     */
    public void setRecurrence(@jakarta.annotation.Nullable final PatternedRecurrence value) {
        this.recurrence = value;
    }
    /**
     * Sets the reminderDateTime property value. The date and time in the specified time zone for a reminder alert of the task to occur.
     * @param value Value to set for the reminderDateTime property.
     */
    public void setReminderDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.reminderDateTime = value;
    }
    /**
     * Sets the startDateTime property value. The date and time in the specified time zone at which the task is scheduled to start.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.startDateTime = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final TaskStatus value) {
        this.status = value;
    }
    /**
     * Sets the title property value. A brief description of the task.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
}
