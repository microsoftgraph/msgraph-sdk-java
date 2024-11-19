package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IoTDeviceEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new {@link IoTDeviceEvidence} and sets the default values.
     */
    public IoTDeviceEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.ioTDeviceEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IoTDeviceEvidence}
     */
    @jakarta.annotation.Nonnull
    public static IoTDeviceEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IoTDeviceEvidence();
    }
    /**
     * Gets the deviceId property value. The device ID.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the deviceName property value. The friendly name of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * Gets the devicePageLink property value. The URL to the device page in the IoT Defender portal.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDevicePageLink() {
        return this.backingStore.get("devicePageLink");
    }
    /**
     * Gets the deviceSubType property value. The device subtype.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceSubType() {
        return this.backingStore.get("deviceSubType");
    }
    /**
     * Gets the deviceType property value. The type of the device. For example, 'temperature sensor,' 'freezer,' 'wind turbine,' and so on.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceType() {
        return this.backingStore.get("deviceType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("devicePageLink", (n) -> { this.setDevicePageLink(n.getStringValue()); });
        deserializerMap.put("deviceSubType", (n) -> { this.setDeviceSubType(n.getStringValue()); });
        deserializerMap.put("deviceType", (n) -> { this.setDeviceType(n.getStringValue()); });
        deserializerMap.put("importance", (n) -> { this.setImportance(n.getEnumValue(IoTDeviceImportanceType::forValue)); });
        deserializerMap.put("ioTHub", (n) -> { this.setIoTHub(n.getObjectValue(AzureResourceEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("ioTSecurityAgentId", (n) -> { this.setIoTSecurityAgentId(n.getStringValue()); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getObjectValue(IpEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("isAuthorized", (n) -> { this.setIsAuthorized(n.getBooleanValue()); });
        deserializerMap.put("isProgramming", (n) -> { this.setIsProgramming(n.getBooleanValue()); });
        deserializerMap.put("isScanner", (n) -> { this.setIsScanner(n.getBooleanValue()); });
        deserializerMap.put("macAddress", (n) -> { this.setMacAddress(n.getStringValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("nics", (n) -> { this.setNics(n.getCollectionOfObjectValues(NicEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("operatingSystem", (n) -> { this.setOperatingSystem(n.getStringValue()); });
        deserializerMap.put("owners", (n) -> { this.setOwners(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("protocols", (n) -> { this.setProtocols(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("purdueLayer", (n) -> { this.setPurdueLayer(n.getStringValue()); });
        deserializerMap.put("sensor", (n) -> { this.setSensor(n.getStringValue()); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        deserializerMap.put("site", (n) -> { this.setSite(n.getStringValue()); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getStringValue()); });
        deserializerMap.put("sourceRef", (n) -> { this.setSourceRef(n.getObjectValue(UrlEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("zone", (n) -> { this.setZone(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the importance property value. The importance level for the IoT device. Possible values are low, normal, high, and unknownFutureValue.
     * @return a {@link IoTDeviceImportanceType}
     */
    @jakarta.annotation.Nullable
    public IoTDeviceImportanceType getImportance() {
        return this.backingStore.get("importance");
    }
    /**
     * Gets the ioTHub property value. The azureResourceEvidence entity that represents the IoT Hub that the device belongs to.
     * @return a {@link AzureResourceEvidence}
     */
    @jakarta.annotation.Nullable
    public AzureResourceEvidence getIoTHub() {
        return this.backingStore.get("ioTHub");
    }
    /**
     * Gets the ioTSecurityAgentId property value. The ID of the Azure Security Center for the IoT agent that is running on the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIoTSecurityAgentId() {
        return this.backingStore.get("ioTSecurityAgentId");
    }
    /**
     * Gets the ipAddress property value. The current IP address of the device.
     * @return a {@link IpEvidence}
     */
    @jakarta.annotation.Nullable
    public IpEvidence getIpAddress() {
        return this.backingStore.get("ipAddress");
    }
    /**
     * Gets the isAuthorized property value. Indicates whether the device classified as an authorized device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAuthorized() {
        return this.backingStore.get("isAuthorized");
    }
    /**
     * Gets the isProgramming property value. Indicates whether the device classified as a programming device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsProgramming() {
        return this.backingStore.get("isProgramming");
    }
    /**
     * Gets the isScanner property value. Indicates whether the device classified as a scanner.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsScanner() {
        return this.backingStore.get("isScanner");
    }
    /**
     * Gets the macAddress property value. The MAC address of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMacAddress() {
        return this.backingStore.get("macAddress");
    }
    /**
     * Gets the manufacturer property value. The manufacturer of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.backingStore.get("manufacturer");
    }
    /**
     * Gets the model property value. The model of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.backingStore.get("model");
    }
    /**
     * Gets the nics property value. The current network interface controllers on the device.
     * @return a {@link java.util.List<NicEvidence>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<NicEvidence> getNics() {
        return this.backingStore.get("nics");
    }
    /**
     * Gets the operatingSystem property value. The operating system the device is running.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystem() {
        return this.backingStore.get("operatingSystem");
    }
    /**
     * Gets the owners property value. The owners for the device.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOwners() {
        return this.backingStore.get("owners");
    }
    /**
     * Gets the protocols property value. The list of protocols that the device supports.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getProtocols() {
        return this.backingStore.get("protocols");
    }
    /**
     * Gets the purdueLayer property value. The Purdue Layer of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPurdueLayer() {
        return this.backingStore.get("purdueLayer");
    }
    /**
     * Gets the sensor property value. The sensor that monitors the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSensor() {
        return this.backingStore.get("sensor");
    }
    /**
     * Gets the serialNumber property value. The serial number of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.backingStore.get("serialNumber");
    }
    /**
     * Gets the site property value. The site location of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSite() {
        return this.backingStore.get("site");
    }
    /**
     * Gets the source property value. The source (microsoft/vendor) of the device entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSource() {
        return this.backingStore.get("source");
    }
    /**
     * Gets the sourceRef property value. A URL reference to the source item where the device is managed.
     * @return a {@link UrlEvidence}
     */
    @jakarta.annotation.Nullable
    public UrlEvidence getSourceRef() {
        return this.backingStore.get("sourceRef");
    }
    /**
     * Gets the zone property value. The zone location of the device within a site.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getZone() {
        return this.backingStore.get("zone");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("devicePageLink", this.getDevicePageLink());
        writer.writeStringValue("deviceSubType", this.getDeviceSubType());
        writer.writeStringValue("deviceType", this.getDeviceType());
        writer.writeEnumValue("importance", this.getImportance());
        writer.writeObjectValue("ioTHub", this.getIoTHub());
        writer.writeStringValue("ioTSecurityAgentId", this.getIoTSecurityAgentId());
        writer.writeObjectValue("ipAddress", this.getIpAddress());
        writer.writeBooleanValue("isAuthorized", this.getIsAuthorized());
        writer.writeBooleanValue("isProgramming", this.getIsProgramming());
        writer.writeBooleanValue("isScanner", this.getIsScanner());
        writer.writeStringValue("macAddress", this.getMacAddress());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeCollectionOfObjectValues("nics", this.getNics());
        writer.writeStringValue("operatingSystem", this.getOperatingSystem());
        writer.writeCollectionOfPrimitiveValues("owners", this.getOwners());
        writer.writeCollectionOfPrimitiveValues("protocols", this.getProtocols());
        writer.writeStringValue("purdueLayer", this.getPurdueLayer());
        writer.writeStringValue("sensor", this.getSensor());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
        writer.writeStringValue("site", this.getSite());
        writer.writeStringValue("source", this.getSource());
        writer.writeObjectValue("sourceRef", this.getSourceRef());
        writer.writeStringValue("zone", this.getZone());
    }
    /**
     * Sets the deviceId property value. The device ID.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the deviceName property value. The friendly name of the device.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the devicePageLink property value. The URL to the device page in the IoT Defender portal.
     * @param value Value to set for the devicePageLink property.
     */
    public void setDevicePageLink(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("devicePageLink", value);
    }
    /**
     * Sets the deviceSubType property value. The device subtype.
     * @param value Value to set for the deviceSubType property.
     */
    public void setDeviceSubType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceSubType", value);
    }
    /**
     * Sets the deviceType property value. The type of the device. For example, 'temperature sensor,' 'freezer,' 'wind turbine,' and so on.
     * @param value Value to set for the deviceType property.
     */
    public void setDeviceType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceType", value);
    }
    /**
     * Sets the importance property value. The importance level for the IoT device. Possible values are low, normal, high, and unknownFutureValue.
     * @param value Value to set for the importance property.
     */
    public void setImportance(@jakarta.annotation.Nullable final IoTDeviceImportanceType value) {
        this.backingStore.set("importance", value);
    }
    /**
     * Sets the ioTHub property value. The azureResourceEvidence entity that represents the IoT Hub that the device belongs to.
     * @param value Value to set for the ioTHub property.
     */
    public void setIoTHub(@jakarta.annotation.Nullable final AzureResourceEvidence value) {
        this.backingStore.set("ioTHub", value);
    }
    /**
     * Sets the ioTSecurityAgentId property value. The ID of the Azure Security Center for the IoT agent that is running on the device.
     * @param value Value to set for the ioTSecurityAgentId property.
     */
    public void setIoTSecurityAgentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ioTSecurityAgentId", value);
    }
    /**
     * Sets the ipAddress property value. The current IP address of the device.
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final IpEvidence value) {
        this.backingStore.set("ipAddress", value);
    }
    /**
     * Sets the isAuthorized property value. Indicates whether the device classified as an authorized device.
     * @param value Value to set for the isAuthorized property.
     */
    public void setIsAuthorized(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAuthorized", value);
    }
    /**
     * Sets the isProgramming property value. Indicates whether the device classified as a programming device.
     * @param value Value to set for the isProgramming property.
     */
    public void setIsProgramming(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isProgramming", value);
    }
    /**
     * Sets the isScanner property value. Indicates whether the device classified as a scanner.
     * @param value Value to set for the isScanner property.
     */
    public void setIsScanner(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isScanner", value);
    }
    /**
     * Sets the macAddress property value. The MAC address of the device.
     * @param value Value to set for the macAddress property.
     */
    public void setMacAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("macAddress", value);
    }
    /**
     * Sets the manufacturer property value. The manufacturer of the device.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manufacturer", value);
    }
    /**
     * Sets the model property value. The model of the device.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("model", value);
    }
    /**
     * Sets the nics property value. The current network interface controllers on the device.
     * @param value Value to set for the nics property.
     */
    public void setNics(@jakarta.annotation.Nullable final java.util.List<NicEvidence> value) {
        this.backingStore.set("nics", value);
    }
    /**
     * Sets the operatingSystem property value. The operating system the device is running.
     * @param value Value to set for the operatingSystem property.
     */
    public void setOperatingSystem(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("operatingSystem", value);
    }
    /**
     * Sets the owners property value. The owners for the device.
     * @param value Value to set for the owners property.
     */
    public void setOwners(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("owners", value);
    }
    /**
     * Sets the protocols property value. The list of protocols that the device supports.
     * @param value Value to set for the protocols property.
     */
    public void setProtocols(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("protocols", value);
    }
    /**
     * Sets the purdueLayer property value. The Purdue Layer of the device.
     * @param value Value to set for the purdueLayer property.
     */
    public void setPurdueLayer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("purdueLayer", value);
    }
    /**
     * Sets the sensor property value. The sensor that monitors the device.
     * @param value Value to set for the sensor property.
     */
    public void setSensor(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sensor", value);
    }
    /**
     * Sets the serialNumber property value. The serial number of the device.
     * @param value Value to set for the serialNumber property.
     */
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serialNumber", value);
    }
    /**
     * Sets the site property value. The site location of the device.
     * @param value Value to set for the site property.
     */
    public void setSite(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("site", value);
    }
    /**
     * Sets the source property value. The source (microsoft/vendor) of the device entity.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("source", value);
    }
    /**
     * Sets the sourceRef property value. A URL reference to the source item where the device is managed.
     * @param value Value to set for the sourceRef property.
     */
    public void setSourceRef(@jakarta.annotation.Nullable final UrlEvidence value) {
        this.backingStore.set("sourceRef", value);
    }
    /**
     * Sets the zone property value. The zone location of the device within a site.
     * @param value Value to set for the zone property.
     */
    public void setZone(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("zone", value);
    }
}
