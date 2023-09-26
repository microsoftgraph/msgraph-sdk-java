package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Summary data for managed devices
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedDeviceOverview extends Entity implements Parsable {
    /**
     * Distribution of Exchange Access State in Intune
     */
    private DeviceExchangeAccessStateSummary deviceExchangeAccessStateSummary;
    /**
     * Device operating system summary.
     */
    private DeviceOperatingSystemSummary deviceOperatingSystemSummary;
    /**
     * The number of devices enrolled in both MDM and EAS
     */
    private Integer dualEnrolledDeviceCount;
    /**
     * Total enrolled device count. Does not include PC devices managed via Intune PC Agent
     */
    private Integer enrolledDeviceCount;
    /**
     * The number of devices enrolled in MDM
     */
    private Integer mdmEnrolledCount;
    /**
     * Instantiates a new ManagedDeviceOverview and sets the default values.
     */
    public ManagedDeviceOverview() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedDeviceOverview
     */
    @jakarta.annotation.Nonnull
    public static ManagedDeviceOverview createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceOverview();
    }
    /**
     * Gets the deviceExchangeAccessStateSummary property value. Distribution of Exchange Access State in Intune
     * @return a DeviceExchangeAccessStateSummary
     */
    @jakarta.annotation.Nullable
    public DeviceExchangeAccessStateSummary getDeviceExchangeAccessStateSummary() {
        return this.deviceExchangeAccessStateSummary;
    }
    /**
     * Gets the deviceOperatingSystemSummary property value. Device operating system summary.
     * @return a DeviceOperatingSystemSummary
     */
    @jakarta.annotation.Nullable
    public DeviceOperatingSystemSummary getDeviceOperatingSystemSummary() {
        return this.deviceOperatingSystemSummary;
    }
    /**
     * Gets the dualEnrolledDeviceCount property value. The number of devices enrolled in both MDM and EAS
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDualEnrolledDeviceCount() {
        return this.dualEnrolledDeviceCount;
    }
    /**
     * Gets the enrolledDeviceCount property value. Total enrolled device count. Does not include PC devices managed via Intune PC Agent
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getEnrolledDeviceCount() {
        return this.enrolledDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceExchangeAccessStateSummary", (n) -> { this.setDeviceExchangeAccessStateSummary(n.getObjectValue(DeviceExchangeAccessStateSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceOperatingSystemSummary", (n) -> { this.setDeviceOperatingSystemSummary(n.getObjectValue(DeviceOperatingSystemSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("dualEnrolledDeviceCount", (n) -> { this.setDualEnrolledDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("enrolledDeviceCount", (n) -> { this.setEnrolledDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("mdmEnrolledCount", (n) -> { this.setMdmEnrolledCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mdmEnrolledCount property value. The number of devices enrolled in MDM
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMdmEnrolledCount() {
        return this.mdmEnrolledCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setDeviceExchangeAccessStateSummary(@jakarta.annotation.Nullable final DeviceExchangeAccessStateSummary value) {
        this.deviceExchangeAccessStateSummary = value;
    }
    /**
     * Sets the deviceOperatingSystemSummary property value. Device operating system summary.
     * @param value Value to set for the deviceOperatingSystemSummary property.
     */
    public void setDeviceOperatingSystemSummary(@jakarta.annotation.Nullable final DeviceOperatingSystemSummary value) {
        this.deviceOperatingSystemSummary = value;
    }
    /**
     * Sets the dualEnrolledDeviceCount property value. The number of devices enrolled in both MDM and EAS
     * @param value Value to set for the dualEnrolledDeviceCount property.
     */
    public void setDualEnrolledDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.dualEnrolledDeviceCount = value;
    }
    /**
     * Sets the enrolledDeviceCount property value. Total enrolled device count. Does not include PC devices managed via Intune PC Agent
     * @param value Value to set for the enrolledDeviceCount property.
     */
    public void setEnrolledDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.enrolledDeviceCount = value;
    }
    /**
     * Sets the mdmEnrolledCount property value. The number of devices enrolled in MDM
     * @param value Value to set for the mdmEnrolledCount property.
     */
    public void setMdmEnrolledCount(@jakarta.annotation.Nullable final Integer value) {
        this.mdmEnrolledCount = value;
    }
}
