package com.microsoft.graph.models.teamsadministration;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ReverseNumberLookupOption implements ValuedEnum {
    SkipInternalVoip("skipInternalVoip"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ReverseNumberLookupOption(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ReverseNumberLookupOption forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "skipInternalVoip": return SkipInternalVoip;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
