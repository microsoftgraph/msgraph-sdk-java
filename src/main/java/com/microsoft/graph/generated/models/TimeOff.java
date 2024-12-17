package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TimeOff extends ChangeTrackedEntity implements Parsable {
    /**
     * Instantiates a new {@link TimeOff} and sets the default values.
     */
    public TimeOff() {
        super();
        this.setOdataType("#microsoft.graph.timeOff");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TimeOff}
     */
    @jakarta.annotation.Nonnull
    public static TimeOff createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeOff();
    }
    /**
     * Gets the draftTimeOff property value. The draft version of this timeOff item that is viewable by managers. It must be shared before it's visible to team members. Required.
     * @return a {@link TimeOffItem}
     */
    @jakarta.annotation.Nullable
    public TimeOffItem getDraftTimeOff() {
        return this.backingStore.get("draftTimeOff");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("draftTimeOff", (n) -> { this.setDraftTimeOff(n.getObjectValue(TimeOffItem::createFromDiscriminatorValue)); });
        deserializerMap.put("isStagedForDeletion", (n) -> { this.setIsStagedForDeletion(n.getBooleanValue()); });
        deserializerMap.put("sharedTimeOff", (n) -> { this.setSharedTimeOff(n.getObjectValue(TimeOffItem::createFromDiscriminatorValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isStagedForDeletion property value. The timeOff is marked for deletion, a process that is finalized when the schedule is shared.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsStagedForDeletion() {
        return this.backingStore.get("isStagedForDeletion");
    }
    /**
     * Gets the sharedTimeOff property value. The shared version of this timeOff that is viewable by both employees and managers. Updates to the sharedTimeOff property send notifications to users in the Teams client. Required.
     * @return a {@link TimeOffItem}
     */
    @jakarta.annotation.Nullable
    public TimeOffItem getSharedTimeOff() {
        return this.backingStore.get("sharedTimeOff");
    }
    /**
     * Gets the userId property value. ID of the user assigned to the timeOff. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("draftTimeOff", this.getDraftTimeOff());
        writer.writeBooleanValue("isStagedForDeletion", this.getIsStagedForDeletion());
        writer.writeObjectValue("sharedTimeOff", this.getSharedTimeOff());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the draftTimeOff property value. The draft version of this timeOff item that is viewable by managers. It must be shared before it's visible to team members. Required.
     * @param value Value to set for the draftTimeOff property.
     */
    public void setDraftTimeOff(@jakarta.annotation.Nullable final TimeOffItem value) {
        this.backingStore.set("draftTimeOff", value);
    }
    /**
     * Sets the isStagedForDeletion property value. The timeOff is marked for deletion, a process that is finalized when the schedule is shared.
     * @param value Value to set for the isStagedForDeletion property.
     */
    public void setIsStagedForDeletion(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isStagedForDeletion", value);
    }
    /**
     * Sets the sharedTimeOff property value. The shared version of this timeOff that is viewable by both employees and managers. Updates to the sharedTimeOff property send notifications to users in the Teams client. Required.
     * @param value Value to set for the sharedTimeOff property.
     */
    public void setSharedTimeOff(@jakarta.annotation.Nullable final TimeOffItem value) {
        this.backingStore.set("sharedTimeOff", value);
    }
    /**
     * Sets the userId property value. ID of the user assigned to the timeOff. Required.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}
