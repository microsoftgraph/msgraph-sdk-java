package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties, inherited properties and actions for an MDM mobile app configuration user status summary.
 */
public class ManagedDeviceMobileAppConfigurationUserSummary extends Entity implements Parsable {
    /**
     * Version of the policy for that overview
     */
    private Integer configurationVersion;
    /**
     * Number of error Users
     */
    private Integer errorCount;
    /**
     * Number of failed Users
     */
    private Integer failedCount;
    /**
     * Last update time
     */
    private OffsetDateTime lastUpdateDateTime;
    /**
     * Number of not applicable users
     */
    private Integer notApplicableCount;
    /**
     * Number of pending Users
     */
    private Integer pendingCount;
    /**
     * Number of succeeded Users
     */
    private Integer successCount;
    /**
     * Instantiates a new managedDeviceMobileAppConfigurationUserSummary and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ManagedDeviceMobileAppConfigurationUserSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedDeviceMobileAppConfigurationUserSummary
     */
    @jakarta.annotation.Nonnull
    public static ManagedDeviceMobileAppConfigurationUserSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceMobileAppConfigurationUserSummary();
    }
    /**
     * Gets the configurationVersion property value. Version of the policy for that overview
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getConfigurationVersion() {
        return this.configurationVersion;
    }
    /**
     * Gets the errorCount property value. Number of error Users
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getErrorCount() {
        return this.errorCount;
    }
    /**
     * Gets the failedCount property value. Number of failed Users
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getFailedCount() {
        return this.failedCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configurationVersion", (n) -> { this.setConfigurationVersion(n.getIntegerValue()); });
        deserializerMap.put("errorCount", (n) -> { this.setErrorCount(n.getIntegerValue()); });
        deserializerMap.put("failedCount", (n) -> { this.setFailedCount(n.getIntegerValue()); });
        deserializerMap.put("lastUpdateDateTime", (n) -> { this.setLastUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("notApplicableCount", (n) -> { this.setNotApplicableCount(n.getIntegerValue()); });
        deserializerMap.put("pendingCount", (n) -> { this.setPendingCount(n.getIntegerValue()); });
        deserializerMap.put("successCount", (n) -> { this.setSuccessCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastUpdateDateTime property value. Last update time
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdateDateTime() {
        return this.lastUpdateDateTime;
    }
    /**
     * Gets the notApplicableCount property value. Number of not applicable users
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNotApplicableCount() {
        return this.notApplicableCount;
    }
    /**
     * Gets the pendingCount property value. Number of pending Users
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPendingCount() {
        return this.pendingCount;
    }
    /**
     * Gets the successCount property value. Number of succeeded Users
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessCount() {
        return this.successCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("configurationVersion", this.getConfigurationVersion());
        writer.writeIntegerValue("errorCount", this.getErrorCount());
        writer.writeIntegerValue("failedCount", this.getFailedCount());
        writer.writeOffsetDateTimeValue("lastUpdateDateTime", this.getLastUpdateDateTime());
        writer.writeIntegerValue("notApplicableCount", this.getNotApplicableCount());
        writer.writeIntegerValue("pendingCount", this.getPendingCount());
        writer.writeIntegerValue("successCount", this.getSuccessCount());
    }
    /**
     * Sets the configurationVersion property value. Version of the policy for that overview
     * @param value Value to set for the configurationVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setConfigurationVersion(@jakarta.annotation.Nullable final Integer value) {
        this.configurationVersion = value;
    }
    /**
     * Sets the errorCount property value. Number of error Users
     * @param value Value to set for the errorCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setErrorCount(@jakarta.annotation.Nullable final Integer value) {
        this.errorCount = value;
    }
    /**
     * Sets the failedCount property value. Number of failed Users
     * @param value Value to set for the failedCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFailedCount(@jakarta.annotation.Nullable final Integer value) {
        this.failedCount = value;
    }
    /**
     * Sets the lastUpdateDateTime property value. Last update time
     * @param value Value to set for the lastUpdateDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdateDateTime = value;
    }
    /**
     * Sets the notApplicableCount property value. Number of not applicable users
     * @param value Value to set for the notApplicableCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNotApplicableCount(@jakarta.annotation.Nullable final Integer value) {
        this.notApplicableCount = value;
    }
    /**
     * Sets the pendingCount property value. Number of pending Users
     * @param value Value to set for the pendingCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPendingCount(@jakarta.annotation.Nullable final Integer value) {
        this.pendingCount = value;
    }
    /**
     * Sets the successCount property value. Number of succeeded Users
     * @param value Value to set for the successCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSuccessCount(@jakarta.annotation.Nullable final Integer value) {
        this.successCount = value;
    }
}
