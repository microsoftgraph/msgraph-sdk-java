package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SensorCandidateActivationMode implements ValuedEnum {
    Manual("manual"),
    Automated("automated"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SensorCandidateActivationMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SensorCandidateActivationMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "manual": return Manual;
            case "automated": return Automated;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
