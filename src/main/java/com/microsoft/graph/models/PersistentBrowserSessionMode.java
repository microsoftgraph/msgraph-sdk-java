package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the identityContainer singleton.  */
public enum PersistentBrowserSessionMode implements ValuedEnum {
    Always("always"),
    Never("never");
    public final String value;
    PersistentBrowserSessionMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PersistentBrowserSessionMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "always": return Always;
            case "never": return Never;
            default: return null;
        }
    }
}
