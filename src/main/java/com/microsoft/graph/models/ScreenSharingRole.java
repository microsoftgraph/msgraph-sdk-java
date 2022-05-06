package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the changeScreenSharingRole method.  */
public enum ScreenSharingRole implements ValuedEnum {
    Viewer("viewer"),
    Sharer("sharer");
    public final String value;
    ScreenSharingRole(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ScreenSharingRole forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "viewer": return Viewer;
            case "sharer": return Sharer;
            default: return null;
        }
    }
}
