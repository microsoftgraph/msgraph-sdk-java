package com.microsoft.graph.models;

import com.microsoft.graph.models.TeleconferenceDeviceAudioQuality;
import com.microsoft.graph.models.TeleconferenceDeviceScreenSharingQuality;
import com.microsoft.graph.models.TeleconferenceDeviceVideoQuality;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeleconferenceDeviceMediaQuality implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The average inbound stream network jitter. */
    private Period _averageInboundJitter;
    /** The average inbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%. */
    private Double _averageInboundPacketLossRateInPercentage;
    /** The average inbound stream network round trip delay. */
    private Period _averageInboundRoundTripDelay;
    /** The average outbound stream network jitter. */
    private Period _averageOutboundJitter;
    /** The average outbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%. */
    private Double _averageOutboundPacketLossRateInPercentage;
    /** The average outbound stream network round trip delay. */
    private Period _averageOutboundRoundTripDelay;
    /** The channel index of media. Indexing begins with 1.  If a media session contains 3 video modalities, channel indexes will be 1, 2, and 3. */
    private Integer _channelIndex;
    /** The total number of the inbound packets. */
    private Long _inboundPackets;
    /** the local IP address for the media session. */
    private String _localIPAddress;
    /** The local media port. */
    private Integer _localPort;
    /** The maximum inbound stream network jitter. */
    private Period _maximumInboundJitter;
    /** The maximum inbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%. */
    private Double _maximumInboundPacketLossRateInPercentage;
    /** The maximum inbound stream network round trip delay. */
    private Period _maximumInboundRoundTripDelay;
    /** The maximum outbound stream network jitter. */
    private Period _maximumOutboundJitter;
    /** The maximum outbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%. */
    private Double _maximumOutboundPacketLossRateInPercentage;
    /** The maximum outbound stream network round trip delay. */
    private Period _maximumOutboundRoundTripDelay;
    /** The total modality duration. If the media enabled and disabled multiple times, MediaDuration will the summation of all of the durations. */
    private Period _mediaDuration;
    /** The network link speed in bytes */
    private Long _networkLinkSpeedInBytes;
    /** The OdataType property */
    private String _odataType;
    /** The total number of the outbound packets. */
    private Long _outboundPackets;
    /** The remote IP address for the media session. */
    private String _remoteIPAddress;
    /** The remote media port. */
    private Integer _remotePort;
    /**
     * Instantiates a new teleconferenceDeviceMediaQuality and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeleconferenceDeviceMediaQuality() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teleconferenceDeviceMediaQuality
     */
    @javax.annotation.Nonnull
    public static TeleconferenceDeviceMediaQuality createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.teleconferenceDeviceAudioQuality": return new TeleconferenceDeviceAudioQuality();
                case "#microsoft.graph.teleconferenceDeviceScreenSharingQuality": return new TeleconferenceDeviceScreenSharingQuality();
                case "#microsoft.graph.teleconferenceDeviceVideoQuality": return new TeleconferenceDeviceVideoQuality();
            }
        }
        return new TeleconferenceDeviceMediaQuality();
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
     * Gets the averageInboundJitter property value. The average inbound stream network jitter.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getAverageInboundJitter() {
        return this._averageInboundJitter;
    }
    /**
     * Gets the averageInboundPacketLossRateInPercentage property value. The average inbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getAverageInboundPacketLossRateInPercentage() {
        return this._averageInboundPacketLossRateInPercentage;
    }
    /**
     * Gets the averageInboundRoundTripDelay property value. The average inbound stream network round trip delay.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getAverageInboundRoundTripDelay() {
        return this._averageInboundRoundTripDelay;
    }
    /**
     * Gets the averageOutboundJitter property value. The average outbound stream network jitter.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getAverageOutboundJitter() {
        return this._averageOutboundJitter;
    }
    /**
     * Gets the averageOutboundPacketLossRateInPercentage property value. The average outbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getAverageOutboundPacketLossRateInPercentage() {
        return this._averageOutboundPacketLossRateInPercentage;
    }
    /**
     * Gets the averageOutboundRoundTripDelay property value. The average outbound stream network round trip delay.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getAverageOutboundRoundTripDelay() {
        return this._averageOutboundRoundTripDelay;
    }
    /**
     * Gets the channelIndex property value. The channel index of media. Indexing begins with 1.  If a media session contains 3 video modalities, channel indexes will be 1, 2, and 3.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getChannelIndex() {
        return this._channelIndex;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(22);
        deserializerMap.put("averageInboundJitter", (n) -> { this.setAverageInboundJitter(n.getPeriodValue()); });
        deserializerMap.put("averageInboundPacketLossRateInPercentage", (n) -> { this.setAverageInboundPacketLossRateInPercentage(n.getDoubleValue()); });
        deserializerMap.put("averageInboundRoundTripDelay", (n) -> { this.setAverageInboundRoundTripDelay(n.getPeriodValue()); });
        deserializerMap.put("averageOutboundJitter", (n) -> { this.setAverageOutboundJitter(n.getPeriodValue()); });
        deserializerMap.put("averageOutboundPacketLossRateInPercentage", (n) -> { this.setAverageOutboundPacketLossRateInPercentage(n.getDoubleValue()); });
        deserializerMap.put("averageOutboundRoundTripDelay", (n) -> { this.setAverageOutboundRoundTripDelay(n.getPeriodValue()); });
        deserializerMap.put("channelIndex", (n) -> { this.setChannelIndex(n.getIntegerValue()); });
        deserializerMap.put("inboundPackets", (n) -> { this.setInboundPackets(n.getLongValue()); });
        deserializerMap.put("localIPAddress", (n) -> { this.setLocalIPAddress(n.getStringValue()); });
        deserializerMap.put("localPort", (n) -> { this.setLocalPort(n.getIntegerValue()); });
        deserializerMap.put("maximumInboundJitter", (n) -> { this.setMaximumInboundJitter(n.getPeriodValue()); });
        deserializerMap.put("maximumInboundPacketLossRateInPercentage", (n) -> { this.setMaximumInboundPacketLossRateInPercentage(n.getDoubleValue()); });
        deserializerMap.put("maximumInboundRoundTripDelay", (n) -> { this.setMaximumInboundRoundTripDelay(n.getPeriodValue()); });
        deserializerMap.put("maximumOutboundJitter", (n) -> { this.setMaximumOutboundJitter(n.getPeriodValue()); });
        deserializerMap.put("maximumOutboundPacketLossRateInPercentage", (n) -> { this.setMaximumOutboundPacketLossRateInPercentage(n.getDoubleValue()); });
        deserializerMap.put("maximumOutboundRoundTripDelay", (n) -> { this.setMaximumOutboundRoundTripDelay(n.getPeriodValue()); });
        deserializerMap.put("mediaDuration", (n) -> { this.setMediaDuration(n.getPeriodValue()); });
        deserializerMap.put("networkLinkSpeedInBytes", (n) -> { this.setNetworkLinkSpeedInBytes(n.getLongValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("outboundPackets", (n) -> { this.setOutboundPackets(n.getLongValue()); });
        deserializerMap.put("remoteIPAddress", (n) -> { this.setRemoteIPAddress(n.getStringValue()); });
        deserializerMap.put("remotePort", (n) -> { this.setRemotePort(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inboundPackets property value. The total number of the inbound packets.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getInboundPackets() {
        return this._inboundPackets;
    }
    /**
     * Gets the localIPAddress property value. the local IP address for the media session.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocalIPAddress() {
        return this._localIPAddress;
    }
    /**
     * Gets the localPort property value. The local media port.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLocalPort() {
        return this._localPort;
    }
    /**
     * Gets the maximumInboundJitter property value. The maximum inbound stream network jitter.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getMaximumInboundJitter() {
        return this._maximumInboundJitter;
    }
    /**
     * Gets the maximumInboundPacketLossRateInPercentage property value. The maximum inbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getMaximumInboundPacketLossRateInPercentage() {
        return this._maximumInboundPacketLossRateInPercentage;
    }
    /**
     * Gets the maximumInboundRoundTripDelay property value. The maximum inbound stream network round trip delay.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getMaximumInboundRoundTripDelay() {
        return this._maximumInboundRoundTripDelay;
    }
    /**
     * Gets the maximumOutboundJitter property value. The maximum outbound stream network jitter.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getMaximumOutboundJitter() {
        return this._maximumOutboundJitter;
    }
    /**
     * Gets the maximumOutboundPacketLossRateInPercentage property value. The maximum outbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getMaximumOutboundPacketLossRateInPercentage() {
        return this._maximumOutboundPacketLossRateInPercentage;
    }
    /**
     * Gets the maximumOutboundRoundTripDelay property value. The maximum outbound stream network round trip delay.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getMaximumOutboundRoundTripDelay() {
        return this._maximumOutboundRoundTripDelay;
    }
    /**
     * Gets the mediaDuration property value. The total modality duration. If the media enabled and disabled multiple times, MediaDuration will the summation of all of the durations.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getMediaDuration() {
        return this._mediaDuration;
    }
    /**
     * Gets the networkLinkSpeedInBytes property value. The network link speed in bytes
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getNetworkLinkSpeedInBytes() {
        return this._networkLinkSpeedInBytes;
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
     * Gets the outboundPackets property value. The total number of the outbound packets.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getOutboundPackets() {
        return this._outboundPackets;
    }
    /**
     * Gets the remoteIPAddress property value. The remote IP address for the media session.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemoteIPAddress() {
        return this._remoteIPAddress;
    }
    /**
     * Gets the remotePort property value. The remote media port.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRemotePort() {
        return this._remotePort;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writePeriodValue("averageInboundJitter", this.getAverageInboundJitter());
        writer.writeDoubleValue("averageInboundPacketLossRateInPercentage", this.getAverageInboundPacketLossRateInPercentage());
        writer.writePeriodValue("averageInboundRoundTripDelay", this.getAverageInboundRoundTripDelay());
        writer.writePeriodValue("averageOutboundJitter", this.getAverageOutboundJitter());
        writer.writeDoubleValue("averageOutboundPacketLossRateInPercentage", this.getAverageOutboundPacketLossRateInPercentage());
        writer.writePeriodValue("averageOutboundRoundTripDelay", this.getAverageOutboundRoundTripDelay());
        writer.writeIntegerValue("channelIndex", this.getChannelIndex());
        writer.writeLongValue("inboundPackets", this.getInboundPackets());
        writer.writeStringValue("localIPAddress", this.getLocalIPAddress());
        writer.writeIntegerValue("localPort", this.getLocalPort());
        writer.writePeriodValue("maximumInboundJitter", this.getMaximumInboundJitter());
        writer.writeDoubleValue("maximumInboundPacketLossRateInPercentage", this.getMaximumInboundPacketLossRateInPercentage());
        writer.writePeriodValue("maximumInboundRoundTripDelay", this.getMaximumInboundRoundTripDelay());
        writer.writePeriodValue("maximumOutboundJitter", this.getMaximumOutboundJitter());
        writer.writeDoubleValue("maximumOutboundPacketLossRateInPercentage", this.getMaximumOutboundPacketLossRateInPercentage());
        writer.writePeriodValue("maximumOutboundRoundTripDelay", this.getMaximumOutboundRoundTripDelay());
        writer.writePeriodValue("mediaDuration", this.getMediaDuration());
        writer.writeLongValue("networkLinkSpeedInBytes", this.getNetworkLinkSpeedInBytes());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("outboundPackets", this.getOutboundPackets());
        writer.writeStringValue("remoteIPAddress", this.getRemoteIPAddress());
        writer.writeIntegerValue("remotePort", this.getRemotePort());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the averageInboundJitter property value. The average inbound stream network jitter.
     * @param value Value to set for the averageInboundJitter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAverageInboundJitter(@javax.annotation.Nullable final Period value) {
        this._averageInboundJitter = value;
    }
    /**
     * Sets the averageInboundPacketLossRateInPercentage property value. The average inbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
     * @param value Value to set for the averageInboundPacketLossRateInPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAverageInboundPacketLossRateInPercentage(@javax.annotation.Nullable final Double value) {
        this._averageInboundPacketLossRateInPercentage = value;
    }
    /**
     * Sets the averageInboundRoundTripDelay property value. The average inbound stream network round trip delay.
     * @param value Value to set for the averageInboundRoundTripDelay property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAverageInboundRoundTripDelay(@javax.annotation.Nullable final Period value) {
        this._averageInboundRoundTripDelay = value;
    }
    /**
     * Sets the averageOutboundJitter property value. The average outbound stream network jitter.
     * @param value Value to set for the averageOutboundJitter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAverageOutboundJitter(@javax.annotation.Nullable final Period value) {
        this._averageOutboundJitter = value;
    }
    /**
     * Sets the averageOutboundPacketLossRateInPercentage property value. The average outbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
     * @param value Value to set for the averageOutboundPacketLossRateInPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAverageOutboundPacketLossRateInPercentage(@javax.annotation.Nullable final Double value) {
        this._averageOutboundPacketLossRateInPercentage = value;
    }
    /**
     * Sets the averageOutboundRoundTripDelay property value. The average outbound stream network round trip delay.
     * @param value Value to set for the averageOutboundRoundTripDelay property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAverageOutboundRoundTripDelay(@javax.annotation.Nullable final Period value) {
        this._averageOutboundRoundTripDelay = value;
    }
    /**
     * Sets the channelIndex property value. The channel index of media. Indexing begins with 1.  If a media session contains 3 video modalities, channel indexes will be 1, 2, and 3.
     * @param value Value to set for the channelIndex property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChannelIndex(@javax.annotation.Nullable final Integer value) {
        this._channelIndex = value;
    }
    /**
     * Sets the inboundPackets property value. The total number of the inbound packets.
     * @param value Value to set for the inboundPackets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInboundPackets(@javax.annotation.Nullable final Long value) {
        this._inboundPackets = value;
    }
    /**
     * Sets the localIPAddress property value. the local IP address for the media session.
     * @param value Value to set for the localIPAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalIPAddress(@javax.annotation.Nullable final String value) {
        this._localIPAddress = value;
    }
    /**
     * Sets the localPort property value. The local media port.
     * @param value Value to set for the localPort property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalPort(@javax.annotation.Nullable final Integer value) {
        this._localPort = value;
    }
    /**
     * Sets the maximumInboundJitter property value. The maximum inbound stream network jitter.
     * @param value Value to set for the maximumInboundJitter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumInboundJitter(@javax.annotation.Nullable final Period value) {
        this._maximumInboundJitter = value;
    }
    /**
     * Sets the maximumInboundPacketLossRateInPercentage property value. The maximum inbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
     * @param value Value to set for the maximumInboundPacketLossRateInPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumInboundPacketLossRateInPercentage(@javax.annotation.Nullable final Double value) {
        this._maximumInboundPacketLossRateInPercentage = value;
    }
    /**
     * Sets the maximumInboundRoundTripDelay property value. The maximum inbound stream network round trip delay.
     * @param value Value to set for the maximumInboundRoundTripDelay property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumInboundRoundTripDelay(@javax.annotation.Nullable final Period value) {
        this._maximumInboundRoundTripDelay = value;
    }
    /**
     * Sets the maximumOutboundJitter property value. The maximum outbound stream network jitter.
     * @param value Value to set for the maximumOutboundJitter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumOutboundJitter(@javax.annotation.Nullable final Period value) {
        this._maximumOutboundJitter = value;
    }
    /**
     * Sets the maximumOutboundPacketLossRateInPercentage property value. The maximum outbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
     * @param value Value to set for the maximumOutboundPacketLossRateInPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumOutboundPacketLossRateInPercentage(@javax.annotation.Nullable final Double value) {
        this._maximumOutboundPacketLossRateInPercentage = value;
    }
    /**
     * Sets the maximumOutboundRoundTripDelay property value. The maximum outbound stream network round trip delay.
     * @param value Value to set for the maximumOutboundRoundTripDelay property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumOutboundRoundTripDelay(@javax.annotation.Nullable final Period value) {
        this._maximumOutboundRoundTripDelay = value;
    }
    /**
     * Sets the mediaDuration property value. The total modality duration. If the media enabled and disabled multiple times, MediaDuration will the summation of all of the durations.
     * @param value Value to set for the mediaDuration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaDuration(@javax.annotation.Nullable final Period value) {
        this._mediaDuration = value;
    }
    /**
     * Sets the networkLinkSpeedInBytes property value. The network link speed in bytes
     * @param value Value to set for the networkLinkSpeedInBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkLinkSpeedInBytes(@javax.annotation.Nullable final Long value) {
        this._networkLinkSpeedInBytes = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the outboundPackets property value. The total number of the outbound packets.
     * @param value Value to set for the outboundPackets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOutboundPackets(@javax.annotation.Nullable final Long value) {
        this._outboundPackets = value;
    }
    /**
     * Sets the remoteIPAddress property value. The remote IP address for the media session.
     * @param value Value to set for the remoteIPAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoteIPAddress(@javax.annotation.Nullable final String value) {
        this._remoteIPAddress = value;
    }
    /**
     * Sets the remotePort property value. The remote media port.
     * @param value Value to set for the remotePort property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemotePort(@javax.annotation.Nullable final Integer value) {
        this._remotePort = value;
    }
}
