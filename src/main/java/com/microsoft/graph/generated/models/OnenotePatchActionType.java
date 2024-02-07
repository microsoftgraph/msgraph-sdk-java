package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OnenotePatchActionType implements ValuedEnum {
    Replace("Replace"),
    Append("Append"),
    Delete("Delete"),
    Insert("Insert"),
    Prepend("Prepend");
    public final String value;
    OnenotePatchActionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OnenotePatchActionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Replace": return Replace;
            case "Append": return Append;
            case "Delete": return Delete;
            case "Insert": return Insert;
            case "Prepend": return Prepend;
            default: return null;
        }
    }
}
