package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BrowseQueryResponseItemType implements ValuedEnum {
    None("none"),
    Site("site"),
    DocumentLibrary("documentLibrary"),
    Folder("folder"),
    File("file"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BrowseQueryResponseItemType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BrowseQueryResponseItemType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "site": return Site;
            case "documentLibrary": return DocumentLibrary;
            case "folder": return Folder;
            case "file": return File;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
