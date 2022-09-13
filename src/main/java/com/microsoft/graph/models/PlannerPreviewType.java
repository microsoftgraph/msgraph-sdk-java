package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreementAcceptance entities. */
public enum PlannerPreviewType implements ValuedEnum {
    Automatic("automatic"),
    NoPreview("noPreview"),
    Checklist("checklist"),
    Description("description"),
    Reference("reference");
    public final String value;
    PlannerPreviewType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PlannerPreviewType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "automatic": return Automatic;
            case "noPreview": return NoPreview;
            case "checklist": return Checklist;
            case "description": return Description;
            case "reference": return Reference;
            default: return null;
        }
    }
}
