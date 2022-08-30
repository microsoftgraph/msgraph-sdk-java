package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ScheduleItem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The date, time, and time zone that the corresponding event ends. */
    private DateTimeTimeZone _end;
    /** The sensitivity of the corresponding event. True if the event is marked private, false otherwise. Optional. */
    private Boolean _isPrivate;
    /** The location where the corresponding event is held or attended from. Optional. */
    private String _location;
    /** The OdataType property */
    private String _odataType;
    /** The date, time, and time zone that the corresponding event starts. */
    private DateTimeTimeZone _start;
    /** The availability status of the user or resource during the corresponding event. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown. */
    private FreeBusyStatus _status;
    /** The corresponding event's subject line. Optional. */
    private String _subject;
    /**
     * Instantiates a new scheduleItem and sets the default values.
     * @return a void
     */
    public ScheduleItem() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.scheduleItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a scheduleItem
     */
    @javax.annotation.Nonnull
    public static ScheduleItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ScheduleItem();
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
     * Gets the end property value. The date, time, and time zone that the corresponding event ends.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getEnd() {
        return this._end;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ScheduleItem currentObject = this;
        return new HashMap<>(7) {{
            this.put("end", (n) -> { currentObject.setEnd(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
            this.put("isPrivate", (n) -> { currentObject.setIsPrivate(n.getBooleanValue()); });
            this.put("location", (n) -> { currentObject.setLocation(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("start", (n) -> { currentObject.setStart(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(FreeBusyStatus.class)); });
            this.put("subject", (n) -> { currentObject.setSubject(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isPrivate property value. The sensitivity of the corresponding event. True if the event is marked private, false otherwise. Optional.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPrivate() {
        return this._isPrivate;
    }
    /**
     * Gets the location property value. The location where the corresponding event is held or attended from. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocation() {
        return this._location;
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
     * Gets the start property value. The date, time, and time zone that the corresponding event starts.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getStart() {
        return this._start;
    }
    /**
     * Gets the status property value. The availability status of the user or resource during the corresponding event. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
     * @return a freeBusyStatus
     */
    @javax.annotation.Nullable
    public FreeBusyStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the subject property value. The corresponding event's subject line. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this._subject;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("end", this.getEnd());
        writer.writeBooleanValue("isPrivate", this.getIsPrivate());
        writer.writeStringValue("location", this.getLocation());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("start", this.getStart());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("subject", this.getSubject());
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
     * Sets the end property value. The date, time, and time zone that the corresponding event ends.
     * @param value Value to set for the end property.
     * @return a void
     */
    public void setEnd(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._end = value;
    }
    /**
     * Sets the isPrivate property value. The sensitivity of the corresponding event. True if the event is marked private, false otherwise. Optional.
     * @param value Value to set for the isPrivate property.
     * @return a void
     */
    public void setIsPrivate(@javax.annotation.Nullable final Boolean value) {
        this._isPrivate = value;
    }
    /**
     * Sets the location property value. The location where the corresponding event is held or attended from. Optional.
     * @param value Value to set for the location property.
     * @return a void
     */
    public void setLocation(@javax.annotation.Nullable final String value) {
        this._location = value;
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
     * Sets the start property value. The date, time, and time zone that the corresponding event starts.
     * @param value Value to set for the start property.
     * @return a void
     */
    public void setStart(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._start = value;
    }
    /**
     * Sets the status property value. The availability status of the user or resource during the corresponding event. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final FreeBusyStatus value) {
        this._status = value;
    }
    /**
     * Sets the subject property value. The corresponding event's subject line. Optional.
     * @param value Value to set for the subject property.
     * @return a void
     */
    public void setSubject(@javax.annotation.Nullable final String value) {
        this._subject = value;
    }
}
