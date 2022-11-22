package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttendanceInterval implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Duration of the meeting interval in seconds; that is, the difference between joinDateTime and leaveDateTime. */
    private Integer _durationInSeconds;
    /** The time the attendee joined in UTC. */
    private OffsetDateTime _joinDateTime;
    /** The time the attendee left in UTC. */
    private OffsetDateTime _leaveDateTime;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new attendanceInterval and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AttendanceInterval() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attendanceInterval
     */
    @javax.annotation.Nonnull
    public static AttendanceInterval createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttendanceInterval();
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
     * Gets the durationInSeconds property value. Duration of the meeting interval in seconds; that is, the difference between joinDateTime and leaveDateTime.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDurationInSeconds() {
        return this._durationInSeconds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("durationInSeconds", (n) -> { this.setDurationInSeconds(n.getIntegerValue()); });
        deserializerMap.put("joinDateTime", (n) -> { this.setJoinDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("leaveDateTime", (n) -> { this.setLeaveDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the joinDateTime property value. The time the attendee joined in UTC.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getJoinDateTime() {
        return this._joinDateTime;
    }
    /**
     * Gets the leaveDateTime property value. The time the attendee left in UTC.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLeaveDateTime() {
        return this._leaveDateTime;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("durationInSeconds", this.getDurationInSeconds());
        writer.writeOffsetDateTimeValue("joinDateTime", this.getJoinDateTime());
        writer.writeOffsetDateTimeValue("leaveDateTime", this.getLeaveDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the durationInSeconds property value. Duration of the meeting interval in seconds; that is, the difference between joinDateTime and leaveDateTime.
     * @param value Value to set for the durationInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDurationInSeconds(@javax.annotation.Nullable final Integer value) {
        this._durationInSeconds = value;
    }
    /**
     * Sets the joinDateTime property value. The time the attendee joined in UTC.
     * @param value Value to set for the joinDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJoinDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._joinDateTime = value;
    }
    /**
     * Sets the leaveDateTime property value. The time the attendee left in UTC.
     * @param value Value to set for the leaveDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLeaveDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._leaveDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
