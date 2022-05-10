package microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of externalConnection entities. */
public enum ConnectionState implements ValuedEnum {
    Draft("draft"),
    Ready("ready"),
    Obsolete("obsolete"),
    LimitExceeded("limitExceeded"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConnectionState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ConnectionState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "draft": return Draft;
            case "ready": return Ready;
            case "obsolete": return Obsolete;
            case "limitExceeded": return LimitExceeded;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
