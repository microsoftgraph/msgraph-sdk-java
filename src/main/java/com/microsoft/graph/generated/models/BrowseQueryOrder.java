package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BrowseQueryOrder implements ValuedEnum {
    PathAsc("pathAsc"),
    PathDsc("pathDsc"),
    NameAsc("nameAsc"),
    NameDsc("nameDsc"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BrowseQueryOrder(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BrowseQueryOrder forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pathAsc": return PathAsc;
            case "pathDsc": return PathDsc;
            case "nameAsc": return NameAsc;
            case "nameDsc": return NameDsc;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
