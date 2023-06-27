package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RecurrencePattern implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The day of the month on which the event occurs. Required if type is absoluteMonthly or absoluteYearly.
     */
    private Integer dayOfMonth;
    /**
     * A collection of the days of the week on which the event occurs. The possible values are: sunday, monday, tuesday, wednesday, thursday, friday, saturday. If type is relativeMonthly or relativeYearly, and daysOfWeek specifies more than one day, the event falls on the first day that satisfies the pattern.  Required if type is weekly, relativeMonthly, or relativeYearly.
     */
    private java.util.List<DayOfWeek> daysOfWeek;
    /**
     * The first day of the week. The possible values are: sunday, monday, tuesday, wednesday, thursday, friday, saturday. Default is sunday. Required if type is weekly.
     */
    private DayOfWeek firstDayOfWeek;
    /**
     * Specifies on which instance of the allowed days specified in daysOfWeek the event occurs, counted from the first instance in the month. The possible values are: first, second, third, fourth, last. Default is first. Optional and used if type is relativeMonthly or relativeYearly.
     */
    private WeekIndex index;
    /**
     * The number of units between occurrences, where units can be in days, weeks, months, or years, depending on the type. Required.
     */
    private Integer interval;
    /**
     * The month in which the event occurs.  This is a number from 1 to 12.
     */
    private Integer month;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The recurrence pattern type: daily, weekly, absoluteMonthly, relativeMonthly, absoluteYearly, relativeYearly. Required. For more information, see values of type property.
     */
    private RecurrencePatternType type;
    /**
     * Instantiates a new recurrencePattern and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RecurrencePattern() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a recurrencePattern
     */
    @javax.annotation.Nonnull
    public static RecurrencePattern createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecurrencePattern();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the dayOfMonth property value. The day of the month on which the event occurs. Required if type is absoluteMonthly or absoluteYearly.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDayOfMonth() {
        return this.dayOfMonth;
    }
    /**
     * Gets the daysOfWeek property value. A collection of the days of the week on which the event occurs. The possible values are: sunday, monday, tuesday, wednesday, thursday, friday, saturday. If type is relativeMonthly or relativeYearly, and daysOfWeek specifies more than one day, the event falls on the first day that satisfies the pattern.  Required if type is weekly, relativeMonthly, or relativeYearly.
     * @return a dayOfWeek
     */
    @javax.annotation.Nullable
    public java.util.List<DayOfWeek> getDaysOfWeek() {
        return this.daysOfWeek;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("dayOfMonth", (n) -> { this.setDayOfMonth(n.getIntegerValue()); });
        deserializerMap.put("daysOfWeek", (n) -> { this.setDaysOfWeek(n.getCollectionOfEnumValues(DayOfWeek.class)); });
        deserializerMap.put("firstDayOfWeek", (n) -> { this.setFirstDayOfWeek(n.getEnumValue(DayOfWeek.class)); });
        deserializerMap.put("index", (n) -> { this.setIndex(n.getEnumValue(WeekIndex.class)); });
        deserializerMap.put("interval", (n) -> { this.setInterval(n.getIntegerValue()); });
        deserializerMap.put("month", (n) -> { this.setMonth(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(RecurrencePatternType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the firstDayOfWeek property value. The first day of the week. The possible values are: sunday, monday, tuesday, wednesday, thursday, friday, saturday. Default is sunday. Required if type is weekly.
     * @return a dayOfWeek
     */
    @javax.annotation.Nullable
    public DayOfWeek getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }
    /**
     * Gets the index property value. Specifies on which instance of the allowed days specified in daysOfWeek the event occurs, counted from the first instance in the month. The possible values are: first, second, third, fourth, last. Default is first. Optional and used if type is relativeMonthly or relativeYearly.
     * @return a weekIndex
     */
    @javax.annotation.Nullable
    public WeekIndex getIndex() {
        return this.index;
    }
    /**
     * Gets the interval property value. The number of units between occurrences, where units can be in days, weeks, months, or years, depending on the type. Required.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInterval() {
        return this.interval;
    }
    /**
     * Gets the month property value. The month in which the event occurs.  This is a number from 1 to 12.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMonth() {
        return this.month;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the type property value. The recurrence pattern type: daily, weekly, absoluteMonthly, relativeMonthly, absoluteYearly, relativeYearly. Required. For more information, see values of type property.
     * @return a recurrencePatternType
     */
    @javax.annotation.Nullable
    public RecurrencePatternType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("dayOfMonth", this.getDayOfMonth());
        writer.writeCollectionOfEnumValues("daysOfWeek", this.getDaysOfWeek());
        writer.writeEnumValue("firstDayOfWeek", this.getFirstDayOfWeek());
        writer.writeEnumValue("index", this.getIndex());
        writer.writeIntegerValue("interval", this.getInterval());
        writer.writeIntegerValue("month", this.getMonth());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the dayOfMonth property value. The day of the month on which the event occurs. Required if type is absoluteMonthly or absoluteYearly.
     * @param value Value to set for the dayOfMonth property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDayOfMonth(@javax.annotation.Nullable final Integer value) {
        this.dayOfMonth = value;
    }
    /**
     * Sets the daysOfWeek property value. A collection of the days of the week on which the event occurs. The possible values are: sunday, monday, tuesday, wednesday, thursday, friday, saturday. If type is relativeMonthly or relativeYearly, and daysOfWeek specifies more than one day, the event falls on the first day that satisfies the pattern.  Required if type is weekly, relativeMonthly, or relativeYearly.
     * @param value Value to set for the daysOfWeek property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDaysOfWeek(@javax.annotation.Nullable final java.util.List<DayOfWeek> value) {
        this.daysOfWeek = value;
    }
    /**
     * Sets the firstDayOfWeek property value. The first day of the week. The possible values are: sunday, monday, tuesday, wednesday, thursday, friday, saturday. Default is sunday. Required if type is weekly.
     * @param value Value to set for the firstDayOfWeek property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirstDayOfWeek(@javax.annotation.Nullable final DayOfWeek value) {
        this.firstDayOfWeek = value;
    }
    /**
     * Sets the index property value. Specifies on which instance of the allowed days specified in daysOfWeek the event occurs, counted from the first instance in the month. The possible values are: first, second, third, fourth, last. Default is first. Optional and used if type is relativeMonthly or relativeYearly.
     * @param value Value to set for the index property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIndex(@javax.annotation.Nullable final WeekIndex value) {
        this.index = value;
    }
    /**
     * Sets the interval property value. The number of units between occurrences, where units can be in days, weeks, months, or years, depending on the type. Required.
     * @param value Value to set for the interval property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInterval(@javax.annotation.Nullable final Integer value) {
        this.interval = value;
    }
    /**
     * Sets the month property value. The month in which the event occurs.  This is a number from 1 to 12.
     * @param value Value to set for the month property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMonth(@javax.annotation.Nullable final Integer value) {
        this.month = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the type property value. The recurrence pattern type: daily, weekly, absoluteMonthly, relativeMonthly, absoluteYearly, relativeYearly. Required. For more information, see values of type property.
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final RecurrencePatternType value) {
        this.type = value;
    }
}
