package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecurrencePattern implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new RecurrencePattern and sets the default values.
     */
    public RecurrencePattern() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RecurrencePattern
     */
    @jakarta.annotation.Nonnull
    public static RecurrencePattern createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecurrencePattern();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the dayOfMonth property value. The day of the month on which the event occurs. Required if type is absoluteMonthly or absoluteYearly.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDayOfMonth() {
        return this.backingStore.get("dayOfMonth");
    }
    /**
     * Gets the daysOfWeek property value. A collection of the days of the week on which the event occurs. The possible values are: sunday, monday, tuesday, wednesday, thursday, friday, saturday. If type is relativeMonthly or relativeYearly, and daysOfWeek specifies more than one day, the event falls on the first day that satisfies the pattern.  Required if type is weekly, relativeMonthly, or relativeYearly.
     * @return a java.util.List<DayOfWeek>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DayOfWeek> getDaysOfWeek() {
        return this.backingStore.get("daysOfWeek");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a DayOfWeek
     */
    @jakarta.annotation.Nullable
    public DayOfWeek getFirstDayOfWeek() {
        return this.backingStore.get("firstDayOfWeek");
    }
    /**
     * Gets the index property value. Specifies on which instance of the allowed days specified in daysOfWeek the event occurs, counted from the first instance in the month. The possible values are: first, second, third, fourth, last. Default is first. Optional and used if type is relativeMonthly or relativeYearly.
     * @return a WeekIndex
     */
    @jakarta.annotation.Nullable
    public WeekIndex getIndex() {
        return this.backingStore.get("index");
    }
    /**
     * Gets the interval property value. The number of units between occurrences, where units can be in days, weeks, months, or years, depending on the type. Required.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInterval() {
        return this.backingStore.get("interval");
    }
    /**
     * Gets the month property value. The month in which the event occurs.  This is a number from 1 to 12.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMonth() {
        return this.backingStore.get("month");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the type property value. The recurrence pattern type: daily, weekly, absoluteMonthly, relativeMonthly, absoluteYearly, relativeYearly. Required. For more information, see values of type property.
     * @return a RecurrencePatternType
     */
    @jakarta.annotation.Nullable
    public RecurrencePatternType getType() {
        return this.backingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the dayOfMonth property value. The day of the month on which the event occurs. Required if type is absoluteMonthly or absoluteYearly.
     * @param value Value to set for the dayOfMonth property.
     */
    public void setDayOfMonth(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("dayOfMonth", value);
    }
    /**
     * Sets the daysOfWeek property value. A collection of the days of the week on which the event occurs. The possible values are: sunday, monday, tuesday, wednesday, thursday, friday, saturday. If type is relativeMonthly or relativeYearly, and daysOfWeek specifies more than one day, the event falls on the first day that satisfies the pattern.  Required if type is weekly, relativeMonthly, or relativeYearly.
     * @param value Value to set for the daysOfWeek property.
     */
    public void setDaysOfWeek(@jakarta.annotation.Nullable final java.util.List<DayOfWeek> value) {
        this.backingStore.set("daysOfWeek", value);
    }
    /**
     * Sets the firstDayOfWeek property value. The first day of the week. The possible values are: sunday, monday, tuesday, wednesday, thursday, friday, saturday. Default is sunday. Required if type is weekly.
     * @param value Value to set for the firstDayOfWeek property.
     */
    public void setFirstDayOfWeek(@jakarta.annotation.Nullable final DayOfWeek value) {
        this.backingStore.set("firstDayOfWeek", value);
    }
    /**
     * Sets the index property value. Specifies on which instance of the allowed days specified in daysOfWeek the event occurs, counted from the first instance in the month. The possible values are: first, second, third, fourth, last. Default is first. Optional and used if type is relativeMonthly or relativeYearly.
     * @param value Value to set for the index property.
     */
    public void setIndex(@jakarta.annotation.Nullable final WeekIndex value) {
        this.backingStore.set("index", value);
    }
    /**
     * Sets the interval property value. The number of units between occurrences, where units can be in days, weeks, months, or years, depending on the type. Required.
     * @param value Value to set for the interval property.
     */
    public void setInterval(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("interval", value);
    }
    /**
     * Sets the month property value. The month in which the event occurs.  This is a number from 1 to 12.
     * @param value Value to set for the month property.
     */
    public void setMonth(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("month", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the type property value. The recurrence pattern type: daily, weekly, absoluteMonthly, relativeMonthly, absoluteYearly, relativeYearly. Required. For more information, see values of type property.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final RecurrencePatternType value) {
        this.backingStore.set("type", value);
    }
}
