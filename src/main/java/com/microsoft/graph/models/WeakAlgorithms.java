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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WeakAlgorithms forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "rsaSha1": return RsaSha1;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
