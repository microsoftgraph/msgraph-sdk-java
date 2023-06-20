package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class NetworkInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Fraction of the call that the media endpoint detected the available bandwidth or bandwidth policy was low enough to cause poor quality of the audio sent. */
    private Float bandwidthLowEventRatio;
    /** The wireless LAN basic service set identifier of the media endpoint used to connect to the network. */
    private String basicServiceSetIdentifier;
    /** The connectionType property */
    private NetworkConnectionType connectionType;
    /** Fraction of the call that the media endpoint detected the network delay was significant enough to impact the ability to have real-time two-way communication. */
    private Float delayEventRatio;
    /** DNS suffix associated with the network adapter of the media endpoint. */
    private String dnsSuffix;
    /** IP address of the media endpoint. */
    private String ipAddress;
    /** Link speed in bits per second reported by the network adapter used by the media endpoint. */
    private Long linkSpeed;
    /** The media access control (MAC) address of the media endpoint's network device. */
    private String macAddress;
    /** The networkTransportProtocol property */
    private NetworkTransportProtocol networkTransportProtocol;
    /** The OdataType property */
    private String odataType;
    /** Network port number used by media endpoint. */
    private Integer port;
    /** Fraction of the call that the media endpoint detected the network was causing poor quality of the audio received. */
    private Float receivedQualityEventRatio;
    /** IP address of the media endpoint as seen by the media relay server. This is typically the public internet IP address associated to the endpoint. */
    private String reflexiveIPAddress;
    /** IP address of the media relay server allocated by the media endpoint. */
    private String relayIPAddress;
    /** Network port number allocated on the media relay server by the media endpoint. */
    private Integer relayPort;
    /** Fraction of the call that the media endpoint detected the network was causing poor quality of the audio sent. */
    private Float sentQualityEventRatio;
    /** Subnet used for media stream by the media endpoint. */
    private String subnet;
    /** List of network trace route hops collected for this media stream.* */
    private java.util.List<TraceRouteHop> traceRouteHops;
    /** The wifiBand property */
    private WifiBand wifiBand;
    /** Estimated remaining battery charge in percentage reported by the media endpoint. */
    private Integer wifiBatteryCharge;
    /** WiFi channel used by the media endpoint. */
    private Integer wifiChannel;
    /** Name of the Microsoft WiFi driver used by the media endpoint. Value may be localized based on the language used by endpoint. */
    private String wifiMicrosoftDriver;
    /** Version of the Microsoft WiFi driver used by the media endpoint. */
    private String wifiMicrosoftDriverVersion;
    /** The wifiRadioType property */
    private WifiRadioType wifiRadioType;
    /** WiFi signal strength in percentage reported by the media endpoint. */
    private Integer wifiSignalStrength;
    /** Name of the WiFi driver used by the media endpoint. Value may be localized based on the language used by endpoint. */
    private String wifiVendorDriver;
    /** Version of the WiFi driver used by the media endpoint. */
    private String wifiVendorDriverVersion;
    /**
     * Instantiates a new networkInfo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public NetworkInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a networkInfo
     */
    @javax.annotation.Nonnull
    public static NetworkInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NetworkInfo();
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
     * Gets the bandwidthLowEventRatio property value. Fraction of the call that the media endpoint detected the available bandwidth or bandwidth policy was low enough to cause poor quality of the audio sent.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getBandwidthLowEventRatio() {
        return this.bandwidthLowEventRatio;
    }
    /**
     * Gets the basicServiceSetIdentifier property value. The wireless LAN basic service set identifier of the media endpoint used to connect to the network.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBasicServiceSetIdentifier() {
        return this.basicServiceSetIdentifier;
    }
    /**
     * Gets the connectionType property value. The connectionType property
     * @return a NetworkConnectionType
     */
    @javax.annotation.Nullable
    public NetworkConnectionType getConnectionType() {
        return this.connectionType;
    }
    /**
     * Gets the delayEventRatio property value. Fraction of the call that the media endpoint detected the network delay was significant enough to impact the ability to have real-time two-way communication.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getDelayEventRatio() {
        return this.delayEventRatio;
    }
    /**
     * Gets the dnsSuffix property value. DNS suffix associated with the network adapter of the media endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDnsSuffix() {
        return this.dnsSuffix;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * Gets the linkSpeed property value. Link speed in bits per second reported by the network adapter used by the media endpoint.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getLinkSpeed() {
        return this.linkSpeed;
    }
    /**
     * Gets the macAddress property value. The media access control (MAC) address of the media endpoint's network device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMacAddress() {
        return this.macAddress;
    }
    /**
     * Gets the networkTransportProtocol property value. The networkTransportProtocol property
     * @return a NetworkTransportProtocol
     */
    @javax.annotation.Nullable
    public NetworkTransportProtocol getNetworkTransportProtocol() {
        return this.networkTransportProtocol;
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
     * Gets the port property value. Network port number used by media endpoint.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPort() {
        return this.port;
    }
    /**
     * Gets the receivedQualityEventRatio property value. Fraction of the call that the media endpoint detected the network was causing poor quality of the audio received.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getReceivedQualityEventRatio() {
        return this.receivedQualityEventRatio;
    }
    /**
     * Gets the reflexiveIPAddress property value. IP address of the media endpoint as seen by the media relay server. This is typically the public internet IP address associated to the endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReflexiveIPAddress() {
        return this.reflexiveIPAddress;
    }
    /**
     * Gets the relayIPAddress property value. IP address of the media relay server allocated by the media endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRelayIPAddress() {
        return this.relayIPAddress;
    }
    /**
     * Gets the relayPort property value. Network port number allocated on the media relay server by the media endpoint.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRelayPort() {
        return this.relayPort;
    }
    /**
     * Gets the sentQualityEventRatio property value. Fraction of the call that the media endpoint detected the network was causing poor quality of the audio sent.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getSentQualityEventRatio() {
        return this.sentQualityEventRatio;
    }
    /**
     * Gets the subnet property value. Subnet used for media stream by the media endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubnet() {
        return this.subnet;
    }
    /**
     * Gets the traceRouteHops property value. List of network trace route hops collected for this media stream.*
     * @return a TraceRouteHop
     */
    @javax.annotation.Nullable
    public java.util.List<TraceRouteHop> getTraceRouteHops() {
        return this.traceRouteHops;
    }
    /**
     * Gets the wifiBand property value. The wifiBand property
     * @return a WifiBand
     */
    @javax.annotation.Nullable
    public WifiBand getWifiBand() {
        return this.wifiBand;
    }
    /**
     * Gets the wifiBatteryCharge property value. Estimated remaining battery charge in percentage reported by the media endpoint.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWifiBatteryCharge() {
        return this.wifiBatteryCharge;
    }
    /**
     * Gets the wifiChannel property value. WiFi channel used by the media endpoint.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWifiChannel() {
        return this.wifiChannel;
    }
    /**
     * Gets the wifiMicrosoftDriver property value. Name of the Microsoft WiFi driver used by the media endpoint. Value may be localized based on the language used by endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWifiMicrosoftDriver() {
        return this.wifiMicrosoftDriver;
    }
    /**
     * Gets the wifiMicrosoftDriverVersion property value. Version of the Microsoft WiFi driver used by the media endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWifiMicrosoftDriverVersion() {
        return this.wifiMicrosoftDriverVersion;
    }
    /**
     * Gets the wifiRadioType property value. The wifiRadioType property
     * @return a WifiRadioType
     */
    @javax.annotation.Nullable
    public WifiRadioType getWifiRadioType() {
        return this.wifiRadioType;
    }
    /**
     * Gets the wifiSignalStrength property value. WiFi signal strength in percentage reported by the media endpoint.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWifiSignalStrength() {
        return this.wifiSignalStrength;
    }
    /**
     * Gets the wifiVendorDriver property value. Name of the WiFi driver used by the media endpoint. Value may be localized based on the language used by endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWifiVendorDriver() {
        return this.wifiVendorDriver;
    }
    /**
     * Gets the wifiVendorDriverVersion property value. Version of the WiFi driver used by the media endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWifiVendorDriverVersion() {
        return this.wifiVendorDriverVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the bandwidthLowEventRatio property value. Fraction of the call that the media endpoint detected the available bandwidth or bandwidth policy was low enough to cause poor quality of the audio sent.
     * @param value Value to set for the bandwidthLowEventRatio property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBandwidthLowEventRatio(@javax.annotation.Nullable final Float value) {
        this.bandwidthLowEventRatio = value;
    }
    /**
     * Sets the basicServiceSetIdentifier property value. The wireless LAN basic service set identifier of the media endpoint used to connect to the network.
     * @param value Value to set for the basicServiceSetIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBasicServiceSetIdentifier(@javax.annotation.Nullable final String value) {
        this.basicServiceSetIdentifier = value;
    }
    /**
     * Sets the connectionType property value. The connectionType property
     * @param value Value to set for the connectionType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectionType(@javax.annotation.Nullable final NetworkConnectionType value) {
        this.connectionType = value;
    }
    /**
     * Sets the delayEventRatio property value. Fraction of the call that the media endpoint detected the network delay was significant enough to impact the ability to have real-time two-way communication.
     * @param value Value to set for the delayEventRatio property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDelayEventRatio(@javax.annotation.Nullable final Float value) {
        this.delayEventRatio = value;
    }
    /**
     * Sets the dnsSuffix property value. DNS suffix associated with the network adapter of the media endpoint.
     * @param value Value to set for the dnsSuffix property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDnsSuffix(@javax.annotation.Nullable final String value) {
        this.dnsSuffix = value;
    }
    /**
     * Sets the ipAddress property value. IP address of the media endpoint.
     * @param value Value to set for the ipAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIpAddress(@javax.annotation.Nullable final String value) {
        this.ipAddress = value;
    }
    /**
     * Sets the linkSpeed property value. Link speed in bits per second reported by the network adapter used by the media endpoint.
     * @param value Value to set for the linkSpeed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLinkSpeed(@javax.annotation.Nullable final Long value) {
        this.linkSpeed = value;
    }
    /**
     * Sets the macAddress property value. The media access control (MAC) address of the media endpoint's network device.
     * @param value Value to set for the macAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMacAddress(@javax.annotation.Nullable final String value) {
        this.macAddress = value;
    }
    /**
     * Sets the networkTransportProtocol property value. The networkTransportProtocol property
     * @param value Value to set for the networkTransportProtocol property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkTransportProtocol(@javax.annotation.Nullable final NetworkTransportProtocol value) {
        this.networkTransportProtocol = value;
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
     * Sets the port property value. Network port number used by media endpoint.
     * @param value Value to set for the port property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPort(@javax.annotation.Nullable final Integer value) {
        this.port = value;
    }
    /**
     * Sets the receivedQualityEventRatio property value. Fraction of the call that the media endpoint detected the network was causing poor quality of the audio received.
     * @param value Value to set for the receivedQualityEventRatio property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReceivedQualityEventRatio(@javax.annotation.Nullable final Float value) {
        this.receivedQualityEventRatio = value;
    }
    /**
     * Sets the reflexiveIPAddress property value. IP address of the media endpoint as seen by the media relay server. This is typically the public internet IP address associated to the endpoint.
     * @param value Value to set for the reflexiveIPAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReflexiveIPAddress(@javax.annotation.Nullable final String value) {
        this.reflexiveIPAddress = value;
    }
    /**
     * Sets the relayIPAddress property value. IP address of the media relay server allocated by the media endpoint.
     * @param value Value to set for the relayIPAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRelayIPAddress(@javax.annotation.Nullable final String value) {
        this.relayIPAddress = value;
    }
    /**
     * Sets the relayPort property value. Network port number allocated on the media relay server by the media endpoint.
     * @param value Value to set for the relayPort property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRelayPort(@javax.annotation.Nullable final Integer value) {
        this.relayPort = value;
    }
    /**
     * Sets the sentQualityEventRatio property value. Fraction of the call that the media endpoint detected the network was causing poor quality of the audio sent.
     * @param value Value to set for the sentQualityEventRatio property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSentQualityEventRatio(@javax.annotation.Nullable final Float value) {
        this.sentQualityEventRatio = value;
    }
    /**
     * Sets the subnet property value. Subnet used for media stream by the media endpoint.
     * @param value Value to set for the subnet property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubnet(@javax.annotation.Nullable final String value) {
        this.subnet = value;
    }
    /**
     * Sets the traceRouteHops property value. List of network trace route hops collected for this media stream.*
     * @param value Value to set for the traceRouteHops property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTraceRouteHops(@javax.annotation.Nullable final java.util.List<TraceRouteHop> value) {
        this.traceRouteHops = value;
    }
    /**
     * Sets the wifiBand property value. The wifiBand property
     * @param value Value to set for the wifiBand property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWifiBand(@javax.annotation.Nullable final WifiBand value) {
        this.wifiBand = value;
    }
    /**
     * Sets the wifiBatteryCharge property value. Estimated remaining battery charge in percentage reported by the media endpoint.
     * @param value Value to set for the wifiBatteryCharge property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWifiBatteryCharge(@javax.annotation.Nullable final Integer value) {
        this.wifiBatteryCharge = value;
    }
    /**
     * Sets the wifiChannel property value. WiFi channel used by the media endpoint.
     * @param value Value to set for the wifiChannel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWifiChannel(@javax.annotation.Nullable final Integer value) {
        this.wifiChannel = value;
    }
    /**
     * Sets the wifiMicrosoftDriver property value. Name of the Microsoft WiFi driver used by the media endpoint. Value may be localized based on the language used by endpoint.
     * @param value Value to set for the wifiMicrosoftDriver property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWifiMicrosoftDriver(@javax.annotation.Nullable final String value) {
        this.wifiMicrosoftDriver = value;
    }
    /**
     * Sets the wifiMicrosoftDriverVersion property value. Version of the Microsoft WiFi driver used by the media endpoint.
     * @param value Value to set for the wifiMicrosoftDriverVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWifiMicrosoftDriverVersion(@javax.annotation.Nullable final String value) {
        this.wifiMicrosoftDriverVersion = value;
    }
    /**
     * Sets the wifiRadioType property value. The wifiRadioType property
     * @param value Value to set for the wifiRadioType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWifiRadioType(@javax.annotation.Nullable final WifiRadioType value) {
        this.wifiRadioType = value;
    }
    /**
     * Sets the wifiSignalStrength property value. WiFi signal strength in percentage reported by the media endpoint.
     * @param value Value to set for the wifiSignalStrength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWifiSignalStrength(@javax.annotation.Nullable final Integer value) {
        this.wifiSignalStrength = value;
    }
    /**
     * Sets the wifiVendorDriver property value. Name of the WiFi driver used by the media endpoint. Value may be localized based on the language used by endpoint.
     * @param value Value to set for the wifiVendorDriver property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWifiVendorDriver(@javax.annotation.Nullable final String value) {
        this.wifiVendorDriver = value;
    }
    /**
     * Sets the wifiVendorDriverVersion property value. Version of the WiFi driver used by the media endpoint.
     * @param value Value to set for the wifiVendorDriverVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWifiVendorDriverVersion(@javax.annotation.Nullable final String value) {
        this.wifiVendorDriverVersion = value;
    }
}
