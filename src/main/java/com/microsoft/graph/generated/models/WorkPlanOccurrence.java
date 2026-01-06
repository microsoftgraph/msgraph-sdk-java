package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkPlanOccurrence extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WorkPlanOccurrence} and sets the default values.
     */
    public WorkPlanOccurrence() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkPlanOccurrence}
     */
    @jakarta.annotation.Nonnull
    public static WorkPlanOccurrence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkPlanOccurrence();
    }
    /**
     * Gets the end property value. The end property
     * @return a {@link DateTimeTimeZone}
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getEnd() {
        return this.backingStore.get("end");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("end", (n) -> { this.setEnd(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("placeId", (n) -> { this.setPlaceId(n.getStringValue()); });
        deserializerMap.put("recurrenceId", (n) -> { this.setRecurrenceId(n.getStringValue()); });
        deserializerMap.put("start", (n) -> { this.setStart(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("timeOffDetails", (n) -> { this.setTimeOffDetails(n.getObjectValue(TimeOffDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("workLocationType", (n) -> { this.setWorkLocationType(n.getEnumValue(WorkLocationType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the placeId property value. Identifier of a place from the Microsoft Graph Places Directory API. Only applicable when workLocationType is set to office.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlaceId() {
        return this.backingStore.get("placeId");
    }
    /**
     * Gets the recurrenceId property value. The identifier of the parent recurrence pattern that generated this occurrence. The value is null for time-off occurrences because they don&apos;t have a parent recurrence.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecurrenceId() {
        return this.backingStore.get("recurrenceId");
    }
    /**
     * Gets the start property value. The start property
     * @return a {@link DateTimeTimeZone}
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getStart() {
        return this.backingStore.get("start");
    }
    /**
     * Gets the timeOffDetails property value. The details about the time off. Only applicable when workLocationType is set to timeOff.
     * @return a {@link TimeOffDetails}
     */
    @jakarta.annotation.Nullable
    public TimeOffDetails getTimeOffDetails() {
        return this.backingStore.get("timeOffDetails");
    }
    /**
     * Gets the workLocationType property value. The workLocationType property
     * @return a {@link WorkLocationType}
     */
    @jakarta.annotation.Nullable
    public WorkLocationType getWorkLocationType() {
        return this.backingStore.get("workLocationType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("end", this.getEnd());
        writer.writeStringValue("placeId", this.getPlaceId());
        writer.writeStringValue("recurrenceId", this.getRecurrenceId());
        writer.writeObjectValue("start", this.getStart());
        writer.writeObjectValue("timeOffDetails", this.getTimeOffDetails());
        writer.writeEnumValue("workLocationType", this.getWorkLocationType());
    }
    /**
     * Sets the end property value. The end property
     * @param value Value to set for the end property.
     */
    public void setEnd(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.backingStore.set("end", value);
    }
    /**
     * Sets the placeId property value. Identifier of a place from the Microsoft Graph Places Directory API. Only applicable when workLocationType is set to office.
     * @param value Value to set for the placeId property.
     */
    public void setPlaceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("placeId", value);
    }
    /**
     * Sets the recurrenceId property value. The identifier of the parent recurrence pattern that generated this occurrence. The value is null for time-off occurrences because they don&apos;t have a parent recurrence.
     * @param value Value to set for the recurrenceId property.
     */
    public void setRecurrenceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recurrenceId", value);
    }
    /**
     * Sets the start property value. The start property
     * @param value Value to set for the start property.
     */
    public void setStart(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.backingStore.set("start", value);
    }
    /**
     * Sets the timeOffDetails property value. The details about the time off. Only applicable when workLocationType is set to timeOff.
     * @param value Value to set for the timeOffDetails property.
     */
    public void setTimeOffDetails(@jakarta.annotation.Nullable final TimeOffDetails value) {
        this.backingStore.set("timeOffDetails", value);
    }
    /**
     * Sets the workLocationType property value. The workLocationType property
     * @param value Value to set for the workLocationType property.
     */
    public void setWorkLocationType(@jakarta.annotation.Nullable final WorkLocationType value) {
        this.backingStore.set("workLocationType", value);
    }
}
