package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointMigrationJobPostponedEvent extends SharePointMigrationEvent implements Parsable {
    /**
     * Instantiates a new {@link SharePointMigrationJobPostponedEvent} and sets the default values.
     */
    public SharePointMigrationJobPostponedEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointMigrationJobPostponedEvent}
     */
    @jakarta.annotation.Nonnull
    public static SharePointMigrationJobPostponedEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointMigrationJobPostponedEvent();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("jobsInQueue", (n) -> { this.setJobsInQueue(n.getLongValue()); });
        deserializerMap.put("nextPickupDateTime", (n) -> { this.setNextPickupDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("totalRetryCount", (n) -> { this.setTotalRetryCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the jobsInQueue property value. The number of migration jobs in the queue of the current database. Read-only.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getJobsInQueue() {
        return this.backingStore.get("jobsInQueue");
    }
    /**
     * Gets the nextPickupDateTime property value. The date and time that indicate when this job is picked up next. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getNextPickupDateTime() {
        return this.backingStore.get("nextPickupDateTime");
    }
    /**
     * Gets the reason property value. The reason for the postponement. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.backingStore.get("reason");
    }
    /**
     * Gets the totalRetryCount property value. The current retry count of the job. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalRetryCount() {
        return this.backingStore.get("totalRetryCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("jobsInQueue", this.getJobsInQueue());
        writer.writeOffsetDateTimeValue("nextPickupDateTime", this.getNextPickupDateTime());
        writer.writeStringValue("reason", this.getReason());
        writer.writeIntegerValue("totalRetryCount", this.getTotalRetryCount());
    }
    /**
     * Sets the jobsInQueue property value. The number of migration jobs in the queue of the current database. Read-only.
     * @param value Value to set for the jobsInQueue property.
     */
    public void setJobsInQueue(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("jobsInQueue", value);
    }
    /**
     * Sets the nextPickupDateTime property value. The date and time that indicate when this job is picked up next. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the nextPickupDateTime property.
     */
    public void setNextPickupDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("nextPickupDateTime", value);
    }
    /**
     * Sets the reason property value. The reason for the postponement. Read-only.
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("reason", value);
    }
    /**
     * Sets the totalRetryCount property value. The current retry count of the job. Read-only.
     * @param value Value to set for the totalRetryCount property.
     */
    public void setTotalRetryCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalRetryCount", value);
    }
}
