package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShiftPreferences extends ChangeTrackedEntity implements Parsable {
    /**
     * Instantiates a new ShiftPreferences and sets the default values.
     */
    public ShiftPreferences() {
        super();
        this.setOdataType("#microsoft.graph.shiftPreferences");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ShiftPreferences
     */
    @jakarta.annotation.Nonnull
    public static ShiftPreferences createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShiftPreferences();
    }
    /**
     * Gets the availability property value. Availability of the user to be scheduled for work and its recurrence pattern.
     * @return a java.util.List<ShiftAvailability>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ShiftAvailability> getAvailability() {
        return this.BackingStore.get("availability");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("availability", (n) -> { this.setAvailability(n.getCollectionOfObjectValues(ShiftAvailability::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("availability", this.getAvailability());
    }
    /**
     * Sets the availability property value. Availability of the user to be scheduled for work and its recurrence pattern.
     * @param value Value to set for the availability property.
     */
    public void setAvailability(@jakarta.annotation.Nullable final java.util.List<ShiftAvailability> value) {
        this.BackingStore.set("availability", value);
    }
}
