package microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of externalConnection entities. */
public enum AccessType implements ValuedEnum {
    Grant("grant"),
    Deny("deny"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AccessType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "grant": return Grant;
            case "deny": return Deny;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
