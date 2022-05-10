package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the identityProtectionRoot singleton. */
public enum RiskDetectionTimingType implements ValuedEnum {
    NotDefined("notDefined"),
    Realtime("realtime"),
    NearRealtime("nearRealtime"),
    Offline("offline"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RiskDetectionTimingType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RiskDetectionTimingType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notDefined": return NotDefined;
            case "realtime": return Realtime;
            case "nearRealtime": return NearRealtime;
            case "offline": return Offline;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
