package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ScopeCollectionKind implements ValuedEnum {
    AllAllowed("allAllowed"),
    Enumerated("enumerated"),
    None("none"),
    ScopeKindNotSet("scopeKindNotSet"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ScopeCollectionKind(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ScopeCollectionKind forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allAllowed": return AllAllowed;
            case "enumerated": return Enumerated;
            case "none": return None;
            case "scopeKindNotSet": return ScopeKindNotSet;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
