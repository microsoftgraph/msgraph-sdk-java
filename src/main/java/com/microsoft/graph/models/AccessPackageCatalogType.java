package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the identityGovernance singleton. */
public enum AccessPackageCatalogType implements ValuedEnum {
    UserManaged("userManaged"),
    ServiceDefault("serviceDefault"),
    ServiceManaged("serviceManaged"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessPackageCatalogType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AccessPackageCatalogType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userManaged": return UserManaged;
            case "serviceDefault": return ServiceDefault;
            case "serviceManaged": return ServiceManaged;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
