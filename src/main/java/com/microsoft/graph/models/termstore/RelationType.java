package microsoft.graph.models.termstore;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the drive singleton.  */
public enum RelationType implements ValuedEnum {
    Pin("pin"),
    Reuse("reuse"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RelationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RelationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pin": return Pin;
            case "reuse": return Reuse;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
