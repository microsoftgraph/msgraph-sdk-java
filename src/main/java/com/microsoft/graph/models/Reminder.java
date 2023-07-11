package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Reminder implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Identifies the version of the reminder. Every time the reminder is changed, changeKey changes as well. This allows Exchange to apply changes to the correct version of the object.
     */
    private String changeKey;
    /**
     * The date, time and time zone that the event ends.
     */
    private DateTimeTimeZone eventEndTime;
    /**
     * The unique ID of the event. Read only.
     */
    private String eventId;
    /**
     * The location of the event.
     */
    private Location eventLocation;
    /**
     * The date, time, and time zone that the event starts.
     */
    private DateTimeTimeZone eventStartTime;
    /**
     * The text of the event's subject line.
     */
    private String eventSubject;
    /**
     * The URL to open the event in Outlook on the web.The event will open in the browser if you are logged in to your mailbox via Outlook on the web. You will be prompted to login if you are not already logged in with the browser.This URL cannot be accessed from within an iFrame.
     */
    private String eventWebLink;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The date, time, and time zone that the reminder is set to occur.
     */
    private DateTimeTimeZone reminderFireTime;
    /**
     * Instantiates a new reminder and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Reminder() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a reminder
     */
    @javax.annotation.Nonnull
    public static Reminder createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Reminder();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the changeKey property value. Identifies the version of the reminder. Every time the reminder is changed, changeKey changes as well. This allows Exchange to apply changes to the correct version of the object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getChangeKey() {
        return this.changeKey;
    }
    /**
     * Gets the eventEndTime property value. The date, time and time zone that the event ends.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getEventEndTime() {
        return this.eventEndTime;
    }
    /**
     * Gets the eventId property value. The unique ID of the event. Read only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEventId() {
        return this.eventId;
    }
    /**
     * Gets the eventLocation property value. The location of the event.
     * @return a location
     */
    @javax.annotation.Nullable
    public Location getEventLocation() {
        return this.eventLocation;
    }
    /**
     * Gets the eventStartTime property value. The date, time, and time zone that the event starts.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getEventStartTime() {
        return this.eventStartTime;
    }
    /**
     * Gets the eventSubject property value. The text of the event's subject line.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEventSubject() {
        return this.eventSubject;
    }
    /**
     * Gets the eventWebLink property value. The URL to open the event in Outlook on the web.The event will open in the browser if you are logged in to your mailbox via Outlook on the web. You will be prompted to login if you are not already logged in with the browser.This URL cannot be accessed from within an iFrame.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEventWebLink() {
        return this.eventWebLink;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the reminderFireTime property value. The date, time, and time zone that the reminder is set to occur.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getReminderFireTime() {
        return this.reminderFireTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the changeKey property value. Identifies the version of the reminder. Every time the reminder is changed, changeKey changes as well. This allows Exchange to apply changes to the correct version of the object.
     * @param value Value to set for the changeKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChangeKey(@javax.annotation.Nullable final String value) {
        this.changeKey = value;
    }
    /**
     * Sets the eventEndTime property value. The date, time and time zone that the event ends.
     * @param value Value to set for the eventEndTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventEndTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this.eventEndTime = value;
    }
    /**
     * Sets the eventId property value. The unique ID of the event. Read only.
     * @param value Value to set for the eventId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventId(@javax.annotation.Nullable final String value) {
        this.eventId = value;
    }
    /**
     * Sets the eventLocation property value. The location of the event.
     * @param value Value to set for the eventLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventLocation(@javax.annotation.Nullable final Location value) {
        this.eventLocation = value;
    }
    /**
     * Sets the eventStartTime property value. The date, time, and time zone that the event starts.
     * @param value Value to set for the eventStartTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventStartTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this.eventStartTime = value;
    }
    /**
     * Sets the eventSubject property value. The text of the event's subject line.
     * @param value Value to set for the eventSubject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventSubject(@javax.annotation.Nullable final String value) {
        this.eventSubject = value;
    }
    /**
     * Sets the eventWebLink property value. The URL to open the event in Outlook on the web.The event will open in the browser if you are logged in to your mailbox via Outlook on the web. You will be prompted to login if you are not already logged in with the browser.This URL cannot be accessed from within an iFrame.
     * @param value Value to set for the eventWebLink property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventWebLink(@javax.annotation.Nullable final String value) {
        this.eventWebLink = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the reminderFireTime property value. The date, time, and time zone that the reminder is set to occur.
     * @param value Value to set for the reminderFireTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReminderFireTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this.reminderFireTime = value;
    }
}
