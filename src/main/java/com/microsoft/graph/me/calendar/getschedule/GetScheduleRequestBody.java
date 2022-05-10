package microsoft.graph.me.calendar.getschedule;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.DateTimeTimeZone;
/** Provides operations to call the getSchedule method. */
public class GetScheduleRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The AvailabilityViewInterval property */
    private Integer _availabilityViewInterval;
    /** The EndTime property */
    private DateTimeTimeZone _endTime;
    /** The Schedules property */
    private java.util.List<String> _schedules;
    /** The StartTime property */
    private DateTimeTimeZone _startTime;
    /**
     * Instantiates a new getScheduleRequestBody and sets the default values.
     * @return a void
     */
    public GetScheduleRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a getScheduleRequestBody
     */
    @javax.annotation.Nonnull
    public static GetScheduleRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetScheduleRequestBody();
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
     * Gets the availabilityViewInterval property value. The AvailabilityViewInterval property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAvailabilityViewInterval() {
        return this._availabilityViewInterval;
    }
    /**
     * Gets the endTime property value. The EndTime property
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getEndTime() {
        return this._endTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GetScheduleRequestBody currentObject = this;
        return new HashMap<>(4) {{
            this.put("availabilityViewInterval", (n) -> { currentObject.setAvailabilityViewInterval(n.getIntegerValue()); });
            this.put("endTime", (n) -> { currentObject.setEndTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
            this.put("schedules", (n) -> { currentObject.setSchedules(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("startTime", (n) -> { currentObject.setStartTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the schedules property value. The Schedules property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSchedules() {
        return this._schedules;
    }
    /**
     * Gets the startTime property value. The StartTime property
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getStartTime() {
        return this._startTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("availabilityViewInterval", this.getAvailabilityViewInterval());
        writer.writeObjectValue("endTime", this.getEndTime());
        writer.writeCollectionOfPrimitiveValues("schedules", this.getSchedules());
        writer.writeObjectValue("startTime", this.getStartTime());
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
     * Sets the availabilityViewInterval property value. The AvailabilityViewInterval property
     * @param value Value to set for the AvailabilityViewInterval property.
     * @return a void
     */
    public void setAvailabilityViewInterval(@javax.annotation.Nullable final Integer value) {
        this._availabilityViewInterval = value;
    }
    /**
     * Sets the endTime property value. The EndTime property
     * @param value Value to set for the EndTime property.
     * @return a void
     */
    public void setEndTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._endTime = value;
    }
    /**
     * Sets the schedules property value. The Schedules property
     * @param value Value to set for the Schedules property.
     * @return a void
     */
    public void setSchedules(@javax.annotation.Nullable final java.util.List<String> value) {
        this._schedules = value;
    }
    /**
     * Sets the startTime property value. The StartTime property
     * @param value Value to set for the StartTime property.
     * @return a void
     */
    public void setStartTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._startTime = value;
    }
}
