package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeleconferenceDeviceVideoQuality extends TeleconferenceDeviceMediaQuality implements Parsable {
    /**
     * Instantiates a new {@link TeleconferenceDeviceVideoQuality} and sets the default values.
     */
    public TeleconferenceDeviceVideoQuality() {
        super();
        this.setOdataType("#microsoft.graph.teleconferenceDeviceVideoQuality");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TeleconferenceDeviceVideoQuality}
     */
    @jakarta.annotation.Nonnull
    public static TeleconferenceDeviceVideoQuality createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.teleconferenceDeviceScreenSharingQuality": return new TeleconferenceDeviceScreenSharingQuality();
            }
        }
        return new TeleconferenceDeviceVideoQuality();
    }
    /**
     * Gets the averageInboundBitRate property value. The average inbound stream video bit rate per second.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getAverageInboundBitRate() {
        return this.backingStore.get("averageInboundBitRate");
    }
    /**
     * Gets the averageInboundFrameRate property value. The average inbound stream video frame rate per second.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getAverageInboundFrameRate() {
        return this.backingStore.get("averageInboundFrameRate");
    }
    /**
     * Gets the averageOutboundBitRate property value. The average outbound stream video bit rate per second.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getAverageOutboundBitRate() {
        return this.backingStore.get("averageOutboundBitRate");
    }
    /**
     * Gets the averageOutboundFrameRate property value. The average outbound stream video frame rate per second.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getAverageOutboundFrameRate() {
        return this.backingStore.get("averageOutboundFrameRate");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("averageInboundBitRate", (n) -> { this.setAverageInboundBitRate(n.getDoubleValue()); });
        deserializerMap.put("averageInboundFrameRate", (n) -> { this.setAverageInboundFrameRate(n.getDoubleValue()); });
        deserializerMap.put("averageOutboundBitRate", (n) -> { this.setAverageOutboundBitRate(n.getDoubleValue()); });
        deserializerMap.put("averageOutboundFrameRate", (n) -> { this.setAverageOutboundFrameRate(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeDoubleValue("averageInboundBitRate", this.getAverageInboundBitRate());
        writer.writeDoubleValue("averageInboundFrameRate", this.getAverageInboundFrameRate());
        writer.writeDoubleValue("averageOutboundBitRate", this.getAverageOutboundBitRate());
        writer.writeDoubleValue("averageOutboundFrameRate", this.getAverageOutboundFrameRate());
    }
    /**
     * Sets the averageInboundBitRate property value. The average inbound stream video bit rate per second.
     * @param value Value to set for the averageInboundBitRate property.
     */
    public void setAverageInboundBitRate(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("averageInboundBitRate", value);
    }
    /**
     * Sets the averageInboundFrameRate property value. The average inbound stream video frame rate per second.
     * @param value Value to set for the averageInboundFrameRate property.
     */
    public void setAverageInboundFrameRate(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("averageInboundFrameRate", value);
    }
    /**
     * Sets the averageOutboundBitRate property value. The average outbound stream video bit rate per second.
     * @param value Value to set for the averageOutboundBitRate property.
     */
    public void setAverageOutboundBitRate(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("averageOutboundBitRate", value);
    }
    /**
     * Sets the averageOutboundFrameRate property value. The average outbound stream video frame rate per second.
     * @param value Value to set for the averageOutboundFrameRate property.
     */
    public void setAverageOutboundFrameRate(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("averageOutboundFrameRate", value);
    }
}
