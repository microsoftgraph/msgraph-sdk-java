package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum ApplicationType implements ValuedEnum {
    /** The windows universal application */
    Universal("universal"),
    /** The windows desktop application */
    Desktop("desktop");
    public final String value;
    ApplicationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ApplicationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "universal": return Universal;
            case "desktop": return Desktop;
            default: return null;
        }
    }
}
