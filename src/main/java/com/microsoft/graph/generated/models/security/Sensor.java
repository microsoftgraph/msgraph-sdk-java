package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Sensor extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Sensor} and sets the default values.
     */
    public Sensor() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Sensor}
     */
    @jakarta.annotation.Nonnull
    public static Sensor createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Sensor();
    }
    /**
     * Gets the createdDateTime property value. The date and time when the sensor was generated. The Timestamp represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the deploymentStatus property value. The deploymentStatus property
     * @return a {@link DeploymentStatus}
     */
    @jakarta.annotation.Nullable
    public DeploymentStatus getDeploymentStatus() {
        return this.backingStore.get("deploymentStatus");
    }
    /**
     * Gets the displayName property value. The display name of the sensor.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the domainName property value. The fully qualified domain name of the sensor.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDomainName() {
        return this.backingStore.get("domainName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deploymentStatus", (n) -> { this.setDeploymentStatus(n.getEnumValue(DeploymentStatus::forValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("domainName", (n) -> { this.setDomainName(n.getStringValue()); });
        deserializerMap.put("healthIssues", (n) -> { this.setHealthIssues(n.getCollectionOfObjectValues(HealthIssue::createFromDiscriminatorValue)); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(SensorHealthStatus::forValue)); });
        deserializerMap.put("openHealthIssuesCount", (n) -> { this.setOpenHealthIssuesCount(n.getLongValue()); });
        deserializerMap.put("sensorType", (n) -> { this.setSensorType(n.getEnumValue(SensorType::forValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(SensorSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthIssues property value. Represents potential issues within a customer's Microsoft Defender for Identity configuration that Microsoft Defender for Identity identified related to the sensor.
     * @return a {@link java.util.List<HealthIssue>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HealthIssue> getHealthIssues() {
        return this.backingStore.get("healthIssues");
    }
    /**
     * Gets the healthStatus property value. The healthStatus property
     * @return a {@link SensorHealthStatus}
     */
    @jakarta.annotation.Nullable
    public SensorHealthStatus getHealthStatus() {
        return this.backingStore.get("healthStatus");
    }
    /**
     * Gets the openHealthIssuesCount property value. This field displays the count of health issues related to this sensor.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getOpenHealthIssuesCount() {
        return this.backingStore.get("openHealthIssuesCount");
    }
    /**
     * Gets the sensorType property value. The sensorType property
     * @return a {@link SensorType}
     */
    @jakarta.annotation.Nullable
    public SensorType getSensorType() {
        return this.backingStore.get("sensorType");
    }
    /**
     * Gets the settings property value. The settings property
     * @return a {@link SensorSettings}
     */
    @jakarta.annotation.Nullable
    public SensorSettings getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Gets the version property value. The version of the sensor.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeEnumValue("deploymentStatus", this.getDeploymentStatus());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("domainName", this.getDomainName());
        writer.writeCollectionOfObjectValues("healthIssues", this.getHealthIssues());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeLongValue("openHealthIssuesCount", this.getOpenHealthIssuesCount());
        writer.writeEnumValue("sensorType", this.getSensorType());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the createdDateTime property value. The date and time when the sensor was generated. The Timestamp represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the deploymentStatus property value. The deploymentStatus property
     * @param value Value to set for the deploymentStatus property.
     */
    public void setDeploymentStatus(@jakarta.annotation.Nullable final DeploymentStatus value) {
        this.backingStore.set("deploymentStatus", value);
    }
    /**
     * Sets the displayName property value. The display name of the sensor.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the domainName property value. The fully qualified domain name of the sensor.
     * @param value Value to set for the domainName property.
     */
    public void setDomainName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("domainName", value);
    }
    /**
     * Sets the healthIssues property value. Represents potential issues within a customer's Microsoft Defender for Identity configuration that Microsoft Defender for Identity identified related to the sensor.
     * @param value Value to set for the healthIssues property.
     */
    public void setHealthIssues(@jakarta.annotation.Nullable final java.util.List<HealthIssue> value) {
        this.backingStore.set("healthIssues", value);
    }
    /**
     * Sets the healthStatus property value. The healthStatus property
     * @param value Value to set for the healthStatus property.
     */
    public void setHealthStatus(@jakarta.annotation.Nullable final SensorHealthStatus value) {
        this.backingStore.set("healthStatus", value);
    }
    /**
     * Sets the openHealthIssuesCount property value. This field displays the count of health issues related to this sensor.
     * @param value Value to set for the openHealthIssuesCount property.
     */
    public void setOpenHealthIssuesCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("openHealthIssuesCount", value);
    }
    /**
     * Sets the sensorType property value. The sensorType property
     * @param value Value to set for the sensorType property.
     */
    public void setSensorType(@jakarta.annotation.Nullable final SensorType value) {
        this.backingStore.set("sensorType", value);
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final SensorSettings value) {
        this.backingStore.set("settings", value);
    }
    /**
     * Sets the version property value. The version of the sensor.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}
