package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OpenShiftItem extends ShiftItem implements Parsable {
    /** Count of the number of slots for the given open shift. */
    private Integer _openSlotCount;
    /**
     * Instantiates a new OpenShiftItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OpenShiftItem() {
        super();
        this.setOdataType("#microsoft.graph.openShiftItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OpenShiftItem
     */
    @javax.annotation.Nonnull
    public static OpenShiftItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OpenShiftItem();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OpenShiftItem currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("openSlotCount", (n) -> { currentObject.setOpenSlotCount(n.getIntegerValue()); });
        return deserializerMap
    }
    /**
     * Gets the openSlotCount property value. Count of the number of slots for the given open shift.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getOpenSlotCount() {
        return this._openSlotCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("openSlotCount", this.getOpenSlotCount());
    }
    /**
     * Sets the openSlotCount property value. Count of the number of slots for the given open shift.
     * @param value Value to set for the openSlotCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOpenSlotCount(@javax.annotation.Nullable final Integer value) {
        this._openSlotCount = value;
    }
}
