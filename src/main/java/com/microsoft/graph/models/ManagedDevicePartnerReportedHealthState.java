package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum ManagedDevicePartnerReportedHealthState implements ValuedEnum {
    Unknown("unknown"),
    Activated("activated"),
    Deactivated("deactivated"),
    Secured("secured"),
    LowSeverity("lowSeverity"),
    MediumSeverity("mediumSeverity"),
    HighSeverity("highSeverity"),
    Unresponsive("unresponsive"),
    Compromised("compromised"),
    Misconfigured("misconfigured");
    public final String value;
    ManagedDevicePartnerReportedHealthState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ManagedDevicePartnerReportedHealthState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "activated": return Activated;
            case "deactivated": return Deactivated;
            case "secured": return Secured;
            case "lowSeverity": return LowSeverity;
            case "mediumSeverity": return MediumSeverity;
            case "highSeverity": return HighSeverity;
            case "unresponsive": return Unresponsive;
            case "compromised": return Compromised;
            case "misconfigured": return Misconfigured;
            default: return null;
        }
    }
}
