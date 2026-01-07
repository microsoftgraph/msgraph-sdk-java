package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkHoursAndLocationsSetting extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WorkHoursAndLocationsSetting} and sets the default values.
     */
    public WorkHoursAndLocationsSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkHoursAndLocationsSetting}
     */
    @jakarta.annotation.Nonnull
    public static WorkHoursAndLocationsSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkHoursAndLocationsSetting();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("maxSharedWorkLocationDetails", (n) -> { this.setMaxSharedWorkLocationDetails(n.getEnumValue(MaxWorkLocationDetails::forValue)); });
        deserializerMap.put("occurrences", (n) -> { this.setOccurrences(n.getCollectionOfObjectValues(WorkPlanOccurrence::createFromDiscriminatorValue)); });
        deserializerMap.put("recurrences", (n) -> { this.setRecurrences(n.getCollectionOfObjectValues(WorkPlanRecurrence::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the maxSharedWorkLocationDetails property value. The maxSharedWorkLocationDetails property
     * @return a {@link MaxWorkLocationDetails}
     */
    @jakarta.annotation.Nullable
    public MaxWorkLocationDetails getMaxSharedWorkLocationDetails() {
        return this.backingStore.get("maxSharedWorkLocationDetails");
    }
    /**
     * Gets the occurrences property value. Collection of work plan occurrences.
     * @return a {@link java.util.List<WorkPlanOccurrence>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkPlanOccurrence> getOccurrences() {
        return this.backingStore.get("occurrences");
    }
    /**
     * Gets the recurrences property value. Collection of recurring work plans defined by the user.
     * @return a {@link java.util.List<WorkPlanRecurrence>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkPlanRecurrence> getRecurrences() {
        return this.backingStore.get("recurrences");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("maxSharedWorkLocationDetails", this.getMaxSharedWorkLocationDetails());
        writer.writeCollectionOfObjectValues("occurrences", this.getOccurrences());
        writer.writeCollectionOfObjectValues("recurrences", this.getRecurrences());
    }
    /**
     * Sets the maxSharedWorkLocationDetails property value. The maxSharedWorkLocationDetails property
     * @param value Value to set for the maxSharedWorkLocationDetails property.
     */
    public void setMaxSharedWorkLocationDetails(@jakarta.annotation.Nullable final MaxWorkLocationDetails value) {
        this.backingStore.set("maxSharedWorkLocationDetails", value);
    }
    /**
     * Sets the occurrences property value. Collection of work plan occurrences.
     * @param value Value to set for the occurrences property.
     */
    public void setOccurrences(@jakarta.annotation.Nullable final java.util.List<WorkPlanOccurrence> value) {
        this.backingStore.set("occurrences", value);
    }
    /**
     * Sets the recurrences property value. Collection of recurring work plans defined by the user.
     * @param value Value to set for the recurrences property.
     */
    public void setRecurrences(@jakarta.annotation.Nullable final java.util.List<WorkPlanRecurrence> value) {
        this.backingStore.set("recurrences", value);
    }
}
