package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the security singleton. */
public enum RegistryOperation implements ValuedEnum {
    Unknown("unknown"),
    Create("create"),
    Modify("modify"),
    Delete("delete"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RegistryOperation(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RegistryOperation forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "create": return Create;
            case "modify": return Modify;
            case "delete": return Delete;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
