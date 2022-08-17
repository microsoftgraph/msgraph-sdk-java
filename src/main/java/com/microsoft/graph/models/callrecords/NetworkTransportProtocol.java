package microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the cloudCommunications singleton. */
public enum NetworkTransportProtocol implements ValuedEnum {
    Unknown("unknown"),
    Udp("udp"),
    Tcp("tcp"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    NetworkTransportProtocol(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static NetworkTransportProtocol forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "udp": return Udp;
            case "tcp": return Tcp;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
