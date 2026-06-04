package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PciVersion implements ValuedEnum {
    None("none"),
    V3_2_1("v3_2_1"),
    V4("v4"),
    NotSupported("notSupported"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PciVersion(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PciVersion forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "v3_2_1": return V3_2_1;
            case "v4": return V4;
            case "notSupported": return NotSupported;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
