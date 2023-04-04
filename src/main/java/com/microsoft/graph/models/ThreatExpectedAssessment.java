package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ThreatExpectedAssessment implements ValuedEnum {
    Block("block"),
    Unblock("unblock");
    public final String value;
    ThreatExpectedAssessment(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ThreatExpectedAssessment forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "block": return Block;
            case "unblock": return Unblock;
            default: return null;
        }
    }
}
