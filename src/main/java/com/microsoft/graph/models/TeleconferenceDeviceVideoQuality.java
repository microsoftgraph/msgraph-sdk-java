package com.microsoft.graph.models;

import com.microsoft.graph.models.TeleconferenceDeviceScreenSharingQuality;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeleconferenceDeviceVideoQuality extends TeleconferenceDeviceMediaQuality implements Parsable {
    /** The average inbound stream video bit rate per second. */
    private Double _averageInboundBitRate;
    /** The average inbound stream video frame rate per second. */
    private Double _averageInboundFrameRate;
    /** The average outbound stream video bit rate per second. */
    private Double _averageOutboundBitRate;
    /** The average outbound stream video frame rate per second. */
    private Double _averageOutboundFrameRate;
    /**
     * Instantiates a new TeleconferenceDeviceVideoQuality and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeleconferenceDeviceVideoQuality() {
        super();
        this.setOdataType("#microsoft.graph.teleconferenceDeviceVideoQuality");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeleconferenceDeviceVideoQuality
     */
    @javax.annotation.Nonnull
    public static TeleconferenceDeviceVideoQuality createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getAverageInboundBitRate() {
        return this._averageInboundBitRate;
    }
    /**
     * Gets the averageInboundFrameRate property value. The average inbound stream video frame rate per second.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getAverageInboundFrameRate() {
        return this._averageInboundFrameRate;
    }
    /**
     * Gets the averageOutboundBitRate property value. The average outbound stream video bit rate per second.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getAverageOutboundBitRate() {
        return this._averageOutboundBitRate;
    }
    /**
     * Gets the averageOutboundFrameRate property value. The average outbound stream video frame rate per second.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getAverageOutboundFrameRate() {
        return this._averageOutboundFrameRate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("averageInboundBitRate", (n) -> { this.setAverageInboundBitRate(n.getDoubleValue()); });
        deserializerMap.put("averageInboundFrameRate", (n) -> { this.setAverageInboundFrameRate(n.getDoubleValue()); });
        deserializerMap.put("averageOutboundBitRate", (n) -> { this.setAverageOutboundBitRate(n.getDoubleValue()); });
        deserializerMap.put("averageOutboundFrameRate", (n) -> { this.setAverageOutboundFrameRate(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAverageInboundBitRate(@javax.annotation.Nullable final Double value) {
        this._averageInboundBitRate = value;
    }
    /**
     * Sets the averageInboundFrameRate property value. The average inbound stream video frame rate per second.
     * @param value Value to set for the averageInboundFrameRate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAverageInboundFrameRate(@javax.annotation.Nullable final Double value) {
        this._averageInboundFrameRate = value;
    }
    /**
     * Sets the averageOutboundBitRate property value. The average outbound stream video bit rate per second.
     * @param value Value to set for the averageOutboundBitRate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAverageOutboundBitRate(@javax.annotation.Nullable final Double value) {
        this._averageOutboundBitRate = value;
    }
    /**
     * Sets the averageOutboundFrameRate property value. The average outbound stream video frame rate per second.
     * @param value Value to set for the averageOutboundFrameRate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAverageOutboundFrameRate(@javax.annotation.Nullable final Double value) {
        this._averageOutboundFrameRate = value;
    }
}
