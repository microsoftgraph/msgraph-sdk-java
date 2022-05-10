package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the auditLogRoot singleton. */
public enum ProvisioningStatusErrorCategory implements ValuedEnum {
    Failure("failure"),
    NonServiceFailure("nonServiceFailure"),
    Success("success"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ProvisioningStatusErrorCategory(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ProvisioningStatusErrorCategory forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "failure": return Failure;
            case "nonServiceFailure": return NonServiceFailure;
            case "success": return Success;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
