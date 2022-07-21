package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EventMessage extends Message implements Parsable {
    /** The end time of the requested meeting. */
    private DateTimeTimeZone _endDateTime;
    /** The event associated with the event message. The assumption for attendees or room resources is that the Calendar Attendant is set to automatically update the calendar with an event when meeting request event messages arrive. Navigation property.  Read-only. */
    private Event _event;
    /** The isAllDay property */
    private Boolean _isAllDay;
    /** The isDelegated property */
    private Boolean _isDelegated;
    /** The isOutOfDate property */
    private Boolean _isOutOfDate;
    /** The location property */
    private Location _location;
    /** The meetingMessageType property */
    private MeetingMessageType _meetingMessageType;
    /** The recurrence property */
    private PatternedRecurrence _recurrence;
    /** The startDateTime property */
    private DateTimeTimeZone _startDateTime;
    /** The type property */
    private EventType _type;
    /**
     * Instantiates a new EventMessage and sets the default values.
     * @return a void
     */
    public EventMessage() {
        super();
        this.setOdataType("#microsoft.graph.eventMessage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EventMessage
     */
    @javax.annotation.Nonnull
    public static EventMessage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.eventMessageRequest": return new EventMessageRequest();
                case "#microsoft.graph.eventMessageResponse": return new EventMessageResponse();
            }
        }
        return new EventMessage();
    }
    /**
     * Gets the endDateTime property value. The end time of the requested meeting.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * Gets the event property value. The event associated with the event message. The assumption for attendees or room resources is that the Calendar Attendant is set to automatically update the calendar with an event when meeting request event messages arrive. Navigation property.  Read-only.
     * @return a event
     */
    @javax.annotation.Nullable
    public Event getEvent() {
        return this._event;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EventMessage currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
            this.put("event", (n) -> { currentObject.setEvent(n.getObjectValue(Event::createFromDiscriminatorValue)); });
            this.put("isAllDay", (n) -> { currentObject.setIsAllDay(n.getBooleanValue()); });
            this.put("isDelegated", (n) -> { currentObject.setIsDelegated(n.getBooleanValue()); });
            this.put("isOutOfDate", (n) -> { currentObject.setIsOutOfDate(n.getBooleanValue()); });
            this.put("location", (n) -> { currentObject.setLocation(n.getObjectValue(Location::createFromDiscriminatorValue)); });
            this.put("meetingMessageType", (n) -> { currentObject.setMeetingMessageType(n.getEnumValue(MeetingMessageType.class)); });
            this.put("recurrence", (n) -> { currentObject.setRecurrence(n.getObjectValue(PatternedRecurrence::createFromDiscriminatorValue)); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
            this.put("type", (n) -> { currentObject.setType(n.getEnumValue(EventType.class)); });
        }};
    }
    /**
     * Gets the isAllDay property value. The isAllDay property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAllDay() {
        return this._isAllDay;
    }
    /**
     * Gets the isDelegated property value. The isDelegated property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDelegated() {
        return this._isDelegated;
    }
    /**
     * Gets the isOutOfDate property value. The isOutOfDate property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsOutOfDate() {
        return this._isOutOfDate;
    }
    /**
     * Gets the location property value. The location property
     * @return a location
     */
    @javax.annotation.Nullable
    public Location getLocation() {
        return this._location;
    }
    /**
     * Gets the meetingMessageType property value. The meetingMessageType property
     * @return a meetingMessageType
     */
    @javax.annotation.Nullable
    public MeetingMessageType getMeetingMessageType() {
        return this._meetingMessageType;
    }
    /**
     * Gets the recurrence property value. The recurrence property
     * @return a patternedRecurrence
     */
    @javax.annotation.Nullable
    public PatternedRecurrence getRecurrence() {
        return this._recurrence;
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
     * Gets the type property value. The type property
     * @return a eventType
     */
    @javax.annotation.Nullable
    public EventType getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("endDateTime", this.getEndDateTime());
        writer.writeObjectValue("event", this.getEvent());
        writer.writeBooleanValue("isAllDay", this.getIsAllDay());
        writer.writeBooleanValue("isDelegated", this.getIsDelegated());
        writer.writeBooleanValue("isOutOfDate", this.getIsOutOfDate());
        writer.writeObjectValue("location", this.getLocation());
        writer.writeEnumValue("meetingMessageType", this.getMeetingMessageType());
        writer.writeObjectValue("recurrence", this.getRecurrence());
        writer.writeObjectValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the endDateTime property value. The end time of the requested meeting.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    public void setEndDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._endDateTime = value;
    }
    /**
     * Sets the event property value. The event associated with the event message. The assumption for attendees or room resources is that the Calendar Attendant is set to automatically update the calendar with an event when meeting request event messages arrive. Navigation property.  Read-only.
     * @param value Value to set for the event property.
     * @return a void
     */
    public void setEvent(@javax.annotation.Nullable final Event value) {
        this._event = value;
    }
    /**
     * Sets the isAllDay property value. The isAllDay property
     * @param value Value to set for the isAllDay property.
     * @return a void
     */
    public void setIsAllDay(@javax.annotation.Nullable final Boolean value) {
        this._isAllDay = value;
    }
    /**
     * Sets the isDelegated property value. The isDelegated property
     * @param value Value to set for the isDelegated property.
     * @return a void
     */
    public void setIsDelegated(@javax.annotation.Nullable final Boolean value) {
        this._isDelegated = value;
    }
    /**
     * Sets the isOutOfDate property value. The isOutOfDate property
     * @param value Value to set for the isOutOfDate property.
     * @return a void
     */
    public void setIsOutOfDate(@javax.annotation.Nullable final Boolean value) {
        this._isOutOfDate = value;
    }
    /**
     * Sets the location property value. The location property
     * @param value Value to set for the location property.
     * @return a void
     */
    public void setLocation(@javax.annotation.Nullable final Location value) {
        this._location = value;
    }
    /**
     * Sets the meetingMessageType property value. The meetingMessageType property
     * @param value Value to set for the meetingMessageType property.
     * @return a void
     */
    public void setMeetingMessageType(@javax.annotation.Nullable final MeetingMessageType value) {
        this._meetingMessageType = value;
    }
    /**
     * Sets the recurrence property value. The recurrence property
     * @param value Value to set for the recurrence property.
     * @return a void
     */
    public void setRecurrence(@javax.annotation.Nullable final PatternedRecurrence value) {
        this._recurrence = value;
    }
    /**
     * Sets the startDateTime property value. The startDateTime property
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._startDateTime = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final EventType value) {
        this._type = value;
    }
}
