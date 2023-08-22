package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecurrenceRange implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date to stop applying the recurrence pattern. Depending on the recurrence pattern of the event, the last occurrence of the meeting may not be this date. Required if type is endDate.
     */
    private LocalDate endDate;
    /**
     * The number of times to repeat the event. Required and must be positive if type is numbered.
     */
    private Integer numberOfOccurrences;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Time zone for the startDate and endDate properties. Optional. If not specified, the time zone of the event is used.
     */
    private String recurrenceTimeZone;
    /**
     * The date to start applying the recurrence pattern. The first occurrence of the meeting may be this date or later, depending on the recurrence pattern of the event. Must be the same value as the start property of the recurring event. Required.
     */
    private LocalDate startDate;
    /**
     * The recurrence range. The possible values are: endDate, noEnd, numbered. Required.
     */
    private RecurrenceRangeType type;
    /**
     * Instantiates a new recurrenceRange and sets the default values.
     */
    public RecurrenceRange() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a recurrenceRange
     */
    @jakarta.annotation.Nonnull
    public static RecurrenceRange createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecurrenceRange();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the endDate property value. The date to stop applying the recurrence pattern. Depending on the recurrence pattern of the event, the last occurrence of the meeting may not be this date. Required if type is endDate.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getEndDate() {
        return this.endDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("endDate", (n) -> { this.setEndDate(n.getLocalDateValue()); });
        deserializerMap.put("numberOfOccurrences", (n) -> { this.setNumberOfOccurrences(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recurrenceTimeZone", (n) -> { this.setRecurrenceTimeZone(n.getStringValue()); });
        deserializerMap.put("startDate", (n) -> { this.setStartDate(n.getLocalDateValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(RecurrenceRangeType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the numberOfOccurrences property value. The number of times to repeat the event. Required and must be positive if type is numbered.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfOccurrences() {
        return this.numberOfOccurrences;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the recurrenceTimeZone property value. Time zone for the startDate and endDate properties. Optional. If not specified, the time zone of the event is used.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRecurrenceTimeZone() {
        return this.recurrenceTimeZone;
    }
    /**
     * Gets the startDate property value. The date to start applying the recurrence pattern. The first occurrence of the meeting may be this date or later, depending on the recurrence pattern of the event. Must be the same value as the start property of the recurring event. Required.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getStartDate() {
        return this.startDate;
    }
    /**
     * Gets the type property value. The recurrence range. The possible values are: endDate, noEnd, numbered. Required.
     * @return a recurrenceRangeType
     */
    @jakarta.annotation.Nullable
    public RecurrenceRangeType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLocalDateValue("endDate", this.getEndDate());
        writer.writeIntegerValue("numberOfOccurrences", this.getNumberOfOccurrences());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("recurrenceTimeZone", this.getRecurrenceTimeZone());
        writer.writeLocalDateValue("startDate", this.getStartDate());
        writer.writeEnumValue("type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the endDate property value. The date to stop applying the recurrence pattern. Depending on the recurrence pattern of the event, the last occurrence of the meeting may not be this date. Required if type is endDate.
     * @param value Value to set for the endDate property.
     */
    public void setEndDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.endDate = value;
    }
    /**
     * Sets the numberOfOccurrences property value. The number of times to repeat the event. Required and must be positive if type is numbered.
     * @param value Value to set for the numberOfOccurrences property.
     */
    public void setNumberOfOccurrences(@jakarta.annotation.Nullable final Integer value) {
        this.numberOfOccurrences = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the recurrenceTimeZone property value. Time zone for the startDate and endDate properties. Optional. If not specified, the time zone of the event is used.
     * @param value Value to set for the recurrenceTimeZone property.
     */
    public void setRecurrenceTimeZone(@jakarta.annotation.Nullable final String value) {
        this.recurrenceTimeZone = value;
    }
    /**
     * Sets the startDate property value. The date to start applying the recurrence pattern. The first occurrence of the meeting may be this date or later, depending on the recurrence pattern of the event. Must be the same value as the start property of the recurring event. Required.
     * @param value Value to set for the startDate property.
     */
    public void setStartDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.startDate = value;
    }
    /**
     * Sets the type property value. The recurrence range. The possible values are: endDate, noEnd, numbered. Required.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final RecurrenceRangeType value) {
        this.type = value;
    }
}
