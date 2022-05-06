package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedDeviceMobileAppConfigurationDeviceSummary extends Entity implements Parsable {
    /** Version of the policy for that overview  */
    private Integer _configurationVersion;
    /** Number of error devices  */
    private Integer _errorCount;
    /** Number of failed devices  */
    private Integer _failedCount;
    /** Last update time  */
    private OffsetDateTime _lastUpdateDateTime;
    /** Number of not applicable devices  */
    private Integer _notApplicableCount;
    /** Number of pending devices  */
    private Integer _pendingCount;
    /** Number of succeeded devices  */
    private Integer _successCount;
    /**
     * Instantiates a new managedDeviceMobileAppConfigurationDeviceSummary and sets the default values.
     * @return a void
     */
    public ManagedDeviceMobileAppConfigurationDeviceSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedDeviceMobileAppConfigurationDeviceSummary
     */
    @javax.annotation.Nonnull
    public static ManagedDeviceMobileAppConfigurationDeviceSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceMobileAppConfigurationDeviceSummary();
    }
    /**
     * Gets the configurationVersion property value. Version of the policy for that overview
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConfigurationVersion() {
        return this._configurationVersion;
    }
    /**
     * Gets the errorCount property value. Number of error devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorCount() {
        return this._errorCount;
    }
    /**
     * Gets the failedCount property value. Number of failed devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedCount() {
        return this._failedCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedDeviceMobileAppConfigurationDeviceSummary currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("configurationVersion", (n) -> { currentObject.setConfigurationVersion(n.getIntegerValue()); });
            this.put("errorCount", (n) -> { currentObject.setErrorCount(n.getIntegerValue()); });
            this.put("failedCount", (n) -> { currentObject.setFailedCount(n.getIntegerValue()); });
            this.put("lastUpdateDateTime", (n) -> { currentObject.setLastUpdateDateTime(n.getOffsetDateTimeValue()); });
            this.put("notApplicableCount", (n) -> { currentObject.setNotApplicableCount(n.getIntegerValue()); });
            this.put("pendingCount", (n) -> { currentObject.setPendingCount(n.getIntegerValue()); });
            this.put("successCount", (n) -> { currentObject.setSuccessCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the lastUpdateDateTime property value. Last update time
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdateDateTime() {
        return this._lastUpdateDateTime;
    }
    /**
     * Gets the notApplicableCount property value. Number of not applicable devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotApplicableCount() {
        return this._notApplicableCount;
    }
    /**
     * Gets the pendingCount property value. Number of pending devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPendingCount() {
        return this._pendingCount;
    }
    /**
     * Gets the successCount property value. Number of succeeded devices
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSuccessCount() {
        return this._successCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
    public void setConfigurationVersion(@javax.annotation.Nullable final Integer value) {
        this._configurationVersion = value;
    }
    /**
     * Sets the errorCount property value. Number of error devices
     * @param value Value to set for the errorCount property.
     * @return a void
     */
    public void setErrorCount(@javax.annotation.Nullable final Integer value) {
        this._errorCount = value;
    }
    /**
     * Sets the failedCount property value. Number of failed devices
     * @param value Value to set for the failedCount property.
     * @return a void
     */
    public void setFailedCount(@javax.annotation.Nullable final Integer value) {
        this._failedCount = value;
    }
    /**
     * Sets the lastUpdateDateTime property value. Last update time
     * @param value Value to set for the lastUpdateDateTime property.
     * @return a void
     */
    public void setLastUpdateDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastUpdateDateTime = value;
    }
    /**
     * Sets the notApplicableCount property value. Number of not applicable devices
     * @param value Value to set for the notApplicableCount property.
     * @return a void
     */
    public void setNotApplicableCount(@javax.annotation.Nullable final Integer value) {
        this._notApplicableCount = value;
    }
    /**
     * Sets the pendingCount property value. Number of pending devices
     * @param value Value to set for the pendingCount property.
     * @return a void
     */
    public void setPendingCount(@javax.annotation.Nullable final Integer value) {
        this._pendingCount = value;
    }
    /**
     * Sets the successCount property value. Number of succeeded devices
     * @param value Value to set for the successCount property.
     * @return a void
     */
    public void setSuccessCount(@javax.annotation.Nullable final Integer value) {
        this._successCount = value;
    }
}
