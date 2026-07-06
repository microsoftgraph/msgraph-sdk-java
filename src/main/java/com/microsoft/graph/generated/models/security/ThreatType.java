package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ThreatType implements ValuedEnum {
    Unknown("unknown"),
    Spam("spam"),
    Malware("malware"),
    Phish("phish"),
    None("none"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ThreatType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ThreatType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "spam": return Spam;
            case "malware": return Malware;
            case "phish": return Phish;
            case "none": return None;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
