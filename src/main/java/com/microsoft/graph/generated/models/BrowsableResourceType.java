package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BrowsableResourceType implements ValuedEnum {
    None("none"),
    Site("site"),
    DocumentLibrary("documentLibrary"),
    Folder("folder"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BrowsableResourceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BrowsableResourceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "site": return Site;
            case "documentLibrary": return DocumentLibrary;
            case "folder": return Folder;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
