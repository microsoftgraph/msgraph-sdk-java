package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewHistoryInstance extends Entity implements Parsable {
    /**
     * Instantiates a new AccessReviewHistoryInstance and sets the default values.
     */
    public AccessReviewHistoryInstance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessReviewHistoryInstance
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewHistoryInstance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewHistoryInstance();
    }
    /**
     * Gets the downloadUri property value. Uri that can be used to retrieve review history data. This URI will be active for 24 hours after being generated. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDownloadUri() {
        return this.backingStore.get("downloadUri");
    }
    /**
     * Gets the expirationDateTime property value. Timestamp when this instance and associated data expires and the history is deleted. Required.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("downloadUri", (n) -> { this.setDownloadUri(n.getStringValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("fulfilledDateTime", (n) -> { this.setFulfilledDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("reviewHistoryPeriodEndDateTime", (n) -> { this.setReviewHistoryPeriodEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("reviewHistoryPeriodStartDateTime", (n) -> { this.setReviewHistoryPeriodStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("runDateTime", (n) -> { this.setRunDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(AccessReviewHistoryStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fulfilledDateTime property value. Timestamp when all of the available data for this instance was collected and is set after this instance's status is set to done. Required.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFulfilledDateTime() {
        return this.backingStore.get("fulfilledDateTime");
    }
    /**
     * Gets the reviewHistoryPeriodEndDateTime property value. Timestamp reviews ending on or before this date will be included in the fetched history data.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReviewHistoryPeriodEndDateTime() {
        return this.backingStore.get("reviewHistoryPeriodEndDateTime");
    }
    /**
     * Gets the reviewHistoryPeriodStartDateTime property value. Timestamp reviews starting on or after this date will be included in the fetched history data.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReviewHistoryPeriodStartDateTime() {
        return this.backingStore.get("reviewHistoryPeriodStartDateTime");
    }
    /**
     * Gets the runDateTime property value. Timestamp when the instance's history data is scheduled to be generated.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRunDateTime() {
        return this.backingStore.get("runDateTime");
    }
    /**
     * Gets the status property value. Represents the status of the review history data collection. The possible values are: done, inProgress, error, requested, unknownFutureValue. Once the status has been marked as done, a link can be generated to retrieve the instance's data by calling generateDownloadUri method.
     * @return a AccessReviewHistoryStatus
     */
    @jakarta.annotation.Nullable
    public AccessReviewHistoryStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("downloadUri", this.getDownloadUri());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeOffsetDateTimeValue("fulfilledDateTime", this.getFulfilledDateTime());
        writer.writeOffsetDateTimeValue("reviewHistoryPeriodEndDateTime", this.getReviewHistoryPeriodEndDateTime());
        writer.writeOffsetDateTimeValue("reviewHistoryPeriodStartDateTime", this.getReviewHistoryPeriodStartDateTime());
        writer.writeOffsetDateTimeValue("runDateTime", this.getRunDateTime());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the downloadUri property value. Uri that can be used to retrieve review history data. This URI will be active for 24 hours after being generated. Required.
     * @param value Value to set for the downloadUri property.
     */
    public void setDownloadUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("downloadUri", value);
    }
    /**
     * Sets the expirationDateTime property value. Timestamp when this instance and associated data expires and the history is deleted. Required.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the fulfilledDateTime property value. Timestamp when all of the available data for this instance was collected and is set after this instance's status is set to done. Required.
     * @param value Value to set for the fulfilledDateTime property.
     */
    public void setFulfilledDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("fulfilledDateTime", value);
    }
    /**
     * Sets the reviewHistoryPeriodEndDateTime property value. Timestamp reviews ending on or before this date will be included in the fetched history data.
     * @param value Value to set for the reviewHistoryPeriodEndDateTime property.
     */
    public void setReviewHistoryPeriodEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("reviewHistoryPeriodEndDateTime", value);
    }
    /**
     * Sets the reviewHistoryPeriodStartDateTime property value. Timestamp reviews starting on or after this date will be included in the fetched history data.
     * @param value Value to set for the reviewHistoryPeriodStartDateTime property.
     */
    public void setReviewHistoryPeriodStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("reviewHistoryPeriodStartDateTime", value);
    }
    /**
     * Sets the runDateTime property value. Timestamp when the instance's history data is scheduled to be generated.
     * @param value Value to set for the runDateTime property.
     */
    public void setRunDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("runDateTime", value);
    }
    /**
     * Sets the status property value. Represents the status of the review history data collection. The possible values are: done, inProgress, error, requested, unknownFutureValue. Once the status has been marked as done, a link can be generated to retrieve the instance's data by calling generateDownloadUri method.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final AccessReviewHistoryStatus value) {
        this.backingStore.set("status", value);
    }
}
