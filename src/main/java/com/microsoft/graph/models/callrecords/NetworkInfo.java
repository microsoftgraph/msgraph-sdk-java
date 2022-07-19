package microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class NetworkInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Fraction of the call that the media endpoint detected the available bandwidth or bandwidth policy was low enough to cause poor quality of the audio sent. */
    private Float _bandwidthLowEventRatio;
    /** The wireless LAN basic service set identifier of the media endpoint used to connect to the network. */
    private String _basicServiceSetIdentifier;
    /** The connectionType property */
    private NetworkConnectionType _connectionType;
    /** Fraction of the call that the media endpoint detected the network delay was significant enough to impact the ability to have real-time two-way communication. */
    private Float _delayEventRatio;
    /** DNS suffix associated with the network adapter of the media endpoint. */
    private String _dnsSuffix;
    /** IP address of the media endpoint. */
    private String _ipAddress;
    /** Link speed in bits per second reported by the network adapter used by the media endpoint. */
    private Long _linkSpeed;
    /** The media access control (MAC) address of the media endpoint's network device. */
    private String _macAddress;
    /** The networkTransportProtocol property */
    private NetworkTransportProtocol _networkTransportProtocol;
    /** The OdataType property */
    private String _odataType;
    /** Network port number used by media endpoint. */
    private Integer _port;
    /** Fraction of the call that the media endpoint detected the network was causing poor quality of the audio received. */
    private Float _receivedQualityEventRatio;
    /** IP address of the media endpoint as seen by the media relay server. This is typically the public internet IP address associated to the endpoint. */
    private String _reflexiveIPAddress;
    /** IP address of the media relay server allocated by the media endpoint. */
    private String _relayIPAddress;
    /** Network port number allocated on the media relay server by the media endpoint. */
    private Integer _relayPort;
    /** Fraction of the call that the media endpoint detected the network was causing poor quality of the audio sent. */
    private Float _sentQualityEventRatio;
    /** Subnet used for media stream by the media endpoint. */
    private String _subnet;
    /** List of network trace route hops collected for this media stream.* */
    private java.util.List<TraceRouteHop> _traceRouteHops;
    /** The wifiBand property */
    private WifiBand _wifiBand;
    /** Estimated remaining battery charge in percentage reported by the media endpoint. */
    private Integer _wifiBatteryCharge;
    /** WiFi channel used by the media endpoint. */
    private Integer _wifiChannel;
    /** Name of the Microsoft WiFi driver used by the media endpoint. Value may be localized based on the language used by endpoint. */
    private String _wifiMicrosoftDriver;
    /** Version of the Microsoft WiFi driver used by the media endpoint. */
    private String _wifiMicrosoftDriverVersion;
    /** The wifiRadioType property */
    private WifiRadioType _wifiRadioType;
    /** WiFi signal strength in percentage reported by the media endpoint. */
    private Integer _wifiSignalStrength;
    /** Name of the WiFi driver used by the media endpoint. Value may be localized based on the language used by endpoint. */
    private String _wifiVendorDriver;
    /** Version of the WiFi driver used by the media endpoint. */
    private String _wifiVendorDriverVersion;
    /**
     * Instantiates a new networkInfo and sets the default values.
     * @return a void
     */
    public NetworkInfo() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.callRecords.networkInfo");
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
        return this._additionalData;
    }
    /**
     * Gets the bandwidthLowEventRatio property value. Fraction of the call that the media endpoint detected the available bandwidth or bandwidth policy was low enough to cause poor quality of the audio sent.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getBandwidthLowEventRatio() {
        return this._bandwidthLowEventRatio;
    }
    /**
     * Gets the basicServiceSetIdentifier property value. The wireless LAN basic service set identifier of the media endpoint used to connect to the network.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBasicServiceSetIdentifier() {
        return this._basicServiceSetIdentifier;
    }
    /**
     * Gets the connectionType property value. The connectionType property
     * @return a networkConnectionType
     */
    @javax.annotation.Nullable
    public NetworkConnectionType getConnectionType() {
        return this._connectionType;
    }
    /**
     * Gets the delayEventRatio property value. Fraction of the call that the media endpoint detected the network delay was significant enough to impact the ability to have real-time two-way communication.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getDelayEventRatio() {
        return this._delayEventRatio;
    }
    /**
     * Gets the dnsSuffix property value. DNS suffix associated with the network adapter of the media endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDnsSuffix() {
        return this._dnsSuffix;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final NetworkInfo currentObject = this;
        return new HashMap<>(27) {{
            this.put("bandwidthLowEventRatio", (n) -> { currentObject.setBandwidthLowEventRatio(n.getFloatValue()); });
            this.put("basicServiceSetIdentifier", (n) -> { currentObject.setBasicServiceSetIdentifier(n.getStringValue()); });
            this.put("connectionType", (n) -> { currentObject.setConnectionType(n.getEnumValue(NetworkConnectionType.class)); });
            this.put("delayEventRatio", (n) -> { currentObject.setDelayEventRatio(n.getFloatValue()); });
            this.put("dnsSuffix", (n) -> { currentObject.setDnsSuffix(n.getStringValue()); });
            this.put("ipAddress", (n) -> { currentObject.setIpAddress(n.getStringValue()); });
            this.put("linkSpeed", (n) -> { currentObject.setLinkSpeed(n.getLongValue()); });
            this.put("macAddress", (n) -> { currentObject.setMacAddress(n.getStringValue()); });
            this.put("networkTransportProtocol", (n) -> { currentObject.setNetworkTransportProtocol(n.getEnumValue(NetworkTransportProtocol.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("port", (n) -> { currentObject.setPort(n.getIntegerValue()); });
            this.put("receivedQualityEventRatio", (n) -> { currentObject.setReceivedQualityEventRatio(n.getFloatValue()); });
            this.put("reflexiveIPAddress", (n) -> { currentObject.setReflexiveIPAddress(n.getStringValue()); });
            this.put("relayIPAddress", (n) -> { currentObject.setRelayIPAddress(n.getStringValue()); });
            this.put("relayPort", (n) -> { currentObject.setRelayPort(n.getIntegerValue()); });
            this.put("sentQualityEventRatio", (n) -> { currentObject.setSentQualityEventRatio(n.getFloatValue()); });
            this.put("subnet", (n) -> { currentObject.setSubnet(n.getStringValue()); });
            this.put("traceRouteHops", (n) -> { currentObject.setTraceRouteHops(n.getCollectionOfObjectValues(TraceRouteHop::createFromDiscriminatorValue)); });
            this.put("wifiBand", (n) -> { currentObject.setWifiBand(n.getEnumValue(WifiBand.class)); });
            this.put("wifiBatteryCharge", (n) -> { currentObject.setWifiBatteryCharge(n.getIntegerValue()); });
            this.put("wifiChannel", (n) -> { currentObject.setWifiChannel(n.getIntegerValue()); });
            this.put("wifiMicrosoftDriver", (n) -> { currentObject.setWifiMicrosoftDriver(n.getStringValue()); });
            this.put("wifiMicrosoftDriverVersion", (n) -> { currentObject.setWifiMicrosoftDriverVersion(n.getStringValue()); });
            this.put("wifiRadioType", (n) -> { currentObject.setWifiRadioType(n.getEnumValue(WifiRadioType.class)); });
            this.put("wifiSignalStrength", (n) -> { currentObject.setWifiSignalStrength(n.getIntegerValue()); });
            this.put("wifiVendorDriver", (n) -> { currentObject.setWifiVendorDriver(n.getStringValue()); });
            this.put("wifiVendorDriverVersion", (n) -> { currentObject.setWifiVendorDriverVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the ipAddress property value. IP address of the media endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpAddress() {
        return this._ipAddress;
    }
    /**
     * Gets the linkSpeed property value. Link speed in bits per second reported by the network adapter used by the media endpoint.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getLinkSpeed() {
        return this._linkSpeed;
    }
    /**
     * Gets the macAddress property value. The media access control (MAC) address of the media endpoint's network device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMacAddress() {
        return this._macAddress;
    }
    /**
     * Gets the networkTransportProtocol property value. The networkTransportProtocol property
     * @return a networkTransportProtocol
     */
    @javax.annotation.Nullable
    public NetworkTransportProtocol getNetworkTransportProtocol() {
        return this._networkTransportProtocol;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the port property value. Network port number used by media endpoint.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPort() {
        return this._port;
    }
    /**
     * Gets the receivedQualityEventRatio property value. Fraction of the call that the media endpoint detected the network was causing poor quality of the audio received.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getReceivedQualityEventRatio() {
        return this._receivedQualityEventRatio;
    }
    /**
     * Gets the reflexiveIPAddress property value. IP address of the media endpoint as seen by the media relay server. This is typically the public internet IP address associated to the endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReflexiveIPAddress() {
        return this._reflexiveIPAddress;
    }
    /**
     * Gets the relayIPAddress property value. IP address of the media relay server allocated by the media endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRelayIPAddress() {
        return this._relayIPAddress;
    }
    /**
     * Gets the relayPort property value. Network port number allocated on the media relay server by the media endpoint.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRelayPort() {
        return this._relayPort;
    }
    /**
     * Gets the sentQualityEventRatio property value. Fraction of the call that the media endpoint detected the network was causing poor quality of the audio sent.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getSentQualityEventRatio() {
        return this._sentQualityEventRatio;
    }
    /**
     * Gets the subnet property value. Subnet used for media stream by the media endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubnet() {
        return this._subnet;
    }
    /**
     * Gets the traceRouteHops property value. List of network trace route hops collected for this media stream.*
     * @return a traceRouteHop
     */
    @javax.annotation.Nullable
    public java.util.List<TraceRouteHop> getTraceRouteHops() {
        return this._traceRouteHops;
    }
    /**
     * Gets the wifiBand property value. The wifiBand property
     * @return a wifiBand
     */
    @javax.annotation.Nullable
    public WifiBand getWifiBand() {
        return this._wifiBand;
    }
    /**
     * Gets the wifiBatteryCharge property value. Estimated remaining battery charge in percentage reported by the media endpoint.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWifiBatteryCharge() {
        return this._wifiBatteryCharge;
    }
    /**
     * Gets the wifiChannel property value. WiFi channel used by the media endpoint.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWifiChannel() {
        return this._wifiChannel;
    }
    /**
     * Gets the wifiMicrosoftDriver property value. Name of the Microsoft WiFi driver used by the media endpoint. Value may be localized based on the language used by endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWifiMicrosoftDriver() {
        return this._wifiMicrosoftDriver;
    }
    /**
     * Gets the wifiMicrosoftDriverVersion property value. Version of the Microsoft WiFi driver used by the media endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWifiMicrosoftDriverVersion() {
        return this._wifiMicrosoftDriverVersion;
    }
    /**
     * Gets the wifiRadioType property value. The wifiRadioType property
     * @return a wifiRadioType
     */
    @javax.annotation.Nullable
    public WifiRadioType getWifiRadioType() {
        return this._wifiRadioType;
    }
    /**
     * Gets the wifiSignalStrength property value. WiFi signal strength in percentage reported by the media endpoint.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWifiSignalStrength() {
        return this._wifiSignalStrength;
    }
    /**
     * Gets the wifiVendorDriver property value. Name of the WiFi driver used by the media endpoint. Value may be localized based on the language used by endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWifiVendorDriver() {
        return this._wifiVendorDriver;
    }
    /**
     * Gets the wifiVendorDriverVersion property value. Version of the WiFi driver used by the media endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWifiVendorDriverVersion() {
        return this._wifiVendorDriverVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the bandwidthLowEventRatio property value. Fraction of the call that the media endpoint detected the available bandwidth or bandwidth policy was low enough to cause poor quality of the audio sent.
     * @param value Value to set for the bandwidthLowEventRatio property.
     * @return a void
     */
    public void setBandwidthLowEventRatio(@javax.annotation.Nullable final Float value) {
        this._bandwidthLowEventRatio = value;
    }
    /**
     * Sets the basicServiceSetIdentifier property value. The wireless LAN basic service set identifier of the media endpoint used to connect to the network.
     * @param value Value to set for the basicServiceSetIdentifier property.
     * @return a void
     */
    public void setBasicServiceSetIdentifier(@javax.annotation.Nullable final String value) {
        this._basicServiceSetIdentifier = value;
    }
    /**
     * Sets the connectionType property value. The connectionType property
     * @param value Value to set for the connectionType property.
     * @return a void
     */
    public void setConnectionType(@javax.annotation.Nullable final NetworkConnectionType value) {
        this._connectionType = value;
    }
    /**
     * Sets the delayEventRatio property value. Fraction of the call that the media endpoint detected the network delay was significant enough to impact the ability to have real-time two-way communication.
     * @param value Value to set for the delayEventRatio property.
     * @return a void
     */
    public void setDelayEventRatio(@javax.annotation.Nullable final Float value) {
        this._delayEventRatio = value;
    }
    /**
     * Sets the dnsSuffix property value. DNS suffix associated with the network adapter of the media endpoint.
     * @param value Value to set for the dnsSuffix property.
     * @return a void
     */
    public void setDnsSuffix(@javax.annotation.Nullable final String value) {
        this._dnsSuffix = value;
    }
    /**
     * Sets the ipAddress property value. IP address of the media endpoint.
     * @param value Value to set for the ipAddress property.
     * @return a void
     */
    public void setIpAddress(@javax.annotation.Nullable final String value) {
        this._ipAddress = value;
    }
    /**
     * Sets the linkSpeed property value. Link speed in bits per second reported by the network adapter used by the media endpoint.
     * @param value Value to set for the linkSpeed property.
     * @return a void
     */
    public void setLinkSpeed(@javax.annotation.Nullable final Long value) {
        this._linkSpeed = value;
    }
    /**
     * Sets the macAddress property value. The media access control (MAC) address of the media endpoint's network device.
     * @param value Value to set for the macAddress property.
     * @return a void
     */
    public void setMacAddress(@javax.annotation.Nullable final String value) {
        this._macAddress = value;
    }
    /**
     * Sets the networkTransportProtocol property value. The networkTransportProtocol property
     * @param value Value to set for the networkTransportProtocol property.
     * @return a void
     */
    public void setNetworkTransportProtocol(@javax.annotation.Nullable final NetworkTransportProtocol value) {
        this._networkTransportProtocol = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the port property value. Network port number used by media endpoint.
     * @param value Value to set for the port property.
     * @return a void
     */
    public void setPort(@javax.annotation.Nullable final Integer value) {
        this._port = value;
    }
    /**
     * Sets the receivedQualityEventRatio property value. Fraction of the call that the media endpoint detected the network was causing poor quality of the audio received.
     * @param value Value to set for the receivedQualityEventRatio property.
     * @return a void
     */
    public void setReceivedQualityEventRatio(@javax.annotation.Nullable final Float value) {
        this._receivedQualityEventRatio = value;
    }
    /**
     * Sets the reflexiveIPAddress property value. IP address of the media endpoint as seen by the media relay server. This is typically the public internet IP address associated to the endpoint.
     * @param value Value to set for the reflexiveIPAddress property.
     * @return a void
     */
    public void setReflexiveIPAddress(@javax.annotation.Nullable final String value) {
        this._reflexiveIPAddress = value;
    }
    /**
     * Sets the relayIPAddress property value. IP address of the media relay server allocated by the media endpoint.
     * @param value Value to set for the relayIPAddress property.
     * @return a void
     */
    public void setRelayIPAddress(@javax.annotation.Nullable final String value) {
        this._relayIPAddress = value;
    }
    /**
     * Sets the relayPort property value. Network port number allocated on the media relay server by the media endpoint.
     * @param value Value to set for the relayPort property.
     * @return a void
     */
    public void setRelayPort(@javax.annotation.Nullable final Integer value) {
        this._relayPort = value;
    }
    /**
     * Sets the sentQualityEventRatio property value. Fraction of the call that the media endpoint detected the network was causing poor quality of the audio sent.
     * @param value Value to set for the sentQualityEventRatio property.
     * @return a void
     */
    public void setSentQualityEventRatio(@javax.annotation.Nullable final Float value) {
        this._sentQualityEventRatio = value;
    }
    /**
     * Sets the subnet property value. Subnet used for media stream by the media endpoint.
     * @param value Value to set for the subnet property.
     * @return a void
     */
    public void setSubnet(@javax.annotation.Nullable final String value) {
        this._subnet = value;
    }
    /**
     * Sets the traceRouteHops property value. List of network trace route hops collected for this media stream.*
     * @param value Value to set for the traceRouteHops property.
     * @return a void
     */
    public void setTraceRouteHops(@javax.annotation.Nullable final java.util.List<TraceRouteHop> value) {
        this._traceRouteHops = value;
    }
    /**
     * Sets the wifiBand property value. The wifiBand property
     * @param value Value to set for the wifiBand property.
     * @return a void
     */
    public void setWifiBand(@javax.annotation.Nullable final WifiBand value) {
        this._wifiBand = value;
    }
    /**
     * Sets the wifiBatteryCharge property value. Estimated remaining battery charge in percentage reported by the media endpoint.
     * @param value Value to set for the wifiBatteryCharge property.
     * @return a void
     */
    public void setWifiBatteryCharge(@javax.annotation.Nullable final Integer value) {
        this._wifiBatteryCharge = value;
    }
    /**
     * Sets the wifiChannel property value. WiFi channel used by the media endpoint.
     * @param value Value to set for the wifiChannel property.
     * @return a void
     */
    public void setWifiChannel(@javax.annotation.Nullable final Integer value) {
        this._wifiChannel = value;
    }
    /**
     * Sets the wifiMicrosoftDriver property value. Name of the Microsoft WiFi driver used by the media endpoint. Value may be localized based on the language used by endpoint.
     * @param value Value to set for the wifiMicrosoftDriver property.
     * @return a void
     */
    public void setWifiMicrosoftDriver(@javax.annotation.Nullable final String value) {
        this._wifiMicrosoftDriver = value;
    }
    /**
     * Sets the wifiMicrosoftDriverVersion property value. Version of the Microsoft WiFi driver used by the media endpoint.
     * @param value Value to set for the wifiMicrosoftDriverVersion property.
     * @return a void
     */
    public void setWifiMicrosoftDriverVersion(@javax.annotation.Nullable final String value) {
        this._wifiMicrosoftDriverVersion = value;
    }
    /**
     * Sets the wifiRadioType property value. The wifiRadioType property
     * @param value Value to set for the wifiRadioType property.
     * @return a void
     */
    public void setWifiRadioType(@javax.annotation.Nullable final WifiRadioType value) {
        this._wifiRadioType = value;
    }
    /**
     * Sets the wifiSignalStrength property value. WiFi signal strength in percentage reported by the media endpoint.
     * @param value Value to set for the wifiSignalStrength property.
     * @return a void
     */
    public void setWifiSignalStrength(@javax.annotation.Nullable final Integer value) {
        this._wifiSignalStrength = value;
    }
    /**
     * Sets the wifiVendorDriver property value. Name of the WiFi driver used by the media endpoint. Value may be localized based on the language used by endpoint.
     * @param value Value to set for the wifiVendorDriver property.
     * @return a void
     */
    public void setWifiVendorDriver(@javax.annotation.Nullable final String value) {
        this._wifiVendorDriver = value;
    }
    /**
     * Sets the wifiVendorDriverVersion property value. Version of the WiFi driver used by the media endpoint.
     * @param value Value to set for the wifiVendorDriverVersion property.
     * @return a void
     */
    public void setWifiVendorDriverVersion(@javax.annotation.Nullable final String value) {
        this._wifiVendorDriverVersion = value;
    }
}
