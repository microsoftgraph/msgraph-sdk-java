package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InsiderRiskLevel implements ValuedEnum {
    None("none"),
    Minor("minor"),
    Moderate("moderate"),
    Elevated("elevated"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    InsiderRiskLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InsiderRiskLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "minor": return Minor;
            case "moderate": return Moderate;
            case "elevated": return Elevated;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
