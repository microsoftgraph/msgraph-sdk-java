package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Reminder implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Identifies the version of the reminder. Every time the reminder is changed, changeKey changes as well. This allows Exchange to apply changes to the correct version of the object. */
    private String _changeKey;
    /** The date, time and time zone that the event ends. */
    private DateTimeTimeZone _eventEndTime;
    /** The unique ID of the event. Read only. */
    private String _eventId;
    /** The location of the event. */
    private Location _eventLocation;
    /** The date, time, and time zone that the event starts. */
    private DateTimeTimeZone _eventStartTime;
    /** The text of the event's subject line. */
    private String _eventSubject;
    /** The URL to open the event in Outlook on the web.The event will open in the browser if you are logged in to your mailbox via Outlook on the web. You will be prompted to login if you are not already logged in with the browser.This URL cannot be accessed from within an iFrame. */
    private String _eventWebLink;
    /** The OdataType property */
    private String _odataType;
    /** The date, time, and time zone that the reminder is set to occur. */
    private DateTimeTimeZone _reminderFireTime;
    /**
     * Instantiates a new reminder and sets the default values.
     * @return a void
     */
    public Reminder() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.reminder");
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
        return this._additionalData;
    }
    /**
     * Gets the changeKey property value. Identifies the version of the reminder. Every time the reminder is changed, changeKey changes as well. This allows Exchange to apply changes to the correct version of the object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getChangeKey() {
        return this._changeKey;
    }
    /**
     * Gets the eventEndTime property value. The date, time and time zone that the event ends.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getEventEndTime() {
        return this._eventEndTime;
    }
    /**
     * Gets the eventId property value. The unique ID of the event. Read only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEventId() {
        return this._eventId;
    }
    /**
     * Gets the eventLocation property value. The location of the event.
     * @return a location
     */
    @javax.annotation.Nullable
    public Location getEventLocation() {
        return this._eventLocation;
    }
    /**
     * Gets the eventStartTime property value. The date, time, and time zone that the event starts.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getEventStartTime() {
        return this._eventStartTime;
    }
    /**
     * Gets the eventSubject property value. The text of the event's subject line.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEventSubject() {
        return this._eventSubject;
    }
    /**
     * Gets the eventWebLink property value. The URL to open the event in Outlook on the web.The event will open in the browser if you are logged in to your mailbox via Outlook on the web. You will be prompted to login if you are not already logged in with the browser.This URL cannot be accessed from within an iFrame.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEventWebLink() {
        return this._eventWebLink;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Reminder currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(9) {{
            this.put("changeKey", (n) -> { currentObject.setChangeKey(n.getStringValue()); });
            this.put("eventEndTime", (n) -> { currentObject.setEventEndTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
            this.put("eventId", (n) -> { currentObject.setEventId(n.getStringValue()); });
            this.put("eventLocation", (n) -> { currentObject.setEventLocation(n.getObjectValue(Location::createFromDiscriminatorValue)); });
            this.put("eventStartTime", (n) -> { currentObject.setEventStartTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
            this.put("eventSubject", (n) -> { currentObject.setEventSubject(n.getStringValue()); });
            this.put("eventWebLink", (n) -> { currentObject.setEventWebLink(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("reminderFireTime", (n) -> { currentObject.setReminderFireTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the reminderFireTime property value. The date, time, and time zone that the reminder is set to occur.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getReminderFireTime() {
        return this._reminderFireTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the changeKey property value. Identifies the version of the reminder. Every time the reminder is changed, changeKey changes as well. This allows Exchange to apply changes to the correct version of the object.
     * @param value Value to set for the changeKey property.
     * @return a void
     */
    public void setChangeKey(@javax.annotation.Nullable final String value) {
        this._changeKey = value;
    }
    /**
     * Sets the eventEndTime property value. The date, time and time zone that the event ends.
     * @param value Value to set for the eventEndTime property.
     * @return a void
     */
    public void setEventEndTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._eventEndTime = value;
    }
    /**
     * Sets the eventId property value. The unique ID of the event. Read only.
     * @param value Value to set for the eventId property.
     * @return a void
     */
    public void setEventId(@javax.annotation.Nullable final String value) {
        this._eventId = value;
    }
    /**
     * Sets the eventLocation property value. The location of the event.
     * @param value Value to set for the eventLocation property.
     * @return a void
     */
    public void setEventLocation(@javax.annotation.Nullable final Location value) {
        this._eventLocation = value;
    }
    /**
     * Sets the eventStartTime property value. The date, time, and time zone that the event starts.
     * @param value Value to set for the eventStartTime property.
     * @return a void
     */
    public void setEventStartTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._eventStartTime = value;
    }
    /**
     * Sets the eventSubject property value. The text of the event's subject line.
     * @param value Value to set for the eventSubject property.
     * @return a void
     */
    public void setEventSubject(@javax.annotation.Nullable final String value) {
        this._eventSubject = value;
    }
    /**
     * Sets the eventWebLink property value. The URL to open the event in Outlook on the web.The event will open in the browser if you are logged in to your mailbox via Outlook on the web. You will be prompted to login if you are not already logged in with the browser.This URL cannot be accessed from within an iFrame.
     * @param value Value to set for the eventWebLink property.
     * @return a void
     */
    public void setEventWebLink(@javax.annotation.Nullable final String value) {
        this._eventWebLink = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the reminderFireTime property value. The date, time, and time zone that the reminder is set to occur.
     * @param value Value to set for the reminderFireTime property.
     * @return a void
     */
    public void setReminderFireTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._reminderFireTime = value;
    }
}
