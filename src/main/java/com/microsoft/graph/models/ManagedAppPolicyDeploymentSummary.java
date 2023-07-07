package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedAppPolicyDeploymentSummary extends Entity implements Parsable {
    /**
     * Not yet documented
     */
    private Integer configurationDeployedUserCount;
    /**
     * Not yet documented
     */
    private java.util.List<ManagedAppPolicyDeploymentSummaryPerApp> configurationDeploymentSummaryPerApp;
    /**
     * Not yet documented
     */
    private String displayName;
    /**
     * Not yet documented
     */
    private OffsetDateTime lastRefreshTime;
    /**
     * Version of the entity.
     */
    private String version;
    /**
     * Instantiates a new managedAppPolicyDeploymentSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedAppPolicyDeploymentSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedAppPolicyDeploymentSummary
     */
    @javax.annotation.Nonnull
    public static ManagedAppPolicyDeploymentSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedAppPolicyDeploymentSummary();
    }
    /**
     * Gets the configurationDeployedUserCount property value. Not yet documented
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConfigurationDeployedUserCount() {
        return this.configurationDeployedUserCount;
    }
    /**
     * Gets the configurationDeploymentSummaryPerApp property value. Not yet documented
     * @return a managedAppPolicyDeploymentSummaryPerApp
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedAppPolicyDeploymentSummaryPerApp> getConfigurationDeploymentSummaryPerApp() {
        return this.configurationDeploymentSummaryPerApp;
    }
    /**
     * Gets the displayName property value. Not yet documented
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configurationDeployedUserCount", (n) -> { this.setConfigurationDeployedUserCount(n.getIntegerValue()); });
        deserializerMap.put("configurationDeploymentSummaryPerApp", (n) -> { this.setConfigurationDeploymentSummaryPerApp(n.getCollectionOfObjectValues(ManagedAppPolicyDeploymentSummaryPerApp::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastRefreshTime", (n) -> { this.setLastRefreshTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastRefreshTime property value. Not yet documented
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastRefreshTime() {
        return this.lastRefreshTime;
    }
    /**
     * Gets the version property value. Version of the entity.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this.version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("configurationDeployedUserCount", this.getConfigurationDeployedUserCount());
        writer.writeCollectionOfObjectValues("configurationDeploymentSummaryPerApp", this.getConfigurationDeploymentSummaryPerApp());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastRefreshTime", this.getLastRefreshTime());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the configurationDeployedUserCount property value. Not yet documented
     * @param value Value to set for the configurationDeployedUserCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurationDeployedUserCount(@javax.annotation.Nullable final Integer value) {
        this.configurationDeployedUserCount = value;
    }
    /**
     * Sets the configurationDeploymentSummaryPerApp property value. Not yet documented
     * @param value Value to set for the configurationDeploymentSummaryPerApp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurationDeploymentSummaryPerApp(@javax.annotation.Nullable final java.util.List<ManagedAppPolicyDeploymentSummaryPerApp> value) {
        this.configurationDeploymentSummaryPerApp = value;
    }
    /**
     * Sets the displayName property value. Not yet documented
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastRefreshTime property value. Not yet documented
     * @param value Value to set for the lastRefreshTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastRefreshTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastRefreshTime = value;
    }
    /**
     * Sets the version property value. Version of the entity.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this.version = value;
    }
}
