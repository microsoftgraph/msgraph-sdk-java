package com.microsoft.graph.users.item.findmeetingtimes;

import com.microsoft.graph.models.AttendeeBase;
import com.microsoft.graph.models.LocationConstraint;
import com.microsoft.graph.models.TimeConstraint;
import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FindMeetingTimesPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The attendees property
     */
    private java.util.List<AttendeeBase> attendees;
    /**
     * The isOrganizerOptional property
     */
    private Boolean isOrganizerOptional;
    /**
     * The locationConstraint property
     */
    private LocationConstraint locationConstraint;
    /**
     * The maxCandidates property
     */
    private Integer maxCandidates;
    /**
     * The meetingDuration property
     */
    private PeriodAndDuration meetingDuration;
    /**
     * The minimumAttendeePercentage property
     */
    private Double minimumAttendeePercentage;
    /**
     * The returnSuggestionReasons property
     */
    private Boolean returnSuggestionReasons;
    /**
     * The timeConstraint property
     */
    private TimeConstraint timeConstraint;
    /**
     * Instantiates a new FindMeetingTimesPostRequestBody and sets the default values.
     */
    public FindMeetingTimesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FindMeetingTimesPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static FindMeetingTimesPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FindMeetingTimesPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the attendees property value. The attendees property
     * @return a java.util.List<AttendeeBase>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AttendeeBase> getAttendees() {
        return this.attendees;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("attendees", (n) -> { this.setAttendees(n.getCollectionOfObjectValues(AttendeeBase::createFromDiscriminatorValue)); });
        deserializerMap.put("isOrganizerOptional", (n) -> { this.setIsOrganizerOptional(n.getBooleanValue()); });
        deserializerMap.put("locationConstraint", (n) -> { this.setLocationConstraint(n.getObjectValue(LocationConstraint::createFromDiscriminatorValue)); });
        deserializerMap.put("maxCandidates", (n) -> { this.setMaxCandidates(n.getIntegerValue()); });
        deserializerMap.put("meetingDuration", (n) -> { this.setMeetingDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("minimumAttendeePercentage", (n) -> { this.setMinimumAttendeePercentage(n.getDoubleValue()); });
        deserializerMap.put("returnSuggestionReasons", (n) -> { this.setReturnSuggestionReasons(n.getBooleanValue()); });
        deserializerMap.put("timeConstraint", (n) -> { this.setTimeConstraint(n.getObjectValue(TimeConstraint::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isOrganizerOptional property value. The isOrganizerOptional property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOrganizerOptional() {
        return this.isOrganizerOptional;
    }
    /**
     * Gets the locationConstraint property value. The locationConstraint property
     * @return a LocationConstraint
     */
    @jakarta.annotation.Nullable
    public LocationConstraint getLocationConstraint() {
        return this.locationConstraint;
    }
    /**
     * Gets the maxCandidates property value. The maxCandidates property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxCandidates() {
        return this.maxCandidates;
    }
    /**
     * Gets the meetingDuration property value. The meetingDuration property
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getMeetingDuration() {
        return this.meetingDuration;
    }
    /**
     * Gets the minimumAttendeePercentage property value. The minimumAttendeePercentage property
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getMinimumAttendeePercentage() {
        return this.minimumAttendeePercentage;
    }
    /**
     * Gets the returnSuggestionReasons property value. The returnSuggestionReasons property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getReturnSuggestionReasons() {
        return this.returnSuggestionReasons;
    }
    /**
     * Gets the timeConstraint property value. The timeConstraint property
     * @return a TimeConstraint
     */
    @jakarta.annotation.Nullable
    public TimeConstraint getTimeConstraint() {
        return this.timeConstraint;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("attendees", this.getAttendees());
        writer.writeBooleanValue("isOrganizerOptional", this.getIsOrganizerOptional());
        writer.writeObjectValue("locationConstraint", this.getLocationConstraint());
        writer.writeIntegerValue("maxCandidates", this.getMaxCandidates());
        writer.writePeriodAndDurationValue("meetingDuration", this.getMeetingDuration());
        writer.writeDoubleValue("minimumAttendeePercentage", this.getMinimumAttendeePercentage());
        writer.writeBooleanValue("returnSuggestionReasons", this.getReturnSuggestionReasons());
        writer.writeObjectValue("timeConstraint", this.getTimeConstraint());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the attendees property value. The attendees property
     * @param value Value to set for the attendees property.
     */
    public void setAttendees(@jakarta.annotation.Nullable final java.util.List<AttendeeBase> value) {
        this.attendees = value;
    }
    /**
     * Sets the isOrganizerOptional property value. The isOrganizerOptional property
     * @param value Value to set for the isOrganizerOptional property.
     */
    public void setIsOrganizerOptional(@jakarta.annotation.Nullable final Boolean value) {
        this.isOrganizerOptional = value;
    }
    /**
     * Sets the locationConstraint property value. The locationConstraint property
     * @param value Value to set for the locationConstraint property.
     */
    public void setLocationConstraint(@jakarta.annotation.Nullable final LocationConstraint value) {
        this.locationConstraint = value;
    }
    /**
     * Sets the maxCandidates property value. The maxCandidates property
     * @param value Value to set for the maxCandidates property.
     */
    public void setMaxCandidates(@jakarta.annotation.Nullable final Integer value) {
        this.maxCandidates = value;
    }
    /**
     * Sets the meetingDuration property value. The meetingDuration property
     * @param value Value to set for the meetingDuration property.
     */
    public void setMeetingDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.meetingDuration = PeriodAndDuration.ofPeriodAndDuration(value);
    }
    /**
     * Sets the minimumAttendeePercentage property value. The minimumAttendeePercentage property
     * @param value Value to set for the minimumAttendeePercentage property.
     */
    public void setMinimumAttendeePercentage(@jakarta.annotation.Nullable final Double value) {
        this.minimumAttendeePercentage = value;
    }
    /**
     * Sets the returnSuggestionReasons property value. The returnSuggestionReasons property
     * @param value Value to set for the returnSuggestionReasons property.
     */
    public void setReturnSuggestionReasons(@jakarta.annotation.Nullable final Boolean value) {
        this.returnSuggestionReasons = value;
    }
    /**
     * Sets the timeConstraint property value. The timeConstraint property
     * @param value Value to set for the timeConstraint property.
     */
    public void setTimeConstraint(@jakarta.annotation.Nullable final TimeConstraint value) {
        this.timeConstraint = value;
    }
}
