package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Reminder implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link Reminder} and sets the default values.
     */
    public Reminder() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Reminder}
     */
    @jakarta.annotation.Nonnull
    public static Reminder createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Reminder();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the changeKey property value. Identifies the version of the reminder. Every time the reminder is changed, changeKey changes as well. This allows Exchange to apply changes to the correct version of the object.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChangeKey() {
        return this.backingStore.get("changeKey");
    }
    /**
     * Gets the eventEndTime property value. The date, time and time zone that the event ends.
     * @return a {@link DateTimeTimeZone}
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getEventEndTime() {
        return this.backingStore.get("eventEndTime");
    }
    /**
     * Gets the eventId property value. The unique ID of the event. Read only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEventId() {
        return this.backingStore.get("eventId");
    }
    /**
     * Gets the eventLocation property value. The location of the event.
     * @return a {@link Location}
     */
    @jakarta.annotation.Nullable
    public Location getEventLocation() {
        return this.backingStore.get("eventLocation");
    }
    /**
     * Gets the eventStartTime property value. The date, time, and time zone that the event starts.
     * @return a {@link DateTimeTimeZone}
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getEventStartTime() {
        return this.backingStore.get("eventStartTime");
    }
    /**
     * Gets the eventSubject property value. The text of the event's subject line.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEventSubject() {
        return this.backingStore.get("eventSubject");
    }
    /**
     * Gets the eventWebLink property value. The URL to open the event in Outlook on the web.The event opens in the browser if you're logged in to your mailbox via Outlook on the web. You're prompted to log in if you aren't already logged in with the browser.This URL can't be accessed from within an iFrame.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEventWebLink() {
        return this.backingStore.get("eventWebLink");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("changeKey", (n) -> { this.setChangeKey(n.getStringValue()); });
        deserializerMap.put("eventEndTime", (n) -> { this.setEventEndTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("eventId", (n) -> { this.setEventId(n.getStringValue()); });
        deserializerMap.put("eventLocation", (n) -> { this.setEventLocation(n.getObjectValue(Location::createFromDiscriminatorValue)); });
        deserializerMap.put("eventStartTime", (n) -> { this.setEventStartTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("eventSubject", (n) -> { this.setEventSubject(n.getStringValue()); });
        deserializerMap.put("eventWebLink", (n) -> { this.setEventWebLink(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("reminderFireTime", (n) -> { this.setReminderFireTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the reminderFireTime property value. The date, time, and time zone that the reminder is set to occur.
     * @return a {@link DateTimeTimeZone}
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getReminderFireTime() {
        return this.backingStore.get("reminderFireTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("changeKey", this.getChangeKey());
        writer.writeObjectValue("eventEndTime", this.getEventEndTime());
        writer.writeStringValue("eventId", this.getEventId());
        writer.writeObjectValue("eventLocation", this.getEventLocation());
        writer.writeObjectValue("eventStartTime", this.getEventStartTime());
        writer.writeStringValue("eventSubject", this.getEventSubject());
        writer.writeStringValue("eventWebLink", this.getEventWebLink());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("reminderFireTime", this.getReminderFireTime());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the changeKey property value. Identifies the version of the reminder. Every time the reminder is changed, changeKey changes as well. This allows Exchange to apply changes to the correct version of the object.
     * @param value Value to set for the changeKey property.
     */
    public void setChangeKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("changeKey", value);
    }
    /**
     * Sets the eventEndTime property value. The date, time and time zone that the event ends.
     * @param value Value to set for the eventEndTime property.
     */
    public void setEventEndTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.backingStore.set("eventEndTime", value);
    }
    /**
     * Sets the eventId property value. The unique ID of the event. Read only.
     * @param value Value to set for the eventId property.
     */
    public void setEventId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("eventId", value);
    }
    /**
     * Sets the eventLocation property value. The location of the event.
     * @param value Value to set for the eventLocation property.
     */
    public void setEventLocation(@jakarta.annotation.Nullable final Location value) {
        this.backingStore.set("eventLocation", value);
    }
    /**
     * Sets the eventStartTime property value. The date, time, and time zone that the event starts.
     * @param value Value to set for the eventStartTime property.
     */
    public void setEventStartTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.backingStore.set("eventStartTime", value);
    }
    /**
     * Sets the eventSubject property value. The text of the event's subject line.
     * @param value Value to set for the eventSubject property.
     */
    public void setEventSubject(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("eventSubject", value);
    }
    /**
     * Sets the eventWebLink property value. The URL to open the event in Outlook on the web.The event opens in the browser if you're logged in to your mailbox via Outlook on the web. You're prompted to log in if you aren't already logged in with the browser.This URL can't be accessed from within an iFrame.
     * @param value Value to set for the eventWebLink property.
     */
    public void setEventWebLink(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("eventWebLink", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the reminderFireTime property value. The date, time, and time zone that the reminder is set to occur.
     * @param value Value to set for the reminderFireTime property.
     */
    public void setReminderFireTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.backingStore.set("reminderFireTime", value);
    }
}
