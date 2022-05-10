package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the security singleton. */
public enum SecurityResourceType implements ValuedEnum {
    Unknown("unknown"),
    Attacked("attacked"),
    Related("related"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SecurityResourceType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SecurityResourceType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "attacked": return Attacked;
            case "related": return Related;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
