package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the identityGovernance singleton. */
public enum ConnectedOrganizationState implements ValuedEnum {
    Configured("configured"),
    Proposed("proposed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConnectedOrganizationState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ConnectedOrganizationState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "configured": return Configured;
            case "proposed": return Proposed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
