package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Event extends OutlookItem implements Parsable {
    /**
     * Instantiates a new Event and sets the default values.
     */
    public Event() {
        super();
        this.setOdataType("#microsoft.graph.event");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Event
     */
    @jakarta.annotation.Nonnull
    public static Event createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Event();
    }
    /**
     * Gets the allowNewTimeProposals property value. true if the meeting organizer allows invitees to propose a new time when responding; otherwise, false. Optional. Default is true.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowNewTimeProposals() {
        return this.backingStore.get("allowNewTimeProposals");
    }
    /**
     * Gets the attachments property value. The collection of FileAttachment, ItemAttachment, and referenceAttachment attachments for the event. Navigation property. Read-only. Nullable.
     * @return a java.util.List<Attachment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Attachment> getAttachments() {
        return this.backingStore.get("attachments");
    }
    /**
     * Gets the attendees property value. The collection of attendees for the event.
     * @return a java.util.List<Attendee>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Attendee> getAttendees() {
        return this.backingStore.get("attendees");
    }
    /**
     * Gets the body property value. The body of the message associated with the event. It can be in HTML or text format.
     * @return a ItemBody
     */
    @jakarta.annotation.Nullable
    public ItemBody getBody() {
        return this.backingStore.get("body");
    }
    /**
     * Gets the bodyPreview property value. The preview of the message associated with the event. It is in text format.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBodyPreview() {
        return this.backingStore.get("bodyPreview");
    }
    /**
     * Gets the calendar property value. The calendar that contains the event. Navigation property. Read-only.
     * @return a Calendar
     */
    @jakarta.annotation.Nullable
    public Calendar getCalendar() {
        return this.backingStore.get("calendar");
    }
    /**
     * Gets the end property value. The date, time, and time zone that the event ends. By default, the end time is in UTC.
     * @return a DateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getEnd() {
        return this.backingStore.get("end");
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the event. Nullable.
     * @return a java.util.List<Extension>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this.backingStore.get("extensions");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowNewTimeProposals", (n) -> { this.setAllowNewTimeProposals(n.getBooleanValue()); });
        deserializerMap.put("attachments", (n) -> { this.setAttachments(n.getCollectionOfObjectValues(Attachment::createFromDiscriminatorValue)); });
        deserializerMap.put("attendees", (n) -> { this.setAttendees(n.getCollectionOfObjectValues(Attendee::createFromDiscriminatorValue)); });
        deserializerMap.put("body", (n) -> { this.setBody(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("bodyPreview", (n) -> { this.setBodyPreview(n.getStringValue()); });
        deserializerMap.put("calendar", (n) -> { this.setCalendar(n.getObjectValue(Calendar::createFromDiscriminatorValue)); });
        deserializerMap.put("end", (n) -> { this.setEnd(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
        deserializerMap.put("hasAttachments", (n) -> { this.setHasAttachments(n.getBooleanValue()); });
        deserializerMap.put("hideAttendees", (n) -> { this.setHideAttendees(n.getBooleanValue()); });
        deserializerMap.put("iCalUId", (n) -> { this.setICalUId(n.getStringValue()); });
        deserializerMap.put("importance", (n) -> { this.setImportance(n.getEnumValue(Importance.class)); });
        deserializerMap.put("instances", (n) -> { this.setInstances(n.getCollectionOfObjectValues(Event::createFromDiscriminatorValue)); });
        deserializerMap.put("isAllDay", (n) -> { this.setIsAllDay(n.getBooleanValue()); });
        deserializerMap.put("isCancelled", (n) -> { this.setIsCancelled(n.getBooleanValue()); });
        deserializerMap.put("isDraft", (n) -> { this.setIsDraft(n.getBooleanValue()); });
        deserializerMap.put("isOnlineMeeting", (n) -> { this.setIsOnlineMeeting(n.getBooleanValue()); });
        deserializerMap.put("isOrganizer", (n) -> { this.setIsOrganizer(n.getBooleanValue()); });
        deserializerMap.put("isReminderOn", (n) -> { this.setIsReminderOn(n.getBooleanValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(Location::createFromDiscriminatorValue)); });
        deserializerMap.put("locations", (n) -> { this.setLocations(n.getCollectionOfObjectValues(Location::createFromDiscriminatorValue)); });
        deserializerMap.put("multiValueExtendedProperties", (n) -> { this.setMultiValueExtendedProperties(n.getCollectionOfObjectValues(MultiValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("onlineMeeting", (n) -> { this.setOnlineMeeting(n.getObjectValue(OnlineMeetingInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("onlineMeetingProvider", (n) -> { this.setOnlineMeetingProvider(n.getEnumValue(OnlineMeetingProviderType.class)); });
        deserializerMap.put("onlineMeetingUrl", (n) -> { this.setOnlineMeetingUrl(n.getStringValue()); });
        deserializerMap.put("organizer", (n) -> { this.setOrganizer(n.getObjectValue(Recipient::createFromDiscriminatorValue)); });
        deserializerMap.put("originalEndTimeZone", (n) -> { this.setOriginalEndTimeZone(n.getStringValue()); });
        deserializerMap.put("originalStart", (n) -> { this.setOriginalStart(n.getOffsetDateTimeValue()); });
        deserializerMap.put("originalStartTimeZone", (n) -> { this.setOriginalStartTimeZone(n.getStringValue()); });
        deserializerMap.put("recurrence", (n) -> { this.setRecurrence(n.getObjectValue(PatternedRecurrence::createFromDiscriminatorValue)); });
        deserializerMap.put("reminderMinutesBeforeStart", (n) -> { this.setReminderMinutesBeforeStart(n.getIntegerValue()); });
        deserializerMap.put("responseRequested", (n) -> { this.setResponseRequested(n.getBooleanValue()); });
        deserializerMap.put("responseStatus", (n) -> { this.setResponseStatus(n.getObjectValue(ResponseStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("sensitivity", (n) -> { this.setSensitivity(n.getEnumValue(Sensitivity.class)); });
        deserializerMap.put("seriesMasterId", (n) -> { this.setSeriesMasterId(n.getStringValue()); });
        deserializerMap.put("showAs", (n) -> { this.setShowAs(n.getEnumValue(FreeBusyStatus.class)); });
        deserializerMap.put("singleValueExtendedProperties", (n) -> { this.setSingleValueExtendedProperties(n.getCollectionOfObjectValues(SingleValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("start", (n) -> { this.setStart(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("transactionId", (n) -> { this.setTransactionId(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(EventType.class)); });
        deserializerMap.put("webLink", (n) -> { this.setWebLink(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hasAttachments property value. Set to true if the event has attachments.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHasAttachments() {
        return this.backingStore.get("hasAttachments");
    }
    /**
     * Gets the hideAttendees property value. When set to true, each attendee only sees themselves in the meeting request and meeting Tracking list. Default is false.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHideAttendees() {
        return this.backingStore.get("hideAttendees");
    }
    /**
     * Gets the iCalUId property value. A unique identifier for an event across calendars. This ID is different for each occurrence in a recurring series. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getICalUId() {
        return this.backingStore.get("iCalUId");
    }
    /**
     * Gets the importance property value. The importance property
     * @return a Importance
     */
    @jakarta.annotation.Nullable
    public Importance getImportance() {
        return this.backingStore.get("importance");
    }
    /**
     * Gets the instances property value. The occurrences of a recurring series, if the event is a series master. This property includes occurrences that are part of the recurrence pattern, and exceptions that have been modified, but does not include occurrences that have been cancelled from the series. Navigation property. Read-only. Nullable.
     * @return a java.util.List<Event>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Event> getInstances() {
        return this.backingStore.get("instances");
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
     * Gets the isCancelled property value. The isCancelled property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCancelled() {
        return this.backingStore.get("isCancelled");
    }
    /**
     * Gets the isDraft property value. The isDraft property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDraft() {
        return this.backingStore.get("isDraft");
    }
    /**
     * Gets the isOnlineMeeting property value. The isOnlineMeeting property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOnlineMeeting() {
        return this.backingStore.get("isOnlineMeeting");
    }
    /**
     * Gets the isOrganizer property value. The isOrganizer property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOrganizer() {
        return this.backingStore.get("isOrganizer");
    }
    /**
     * Gets the isReminderOn property value. The isReminderOn property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsReminderOn() {
        return this.backingStore.get("isReminderOn");
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
     * Gets the locations property value. The locations property
     * @return a java.util.List<Location>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Location> getLocations() {
        return this.backingStore.get("locations");
    }
    /**
     * Gets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the event. Read-only. Nullable.
     * @return a java.util.List<MultiValueLegacyExtendedProperty>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this.backingStore.get("multiValueExtendedProperties");
    }
    /**
     * Gets the onlineMeeting property value. The onlineMeeting property
     * @return a OnlineMeetingInfo
     */
    @jakarta.annotation.Nullable
    public OnlineMeetingInfo getOnlineMeeting() {
        return this.backingStore.get("onlineMeeting");
    }
    /**
     * Gets the onlineMeetingProvider property value. The onlineMeetingProvider property
     * @return a OnlineMeetingProviderType
     */
    @jakarta.annotation.Nullable
    public OnlineMeetingProviderType getOnlineMeetingProvider() {
        return this.backingStore.get("onlineMeetingProvider");
    }
    /**
     * Gets the onlineMeetingUrl property value. The onlineMeetingUrl property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOnlineMeetingUrl() {
        return this.backingStore.get("onlineMeetingUrl");
    }
    /**
     * Gets the organizer property value. The organizer property
     * @return a Recipient
     */
    @jakarta.annotation.Nullable
    public Recipient getOrganizer() {
        return this.backingStore.get("organizer");
    }
    /**
     * Gets the originalEndTimeZone property value. The originalEndTimeZone property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOriginalEndTimeZone() {
        return this.backingStore.get("originalEndTimeZone");
    }
    /**
     * Gets the originalStart property value. The originalStart property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getOriginalStart() {
        return this.backingStore.get("originalStart");
    }
    /**
     * Gets the originalStartTimeZone property value. The originalStartTimeZone property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOriginalStartTimeZone() {
        return this.backingStore.get("originalStartTimeZone");
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
     * Gets the reminderMinutesBeforeStart property value. The reminderMinutesBeforeStart property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getReminderMinutesBeforeStart() {
        return this.backingStore.get("reminderMinutesBeforeStart");
    }
    /**
     * Gets the responseRequested property value. The responseRequested property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getResponseRequested() {
        return this.backingStore.get("responseRequested");
    }
    /**
     * Gets the responseStatus property value. The responseStatus property
     * @return a ResponseStatus
     */
    @jakarta.annotation.Nullable
    public ResponseStatus getResponseStatus() {
        return this.backingStore.get("responseStatus");
    }
    /**
     * Gets the sensitivity property value. The sensitivity property
     * @return a Sensitivity
     */
    @jakarta.annotation.Nullable
    public Sensitivity getSensitivity() {
        return this.backingStore.get("sensitivity");
    }
    /**
     * Gets the seriesMasterId property value. The seriesMasterId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSeriesMasterId() {
        return this.backingStore.get("seriesMasterId");
    }
    /**
     * Gets the showAs property value. The showAs property
     * @return a FreeBusyStatus
     */
    @jakarta.annotation.Nullable
    public FreeBusyStatus getShowAs() {
        return this.backingStore.get("showAs");
    }
    /**
     * Gets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the event. Read-only. Nullable.
     * @return a java.util.List<SingleValueLegacyExtendedProperty>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this.backingStore.get("singleValueExtendedProperties");
    }
    /**
     * Gets the start property value. The start property
     * @return a DateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getStart() {
        return this.backingStore.get("start");
    }
    /**
     * Gets the subject property value. The subject property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.backingStore.get("subject");
    }
    /**
     * Gets the transactionId property value. The transactionId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTransactionId() {
        return this.backingStore.get("transactionId");
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
     * Gets the webLink property value. The webLink property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWebLink() {
        return this.backingStore.get("webLink");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowNewTimeProposals", this.getAllowNewTimeProposals());
        writer.writeCollectionOfObjectValues("attachments", this.getAttachments());
        writer.writeCollectionOfObjectValues("attendees", this.getAttendees());
        writer.writeObjectValue("body", this.getBody());
        writer.writeStringValue("bodyPreview", this.getBodyPreview());
        writer.writeObjectValue("calendar", this.getCalendar());
        writer.writeObjectValue("end", this.getEnd());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeBooleanValue("hasAttachments", this.getHasAttachments());
        writer.writeBooleanValue("hideAttendees", this.getHideAttendees());
        writer.writeStringValue("iCalUId", this.getICalUId());
        writer.writeEnumValue("importance", this.getImportance());
        writer.writeCollectionOfObjectValues("instances", this.getInstances());
        writer.writeBooleanValue("isAllDay", this.getIsAllDay());
        writer.writeBooleanValue("isCancelled", this.getIsCancelled());
        writer.writeBooleanValue("isDraft", this.getIsDraft());
        writer.writeBooleanValue("isOnlineMeeting", this.getIsOnlineMeeting());
        writer.writeBooleanValue("isOrganizer", this.getIsOrganizer());
        writer.writeBooleanValue("isReminderOn", this.getIsReminderOn());
        writer.writeObjectValue("location", this.getLocation());
        writer.writeCollectionOfObjectValues("locations", this.getLocations());
        writer.writeCollectionOfObjectValues("multiValueExtendedProperties", this.getMultiValueExtendedProperties());
        writer.writeObjectValue("onlineMeeting", this.getOnlineMeeting());
        writer.writeEnumValue("onlineMeetingProvider", this.getOnlineMeetingProvider());
        writer.writeStringValue("onlineMeetingUrl", this.getOnlineMeetingUrl());
        writer.writeObjectValue("organizer", this.getOrganizer());
        writer.writeStringValue("originalEndTimeZone", this.getOriginalEndTimeZone());
        writer.writeOffsetDateTimeValue("originalStart", this.getOriginalStart());
        writer.writeStringValue("originalStartTimeZone", this.getOriginalStartTimeZone());
        writer.writeObjectValue("recurrence", this.getRecurrence());
        writer.writeIntegerValue("reminderMinutesBeforeStart", this.getReminderMinutesBeforeStart());
        writer.writeBooleanValue("responseRequested", this.getResponseRequested());
        writer.writeObjectValue("responseStatus", this.getResponseStatus());
        writer.writeEnumValue("sensitivity", this.getSensitivity());
        writer.writeStringValue("seriesMasterId", this.getSeriesMasterId());
        writer.writeEnumValue("showAs", this.getShowAs());
        writer.writeCollectionOfObjectValues("singleValueExtendedProperties", this.getSingleValueExtendedProperties());
        writer.writeObjectValue("start", this.getStart());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeStringValue("transactionId", this.getTransactionId());
        writer.writeEnumValue("type", this.getType());
        writer.writeStringValue("webLink", this.getWebLink());
    }
    /**
     * Sets the allowNewTimeProposals property value. true if the meeting organizer allows invitees to propose a new time when responding; otherwise, false. Optional. Default is true.
     * @param value Value to set for the allowNewTimeProposals property.
     */
    public void setAllowNewTimeProposals(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowNewTimeProposals", value);
    }
    /**
     * Sets the attachments property value. The collection of FileAttachment, ItemAttachment, and referenceAttachment attachments for the event. Navigation property. Read-only. Nullable.
     * @param value Value to set for the attachments property.
     */
    public void setAttachments(@jakarta.annotation.Nullable final java.util.List<Attachment> value) {
        this.backingStore.set("attachments", value);
    }
    /**
     * Sets the attendees property value. The collection of attendees for the event.
     * @param value Value to set for the attendees property.
     */
    public void setAttendees(@jakarta.annotation.Nullable final java.util.List<Attendee> value) {
        this.backingStore.set("attendees", value);
    }
    /**
     * Sets the body property value. The body of the message associated with the event. It can be in HTML or text format.
     * @param value Value to set for the body property.
     */
    public void setBody(@jakarta.annotation.Nullable final ItemBody value) {
        this.backingStore.set("body", value);
    }
    /**
     * Sets the bodyPreview property value. The preview of the message associated with the event. It is in text format.
     * @param value Value to set for the bodyPreview property.
     */
    public void setBodyPreview(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bodyPreview", value);
    }
    /**
     * Sets the calendar property value. The calendar that contains the event. Navigation property. Read-only.
     * @param value Value to set for the calendar property.
     */
    public void setCalendar(@jakarta.annotation.Nullable final Calendar value) {
        this.backingStore.set("calendar", value);
    }
    /**
     * Sets the end property value. The date, time, and time zone that the event ends. By default, the end time is in UTC.
     * @param value Value to set for the end property.
     */
    public void setEnd(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.backingStore.set("end", value);
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the event. Nullable.
     * @param value Value to set for the extensions property.
     */
    public void setExtensions(@jakarta.annotation.Nullable final java.util.List<Extension> value) {
        this.backingStore.set("extensions", value);
    }
    /**
     * Sets the hasAttachments property value. Set to true if the event has attachments.
     * @param value Value to set for the hasAttachments property.
     */
    public void setHasAttachments(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasAttachments", value);
    }
    /**
     * Sets the hideAttendees property value. When set to true, each attendee only sees themselves in the meeting request and meeting Tracking list. Default is false.
     * @param value Value to set for the hideAttendees property.
     */
    public void setHideAttendees(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hideAttendees", value);
    }
    /**
     * Sets the iCalUId property value. A unique identifier for an event across calendars. This ID is different for each occurrence in a recurring series. Read-only.
     * @param value Value to set for the iCalUId property.
     */
    public void setICalUId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("iCalUId", value);
    }
    /**
     * Sets the importance property value. The importance property
     * @param value Value to set for the importance property.
     */
    public void setImportance(@jakarta.annotation.Nullable final Importance value) {
        this.backingStore.set("importance", value);
    }
    /**
     * Sets the instances property value. The occurrences of a recurring series, if the event is a series master. This property includes occurrences that are part of the recurrence pattern, and exceptions that have been modified, but does not include occurrences that have been cancelled from the series. Navigation property. Read-only. Nullable.
     * @param value Value to set for the instances property.
     */
    public void setInstances(@jakarta.annotation.Nullable final java.util.List<Event> value) {
        this.backingStore.set("instances", value);
    }
    /**
     * Sets the isAllDay property value. The isAllDay property
     * @param value Value to set for the isAllDay property.
     */
    public void setIsAllDay(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAllDay", value);
    }
    /**
     * Sets the isCancelled property value. The isCancelled property
     * @param value Value to set for the isCancelled property.
     */
    public void setIsCancelled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCancelled", value);
    }
    /**
     * Sets the isDraft property value. The isDraft property
     * @param value Value to set for the isDraft property.
     */
    public void setIsDraft(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDraft", value);
    }
    /**
     * Sets the isOnlineMeeting property value. The isOnlineMeeting property
     * @param value Value to set for the isOnlineMeeting property.
     */
    public void setIsOnlineMeeting(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isOnlineMeeting", value);
    }
    /**
     * Sets the isOrganizer property value. The isOrganizer property
     * @param value Value to set for the isOrganizer property.
     */
    public void setIsOrganizer(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isOrganizer", value);
    }
    /**
     * Sets the isReminderOn property value. The isReminderOn property
     * @param value Value to set for the isReminderOn property.
     */
    public void setIsReminderOn(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isReminderOn", value);
    }
    /**
     * Sets the location property value. The location property
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final Location value) {
        this.backingStore.set("location", value);
    }
    /**
     * Sets the locations property value. The locations property
     * @param value Value to set for the locations property.
     */
    public void setLocations(@jakarta.annotation.Nullable final java.util.List<Location> value) {
        this.backingStore.set("locations", value);
    }
    /**
     * Sets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the event. Read-only. Nullable.
     * @param value Value to set for the multiValueExtendedProperties property.
     */
    public void setMultiValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this.backingStore.set("multiValueExtendedProperties", value);
    }
    /**
     * Sets the onlineMeeting property value. The onlineMeeting property
     * @param value Value to set for the onlineMeeting property.
     */
    public void setOnlineMeeting(@jakarta.annotation.Nullable final OnlineMeetingInfo value) {
        this.backingStore.set("onlineMeeting", value);
    }
    /**
     * Sets the onlineMeetingProvider property value. The onlineMeetingProvider property
     * @param value Value to set for the onlineMeetingProvider property.
     */
    public void setOnlineMeetingProvider(@jakarta.annotation.Nullable final OnlineMeetingProviderType value) {
        this.backingStore.set("onlineMeetingProvider", value);
    }
    /**
     * Sets the onlineMeetingUrl property value. The onlineMeetingUrl property
     * @param value Value to set for the onlineMeetingUrl property.
     */
    public void setOnlineMeetingUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("onlineMeetingUrl", value);
    }
    /**
     * Sets the organizer property value. The organizer property
     * @param value Value to set for the organizer property.
     */
    public void setOrganizer(@jakarta.annotation.Nullable final Recipient value) {
        this.backingStore.set("organizer", value);
    }
    /**
     * Sets the originalEndTimeZone property value. The originalEndTimeZone property
     * @param value Value to set for the originalEndTimeZone property.
     */
    public void setOriginalEndTimeZone(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("originalEndTimeZone", value);
    }
    /**
     * Sets the originalStart property value. The originalStart property
     * @param value Value to set for the originalStart property.
     */
    public void setOriginalStart(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("originalStart", value);
    }
    /**
     * Sets the originalStartTimeZone property value. The originalStartTimeZone property
     * @param value Value to set for the originalStartTimeZone property.
     */
    public void setOriginalStartTimeZone(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("originalStartTimeZone", value);
    }
    /**
     * Sets the recurrence property value. The recurrence property
     * @param value Value to set for the recurrence property.
     */
    public void setRecurrence(@jakarta.annotation.Nullable final PatternedRecurrence value) {
        this.backingStore.set("recurrence", value);
    }
    /**
     * Sets the reminderMinutesBeforeStart property value. The reminderMinutesBeforeStart property
     * @param value Value to set for the reminderMinutesBeforeStart property.
     */
    public void setReminderMinutesBeforeStart(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("reminderMinutesBeforeStart", value);
    }
    /**
     * Sets the responseRequested property value. The responseRequested property
     * @param value Value to set for the responseRequested property.
     */
    public void setResponseRequested(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("responseRequested", value);
    }
    /**
     * Sets the responseStatus property value. The responseStatus property
     * @param value Value to set for the responseStatus property.
     */
    public void setResponseStatus(@jakarta.annotation.Nullable final ResponseStatus value) {
        this.backingStore.set("responseStatus", value);
    }
    /**
     * Sets the sensitivity property value. The sensitivity property
     * @param value Value to set for the sensitivity property.
     */
    public void setSensitivity(@jakarta.annotation.Nullable final Sensitivity value) {
        this.backingStore.set("sensitivity", value);
    }
    /**
     * Sets the seriesMasterId property value. The seriesMasterId property
     * @param value Value to set for the seriesMasterId property.
     */
    public void setSeriesMasterId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("seriesMasterId", value);
    }
    /**
     * Sets the showAs property value. The showAs property
     * @param value Value to set for the showAs property.
     */
    public void setShowAs(@jakarta.annotation.Nullable final FreeBusyStatus value) {
        this.backingStore.set("showAs", value);
    }
    /**
     * Sets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the event. Read-only. Nullable.
     * @param value Value to set for the singleValueExtendedProperties property.
     */
    public void setSingleValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this.backingStore.set("singleValueExtendedProperties", value);
    }
    /**
     * Sets the start property value. The start property
     * @param value Value to set for the start property.
     */
    public void setStart(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.backingStore.set("start", value);
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subject", value);
    }
    /**
     * Sets the transactionId property value. The transactionId property
     * @param value Value to set for the transactionId property.
     */
    public void setTransactionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("transactionId", value);
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final EventType value) {
        this.backingStore.set("type", value);
    }
    /**
     * Sets the webLink property value. The webLink property
     * @param value Value to set for the webLink property.
     */
    public void setWebLink(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("webLink", value);
    }
}
