package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of dataPolicyOperation entities. */
public class DataPolicyOperation extends Entity implements Parsable {
    /** Represents when the request for this data policy operation was completed, in UTC time, using the ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Null until the operation completes. */
    private OffsetDateTime _completedDateTime;
    /** Specifies the progress of an operation. */
    private Double _progress;
    /** Possible values are: notStarted, running, complete, failed, unknownFutureValue. */
    private DataPolicyOperationStatus _status;
    /** The URL location to where data is being exported for export requests. */
    private String _storageLocation;
    /** Represents when the request for this data operation was submitted, in UTC time, using the ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _submittedDateTime;
    /** The id for the user on whom the operation is performed. */
    private String _userId;
    /**
     * Instantiates a new dataPolicyOperation and sets the default values.
     * @return a void
     */
    public DataPolicyOperation() {
        super();
        this.setOdataType("#microsoft.graph.dataPolicyOperation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a dataPolicyOperation
     */
    @javax.annotation.Nonnull
    public static DataPolicyOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DataPolicyOperation();
    }
    /**
     * Gets the completedDateTime property value. Represents when the request for this data policy operation was completed, in UTC time, using the ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Null until the operation completes.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this._completedDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DataPolicyOperation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("completedDateTime", (n) -> { currentObject.setCompletedDateTime(n.getOffsetDateTimeValue()); });
            this.put("progress", (n) -> { currentObject.setProgress(n.getDoubleValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(DataPolicyOperationStatus.class)); });
            this.put("storageLocation", (n) -> { currentObject.setStorageLocation(n.getStringValue()); });
            this.put("submittedDateTime", (n) -> { currentObject.setSubmittedDateTime(n.getOffsetDateTimeValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the progress property value. Specifies the progress of an operation.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getProgress() {
        return this._progress;
    }
    /**
     * Gets the status property value. Possible values are: notStarted, running, complete, failed, unknownFutureValue.
     * @return a dataPolicyOperationStatus
     */
    @javax.annotation.Nullable
    public DataPolicyOperationStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the storageLocation property value. The URL location to where data is being exported for export requests.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStorageLocation() {
        return this._storageLocation;
    }
    /**
     * Gets the submittedDateTime property value. Represents when the request for this data operation was submitted, in UTC time, using the ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSubmittedDateTime() {
        return this._submittedDateTime;
    }
    /**
     * Gets the userId property value. The id for the user on whom the operation is performed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeDoubleValue("progress", this.getProgress());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("storageLocation", this.getStorageLocation());
        writer.writeOffsetDateTimeValue("submittedDateTime", this.getSubmittedDateTime());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the completedDateTime property value. Represents when the request for this data policy operation was completed, in UTC time, using the ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Null until the operation completes.
     * @param value Value to set for the completedDateTime property.
     * @return a void
     */
    public void setCompletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._completedDateTime = value;
    }
    /**
     * Sets the progress property value. Specifies the progress of an operation.
     * @param value Value to set for the progress property.
     * @return a void
     */
    public void setProgress(@javax.annotation.Nullable final Double value) {
        this._progress = value;
    }
    /**
     * Sets the status property value. Possible values are: notStarted, running, complete, failed, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final DataPolicyOperationStatus value) {
        this._status = value;
    }
    /**
     * Sets the storageLocation property value. The URL location to where data is being exported for export requests.
     * @param value Value to set for the storageLocation property.
     * @return a void
     */
    public void setStorageLocation(@javax.annotation.Nullable final String value) {
        this._storageLocation = value;
    }
    /**
     * Sets the submittedDateTime property value. Represents when the request for this data operation was submitted, in UTC time, using the ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the submittedDateTime property.
     * @return a void
     */
    public void setSubmittedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._submittedDateTime = value;
    }
    /**
     * Sets the userId property value. The id for the user on whom the operation is performed.
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
}
