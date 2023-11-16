package com.microsoft.graph.models.callrecords;

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
public class NetworkInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new NetworkInfo and sets the default values.
     */
    public NetworkInfo() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a NetworkInfo
     */
    @jakarta.annotation.Nonnull
    public static NetworkInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NetworkInfo();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the bandwidthLowEventRatio property value. Fraction of the call that the media endpoint detected the available bandwidth or bandwidth policy was low enough to cause poor quality of the audio sent.
     * @return a Float
     */
    @jakarta.annotation.Nullable
    public Float getBandwidthLowEventRatio() {
        return this.BackingStore.get("bandwidthLowEventRatio");
    }
    /**
     * Gets the basicServiceSetIdentifier property value. The wireless LAN basic service set identifier of the media endpoint used to connect to the network.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBasicServiceSetIdentifier() {
        return this.BackingStore.get("basicServiceSetIdentifier");
    }
    /**
     * Gets the connectionType property value. The connectionType property
     * @return a NetworkConnectionType
     */
    @jakarta.annotation.Nullable
    public NetworkConnectionType getConnectionType() {
        return this.BackingStore.get("connectionType");
    }
    /**
     * Gets the delayEventRatio property value. Fraction of the call that the media endpoint detected the network delay was significant enough to impact the ability to have real-time two-way communication.
     * @return a Float
     */
    @jakarta.annotation.Nullable
    public Float getDelayEventRatio() {
        return this.BackingStore.get("delayEventRatio");
    }
    /**
     * Gets the dnsSuffix property value. DNS suffix associated with the network adapter of the media endpoint.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDnsSuffix() {
        return this.BackingStore.get("dnsSuffix");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(27);
        deserializerMap.put("bandwidthLowEventRatio", (n) -> { this.setBandwidthLowEventRatio(n.getFloatValue()); });
        deserializerMap.put("basicServiceSetIdentifier", (n) -> { this.setBasicServiceSetIdentifier(n.getStringValue()); });
        deserializerMap.put("connectionType", (n) -> { this.setConnectionType(n.getEnumValue(NetworkConnectionType.class)); });
        deserializerMap.put("delayEventRatio", (n) -> { this.setDelayEventRatio(n.getFloatValue()); });
        deserializerMap.put("dnsSuffix", (n) -> { this.setDnsSuffix(n.getStringValue()); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("linkSpeed", (n) -> { this.setLinkSpeed(n.getLongValue()); });
        deserializerMap.put("macAddress", (n) -> { this.setMacAddress(n.getStringValue()); });
        deserializerMap.put("networkTransportProtocol", (n) -> { this.setNetworkTransportProtocol(n.getEnumValue(NetworkTransportProtocol.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getIntegerValue()); });
        deserializerMap.put("receivedQualityEventRatio", (n) -> { this.setReceivedQualityEventRatio(n.getFloatValue()); });
        deserializerMap.put("reflexiveIPAddress", (n) -> { this.setReflexiveIPAddress(n.getStringValue()); });
        deserializerMap.put("relayIPAddress", (n) -> { this.setRelayIPAddress(n.getStringValue()); });
        deserializerMap.put("relayPort", (n) -> { this.setRelayPort(n.getIntegerValue()); });
        deserializerMap.put("sentQualityEventRatio", (n) -> { this.setSentQualityEventRatio(n.getFloatValue()); });
        deserializerMap.put("subnet", (n) -> { this.setSubnet(n.getStringValue()); });
        deserializerMap.put("traceRouteHops", (n) -> { this.setTraceRouteHops(n.getCollectionOfObjectValues(TraceRouteHop::createFromDiscriminatorValue)); });
        deserializerMap.put("wifiBand", (n) -> { this.setWifiBand(n.getEnumValue(WifiBand.class)); });
        deserializerMap.put("wifiBatteryCharge", (n) -> { this.setWifiBatteryCharge(n.getIntegerValue()); });
        deserializerMap.put("wifiChannel", (n) -> { this.setWifiChannel(n.getIntegerValue()); });
        deserializerMap.put("wifiMicrosoftDriver", (n) -> { this.setWifiMicrosoftDriver(n.getStringValue()); });
        deserializerMap.put("wifiMicrosoftDriverVersion", (n) -> { this.setWifiMicrosoftDriverVersion(n.getStringValue()); });
        deserializerMap.put("wifiRadioType", (n) -> { this.setWifiRadioType(n.getEnumValue(WifiRadioType.class)); });
        deserializerMap.put("wifiSignalStrength", (n) -> { this.setWifiSignalStrength(n.getIntegerValue()); });
        deserializerMap.put("wifiVendorDriver", (n) -> { this.setWifiVendorDriver(n.getStringValue()); });
        deserializerMap.put("wifiVendorDriverVersion", (n) -> { this.setWifiVendorDriverVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ipAddress property value. IP address of the media endpoint.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.BackingStore.get("ipAddress");
    }
    /**
     * Gets the linkSpeed property value. Link speed in bits per second reported by the network adapter used by the media endpoint.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getLinkSpeed() {
        return this.BackingStore.get("linkSpeed");
    }
    /**
     * Gets the macAddress property value. The media access control (MAC) address of the media endpoint's network device. This value may be missing or shown as 02:00:00:00:00:00 due to operating system privacy policies.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMacAddress() {
        return this.BackingStore.get("macAddress");
    }
    /**
     * Gets the networkTransportProtocol property value. The networkTransportProtocol property
     * @return a NetworkTransportProtocol
     */
    @jakarta.annotation.Nullable
    public NetworkTransportProtocol getNetworkTransportProtocol() {
        return this.BackingStore.get("networkTransportProtocol");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the port property value. Network port number used by media endpoint.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPort() {
        return this.BackingStore.get("port");
    }
    /**
     * Gets the receivedQualityEventRatio property value. Fraction of the call that the media endpoint detected the network was causing poor quality of the audio received.
     * @return a Float
     */
    @jakarta.annotation.Nullable
    public Float getReceivedQualityEventRatio() {
        return this.BackingStore.get("receivedQualityEventRatio");
    }
    /**
     * Gets the reflexiveIPAddress property value. IP address of the media endpoint as seen by the media relay server. This is typically the public internet IP address associated to the endpoint.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getReflexiveIPAddress() {
        return this.BackingStore.get("reflexiveIPAddress");
    }
    /**
     * Gets the relayIPAddress property value. IP address of the media relay server allocated by the media endpoint.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRelayIPAddress() {
        return this.BackingStore.get("relayIPAddress");
    }
    /**
     * Gets the relayPort property value. Network port number allocated on the media relay server by the media endpoint.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRelayPort() {
        return this.BackingStore.get("relayPort");
    }
    /**
     * Gets the sentQualityEventRatio property value. Fraction of the call that the media endpoint detected the network was causing poor quality of the audio sent.
     * @return a Float
     */
    @jakarta.annotation.Nullable
    public Float getSentQualityEventRatio() {
        return this.BackingStore.get("sentQualityEventRatio");
    }
    /**
     * Gets the subnet property value. Subnet used for media stream by the media endpoint.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubnet() {
        return this.BackingStore.get("subnet");
    }
    /**
     * Gets the traceRouteHops property value. List of network trace route hops collected for this media stream.*
     * @return a java.util.List<TraceRouteHop>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TraceRouteHop> getTraceRouteHops() {
        return this.BackingStore.get("traceRouteHops");
    }
    /**
     * Gets the wifiBand property value. The wifiBand property
     * @return a WifiBand
     */
    @jakarta.annotation.Nullable
    public WifiBand getWifiBand() {
        return this.BackingStore.get("wifiBand");
    }
    /**
     * Gets the wifiBatteryCharge property value. Estimated remaining battery charge in percentage reported by the media endpoint.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getWifiBatteryCharge() {
        return this.BackingStore.get("wifiBatteryCharge");
    }
    /**
     * Gets the wifiChannel property value. WiFi channel used by the media endpoint.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getWifiChannel() {
        return this.BackingStore.get("wifiChannel");
    }
    /**
     * Gets the wifiMicrosoftDriver property value. Name of the Microsoft WiFi driver used by the media endpoint. Value may be localized based on the language used by endpoint.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWifiMicrosoftDriver() {
        return this.BackingStore.get("wifiMicrosoftDriver");
    }
    /**
     * Gets the wifiMicrosoftDriverVersion property value. Version of the Microsoft WiFi driver used by the media endpoint.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWifiMicrosoftDriverVersion() {
        return this.BackingStore.get("wifiMicrosoftDriverVersion");
    }
    /**
     * Gets the wifiRadioType property value. The wifiRadioType property
     * @return a WifiRadioType
     */
    @jakarta.annotation.Nullable
    public WifiRadioType getWifiRadioType() {
        return this.BackingStore.get("wifiRadioType");
    }
    /**
     * Gets the wifiSignalStrength property value. WiFi signal strength in percentage reported by the media endpoint.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getWifiSignalStrength() {
        return this.BackingStore.get("wifiSignalStrength");
    }
    /**
     * Gets the wifiVendorDriver property value. Name of the WiFi driver used by the media endpoint. Value may be localized based on the language used by endpoint.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWifiVendorDriver() {
        return this.BackingStore.get("wifiVendorDriver");
    }
    /**
     * Gets the wifiVendorDriverVersion property value. Version of the WiFi driver used by the media endpoint.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWifiVendorDriverVersion() {
        return this.BackingStore.get("wifiVendorDriverVersion");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeFloatValue("bandwidthLowEventRatio", this.getBandwidthLowEventRatio());
        writer.writeStringValue("basicServiceSetIdentifier", this.getBasicServiceSetIdentifier());
        writer.writeEnumValue("connectionType", this.getConnectionType());
        writer.writeFloatValue("delayEventRatio", this.getDelayEventRatio());
        writer.writeStringValue("dnsSuffix", this.getDnsSuffix());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeLongValue("linkSpeed", this.getLinkSpeed());
        writer.writeStringValue("macAddress", this.getMacAddress());
        writer.writeEnumValue("networkTransportProtocol", this.getNetworkTransportProtocol());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("port", this.getPort());
        writer.writeFloatValue("receivedQualityEventRatio", this.getReceivedQualityEventRatio());
        writer.writeStringValue("reflexiveIPAddress", this.getReflexiveIPAddress());
        writer.writeStringValue("relayIPAddress", this.getRelayIPAddress());
        writer.writeIntegerValue("relayPort", this.getRelayPort());
        writer.writeFloatValue("sentQualityEventRatio", this.getSentQualityEventRatio());
        writer.writeStringValue("subnet", this.getSubnet());
        writer.writeCollectionOfObjectValues("traceRouteHops", this.getTraceRouteHops());
        writer.writeEnumValue("wifiBand", this.getWifiBand());
        writer.writeIntegerValue("wifiBatteryCharge", this.getWifiBatteryCharge());
        writer.writeIntegerValue("wifiChannel", this.getWifiChannel());
        writer.writeStringValue("wifiMicrosoftDriver", this.getWifiMicrosoftDriver());
        writer.writeStringValue("wifiMicrosoftDriverVersion", this.getWifiMicrosoftDriverVersion());
        writer.writeEnumValue("wifiRadioType", this.getWifiRadioType());
        writer.writeIntegerValue("wifiSignalStrength", this.getWifiSignalStrength());
        writer.writeStringValue("wifiVendorDriver", this.getWifiVendorDriver());
        writer.writeStringValue("wifiVendorDriverVersion", this.getWifiVendorDriverVersion());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the bandwidthLowEventRatio property value. Fraction of the call that the media endpoint detected the available bandwidth or bandwidth policy was low enough to cause poor quality of the audio sent.
     * @param value Value to set for the bandwidthLowEventRatio property.
     */
    public void setBandwidthLowEventRatio(@jakarta.annotation.Nullable final Float value) {
        this.BackingStore.set("bandwidthLowEventRatio", value);
    }
    /**
     * Sets the basicServiceSetIdentifier property value. The wireless LAN basic service set identifier of the media endpoint used to connect to the network.
     * @param value Value to set for the basicServiceSetIdentifier property.
     */
    public void setBasicServiceSetIdentifier(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("basicServiceSetIdentifier", value);
    }
    /**
     * Sets the connectionType property value. The connectionType property
     * @param value Value to set for the connectionType property.
     */
    public void setConnectionType(@jakarta.annotation.Nullable final NetworkConnectionType value) {
        this.BackingStore.set("connectionType", value);
    }
    /**
     * Sets the delayEventRatio property value. Fraction of the call that the media endpoint detected the network delay was significant enough to impact the ability to have real-time two-way communication.
     * @param value Value to set for the delayEventRatio property.
     */
    public void setDelayEventRatio(@jakarta.annotation.Nullable final Float value) {
        this.BackingStore.set("delayEventRatio", value);
    }
    /**
     * Sets the dnsSuffix property value. DNS suffix associated with the network adapter of the media endpoint.
     * @param value Value to set for the dnsSuffix property.
     */
    public void setDnsSuffix(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("dnsSuffix", value);
    }
    /**
     * Sets the ipAddress property value. IP address of the media endpoint.
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("ipAddress", value);
    }
    /**
     * Sets the linkSpeed property value. Link speed in bits per second reported by the network adapter used by the media endpoint.
     * @param value Value to set for the linkSpeed property.
     */
    public void setLinkSpeed(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("linkSpeed", value);
    }
    /**
     * Sets the macAddress property value. The media access control (MAC) address of the media endpoint's network device. This value may be missing or shown as 02:00:00:00:00:00 due to operating system privacy policies.
     * @param value Value to set for the macAddress property.
     */
    public void setMacAddress(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("macAddress", value);
    }
    /**
     * Sets the networkTransportProtocol property value. The networkTransportProtocol property
     * @param value Value to set for the networkTransportProtocol property.
     */
    public void setNetworkTransportProtocol(@jakarta.annotation.Nullable final NetworkTransportProtocol value) {
        this.BackingStore.set("networkTransportProtocol", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the port property value. Network port number used by media endpoint.
     * @param value Value to set for the port property.
     */
    public void setPort(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("port", value);
    }
    /**
     * Sets the receivedQualityEventRatio property value. Fraction of the call that the media endpoint detected the network was causing poor quality of the audio received.
     * @param value Value to set for the receivedQualityEventRatio property.
     */
    public void setReceivedQualityEventRatio(@jakarta.annotation.Nullable final Float value) {
        this.BackingStore.set("receivedQualityEventRatio", value);
    }
    /**
     * Sets the reflexiveIPAddress property value. IP address of the media endpoint as seen by the media relay server. This is typically the public internet IP address associated to the endpoint.
     * @param value Value to set for the reflexiveIPAddress property.
     */
    public void setReflexiveIPAddress(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("reflexiveIPAddress", value);
    }
    /**
     * Sets the relayIPAddress property value. IP address of the media relay server allocated by the media endpoint.
     * @param value Value to set for the relayIPAddress property.
     */
    public void setRelayIPAddress(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("relayIPAddress", value);
    }
    /**
     * Sets the relayPort property value. Network port number allocated on the media relay server by the media endpoint.
     * @param value Value to set for the relayPort property.
     */
    public void setRelayPort(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("relayPort", value);
    }
    /**
     * Sets the sentQualityEventRatio property value. Fraction of the call that the media endpoint detected the network was causing poor quality of the audio sent.
     * @param value Value to set for the sentQualityEventRatio property.
     */
    public void setSentQualityEventRatio(@jakarta.annotation.Nullable final Float value) {
        this.BackingStore.set("sentQualityEventRatio", value);
    }
    /**
     * Sets the subnet property value. Subnet used for media stream by the media endpoint.
     * @param value Value to set for the subnet property.
     */
    public void setSubnet(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("subnet", value);
    }
    /**
     * Sets the traceRouteHops property value. List of network trace route hops collected for this media stream.*
     * @param value Value to set for the traceRouteHops property.
     */
    public void setTraceRouteHops(@jakarta.annotation.Nullable final java.util.List<TraceRouteHop> value) {
        this.BackingStore.set("traceRouteHops", value);
    }
    /**
     * Sets the wifiBand property value. The wifiBand property
     * @param value Value to set for the wifiBand property.
     */
    public void setWifiBand(@jakarta.annotation.Nullable final WifiBand value) {
        this.BackingStore.set("wifiBand", value);
    }
    /**
     * Sets the wifiBatteryCharge property value. Estimated remaining battery charge in percentage reported by the media endpoint.
     * @param value Value to set for the wifiBatteryCharge property.
     */
    public void setWifiBatteryCharge(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("wifiBatteryCharge", value);
    }
    /**
     * Sets the wifiChannel property value. WiFi channel used by the media endpoint.
     * @param value Value to set for the wifiChannel property.
     */
    public void setWifiChannel(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("wifiChannel", value);
    }
    /**
     * Sets the wifiMicrosoftDriver property value. Name of the Microsoft WiFi driver used by the media endpoint. Value may be localized based on the language used by endpoint.
     * @param value Value to set for the wifiMicrosoftDriver property.
     */
    public void setWifiMicrosoftDriver(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("wifiMicrosoftDriver", value);
    }
    /**
     * Sets the wifiMicrosoftDriverVersion property value. Version of the Microsoft WiFi driver used by the media endpoint.
     * @param value Value to set for the wifiMicrosoftDriverVersion property.
     */
    public void setWifiMicrosoftDriverVersion(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("wifiMicrosoftDriverVersion", value);
    }
    /**
     * Sets the wifiRadioType property value. The wifiRadioType property
     * @param value Value to set for the wifiRadioType property.
     */
    public void setWifiRadioType(@jakarta.annotation.Nullable final WifiRadioType value) {
        this.BackingStore.set("wifiRadioType", value);
    }
    /**
     * Sets the wifiSignalStrength property value. WiFi signal strength in percentage reported by the media endpoint.
     * @param value Value to set for the wifiSignalStrength property.
     */
    public void setWifiSignalStrength(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("wifiSignalStrength", value);
    }
    /**
     * Sets the wifiVendorDriver property value. Name of the WiFi driver used by the media endpoint. Value may be localized based on the language used by endpoint.
     * @param value Value to set for the wifiVendorDriver property.
     */
    public void setWifiVendorDriver(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("wifiVendorDriver", value);
    }
    /**
     * Sets the wifiVendorDriverVersion property value. Version of the WiFi driver used by the media endpoint.
     * @param value Value to set for the wifiVendorDriverVersion property.
     */
    public void setWifiVendorDriverVersion(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("wifiVendorDriverVersion", value);
    }
}
