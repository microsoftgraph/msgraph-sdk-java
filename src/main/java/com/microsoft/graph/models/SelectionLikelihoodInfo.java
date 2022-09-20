package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreementAcceptance entities. */
public enum SelectionLikelihoodInfo implements ValuedEnum {
    NotSpecified("notSpecified"),
    High("high");
    public final String value;
    SelectionLikelihoodInfo(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SelectionLikelihoodInfo forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notSpecified": return NotSpecified;
            case "high": return High;
            default: return null;
        }
    }
}
