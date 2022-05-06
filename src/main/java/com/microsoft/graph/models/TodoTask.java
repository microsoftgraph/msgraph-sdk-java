package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TodoTask extends Entity implements Parsable {
    /** The task body that typically contains information about the task.  */
    private ItemBody _body;
    /** The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.  */
    private OffsetDateTime _bodyLastModifiedDateTime;
    /** The date in the specified time zone that the task was finished.  */
    private DateTimeTimeZone _completedDateTime;
    /** The date and time when the task was created. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.  */
    private OffsetDateTime _createdDateTime;
    /** The date in the specified time zone that the task is to be finished.  */
    private DateTimeTimeZone _dueDateTime;
    /** The collection of open extensions defined for the task. Nullable.  */
    private java.util.List<Extension> _extensions;
    /** The importance of the task. Possible values are: low, normal, high.  */
    private Importance _importance;
    /** Set to true if an alert is set to remind the user of the task.  */
    private Boolean _isReminderOn;
    /** The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.  */
    private OffsetDateTime _lastModifiedDateTime;
    /** A collection of resources linked to the task.  */
    private java.util.List<LinkedResource> _linkedResources;
    /** The recurrence pattern for the task.  */
    private PatternedRecurrence _recurrence;
    /** The date and time for a reminder alert of the task to occur.  */
    private DateTimeTimeZone _reminderDateTime;
    /** Indicates the state or progress of the task. Possible values are: notStarted, inProgress, completed, waitingOnOthers, deferred.  */
    private TaskStatus _status;
    /** A brief description of the task.  */
    private String _title;
    /**
     * Instantiates a new todoTask and sets the default values.
     * @return a void
     */
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
     * Gets the body property value. The task body that typically contains information about the task.
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getBody() {
        return this._body;
    }
    /**
     * Gets the bodyLastModifiedDateTime property value. The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getBodyLastModifiedDateTime() {
        return this._bodyLastModifiedDateTime;
    }
    /**
     * Gets the completedDateTime property value. The date in the specified time zone that the task was finished.
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
     * Gets the dueDateTime property value. The date in the specified time zone that the task is to be finished.
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
        final TodoTask currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("body", (n) -> { currentObject.setBody(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
            this.put("bodyLastModifiedDateTime", (n) -> { currentObject.setBodyLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("completedDateTime", (n) -> { currentObject.setCompletedDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("dueDateTime", (n) -> { currentObject.setDueDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
            this.put("extensions", (n) -> { currentObject.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
            this.put("importance", (n) -> { currentObject.setImportance(n.getEnumValue(Importance.class)); });
            this.put("isReminderOn", (n) -> { currentObject.setIsReminderOn(n.getBooleanValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("linkedResources", (n) -> { currentObject.setLinkedResources(n.getCollectionOfObjectValues(LinkedResource::createFromDiscriminatorValue)); });
            this.put("recurrence", (n) -> { currentObject.setRecurrence(n.getObjectValue(PatternedRecurrence::createFromDiscriminatorValue)); });
            this.put("reminderDateTime", (n) -> { currentObject.setReminderDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(TaskStatus.class)); });
            this.put("title", (n) -> { currentObject.setTitle(n.getStringValue()); });
        }};
    }
    /**
     * Gets the importance property value. The importance of the task. Possible values are: low, normal, high.
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
     * Gets the reminderDateTime property value. The date and time for a reminder alert of the task to occur.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getReminderDateTime() {
        return this._reminderDateTime;
    }
    /**
     * Gets the status property value. Indicates the state or progress of the task. Possible values are: notStarted, inProgress, completed, waitingOnOthers, deferred.
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("body", this.getBody());
        writer.writeOffsetDateTimeValue("bodyLastModifiedDateTime", this.getBodyLastModifiedDateTime());
        writer.writeObjectValue("completedDateTime", this.getCompletedDateTime());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("dueDateTime", this.getDueDateTime());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeEnumValue("importance", this.getImportance());
        writer.writeBooleanValue("isReminderOn", this.getIsReminderOn());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("linkedResources", this.getLinkedResources());
        writer.writeObjectValue("recurrence", this.getRecurrence());
        writer.writeObjectValue("reminderDateTime", this.getReminderDateTime());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("title", this.getTitle());
    }
    /**
     * Sets the body property value. The task body that typically contains information about the task.
     * @param value Value to set for the body property.
     * @return a void
     */
    public void setBody(@javax.annotation.Nullable final ItemBody value) {
        this._body = value;
    }
    /**
     * Sets the bodyLastModifiedDateTime property value. The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     * @param value Value to set for the bodyLastModifiedDateTime property.
     * @return a void
     */
    public void setBodyLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._bodyLastModifiedDateTime = value;
    }
    /**
     * Sets the completedDateTime property value. The date in the specified time zone that the task was finished.
     * @param value Value to set for the completedDateTime property.
     * @return a void
     */
    public void setCompletedDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._completedDateTime = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time when the task was created. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the dueDateTime property value. The date in the specified time zone that the task is to be finished.
     * @param value Value to set for the dueDateTime property.
     * @return a void
     */
    public void setDueDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._dueDateTime = value;
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the task. Nullable.
     * @param value Value to set for the extensions property.
     * @return a void
     */
    public void setExtensions(@javax.annotation.Nullable final java.util.List<Extension> value) {
        this._extensions = value;
    }
    /**
     * Sets the importance property value. The importance of the task. Possible values are: low, normal, high.
     * @param value Value to set for the importance property.
     * @return a void
     */
    public void setImportance(@javax.annotation.Nullable final Importance value) {
        this._importance = value;
    }
    /**
     * Sets the isReminderOn property value. Set to true if an alert is set to remind the user of the task.
     * @param value Value to set for the isReminderOn property.
     * @return a void
     */
    public void setIsReminderOn(@javax.annotation.Nullable final Boolean value) {
        this._isReminderOn = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the linkedResources property value. A collection of resources linked to the task.
     * @param value Value to set for the linkedResources property.
     * @return a void
     */
    public void setLinkedResources(@javax.annotation.Nullable final java.util.List<LinkedResource> value) {
        this._linkedResources = value;
    }
    /**
     * Sets the recurrence property value. The recurrence pattern for the task.
     * @param value Value to set for the recurrence property.
     * @return a void
     */
    public void setRecurrence(@javax.annotation.Nullable final PatternedRecurrence value) {
        this._recurrence = value;
    }
    /**
     * Sets the reminderDateTime property value. The date and time for a reminder alert of the task to occur.
     * @param value Value to set for the reminderDateTime property.
     * @return a void
     */
    public void setReminderDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._reminderDateTime = value;
    }
    /**
     * Sets the status property value. Indicates the state or progress of the task. Possible values are: notStarted, inProgress, completed, waitingOnOthers, deferred.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final TaskStatus value) {
        this._status = value;
    }
    /**
     * Sets the title property value. A brief description of the task.
     * @param value Value to set for the title property.
     * @return a void
     */
    public void setTitle(@javax.annotation.Nullable final String value) {
        this._title = value;
    }
}
