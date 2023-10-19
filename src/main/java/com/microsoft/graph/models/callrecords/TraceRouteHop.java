package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TraceRouteHop implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The network path count of this hop that was used to compute the RTT.
     */
    private Integer hopCount;
    /**
     * IP address used for this hop in the network trace.
     */
    private String ipAddress;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The time from when the trace route packet was sent from the client to this hop and back to the client, denoted in [ISO 8601][] format. For example, 1 second is denoted as PT1S, where P is the duration designator, T is the time designator, and S is the second designator.
     */
    private PeriodAndDuration roundTripTime;
    /**
     * Instantiates a new TraceRouteHop and sets the default values.
     */
    public TraceRouteHop() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TraceRouteHop
     */
    @jakarta.annotation.Nonnull
    public static TraceRouteHop createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TraceRouteHop();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("hopCount", (n) -> { this.setHopCount(n.getIntegerValue()); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("roundTripTime", (n) -> { this.setRoundTripTime(n.getPeriodAndDurationValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hopCount property value. The network path count of this hop that was used to compute the RTT.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getHopCount() {
        return this.hopCount;
    }
    /**
     * Gets the ipAddress property value. IP address used for this hop in the network trace.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the roundTripTime property value. The time from when the trace route packet was sent from the client to this hop and back to the client, denoted in [ISO 8601][] format. For example, 1 second is denoted as PT1S, where P is the duration designator, T is the time designator, and S is the second designator.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getRoundTripTime() {
        return this.roundTripTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("hopCount", this.getHopCount());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writePeriodAndDurationValue("roundTripTime", this.getRoundTripTime());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the hopCount property value. The network path count of this hop that was used to compute the RTT.
     * @param value Value to set for the hopCount property.
     */
    public void setHopCount(@jakarta.annotation.Nullable final Integer value) {
        this.hopCount = value;
    }
    /**
     * Sets the ipAddress property value. IP address used for this hop in the network trace.
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.ipAddress = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the roundTripTime property value. The time from when the trace route packet was sent from the client to this hop and back to the client, denoted in [ISO 8601][] format. For example, 1 second is denoted as PT1S, where P is the duration designator, T is the time designator, and S is the second designator.
     * @param value Value to set for the roundTripTime property.
     */
    public void setRoundTripTime(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.roundTripTime = PeriodAndDuration.ofPeriodAndDuration(value);
    }
}
