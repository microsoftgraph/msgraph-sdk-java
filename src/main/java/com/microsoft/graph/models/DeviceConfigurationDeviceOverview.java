package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceConfigurationDeviceOverview extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceConfigurationDeviceOverview and sets the default values.
     */
    public DeviceConfigurationDeviceOverview() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceConfigurationDeviceOverview
     */
    @jakarta.annotation.Nonnull
    public static DeviceConfigurationDeviceOverview createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceConfigurationDeviceOverview();
    }
    /**
     * Gets the configurationVersion property value. Version of the policy for that overview
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConfigurationVersion() {
        return this.getBackingStore().get("configurationVersion");
    }
    /**
     * Gets the errorCount property value. Number of error devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getErrorCount() {
        return this.getBackingStore().get("errorCount");
    }
    /**
     * Gets the failedCount property value. Number of failed devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFailedCount() {
        return this.getBackingStore().get("failedCount");
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
        return this.getBackingStore().get("lastUpdateDateTime");
    }
    /**
     * Gets the notApplicableCount property value. Number of not applicable devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNotApplicableCount() {
        return this.getBackingStore().get("notApplicableCount");
    }
    /**
     * Gets the pendingCount property value. Number of pending devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPendingCount() {
        return this.getBackingStore().get("pendingCount");
    }
    /**
     * Gets the successCount property value. Number of succeeded devices
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessCount() {
        return this.getBackingStore().get("successCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     */
    public void setConfigurationVersion(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("configurationVersion", value);
    }
    /**
     * Sets the errorCount property value. Number of error devices
     * @param value Value to set for the errorCount property.
     */
    public void setErrorCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("errorCount", value);
    }
    /**
     * Sets the failedCount property value. Number of failed devices
     * @param value Value to set for the failedCount property.
     */
    public void setFailedCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("failedCount", value);
    }
    /**
     * Sets the lastUpdateDateTime property value. Last update time
     * @param value Value to set for the lastUpdateDateTime property.
     */
    public void setLastUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("lastUpdateDateTime", value);
    }
    /**
     * Sets the notApplicableCount property value. Number of not applicable devices
     * @param value Value to set for the notApplicableCount property.
     */
    public void setNotApplicableCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("notApplicableCount", value);
    }
    /**
     * Sets the pendingCount property value. Number of pending devices
     * @param value Value to set for the pendingCount property.
     */
    public void setPendingCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("pendingCount", value);
    }
    /**
     * Sets the successCount property value. Number of succeeded devices
     * @param value Value to set for the successCount property.
     */
    public void setSuccessCount(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("successCount", value);
    }
}
