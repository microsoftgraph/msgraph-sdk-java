package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BookingWorkTimeSlot implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The time of the day when work stops. For example, 17:00:00.0000000. */
    private LocalTime _endTime;
    /** The OdataType property */
    private String _odataType;
    /** The time of the day when work starts. For example, 08:00:00.0000000. */
    private LocalTime _startTime;
    /**
     * Instantiates a new bookingWorkTimeSlot and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BookingWorkTimeSlot() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.bookingWorkTimeSlot");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bookingWorkTimeSlot
     */
    @javax.annotation.Nonnull
    public static BookingWorkTimeSlot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingWorkTimeSlot();
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
     * Gets the endTime property value. The time of the day when work stops. For example, 17:00:00.0000000.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getEndTime() {
        return this._endTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BookingWorkTimeSlot currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("endTime", (n) -> { currentObject.setEndTime(n.getLocalTimeValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("startTime", (n) -> { currentObject.setStartTime(n.getLocalTimeValue()); });
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
     * Gets the startTime property value. The time of the day when work starts. For example, 08:00:00.0000000.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getStartTime() {
        return this._startTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLocalTimeValue("endTime", this.getEndTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLocalTimeValue("startTime", this.getStartTime());
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
     * Sets the endTime property value. The time of the day when work stops. For example, 17:00:00.0000000.
     * @param value Value to set for the endTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndTime(@javax.annotation.Nullable final LocalTime value) {
        this._endTime = value;
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
    /**
     * Sets the startTime property value. The time of the day when work starts. For example, 08:00:00.0000000.
     * @param value Value to set for the startTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartTime(@javax.annotation.Nullable final LocalTime value) {
        this._startTime = value;
    }
}
