package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfigurationMonitoringResult extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ConfigurationMonitoringResult} and sets the default values.
     */
    public ConfigurationMonitoringResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConfigurationMonitoringResult}
     */
    @jakarta.annotation.Nonnull
    public static ConfigurationMonitoringResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigurationMonitoringResult();
    }
    /**
     * Gets the driftsCount property value. Number of drifts observed during a monitor run. Supports $filter (eq, ne, ge, le) and $orderby.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDriftsCount() {
        return this.backingStore.get("driftsCount");
    }
    /**
     * Gets the errorDetails property value. All the error details that prevent the monitor from running successfully. The error details are a contained entity. Returned only on $select.
     * @return a {@link java.util.List<ErrorDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ErrorDetail> getErrorDetails() {
        return this.backingStore.get("errorDetails");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("driftsCount", (n) -> { this.setDriftsCount(n.getIntegerValue()); });
        deserializerMap.put("errorDetails", (n) -> { this.setErrorDetails(n.getCollectionOfObjectValues(ErrorDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("monitorId", (n) -> { this.setMonitorId(n.getStringValue()); });
        deserializerMap.put("runCompletionDateTime", (n) -> { this.setRunCompletionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("runInitiationDateTime", (n) -> { this.setRunInitiationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("runStatus", (n) -> { this.setRunStatus(n.getEnumValue(MonitorRunStatus::forValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the monitorId property value. Globally unique identifier (GUID) of the monitor. System-generated. Supports $filter (eq, ne).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMonitorId() {
        return this.backingStore.get("monitorId");
    }
    /**
     * Gets the runCompletionDateTime property value. Date and time at which the monitor run completed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, ge, le) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRunCompletionDateTime() {
        return this.backingStore.get("runCompletionDateTime");
    }
    /**
     * Gets the runInitiationDateTime property value. Date and time at which the monitor run initiated. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, ge, le) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRunInitiationDateTime() {
        return this.backingStore.get("runInitiationDateTime");
    }
    /**
     * Gets the runStatus property value. The runStatus property
     * @return a {@link MonitorRunStatus}
     */
    @jakarta.annotation.Nullable
    public MonitorRunStatus getRunStatus() {
        return this.backingStore.get("runStatus");
    }
    /**
     * Gets the tenantId property value. Globally unique identifier (GUID) of the tenant for which the monitor runs. Fetched automatically by the system. Supports $filter (eq, ne).
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
        writer.writeEnumValue("runStatus", this.getRunStatus());
    }
    /**
     * Sets the driftsCount property value. Number of drifts observed during a monitor run. Supports $filter (eq, ne, ge, le) and $orderby.
     * @param value Value to set for the driftsCount property.
     */
    public void setDriftsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("driftsCount", value);
    }
    /**
     * Sets the errorDetails property value. All the error details that prevent the monitor from running successfully. The error details are a contained entity. Returned only on $select.
     * @param value Value to set for the errorDetails property.
     */
    public void setErrorDetails(@jakarta.annotation.Nullable final java.util.List<ErrorDetail> value) {
        this.backingStore.set("errorDetails", value);
    }
    /**
     * Sets the monitorId property value. Globally unique identifier (GUID) of the monitor. System-generated. Supports $filter (eq, ne).
     * @param value Value to set for the monitorId property.
     */
    public void setMonitorId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("monitorId", value);
    }
    /**
     * Sets the runCompletionDateTime property value. Date and time at which the monitor run completed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, ge, le) and $orderby.
     * @param value Value to set for the runCompletionDateTime property.
     */
    public void setRunCompletionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("runCompletionDateTime", value);
    }
    /**
     * Sets the runInitiationDateTime property value. Date and time at which the monitor run initiated. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, ge, le) and $orderby.
     * @param value Value to set for the runInitiationDateTime property.
     */
    public void setRunInitiationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("runInitiationDateTime", value);
    }
    /**
     * Sets the runStatus property value. The runStatus property
     * @param value Value to set for the runStatus property.
     */
    public void setRunStatus(@jakarta.annotation.Nullable final MonitorRunStatus value) {
        this.backingStore.set("runStatus", value);
    }
    /**
     * Sets the tenantId property value. Globally unique identifier (GUID) of the tenant for which the monitor runs. Fetched automatically by the system. Supports $filter (eq, ne).
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
}
