package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the auditLogRoot singleton. */
public enum ProvisioningResult implements ValuedEnum {
    Success("success"),
    Failure("failure"),
    Skipped("skipped"),
    Warning("warning"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ProvisioningResult(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ProvisioningResult forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "failure": return Failure;
            case "skipped": return Skipped;
            case "warning": return Warning;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
