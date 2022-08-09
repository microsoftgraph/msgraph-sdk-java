package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedDeviceOverview extends Entity implements Parsable {
    /** Distribution of Exchange Access State in Intune */
    private DeviceExchangeAccessStateSummary _deviceExchangeAccessStateSummary;
    /** Device operating system summary. */
    private DeviceOperatingSystemSummary _deviceOperatingSystemSummary;
    /** The number of devices enrolled in both MDM and EAS */
    private Integer _dualEnrolledDeviceCount;
    /** Total enrolled device count. Does not include PC devices managed via Intune PC Agent */
    private Integer _enrolledDeviceCount;
    /** The number of devices enrolled in MDM */
    private Integer _mdmEnrolledCount;
    /**
     * Instantiates a new ManagedDeviceOverview and sets the default values.
     * @return a void
     */
    public ManagedDeviceOverview() {
        super();
        this.setOdataType("#microsoft.graph.managedDeviceOverview");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedDeviceOverview
     */
    @javax.annotation.Nonnull
    public static ManagedDeviceOverview createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceOverview();
    }
    /**
     * Gets the deviceExchangeAccessStateSummary property value. Distribution of Exchange Access State in Intune
     * @return a deviceExchangeAccessStateSummary
     */
    @javax.annotation.Nullable
    public DeviceExchangeAccessStateSummary getDeviceExchangeAccessStateSummary() {
        return this._deviceExchangeAccessStateSummary;
    }
    /**
     * Gets the deviceOperatingSystemSummary property value. Device operating system summary.
     * @return a deviceOperatingSystemSummary
     */
    @javax.annotation.Nullable
    public DeviceOperatingSystemSummary getDeviceOperatingSystemSummary() {
        return this._deviceOperatingSystemSummary;
    }
    /**
     * Gets the dualEnrolledDeviceCount property value. The number of devices enrolled in both MDM and EAS
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDualEnrolledDeviceCount() {
        return this._dualEnrolledDeviceCount;
    }
    /**
     * Gets the enrolledDeviceCount property value. Total enrolled device count. Does not include PC devices managed via Intune PC Agent
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEnrolledDeviceCount() {
        return this._enrolledDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedDeviceOverview currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("deviceExchangeAccessStateSummary", (n) -> { currentObject.setDeviceExchangeAccessStateSummary(n.getObjectValue(DeviceExchangeAccessStateSummary::createFromDiscriminatorValue)); });
            this.put("deviceOperatingSystemSummary", (n) -> { currentObject.setDeviceOperatingSystemSummary(n.getObjectValue(DeviceOperatingSystemSummary::createFromDiscriminatorValue)); });
            this.put("dualEnrolledDeviceCount", (n) -> { currentObject.setDualEnrolledDeviceCount(n.getIntegerValue()); });
            this.put("enrolledDeviceCount", (n) -> { currentObject.setEnrolledDeviceCount(n.getIntegerValue()); });
            this.put("mdmEnrolledCount", (n) -> { currentObject.setMdmEnrolledCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the mdmEnrolledCount property value. The number of devices enrolled in MDM
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMdmEnrolledCount() {
        return this._mdmEnrolledCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("deviceExchangeAccessStateSummary", this.getDeviceExchangeAccessStateSummary());
        writer.writeObjectValue("deviceOperatingSystemSummary", this.getDeviceOperatingSystemSummary());
        writer.writeIntegerValue("dualEnrolledDeviceCount", this.getDualEnrolledDeviceCount());
        writer.writeIntegerValue("enrolledDeviceCount", this.getEnrolledDeviceCount());
        writer.writeIntegerValue("mdmEnrolledCount", this.getMdmEnrolledCount());
    }
    /**
     * Sets the deviceExchangeAccessStateSummary property value. Distribution of Exchange Access State in Intune
     * @param value Value to set for the deviceExchangeAccessStateSummary property.
     * @return a void
     */
    public void setDeviceExchangeAccessStateSummary(@javax.annotation.Nullable final DeviceExchangeAccessStateSummary value) {
        this._deviceExchangeAccessStateSummary = value;
    }
    /**
     * Sets the deviceOperatingSystemSummary property value. Device operating system summary.
     * @param value Value to set for the deviceOperatingSystemSummary property.
     * @return a void
     */
    public void setDeviceOperatingSystemSummary(@javax.annotation.Nullable final DeviceOperatingSystemSummary value) {
        this._deviceOperatingSystemSummary = value;
    }
    /**
     * Sets the dualEnrolledDeviceCount property value. The number of devices enrolled in both MDM and EAS
     * @param value Value to set for the dualEnrolledDeviceCount property.
     * @return a void
     */
    public void setDualEnrolledDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._dualEnrolledDeviceCount = value;
    }
    /**
     * Sets the enrolledDeviceCount property value. Total enrolled device count. Does not include PC devices managed via Intune PC Agent
     * @param value Value to set for the enrolledDeviceCount property.
     * @return a void
     */
    public void setEnrolledDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._enrolledDeviceCount = value;
    }
    /**
     * Sets the mdmEnrolledCount property value. The number of devices enrolled in MDM
     * @param value Value to set for the mdmEnrolledCount property.
     * @return a void
     */
    public void setMdmEnrolledCount(@javax.annotation.Nullable final Integer value) {
        this._mdmEnrolledCount = value;
    }
}
