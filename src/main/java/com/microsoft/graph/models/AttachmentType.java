package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AttachmentType implements ValuedEnum {
    File("file"),
    Item("item"),
    Reference("reference");
    public final String value;
    AttachmentType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AttachmentType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "file": return File;
            case "item": return Item;
            case "reference": return Reference;
            default: return null;
        }
    }
}
