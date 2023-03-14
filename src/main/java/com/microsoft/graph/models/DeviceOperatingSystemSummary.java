package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device operating system summary.
 */
public class DeviceOperatingSystemSummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The count of Corporate work profile Android devices. Also known as Corporate Owned Personally Enabled (COPE). Valid values -1 to 2147483647 */
    private Integer androidCorporateWorkProfileCount;
    /** Number of android device count. */
    private Integer androidCount;
    /** Number of dedicated Android devices. */
    private Integer androidDedicatedCount;
    /** Number of device admin Android devices. */
    private Integer androidDeviceAdminCount;
    /** Number of fully managed Android devices. */
    private Integer androidFullyManagedCount;
    /** Number of work profile Android devices. */
    private Integer androidWorkProfileCount;
    /** Number of ConfigMgr managed devices. */
    private Integer configMgrDeviceCount;
    /** Number of iOS device count. */
    private Integer iosCount;
    /** Number of Mac OS X device count. */
    private Integer macOSCount;
    /** The OdataType property */
    private String odataType;
    /** Number of unknown device count. */
    private Integer unknownCount;
    /** Number of Windows device count. */
    private Integer windowsCount;
    /** Number of Windows mobile device count. */
    private Integer windowsMobileCount;
    /**
     * Instantiates a new deviceOperatingSystemSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceOperatingSystemSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceOperatingSystemSummary
     */
    @javax.annotation.Nonnull
    public static DeviceOperatingSystemSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceOperatingSystemSummary();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the androidCorporateWorkProfileCount property value. The count of Corporate work profile Android devices. Also known as Corporate Owned Personally Enabled (COPE). Valid values -1 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAndroidCorporateWorkProfileCount() {
        return this.androidCorporateWorkProfileCount;
    }
    /**
     * Gets the androidCount property value. Number of android device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAndroidCount() {
        return this.androidCount;
    }
    /**
     * Gets the androidDedicatedCount property value. Number of dedicated Android devices.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAndroidDedicatedCount() {
        return this.androidDedicatedCount;
    }
    /**
     * Gets the androidDeviceAdminCount property value. Number of device admin Android devices.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAndroidDeviceAdminCount() {
        return this.androidDeviceAdminCount;
    }
    /**
     * Gets the androidFullyManagedCount property value. Number of fully managed Android devices.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAndroidFullyManagedCount() {
        return this.androidFullyManagedCount;
    }
    /**
     * Gets the androidWorkProfileCount property value. Number of work profile Android devices.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAndroidWorkProfileCount() {
        return this.androidWorkProfileCount;
    }
    /**
     * Gets the configMgrDeviceCount property value. Number of ConfigMgr managed devices.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConfigMgrDeviceCount() {
        return this.configMgrDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("androidCorporateWorkProfileCount", (n) -> { this.setAndroidCorporateWorkProfileCount(n.getIntegerValue()); });
        deserializerMap.put("androidCount", (n) -> { this.setAndroidCount(n.getIntegerValue()); });
        deserializerMap.put("androidDedicatedCount", (n) -> { this.setAndroidDedicatedCount(n.getIntegerValue()); });
        deserializerMap.put("androidDeviceAdminCount", (n) -> { this.setAndroidDeviceAdminCount(n.getIntegerValue()); });
        deserializerMap.put("androidFullyManagedCount", (n) -> { this.setAndroidFullyManagedCount(n.getIntegerValue()); });
        deserializerMap.put("androidWorkProfileCount", (n) -> { this.setAndroidWorkProfileCount(n.getIntegerValue()); });
        deserializerMap.put("configMgrDeviceCount", (n) -> { this.setConfigMgrDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("iosCount", (n) -> { this.setIosCount(n.getIntegerValue()); });
        deserializerMap.put("macOSCount", (n) -> { this.setMacOSCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("unknownCount", (n) -> { this.setUnknownCount(n.getIntegerValue()); });
        deserializerMap.put("windowsCount", (n) -> { this.setWindowsCount(n.getIntegerValue()); });
        deserializerMap.put("windowsMobileCount", (n) -> { this.setWindowsMobileCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the iosCount property value. Number of iOS device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIosCount() {
        return this.iosCount;
    }
    /**
     * Gets the macOSCount property value. Number of Mac OS X device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMacOSCount() {
        return this.macOSCount;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the unknownCount property value. Number of unknown device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnknownCount() {
        return this.unknownCount;
    }
    /**
     * Gets the windowsCount property value. Number of Windows device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWindowsCount() {
        return this.windowsCount;
    }
    /**
     * Gets the windowsMobileCount property value. Number of Windows mobile device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWindowsMobileCount() {
        return this.windowsMobileCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("androidCorporateWorkProfileCount", this.getAndroidCorporateWorkProfileCount());
        writer.writeIntegerValue("androidCount", this.getAndroidCount());
        writer.writeIntegerValue("androidDedicatedCount", this.getAndroidDedicatedCount());
        writer.writeIntegerValue("androidDeviceAdminCount", this.getAndroidDeviceAdminCount());
        writer.writeIntegerValue("androidFullyManagedCount", this.getAndroidFullyManagedCount());
        writer.writeIntegerValue("androidWorkProfileCount", this.getAndroidWorkProfileCount());
        writer.writeIntegerValue("configMgrDeviceCount", this.getConfigMgrDeviceCount());
        writer.writeIntegerValue("iosCount", this.getIosCount());
        writer.writeIntegerValue("macOSCount", this.getMacOSCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("unknownCount", this.getUnknownCount());
        writer.writeIntegerValue("windowsCount", this.getWindowsCount());
        writer.writeIntegerValue("windowsMobileCount", this.getWindowsMobileCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the androidCorporateWorkProfileCount property value. The count of Corporate work profile Android devices. Also known as Corporate Owned Personally Enabled (COPE). Valid values -1 to 2147483647
     * @param value Value to set for the androidCorporateWorkProfileCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidCorporateWorkProfileCount(@javax.annotation.Nullable final Integer value) {
        this.androidCorporateWorkProfileCount = value;
    }
    /**
     * Sets the androidCount property value. Number of android device count.
     * @param value Value to set for the androidCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidCount(@javax.annotation.Nullable final Integer value) {
        this.androidCount = value;
    }
    /**
     * Sets the androidDedicatedCount property value. Number of dedicated Android devices.
     * @param value Value to set for the androidDedicatedCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidDedicatedCount(@javax.annotation.Nullable final Integer value) {
        this.androidDedicatedCount = value;
    }
    /**
     * Sets the androidDeviceAdminCount property value. Number of device admin Android devices.
     * @param value Value to set for the androidDeviceAdminCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidDeviceAdminCount(@javax.annotation.Nullable final Integer value) {
        this.androidDeviceAdminCount = value;
    }
    /**
     * Sets the androidFullyManagedCount property value. Number of fully managed Android devices.
     * @param value Value to set for the androidFullyManagedCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidFullyManagedCount(@javax.annotation.Nullable final Integer value) {
        this.androidFullyManagedCount = value;
    }
    /**
     * Sets the androidWorkProfileCount property value. Number of work profile Android devices.
     * @param value Value to set for the androidWorkProfileCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidWorkProfileCount(@javax.annotation.Nullable final Integer value) {
        this.androidWorkProfileCount = value;
    }
    /**
     * Sets the configMgrDeviceCount property value. Number of ConfigMgr managed devices.
     * @param value Value to set for the configMgrDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigMgrDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.configMgrDeviceCount = value;
    }
    /**
     * Sets the iosCount property value. Number of iOS device count.
     * @param value Value to set for the iosCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIosCount(@javax.annotation.Nullable final Integer value) {
        this.iosCount = value;
    }
    /**
     * Sets the macOSCount property value. Number of Mac OS X device count.
     * @param value Value to set for the macOSCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMacOSCount(@javax.annotation.Nullable final Integer value) {
        this.macOSCount = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the unknownCount property value. Number of unknown device count.
     * @param value Value to set for the unknownCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnknownCount(@javax.annotation.Nullable final Integer value) {
        this.unknownCount = value;
    }
    /**
     * Sets the windowsCount property value. Number of Windows device count.
     * @param value Value to set for the windowsCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsCount(@javax.annotation.Nullable final Integer value) {
        this.windowsCount = value;
    }
    /**
     * Sets the windowsMobileCount property value. Number of Windows mobile device count.
     * @param value Value to set for the windowsMobileCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsMobileCount(@javax.annotation.Nullable final Integer value) {
        this.windowsMobileCount = value;
    }
}
