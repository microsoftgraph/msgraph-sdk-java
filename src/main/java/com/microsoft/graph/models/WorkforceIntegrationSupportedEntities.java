package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
public enum WorkforceIntegrationSupportedEntities implements ValuedEnum {
    None("none"),
    Shift("shift"),
    SwapRequest("swapRequest"),
    UserShiftPreferences("userShiftPreferences"),
    OpenShift("openShift"),
    OpenShiftRequest("openShiftRequest"),
    OfferShiftRequest("offerShiftRequest"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WorkforceIntegrationSupportedEntities(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WorkforceIntegrationSupportedEntities forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "shift": return Shift;
            case "swapRequest": return SwapRequest;
            case "userShiftPreferences": return UserShiftPreferences;
            case "openShift": return OpenShift;
            case "openShiftRequest": return OpenShiftRequest;
            case "offerShiftRequest": return OfferShiftRequest;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
