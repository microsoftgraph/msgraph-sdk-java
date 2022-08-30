package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedAppPolicyDeploymentSummary extends Entity implements Parsable {
    /** Not yet documented */
    private Integer _configurationDeployedUserCount;
    /** Not yet documented */
    private java.util.List<ManagedAppPolicyDeploymentSummaryPerApp> _configurationDeploymentSummaryPerApp;
    /** Not yet documented */
    private String _displayName;
    /** Not yet documented */
    private OffsetDateTime _lastRefreshTime;
    /** Version of the entity. */
    private String _version;
    /**
     * Instantiates a new managedAppPolicyDeploymentSummary and sets the default values.
     * @return a void
     */
    public ManagedAppPolicyDeploymentSummary() {
        super();
        this.setOdataType("#microsoft.graph.managedAppPolicyDeploymentSummary");
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
        return this._configurationDeployedUserCount;
    }
    /**
     * Gets the configurationDeploymentSummaryPerApp property value. Not yet documented
     * @return a managedAppPolicyDeploymentSummaryPerApp
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedAppPolicyDeploymentSummaryPerApp> getConfigurationDeploymentSummaryPerApp() {
        return this._configurationDeploymentSummaryPerApp;
    }
    /**
     * Gets the displayName property value. Not yet documented
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedAppPolicyDeploymentSummary currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("configurationDeployedUserCount", (n) -> { currentObject.setConfigurationDeployedUserCount(n.getIntegerValue()); });
            this.put("configurationDeploymentSummaryPerApp", (n) -> { currentObject.setConfigurationDeploymentSummaryPerApp(n.getCollectionOfObjectValues(ManagedAppPolicyDeploymentSummaryPerApp::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastRefreshTime", (n) -> { currentObject.setLastRefreshTime(n.getOffsetDateTimeValue()); });
            this.put("version", (n) -> { currentObject.setVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastRefreshTime property value. Not yet documented
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastRefreshTime() {
        return this._lastRefreshTime;
    }
    /**
     * Gets the version property value. Version of the entity.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this._version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setConfigurationDeployedUserCount(@javax.annotation.Nullable final Integer value) {
        this._configurationDeployedUserCount = value;
    }
    /**
     * Sets the configurationDeploymentSummaryPerApp property value. Not yet documented
     * @param value Value to set for the configurationDeploymentSummaryPerApp property.
     * @return a void
     */
    public void setConfigurationDeploymentSummaryPerApp(@javax.annotation.Nullable final java.util.List<ManagedAppPolicyDeploymentSummaryPerApp> value) {
        this._configurationDeploymentSummaryPerApp = value;
    }
    /**
     * Sets the displayName property value. Not yet documented
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastRefreshTime property value. Not yet documented
     * @param value Value to set for the lastRefreshTime property.
     * @return a void
     */
    public void setLastRefreshTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastRefreshTime = value;
    }
    /**
     * Sets the version property value. Version of the entity.
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final String value) {
        this._version = value;
    }
}
