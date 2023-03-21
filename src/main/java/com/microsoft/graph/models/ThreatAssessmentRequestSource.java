package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ThreatAssessmentRequestSource implements ValuedEnum {
    Undefined("undefined"),
    User("user"),
    Administrator("administrator");
    public final String value;
    ThreatAssessmentRequestSource(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ThreatAssessmentRequestSource forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "undefined": return Undefined;
            case "user": return User;
            case "administrator": return Administrator;
            default: return null;
        }
    }
}
