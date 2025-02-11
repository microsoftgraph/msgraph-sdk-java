package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DayNote extends ChangeTrackedEntity implements Parsable {
    /**
     * Instantiates a new {@link DayNote} and sets the default values.
     */
    public DayNote() {
        super();
        this.setOdataType("#microsoft.graph.dayNote");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DayNote}
     */
    @jakarta.annotation.Nonnull
    public static DayNote createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DayNote();
    }
    /**
     * Gets the dayNoteDate property value. The date of the day note.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getDayNoteDate() {
        return this.backingStore.get("dayNoteDate");
    }
    /**
     * Gets the draftDayNote property value. The draft version of this day note that is viewable by managers. Only contentType text is supported.
     * @return a {@link ItemBody}
     */
    @jakarta.annotation.Nullable
    public ItemBody getDraftDayNote() {
        return this.backingStore.get("draftDayNote");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("dayNoteDate", (n) -> { this.setDayNoteDate(n.getLocalDateValue()); });
        deserializerMap.put("draftDayNote", (n) -> { this.setDraftDayNote(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("sharedDayNote", (n) -> { this.setSharedDayNote(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the sharedDayNote property value. The shared version of this day note that is viewable by both employees and managers. Only contentType text is supported.
     * @return a {@link ItemBody}
     */
    @jakarta.annotation.Nullable
    public ItemBody getSharedDayNote() {
        return this.backingStore.get("sharedDayNote");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLocalDateValue("dayNoteDate", this.getDayNoteDate());
        writer.writeObjectValue("draftDayNote", this.getDraftDayNote());
        writer.writeObjectValue("sharedDayNote", this.getSharedDayNote());
    }
    /**
     * Sets the dayNoteDate property value. The date of the day note.
     * @param value Value to set for the dayNoteDate property.
     */
    public void setDayNoteDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("dayNoteDate", value);
    }
    /**
     * Sets the draftDayNote property value. The draft version of this day note that is viewable by managers. Only contentType text is supported.
     * @param value Value to set for the draftDayNote property.
     */
    public void setDraftDayNote(@jakarta.annotation.Nullable final ItemBody value) {
        this.backingStore.set("draftDayNote", value);
    }
    /**
     * Sets the sharedDayNote property value. The shared version of this day note that is viewable by both employees and managers. Only contentType text is supported.
     * @param value Value to set for the sharedDayNote property.
     */
    public void setSharedDayNote(@jakarta.annotation.Nullable final ItemBody value) {
        this.backingStore.set("sharedDayNote", value);
    }
}
