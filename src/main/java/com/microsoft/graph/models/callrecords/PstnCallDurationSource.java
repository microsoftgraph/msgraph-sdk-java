package microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the getPstnCalls method. */
public enum PstnCallDurationSource implements ValuedEnum {
    Microsoft("microsoft"),
    Operator("operator");
    public final String value;
    PstnCallDurationSource(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PstnCallDurationSource forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "microsoft": return Microsoft;
            case "operator": return Operator;
            default: return null;
        }
    }
}
