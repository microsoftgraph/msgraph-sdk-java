package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ExpirationPatternType implements ValuedEnum {
    NotSpecified("notSpecified"),
    NoExpiration("noExpiration"),
    AfterDateTime("afterDateTime"),
    AfterDuration("afterDuration");
    public final String value;
    ExpirationPatternType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ExpirationPatternType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notSpecified": return NotSpecified;
            case "noExpiration": return NoExpiration;
            case "afterDateTime": return AfterDateTime;
            case "afterDuration": return AfterDuration;
            default: return null;
        }
    }
}
