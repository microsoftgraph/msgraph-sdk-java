package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the security singleton. */
public enum UserAccountSecurityType implements ValuedEnum {
    Unknown("unknown"),
    Standard("standard"),
    Power("power"),
    Administrator("administrator"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserAccountSecurityType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static UserAccountSecurityType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "standard": return Standard;
            case "power": return Power;
            case "administrator": return Administrator;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
