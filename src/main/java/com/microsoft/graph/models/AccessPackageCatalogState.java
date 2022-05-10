package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the identityGovernance singleton. */
public enum AccessPackageCatalogState implements ValuedEnum {
    Unpublished("unpublished"),
    Published("published"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessPackageCatalogState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AccessPackageCatalogState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unpublished": return Unpublished;
            case "published": return Published;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
