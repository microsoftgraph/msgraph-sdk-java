package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfigurationMonitor extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ConfigurationMonitor} and sets the default values.
     */
    public ConfigurationMonitor() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConfigurationMonitor}
     */
    @jakarta.annotation.Nonnull
    public static ConfigurationMonitor createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigurationMonitor();
    }
    /**
     * Gets the baseline property value. The baseline property
     * @return a {@link ConfigurationBaseline}
     */
    @jakarta.annotation.Nullable
    public ConfigurationBaseline getBaseline() {
        return this.backingStore.get("baseline");
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
     * Gets the createdDateTime property value. The date and time when the monitor was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, ge, le) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. User-friendly description of the monitor given by the user. Supports $filter (eq, ne, startsWith) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. User-friendly name given by the user to the monitor. Supports $filter (eq, ne, startsWith) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("baseline", (n) -> { this.setBaseline(n.getObjectValue(ConfigurationBaseline::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("inactivationReason", (n) -> { this.setInactivationReason(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("mode", (n) -> { this.setMode(n.getEnumValue(MonitorMode::forValue)); });
        deserializerMap.put("monitorRunFrequencyInHours", (n) -> { this.setMonitorRunFrequencyInHours(n.getIntegerValue()); });
        deserializerMap.put("parameters", (n) -> { this.setParameters(n.getObjectValue(OpenComplexDictionaryType::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(MonitorStatus::forValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inactivationReason property value. The reason for the monitor&apos;s inactivation. Returned only on $select.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInactivationReason() {
        return this.backingStore.get("inactivationReason");
    }
    /**
     * Gets the lastModifiedBy property value. The lastModifiedBy property
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the monitor was last modified. If no modifications are made to the monitor, it&apos;s the same as createdDateTime. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, ge, le) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the mode property value. The mode property
     * @return a {@link MonitorMode}
     */
    @jakarta.annotation.Nullable
    public MonitorMode getMode() {
        return this.backingStore.get("mode");
    }
    /**
     * Gets the monitorRunFrequencyInHours property value. Frequency at which the monitor runs. The default frequency is six hours. Regardless of when you create or update a monitor, it gets triggered within the next 6 hours. Currently, monitors are picked up at fixed times: 6 AM, 12 PM, 6 PM, and 12 AM (all in GMT). For example, if you create a monitor at 9 AM, it gets triggered around 12 PM. If you update a monitor at 4 PM, it gets triggered around 6 PM.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMonitorRunFrequencyInHours() {
        return this.backingStore.get("monitorRunFrequencyInHours");
    }
    /**
     * Gets the parameters property value. Key-value pairs that contain parameter values which might be used in the baseline. Returned only on $select.
     * @return a {@link OpenComplexDictionaryType}
     */
    @jakarta.annotation.Nullable
    public OpenComplexDictionaryType getParameters() {
        return this.backingStore.get("parameters");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link MonitorStatus}
     */
    @jakarta.annotation.Nullable
    public MonitorStatus getStatus() {
        return this.backingStore.get("status");
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
        writer.writeObjectValue("baseline", this.getBaseline());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeEnumValue("mode", this.getMode());
        writer.writeObjectValue("parameters", this.getParameters());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the baseline property value. The baseline property
     * @param value Value to set for the baseline property.
     */
    public void setBaseline(@jakarta.annotation.Nullable final ConfigurationBaseline value) {
        this.backingStore.set("baseline", value);
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the monitor was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, ge, le) and $orderby.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. User-friendly description of the monitor given by the user. Supports $filter (eq, ne, startsWith) and $orderby.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. User-friendly name given by the user to the monitor. Supports $filter (eq, ne, startsWith) and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the inactivationReason property value. The reason for the monitor&apos;s inactivation. Returned only on $select.
     * @param value Value to set for the inactivationReason property.
     */
    public void setInactivationReason(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("inactivationReason", value);
    }
    /**
     * Sets the lastModifiedBy property value. The lastModifiedBy property
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the monitor was last modified. If no modifications are made to the monitor, it&apos;s the same as createdDateTime. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, ge, le) and $orderby.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the mode property value. The mode property
     * @param value Value to set for the mode property.
     */
    public void setMode(@jakarta.annotation.Nullable final MonitorMode value) {
        this.backingStore.set("mode", value);
    }
    /**
     * Sets the monitorRunFrequencyInHours property value. Frequency at which the monitor runs. The default frequency is six hours. Regardless of when you create or update a monitor, it gets triggered within the next 6 hours. Currently, monitors are picked up at fixed times: 6 AM, 12 PM, 6 PM, and 12 AM (all in GMT). For example, if you create a monitor at 9 AM, it gets triggered around 12 PM. If you update a monitor at 4 PM, it gets triggered around 6 PM.
     * @param value Value to set for the monitorRunFrequencyInHours property.
     */
    public void setMonitorRunFrequencyInHours(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("monitorRunFrequencyInHours", value);
    }
    /**
     * Sets the parameters property value. Key-value pairs that contain parameter values which might be used in the baseline. Returned only on $select.
     * @param value Value to set for the parameters property.
     */
    public void setParameters(@jakarta.annotation.Nullable final OpenComplexDictionaryType value) {
        this.backingStore.set("parameters", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final MonitorStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the tenantId property value. Globally unique identifier (GUID) of the tenant for which the monitor runs. Fetched automatically by the system. Supports $filter (eq, ne).
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
}
