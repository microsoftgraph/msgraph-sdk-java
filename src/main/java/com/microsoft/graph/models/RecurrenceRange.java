package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RecurrenceRange implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The date to stop applying the recurrence pattern. Depending on the recurrence pattern of the event, the last occurrence of the meeting may not be this date. Required if type is endDate.  */
    private LocalDate _endDate;
    /** The number of times to repeat the event. Required and must be positive if type is numbered.  */
    private Integer _numberOfOccurrences;
    /** Time zone for the startDate and endDate properties. Optional. If not specified, the time zone of the event is used.  */
    private String _recurrenceTimeZone;
    /** The date to start applying the recurrence pattern. The first occurrence of the meeting may be this date or later, depending on the recurrence pattern of the event. Must be the same value as the start property of the recurring event. Required.  */
    private LocalDate _startDate;
    /** The recurrence range. Possible values are: endDate, noEnd, numbered. Required.  */
    private RecurrenceRangeType _type;
    /**
     * Instantiates a new recurrenceRange and sets the default values.
     * @return a void
     */
    public RecurrenceRange() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a recurrenceRange
     */
    @javax.annotation.Nonnull
    public static RecurrenceRange createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecurrenceRange();
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
     * Gets the endDate property value. The date to stop applying the recurrence pattern. Depending on the recurrence pattern of the event, the last occurrence of the meeting may not be this date. Required if type is endDate.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getEndDate() {
        return this._endDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RecurrenceRange currentObject = this;
        return new HashMap<>(5) {{
            this.put("endDate", (n) -> { currentObject.setEndDate(n.getLocalDateValue()); });
            this.put("numberOfOccurrences", (n) -> { currentObject.setNumberOfOccurrences(n.getIntegerValue()); });
            this.put("recurrenceTimeZone", (n) -> { currentObject.setRecurrenceTimeZone(n.getStringValue()); });
            this.put("startDate", (n) -> { currentObject.setStartDate(n.getLocalDateValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getEnumValue(RecurrenceRangeType.class)); });
        }};
    }
    /**
     * Gets the numberOfOccurrences property value. The number of times to repeat the event. Required and must be positive if type is numbered.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNumberOfOccurrences() {
        return this._numberOfOccurrences;
    }
    /**
     * Gets the recurrenceTimeZone property value. Time zone for the startDate and endDate properties. Optional. If not specified, the time zone of the event is used.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecurrenceTimeZone() {
        return this._recurrenceTimeZone;
    }
    /**
     * Gets the startDate property value. The date to start applying the recurrence pattern. The first occurrence of the meeting may be this date or later, depending on the recurrence pattern of the event. Must be the same value as the start property of the recurring event. Required.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getStartDate() {
        return this._startDate;
    }
    /**
     * Gets the type property value. The recurrence range. Possible values are: endDate, noEnd, numbered. Required.
     * @return a recurrenceRangeType
     */
    @javax.annotation.Nullable
    public RecurrenceRangeType getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLocalDateValue("endDate", this.getEndDate());
        writer.writeIntegerValue("numberOfOccurrences", this.getNumberOfOccurrences());
        writer.writeStringValue("recurrenceTimeZone", this.getRecurrenceTimeZone());
        writer.writeLocalDateValue("startDate", this.getStartDate());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the endDate property value. The date to stop applying the recurrence pattern. Depending on the recurrence pattern of the event, the last occurrence of the meeting may not be this date. Required if type is endDate.
     * @param value Value to set for the endDate property.
     * @return a void
     */
    public void setEndDate(@javax.annotation.Nullable final LocalDate value) {
        this._endDate = value;
    }
    /**
     * Sets the numberOfOccurrences property value. The number of times to repeat the event. Required and must be positive if type is numbered.
     * @param value Value to set for the numberOfOccurrences property.
     * @return a void
     */
    public void setNumberOfOccurrences(@javax.annotation.Nullable final Integer value) {
        this._numberOfOccurrences = value;
    }
    /**
     * Sets the recurrenceTimeZone property value. Time zone for the startDate and endDate properties. Optional. If not specified, the time zone of the event is used.
     * @param value Value to set for the recurrenceTimeZone property.
     * @return a void
     */
    public void setRecurrenceTimeZone(@javax.annotation.Nullable final String value) {
        this._recurrenceTimeZone = value;
    }
    /**
     * Sets the startDate property value. The date to start applying the recurrence pattern. The first occurrence of the meeting may be this date or later, depending on the recurrence pattern of the event. Must be the same value as the start property of the recurring event. Required.
     * @param value Value to set for the startDate property.
     * @return a void
     */
    public void setStartDate(@javax.annotation.Nullable final LocalDate value) {
        this._startDate = value;
    }
    /**
     * Sets the type property value. The recurrence range. Possible values are: endDate, noEnd, numbered. Required.
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final RecurrenceRangeType value) {
        this._type = value;
    }
}
