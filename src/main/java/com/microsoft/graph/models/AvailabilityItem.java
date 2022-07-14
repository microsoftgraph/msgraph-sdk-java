package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AvailabilityItem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The endTime property */
    private LocalTime _endTime;
    /** Indicates the service ID in case of 1:n appointments. If the appointment is of type 1:n, this field will be present, otherwise, null. */
    private String _serviceId;
    /** The startTime property */
    private LocalTime _startTime;
    /** The status of the staff member. Possible values are: available, busy, slotsAvailable, outOfOffice, unknownFutureValue. */
    private BookingsAvailabilityStatus _status;
    /**
     * Instantiates a new availabilityItem and sets the default values.
     * @return a void
     */
    public AvailabilityItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a availabilityItem
     */
    @javax.annotation.Nonnull
    public static AvailabilityItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AvailabilityItem();
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
     * Gets the endTime property value. The endTime property
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
        final AvailabilityItem currentObject = this;
        return new HashMap<>(4) {{
            this.put("endTime", (n) -> { currentObject.setEndTime(n.getLocalTimeValue()); });
            this.put("serviceId", (n) -> { currentObject.setServiceId(n.getStringValue()); });
            this.put("startTime", (n) -> { currentObject.setStartTime(n.getLocalTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(BookingsAvailabilityStatus.class)); });
        }};
    }
    /**
     * Gets the serviceId property value. Indicates the service ID in case of 1:n appointments. If the appointment is of type 1:n, this field will be present, otherwise, null.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceId() {
        return this._serviceId;
    }
    /**
     * Gets the startTime property value. The startTime property
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getStartTime() {
        return this._startTime;
    }
    /**
     * Gets the status property value. The status of the staff member. Possible values are: available, busy, slotsAvailable, outOfOffice, unknownFutureValue.
     * @return a bookingsAvailabilityStatus
     */
    @javax.annotation.Nullable
    public BookingsAvailabilityStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLocalTimeValue("endTime", this.getEndTime());
        writer.writeStringValue("serviceId", this.getServiceId());
        writer.writeLocalTimeValue("startTime", this.getStartTime());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the endTime property value. The endTime property
     * @param value Value to set for the endTime property.
     * @return a void
     */
    public void setEndTime(@javax.annotation.Nullable final LocalTime value) {
        this._endTime = value;
    }
    /**
     * Sets the serviceId property value. Indicates the service ID in case of 1:n appointments. If the appointment is of type 1:n, this field will be present, otherwise, null.
     * @param value Value to set for the serviceId property.
     * @return a void
     */
    public void setServiceId(@javax.annotation.Nullable final String value) {
        this._serviceId = value;
    }
    /**
     * Sets the startTime property value. The startTime property
     * @param value Value to set for the startTime property.
     * @return a void
     */
    public void setStartTime(@javax.annotation.Nullable final LocalTime value) {
        this._startTime = value;
    }
    /**
     * Sets the status property value. The status of the staff member. Possible values are: available, busy, slotsAvailable, outOfOffice, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final BookingsAvailabilityStatus value) {
        this._status = value;
    }
}
