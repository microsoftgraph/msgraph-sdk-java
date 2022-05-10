package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the onenotePatchContent method. */
public enum OnenotePatchInsertPosition implements ValuedEnum {
    After("After"),
    Before("Before");
    public final String value;
    OnenotePatchInsertPosition(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OnenotePatchInsertPosition forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "After": return After;
            case "Before": return Before;
            default: return null;
        }
    }
}
