package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SharePointMigrationObjectType implements ValuedEnum {
    Site("site"),
    Web("web"),
    Folder("folder"),
    List("list"),
    ListItem("listItem"),
    File("file"),
    Alert("alert"),
    SharedWithObject("sharedWithObject"),
    Invalid("invalid"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SharePointMigrationObjectType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SharePointMigrationObjectType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "site": return Site;
            case "web": return Web;
            case "folder": return Folder;
            case "list": return List;
            case "listItem": return ListItem;
            case "file": return File;
            case "alert": return Alert;
            case "sharedWithObject": return SharedWithObject;
            case "invalid": return Invalid;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
