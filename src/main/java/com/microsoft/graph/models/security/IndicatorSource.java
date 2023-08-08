package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum IndicatorSource implements ValuedEnum {
    Microsoft("microsoft"),
    Osint("osint"),
    Public("public"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IndicatorSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IndicatorSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "microsoft": return Microsoft;
            case "osint": return Osint;
            case "public": return Public;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
