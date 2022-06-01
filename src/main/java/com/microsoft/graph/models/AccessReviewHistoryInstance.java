package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the identityGovernance singleton. */
public class AccessReviewHistoryInstance extends Entity implements Parsable {
    /** Uri which can be used to retrieve review history data. This URI will be active for 24 hours after being generated. Required. */
    private String _downloadUri;
    /** Timestamp when this instance and associated data expires and the history is deleted. Required. */
    private OffsetDateTime _expirationDateTime;
    /** Timestamp when all of the available data for this instance was collected. This will be set after this instance's status is set to done. Required. */
    private OffsetDateTime _fulfilledDateTime;
    /** Timestamp, reviews ending on or before this date will be included in the fetched history data. */
    private OffsetDateTime _reviewHistoryPeriodEndDateTime;
    /** Timestamp, reviews starting on or after this date will be included in the fetched history data. */
    private OffsetDateTime _reviewHistoryPeriodStartDateTime;
    /** Timestamp when the instance's history data is scheduled to be generated. */
    private OffsetDateTime _runDateTime;
    /** Represents the status of the review history data collection. The possible values are: done, inProgress, error, requested, unknownFutureValue. Once the status has been marked as done, a link can be generated to retrieve the instance's data by calling generateDownloadUri method. */
    private AccessReviewHistoryStatus _status;
    /**
     * Instantiates a new accessReviewHistoryInstance and sets the default values.
     * @return a void
     */
    public AccessReviewHistoryInstance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessReviewHistoryInstance
     */
    @javax.annotation.Nonnull
    public static AccessReviewHistoryInstance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewHistoryInstance();
    }
    /**
     * Gets the downloadUri property value. Uri which can be used to retrieve review history data. This URI will be active for 24 hours after being generated. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDownloadUri() {
        return this._downloadUri;
    }
    /**
     * Gets the expirationDateTime property value. Timestamp when this instance and associated data expires and the history is deleted. Required.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessReviewHistoryInstance currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("downloadUri", (n) -> { currentObject.setDownloadUri(n.getStringValue()); });
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("fulfilledDateTime", (n) -> { currentObject.setFulfilledDateTime(n.getOffsetDateTimeValue()); });
            this.put("reviewHistoryPeriodEndDateTime", (n) -> { currentObject.setReviewHistoryPeriodEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("reviewHistoryPeriodStartDateTime", (n) -> { currentObject.setReviewHistoryPeriodStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("runDateTime", (n) -> { currentObject.setRunDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(AccessReviewHistoryStatus.class)); });
        }};
    }
    /**
     * Gets the fulfilledDateTime property value. Timestamp when all of the available data for this instance was collected. This will be set after this instance's status is set to done. Required.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getFulfilledDateTime() {
        return this._fulfilledDateTime;
    }
    /**
     * Gets the reviewHistoryPeriodEndDateTime property value. Timestamp, reviews ending on or before this date will be included in the fetched history data.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReviewHistoryPeriodEndDateTime() {
        return this._reviewHistoryPeriodEndDateTime;
    }
    /**
     * Gets the reviewHistoryPeriodStartDateTime property value. Timestamp, reviews starting on or after this date will be included in the fetched history data.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReviewHistoryPeriodStartDateTime() {
        return this._reviewHistoryPeriodStartDateTime;
    }
    /**
     * Gets the runDateTime property value. Timestamp when the instance's history data is scheduled to be generated.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRunDateTime() {
        return this._runDateTime;
    }
    /**
     * Gets the status property value. Represents the status of the review history data collection. The possible values are: done, inProgress, error, requested, unknownFutureValue. Once the status has been marked as done, a link can be generated to retrieve the instance's data by calling generateDownloadUri method.
     * @return a accessReviewHistoryStatus
     */
    @javax.annotation.Nullable
    public AccessReviewHistoryStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the downloadUri property value. Uri which can be used to retrieve review history data. This URI will be active for 24 hours after being generated. Required.
     * @param value Value to set for the downloadUri property.
     * @return a void
     */
    public void setDownloadUri(@javax.annotation.Nullable final String value) {
        this._downloadUri = value;
    }
    /**
     * Sets the expirationDateTime property value. Timestamp when this instance and associated data expires and the history is deleted. Required.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the fulfilledDateTime property value. Timestamp when all of the available data for this instance was collected. This will be set after this instance's status is set to done. Required.
     * @param value Value to set for the fulfilledDateTime property.
     * @return a void
     */
    public void setFulfilledDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._fulfilledDateTime = value;
    }
    /**
     * Sets the reviewHistoryPeriodEndDateTime property value. Timestamp, reviews ending on or before this date will be included in the fetched history data.
     * @param value Value to set for the reviewHistoryPeriodEndDateTime property.
     * @return a void
     */
    public void setReviewHistoryPeriodEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._reviewHistoryPeriodEndDateTime = value;
    }
    /**
     * Sets the reviewHistoryPeriodStartDateTime property value. Timestamp, reviews starting on or after this date will be included in the fetched history data.
     * @param value Value to set for the reviewHistoryPeriodStartDateTime property.
     * @return a void
     */
    public void setReviewHistoryPeriodStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._reviewHistoryPeriodStartDateTime = value;
    }
    /**
     * Sets the runDateTime property value. Timestamp when the instance's history data is scheduled to be generated.
     * @param value Value to set for the runDateTime property.
     * @return a void
     */
    public void setRunDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._runDateTime = value;
    }
    /**
     * Sets the status property value. Represents the status of the review history data collection. The possible values are: done, inProgress, error, requested, unknownFutureValue. Once the status has been marked as done, a link can be generated to retrieve the instance's data by calling generateDownloadUri method.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final AccessReviewHistoryStatus value) {
        this._status = value;
    }
}
