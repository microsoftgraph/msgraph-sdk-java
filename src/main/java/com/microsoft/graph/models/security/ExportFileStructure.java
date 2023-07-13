package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ExportFileStructure implements ValuedEnum {
    None("none"),
    Directory("directory"),
    Pst("pst"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ExportFileStructure(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ExportFileStructure forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "directory": return Directory;
            case "pst": return Pst;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
