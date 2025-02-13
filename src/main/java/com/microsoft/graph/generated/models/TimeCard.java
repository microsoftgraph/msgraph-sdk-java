package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TimeCard extends ChangeTrackedEntity implements Parsable {
    /**
     * Instantiates a new {@link TimeCard} and sets the default values.
     */
    public TimeCard() {
        super();
        this.setOdataType("#microsoft.graph.timeCard");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TimeCard}
     */
    @jakarta.annotation.Nonnull
    public static TimeCard createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeCard();
    }
    /**
     * Gets the breaks property value. The list of breaks associated with the timeCard.
     * @return a {@link java.util.List<TimeCardBreak>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TimeCardBreak> getBreaks() {
        return this.backingStore.get("breaks");
    }
    /**
     * Gets the clockInEvent property value. The clock-in event of the timeCard.
     * @return a {@link TimeCardEvent}
     */
    @jakarta.annotation.Nullable
    public TimeCardEvent getClockInEvent() {
        return this.backingStore.get("clockInEvent");
    }
    /**
     * Gets the clockOutEvent property value. The clock-out event of the timeCard.
     * @return a {@link TimeCardEvent}
     */
    @jakarta.annotation.Nullable
    public TimeCardEvent getClockOutEvent() {
        return this.backingStore.get("clockOutEvent");
    }
    /**
     * Gets the confirmedBy property value. Indicates whether this timeCard entry is confirmed. Possible values are: none, user, manager, unknownFutureValue.
     * @return a {@link EnumSet<ConfirmedBy>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<ConfirmedBy> getConfirmedBy() {
        return this.backingStore.get("confirmedBy");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("breaks", (n) -> { this.setBreaks(n.getCollectionOfObjectValues(TimeCardBreak::createFromDiscriminatorValue)); });
        deserializerMap.put("clockInEvent", (n) -> { this.setClockInEvent(n.getObjectValue(TimeCardEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("clockOutEvent", (n) -> { this.setClockOutEvent(n.getObjectValue(TimeCardEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("confirmedBy", (n) -> { this.setConfirmedBy(n.getEnumSetValue(ConfirmedBy::forValue)); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("originalEntry", (n) -> { this.setOriginalEntry(n.getObjectValue(TimeCardEntry::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(TimeCardState::forValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the notes property value. Notes about the timeCard.
     * @return a {@link ItemBody}
     */
    @jakarta.annotation.Nullable
    public ItemBody getNotes() {
        return this.backingStore.get("notes");
    }
    /**
     * Gets the originalEntry property value. The original timeCardEntry of the timeCard before it was edited.
     * @return a {@link TimeCardEntry}
     */
    @jakarta.annotation.Nullable
    public TimeCardEntry getOriginalEntry() {
        return this.backingStore.get("originalEntry");
    }
    /**
     * Gets the state property value. The current state of the timeCard during its life cycle. The possible values are: clockedIn, onBreak, clockedOut, unknownFutureValue.
     * @return a {@link TimeCardState}
     */
    @jakarta.annotation.Nullable
    public TimeCardState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the userId property value. User ID to which the timeCard belongs.
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
        writer.writeCollectionOfObjectValues("breaks", this.getBreaks());
        writer.writeObjectValue("clockInEvent", this.getClockInEvent());
        writer.writeObjectValue("clockOutEvent", this.getClockOutEvent());
        writer.writeEnumSetValue("confirmedBy", this.getConfirmedBy());
        writer.writeObjectValue("notes", this.getNotes());
        writer.writeObjectValue("originalEntry", this.getOriginalEntry());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the breaks property value. The list of breaks associated with the timeCard.
     * @param value Value to set for the breaks property.
     */
    public void setBreaks(@jakarta.annotation.Nullable final java.util.List<TimeCardBreak> value) {
        this.backingStore.set("breaks", value);
    }
    /**
     * Sets the clockInEvent property value. The clock-in event of the timeCard.
     * @param value Value to set for the clockInEvent property.
     */
    public void setClockInEvent(@jakarta.annotation.Nullable final TimeCardEvent value) {
        this.backingStore.set("clockInEvent", value);
    }
    /**
     * Sets the clockOutEvent property value. The clock-out event of the timeCard.
     * @param value Value to set for the clockOutEvent property.
     */
    public void setClockOutEvent(@jakarta.annotation.Nullable final TimeCardEvent value) {
        this.backingStore.set("clockOutEvent", value);
    }
    /**
     * Sets the confirmedBy property value. Indicates whether this timeCard entry is confirmed. Possible values are: none, user, manager, unknownFutureValue.
     * @param value Value to set for the confirmedBy property.
     */
    public void setConfirmedBy(@jakarta.annotation.Nullable final EnumSet<ConfirmedBy> value) {
        this.backingStore.set("confirmedBy", value);
    }
    /**
     * Sets the notes property value. Notes about the timeCard.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final ItemBody value) {
        this.backingStore.set("notes", value);
    }
    /**
     * Sets the originalEntry property value. The original timeCardEntry of the timeCard before it was edited.
     * @param value Value to set for the originalEntry property.
     */
    public void setOriginalEntry(@jakarta.annotation.Nullable final TimeCardEntry value) {
        this.backingStore.set("originalEntry", value);
    }
    /**
     * Sets the state property value. The current state of the timeCard during its life cycle. The possible values are: clockedIn, onBreak, clockedOut, unknownFutureValue.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final TimeCardState value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the userId property value. User ID to which the timeCard belongs.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}
