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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ThreatExpectedAssessment forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "block": return Block;
            case "unblock": return Unblock;
            default: return null;
        }
    }
}
