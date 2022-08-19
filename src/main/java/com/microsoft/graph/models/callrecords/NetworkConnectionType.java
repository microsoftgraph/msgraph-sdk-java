package microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the cloudCommunications singleton. */
public enum NetworkConnectionType implements ValuedEnum {
    Unknown("unknown"),
    Wired("wired"),
    Wifi("wifi"),
    Mobile("mobile"),
    Tunnel("tunnel"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    NetworkConnectionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static NetworkConnectionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "wired": return Wired;
            case "wifi": return Wifi;
            case "mobile": return Mobile;
            case "tunnel": return Tunnel;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
