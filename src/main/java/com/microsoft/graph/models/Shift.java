package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Shift extends ChangeTrackedEntity implements Parsable {
    /**
     * Instantiates a new Shift and sets the default values.
     */
    public Shift() {
        super();
        this.setOdataType("#microsoft.graph.shift");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Shift
     */
    @jakarta.annotation.Nonnull
    public static Shift createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Shift();
    }
    /**
     * Gets the draftShift property value. The draft version of this shift that is viewable by managers. Required.
     * @return a ShiftItem
     */
    @jakarta.annotation.Nullable
    public ShiftItem getDraftShift() {
        return this.getBackingStore().get("draftShift");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("draftShift", (n) -> { this.setDraftShift(n.getObjectValue(ShiftItem::createFromDiscriminatorValue)); });
        deserializerMap.put("schedulingGroupId", (n) -> { this.setSchedulingGroupId(n.getStringValue()); });
        deserializerMap.put("sharedShift", (n) -> { this.setSharedShift(n.getObjectValue(ShiftItem::createFromDiscriminatorValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the schedulingGroupId property value. ID of the scheduling group the shift is part of. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSchedulingGroupId() {
        return this.getBackingStore().get("schedulingGroupId");
    }
    /**
     * Gets the sharedShift property value. The shared version of this shift that is viewable by both employees and managers. Required.
     * @return a ShiftItem
     */
    @jakarta.annotation.Nullable
    public ShiftItem getSharedShift() {
        return this.getBackingStore().get("sharedShift");
    }
    /**
     * Gets the userId property value. ID of the user assigned to the shift. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.getBackingStore().get("userId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("draftShift", this.getDraftShift());
        writer.writeStringValue("schedulingGroupId", this.getSchedulingGroupId());
        writer.writeObjectValue("sharedShift", this.getSharedShift());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the draftShift property value. The draft version of this shift that is viewable by managers. Required.
     * @param value Value to set for the draftShift property.
     */
    public void setDraftShift(@jakarta.annotation.Nullable final ShiftItem value) {
        this.getBackingStore().set("draftShift", value);
    }
    /**
     * Sets the schedulingGroupId property value. ID of the scheduling group the shift is part of. Required.
     * @param value Value to set for the schedulingGroupId property.
     */
    public void setSchedulingGroupId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("schedulingGroupId", value);
    }
    /**
     * Sets the sharedShift property value. The shared version of this shift that is viewable by both employees and managers. Required.
     * @param value Value to set for the sharedShift property.
     */
    public void setSharedShift(@jakarta.annotation.Nullable final ShiftItem value) {
        this.getBackingStore().set("sharedShift", value);
    }
    /**
     * Sets the userId property value. ID of the user assigned to the shift. Required.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("userId", value);
    }
}
