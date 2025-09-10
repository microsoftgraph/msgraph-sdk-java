package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CaseType implements ValuedEnum {
    Standard("standard"),
    Premium("premium"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CaseType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CaseType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "standard": return Standard;
            case "premium": return Premium;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
