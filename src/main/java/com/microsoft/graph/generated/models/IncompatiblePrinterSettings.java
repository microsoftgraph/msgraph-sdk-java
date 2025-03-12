package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IncompatiblePrinterSettings implements ValuedEnum {
    Show("show"),
    Hide("hide"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IncompatiblePrinterSettings(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IncompatiblePrinterSettings forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "show": return Show;
            case "hide": return Hide;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
