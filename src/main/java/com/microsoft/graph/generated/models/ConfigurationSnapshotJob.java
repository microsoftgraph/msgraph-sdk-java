package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfigurationSnapshotJob extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ConfigurationSnapshotJob} and sets the default values.
     */
    public ConfigurationSnapshotJob() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConfigurationSnapshotJob}
     */
    @jakarta.annotation.Nonnull
    public static ConfigurationSnapshotJob createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigurationSnapshotJob();
    }
    /**
     * Gets the completedDateTime property value. The date and time when the snapshot job was completed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, ge, le) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.backingStore.get("completedDateTime");
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the snapshot job was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, ge, le) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. User-friendly description of the snapshot given by the user. Supports $filter (eq, ne, startsWith) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. User-friendly name provided by the user during snapshot creation. Supports $filter (eq, ne, startsWith) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the errorDetails property value. Details of errors related to the reasons why the snapshot can&apos;t complete. Requires $select to retrieve.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getErrorDetails() {
        return this.backingStore.get("errorDetails");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("errorDetails", (n) -> { this.setErrorDetails(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("resourceLocation", (n) -> { this.setResourceLocation(n.getStringValue()); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SnapshotJobStatus::forValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the resourceLocation property value. The URL at which the snapshot file resides. Requires $select to retrieve.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceLocation() {
        return this.backingStore.get("resourceLocation");
    }
    /**
     * Gets the resources property value. The names of all resources included in the request body by the user who created the snapshot. Fetched by the system. Requires $select to retrieve.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getResources() {
        return this.backingStore.get("resources");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link SnapshotJobStatus}
     */
    @jakarta.annotation.Nullable
    public SnapshotJobStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the tenantId property value. Globally unique identifier (GUID) of the tenant for which the snapshot is created. Supports $filter (eq, ne).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("resources", this.getResources());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the completedDateTime property value. The date and time when the snapshot job was completed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, ge, le) and $orderby.
     * @param value Value to set for the completedDateTime property.
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("completedDateTime", value);
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the snapshot job was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, ge, le) and $orderby.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. User-friendly description of the snapshot given by the user. Supports $filter (eq, ne, startsWith) and $orderby.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. User-friendly name provided by the user during snapshot creation. Supports $filter (eq, ne, startsWith) and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the errorDetails property value. Details of errors related to the reasons why the snapshot can&apos;t complete. Requires $select to retrieve.
     * @param value Value to set for the errorDetails property.
     */
    public void setErrorDetails(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("errorDetails", value);
    }
    /**
     * Sets the resourceLocation property value. The URL at which the snapshot file resides. Requires $select to retrieve.
     * @param value Value to set for the resourceLocation property.
     */
    public void setResourceLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceLocation", value);
    }
    /**
     * Sets the resources property value. The names of all resources included in the request body by the user who created the snapshot. Fetched by the system. Requires $select to retrieve.
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("resources", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SnapshotJobStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the tenantId property value. Globally unique identifier (GUID) of the tenant for which the snapshot is created. Supports $filter (eq, ne).
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
}
