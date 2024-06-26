package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccessPackageCatalogState implements ValuedEnum {
    Unpublished("unpublished"),
    Published("published"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessPackageCatalogState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessPackageCatalogState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unpublished": return Unpublished;
            case "published": return Published;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
