package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OpenShift extends ChangeTrackedEntity implements Parsable {
    /**
     * Instantiates a new {@link OpenShift} and sets the default values.
     */
    public OpenShift() {
        super();
        this.setOdataType("#microsoft.graph.openShift");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OpenShift}
     */
    @jakarta.annotation.Nonnull
    public static OpenShift createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OpenShift();
    }
    /**
     * Gets the draftOpenShift property value. Draft changes in the openShift are only visible to managers until they're shared.
     * @return a {@link OpenShiftItem}
     */
    @jakarta.annotation.Nullable
    public OpenShiftItem getDraftOpenShift() {
        return this.backingStore.get("draftOpenShift");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("draftOpenShift", (n) -> { this.setDraftOpenShift(n.getObjectValue(OpenShiftItem::createFromDiscriminatorValue)); });
        deserializerMap.put("isStagedForDeletion", (n) -> { this.setIsStagedForDeletion(n.getBooleanValue()); });
        deserializerMap.put("schedulingGroupId", (n) -> { this.setSchedulingGroupId(n.getStringValue()); });
        deserializerMap.put("sharedOpenShift", (n) -> { this.setSharedOpenShift(n.getObjectValue(OpenShiftItem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isStagedForDeletion property value. The openShift is marked for deletion, a process that is finalized when the schedule is shared.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsStagedForDeletion() {
        return this.backingStore.get("isStagedForDeletion");
    }
    /**
     * Gets the schedulingGroupId property value. The ID of the schedulingGroup that contains the openShift.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSchedulingGroupId() {
        return this.backingStore.get("schedulingGroupId");
    }
    /**
     * Gets the sharedOpenShift property value. The shared version of this openShift that is viewable by both employees and managers.
     * @return a {@link OpenShiftItem}
     */
    @jakarta.annotation.Nullable
    public OpenShiftItem getSharedOpenShift() {
        return this.backingStore.get("sharedOpenShift");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("draftOpenShift", this.getDraftOpenShift());
        writer.writeBooleanValue("isStagedForDeletion", this.getIsStagedForDeletion());
        writer.writeStringValue("schedulingGroupId", this.getSchedulingGroupId());
        writer.writeObjectValue("sharedOpenShift", this.getSharedOpenShift());
    }
    /**
     * Sets the draftOpenShift property value. Draft changes in the openShift are only visible to managers until they're shared.
     * @param value Value to set for the draftOpenShift property.
     */
    public void setDraftOpenShift(@jakarta.annotation.Nullable final OpenShiftItem value) {
        this.backingStore.set("draftOpenShift", value);
    }
    /**
     * Sets the isStagedForDeletion property value. The openShift is marked for deletion, a process that is finalized when the schedule is shared.
     * @param value Value to set for the isStagedForDeletion property.
     */
    public void setIsStagedForDeletion(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isStagedForDeletion", value);
    }
    /**
     * Sets the schedulingGroupId property value. The ID of the schedulingGroup that contains the openShift.
     * @param value Value to set for the schedulingGroupId property.
     */
    public void setSchedulingGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("schedulingGroupId", value);
    }
    /**
     * Sets the sharedOpenShift property value. The shared version of this openShift that is viewable by both employees and managers.
     * @param value Value to set for the sharedOpenShift property.
     */
    public void setSharedOpenShift(@jakarta.annotation.Nullable final OpenShiftItem value) {
        this.backingStore.set("sharedOpenShift", value);
    }
}
