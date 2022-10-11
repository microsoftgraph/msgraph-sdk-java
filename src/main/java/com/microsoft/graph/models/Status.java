package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
public enum Status implements ValuedEnum {
    Active("active"),
    Updated("updated"),
    Deleted("deleted"),
    Ignored("ignored"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    Status(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Status forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "updated": return Updated;
            case "deleted": return Deleted;
            case "ignored": return Ignored;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
