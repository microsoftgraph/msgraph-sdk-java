package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Event extends OutlookItem implements Parsable {
    /**
     * true if the meeting organizer allows invitees to propose a new time when responding; otherwise, false. Optional. Default is true.
     */
    private Boolean allowNewTimeProposals;
    /**
     * The collection of FileAttachment, ItemAttachment, and referenceAttachment attachments for the event. Navigation property. Read-only. Nullable.
     */
    private java.util.List<Attachment> attachments;
    /**
     * The collection of attendees for the event.
     */
    private java.util.List<Attendee> attendees;
    /**
     * The body of the message associated with the event. It can be in HTML or text format.
     */
    private ItemBody body;
    /**
     * The preview of the message associated with the event. It is in text format.
     */
    private String bodyPreview;
    /**
     * The calendar that contains the event. Navigation property. Read-only.
     */
    private Calendar calendar;
    /**
     * The date, time, and time zone that the event ends. By default, the end time is in UTC.
     */
    private DateTimeTimeZone end;
    /**
     * The collection of open extensions defined for the event. Nullable.
     */
    private java.util.List<Extension> extensions;
    /**
     * Set to true if the event has attachments.
     */
    private Boolean hasAttachments;
    /**
     * When set to true, each attendee only sees themselves in the meeting request and meeting Tracking list. Default is false.
     */
    private Boolean hideAttendees;
    /**
     * A unique identifier for an event across calendars. This ID is different for each occurrence in a recurring series. Read-only.
     */
    private String iCalUId;
    /**
     * The importance property
     */
    private Importance importance;
    /**
     * The occurrences of a recurring series, if the event is a series master. This property includes occurrences that are part of the recurrence pattern, and exceptions that have been modified, but does not include occurrences that have been cancelled from the series. Navigation property. Read-only. Nullable.
     */
    private java.util.List<Event> instances;
    /**
     * The isAllDay property
     */
    private Boolean isAllDay;
    /**
     * The isCancelled property
     */
    private Boolean isCancelled;
    /**
     * The isDraft property
     */
    private Boolean isDraft;
    /**
     * The isOnlineMeeting property
     */
    private Boolean isOnlineMeeting;
    /**
     * The isOrganizer property
     */
    private Boolean isOrganizer;
    /**
     * The isReminderOn property
     */
    private Boolean isReminderOn;
    /**
     * The location property
     */
    private Location location;
    /**
     * The locations property
     */
    private java.util.List<Location> locations;
    /**
     * The collection of multi-value extended properties defined for the event. Read-only. Nullable.
     */
    private java.util.List<MultiValueLegacyExtendedProperty> multiValueExtendedProperties;
    /**
     * The onlineMeeting property
     */
    private OnlineMeetingInfo onlineMeeting;
    /**
     * The onlineMeetingProvider property
     */
    private OnlineMeetingProviderType onlineMeetingProvider;
    /**
     * The onlineMeetingUrl property
     */
    private String onlineMeetingUrl;
    /**
     * The organizer property
     */
    private Recipient organizer;
    /**
     * The originalEndTimeZone property
     */
    private String originalEndTimeZone;
    /**
     * The originalStart property
     */
    private OffsetDateTime originalStart;
    /**
     * The originalStartTimeZone property
     */
    private String originalStartTimeZone;
    /**
     * The recurrence property
     */
    private PatternedRecurrence recurrence;
    /**
     * The reminderMinutesBeforeStart property
     */
    private Integer reminderMinutesBeforeStart;
    /**
     * The responseRequested property
     */
    private Boolean responseRequested;
    /**
     * The responseStatus property
     */
    private ResponseStatus responseStatus;
    /**
     * The sensitivity property
     */
    private Sensitivity sensitivity;
    /**
     * The seriesMasterId property
     */
    private String seriesMasterId;
    /**
     * The showAs property
     */
    private FreeBusyStatus showAs;
    /**
     * The collection of single-value extended properties defined for the event. Read-only. Nullable.
     */
    private java.util.List<SingleValueLegacyExtendedProperty> singleValueExtendedProperties;
    /**
     * The start property
     */
    private DateTimeTimeZone start;
    /**
     * The subject property
     */
    private String subject;
    /**
     * The transactionId property
     */
    private String transactionId;
    /**
     * The type property
     */
    private EventType type;
    /**
     * The webLink property
     */
    private String webLink;
    /**
     * Instantiates a new event and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Event() {
        super();
        this.setOdataType("#microsoft.graph.event");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a event
     */
    @javax.annotation.Nonnull
    public static Event createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Event();
    }
    /**
     * Gets the allowNewTimeProposals property value. true if the meeting organizer allows invitees to propose a new time when responding; otherwise, false. Optional. Default is true.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowNewTimeProposals() {
        return this.allowNewTimeProposals;
    }
    /**
     * Gets the attachments property value. The collection of FileAttachment, ItemAttachment, and referenceAttachment attachments for the event. Navigation property. Read-only. Nullable.
     * @return a attachment
     */
    @javax.annotation.Nullable
    public java.util.List<Attachment> getAttachments() {
        return this.attachments;
    }
    /**
     * Gets the attendees property value. The collection of attendees for the event.
     * @return a attendee
     */
    @javax.annotation.Nullable
    public java.util.List<Attendee> getAttendees() {
        return this.attendees;
    }
    /**
     * Gets the body property value. The body of the message associated with the event. It can be in HTML or text format.
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getBody() {
        return this.body;
    }
    /**
     * Gets the bodyPreview property value. The preview of the message associated with the event. It is in text format.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBodyPreview() {
        return this.bodyPreview;
    }
    /**
     * Gets the calendar property value. The calendar that contains the event. Navigation property. Read-only.
     * @return a calendar
     */
    @javax.annotation.Nullable
    public Calendar getCalendar() {
        return this.calendar;
    }
    /**
     * Gets the end property value. The date, time, and time zone that the event ends. By default, the end time is in UTC.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getEnd() {
        return this.end;
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the event. Nullable.
     * @return a extension
     */
    @javax.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this.extensions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasAttachments() {
        return this.hasAttachments;
    }
    /**
     * Gets the hideAttendees property value. When set to true, each attendee only sees themselves in the meeting request and meeting Tracking list. Default is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHideAttendees() {
        return this.hideAttendees;
    }
    /**
     * Gets the iCalUId property value. A unique identifier for an event across calendars. This ID is different for each occurrence in a recurring series. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getICalUId() {
        return this.iCalUId;
    }
    /**
     * Gets the importance property value. The importance property
     * @return a importance
     */
    @javax.annotation.Nullable
    public Importance getImportance() {
        return this.importance;
    }
    /**
     * Gets the instances property value. The occurrences of a recurring series, if the event is a series master. This property includes occurrences that are part of the recurrence pattern, and exceptions that have been modified, but does not include occurrences that have been cancelled from the series. Navigation property. Read-only. Nullable.
     * @return a event
     */
    @javax.annotation.Nullable
    public java.util.List<Event> getInstances() {
        return this.instances;
    }
    /**
     * Gets the isAllDay property value. The isAllDay property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAllDay() {
        return this.isAllDay;
    }
    /**
     * Gets the isCancelled property value. The isCancelled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCancelled() {
        return this.isCancelled;
    }
    /**
     * Gets the isDraft property value. The isDraft property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDraft() {
        return this.isDraft;
    }
    /**
     * Gets the isOnlineMeeting property value. The isOnlineMeeting property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsOnlineMeeting() {
        return this.isOnlineMeeting;
    }
    /**
     * Gets the isOrganizer property value. The isOrganizer property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsOrganizer() {
        return this.isOrganizer;
    }
    /**
     * Gets the isReminderOn property value. The isReminderOn property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsReminderOn() {
        return this.isReminderOn;
    }
    /**
     * Gets the location property value. The location property
     * @return a location
     */
    @javax.annotation.Nullable
    public Location getLocation() {
        return this.location;
    }
    /**
     * Gets the locations property value. The locations property
     * @return a location
     */
    @javax.annotation.Nullable
    public java.util.List<Location> getLocations() {
        return this.locations;
    }
    /**
     * Gets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the event. Read-only. Nullable.
     * @return a multiValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this.multiValueExtendedProperties;
    }
    /**
     * Gets the onlineMeeting property value. The onlineMeeting property
     * @return a onlineMeetingInfo
     */
    @javax.annotation.Nullable
    public OnlineMeetingInfo getOnlineMeeting() {
        return this.onlineMeeting;
    }
    /**
     * Gets the onlineMeetingProvider property value. The onlineMeetingProvider property
     * @return a onlineMeetingProviderType
     */
    @javax.annotation.Nullable
    public OnlineMeetingProviderType getOnlineMeetingProvider() {
        return this.onlineMeetingProvider;
    }
    /**
     * Gets the onlineMeetingUrl property value. The onlineMeetingUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnlineMeetingUrl() {
        return this.onlineMeetingUrl;
    }
    /**
     * Gets the organizer property value. The organizer property
     * @return a recipient
     */
    @javax.annotation.Nullable
    public Recipient getOrganizer() {
        return this.organizer;
    }
    /**
     * Gets the originalEndTimeZone property value. The originalEndTimeZone property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOriginalEndTimeZone() {
        return this.originalEndTimeZone;
    }
    /**
     * Gets the originalStart property value. The originalStart property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getOriginalStart() {
        return this.originalStart;
    }
    /**
     * Gets the originalStartTimeZone property value. The originalStartTimeZone property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOriginalStartTimeZone() {
        return this.originalStartTimeZone;
    }
    /**
     * Gets the recurrence property value. The recurrence property
     * @return a patternedRecurrence
     */
    @javax.annotation.Nullable
    public PatternedRecurrence getRecurrence() {
        return this.recurrence;
    }
    /**
     * Gets the reminderMinutesBeforeStart property value. The reminderMinutesBeforeStart property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getReminderMinutesBeforeStart() {
        return this.reminderMinutesBeforeStart;
    }
    /**
     * Gets the responseRequested property value. The responseRequested property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getResponseRequested() {
        return this.responseRequested;
    }
    /**
     * Gets the responseStatus property value. The responseStatus property
     * @return a responseStatus
     */
    @javax.annotation.Nullable
    public ResponseStatus getResponseStatus() {
        return this.responseStatus;
    }
    /**
     * Gets the sensitivity property value. The sensitivity property
     * @return a sensitivity
     */
    @javax.annotation.Nullable
    public Sensitivity getSensitivity() {
        return this.sensitivity;
    }
    /**
     * Gets the seriesMasterId property value. The seriesMasterId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSeriesMasterId() {
        return this.seriesMasterId;
    }
    /**
     * Gets the showAs property value. The showAs property
     * @return a freeBusyStatus
     */
    @javax.annotation.Nullable
    public FreeBusyStatus getShowAs() {
        return this.showAs;
    }
    /**
     * Gets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the event. Read-only. Nullable.
     * @return a singleValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this.singleValueExtendedProperties;
    }
    /**
     * Gets the start property value. The start property
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getStart() {
        return this.start;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this.subject;
    }
    /**
     * Gets the transactionId property value. The transactionId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTransactionId() {
        return this.transactionId;
    }
    /**
     * Gets the type property value. The type property
     * @return a eventType
     */
    @javax.annotation.Nullable
    public EventType getType() {
        return this.type;
    }
    /**
     * Gets the webLink property value. The webLink property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebLink() {
        return this.webLink;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowNewTimeProposals(@javax.annotation.Nullable final Boolean value) {
        this.allowNewTimeProposals = value;
    }
    /**
     * Sets the attachments property value. The collection of FileAttachment, ItemAttachment, and referenceAttachment attachments for the event. Navigation property. Read-only. Nullable.
     * @param value Value to set for the attachments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttachments(@javax.annotation.Nullable final java.util.List<Attachment> value) {
        this.attachments = value;
    }
    /**
     * Sets the attendees property value. The collection of attendees for the event.
     * @param value Value to set for the attendees property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttendees(@javax.annotation.Nullable final java.util.List<Attendee> value) {
        this.attendees = value;
    }
    /**
     * Sets the body property value. The body of the message associated with the event. It can be in HTML or text format.
     * @param value Value to set for the body property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBody(@javax.annotation.Nullable final ItemBody value) {
        this.body = value;
    }
    /**
     * Sets the bodyPreview property value. The preview of the message associated with the event. It is in text format.
     * @param value Value to set for the bodyPreview property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBodyPreview(@javax.annotation.Nullable final String value) {
        this.bodyPreview = value;
    }
    /**
     * Sets the calendar property value. The calendar that contains the event. Navigation property. Read-only.
     * @param value Value to set for the calendar property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCalendar(@javax.annotation.Nullable final Calendar value) {
        this.calendar = value;
    }
    /**
     * Sets the end property value. The date, time, and time zone that the event ends. By default, the end time is in UTC.
     * @param value Value to set for the end property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnd(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this.end = value;
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the event. Nullable.
     * @param value Value to set for the extensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtensions(@javax.annotation.Nullable final java.util.List<Extension> value) {
        this.extensions = value;
    }
    /**
     * Sets the hasAttachments property value. Set to true if the event has attachments.
     * @param value Value to set for the hasAttachments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHasAttachments(@javax.annotation.Nullable final Boolean value) {
        this.hasAttachments = value;
    }
    /**
     * Sets the hideAttendees property value. When set to true, each attendee only sees themselves in the meeting request and meeting Tracking list. Default is false.
     * @param value Value to set for the hideAttendees property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHideAttendees(@javax.annotation.Nullable final Boolean value) {
        this.hideAttendees = value;
    }
    /**
     * Sets the iCalUId property value. A unique identifier for an event across calendars. This ID is different for each occurrence in a recurring series. Read-only.
     * @param value Value to set for the iCalUId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICalUId(@javax.annotation.Nullable final String value) {
        this.iCalUId = value;
    }
    /**
     * Sets the importance property value. The importance property
     * @param value Value to set for the importance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImportance(@javax.annotation.Nullable final Importance value) {
        this.importance = value;
    }
    /**
     * Sets the instances property value. The occurrences of a recurring series, if the event is a series master. This property includes occurrences that are part of the recurrence pattern, and exceptions that have been modified, but does not include occurrences that have been cancelled from the series. Navigation property. Read-only. Nullable.
     * @param value Value to set for the instances property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstances(@javax.annotation.Nullable final java.util.List<Event> value) {
        this.instances = value;
    }
    /**
     * Sets the isAllDay property value. The isAllDay property
     * @param value Value to set for the isAllDay property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAllDay(@javax.annotation.Nullable final Boolean value) {
        this.isAllDay = value;
    }
    /**
     * Sets the isCancelled property value. The isCancelled property
     * @param value Value to set for the isCancelled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsCancelled(@javax.annotation.Nullable final Boolean value) {
        this.isCancelled = value;
    }
    /**
     * Sets the isDraft property value. The isDraft property
     * @param value Value to set for the isDraft property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDraft(@javax.annotation.Nullable final Boolean value) {
        this.isDraft = value;
    }
    /**
     * Sets the isOnlineMeeting property value. The isOnlineMeeting property
     * @param value Value to set for the isOnlineMeeting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsOnlineMeeting(@javax.annotation.Nullable final Boolean value) {
        this.isOnlineMeeting = value;
    }
    /**
     * Sets the isOrganizer property value. The isOrganizer property
     * @param value Value to set for the isOrganizer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsOrganizer(@javax.annotation.Nullable final Boolean value) {
        this.isOrganizer = value;
    }
    /**
     * Sets the isReminderOn property value. The isReminderOn property
     * @param value Value to set for the isReminderOn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsReminderOn(@javax.annotation.Nullable final Boolean value) {
        this.isReminderOn = value;
    }
    /**
     * Sets the location property value. The location property
     * @param value Value to set for the location property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocation(@javax.annotation.Nullable final Location value) {
        this.location = value;
    }
    /**
     * Sets the locations property value. The locations property
     * @param value Value to set for the locations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocations(@javax.annotation.Nullable final java.util.List<Location> value) {
        this.locations = value;
    }
    /**
     * Sets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the event. Read-only. Nullable.
     * @param value Value to set for the multiValueExtendedProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMultiValueExtendedProperties(@javax.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this.multiValueExtendedProperties = value;
    }
    /**
     * Sets the onlineMeeting property value. The onlineMeeting property
     * @param value Value to set for the onlineMeeting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnlineMeeting(@javax.annotation.Nullable final OnlineMeetingInfo value) {
        this.onlineMeeting = value;
    }
    /**
     * Sets the onlineMeetingProvider property value. The onlineMeetingProvider property
     * @param value Value to set for the onlineMeetingProvider property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnlineMeetingProvider(@javax.annotation.Nullable final OnlineMeetingProviderType value) {
        this.onlineMeetingProvider = value;
    }
    /**
     * Sets the onlineMeetingUrl property value. The onlineMeetingUrl property
     * @param value Value to set for the onlineMeetingUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnlineMeetingUrl(@javax.annotation.Nullable final String value) {
        this.onlineMeetingUrl = value;
    }
    /**
     * Sets the organizer property value. The organizer property
     * @param value Value to set for the organizer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizer(@javax.annotation.Nullable final Recipient value) {
        this.organizer = value;
    }
    /**
     * Sets the originalEndTimeZone property value. The originalEndTimeZone property
     * @param value Value to set for the originalEndTimeZone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOriginalEndTimeZone(@javax.annotation.Nullable final String value) {
        this.originalEndTimeZone = value;
    }
    /**
     * Sets the originalStart property value. The originalStart property
     * @param value Value to set for the originalStart property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOriginalStart(@javax.annotation.Nullable final OffsetDateTime value) {
        this.originalStart = value;
    }
    /**
     * Sets the originalStartTimeZone property value. The originalStartTimeZone property
     * @param value Value to set for the originalStartTimeZone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOriginalStartTimeZone(@javax.annotation.Nullable final String value) {
        this.originalStartTimeZone = value;
    }
    /**
     * Sets the recurrence property value. The recurrence property
     * @param value Value to set for the recurrence property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecurrence(@javax.annotation.Nullable final PatternedRecurrence value) {
        this.recurrence = value;
    }
    /**
     * Sets the reminderMinutesBeforeStart property value. The reminderMinutesBeforeStart property
     * @param value Value to set for the reminderMinutesBeforeStart property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReminderMinutesBeforeStart(@javax.annotation.Nullable final Integer value) {
        this.reminderMinutesBeforeStart = value;
    }
    /**
     * Sets the responseRequested property value. The responseRequested property
     * @param value Value to set for the responseRequested property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResponseRequested(@javax.annotation.Nullable final Boolean value) {
        this.responseRequested = value;
    }
    /**
     * Sets the responseStatus property value. The responseStatus property
     * @param value Value to set for the responseStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResponseStatus(@javax.annotation.Nullable final ResponseStatus value) {
        this.responseStatus = value;
    }
    /**
     * Sets the sensitivity property value. The sensitivity property
     * @param value Value to set for the sensitivity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSensitivity(@javax.annotation.Nullable final Sensitivity value) {
        this.sensitivity = value;
    }
    /**
     * Sets the seriesMasterId property value. The seriesMasterId property
     * @param value Value to set for the seriesMasterId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSeriesMasterId(@javax.annotation.Nullable final String value) {
        this.seriesMasterId = value;
    }
    /**
     * Sets the showAs property value. The showAs property
     * @param value Value to set for the showAs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowAs(@javax.annotation.Nullable final FreeBusyStatus value) {
        this.showAs = value;
    }
    /**
     * Sets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the event. Read-only. Nullable.
     * @param value Value to set for the singleValueExtendedProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSingleValueExtendedProperties(@javax.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this.singleValueExtendedProperties = value;
    }
    /**
     * Sets the start property value. The start property
     * @param value Value to set for the start property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStart(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this.start = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubject(@javax.annotation.Nullable final String value) {
        this.subject = value;
    }
    /**
     * Sets the transactionId property value. The transactionId property
     * @param value Value to set for the transactionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTransactionId(@javax.annotation.Nullable final String value) {
        this.transactionId = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final EventType value) {
        this.type = value;
    }
    /**
     * Sets the webLink property value. The webLink property
     * @param value Value to set for the webLink property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebLink(@javax.annotation.Nullable final String value) {
        this.webLink = value;
    }
}
