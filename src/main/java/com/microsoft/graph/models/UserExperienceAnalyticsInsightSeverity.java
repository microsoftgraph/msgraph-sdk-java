package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates severity of insights. Possible values are: None, Informational, Warning, Error.
 */
public enum UserExperienceAnalyticsInsightSeverity implements ValuedEnum {
    /** Indicates that the insight severity is none. */
    None("none"),
    /** Indicates that the insight severity is informational. */
    Informational("informational"),
    /** Indicates that the insight severity is warning. */
    Warning("warning"),
    /** Indicates that the insight severity is error. */
    Error("error"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserExperienceAnalyticsInsightSeverity(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static UserExperienceAnalyticsInsightSeverity forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "informational": return Informational;
            case "warning": return Warning;
            case "error": return Error;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
