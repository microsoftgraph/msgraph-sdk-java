package microsoft.graph.users.item.authentication.microsoftauthenticatormethods.item.device.transitivememberof.item.user.findmeetingtimes;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.AttendeeBase;
import microsoft.graph.models.LocationConstraint;
import microsoft.graph.models.TimeConstraint;
/** Provides operations to call the findMeetingTimes method. */
public class FindMeetingTimesPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The attendees property */
    private java.util.List<AttendeeBase> _attendees;
    /** The isOrganizerOptional property */
    private Boolean _isOrganizerOptional;
    /** The locationConstraint property */
    private LocationConstraint _locationConstraint;
    /** The maxCandidates property */
    private Integer _maxCandidates;
    /** The meetingDuration property */
    private Period _meetingDuration;
    /** The minimumAttendeePercentage property */
    private Double _minimumAttendeePercentage;
    /** The returnSuggestionReasons property */
    private Boolean _returnSuggestionReasons;
    /** The timeConstraint property */
    private TimeConstraint _timeConstraint;
    /**
     * Instantiates a new findMeetingTimesPostRequestBody and sets the default values.
     * @return a void
     */
    public FindMeetingTimesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a findMeetingTimesPostRequestBody
     */
    @javax.annotation.Nonnull
    public static FindMeetingTimesPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FindMeetingTimesPostRequestBody();
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
     * Gets the attendees property value. The attendees property
     * @return a attendeeBase
     */
    @javax.annotation.Nullable
    public java.util.List<AttendeeBase> getAttendees() {
        return this._attendees;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final FindMeetingTimesPostRequestBody currentObject = this;
        return new HashMap<>(8) {{
            this.put("attendees", (n) -> { currentObject.setAttendees(n.getCollectionOfObjectValues(AttendeeBase::createFromDiscriminatorValue)); });
            this.put("isOrganizerOptional", (n) -> { currentObject.setIsOrganizerOptional(n.getBooleanValue()); });
            this.put("locationConstraint", (n) -> { currentObject.setLocationConstraint(n.getObjectValue(LocationConstraint::createFromDiscriminatorValue)); });
            this.put("maxCandidates", (n) -> { currentObject.setMaxCandidates(n.getIntegerValue()); });
            this.put("meetingDuration", (n) -> { currentObject.setMeetingDuration(n.getPeriodValue()); });
            this.put("minimumAttendeePercentage", (n) -> { currentObject.setMinimumAttendeePercentage(n.getDoubleValue()); });
            this.put("returnSuggestionReasons", (n) -> { currentObject.setReturnSuggestionReasons(n.getBooleanValue()); });
            this.put("timeConstraint", (n) -> { currentObject.setTimeConstraint(n.getObjectValue(TimeConstraint::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isOrganizerOptional property value. The isOrganizerOptional property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsOrganizerOptional() {
        return this._isOrganizerOptional;
    }
    /**
     * Gets the locationConstraint property value. The locationConstraint property
     * @return a locationConstraint
     */
    @javax.annotation.Nullable
    public LocationConstraint getLocationConstraint() {
        return this._locationConstraint;
    }
    /**
     * Gets the maxCandidates property value. The maxCandidates property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxCandidates() {
        return this._maxCandidates;
    }
    /**
     * Gets the meetingDuration property value. The meetingDuration property
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getMeetingDuration() {
        return this._meetingDuration;
    }
    /**
     * Gets the minimumAttendeePercentage property value. The minimumAttendeePercentage property
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getMinimumAttendeePercentage() {
        return this._minimumAttendeePercentage;
    }
    /**
     * Gets the returnSuggestionReasons property value. The returnSuggestionReasons property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getReturnSuggestionReasons() {
        return this._returnSuggestionReasons;
    }
    /**
     * Gets the timeConstraint property value. The timeConstraint property
     * @return a timeConstraint
     */
    @javax.annotation.Nullable
    public TimeConstraint getTimeConstraint() {
        return this._timeConstraint;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("attendees", this.getAttendees());
        writer.writeBooleanValue("isOrganizerOptional", this.getIsOrganizerOptional());
        writer.writeObjectValue("locationConstraint", this.getLocationConstraint());
        writer.writeIntegerValue("maxCandidates", this.getMaxCandidates());
        writer.writePeriodValue("meetingDuration", this.getMeetingDuration());
        writer.writeDoubleValue("minimumAttendeePercentage", this.getMinimumAttendeePercentage());
        writer.writeBooleanValue("returnSuggestionReasons", this.getReturnSuggestionReasons());
        writer.writeObjectValue("timeConstraint", this.getTimeConstraint());
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
     * Sets the attendees property value. The attendees property
     * @param value Value to set for the attendees property.
     * @return a void
     */
    public void setAttendees(@javax.annotation.Nullable final java.util.List<AttendeeBase> value) {
        this._attendees = value;
    }
    /**
     * Sets the isOrganizerOptional property value. The isOrganizerOptional property
     * @param value Value to set for the isOrganizerOptional property.
     * @return a void
     */
    public void setIsOrganizerOptional(@javax.annotation.Nullable final Boolean value) {
        this._isOrganizerOptional = value;
    }
    /**
     * Sets the locationConstraint property value. The locationConstraint property
     * @param value Value to set for the locationConstraint property.
     * @return a void
     */
    public void setLocationConstraint(@javax.annotation.Nullable final LocationConstraint value) {
        this._locationConstraint = value;
    }
    /**
     * Sets the maxCandidates property value. The maxCandidates property
     * @param value Value to set for the maxCandidates property.
     * @return a void
     */
    public void setMaxCandidates(@javax.annotation.Nullable final Integer value) {
        this._maxCandidates = value;
    }
    /**
     * Sets the meetingDuration property value. The meetingDuration property
     * @param value Value to set for the meetingDuration property.
     * @return a void
     */
    public void setMeetingDuration(@javax.annotation.Nullable final Period value) {
        this._meetingDuration = value;
    }
    /**
     * Sets the minimumAttendeePercentage property value. The minimumAttendeePercentage property
     * @param value Value to set for the minimumAttendeePercentage property.
     * @return a void
     */
    public void setMinimumAttendeePercentage(@javax.annotation.Nullable final Double value) {
        this._minimumAttendeePercentage = value;
    }
    /**
     * Sets the returnSuggestionReasons property value. The returnSuggestionReasons property
     * @param value Value to set for the returnSuggestionReasons property.
     * @return a void
     */
    public void setReturnSuggestionReasons(@javax.annotation.Nullable final Boolean value) {
        this._returnSuggestionReasons = value;
    }
    /**
     * Sets the timeConstraint property value. The timeConstraint property
     * @param value Value to set for the timeConstraint property.
     * @return a void
     */
    public void setTimeConstraint(@javax.annotation.Nullable final TimeConstraint value) {
        this._timeConstraint = value;
    }
}
