package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfigurationManagement extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ConfigurationManagement} and sets the default values.
     */
    public ConfigurationManagement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConfigurationManagement}
     */
    @jakarta.annotation.Nonnull
    public static ConfigurationManagement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigurationManagement();
    }
    /**
     * Gets the configurationDrifts property value. A container for configuration drift resources.
     * @return a {@link java.util.List<ConfigurationDrift>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConfigurationDrift> getConfigurationDrifts() {
        return this.backingStore.get("configurationDrifts");
    }
    /**
     * Gets the configurationMonitoringResults property value. A container for configuration monitoring results resources.
     * @return a {@link java.util.List<ConfigurationMonitoringResult>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConfigurationMonitoringResult> getConfigurationMonitoringResults() {
        return this.backingStore.get("configurationMonitoringResults");
    }
    /**
     * Gets the configurationMonitors property value. A container for configuration monitor resources.
     * @return a {@link java.util.List<ConfigurationMonitor>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConfigurationMonitor> getConfigurationMonitors() {
        return this.backingStore.get("configurationMonitors");
    }
    /**
     * Gets the configurationSnapshotJobs property value. A container for snapshot job resources.
     * @return a {@link java.util.List<ConfigurationSnapshotJob>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConfigurationSnapshotJob> getConfigurationSnapshotJobs() {
        return this.backingStore.get("configurationSnapshotJobs");
    }
    /**
     * Gets the configurationSnapshots property value. A container for configuration snapshot baselines.
     * @return a {@link java.util.List<ConfigurationBaseline>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConfigurationBaseline> getConfigurationSnapshots() {
        return this.backingStore.get("configurationSnapshots");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configurationDrifts", (n) -> { this.setConfigurationDrifts(n.getCollectionOfObjectValues(ConfigurationDrift::createFromDiscriminatorValue)); });
        deserializerMap.put("configurationMonitoringResults", (n) -> { this.setConfigurationMonitoringResults(n.getCollectionOfObjectValues(ConfigurationMonitoringResult::createFromDiscriminatorValue)); });
        deserializerMap.put("configurationMonitors", (n) -> { this.setConfigurationMonitors(n.getCollectionOfObjectValues(ConfigurationMonitor::createFromDiscriminatorValue)); });
        deserializerMap.put("configurationSnapshotJobs", (n) -> { this.setConfigurationSnapshotJobs(n.getCollectionOfObjectValues(ConfigurationSnapshotJob::createFromDiscriminatorValue)); });
        deserializerMap.put("configurationSnapshots", (n) -> { this.setConfigurationSnapshots(n.getCollectionOfObjectValues(ConfigurationBaseline::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("configurationDrifts", this.getConfigurationDrifts());
        writer.writeCollectionOfObjectValues("configurationMonitoringResults", this.getConfigurationMonitoringResults());
        writer.writeCollectionOfObjectValues("configurationMonitors", this.getConfigurationMonitors());
        writer.writeCollectionOfObjectValues("configurationSnapshotJobs", this.getConfigurationSnapshotJobs());
        writer.writeCollectionOfObjectValues("configurationSnapshots", this.getConfigurationSnapshots());
    }
    /**
     * Sets the configurationDrifts property value. A container for configuration drift resources.
     * @param value Value to set for the configurationDrifts property.
     */
    public void setConfigurationDrifts(@jakarta.annotation.Nullable final java.util.List<ConfigurationDrift> value) {
        this.backingStore.set("configurationDrifts", value);
    }
    /**
     * Sets the configurationMonitoringResults property value. A container for configuration monitoring results resources.
     * @param value Value to set for the configurationMonitoringResults property.
     */
    public void setConfigurationMonitoringResults(@jakarta.annotation.Nullable final java.util.List<ConfigurationMonitoringResult> value) {
        this.backingStore.set("configurationMonitoringResults", value);
    }
    /**
     * Sets the configurationMonitors property value. A container for configuration monitor resources.
     * @param value Value to set for the configurationMonitors property.
     */
    public void setConfigurationMonitors(@jakarta.annotation.Nullable final java.util.List<ConfigurationMonitor> value) {
        this.backingStore.set("configurationMonitors", value);
    }
    /**
     * Sets the configurationSnapshotJobs property value. A container for snapshot job resources.
     * @param value Value to set for the configurationSnapshotJobs property.
     */
    public void setConfigurationSnapshotJobs(@jakarta.annotation.Nullable final java.util.List<ConfigurationSnapshotJob> value) {
        this.backingStore.set("configurationSnapshotJobs", value);
    }
    /**
     * Sets the configurationSnapshots property value. A container for configuration snapshot baselines.
     * @param value Value to set for the configurationSnapshots property.
     */
    public void setConfigurationSnapshots(@jakarta.annotation.Nullable final java.util.List<ConfigurationBaseline> value) {
        this.backingStore.set("configurationSnapshots", value);
    }
}
