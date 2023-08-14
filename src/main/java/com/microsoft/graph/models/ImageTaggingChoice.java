package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ImageTaggingChoice implements ValuedEnum {
    Disabled("disabled"),
    Basic("basic"),
    Enhanced("enhanced"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ImageTaggingChoice(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ImageTaggingChoice forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "disabled": return Disabled;
            case "basic": return Basic;
            case "enhanced": return Enhanced;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
