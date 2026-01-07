package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WorkLocationSource implements ValuedEnum {
    None("none"),
    Manual("manual"),
    Scheduled("scheduled"),
    Automatic("automatic"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WorkLocationSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WorkLocationSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "manual": return Manual;
            case "scheduled": return Scheduled;
            case "automatic": return Automatic;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
