package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the query method. */
public enum SearchAlterationType implements ValuedEnum {
    Suggestion("suggestion"),
    Modification("modification"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SearchAlterationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SearchAlterationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "suggestion": return Suggestion;
            case "modification": return Modification;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
