package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfigurationDrift extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ConfigurationDrift} and sets the default values.
     */
    public ConfigurationDrift() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConfigurationDrift}
     */
    @jakarta.annotation.Nonnull
    public static ConfigurationDrift createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigurationDrift();
    }
    /**
     * Gets the baselineResourceDisplayName property value. Resource instance for which the drift is detected. Supports $filter (eq, ne, startsWith) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBaselineResourceDisplayName() {
        return this.backingStore.get("baselineResourceDisplayName");
    }
    /**
     * Gets the driftedProperties property value. Properties within one or more resource instances in which drift is detected. Requires $select to retrieve.
     * @return a {@link java.util.List<DriftedProperty>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DriftedProperty> getDriftedProperties() {
        return this.backingStore.get("driftedProperties");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("baselineResourceDisplayName", (n) -> { this.setBaselineResourceDisplayName(n.getStringValue()); });
        deserializerMap.put("driftedProperties", (n) -> { this.setDriftedProperties(n.getCollectionOfObjectValues(DriftedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("firstReportedDateTime", (n) -> { this.setFirstReportedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("monitorId", (n) -> { this.setMonitorId(n.getStringValue()); });
        deserializerMap.put("resourceInstanceIdentifier", (n) -> { this.setResourceInstanceIdentifier(n.getObjectValue(OpenComplexDictionaryType::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceType", (n) -> { this.setResourceType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(DriftStatus::forValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstReportedDateTime property value. The date and time at which drift is first detected. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, ge, le) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstReportedDateTime() {
        return this.backingStore.get("firstReportedDateTime");
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
     * Gets the resourceInstanceIdentifier property value. The resourceInstanceIdentifier property
     * @return a {@link OpenComplexDictionaryType}
     */
    @jakarta.annotation.Nullable
    public OpenComplexDictionaryType getResourceInstanceIdentifier() {
        return this.backingStore.get("resourceInstanceIdentifier");
    }
    /**
     * Gets the resourceType property value. Resource for which the drift is detected. Supports $filter (eq, ne, startsWith).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceType() {
        return this.backingStore.get("resourceType");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link DriftStatus}
     */
    @jakarta.annotation.Nullable
    public DriftStatus getStatus() {
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
        writer.writeObjectValue("resourceInstanceIdentifier", this.getResourceInstanceIdentifier());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the baselineResourceDisplayName property value. Resource instance for which the drift is detected. Supports $filter (eq, ne, startsWith) and $orderby.
     * @param value Value to set for the baselineResourceDisplayName property.
     */
    public void setBaselineResourceDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("baselineResourceDisplayName", value);
    }
    /**
     * Sets the driftedProperties property value. Properties within one or more resource instances in which drift is detected. Requires $select to retrieve.
     * @param value Value to set for the driftedProperties property.
     */
    public void setDriftedProperties(@jakarta.annotation.Nullable final java.util.List<DriftedProperty> value) {
        this.backingStore.set("driftedProperties", value);
    }
    /**
     * Sets the firstReportedDateTime property value. The date and time at which drift is first detected. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, ge, le) and $orderby.
     * @param value Value to set for the firstReportedDateTime property.
     */
    public void setFirstReportedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("firstReportedDateTime", value);
    }
    /**
     * Sets the monitorId property value. Globally unique identifier (GUID) of the monitor. System-generated. Supports $filter (eq, ne).
     * @param value Value to set for the monitorId property.
     */
    public void setMonitorId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("monitorId", value);
    }
    /**
     * Sets the resourceInstanceIdentifier property value. The resourceInstanceIdentifier property
     * @param value Value to set for the resourceInstanceIdentifier property.
     */
    public void setResourceInstanceIdentifier(@jakarta.annotation.Nullable final OpenComplexDictionaryType value) {
        this.backingStore.set("resourceInstanceIdentifier", value);
    }
    /**
     * Sets the resourceType property value. Resource for which the drift is detected. Supports $filter (eq, ne, startsWith).
     * @param value Value to set for the resourceType property.
     */
    public void setResourceType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceType", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final DriftStatus value) {
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
