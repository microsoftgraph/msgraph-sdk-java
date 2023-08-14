package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum OnenoteUserRole implements ValuedEnum {
    None("None"),
    Owner("Owner"),
    Contributor("Contributor"),
    Reader("Reader");
    public final String value;
    OnenoteUserRole(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OnenoteUserRole forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "None": return None;
            case "Owner": return Owner;
            case "Contributor": return Contributor;
            case "Reader": return Reader;
            default: return null;
        }
    }
}
