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
     * Gets the deviceId property value. The deviceId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the deviceName property value. The deviceName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * Gets the devicePageLink property value. The devicePageLink property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDevicePageLink() {
        return this.backingStore.get("devicePageLink");
    }
    /**
     * Gets the deviceSubType property value. The deviceSubType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceSubType() {
        return this.backingStore.get("deviceSubType");
    }
    /**
     * Gets the deviceType property value. The deviceType property
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
        deserializerMap.put("nics", (n) -> { this.setNics(n.getObjectValue(NicEvidence::createFromDiscriminatorValue)); });
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
     * Gets the importance property value. The importance property
     * @return a {@link IoTDeviceImportanceType}
     */
    @jakarta.annotation.Nullable
    public IoTDeviceImportanceType getImportance() {
        return this.backingStore.get("importance");
    }
    /**
     * Gets the ioTHub property value. The ioTHub property
     * @return a {@link AzureResourceEvidence}
     */
    @jakarta.annotation.Nullable
    public AzureResourceEvidence getIoTHub() {
        return this.backingStore.get("ioTHub");
    }
    /**
     * Gets the ioTSecurityAgentId property value. The ioTSecurityAgentId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIoTSecurityAgentId() {
        return this.backingStore.get("ioTSecurityAgentId");
    }
    /**
     * Gets the ipAddress property value. The ipAddress property
     * @return a {@link IpEvidence}
     */
    @jakarta.annotation.Nullable
    public IpEvidence getIpAddress() {
        return this.backingStore.get("ipAddress");
    }
    /**
     * Gets the isAuthorized property value. The isAuthorized property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAuthorized() {
        return this.backingStore.get("isAuthorized");
    }
    /**
     * Gets the isProgramming property value. The isProgramming property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsProgramming() {
        return this.backingStore.get("isProgramming");
    }
    /**
     * Gets the isScanner property value. The isScanner property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsScanner() {
        return this.backingStore.get("isScanner");
    }
    /**
     * Gets the macAddress property value. The macAddress property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMacAddress() {
        return this.backingStore.get("macAddress");
    }
    /**
     * Gets the manufacturer property value. The manufacturer property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.backingStore.get("manufacturer");
    }
    /**
     * Gets the model property value. The model property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.backingStore.get("model");
    }
    /**
     * Gets the nics property value. The nics property
     * @return a {@link NicEvidence}
     */
    @jakarta.annotation.Nullable
    public NicEvidence getNics() {
        return this.backingStore.get("nics");
    }
    /**
     * Gets the operatingSystem property value. The operatingSystem property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystem() {
        return this.backingStore.get("operatingSystem");
    }
    /**
     * Gets the owners property value. The owners property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOwners() {
        return this.backingStore.get("owners");
    }
    /**
     * Gets the protocols property value. The protocols property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getProtocols() {
        return this.backingStore.get("protocols");
    }
    /**
     * Gets the purdueLayer property value. The purdueLayer property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPurdueLayer() {
        return this.backingStore.get("purdueLayer");
    }
    /**
     * Gets the sensor property value. The sensor property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSensor() {
        return this.backingStore.get("sensor");
    }
    /**
     * Gets the serialNumber property value. The serialNumber property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.backingStore.get("serialNumber");
    }
    /**
     * Gets the site property value. The site property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSite() {
        return this.backingStore.get("site");
    }
    /**
     * Gets the source property value. The source property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSource() {
        return this.backingStore.get("source");
    }
    /**
     * Gets the sourceRef property value. The sourceRef property
     * @return a {@link UrlEvidence}
     */
    @jakarta.annotation.Nullable
    public UrlEvidence getSourceRef() {
        return this.backingStore.get("sourceRef");
    }
    /**
     * Gets the zone property value. The zone property
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
        writer.writeObjectValue("nics", this.getNics());
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
     * Sets the deviceId property value. The deviceId property
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the deviceName property value. The deviceName property
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the devicePageLink property value. The devicePageLink property
     * @param value Value to set for the devicePageLink property.
     */
    public void setDevicePageLink(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("devicePageLink", value);
    }
    /**
     * Sets the deviceSubType property value. The deviceSubType property
     * @param value Value to set for the deviceSubType property.
     */
    public void setDeviceSubType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceSubType", value);
    }
    /**
     * Sets the deviceType property value. The deviceType property
     * @param value Value to set for the deviceType property.
     */
    public void setDeviceType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceType", value);
    }
    /**
     * Sets the importance property value. The importance property
     * @param value Value to set for the importance property.
     */
    public void setImportance(@jakarta.annotation.Nullable final IoTDeviceImportanceType value) {
        this.backingStore.set("importance", value);
    }
    /**
     * Sets the ioTHub property value. The ioTHub property
     * @param value Value to set for the ioTHub property.
     */
    public void setIoTHub(@jakarta.annotation.Nullable final AzureResourceEvidence value) {
        this.backingStore.set("ioTHub", value);
    }
    /**
     * Sets the ioTSecurityAgentId property value. The ioTSecurityAgentId property
     * @param value Value to set for the ioTSecurityAgentId property.
     */
    public void setIoTSecurityAgentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ioTSecurityAgentId", value);
    }
    /**
     * Sets the ipAddress property value. The ipAddress property
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final IpEvidence value) {
        this.backingStore.set("ipAddress", value);
    }
    /**
     * Sets the isAuthorized property value. The isAuthorized property
     * @param value Value to set for the isAuthorized property.
     */
    public void setIsAuthorized(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAuthorized", value);
    }
    /**
     * Sets the isProgramming property value. The isProgramming property
     * @param value Value to set for the isProgramming property.
     */
    public void setIsProgramming(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isProgramming", value);
    }
    /**
     * Sets the isScanner property value. The isScanner property
     * @param value Value to set for the isScanner property.
     */
    public void setIsScanner(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isScanner", value);
    }
    /**
     * Sets the macAddress property value. The macAddress property
     * @param value Value to set for the macAddress property.
     */
    public void setMacAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("macAddress", value);
    }
    /**
     * Sets the manufacturer property value. The manufacturer property
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manufacturer", value);
    }
    /**
     * Sets the model property value. The model property
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("model", value);
    }
    /**
     * Sets the nics property value. The nics property
     * @param value Value to set for the nics property.
     */
    public void setNics(@jakarta.annotation.Nullable final NicEvidence value) {
        this.backingStore.set("nics", value);
    }
    /**
     * Sets the operatingSystem property value. The operatingSystem property
     * @param value Value to set for the operatingSystem property.
     */
    public void setOperatingSystem(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("operatingSystem", value);
    }
    /**
     * Sets the owners property value. The owners property
     * @param value Value to set for the owners property.
     */
    public void setOwners(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("owners", value);
    }
    /**
     * Sets the protocols property value. The protocols property
     * @param value Value to set for the protocols property.
     */
    public void setProtocols(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("protocols", value);
    }
    /**
     * Sets the purdueLayer property value. The purdueLayer property
     * @param value Value to set for the purdueLayer property.
     */
    public void setPurdueLayer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("purdueLayer", value);
    }
    /**
     * Sets the sensor property value. The sensor property
     * @param value Value to set for the sensor property.
     */
    public void setSensor(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sensor", value);
    }
    /**
     * Sets the serialNumber property value. The serialNumber property
     * @param value Value to set for the serialNumber property.
     */
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serialNumber", value);
    }
    /**
     * Sets the site property value. The site property
     * @param value Value to set for the site property.
     */
    public void setSite(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("site", value);
    }
    /**
     * Sets the source property value. The source property
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("source", value);
    }
    /**
     * Sets the sourceRef property value. The sourceRef property
     * @param value Value to set for the sourceRef property.
     */
    public void setSourceRef(@jakarta.annotation.Nullable final UrlEvidence value) {
        this.backingStore.set("sourceRef", value);
    }
    /**
     * Sets the zone property value. The zone property
     * @param value Value to set for the zone property.
     */
    public void setZone(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("zone", value);
    }
}
