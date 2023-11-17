package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device operating system summary.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceOperatingSystemSummary implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore backingStore;
    /**
     * Instantiates a new DeviceOperatingSystemSummary and sets the default values.
     */
    public DeviceOperatingSystemSummary() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceOperatingSystemSummary
     */
    @jakarta.annotation.Nonnull
    public static DeviceOperatingSystemSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceOperatingSystemSummary();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the androidCorporateWorkProfileCount property value. The count of Corporate work profile Android devices. Also known as Corporate Owned Personally Enabled (COPE). Valid values -1 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAndroidCorporateWorkProfileCount() {
        return this.backingStore.get("androidCorporateWorkProfileCount");
    }
    /**
     * Gets the androidCount property value. Number of android device count.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAndroidCount() {
        return this.backingStore.get("androidCount");
    }
    /**
     * Gets the androidDedicatedCount property value. Number of dedicated Android devices.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAndroidDedicatedCount() {
        return this.backingStore.get("androidDedicatedCount");
    }
    /**
     * Gets the androidDeviceAdminCount property value. Number of device admin Android devices.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAndroidDeviceAdminCount() {
        return this.backingStore.get("androidDeviceAdminCount");
    }
    /**
     * Gets the androidFullyManagedCount property value. Number of fully managed Android devices.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAndroidFullyManagedCount() {
        return this.backingStore.get("androidFullyManagedCount");
    }
    /**
     * Gets the androidWorkProfileCount property value. Number of work profile Android devices.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAndroidWorkProfileCount() {
        return this.backingStore.get("androidWorkProfileCount");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the configMgrDeviceCount property value. Number of ConfigMgr managed devices.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConfigMgrDeviceCount() {
        return this.backingStore.get("configMgrDeviceCount");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIosCount() {
        return this.backingStore.get("iosCount");
    }
    /**
     * Gets the macOSCount property value. Number of Mac OS X device count.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMacOSCount() {
        return this.backingStore.get("macOSCount");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the unknownCount property value. Number of unknown device count.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUnknownCount() {
        return this.backingStore.get("unknownCount");
    }
    /**
     * Gets the windowsCount property value. Number of Windows device count.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getWindowsCount() {
        return this.backingStore.get("windowsCount");
    }
    /**
     * Gets the windowsMobileCount property value. Number of Windows mobile device count.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getWindowsMobileCount() {
        return this.backingStore.get("windowsMobileCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the androidCorporateWorkProfileCount property value. The count of Corporate work profile Android devices. Also known as Corporate Owned Personally Enabled (COPE). Valid values -1 to 2147483647
     * @param value Value to set for the androidCorporateWorkProfileCount property.
     */
    public void setAndroidCorporateWorkProfileCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("androidCorporateWorkProfileCount", value);
    }
    /**
     * Sets the androidCount property value. Number of android device count.
     * @param value Value to set for the androidCount property.
     */
    public void setAndroidCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("androidCount", value);
    }
    /**
     * Sets the androidDedicatedCount property value. Number of dedicated Android devices.
     * @param value Value to set for the androidDedicatedCount property.
     */
    public void setAndroidDedicatedCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("androidDedicatedCount", value);
    }
    /**
     * Sets the androidDeviceAdminCount property value. Number of device admin Android devices.
     * @param value Value to set for the androidDeviceAdminCount property.
     */
    public void setAndroidDeviceAdminCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("androidDeviceAdminCount", value);
    }
    /**
     * Sets the androidFullyManagedCount property value. Number of fully managed Android devices.
     * @param value Value to set for the androidFullyManagedCount property.
     */
    public void setAndroidFullyManagedCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("androidFullyManagedCount", value);
    }
    /**
     * Sets the androidWorkProfileCount property value. Number of work profile Android devices.
     * @param value Value to set for the androidWorkProfileCount property.
     */
    public void setAndroidWorkProfileCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("androidWorkProfileCount", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the configMgrDeviceCount property value. Number of ConfigMgr managed devices.
     * @param value Value to set for the configMgrDeviceCount property.
     */
    public void setConfigMgrDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("configMgrDeviceCount", value);
    }
    /**
     * Sets the iosCount property value. Number of iOS device count.
     * @param value Value to set for the iosCount property.
     */
    public void setIosCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("iosCount", value);
    }
    /**
     * Sets the macOSCount property value. Number of Mac OS X device count.
     * @param value Value to set for the macOSCount property.
     */
    public void setMacOSCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("macOSCount", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the unknownCount property value. Number of unknown device count.
     * @param value Value to set for the unknownCount property.
     */
    public void setUnknownCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("unknownCount", value);
    }
    /**
     * Sets the windowsCount property value. Number of Windows device count.
     * @param value Value to set for the windowsCount property.
     */
    public void setWindowsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("windowsCount", value);
    }
    /**
     * Sets the windowsMobileCount property value. Number of Windows mobile device count.
     * @param value Value to set for the windowsMobileCount property.
     */
    public void setWindowsMobileCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("windowsMobileCount", value);
    }
}
