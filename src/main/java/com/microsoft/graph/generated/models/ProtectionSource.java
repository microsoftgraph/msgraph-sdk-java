package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ProtectionSource implements ValuedEnum {
    None("none"),
    Manual("manual"),
    DynamicRule("dynamicRule"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ProtectionSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ProtectionSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "manual": return Manual;
            case "dynamicRule": return DynamicRule;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
