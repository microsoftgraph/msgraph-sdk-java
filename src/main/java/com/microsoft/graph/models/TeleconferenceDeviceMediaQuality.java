package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
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
public class TeleconferenceDeviceMediaQuality implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new TeleconferenceDeviceMediaQuality and sets the default values.
     */
    public TeleconferenceDeviceMediaQuality() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeleconferenceDeviceMediaQuality
     */
    @jakarta.annotation.Nonnull
    public static TeleconferenceDeviceMediaQuality createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
     * Gets the averageInboundJitter property value. The average inbound stream network jitter.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getAverageInboundJitter() {
        return this.BackingStore.get("averageInboundJitter");
    }
    /**
     * Gets the averageInboundPacketLossRateInPercentage property value. The average inbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getAverageInboundPacketLossRateInPercentage() {
        return this.BackingStore.get("averageInboundPacketLossRateInPercentage");
    }
    /**
     * Gets the averageInboundRoundTripDelay property value. The average inbound stream network round trip delay.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getAverageInboundRoundTripDelay() {
        return this.BackingStore.get("averageInboundRoundTripDelay");
    }
    /**
     * Gets the averageOutboundJitter property value. The average outbound stream network jitter.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getAverageOutboundJitter() {
        return this.BackingStore.get("averageOutboundJitter");
    }
    /**
     * Gets the averageOutboundPacketLossRateInPercentage property value. The average outbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getAverageOutboundPacketLossRateInPercentage() {
        return this.BackingStore.get("averageOutboundPacketLossRateInPercentage");
    }
    /**
     * Gets the averageOutboundRoundTripDelay property value. The average outbound stream network round trip delay.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getAverageOutboundRoundTripDelay() {
        return this.BackingStore.get("averageOutboundRoundTripDelay");
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
     * Gets the channelIndex property value. The channel index of media. Indexing begins with 1.  If a media session contains 3 video modalities, channel indexes will be 1, 2, and 3.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getChannelIndex() {
        return this.BackingStore.get("channelIndex");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(22);
        deserializerMap.put("averageInboundJitter", (n) -> { this.setAverageInboundJitter(n.getPeriodAndDurationValue()); });
        deserializerMap.put("averageInboundPacketLossRateInPercentage", (n) -> { this.setAverageInboundPacketLossRateInPercentage(n.getDoubleValue()); });
        deserializerMap.put("averageInboundRoundTripDelay", (n) -> { this.setAverageInboundRoundTripDelay(n.getPeriodAndDurationValue()); });
        deserializerMap.put("averageOutboundJitter", (n) -> { this.setAverageOutboundJitter(n.getPeriodAndDurationValue()); });
        deserializerMap.put("averageOutboundPacketLossRateInPercentage", (n) -> { this.setAverageOutboundPacketLossRateInPercentage(n.getDoubleValue()); });
        deserializerMap.put("averageOutboundRoundTripDelay", (n) -> { this.setAverageOutboundRoundTripDelay(n.getPeriodAndDurationValue()); });
        deserializerMap.put("channelIndex", (n) -> { this.setChannelIndex(n.getIntegerValue()); });
        deserializerMap.put("inboundPackets", (n) -> { this.setInboundPackets(n.getLongValue()); });
        deserializerMap.put("localIPAddress", (n) -> { this.setLocalIPAddress(n.getStringValue()); });
        deserializerMap.put("localPort", (n) -> { this.setLocalPort(n.getIntegerValue()); });
        deserializerMap.put("maximumInboundJitter", (n) -> { this.setMaximumInboundJitter(n.getPeriodAndDurationValue()); });
        deserializerMap.put("maximumInboundPacketLossRateInPercentage", (n) -> { this.setMaximumInboundPacketLossRateInPercentage(n.getDoubleValue()); });
        deserializerMap.put("maximumInboundRoundTripDelay", (n) -> { this.setMaximumInboundRoundTripDelay(n.getPeriodAndDurationValue()); });
        deserializerMap.put("maximumOutboundJitter", (n) -> { this.setMaximumOutboundJitter(n.getPeriodAndDurationValue()); });
        deserializerMap.put("maximumOutboundPacketLossRateInPercentage", (n) -> { this.setMaximumOutboundPacketLossRateInPercentage(n.getDoubleValue()); });
        deserializerMap.put("maximumOutboundRoundTripDelay", (n) -> { this.setMaximumOutboundRoundTripDelay(n.getPeriodAndDurationValue()); });
        deserializerMap.put("mediaDuration", (n) -> { this.setMediaDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("networkLinkSpeedInBytes", (n) -> { this.setNetworkLinkSpeedInBytes(n.getLongValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("outboundPackets", (n) -> { this.setOutboundPackets(n.getLongValue()); });
        deserializerMap.put("remoteIPAddress", (n) -> { this.setRemoteIPAddress(n.getStringValue()); });
        deserializerMap.put("remotePort", (n) -> { this.setRemotePort(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inboundPackets property value. The total number of the inbound packets.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getInboundPackets() {
        return this.BackingStore.get("inboundPackets");
    }
    /**
     * Gets the localIPAddress property value. the local IP address for the media session.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLocalIPAddress() {
        return this.BackingStore.get("localIPAddress");
    }
    /**
     * Gets the localPort property value. The local media port.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLocalPort() {
        return this.BackingStore.get("localPort");
    }
    /**
     * Gets the maximumInboundJitter property value. The maximum inbound stream network jitter.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getMaximumInboundJitter() {
        return this.BackingStore.get("maximumInboundJitter");
    }
    /**
     * Gets the maximumInboundPacketLossRateInPercentage property value. The maximum inbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getMaximumInboundPacketLossRateInPercentage() {
        return this.BackingStore.get("maximumInboundPacketLossRateInPercentage");
    }
    /**
     * Gets the maximumInboundRoundTripDelay property value. The maximum inbound stream network round trip delay.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getMaximumInboundRoundTripDelay() {
        return this.BackingStore.get("maximumInboundRoundTripDelay");
    }
    /**
     * Gets the maximumOutboundJitter property value. The maximum outbound stream network jitter.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getMaximumOutboundJitter() {
        return this.BackingStore.get("maximumOutboundJitter");
    }
    /**
     * Gets the maximumOutboundPacketLossRateInPercentage property value. The maximum outbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getMaximumOutboundPacketLossRateInPercentage() {
        return this.BackingStore.get("maximumOutboundPacketLossRateInPercentage");
    }
    /**
     * Gets the maximumOutboundRoundTripDelay property value. The maximum outbound stream network round trip delay.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getMaximumOutboundRoundTripDelay() {
        return this.BackingStore.get("maximumOutboundRoundTripDelay");
    }
    /**
     * Gets the mediaDuration property value. The total modality duration. If the media enabled and disabled multiple times, MediaDuration will the summation of all of the durations.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getMediaDuration() {
        return this.BackingStore.get("mediaDuration");
    }
    /**
     * Gets the networkLinkSpeedInBytes property value. The network link speed in bytes
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getNetworkLinkSpeedInBytes() {
        return this.BackingStore.get("networkLinkSpeedInBytes");
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
     * Gets the outboundPackets property value. The total number of the outbound packets.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getOutboundPackets() {
        return this.BackingStore.get("outboundPackets");
    }
    /**
     * Gets the remoteIPAddress property value. The remote IP address for the media session.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRemoteIPAddress() {
        return this.BackingStore.get("remoteIPAddress");
    }
    /**
     * Gets the remotePort property value. The remote media port.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRemotePort() {
        return this.BackingStore.get("remotePort");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writePeriodAndDurationValue("averageInboundJitter", this.getAverageInboundJitter());
        writer.writeDoubleValue("averageInboundPacketLossRateInPercentage", this.getAverageInboundPacketLossRateInPercentage());
        writer.writePeriodAndDurationValue("averageInboundRoundTripDelay", this.getAverageInboundRoundTripDelay());
        writer.writePeriodAndDurationValue("averageOutboundJitter", this.getAverageOutboundJitter());
        writer.writeDoubleValue("averageOutboundPacketLossRateInPercentage", this.getAverageOutboundPacketLossRateInPercentage());
        writer.writePeriodAndDurationValue("averageOutboundRoundTripDelay", this.getAverageOutboundRoundTripDelay());
        writer.writeIntegerValue("channelIndex", this.getChannelIndex());
        writer.writeLongValue("inboundPackets", this.getInboundPackets());
        writer.writeStringValue("localIPAddress", this.getLocalIPAddress());
        writer.writeIntegerValue("localPort", this.getLocalPort());
        writer.writePeriodAndDurationValue("maximumInboundJitter", this.getMaximumInboundJitter());
        writer.writeDoubleValue("maximumInboundPacketLossRateInPercentage", this.getMaximumInboundPacketLossRateInPercentage());
        writer.writePeriodAndDurationValue("maximumInboundRoundTripDelay", this.getMaximumInboundRoundTripDelay());
        writer.writePeriodAndDurationValue("maximumOutboundJitter", this.getMaximumOutboundJitter());
        writer.writeDoubleValue("maximumOutboundPacketLossRateInPercentage", this.getMaximumOutboundPacketLossRateInPercentage());
        writer.writePeriodAndDurationValue("maximumOutboundRoundTripDelay", this.getMaximumOutboundRoundTripDelay());
        writer.writePeriodAndDurationValue("mediaDuration", this.getMediaDuration());
        writer.writeLongValue("networkLinkSpeedInBytes", this.getNetworkLinkSpeedInBytes());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("outboundPackets", this.getOutboundPackets());
        writer.writeStringValue("remoteIPAddress", this.getRemoteIPAddress());
        writer.writeIntegerValue("remotePort", this.getRemotePort());
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
     * Sets the averageInboundJitter property value. The average inbound stream network jitter.
     * @param value Value to set for the averageInboundJitter property.
     */
    public void setAverageInboundJitter(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.BackingStore.set("averageInboundJitter", value);
    }
    /**
     * Sets the averageInboundPacketLossRateInPercentage property value. The average inbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
     * @param value Value to set for the averageInboundPacketLossRateInPercentage property.
     */
    public void setAverageInboundPacketLossRateInPercentage(@jakarta.annotation.Nullable final Double value) {
        this.BackingStore.set("averageInboundPacketLossRateInPercentage", value);
    }
    /**
     * Sets the averageInboundRoundTripDelay property value. The average inbound stream network round trip delay.
     * @param value Value to set for the averageInboundRoundTripDelay property.
     */
    public void setAverageInboundRoundTripDelay(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.BackingStore.set("averageInboundRoundTripDelay", value);
    }
    /**
     * Sets the averageOutboundJitter property value. The average outbound stream network jitter.
     * @param value Value to set for the averageOutboundJitter property.
     */
    public void setAverageOutboundJitter(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.BackingStore.set("averageOutboundJitter", value);
    }
    /**
     * Sets the averageOutboundPacketLossRateInPercentage property value. The average outbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
     * @param value Value to set for the averageOutboundPacketLossRateInPercentage property.
     */
    public void setAverageOutboundPacketLossRateInPercentage(@jakarta.annotation.Nullable final Double value) {
        this.BackingStore.set("averageOutboundPacketLossRateInPercentage", value);
    }
    /**
     * Sets the averageOutboundRoundTripDelay property value. The average outbound stream network round trip delay.
     * @param value Value to set for the averageOutboundRoundTripDelay property.
     */
    public void setAverageOutboundRoundTripDelay(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.BackingStore.set("averageOutboundRoundTripDelay", value);
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
     * Sets the channelIndex property value. The channel index of media. Indexing begins with 1.  If a media session contains 3 video modalities, channel indexes will be 1, 2, and 3.
     * @param value Value to set for the channelIndex property.
     */
    public void setChannelIndex(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("channelIndex", value);
    }
    /**
     * Sets the inboundPackets property value. The total number of the inbound packets.
     * @param value Value to set for the inboundPackets property.
     */
    public void setInboundPackets(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("inboundPackets", value);
    }
    /**
     * Sets the localIPAddress property value. the local IP address for the media session.
     * @param value Value to set for the localIPAddress property.
     */
    public void setLocalIPAddress(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("localIPAddress", value);
    }
    /**
     * Sets the localPort property value. The local media port.
     * @param value Value to set for the localPort property.
     */
    public void setLocalPort(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("localPort", value);
    }
    /**
     * Sets the maximumInboundJitter property value. The maximum inbound stream network jitter.
     * @param value Value to set for the maximumInboundJitter property.
     */
    public void setMaximumInboundJitter(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.BackingStore.set("maximumInboundJitter", value);
    }
    /**
     * Sets the maximumInboundPacketLossRateInPercentage property value. The maximum inbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
     * @param value Value to set for the maximumInboundPacketLossRateInPercentage property.
     */
    public void setMaximumInboundPacketLossRateInPercentage(@jakarta.annotation.Nullable final Double value) {
        this.BackingStore.set("maximumInboundPacketLossRateInPercentage", value);
    }
    /**
     * Sets the maximumInboundRoundTripDelay property value. The maximum inbound stream network round trip delay.
     * @param value Value to set for the maximumInboundRoundTripDelay property.
     */
    public void setMaximumInboundRoundTripDelay(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.BackingStore.set("maximumInboundRoundTripDelay", value);
    }
    /**
     * Sets the maximumOutboundJitter property value. The maximum outbound stream network jitter.
     * @param value Value to set for the maximumOutboundJitter property.
     */
    public void setMaximumOutboundJitter(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.BackingStore.set("maximumOutboundJitter", value);
    }
    /**
     * Sets the maximumOutboundPacketLossRateInPercentage property value. The maximum outbound stream packet loss rate in percentage (0-100). For example, 0.01 means 0.01%.
     * @param value Value to set for the maximumOutboundPacketLossRateInPercentage property.
     */
    public void setMaximumOutboundPacketLossRateInPercentage(@jakarta.annotation.Nullable final Double value) {
        this.BackingStore.set("maximumOutboundPacketLossRateInPercentage", value);
    }
    /**
     * Sets the maximumOutboundRoundTripDelay property value. The maximum outbound stream network round trip delay.
     * @param value Value to set for the maximumOutboundRoundTripDelay property.
     */
    public void setMaximumOutboundRoundTripDelay(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.BackingStore.set("maximumOutboundRoundTripDelay", value);
    }
    /**
     * Sets the mediaDuration property value. The total modality duration. If the media enabled and disabled multiple times, MediaDuration will the summation of all of the durations.
     * @param value Value to set for the mediaDuration property.
     */
    public void setMediaDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.BackingStore.set("mediaDuration", value);
    }
    /**
     * Sets the networkLinkSpeedInBytes property value. The network link speed in bytes
     * @param value Value to set for the networkLinkSpeedInBytes property.
     */
    public void setNetworkLinkSpeedInBytes(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("networkLinkSpeedInBytes", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the outboundPackets property value. The total number of the outbound packets.
     * @param value Value to set for the outboundPackets property.
     */
    public void setOutboundPackets(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("outboundPackets", value);
    }
    /**
     * Sets the remoteIPAddress property value. The remote IP address for the media session.
     * @param value Value to set for the remoteIPAddress property.
     */
    public void setRemoteIPAddress(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("remoteIPAddress", value);
    }
    /**
     * Sets the remotePort property value. The remote media port.
     * @param value Value to set for the remotePort property.
     */
    public void setRemotePort(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("remotePort", value);
    }
}
