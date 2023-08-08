package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum WeakAlgorithms implements ValuedEnum {
    RsaSha1("rsaSha1"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WeakAlgorithms(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WeakAlgorithms forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "rsaSha1": return RsaSha1;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
