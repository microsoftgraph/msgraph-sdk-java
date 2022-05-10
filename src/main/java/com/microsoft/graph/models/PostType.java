package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the admin singleton. */
public enum PostType implements ValuedEnum {
    Regular("regular"),
    Quick("quick"),
    Strategic("strategic"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PostType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PostType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "regular": return Regular;
            case "quick": return Quick;
            case "strategic": return Strategic;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
