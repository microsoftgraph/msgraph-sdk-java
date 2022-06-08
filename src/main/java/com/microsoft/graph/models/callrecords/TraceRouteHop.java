package microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TraceRouteHop implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The network path count of this hop that was used to compute the RTT. */
    private Integer _hopCount;
    /** IP address used for this hop in the network trace. */
    private String _ipAddress;
    /** The time from when the trace route packet was sent from the client to this hop and back to the client, denoted in [ISO 8601][] format. For example, 1 second is denoted as PT1S, where P is the duration designator, T is the time designator, and S is the second designator. */
    private Period _roundTripTime;
    /**
     * Instantiates a new traceRouteHop and sets the default values.
     * @return a void
     */
    public TraceRouteHop() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a traceRouteHop
     */
    @javax.annotation.Nonnull
    public static TraceRouteHop createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TraceRouteHop();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TraceRouteHop currentObject = this;
        return new HashMap<>(3) {{
            this.put("hopCount", (n) -> { currentObject.setHopCount(n.getIntegerValue()); });
            this.put("ipAddress", (n) -> { currentObject.setIpAddress(n.getStringValue()); });
            this.put("roundTripTime", (n) -> { currentObject.setRoundTripTime(n.getPeriodValue()); });
        }};
    }
    /**
     * Gets the hopCount property value. The network path count of this hop that was used to compute the RTT.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getHopCount() {
        return this._hopCount;
    }
    /**
     * Gets the ipAddress property value. IP address used for this hop in the network trace.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpAddress() {
        return this._ipAddress;
    }
    /**
     * Gets the roundTripTime property value. The time from when the trace route packet was sent from the client to this hop and back to the client, denoted in [ISO 8601][] format. For example, 1 second is denoted as PT1S, where P is the duration designator, T is the time designator, and S is the second designator.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getRoundTripTime() {
        return this._roundTripTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("hopCount", this.getHopCount());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writePeriodValue("roundTripTime", this.getRoundTripTime());
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
     * Sets the hopCount property value. The network path count of this hop that was used to compute the RTT.
     * @param value Value to set for the hopCount property.
     * @return a void
     */
    public void setHopCount(@javax.annotation.Nullable final Integer value) {
        this._hopCount = value;
    }
    /**
     * Sets the ipAddress property value. IP address used for this hop in the network trace.
     * @param value Value to set for the ipAddress property.
     * @return a void
     */
    public void setIpAddress(@javax.annotation.Nullable final String value) {
        this._ipAddress = value;
    }
    /**
     * Sets the roundTripTime property value. The time from when the trace route packet was sent from the client to this hop and back to the client, denoted in [ISO 8601][] format. For example, 1 second is denoted as PT1S, where P is the duration designator, T is the time designator, and S is the second designator.
     * @param value Value to set for the roundTripTime property.
     * @return a void
     */
    public void setRoundTripTime(@javax.annotation.Nullable final Period value) {
        this._roundTripTime = value;
    }
}
