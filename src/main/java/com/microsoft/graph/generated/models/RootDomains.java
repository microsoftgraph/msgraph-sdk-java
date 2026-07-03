package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RootDomains implements ValuedEnum {
    None("none"),
    All("all"),
    AllFederated("allFederated"),
    AllManaged("allManaged"),
    Enumerated("enumerated"),
    AllManagedAndEnumeratedFederated("allManagedAndEnumeratedFederated"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RootDomains(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RootDomains forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "all": return All;
            case "allFederated": return AllFederated;
            case "allManaged": return AllManaged;
            case "enumerated": return Enumerated;
            case "allManagedAndEnumeratedFederated": return AllManagedAndEnumeratedFederated;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
