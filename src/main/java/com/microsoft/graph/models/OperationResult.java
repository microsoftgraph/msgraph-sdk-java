package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the auditLogRoot singleton.  */
public enum OperationResult implements ValuedEnum {
    Success("success"),
    Failure("failure"),
    Timeout("timeout"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OperationResult(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OperationResult forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "failure": return Failure;
            case "timeout": return Timeout;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
