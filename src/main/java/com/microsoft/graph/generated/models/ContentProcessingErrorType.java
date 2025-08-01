package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ContentProcessingErrorType implements ValuedEnum {
    Transient("transient"),
    Permanent("permanent"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ContentProcessingErrorType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ContentProcessingErrorType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "transient": return Transient;
            case "permanent": return Permanent;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
