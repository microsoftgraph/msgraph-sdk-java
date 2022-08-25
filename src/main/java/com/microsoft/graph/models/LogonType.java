package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
public enum LogonType implements ValuedEnum {
    Unknown("unknown"),
    Interactive("interactive"),
    RemoteInteractive("remoteInteractive"),
    Network("network"),
    Batch("batch"),
    Service("service"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    LogonType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static LogonType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "interactive": return Interactive;
            case "remoteInteractive": return RemoteInteractive;
            case "network": return Network;
            case "batch": return Batch;
            case "service": return Service;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
