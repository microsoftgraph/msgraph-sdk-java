package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ThreatAssessmentResultType implements ValuedEnum {
    CheckPolicy("checkPolicy"),
    Rescan("rescan"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ThreatAssessmentResultType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ThreatAssessmentResultType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "checkPolicy": return CheckPolicy;
            case "rescan": return Rescan;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
