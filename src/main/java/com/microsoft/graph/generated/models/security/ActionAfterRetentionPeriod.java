package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ActionAfterRetentionPeriod implements ValuedEnum {
    None("none"),
    Delete("delete"),
    StartDispositionReview("startDispositionReview"),
    Relabel("relabel"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ActionAfterRetentionPeriod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ActionAfterRetentionPeriod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "delete": return Delete;
            case "startDispositionReview": return StartDispositionReview;
            case "relabel": return Relabel;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
