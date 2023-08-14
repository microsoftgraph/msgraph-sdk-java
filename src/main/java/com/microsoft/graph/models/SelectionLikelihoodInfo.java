package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SelectionLikelihoodInfo implements ValuedEnum {
    NotSpecified("notSpecified"),
    High("high");
    public final String value;
    SelectionLikelihoodInfo(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SelectionLikelihoodInfo forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notSpecified": return NotSpecified;
            case "high": return High;
            default: return null;
        }
    }
}
