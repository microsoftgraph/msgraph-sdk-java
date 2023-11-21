package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EventMessage extends Message implements Parsable {
    /**
     * Instantiates a new EventMessage and sets the default values.
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
    @jakarta.annotation.Nonnull
    public static EventMessage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
     * Gets the endDateTime property value. The endDateTime property
     * @return a DateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getEndDateTime() {
        return this.backingStore.get("endDateTime");
    }
    /**
     * Gets the event property value. The event associated with the event message. The assumption for attendees or room resources is that the Calendar Attendant is set to automatically update the calendar with an event when meeting request event messages arrive. Navigation property.  Read-only.
     * @return a Event
     */
    @jakarta.annotation.Nullable
    public Event getEvent() {
        return this.backingStore.get("event");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("event", (n) -> { this.setEvent(n.getObjectValue(Event::createFromDiscriminatorValue)); });
        deserializerMap.put("isAllDay", (n) -> { this.setIsAllDay(n.getBooleanValue()); });
        deserializerMap.put("isDelegated", (n) -> { this.setIsDelegated(n.getBooleanValue()); });
        deserializerMap.put("isOutOfDate", (n) -> { this.setIsOutOfDate(n.getBooleanValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(Location::createFromDiscriminatorValue)); });
        deserializerMap.put("meetingMessageType", (n) -> { this.setMeetingMessageType(n.getEnumValue(MeetingMessageType.class)); });
        deserializerMap.put("recurrence", (n) -> { this.setRecurrence(n.getObjectValue(PatternedRecurrence::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(EventType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isAllDay property value. The isAllDay property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAllDay() {
        return this.backingStore.get("isAllDay");
    }
    /**
     * Gets the isDelegated property value. The isDelegated property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDelegated() {
        return this.backingStore.get("isDelegated");
    }
    /**
     * Gets the isOutOfDate property value. The isOutOfDate property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOutOfDate() {
        return this.backingStore.get("isOutOfDate");
    }
    /**
     * Gets the location property value. The location property
     * @return a Location
     */
    @jakarta.annotation.Nullable
    public Location getLocation() {
        return this.backingStore.get("location");
    }
    /**
     * Gets the meetingMessageType property value. The meetingMessageType property
     * @return a MeetingMessageType
     */
    @jakarta.annotation.Nullable
    public MeetingMessageType getMeetingMessageType() {
        return this.backingStore.get("meetingMessageType");
    }
    /**
     * Gets the recurrence property value. The recurrence property
     * @return a PatternedRecurrence
     */
    @jakarta.annotation.Nullable
    public PatternedRecurrence getRecurrence() {
        return this.backingStore.get("recurrence");
    }
    /**
     * Gets the startDateTime property value. The startDateTime property
     * @return a DateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the type property value. The type property
     * @return a EventType
     */
    @jakarta.annotation.Nullable
    public EventType getType() {
        return this.backingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the endDateTime property value. The endDateTime property
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the event property value. The event associated with the event message. The assumption for attendees or room resources is that the Calendar Attendant is set to automatically update the calendar with an event when meeting request event messages arrive. Navigation property.  Read-only.
     * @param value Value to set for the event property.
     */
    public void setEvent(@jakarta.annotation.Nullable final Event value) {
        this.backingStore.set("event", value);
    }
    /**
     * Sets the isAllDay property value. The isAllDay property
     * @param value Value to set for the isAllDay property.
     */
    public void setIsAllDay(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAllDay", value);
    }
    /**
     * Sets the isDelegated property value. The isDelegated property
     * @param value Value to set for the isDelegated property.
     */
    public void setIsDelegated(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDelegated", value);
    }
    /**
     * Sets the isOutOfDate property value. The isOutOfDate property
     * @param value Value to set for the isOutOfDate property.
     */
    public void setIsOutOfDate(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isOutOfDate", value);
    }
    /**
     * Sets the location property value. The location property
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final Location value) {
        this.backingStore.set("location", value);
    }
    /**
     * Sets the meetingMessageType property value. The meetingMessageType property
     * @param value Value to set for the meetingMessageType property.
     */
    public void setMeetingMessageType(@jakarta.annotation.Nullable final MeetingMessageType value) {
        this.backingStore.set("meetingMessageType", value);
    }
    /**
     * Sets the recurrence property value. The recurrence property
     * @param value Value to set for the recurrence property.
     */
    public void setRecurrence(@jakarta.annotation.Nullable final PatternedRecurrence value) {
        this.backingStore.set("recurrence", value);
    }
    /**
     * Sets the startDateTime property value. The startDateTime property
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final EventType value) {
        this.backingStore.set("type", value);
    }
}
