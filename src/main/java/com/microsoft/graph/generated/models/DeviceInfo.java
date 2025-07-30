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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DeviceInfo} and sets the default values.
     */
    public DeviceInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceInfo}
     */
    @jakarta.annotation.Nonnull
    public static DeviceInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceInfo();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the deviceId property value. Unique identifier set by Azure Device Registration Service at the time of registration.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the displayName property value. The display name for the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the enrollmentProfileName property value. Enrollment profile applied to the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEnrollmentProfileName() {
        return this.backingStore.get("enrollmentProfileName");
    }
    /**
     * Gets the extensionAttribute1 property value. Extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute1() {
        return this.backingStore.get("extensionAttribute1");
    }
    /**
     * Gets the extensionAttribute10 property value. Extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute10() {
        return this.backingStore.get("extensionAttribute10");
    }
    /**
     * Gets the extensionAttribute11 property value. Extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute11() {
        return this.backingStore.get("extensionAttribute11");
    }
    /**
     * Gets the extensionAttribute12 property value. Extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute12() {
        return this.backingStore.get("extensionAttribute12");
    }
    /**
     * Gets the extensionAttribute13 property value. Extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute13() {
        return this.backingStore.get("extensionAttribute13");
    }
    /**
     * Gets the extensionAttribute14 property value. Extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute14() {
        return this.backingStore.get("extensionAttribute14");
    }
    /**
     * Gets the extensionAttribute15 property value. Extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute15() {
        return this.backingStore.get("extensionAttribute15");
    }
    /**
     * Gets the extensionAttribute2 property value. Extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute2() {
        return this.backingStore.get("extensionAttribute2");
    }
    /**
     * Gets the extensionAttribute3 property value. Extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute3() {
        return this.backingStore.get("extensionAttribute3");
    }
    /**
     * Gets the extensionAttribute4 property value. Extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute4() {
        return this.backingStore.get("extensionAttribute4");
    }
    /**
     * Gets the extensionAttribute5 property value. Extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute5() {
        return this.backingStore.get("extensionAttribute5");
    }
    /**
     * Gets the extensionAttribute6 property value. Extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute6() {
        return this.backingStore.get("extensionAttribute6");
    }
    /**
     * Gets the extensionAttribute7 property value. Extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute7() {
        return this.backingStore.get("extensionAttribute7");
    }
    /**
     * Gets the extensionAttribute8 property value. Extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute8() {
        return this.backingStore.get("extensionAttribute8");
    }
    /**
     * Gets the extensionAttribute9 property value. Extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute9() {
        return this.backingStore.get("extensionAttribute9");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(30);
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enrollmentProfileName", (n) -> { this.setEnrollmentProfileName(n.getStringValue()); });
        deserializerMap.put("extensionAttribute1", (n) -> { this.setExtensionAttribute1(n.getStringValue()); });
        deserializerMap.put("extensionAttribute10", (n) -> { this.setExtensionAttribute10(n.getStringValue()); });
        deserializerMap.put("extensionAttribute11", (n) -> { this.setExtensionAttribute11(n.getStringValue()); });
        deserializerMap.put("extensionAttribute12", (n) -> { this.setExtensionAttribute12(n.getStringValue()); });
        deserializerMap.put("extensionAttribute13", (n) -> { this.setExtensionAttribute13(n.getStringValue()); });
        deserializerMap.put("extensionAttribute14", (n) -> { this.setExtensionAttribute14(n.getStringValue()); });
        deserializerMap.put("extensionAttribute15", (n) -> { this.setExtensionAttribute15(n.getStringValue()); });
        deserializerMap.put("extensionAttribute2", (n) -> { this.setExtensionAttribute2(n.getStringValue()); });
        deserializerMap.put("extensionAttribute3", (n) -> { this.setExtensionAttribute3(n.getStringValue()); });
        deserializerMap.put("extensionAttribute4", (n) -> { this.setExtensionAttribute4(n.getStringValue()); });
        deserializerMap.put("extensionAttribute5", (n) -> { this.setExtensionAttribute5(n.getStringValue()); });
        deserializerMap.put("extensionAttribute6", (n) -> { this.setExtensionAttribute6(n.getStringValue()); });
        deserializerMap.put("extensionAttribute7", (n) -> { this.setExtensionAttribute7(n.getStringValue()); });
        deserializerMap.put("extensionAttribute8", (n) -> { this.setExtensionAttribute8(n.getStringValue()); });
        deserializerMap.put("extensionAttribute9", (n) -> { this.setExtensionAttribute9(n.getStringValue()); });
        deserializerMap.put("isCompliant", (n) -> { this.setIsCompliant(n.getBooleanValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("mdmAppId", (n) -> { this.setMdmAppId(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("operatingSystem", (n) -> { this.setOperatingSystem(n.getStringValue()); });
        deserializerMap.put("operatingSystemVersion", (n) -> { this.setOperatingSystemVersion(n.getStringValue()); });
        deserializerMap.put("ownership", (n) -> { this.setOwnership(n.getStringValue()); });
        deserializerMap.put("physicalIds", (n) -> { this.setPhysicalIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("profileType", (n) -> { this.setProfileType(n.getStringValue()); });
        deserializerMap.put("systemLabels", (n) -> { this.setSystemLabels(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("trustType", (n) -> { this.setTrustType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isCompliant property value. Indicates the device compliance status with Mobile Management Device (MDM) policies. Default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCompliant() {
        return this.backingStore.get("isCompliant");
    }
    /**
     * Gets the manufacturer property value. Manufacturer of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.backingStore.get("manufacturer");
    }
    /**
     * Gets the mdmAppId property value. Application identifier used to register device into MDM.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMdmAppId() {
        return this.backingStore.get("mdmAppId");
    }
    /**
     * Gets the model property value. Model of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.backingStore.get("model");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the operatingSystem property value. The type of operating system on the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystem() {
        return this.backingStore.get("operatingSystem");
    }
    /**
     * Gets the operatingSystemVersion property value. The version of the operating system on the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystemVersion() {
        return this.backingStore.get("operatingSystemVersion");
    }
    /**
     * Gets the ownership property value. Ownership of the device. This property is set by Intune.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOwnership() {
        return this.backingStore.get("ownership");
    }
    /**
     * Gets the physicalIds property value. A collection of physical identifiers for the device.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPhysicalIds() {
        return this.backingStore.get("physicalIds");
    }
    /**
     * Gets the profileType property value. The profile type of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProfileType() {
        return this.backingStore.get("profileType");
    }
    /**
     * Gets the systemLabels property value. List of labels applied to the device by the system.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSystemLabels() {
        return this.backingStore.get("systemLabels");
    }
    /**
     * Gets the trustType property value. Type of trust for the joined device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTrustType() {
        return this.backingStore.get("trustType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("enrollmentProfileName", this.getEnrollmentProfileName());
        writer.writeStringValue("extensionAttribute1", this.getExtensionAttribute1());
        writer.writeStringValue("extensionAttribute10", this.getExtensionAttribute10());
        writer.writeStringValue("extensionAttribute11", this.getExtensionAttribute11());
        writer.writeStringValue("extensionAttribute12", this.getExtensionAttribute12());
        writer.writeStringValue("extensionAttribute13", this.getExtensionAttribute13());
        writer.writeStringValue("extensionAttribute14", this.getExtensionAttribute14());
        writer.writeStringValue("extensionAttribute15", this.getExtensionAttribute15());
        writer.writeStringValue("extensionAttribute2", this.getExtensionAttribute2());
        writer.writeStringValue("extensionAttribute3", this.getExtensionAttribute3());
        writer.writeStringValue("extensionAttribute4", this.getExtensionAttribute4());
        writer.writeStringValue("extensionAttribute5", this.getExtensionAttribute5());
        writer.writeStringValue("extensionAttribute6", this.getExtensionAttribute6());
        writer.writeStringValue("extensionAttribute7", this.getExtensionAttribute7());
        writer.writeStringValue("extensionAttribute8", this.getExtensionAttribute8());
        writer.writeStringValue("extensionAttribute9", this.getExtensionAttribute9());
        writer.writeBooleanValue("isCompliant", this.getIsCompliant());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("mdmAppId", this.getMdmAppId());
        writer.writeStringValue("model", this.getModel());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("operatingSystem", this.getOperatingSystem());
        writer.writeStringValue("operatingSystemVersion", this.getOperatingSystemVersion());
        writer.writeStringValue("ownership", this.getOwnership());
        writer.writeCollectionOfPrimitiveValues("physicalIds", this.getPhysicalIds());
        writer.writeStringValue("profileType", this.getProfileType());
        writer.writeCollectionOfPrimitiveValues("systemLabels", this.getSystemLabels());
        writer.writeStringValue("trustType", this.getTrustType());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the deviceId property value. Unique identifier set by Azure Device Registration Service at the time of registration.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the displayName property value. The display name for the device.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the enrollmentProfileName property value. Enrollment profile applied to the device.
     * @param value Value to set for the enrollmentProfileName property.
     */
    public void setEnrollmentProfileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("enrollmentProfileName", value);
    }
    /**
     * Sets the extensionAttribute1 property value. Extension attribute.
     * @param value Value to set for the extensionAttribute1 property.
     */
    public void setExtensionAttribute1(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute1", value);
    }
    /**
     * Sets the extensionAttribute10 property value. Extension attribute.
     * @param value Value to set for the extensionAttribute10 property.
     */
    public void setExtensionAttribute10(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute10", value);
    }
    /**
     * Sets the extensionAttribute11 property value. Extension attribute.
     * @param value Value to set for the extensionAttribute11 property.
     */
    public void setExtensionAttribute11(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute11", value);
    }
    /**
     * Sets the extensionAttribute12 property value. Extension attribute.
     * @param value Value to set for the extensionAttribute12 property.
     */
    public void setExtensionAttribute12(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute12", value);
    }
    /**
     * Sets the extensionAttribute13 property value. Extension attribute.
     * @param value Value to set for the extensionAttribute13 property.
     */
    public void setExtensionAttribute13(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute13", value);
    }
    /**
     * Sets the extensionAttribute14 property value. Extension attribute.
     * @param value Value to set for the extensionAttribute14 property.
     */
    public void setExtensionAttribute14(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute14", value);
    }
    /**
     * Sets the extensionAttribute15 property value. Extension attribute.
     * @param value Value to set for the extensionAttribute15 property.
     */
    public void setExtensionAttribute15(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute15", value);
    }
    /**
     * Sets the extensionAttribute2 property value. Extension attribute.
     * @param value Value to set for the extensionAttribute2 property.
     */
    public void setExtensionAttribute2(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute2", value);
    }
    /**
     * Sets the extensionAttribute3 property value. Extension attribute.
     * @param value Value to set for the extensionAttribute3 property.
     */
    public void setExtensionAttribute3(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute3", value);
    }
    /**
     * Sets the extensionAttribute4 property value. Extension attribute.
     * @param value Value to set for the extensionAttribute4 property.
     */
    public void setExtensionAttribute4(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute4", value);
    }
    /**
     * Sets the extensionAttribute5 property value. Extension attribute.
     * @param value Value to set for the extensionAttribute5 property.
     */
    public void setExtensionAttribute5(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute5", value);
    }
    /**
     * Sets the extensionAttribute6 property value. Extension attribute.
     * @param value Value to set for the extensionAttribute6 property.
     */
    public void setExtensionAttribute6(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute6", value);
    }
    /**
     * Sets the extensionAttribute7 property value. Extension attribute.
     * @param value Value to set for the extensionAttribute7 property.
     */
    public void setExtensionAttribute7(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute7", value);
    }
    /**
     * Sets the extensionAttribute8 property value. Extension attribute.
     * @param value Value to set for the extensionAttribute8 property.
     */
    public void setExtensionAttribute8(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute8", value);
    }
    /**
     * Sets the extensionAttribute9 property value. Extension attribute.
     * @param value Value to set for the extensionAttribute9 property.
     */
    public void setExtensionAttribute9(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute9", value);
    }
    /**
     * Sets the isCompliant property value. Indicates the device compliance status with Mobile Management Device (MDM) policies. Default is false.
     * @param value Value to set for the isCompliant property.
     */
    public void setIsCompliant(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCompliant", value);
    }
    /**
     * Sets the manufacturer property value. Manufacturer of the device.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manufacturer", value);
    }
    /**
     * Sets the mdmAppId property value. Application identifier used to register device into MDM.
     * @param value Value to set for the mdmAppId property.
     */
    public void setMdmAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mdmAppId", value);
    }
    /**
     * Sets the model property value. Model of the device.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("model", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the operatingSystem property value. The type of operating system on the device.
     * @param value Value to set for the operatingSystem property.
     */
    public void setOperatingSystem(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("operatingSystem", value);
    }
    /**
     * Sets the operatingSystemVersion property value. The version of the operating system on the device.
     * @param value Value to set for the operatingSystemVersion property.
     */
    public void setOperatingSystemVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("operatingSystemVersion", value);
    }
    /**
     * Sets the ownership property value. Ownership of the device. This property is set by Intune.
     * @param value Value to set for the ownership property.
     */
    public void setOwnership(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ownership", value);
    }
    /**
     * Sets the physicalIds property value. A collection of physical identifiers for the device.
     * @param value Value to set for the physicalIds property.
     */
    public void setPhysicalIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("physicalIds", value);
    }
    /**
     * Sets the profileType property value. The profile type of the device.
     * @param value Value to set for the profileType property.
     */
    public void setProfileType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("profileType", value);
    }
    /**
     * Sets the systemLabels property value. List of labels applied to the device by the system.
     * @param value Value to set for the systemLabels property.
     */
    public void setSystemLabels(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("systemLabels", value);
    }
    /**
     * Sets the trustType property value. Type of trust for the joined device.
     * @param value Value to set for the trustType property.
     */
    public void setTrustType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("trustType", value);
    }
}
