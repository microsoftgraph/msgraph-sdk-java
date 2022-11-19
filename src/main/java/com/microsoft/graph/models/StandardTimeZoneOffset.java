package com.microsoft.graph.models;

import com.microsoft.graph.models.DaylightTimeZoneOffset;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class StandardTimeZoneOffset implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Represents the nth occurrence of the day of week that the transition from daylight saving time to standard time occurs. */
    private Integer _dayOccurrence;
    /** Represents the day of the week when the transition from daylight saving time to standard time. */
    private DayOfWeek _dayOfWeek;
    /** Represents the month of the year when the transition from daylight saving time to standard time occurs. */
    private Integer _month;
    /** The OdataType property */
    private String _odataType;
    /** Represents the time of day when the transition from daylight saving time to standard time occurs. */
    private LocalTime _time;
    /** Represents how frequently in terms of years the change from daylight saving time to standard time occurs. For example, a value of 0 means every year. */
    private Integer _year;
    /**
     * Instantiates a new standardTimeZoneOffset and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public StandardTimeZoneOffset() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.standardTimeZoneOffset");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a standardTimeZoneOffset
     */
    @javax.annotation.Nonnull
    public static StandardTimeZoneOffset createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.daylightTimeZoneOffset": return new DaylightTimeZoneOffset();
            }
        }
        return new StandardTimeZoneOffset();
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
     * Gets the dayOccurrence property value. Represents the nth occurrence of the day of week that the transition from daylight saving time to standard time occurs.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDayOccurrence() {
        return this._dayOccurrence;
    }
    /**
     * Gets the dayOfWeek property value. Represents the day of the week when the transition from daylight saving time to standard time.
     * @return a dayOfWeek
     */
    @javax.annotation.Nullable
    public DayOfWeek getDayOfWeek() {
        return this._dayOfWeek;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final StandardTimeZoneOffset currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(6);
        deserializerMap.put("dayOccurrence", (n) -> { currentObject.setDayOccurrence(n.getIntegerValue()); });
        deserializerMap.put("dayOfWeek", (n) -> { currentObject.setDayOfWeek(n.getEnumValue(DayOfWeek.class)); });
        deserializerMap.put("month", (n) -> { currentObject.setMonth(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("time", (n) -> { currentObject.setTime(n.getLocalTimeValue()); });
        deserializerMap.put("year", (n) -> { currentObject.setYear(n.getIntegerValue()); });
        return deserializerMap
    }
    /**
     * Gets the month property value. Represents the month of the year when the transition from daylight saving time to standard time occurs.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMonth() {
        return this._month;
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
     * Gets the time property value. Represents the time of day when the transition from daylight saving time to standard time occurs.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getTime() {
        return this._time;
    }
    /**
     * Gets the year property value. Represents how frequently in terms of years the change from daylight saving time to standard time occurs. For example, a value of 0 means every year.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getYear() {
        return this._year;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("dayOccurrence", this.getDayOccurrence());
        writer.writeEnumValue("dayOfWeek", this.getDayOfWeek());
        writer.writeIntegerValue("month", this.getMonth());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLocalTimeValue("time", this.getTime());
        writer.writeIntegerValue("year", this.getYear());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the dayOccurrence property value. Represents the nth occurrence of the day of week that the transition from daylight saving time to standard time occurs.
     * @param value Value to set for the dayOccurrence property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDayOccurrence(@javax.annotation.Nullable final Integer value) {
        this._dayOccurrence = value;
    }
    /**
     * Sets the dayOfWeek property value. Represents the day of the week when the transition from daylight saving time to standard time.
     * @param value Value to set for the dayOfWeek property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDayOfWeek(@javax.annotation.Nullable final DayOfWeek value) {
        this._dayOfWeek = value;
    }
    /**
     * Sets the month property value. Represents the month of the year when the transition from daylight saving time to standard time occurs.
     * @param value Value to set for the month property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMonth(@javax.annotation.Nullable final Integer value) {
        this._month = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the time property value. Represents the time of day when the transition from daylight saving time to standard time occurs.
     * @param value Value to set for the time property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTime(@javax.annotation.Nullable final LocalTime value) {
        this._time = value;
    }
    /**
     * Sets the year property value. Represents how frequently in terms of years the change from daylight saving time to standard time occurs. For example, a value of 0 means every year.
     * @param value Value to set for the year property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setYear(@javax.annotation.Nullable final Integer value) {
        this._year = value;
    }
}
