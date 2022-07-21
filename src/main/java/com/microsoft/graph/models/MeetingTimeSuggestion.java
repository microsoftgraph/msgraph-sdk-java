package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MeetingTimeSuggestion implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** An array that shows the availability status of each attendee for this meeting suggestion. */
    private java.util.List<AttendeeAvailability> _attendeeAvailability;
    /** A percentage that represents the likelhood of all the attendees attending. */
    private Double _confidence;
    /** An array that specifies the name and geographic location of each meeting location for this meeting suggestion. */
    private java.util.List<Location> _locations;
    /** A time period suggested for the meeting. */
    private TimeSlot _meetingTimeSlot;
    /** The OdataType property */
    private String _odataType;
    /** Order of meeting time suggestions sorted by their computed confidence value from high to low, then by chronology if there are suggestions with the same confidence. */
    private Integer _order;
    /** Availability of the meeting organizer for this meeting suggestion. Possible values are: free, tentative, busy, oof, workingElsewhere, unknown. */
    private FreeBusyStatus _organizerAvailability;
    /** Reason for suggesting the meeting time. */
    private String _suggestionReason;
    /**
     * Instantiates a new meetingTimeSuggestion and sets the default values.
     * @return a void
     */
    public MeetingTimeSuggestion() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.meetingTimeSuggestion");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a meetingTimeSuggestion
     */
    @javax.annotation.Nonnull
    public static MeetingTimeSuggestion createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingTimeSuggestion();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the attendeeAvailability property value. An array that shows the availability status of each attendee for this meeting suggestion.
     * @return a attendeeAvailability
     */
    @javax.annotation.Nullable
    public java.util.List<AttendeeAvailability> getAttendeeAvailability() {
        return this._attendeeAvailability;
    }
    /**
     * Gets the confidence property value. A percentage that represents the likelhood of all the attendees attending.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getConfidence() {
        return this._confidence;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MeetingTimeSuggestion currentObject = this;
        return new HashMap<>(8) {{
            this.put("attendeeAvailability", (n) -> { currentObject.setAttendeeAvailability(n.getCollectionOfObjectValues(AttendeeAvailability::createFromDiscriminatorValue)); });
            this.put("confidence", (n) -> { currentObject.setConfidence(n.getDoubleValue()); });
            this.put("locations", (n) -> { currentObject.setLocations(n.getCollectionOfObjectValues(Location::createFromDiscriminatorValue)); });
            this.put("meetingTimeSlot", (n) -> { currentObject.setMeetingTimeSlot(n.getObjectValue(TimeSlot::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("order", (n) -> { currentObject.setOrder(n.getIntegerValue()); });
            this.put("organizerAvailability", (n) -> { currentObject.setOrganizerAvailability(n.getEnumValue(FreeBusyStatus.class)); });
            this.put("suggestionReason", (n) -> { currentObject.setSuggestionReason(n.getStringValue()); });
        }};
    }
    /**
     * Gets the locations property value. An array that specifies the name and geographic location of each meeting location for this meeting suggestion.
     * @return a location
     */
    @javax.annotation.Nullable
    public java.util.List<Location> getLocations() {
        return this._locations;
    }
    /**
     * Gets the meetingTimeSlot property value. A time period suggested for the meeting.
     * @return a timeSlot
     */
    @javax.annotation.Nullable
    public TimeSlot getMeetingTimeSlot() {
        return this._meetingTimeSlot;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the order property value. Order of meeting time suggestions sorted by their computed confidence value from high to low, then by chronology if there are suggestions with the same confidence.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getOrder() {
        return this._order;
    }
    /**
     * Gets the organizerAvailability property value. Availability of the meeting organizer for this meeting suggestion. Possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
     * @return a freeBusyStatus
     */
    @javax.annotation.Nullable
    public FreeBusyStatus getOrganizerAvailability() {
        return this._organizerAvailability;
    }
    /**
     * Gets the suggestionReason property value. Reason for suggesting the meeting time.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSuggestionReason() {
        return this._suggestionReason;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("attendeeAvailability", this.getAttendeeAvailability());
        writer.writeDoubleValue("confidence", this.getConfidence());
        writer.writeCollectionOfObjectValues("locations", this.getLocations());
        writer.writeObjectValue("meetingTimeSlot", this.getMeetingTimeSlot());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("order", this.getOrder());
        writer.writeEnumValue("organizerAvailability", this.getOrganizerAvailability());
        writer.writeStringValue("suggestionReason", this.getSuggestionReason());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the attendeeAvailability property value. An array that shows the availability status of each attendee for this meeting suggestion.
     * @param value Value to set for the attendeeAvailability property.
     * @return a void
     */
    public void setAttendeeAvailability(@javax.annotation.Nullable final java.util.List<AttendeeAvailability> value) {
        this._attendeeAvailability = value;
    }
    /**
     * Sets the confidence property value. A percentage that represents the likelhood of all the attendees attending.
     * @param value Value to set for the confidence property.
     * @return a void
     */
    public void setConfidence(@javax.annotation.Nullable final Double value) {
        this._confidence = value;
    }
    /**
     * Sets the locations property value. An array that specifies the name and geographic location of each meeting location for this meeting suggestion.
     * @param value Value to set for the locations property.
     * @return a void
     */
    public void setLocations(@javax.annotation.Nullable final java.util.List<Location> value) {
        this._locations = value;
    }
    /**
     * Sets the meetingTimeSlot property value. A time period suggested for the meeting.
     * @param value Value to set for the meetingTimeSlot property.
     * @return a void
     */
    public void setMeetingTimeSlot(@javax.annotation.Nullable final TimeSlot value) {
        this._meetingTimeSlot = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the order property value. Order of meeting time suggestions sorted by their computed confidence value from high to low, then by chronology if there are suggestions with the same confidence.
     * @param value Value to set for the order property.
     * @return a void
     */
    public void setOrder(@javax.annotation.Nullable final Integer value) {
        this._order = value;
    }
    /**
     * Sets the organizerAvailability property value. Availability of the meeting organizer for this meeting suggestion. Possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
     * @param value Value to set for the organizerAvailability property.
     * @return a void
     */
    public void setOrganizerAvailability(@javax.annotation.Nullable final FreeBusyStatus value) {
        this._organizerAvailability = value;
    }
    /**
     * Sets the suggestionReason property value. Reason for suggesting the meeting time.
     * @param value Value to set for the suggestionReason property.
     * @return a void
     */
    public void setSuggestionReason(@javax.annotation.Nullable final String value) {
        this._suggestionReason = value;
    }
}
