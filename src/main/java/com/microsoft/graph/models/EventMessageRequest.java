package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EventMessageRequest extends EventMessage implements Parsable {
    /**
     * Instantiates a new EventMessageRequest and sets the default values.
     */
    public EventMessageRequest() {
        super();
        this.setOdataType("#microsoft.graph.eventMessageRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EventMessageRequest
     */
    @jakarta.annotation.Nonnull
    public static EventMessageRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EventMessageRequest();
    }
    /**
     * Gets the allowNewTimeProposals property value. True if the meeting organizer allows invitees to propose a new time when responding, false otherwise. Optional. Default is true.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowNewTimeProposals() {
        return this.getBackingStore().get("allowNewTimeProposals");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowNewTimeProposals", (n) -> { this.setAllowNewTimeProposals(n.getBooleanValue()); });
        deserializerMap.put("meetingRequestType", (n) -> { this.setMeetingRequestType(n.getEnumValue(MeetingRequestType.class)); });
        deserializerMap.put("previousEndDateTime", (n) -> { this.setPreviousEndDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("previousLocation", (n) -> { this.setPreviousLocation(n.getObjectValue(Location::createFromDiscriminatorValue)); });
        deserializerMap.put("previousStartDateTime", (n) -> { this.setPreviousStartDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("responseRequested", (n) -> { this.setResponseRequested(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the meetingRequestType property value. The meetingRequestType property
     * @return a MeetingRequestType
     */
    @jakarta.annotation.Nullable
    public MeetingRequestType getMeetingRequestType() {
        return this.getBackingStore().get("meetingRequestType");
    }
    /**
     * Gets the previousEndDateTime property value. If the meeting update changes the meeting end time, this property specifies the previous meeting end time.
     * @return a DateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getPreviousEndDateTime() {
        return this.getBackingStore().get("previousEndDateTime");
    }
    /**
     * Gets the previousLocation property value. If the meeting update changes the meeting location, this property specifies the previous meeting location.
     * @return a Location
     */
    @jakarta.annotation.Nullable
    public Location getPreviousLocation() {
        return this.getBackingStore().get("previousLocation");
    }
    /**
     * Gets the previousStartDateTime property value. If the meeting update changes the meeting start time, this property specifies the previous meeting start time.
     * @return a DateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getPreviousStartDateTime() {
        return this.getBackingStore().get("previousStartDateTime");
    }
    /**
     * Gets the responseRequested property value. Set to true if the sender would like the invitee to send a response to the requested meeting.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getResponseRequested() {
        return this.getBackingStore().get("responseRequested");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowNewTimeProposals", this.getAllowNewTimeProposals());
        writer.writeEnumValue("meetingRequestType", this.getMeetingRequestType());
        writer.writeObjectValue("previousEndDateTime", this.getPreviousEndDateTime());
        writer.writeObjectValue("previousLocation", this.getPreviousLocation());
        writer.writeObjectValue("previousStartDateTime", this.getPreviousStartDateTime());
        writer.writeBooleanValue("responseRequested", this.getResponseRequested());
    }
    /**
     * Sets the allowNewTimeProposals property value. True if the meeting organizer allows invitees to propose a new time when responding, false otherwise. Optional. Default is true.
     * @param value Value to set for the allowNewTimeProposals property.
     */
    public void setAllowNewTimeProposals(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("allowNewTimeProposals", value);
    }
    /**
     * Sets the meetingRequestType property value. The meetingRequestType property
     * @param value Value to set for the meetingRequestType property.
     */
    public void setMeetingRequestType(@jakarta.annotation.Nullable final MeetingRequestType value) {
        this.getBackingStore().set("meetingRequestType", value);
    }
    /**
     * Sets the previousEndDateTime property value. If the meeting update changes the meeting end time, this property specifies the previous meeting end time.
     * @param value Value to set for the previousEndDateTime property.
     */
    public void setPreviousEndDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.getBackingStore().set("previousEndDateTime", value);
    }
    /**
     * Sets the previousLocation property value. If the meeting update changes the meeting location, this property specifies the previous meeting location.
     * @param value Value to set for the previousLocation property.
     */
    public void setPreviousLocation(@jakarta.annotation.Nullable final Location value) {
        this.getBackingStore().set("previousLocation", value);
    }
    /**
     * Sets the previousStartDateTime property value. If the meeting update changes the meeting start time, this property specifies the previous meeting start time.
     * @param value Value to set for the previousStartDateTime property.
     */
    public void setPreviousStartDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.getBackingStore().set("previousStartDateTime", value);
    }
    /**
     * Sets the responseRequested property value. Set to true if the sender would like the invitee to send a response to the requested meeting.
     * @param value Value to set for the responseRequested property.
     */
    public void setResponseRequested(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("responseRequested", value);
    }
}
