package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DataPolicyOperation extends Entity implements Parsable {
    /**
     * Instantiates a new DataPolicyOperation and sets the default values.
     */
    public DataPolicyOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DataPolicyOperation
     */
    @jakarta.annotation.Nonnull
    public static DataPolicyOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DataPolicyOperation();
    }
    /**
     * Gets the completedDateTime property value. Represents when the request for this data policy operation was completed, in UTC time, using the ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Null until the operation completes.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.backingStore.get("completedDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("progress", (n) -> { this.setProgress(n.getDoubleValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(DataPolicyOperationStatus::forValue)); });
        deserializerMap.put("storageLocation", (n) -> { this.setStorageLocation(n.getStringValue()); });
        deserializerMap.put("submittedDateTime", (n) -> { this.setSubmittedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the progress property value. Specifies the progress of an operation.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getProgress() {
        return this.backingStore.get("progress");
    }
    /**
     * Gets the status property value. Possible values are: notStarted, running, complete, failed, unknownFutureValue.
     * @return a DataPolicyOperationStatus
     */
    @jakarta.annotation.Nullable
    public DataPolicyOperationStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the storageLocation property value. The URL location to where data is being exported for export requests.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStorageLocation() {
        return this.backingStore.get("storageLocation");
    }
    /**
     * Gets the submittedDateTime property value. Represents when the request for this data operation was submitted, in UTC time, using the ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSubmittedDateTime() {
        return this.backingStore.get("submittedDateTime");
    }
    /**
     * Gets the userId property value. The id for the user on whom the operation is performed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("completedDateTime", value);
    }
    /**
     * Sets the progress property value. Specifies the progress of an operation.
     * @param value Value to set for the progress property.
     */
    public void setProgress(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("progress", value);
    }
    /**
     * Sets the status property value. Possible values are: notStarted, running, complete, failed, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final DataPolicyOperationStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the storageLocation property value. The URL location to where data is being exported for export requests.
     * @param value Value to set for the storageLocation property.
     */
    public void setStorageLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("storageLocation", value);
    }
    /**
     * Sets the submittedDateTime property value. Represents when the request for this data operation was submitted, in UTC time, using the ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the submittedDateTime property.
     */
    public void setSubmittedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("submittedDateTime", value);
    }
    /**
     * Sets the userId property value. The id for the user on whom the operation is performed.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}
