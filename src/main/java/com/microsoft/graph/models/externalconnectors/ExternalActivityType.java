package com.microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ExternalActivityType implements ValuedEnum {
    Viewed("viewed"),
    Modified("modified"),
    Created("created"),
    Commented("commented"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ExternalActivityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ExternalActivityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "viewed": return Viewed;
            case "modified": return Modified;
            case "created": return Created;
            case "commented": return Commented;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
