package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of authenticationMethodConfiguration entities. */
public enum Fido2RestrictionEnforcementType implements ValuedEnum {
    Allow("allow"),
    Block("block"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    Fido2RestrictionEnforcementType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Fido2RestrictionEnforcementType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allow": return Allow;
            case "block": return Block;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
