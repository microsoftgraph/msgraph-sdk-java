package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ActivityDomain implements ValuedEnum {
    Unknown("unknown"),
    Work("work"),
    Personal("personal"),
    Unrestricted("unrestricted");
    public final String value;
    ActivityDomain(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ActivityDomain forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "work": return Work;
            case "personal": return Personal;
            case "unrestricted": return Unrestricted;
            default: return null;
        }
    }
}
