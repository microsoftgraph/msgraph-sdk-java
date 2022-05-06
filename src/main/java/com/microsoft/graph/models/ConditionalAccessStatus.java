package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the auditLogRoot singleton.  */
public enum ConditionalAccessStatus implements ValuedEnum {
    Success("success"),
    Failure("failure"),
    NotApplied("notApplied"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConditionalAccessStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ConditionalAccessStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "failure": return Failure;
            case "notApplied": return NotApplied;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
