package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AttendanceInterval implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Duration of the meeting interval in seconds; that is, the difference between joinDateTime and leaveDateTime.
     */
    private Integer durationInSeconds;
    /**
     * The time the attendee joined in UTC.
     */
    private OffsetDateTime joinDateTime;
    /**
     * The time the attendee left in UTC.
     */
    private OffsetDateTime leaveDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new AttendanceInterval and sets the default values.
     */
    public AttendanceInterval() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AttendanceInterval
     */
    @jakarta.annotation.Nonnull
    public static AttendanceInterval createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttendanceInterval();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the durationInSeconds property value. Duration of the meeting interval in seconds; that is, the difference between joinDateTime and leaveDateTime.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDurationInSeconds() {
        return this.durationInSeconds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
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
    @jakarta.annotation.Nullable
    public OffsetDateTime getJoinDateTime() {
        return this.joinDateTime;
    }
    /**
     * Gets the leaveDateTime property value. The time the attendee left in UTC.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLeaveDateTime() {
        return this.leaveDateTime;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("durationInSeconds", this.getDurationInSeconds());
        writer.writeOffsetDateTimeValue("joinDateTime", this.getJoinDateTime());
        writer.writeOffsetDateTimeValue("leaveDateTime", this.getLeaveDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the durationInSeconds property value. Duration of the meeting interval in seconds; that is, the difference between joinDateTime and leaveDateTime.
     * @param value Value to set for the durationInSeconds property.
     */
    public void setDurationInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.durationInSeconds = value;
    }
    /**
     * Sets the joinDateTime property value. The time the attendee joined in UTC.
     * @param value Value to set for the joinDateTime property.
     */
    public void setJoinDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.joinDateTime = value;
    }
    /**
     * Sets the leaveDateTime property value. The time the attendee left in UTC.
     * @param value Value to set for the leaveDateTime property.
     */
    public void setLeaveDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.leaveDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
