package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Compliance state.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ComplianceState implements ValuedEnum {
    /** Unknown. */
    Unknown("unknown"),
    /** Compliant. */
    Compliant("compliant"),
    /** Device is non-compliant and is blocked from corporate resources. */
    Noncompliant("noncompliant"),
    /** Conflict with other rules. */
    Conflict("conflict"),
    /** Error. */
    Error("error"),
    /** Device is non-compliant but still has access to corporate resources */
    InGracePeriod("inGracePeriod"),
    /** Managed by Config Manager */
    ConfigManager("configManager");
    public final String value;
    ComplianceState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ComplianceState forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
