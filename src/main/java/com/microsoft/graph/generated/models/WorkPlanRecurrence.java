package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkPlanRecurrence extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WorkPlanRecurrence} and sets the default values.
     */
    public WorkPlanRecurrence() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkPlanRecurrence}
     */
    @jakarta.annotation.Nonnull
    public static WorkPlanRecurrence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkPlanRecurrence();
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
        deserializerMap.put("recurrence", (n) -> { this.setRecurrence(n.getObjectValue(PatternedRecurrence::createFromDiscriminatorValue)); });
        deserializerMap.put("start", (n) -> { this.setStart(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
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
     * Gets the recurrence property value. The recurrence property
     * @return a {@link PatternedRecurrence}
     */
    @jakarta.annotation.Nullable
    public PatternedRecurrence getRecurrence() {
        return this.backingStore.get("recurrence");
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
        writer.writeObjectValue("recurrence", this.getRecurrence());
        writer.writeObjectValue("start", this.getStart());
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
     * Sets the recurrence property value. The recurrence property
     * @param value Value to set for the recurrence property.
     */
    public void setRecurrence(@jakarta.annotation.Nullable final PatternedRecurrence value) {
        this.backingStore.set("recurrence", value);
    }
    /**
     * Sets the start property value. The start property
     * @param value Value to set for the start property.
     */
    public void setStart(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.backingStore.set("start", value);
    }
    /**
     * Sets the workLocationType property value. The workLocationType property
     * @param value Value to set for the workLocationType property.
     */
    public void setWorkLocationType(@jakarta.annotation.Nullable final WorkLocationType value) {
        this.backingStore.set("workLocationType", value);
    }
}
