package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OpenShiftItem extends ShiftItem implements Parsable {
    /**
     * Count of the number of slots for the given open shift.
     */
    private Integer openSlotCount;
    /**
     * Instantiates a new openShiftItem and sets the default values.
     */
    public OpenShiftItem() {
        super();
        this.setOdataType("#microsoft.graph.openShiftItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a openShiftItem
     */
    @jakarta.annotation.Nonnull
    public static OpenShiftItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OpenShiftItem();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("openSlotCount", (n) -> { this.setOpenSlotCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the openSlotCount property value. Count of the number of slots for the given open shift.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getOpenSlotCount() {
        return this.openSlotCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("openSlotCount", this.getOpenSlotCount());
    }
    /**
     * Sets the openSlotCount property value. Count of the number of slots for the given open shift.
     * @param value Value to set for the openSlotCount property.
     */
    public void setOpenSlotCount(@jakarta.annotation.Nullable final Integer value) {
        this.openSlotCount = value;
    }
}
