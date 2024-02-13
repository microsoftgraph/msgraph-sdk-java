package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceComplianceUserOverview extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceComplianceUserOverview} and sets the default values.
     */
    public DeviceComplianceUserOverview() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceComplianceUserOverview}
     */
    @jakarta.annotation.Nonnull
    public static DeviceComplianceUserOverview createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComplianceUserOverview();
    }
    /**
     * Gets the configurationVersion property value. Version of the policy for that overview
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getConfigurationVersion() {
        return this.backingStore.get("configurationVersion");
    }
    /**
     * Gets the errorCount property value. Number of error Users
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getErrorCount() {
        return this.backingStore.get("errorCount");
    }
    /**
     * Gets the failedCount property value. Number of failed Users
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailedCount() {
        return this.backingStore.get("failedCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdateDateTime() {
        return this.backingStore.get("lastUpdateDateTime");
    }
    /**
     * Gets the notApplicableCount property value. Number of not applicable users
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNotApplicableCount() {
        return this.backingStore.get("notApplicableCount");
    }
    /**
     * Gets the pendingCount property value. Number of pending Users
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPendingCount() {
        return this.backingStore.get("pendingCount");
    }
    /**
     * Gets the successCount property value. Number of succeeded Users
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessCount() {
        return this.backingStore.get("successCount");
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
        this.backingStore.set("configurationVersion", value);
    }
    /**
     * Sets the errorCount property value. Number of error Users
     * @param value Value to set for the errorCount property.
     */
    public void setErrorCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("errorCount", value);
    }
    /**
     * Sets the failedCount property value. Number of failed Users
     * @param value Value to set for the failedCount property.
     */
    public void setFailedCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedCount", value);
    }
    /**
     * Sets the lastUpdateDateTime property value. Last update time
     * @param value Value to set for the lastUpdateDateTime property.
     */
    public void setLastUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUpdateDateTime", value);
    }
    /**
     * Sets the notApplicableCount property value. Number of not applicable users
     * @param value Value to set for the notApplicableCount property.
     */
    public void setNotApplicableCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("notApplicableCount", value);
    }
    /**
     * Sets the pendingCount property value. Number of pending Users
     * @param value Value to set for the pendingCount property.
     */
    public void setPendingCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pendingCount", value);
    }
    /**
     * Sets the successCount property value. Number of succeeded Users
     * @param value Value to set for the successCount property.
     */
    public void setSuccessCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("successCount", value);
    }
}
