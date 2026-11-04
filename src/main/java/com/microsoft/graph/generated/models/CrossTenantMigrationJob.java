package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CrossTenantMigrationJob extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CrossTenantMigrationJob} and sets the default values.
     */
    public CrossTenantMigrationJob() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CrossTenantMigrationJob}
     */
    @jakarta.annotation.Nonnull
    public static CrossTenantMigrationJob createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantMigrationJob();
    }
    /**
     * Gets the completeAfterDateTime property value. Date and time after which the migration should be performed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2024, is 2024-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompleteAfterDateTime() {
        return this.backingStore.get("completeAfterDateTime");
    }
    /**
     * Gets the createdBy property value. User principal name (UPN) of the user who created the job. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. When the job was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2024, is 2024-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the displayName property value. Display name of the job. Must be unique per tenant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the exchangeSettings property value. Settings to use for migration of Exchange workload. Nullable.
     * @return a {@link ExchangeOnlineCrossTenantMigrationSettings}
     */
    @jakarta.annotation.Nullable
    public ExchangeOnlineCrossTenantMigrationSettings getExchangeSettings() {
        return this.backingStore.get("exchangeSettings");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completeAfterDateTime", (n) -> { this.setCompleteAfterDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("exchangeSettings", (n) -> { this.setExchangeSettings(n.getObjectValue(ExchangeOnlineCrossTenantMigrationSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("jobType", (n) -> { this.setJobType(n.getEnumValue(CrossTenantMigrationJobType::forValue)); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("resourceType", (n) -> { this.setResourceType(n.getStringValue()); });
        deserializerMap.put("sourceTenantId", (n) -> { this.setSourceTenantId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CrossTenantMigrationJobStatus::forValue)); });
        deserializerMap.put("targetTenantId", (n) -> { this.setTargetTenantId(n.getStringValue()); });
        deserializerMap.put("users", (n) -> { this.setUsers(n.getCollectionOfObjectValues(CrossTenantMigrationTask::createFromDiscriminatorValue)); });
        deserializerMap.put("workloads", (n) -> { this.setWorkloads(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the jobType property value. The jobType property
     * @return a {@link CrossTenantMigrationJobType}
     */
    @jakarta.annotation.Nullable
    public CrossTenantMigrationJobType getJobType() {
        return this.backingStore.get("jobType");
    }
    /**
     * Gets the lastUpdatedDateTime property value. When this migration job was last updated. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2024, is 2024-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.backingStore.get("lastUpdatedDateTime");
    }
    /**
     * Gets the message property value. Status message of the migration job. Nullable. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.backingStore.get("message");
    }
    /**
     * Gets the resources property value. IDs (GUID) of the resources that are migrated with the migration job.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getResources() {
        return this.backingStore.get("resources");
    }
    /**
     * Gets the resourceType property value. Type of resource being migrated. Only Users is currently supported.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceType() {
        return this.backingStore.get("resourceType");
    }
    /**
     * Gets the sourceTenantId property value. ID (GUID) of the source tenant for the content migration.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceTenantId() {
        return this.backingStore.get("sourceTenantId");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link CrossTenantMigrationJobStatus}
     */
    @jakarta.annotation.Nullable
    public CrossTenantMigrationJobStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the targetTenantId property value. ID of the target tenant for the content migration. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetTenantId() {
        return this.backingStore.get("targetTenantId");
    }
    /**
     * Gets the users property value. Details and status of the users migrated in this migration job.
     * @return a {@link java.util.List<CrossTenantMigrationTask>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CrossTenantMigrationTask> getUsers() {
        return this.backingStore.get("users");
    }
    /**
     * Gets the workloads property value. Workloads to migrate. Supported workloads are Teams, Exchange, and ODSP (OneDrive/SharePoint).
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getWorkloads() {
        return this.backingStore.get("workloads");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("completeAfterDateTime", this.getCompleteAfterDateTime());
        writer.writeStringValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("exchangeSettings", this.getExchangeSettings());
        writer.writeEnumValue("jobType", this.getJobType());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeStringValue("message", this.getMessage());
        writer.writeCollectionOfPrimitiveValues("resources", this.getResources());
        writer.writeStringValue("resourceType", this.getResourceType());
        writer.writeStringValue("sourceTenantId", this.getSourceTenantId());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("targetTenantId", this.getTargetTenantId());
        writer.writeCollectionOfObjectValues("users", this.getUsers());
        writer.writeCollectionOfPrimitiveValues("workloads", this.getWorkloads());
    }
    /**
     * Sets the completeAfterDateTime property value. Date and time after which the migration should be performed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2024, is 2024-01-01T00:00:00Z.
     * @param value Value to set for the completeAfterDateTime property.
     */
    public void setCompleteAfterDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("completeAfterDateTime", value);
    }
    /**
     * Sets the createdBy property value. User principal name (UPN) of the user who created the job. Read-only.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. When the job was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2024, is 2024-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the displayName property value. Display name of the job. Must be unique per tenant.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the exchangeSettings property value. Settings to use for migration of Exchange workload. Nullable.
     * @param value Value to set for the exchangeSettings property.
     */
    public void setExchangeSettings(@jakarta.annotation.Nullable final ExchangeOnlineCrossTenantMigrationSettings value) {
        this.backingStore.set("exchangeSettings", value);
    }
    /**
     * Sets the jobType property value. The jobType property
     * @param value Value to set for the jobType property.
     */
    public void setJobType(@jakarta.annotation.Nullable final CrossTenantMigrationJobType value) {
        this.backingStore.set("jobType", value);
    }
    /**
     * Sets the lastUpdatedDateTime property value. When this migration job was last updated. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2024, is 2024-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUpdatedDateTime", value);
    }
    /**
     * Sets the message property value. Status message of the migration job. Nullable. Read-only.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("message", value);
    }
    /**
     * Sets the resources property value. IDs (GUID) of the resources that are migrated with the migration job.
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("resources", value);
    }
    /**
     * Sets the resourceType property value. Type of resource being migrated. Only Users is currently supported.
     * @param value Value to set for the resourceType property.
     */
    public void setResourceType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceType", value);
    }
    /**
     * Sets the sourceTenantId property value. ID (GUID) of the source tenant for the content migration.
     * @param value Value to set for the sourceTenantId property.
     */
    public void setSourceTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceTenantId", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final CrossTenantMigrationJobStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the targetTenantId property value. ID of the target tenant for the content migration. Read-only.
     * @param value Value to set for the targetTenantId property.
     */
    public void setTargetTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetTenantId", value);
    }
    /**
     * Sets the users property value. Details and status of the users migrated in this migration job.
     * @param value Value to set for the users property.
     */
    public void setUsers(@jakarta.annotation.Nullable final java.util.List<CrossTenantMigrationTask> value) {
        this.backingStore.set("users", value);
    }
    /**
     * Sets the workloads property value. Workloads to migrate. Supported workloads are Teams, Exchange, and ODSP (OneDrive/SharePoint).
     * @param value Value to set for the workloads property.
     */
    public void setWorkloads(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("workloads", value);
    }
}
