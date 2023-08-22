package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StandardTimeZoneOffset implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Represents the nth occurrence of the day of week that the transition from daylight saving time to standard time occurs.
     */
    private Integer dayOccurrence;
    /**
     * Represents the day of the week when the transition from daylight saving time to standard time.
     */
    private DayOfWeek dayOfWeek;
    /**
     * Represents the month of the year when the transition from daylight saving time to standard time occurs.
     */
    private Integer month;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Represents the time of day when the transition from daylight saving time to standard time occurs.
     */
    private LocalTime time;
    /**
     * Represents how frequently in terms of years the change from daylight saving time to standard time occurs. For example, a value of 0 means every year.
     */
    private Integer year;
    /**
     * Instantiates a new standardTimeZoneOffset and sets the default values.
     */
    public StandardTimeZoneOffset() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a standardTimeZoneOffset
     */
    @jakarta.annotation.Nonnull
    public static StandardTimeZoneOffset createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the dayOccurrence property value. Represents the nth occurrence of the day of week that the transition from daylight saving time to standard time occurs.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDayOccurrence() {
        return this.dayOccurrence;
    }
    /**
     * Gets the dayOfWeek property value. Represents the day of the week when the transition from daylight saving time to standard time.
     * @return a dayOfWeek
     */
    @jakarta.annotation.Nullable
    public DayOfWeek getDayOfWeek() {
        return this.dayOfWeek;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("dayOccurrence", (n) -> { this.setDayOccurrence(n.getIntegerValue()); });
        deserializerMap.put("dayOfWeek", (n) -> { this.setDayOfWeek(n.getEnumValue(DayOfWeek.class)); });
        deserializerMap.put("month", (n) -> { this.setMonth(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("time", (n) -> { this.setTime(n.getLocalTimeValue()); });
        deserializerMap.put("year", (n) -> { this.setYear(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the month property value. Represents the month of the year when the transition from daylight saving time to standard time occurs.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMonth() {
        return this.month;
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
     * Gets the time property value. Represents the time of day when the transition from daylight saving time to standard time occurs.
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getTime() {
        return this.time;
    }
    /**
     * Gets the year property value. Represents how frequently in terms of years the change from daylight saving time to standard time occurs. For example, a value of 0 means every year.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getYear() {
        return this.year;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the dayOccurrence property value. Represents the nth occurrence of the day of week that the transition from daylight saving time to standard time occurs.
     * @param value Value to set for the dayOccurrence property.
     */
    public void setDayOccurrence(@jakarta.annotation.Nullable final Integer value) {
        this.dayOccurrence = value;
    }
    /**
     * Sets the dayOfWeek property value. Represents the day of the week when the transition from daylight saving time to standard time.
     * @param value Value to set for the dayOfWeek property.
     */
    public void setDayOfWeek(@jakarta.annotation.Nullable final DayOfWeek value) {
        this.dayOfWeek = value;
    }
    /**
     * Sets the month property value. Represents the month of the year when the transition from daylight saving time to standard time occurs.
     * @param value Value to set for the month property.
     */
    public void setMonth(@jakarta.annotation.Nullable final Integer value) {
        this.month = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the time property value. Represents the time of day when the transition from daylight saving time to standard time occurs.
     * @param value Value to set for the time property.
     */
    public void setTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.time = value;
    }
    /**
     * Sets the year property value. Represents how frequently in terms of years the change from daylight saving time to standard time occurs. For example, a value of 0 means every year.
     * @param value Value to set for the year property.
     */
    public void setYear(@jakarta.annotation.Nullable final Integer value) {
        this.year = value;
    }
}
