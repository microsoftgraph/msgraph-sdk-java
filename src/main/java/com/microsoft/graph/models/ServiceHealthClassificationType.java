package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ServiceHealthClassificationType implements ValuedEnum {
    Advisory("advisory"),
    Incident("incident"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ServiceHealthClassificationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceHealthClassificationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "advisory": return Advisory;
            case "incident": return Incident;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
