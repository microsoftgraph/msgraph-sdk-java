package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Event extends OutlookItem implements Parsable {
    /** true if the meeting organizer allows invitees to propose a new time when responding; otherwise, false. Optional. Default is true. */
    private Boolean _allowNewTimeProposals;
    /** The collection of FileAttachment, ItemAttachment, and referenceAttachment attachments for the event. Navigation property. Read-only. Nullable. */
    private java.util.List<Attachment> _attachments;
    /** The collection of attendees for the event. */
    private java.util.List<Attendee> _attendees;
    /** The body of the message associated with the event. It can be in HTML or text format. */
    private ItemBody _body;
    /** The preview of the message associated with the event. It is in text format. */
    private String _bodyPreview;
    /** The calendar that contains the event. Navigation property. Read-only. */
    private Calendar _calendar;
    /** The date, time, and time zone that the event ends. By default, the end time is in UTC. */
    private DateTimeTimeZone _end;
    /** The collection of open extensions defined for the event. Nullable. */
    private java.util.List<Extension> _extensions;
    /** Set to true if the event has attachments. */
    private Boolean _hasAttachments;
    /** When set to true, each attendee only sees themselves in the meeting request and meeting Tracking list. Default is false. */
    private Boolean _hideAttendees;
    /** A unique identifier for an event across calendars. This ID is different for each occurrence in a recurring series. Read-only. */
    private String _iCalUId;
    /** The importance property */
    private Importance _importance;
    /** The occurrences of a recurring series, if the event is a series master. This property includes occurrences that are part of the recurrence pattern, and exceptions that have been modified, but does not include occurrences that have been cancelled from the series. Navigation property. Read-only. Nullable. */
    private java.util.List<Event> _instances;
    /** The isAllDay property */
    private Boolean _isAllDay;
    /** The isCancelled property */
    private Boolean _isCancelled;
    /** The isDraft property */
    private Boolean _isDraft;
    /** The isOnlineMeeting property */
    private Boolean _isOnlineMeeting;
    /** The isOrganizer property */
    private Boolean _isOrganizer;
    /** The isReminderOn property */
    private Boolean _isReminderOn;
    /** The location property */
    private Location _location;
    /** The locations property */
    private java.util.List<Location> _locations;
    /** The collection of multi-value extended properties defined for the event. Read-only. Nullable. */
    private java.util.List<MultiValueLegacyExtendedProperty> _multiValueExtendedProperties;
    /** The onlineMeeting property */
    private OnlineMeetingInfo _onlineMeeting;
    /** The onlineMeetingProvider property */
    private OnlineMeetingProviderType _onlineMeetingProvider;
    /** The onlineMeetingUrl property */
    private String _onlineMeetingUrl;
    /** The organizer property */
    private Recipient _organizer;
    /** The originalEndTimeZone property */
    private String _originalEndTimeZone;
    /** The originalStart property */
    private OffsetDateTime _originalStart;
    /** The originalStartTimeZone property */
    private String _originalStartTimeZone;
    /** The recurrence property */
    private PatternedRecurrence _recurrence;
    /** The reminderMinutesBeforeStart property */
    private Integer _reminderMinutesBeforeStart;
    /** The responseRequested property */
    private Boolean _responseRequested;
    /** The responseStatus property */
    private ResponseStatus _responseStatus;
    /** The sensitivity property */
    private Sensitivity _sensitivity;
    /** The seriesMasterId property */
    private String _seriesMasterId;
    /** The showAs property */
    private FreeBusyStatus _showAs;
    /** The collection of single-value extended properties defined for the event. Read-only. Nullable. */
    private java.util.List<SingleValueLegacyExtendedProperty> _singleValueExtendedProperties;
    /** The start property */
    private DateTimeTimeZone _start;
    /** The subject property */
    private String _subject;
    /** The transactionId property */
    private String _transactionId;
    /** The type property */
    private EventType _type;
    /** The webLink property */
    private String _webLink;
    /**
     * Instantiates a new Event and sets the default values.
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
     * @return a Event
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
        return this._allowNewTimeProposals;
    }
    /**
     * Gets the attachments property value. The collection of FileAttachment, ItemAttachment, and referenceAttachment attachments for the event. Navigation property. Read-only. Nullable.
     * @return a attachment
     */
    @javax.annotation.Nullable
    public java.util.List<Attachment> getAttachments() {
        return this._attachments;
    }
    /**
     * Gets the attendees property value. The collection of attendees for the event.
     * @return a attendee
     */
    @javax.annotation.Nullable
    public java.util.List<Attendee> getAttendees() {
        return this._attendees;
    }
    /**
     * Gets the body property value. The body of the message associated with the event. It can be in HTML or text format.
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getBody() {
        return this._body;
    }
    /**
     * Gets the bodyPreview property value. The preview of the message associated with the event. It is in text format.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBodyPreview() {
        return this._bodyPreview;
    }
    /**
     * Gets the calendar property value. The calendar that contains the event. Navigation property. Read-only.
     * @return a calendar
     */
    @javax.annotation.Nullable
    public Calendar getCalendar() {
        return this._calendar;
    }
    /**
     * Gets the end property value. The date, time, and time zone that the event ends. By default, the end time is in UTC.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getEnd() {
        return this._end;
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the event. Nullable.
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
        final Event currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("allowNewTimeProposals", (n) -> { currentObject.setAllowNewTimeProposals(n.getBooleanValue()); });
            this.put("attachments", (n) -> { currentObject.setAttachments(n.getCollectionOfObjectValues(Attachment::createFromDiscriminatorValue)); });
            this.put("attendees", (n) -> { currentObject.setAttendees(n.getCollectionOfObjectValues(Attendee::createFromDiscriminatorValue)); });
            this.put("body", (n) -> { currentObject.setBody(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
            this.put("bodyPreview", (n) -> { currentObject.setBodyPreview(n.getStringValue()); });
            this.put("calendar", (n) -> { currentObject.setCalendar(n.getObjectValue(Calendar::createFromDiscriminatorValue)); });
            this.put("end", (n) -> { currentObject.setEnd(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
            this.put("extensions", (n) -> { currentObject.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
            this.put("hasAttachments", (n) -> { currentObject.setHasAttachments(n.getBooleanValue()); });
            this.put("hideAttendees", (n) -> { currentObject.setHideAttendees(n.getBooleanValue()); });
            this.put("iCalUId", (n) -> { currentObject.setICalUId(n.getStringValue()); });
            this.put("importance", (n) -> { currentObject.setImportance(n.getEnumValue(Importance.class)); });
            this.put("instances", (n) -> { currentObject.setInstances(n.getCollectionOfObjectValues(Event::createFromDiscriminatorValue)); });
            this.put("isAllDay", (n) -> { currentObject.setIsAllDay(n.getBooleanValue()); });
            this.put("isCancelled", (n) -> { currentObject.setIsCancelled(n.getBooleanValue()); });
            this.put("isDraft", (n) -> { currentObject.setIsDraft(n.getBooleanValue()); });
            this.put("isOnlineMeeting", (n) -> { currentObject.setIsOnlineMeeting(n.getBooleanValue()); });
            this.put("isOrganizer", (n) -> { currentObject.setIsOrganizer(n.getBooleanValue()); });
            this.put("isReminderOn", (n) -> { currentObject.setIsReminderOn(n.getBooleanValue()); });
            this.put("location", (n) -> { currentObject.setLocation(n.getObjectValue(Location::createFromDiscriminatorValue)); });
            this.put("locations", (n) -> { currentObject.setLocations(n.getCollectionOfObjectValues(Location::createFromDiscriminatorValue)); });
            this.put("multiValueExtendedProperties", (n) -> { currentObject.setMultiValueExtendedProperties(n.getCollectionOfObjectValues(MultiValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
            this.put("onlineMeeting", (n) -> { currentObject.setOnlineMeeting(n.getObjectValue(OnlineMeetingInfo::createFromDiscriminatorValue)); });
            this.put("onlineMeetingProvider", (n) -> { currentObject.setOnlineMeetingProvider(n.getEnumValue(OnlineMeetingProviderType.class)); });
            this.put("onlineMeetingUrl", (n) -> { currentObject.setOnlineMeetingUrl(n.getStringValue()); });
            this.put("organizer", (n) -> { currentObject.setOrganizer(n.getObjectValue(Recipient::createFromDiscriminatorValue)); });
            this.put("originalEndTimeZone", (n) -> { currentObject.setOriginalEndTimeZone(n.getStringValue()); });
            this.put("originalStart", (n) -> { currentObject.setOriginalStart(n.getOffsetDateTimeValue()); });
            this.put("originalStartTimeZone", (n) -> { currentObject.setOriginalStartTimeZone(n.getStringValue()); });
            this.put("recurrence", (n) -> { currentObject.setRecurrence(n.getObjectValue(PatternedRecurrence::createFromDiscriminatorValue)); });
            this.put("reminderMinutesBeforeStart", (n) -> { currentObject.setReminderMinutesBeforeStart(n.getIntegerValue()); });
            this.put("responseRequested", (n) -> { currentObject.setResponseRequested(n.getBooleanValue()); });
            this.put("responseStatus", (n) -> { currentObject.setResponseStatus(n.getObjectValue(ResponseStatus::createFromDiscriminatorValue)); });
            this.put("sensitivity", (n) -> { currentObject.setSensitivity(n.getEnumValue(Sensitivity.class)); });
            this.put("seriesMasterId", (n) -> { currentObject.setSeriesMasterId(n.getStringValue()); });
            this.put("showAs", (n) -> { currentObject.setShowAs(n.getEnumValue(FreeBusyStatus.class)); });
            this.put("singleValueExtendedProperties", (n) -> { currentObject.setSingleValueExtendedProperties(n.getCollectionOfObjectValues(SingleValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
            this.put("start", (n) -> { currentObject.setStart(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
            this.put("subject", (n) -> { currentObject.setSubject(n.getStringValue()); });
            this.put("transactionId", (n) -> { currentObject.setTransactionId(n.getStringValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getEnumValue(EventType.class)); });
            this.put("webLink", (n) -> { currentObject.setWebLink(n.getStringValue()); });
        }};
    }
    /**
     * Gets the hasAttachments property value. Set to true if the event has attachments.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasAttachments() {
        return this._hasAttachments;
    }
    /**
     * Gets the hideAttendees property value. When set to true, each attendee only sees themselves in the meeting request and meeting Tracking list. Default is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHideAttendees() {
        return this._hideAttendees;
    }
    /**
     * Gets the iCalUId property value. A unique identifier for an event across calendars. This ID is different for each occurrence in a recurring series. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getICalUId() {
        return this._iCalUId;
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
     * Gets the instances property value. The occurrences of a recurring series, if the event is a series master. This property includes occurrences that are part of the recurrence pattern, and exceptions that have been modified, but does not include occurrences that have been cancelled from the series. Navigation property. Read-only. Nullable.
     * @return a event
     */
    @javax.annotation.Nullable
    public java.util.List<Event> getInstances() {
        return this._instances;
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
     * Gets the isCancelled property value. The isCancelled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCancelled() {
        return this._isCancelled;
    }
    /**
     * Gets the isDraft property value. The isDraft property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDraft() {
        return this._isDraft;
    }
    /**
     * Gets the isOnlineMeeting property value. The isOnlineMeeting property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsOnlineMeeting() {
        return this._isOnlineMeeting;
    }
    /**
     * Gets the isOrganizer property value. The isOrganizer property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsOrganizer() {
        return this._isOrganizer;
    }
    /**
     * Gets the isReminderOn property value. The isReminderOn property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsReminderOn() {
        return this._isReminderOn;
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
     * Gets the locations property value. The locations property
     * @return a location
     */
    @javax.annotation.Nullable
    public java.util.List<Location> getLocations() {
        return this._locations;
    }
    /**
     * Gets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the event. Read-only. Nullable.
     * @return a multiValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this._multiValueExtendedProperties;
    }
    /**
     * Gets the onlineMeeting property value. The onlineMeeting property
     * @return a onlineMeetingInfo
     */
    @javax.annotation.Nullable
    public OnlineMeetingInfo getOnlineMeeting() {
        return this._onlineMeeting;
    }
    /**
     * Gets the onlineMeetingProvider property value. The onlineMeetingProvider property
     * @return a onlineMeetingProviderType
     */
    @javax.annotation.Nullable
    public OnlineMeetingProviderType getOnlineMeetingProvider() {
        return this._onlineMeetingProvider;
    }
    /**
     * Gets the onlineMeetingUrl property value. The onlineMeetingUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnlineMeetingUrl() {
        return this._onlineMeetingUrl;
    }
    /**
     * Gets the organizer property value. The organizer property
     * @return a recipient
     */
    @javax.annotation.Nullable
    public Recipient getOrganizer() {
        return this._organizer;
    }
    /**
     * Gets the originalEndTimeZone property value. The originalEndTimeZone property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOriginalEndTimeZone() {
        return this._originalEndTimeZone;
    }
    /**
     * Gets the originalStart property value. The originalStart property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getOriginalStart() {
        return this._originalStart;
    }
    /**
     * Gets the originalStartTimeZone property value. The originalStartTimeZone property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOriginalStartTimeZone() {
        return this._originalStartTimeZone;
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
     * Gets the reminderMinutesBeforeStart property value. The reminderMinutesBeforeStart property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getReminderMinutesBeforeStart() {
        return this._reminderMinutesBeforeStart;
    }
    /**
     * Gets the responseRequested property value. The responseRequested property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getResponseRequested() {
        return this._responseRequested;
    }
    /**
     * Gets the responseStatus property value. The responseStatus property
     * @return a responseStatus
     */
    @javax.annotation.Nullable
    public ResponseStatus getResponseStatus() {
        return this._responseStatus;
    }
    /**
     * Gets the sensitivity property value. The sensitivity property
     * @return a sensitivity
     */
    @javax.annotation.Nullable
    public Sensitivity getSensitivity() {
        return this._sensitivity;
    }
    /**
     * Gets the seriesMasterId property value. The seriesMasterId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSeriesMasterId() {
        return this._seriesMasterId;
    }
    /**
     * Gets the showAs property value. The showAs property
     * @return a freeBusyStatus
     */
    @javax.annotation.Nullable
    public FreeBusyStatus getShowAs() {
        return this._showAs;
    }
    /**
     * Gets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the event. Read-only. Nullable.
     * @return a singleValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this._singleValueExtendedProperties;
    }
    /**
     * Gets the start property value. The start property
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getStart() {
        return this._start;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this._subject;
    }
    /**
     * Gets the transactionId property value. The transactionId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTransactionId() {
        return this._transactionId;
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
     * Gets the webLink property value. The webLink property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebLink() {
        return this._webLink;
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
        this._allowNewTimeProposals = value;
    }
    /**
     * Sets the attachments property value. The collection of FileAttachment, ItemAttachment, and referenceAttachment attachments for the event. Navigation property. Read-only. Nullable.
     * @param value Value to set for the attachments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttachments(@javax.annotation.Nullable final java.util.List<Attachment> value) {
        this._attachments = value;
    }
    /**
     * Sets the attendees property value. The collection of attendees for the event.
     * @param value Value to set for the attendees property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttendees(@javax.annotation.Nullable final java.util.List<Attendee> value) {
        this._attendees = value;
    }
    /**
     * Sets the body property value. The body of the message associated with the event. It can be in HTML or text format.
     * @param value Value to set for the body property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBody(@javax.annotation.Nullable final ItemBody value) {
        this._body = value;
    }
    /**
     * Sets the bodyPreview property value. The preview of the message associated with the event. It is in text format.
     * @param value Value to set for the bodyPreview property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBodyPreview(@javax.annotation.Nullable final String value) {
        this._bodyPreview = value;
    }
    /**
     * Sets the calendar property value. The calendar that contains the event. Navigation property. Read-only.
     * @param value Value to set for the calendar property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCalendar(@javax.annotation.Nullable final Calendar value) {
        this._calendar = value;
    }
    /**
     * Sets the end property value. The date, time, and time zone that the event ends. By default, the end time is in UTC.
     * @param value Value to set for the end property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnd(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._end = value;
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the event. Nullable.
     * @param value Value to set for the extensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtensions(@javax.annotation.Nullable final java.util.List<Extension> value) {
        this._extensions = value;
    }
    /**
     * Sets the hasAttachments property value. Set to true if the event has attachments.
     * @param value Value to set for the hasAttachments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHasAttachments(@javax.annotation.Nullable final Boolean value) {
        this._hasAttachments = value;
    }
    /**
     * Sets the hideAttendees property value. When set to true, each attendee only sees themselves in the meeting request and meeting Tracking list. Default is false.
     * @param value Value to set for the hideAttendees property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHideAttendees(@javax.annotation.Nullable final Boolean value) {
        this._hideAttendees = value;
    }
    /**
     * Sets the iCalUId property value. A unique identifier for an event across calendars. This ID is different for each occurrence in a recurring series. Read-only.
     * @param value Value to set for the iCalUId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICalUId(@javax.annotation.Nullable final String value) {
        this._iCalUId = value;
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
     * Sets the instances property value. The occurrences of a recurring series, if the event is a series master. This property includes occurrences that are part of the recurrence pattern, and exceptions that have been modified, but does not include occurrences that have been cancelled from the series. Navigation property. Read-only. Nullable.
     * @param value Value to set for the instances property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstances(@javax.annotation.Nullable final java.util.List<Event> value) {
        this._instances = value;
    }
    /**
     * Sets the isAllDay property value. The isAllDay property
     * @param value Value to set for the isAllDay property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAllDay(@javax.annotation.Nullable final Boolean value) {
        this._isAllDay = value;
    }
    /**
     * Sets the isCancelled property value. The isCancelled property
     * @param value Value to set for the isCancelled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsCancelled(@javax.annotation.Nullable final Boolean value) {
        this._isCancelled = value;
    }
    /**
     * Sets the isDraft property value. The isDraft property
     * @param value Value to set for the isDraft property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDraft(@javax.annotation.Nullable final Boolean value) {
        this._isDraft = value;
    }
    /**
     * Sets the isOnlineMeeting property value. The isOnlineMeeting property
     * @param value Value to set for the isOnlineMeeting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsOnlineMeeting(@javax.annotation.Nullable final Boolean value) {
        this._isOnlineMeeting = value;
    }
    /**
     * Sets the isOrganizer property value. The isOrganizer property
     * @param value Value to set for the isOrganizer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsOrganizer(@javax.annotation.Nullable final Boolean value) {
        this._isOrganizer = value;
    }
    /**
     * Sets the isReminderOn property value. The isReminderOn property
     * @param value Value to set for the isReminderOn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsReminderOn(@javax.annotation.Nullable final Boolean value) {
        this._isReminderOn = value;
    }
    /**
     * Sets the location property value. The location property
     * @param value Value to set for the location property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocation(@javax.annotation.Nullable final Location value) {
        this._location = value;
    }
    /**
     * Sets the locations property value. The locations property
     * @param value Value to set for the locations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocations(@javax.annotation.Nullable final java.util.List<Location> value) {
        this._locations = value;
    }
    /**
     * Sets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the event. Read-only. Nullable.
     * @param value Value to set for the multiValueExtendedProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMultiValueExtendedProperties(@javax.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this._multiValueExtendedProperties = value;
    }
    /**
     * Sets the onlineMeeting property value. The onlineMeeting property
     * @param value Value to set for the onlineMeeting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnlineMeeting(@javax.annotation.Nullable final OnlineMeetingInfo value) {
        this._onlineMeeting = value;
    }
    /**
     * Sets the onlineMeetingProvider property value. The onlineMeetingProvider property
     * @param value Value to set for the onlineMeetingProvider property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnlineMeetingProvider(@javax.annotation.Nullable final OnlineMeetingProviderType value) {
        this._onlineMeetingProvider = value;
    }
    /**
     * Sets the onlineMeetingUrl property value. The onlineMeetingUrl property
     * @param value Value to set for the onlineMeetingUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnlineMeetingUrl(@javax.annotation.Nullable final String value) {
        this._onlineMeetingUrl = value;
    }
    /**
     * Sets the organizer property value. The organizer property
     * @param value Value to set for the organizer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizer(@javax.annotation.Nullable final Recipient value) {
        this._organizer = value;
    }
    /**
     * Sets the originalEndTimeZone property value. The originalEndTimeZone property
     * @param value Value to set for the originalEndTimeZone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOriginalEndTimeZone(@javax.annotation.Nullable final String value) {
        this._originalEndTimeZone = value;
    }
    /**
     * Sets the originalStart property value. The originalStart property
     * @param value Value to set for the originalStart property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOriginalStart(@javax.annotation.Nullable final OffsetDateTime value) {
        this._originalStart = value;
    }
    /**
     * Sets the originalStartTimeZone property value. The originalStartTimeZone property
     * @param value Value to set for the originalStartTimeZone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOriginalStartTimeZone(@javax.annotation.Nullable final String value) {
        this._originalStartTimeZone = value;
    }
    /**
     * Sets the recurrence property value. The recurrence property
     * @param value Value to set for the recurrence property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecurrence(@javax.annotation.Nullable final PatternedRecurrence value) {
        this._recurrence = value;
    }
    /**
     * Sets the reminderMinutesBeforeStart property value. The reminderMinutesBeforeStart property
     * @param value Value to set for the reminderMinutesBeforeStart property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReminderMinutesBeforeStart(@javax.annotation.Nullable final Integer value) {
        this._reminderMinutesBeforeStart = value;
    }
    /**
     * Sets the responseRequested property value. The responseRequested property
     * @param value Value to set for the responseRequested property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResponseRequested(@javax.annotation.Nullable final Boolean value) {
        this._responseRequested = value;
    }
    /**
     * Sets the responseStatus property value. The responseStatus property
     * @param value Value to set for the responseStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResponseStatus(@javax.annotation.Nullable final ResponseStatus value) {
        this._responseStatus = value;
    }
    /**
     * Sets the sensitivity property value. The sensitivity property
     * @param value Value to set for the sensitivity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSensitivity(@javax.annotation.Nullable final Sensitivity value) {
        this._sensitivity = value;
    }
    /**
     * Sets the seriesMasterId property value. The seriesMasterId property
     * @param value Value to set for the seriesMasterId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSeriesMasterId(@javax.annotation.Nullable final String value) {
        this._seriesMasterId = value;
    }
    /**
     * Sets the showAs property value. The showAs property
     * @param value Value to set for the showAs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowAs(@javax.annotation.Nullable final FreeBusyStatus value) {
        this._showAs = value;
    }
    /**
     * Sets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the event. Read-only. Nullable.
     * @param value Value to set for the singleValueExtendedProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSingleValueExtendedProperties(@javax.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this._singleValueExtendedProperties = value;
    }
    /**
     * Sets the start property value. The start property
     * @param value Value to set for the start property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStart(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._start = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubject(@javax.annotation.Nullable final String value) {
        this._subject = value;
    }
    /**
     * Sets the transactionId property value. The transactionId property
     * @param value Value to set for the transactionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTransactionId(@javax.annotation.Nullable final String value) {
        this._transactionId = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final EventType value) {
        this._type = value;
    }
    /**
     * Sets the webLink property value. The webLink property
     * @param value Value to set for the webLink property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebLink(@javax.annotation.Nullable final String value) {
        this._webLink = value;
    }
}
