package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Allow the device to send diagnostic and usage telemetry data, such as Watson.
 */
public enum DiagnosticDataSubmissionMode implements ValuedEnum {
    /** Allow the user to set. */
    UserDefined("userDefined"),
    /** No telemetry data is sent from OS components. Note: This value is only applicable to enterprise and server devices. Using this setting on other devices is equivalent to setting the value of 1. */
    None("none"),
    /** Sends basic telemetry data. */
    Basic("basic"),
    /** Sends enhanced telemetry data including usage and insights data. */
    Enhanced("enhanced"),
    /** Sends full telemetry data including diagnostic data, such as system state. */
    Full("full");
    public final String value;
    DiagnosticDataSubmissionMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DiagnosticDataSubmissionMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "none": return None;
            case "basic": return Basic;
            case "enhanced": return Enhanced;
            case "full": return Full;
            default: return null;
        }
    }
}
