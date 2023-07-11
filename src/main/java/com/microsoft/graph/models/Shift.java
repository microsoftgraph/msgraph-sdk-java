package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Shift extends ChangeTrackedEntity implements Parsable {
    /**
     * The draft version of this shift that is viewable by managers. Required.
     */
    private ShiftItem draftShift;
    /**
     * ID of the scheduling group the shift is part of. Required.
     */
    private String schedulingGroupId;
    /**
     * The shared version of this shift that is viewable by both employees and managers. Required.
     */
    private ShiftItem sharedShift;
    /**
     * ID of the user assigned to the shift. Required.
     */
    private String userId;
    /**
     * Instantiates a new shift and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Shift() {
        super();
        this.setOdataType("#microsoft.graph.shift");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a shift
     */
    @javax.annotation.Nonnull
    public static Shift createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Shift();
    }
    /**
     * Gets the draftShift property value. The draft version of this shift that is viewable by managers. Required.
     * @return a shiftItem
     */
    @javax.annotation.Nullable
    public ShiftItem getDraftShift() {
        return this.draftShift;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSchedulingGroupId() {
        return this.schedulingGroupId;
    }
    /**
     * Gets the sharedShift property value. The shared version of this shift that is viewable by both employees and managers. Required.
     * @return a shiftItem
     */
    @javax.annotation.Nullable
    public ShiftItem getSharedShift() {
        return this.sharedShift;
    }
    /**
     * Gets the userId property value. ID of the user assigned to the shift. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
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
        writer.writeObjectValue("draftShift", this.getDraftShift());
        writer.writeStringValue("schedulingGroupId", this.getSchedulingGroupId());
        writer.writeObjectValue("sharedShift", this.getSharedShift());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the draftShift property value. The draft version of this shift that is viewable by managers. Required.
     * @param value Value to set for the draftShift property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDraftShift(@javax.annotation.Nullable final ShiftItem value) {
        this.draftShift = value;
    }
    /**
     * Sets the schedulingGroupId property value. ID of the scheduling group the shift is part of. Required.
     * @param value Value to set for the schedulingGroupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchedulingGroupId(@javax.annotation.Nullable final String value) {
        this.schedulingGroupId = value;
    }
    /**
     * Sets the sharedShift property value. The shared version of this shift that is viewable by both employees and managers. Required.
     * @param value Value to set for the sharedShift property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedShift(@javax.annotation.Nullable final ShiftItem value) {
        this.sharedShift = value;
    }
    /**
     * Sets the userId property value. ID of the user assigned to the shift. Required.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
}
