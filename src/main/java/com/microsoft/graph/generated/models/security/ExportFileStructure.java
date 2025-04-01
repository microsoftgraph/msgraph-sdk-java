package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ExportFileStructure implements ValuedEnum {
    None("none"),
    Directory("directory"),
    Pst("pst"),
    UnknownFutureValue("unknownFutureValue"),
    Msg("msg");
    public final String value;
    ExportFileStructure(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ExportFileStructure forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "directory": return Directory;
            case "pst": return Pst;
            case "unknownFutureValue": return UnknownFutureValue;
            case "msg": return Msg;
            default: return null;
        }
    }
}
