package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ExportFormat implements ValuedEnum {
    Pst("pst"),
    Msg("msg"),
    Eml("eml"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ExportFormat(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ExportFormat forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pst": return Pst;
            case "msg": return Msg;
            case "eml": return Eml;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
