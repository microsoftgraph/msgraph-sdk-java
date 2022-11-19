package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceEnrollmentPlatformRestrictionsConfiguration extends DeviceEnrollmentConfiguration implements Parsable {
    /** Android restrictions based on platform, platform operating system version, and device ownership */
    private DeviceEnrollmentPlatformRestriction _androidRestriction;
    /** Ios restrictions based on platform, platform operating system version, and device ownership */
    private DeviceEnrollmentPlatformRestriction _iosRestriction;
    /** Mac restrictions based on platform, platform operating system version, and device ownership */
    private DeviceEnrollmentPlatformRestriction _macOSRestriction;
    /** Windows mobile restrictions based on platform, platform operating system version, and device ownership */
    private DeviceEnrollmentPlatformRestriction _windowsMobileRestriction;
    /** Windows restrictions based on platform, platform operating system version, and device ownership */
    private DeviceEnrollmentPlatformRestriction _windowsRestriction;
    /**
     * Instantiates a new DeviceEnrollmentPlatformRestrictionsConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceEnrollmentPlatformRestrictionsConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.deviceEnrollmentPlatformRestrictionsConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceEnrollmentPlatformRestrictionsConfiguration
     */
    @javax.annotation.Nonnull
    public static DeviceEnrollmentPlatformRestrictionsConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceEnrollmentPlatformRestrictionsConfiguration();
    }
    /**
     * Gets the androidRestriction property value. Android restrictions based on platform, platform operating system version, and device ownership
     * @return a deviceEnrollmentPlatformRestriction
     */
    @javax.annotation.Nullable
    public DeviceEnrollmentPlatformRestriction getAndroidRestriction() {
        return this._androidRestriction;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceEnrollmentPlatformRestrictionsConfiguration currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("androidRestriction", (n) -> { currentObject.setAndroidRestriction(n.getObjectValue(DeviceEnrollmentPlatformRestriction::createFromDiscriminatorValue)); });
        deserializerMap.put("iosRestriction", (n) -> { currentObject.setIosRestriction(n.getObjectValue(DeviceEnrollmentPlatformRestriction::createFromDiscriminatorValue)); });
        deserializerMap.put("macOSRestriction", (n) -> { currentObject.setMacOSRestriction(n.getObjectValue(DeviceEnrollmentPlatformRestriction::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsMobileRestriction", (n) -> { currentObject.setWindowsMobileRestriction(n.getObjectValue(DeviceEnrollmentPlatformRestriction::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsRestriction", (n) -> { currentObject.setWindowsRestriction(n.getObjectValue(DeviceEnrollmentPlatformRestriction::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the iosRestriction property value. Ios restrictions based on platform, platform operating system version, and device ownership
     * @return a deviceEnrollmentPlatformRestriction
     */
    @javax.annotation.Nullable
    public DeviceEnrollmentPlatformRestriction getIosRestriction() {
        return this._iosRestriction;
    }
    /**
     * Gets the macOSRestriction property value. Mac restrictions based on platform, platform operating system version, and device ownership
     * @return a deviceEnrollmentPlatformRestriction
     */
    @javax.annotation.Nullable
    public DeviceEnrollmentPlatformRestriction getMacOSRestriction() {
        return this._macOSRestriction;
    }
    /**
     * Gets the windowsMobileRestriction property value. Windows mobile restrictions based on platform, platform operating system version, and device ownership
     * @return a deviceEnrollmentPlatformRestriction
     */
    @javax.annotation.Nullable
    public DeviceEnrollmentPlatformRestriction getWindowsMobileRestriction() {
        return this._windowsMobileRestriction;
    }
    /**
     * Gets the windowsRestriction property value. Windows restrictions based on platform, platform operating system version, and device ownership
     * @return a deviceEnrollmentPlatformRestriction
     */
    @javax.annotation.Nullable
    public DeviceEnrollmentPlatformRestriction getWindowsRestriction() {
        return this._windowsRestriction;
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
        writer.writeObjectValue("androidRestriction", this.getAndroidRestriction());
        writer.writeObjectValue("iosRestriction", this.getIosRestriction());
        writer.writeObjectValue("macOSRestriction", this.getMacOSRestriction());
        writer.writeObjectValue("windowsMobileRestriction", this.getWindowsMobileRestriction());
        writer.writeObjectValue("windowsRestriction", this.getWindowsRestriction());
    }
    /**
     * Sets the androidRestriction property value. Android restrictions based on platform, platform operating system version, and device ownership
     * @param value Value to set for the androidRestriction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidRestriction(@javax.annotation.Nullable final DeviceEnrollmentPlatformRestriction value) {
        this._androidRestriction = value;
    }
    /**
     * Sets the iosRestriction property value. Ios restrictions based on platform, platform operating system version, and device ownership
     * @param value Value to set for the iosRestriction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIosRestriction(@javax.annotation.Nullable final DeviceEnrollmentPlatformRestriction value) {
        this._iosRestriction = value;
    }
    /**
     * Sets the macOSRestriction property value. Mac restrictions based on platform, platform operating system version, and device ownership
     * @param value Value to set for the macOSRestriction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMacOSRestriction(@javax.annotation.Nullable final DeviceEnrollmentPlatformRestriction value) {
        this._macOSRestriction = value;
    }
    /**
     * Sets the windowsMobileRestriction property value. Windows mobile restrictions based on platform, platform operating system version, and device ownership
     * @param value Value to set for the windowsMobileRestriction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsMobileRestriction(@javax.annotation.Nullable final DeviceEnrollmentPlatformRestriction value) {
        this._windowsMobileRestriction = value;
    }
    /**
     * Sets the windowsRestriction property value. Windows restrictions based on platform, platform operating system version, and device ownership
     * @param value Value to set for the windowsRestriction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsRestriction(@javax.annotation.Nullable final DeviceEnrollmentPlatformRestriction value) {
        this._windowsRestriction = value;
    }
}
