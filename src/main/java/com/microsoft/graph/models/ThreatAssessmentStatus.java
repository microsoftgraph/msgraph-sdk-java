package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ThreatAssessmentStatus implements ValuedEnum {
    Pending("pending"),
    Completed("completed");
    public final String value;
    ThreatAssessmentStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ThreatAssessmentStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "completed": return Completed;
            default: return null;
        }
    }
}
