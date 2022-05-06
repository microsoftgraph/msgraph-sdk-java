package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the admin singleton.  */
public enum ServiceUpdateCategory implements ValuedEnum {
    PreventOrFixIssue("preventOrFixIssue"),
    PlanForChange("planForChange"),
    StayInformed("stayInformed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ServiceUpdateCategory(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceUpdateCategory forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "preventOrFixIssue": return PreventOrFixIssue;
            case "planForChange": return PlanForChange;
            case "stayInformed": return StayInformed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
