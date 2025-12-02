package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointMigrationEvent extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SharePointMigrationEvent} and sets the default values.
     */
    public SharePointMigrationEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointMigrationEvent}
     */
    @jakarta.annotation.Nonnull
    public static SharePointMigrationEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.sharePointMigrationFinishManifestFileUploadEvent": return new SharePointMigrationFinishManifestFileUploadEvent();
                case "#microsoft.graph.sharePointMigrationJobCancelledEvent": return new SharePointMigrationJobCancelledEvent();
                case "#microsoft.graph.sharePointMigrationJobDeletedEvent": return new SharePointMigrationJobDeletedEvent();
                case "#microsoft.graph.sharePointMigrationJobErrorEvent": return new SharePointMigrationJobErrorEvent();
                case "#microsoft.graph.sharePointMigrationJobPostponedEvent": return new SharePointMigrationJobPostponedEvent();
                case "#microsoft.graph.sharePointMigrationJobProgressEvent": return new SharePointMigrationJobProgressEvent();
                case "#microsoft.graph.sharePointMigrationJobQueuedEvent": return new SharePointMigrationJobQueuedEvent();
                case "#microsoft.graph.sharePointMigrationJobStartEvent": return new SharePointMigrationJobStartEvent();
            }
        }
        return new SharePointMigrationEvent();
    }
    /**
     * Gets the correlationId property value. The correlation ID of a migration job. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCorrelationId() {
        return this.backingStore.get("correlationId");
    }
    /**
     * Gets the eventDateTime property value. The date and time when the job status changes. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this.backingStore.get("eventDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("eventDateTime", (n) -> { this.setEventDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("jobId", (n) -> { this.setJobId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the jobId property value. The unique identifier of a migration job. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getJobId() {
        return this.backingStore.get("jobId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeOffsetDateTimeValue("eventDateTime", this.getEventDateTime());
        writer.writeStringValue("jobId", this.getJobId());
    }
    /**
     * Sets the correlationId property value. The correlation ID of a migration job. Read-only.
     * @param value Value to set for the correlationId property.
     */
    public void setCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("correlationId", value);
    }
    /**
     * Sets the eventDateTime property value. The date and time when the job status changes. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the eventDateTime property.
     */
    public void setEventDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("eventDateTime", value);
    }
    /**
     * Sets the jobId property value. The unique identifier of a migration job. Read-only.
     * @param value Value to set for the jobId property.
     */
    public void setJobId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("jobId", value);
    }
}
