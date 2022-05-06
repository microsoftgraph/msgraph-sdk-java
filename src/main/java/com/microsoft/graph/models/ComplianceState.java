package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum ComplianceState implements ValuedEnum {
    Unknown("unknown"),
    Compliant("compliant"),
    Noncompliant("noncompliant"),
    Conflict("conflict"),
    Error("error"),
    InGracePeriod("inGracePeriod"),
    ConfigManager("configManager");
    public final String value;
    ComplianceState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ComplianceState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "compliant": return Compliant;
            case "noncompliant": return Noncompliant;
            case "conflict": return Conflict;
            case "error": return Error;
            case "inGracePeriod": return InGracePeriod;
            case "configManager": return ConfigManager;
            default: return null;
        }
    }
}
