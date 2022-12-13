package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the collection of agreement entities.
 */
public class TodoTask extends Entity implements Parsable {
    /** The attachments property */
    private java.util.List<AttachmentBase> _attachments;
    /** The attachmentSessions property */
    private java.util.List<AttachmentSession> _attachmentSessions;
    /** The task body that typically contains information about the task. */
    private ItemBody _body;
    /** The date and time when the task body was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'. */
    private OffsetDateTime _bodyLastModifiedDateTime;
    /** The categories associated with the task. Each category corresponds to the displayName property of an outlookCategory that the user has defined. */
    private java.util.List<String> _categories;
    /** A collection of checklistItems linked to a task. */
    private java.util.List<ChecklistItem> _checklistItems;
    /** The date and time in the specified time zone that the task was finished. */
    private DateTimeTimeZone _completedDateTime;
    /** The date and time when the task was created. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'. */
    private OffsetDateTime _createdDateTime;
    /** The date and time in the specified time zone that the task is to be finished. */
    private DateTimeTimeZone _dueDateTime;
    /** The collection of open extensions defined for the task. Nullable. */
    private java.util.List<Extension> _extensions;
    /** The hasAttachments property */
    private Boolean _hasAttachments;
    /** The importance property */
    private Importance _importance;
    /** Set to true if an alert is set to remind the user of the task. */
    private Boolean _isReminderOn;
    /** The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'. */
    private OffsetDateTime _lastModifiedDateTime;
    /** A collection of resources linked to the task. */
    private java.util.List<LinkedResource> _linkedResources;
    /** The recurrence pattern for the task. */
    private PatternedRecurrence _recurrence;
    /** The date and time in the specified time zone for a reminder alert of the task to occur. */
    private DateTimeTimeZone _reminderDateTime;
    /** The startDateTime property */
    private DateTimeTimeZone _startDateTime;
    /** The status property */
    private TaskStatus _status;
    /** A brief description of the task. */
    private String _title;
    /**
     * Instantiates a new todoTask and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TodoTask() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a todoTask
     */
    @javax.annotation.Nonnull
    public static TodoTask createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TodoTask();
    }
    /**
     * Gets the attachments property value. The attachments property
     * @return a attachmentBase
     */
    @javax.annotation.Nullable
    public java.util.List<AttachmentBase> getAttachments() {
        return this._attachments;
    }
    /**
     * Gets the attachmentSessions property value. The attachmentSessions property
     * @return a attachmentSession
     */
    @javax.annotation.Nullable
    public java.util.List<AttachmentSession> getAttachmentSessions() {
        return this._attachmentSessions;
    }
    /**
     * Gets the body property value. The task body that typically contains information about the task.
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getBody() {
        return this._body;
    }
    /**
     * Gets the bodyLastModifiedDateTime property value. The date and time when the task body was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getBodyLastModifiedDateTime() {
        return this._bodyLastModifiedDateTime;
    }
    /**
     * Gets the categories property value. The categories associated with the task. Each category corresponds to the displayName property of an outlookCategory that the user has defined.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCategories() {
        return this._categories;
    }
    /**
     * Gets the checklistItems property value. A collection of checklistItems linked to a task.
     * @return a checklistItem
     */
    @javax.annotation.Nullable
    public java.util.List<ChecklistItem> getChecklistItems() {
        return this._checklistItems;
    }
    /**
     * Gets the completedDateTime property value. The date and time in the specified time zone that the task was finished.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getCompletedDateTime() {
        return this._completedDateTime;
    }
    /**
     * Gets the createdDateTime property value. The date and time when the task was created. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the dueDateTime property value. The date and time in the specified time zone that the task is to be finished.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getDueDateTime() {
        return this._dueDateTime;
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the task. Nullable.
     * @return a extension
     */
    @javax.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this._extensions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
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
     * Gets the hasAttachments property value. The hasAttachments property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasAttachments() {
        return this._hasAttachments;
    }
    /**
     * Gets the importance property value. The importance property
     * @return a importance
     */
    @javax.annotation.Nullable
    public Importance getImportance() {
        return this._importance;
    }
    /**
     * Gets the isReminderOn property value. Set to true if an alert is set to remind the user of the task.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsReminderOn() {
        return this._isReminderOn;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the linkedResources property value. A collection of resources linked to the task.
     * @return a linkedResource
     */
    @javax.annotation.Nullable
    public java.util.List<LinkedResource> getLinkedResources() {
        return this._linkedResources;
    }
    /**
     * Gets the recurrence property value. The recurrence pattern for the task.
     * @return a patternedRecurrence
     */
    @javax.annotation.Nullable
    public PatternedRecurrence getRecurrence() {
        return this._recurrence;
    }
    /**
     * Gets the reminderDateTime property value. The date and time in the specified time zone for a reminder alert of the task to occur.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getReminderDateTime() {
        return this._reminderDateTime;
    }
    /**
     * Gets the startDateTime property value. The startDateTime property
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the status property value. The status property
     * @return a taskStatus
     */
    @javax.annotation.Nullable
    public TaskStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the title property value. A brief description of the task.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this._title;
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
     * Sets the attachments property value. The attachments property
     * @param value Value to set for the attachments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttachments(@javax.annotation.Nullable final java.util.List<AttachmentBase> value) {
        this._attachments = value;
    }
    /**
     * Sets the attachmentSessions property value. The attachmentSessions property
     * @param value Value to set for the attachmentSessions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttachmentSessions(@javax.annotation.Nullable final java.util.List<AttachmentSession> value) {
        this._attachmentSessions = value;
    }
    /**
     * Sets the body property value. The task body that typically contains information about the task.
     * @param value Value to set for the body property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBody(@javax.annotation.Nullable final ItemBody value) {
        this._body = value;
    }
    /**
     * Sets the bodyLastModifiedDateTime property value. The date and time when the task body was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     * @param value Value to set for the bodyLastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBodyLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._bodyLastModifiedDateTime = value;
    }
    /**
     * Sets the categories property value. The categories associated with the task. Each category corresponds to the displayName property of an outlookCategory that the user has defined.
     * @param value Value to set for the categories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategories(@javax.annotation.Nullable final java.util.List<String> value) {
        this._categories = value;
    }
    /**
     * Sets the checklistItems property value. A collection of checklistItems linked to a task.
     * @param value Value to set for the checklistItems property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChecklistItems(@javax.annotation.Nullable final java.util.List<ChecklistItem> value) {
        this._checklistItems = value;
    }
    /**
     * Sets the completedDateTime property value. The date and time in the specified time zone that the task was finished.
     * @param value Value to set for the completedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._completedDateTime = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time when the task was created. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the dueDateTime property value. The date and time in the specified time zone that the task is to be finished.
     * @param value Value to set for the dueDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDueDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._dueDateTime = value;
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the task. Nullable.
     * @param value Value to set for the extensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtensions(@javax.annotation.Nullable final java.util.List<Extension> value) {
        this._extensions = value;
    }
    /**
     * Sets the hasAttachments property value. The hasAttachments property
     * @param value Value to set for the hasAttachments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHasAttachments(@javax.annotation.Nullable final Boolean value) {
        this._hasAttachments = value;
    }
    /**
     * Sets the importance property value. The importance property
     * @param value Value to set for the importance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImportance(@javax.annotation.Nullable final Importance value) {
        this._importance = value;
    }
    /**
     * Sets the isReminderOn property value. Set to true if an alert is set to remind the user of the task.
     * @param value Value to set for the isReminderOn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsReminderOn(@javax.annotation.Nullable final Boolean value) {
        this._isReminderOn = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the linkedResources property value. A collection of resources linked to the task.
     * @param value Value to set for the linkedResources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLinkedResources(@javax.annotation.Nullable final java.util.List<LinkedResource> value) {
        this._linkedResources = value;
    }
    /**
     * Sets the recurrence property value. The recurrence pattern for the task.
     * @param value Value to set for the recurrence property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecurrence(@javax.annotation.Nullable final PatternedRecurrence value) {
        this._recurrence = value;
    }
    /**
     * Sets the reminderDateTime property value. The date and time in the specified time zone for a reminder alert of the task to occur.
     * @param value Value to set for the reminderDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReminderDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._reminderDateTime = value;
    }
    /**
     * Sets the startDateTime property value. The startDateTime property
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._startDateTime = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final TaskStatus value) {
        this._status = value;
    }
    /**
     * Sets the title property value. A brief description of the task.
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final String value) {
        this._title = value;
    }
}
