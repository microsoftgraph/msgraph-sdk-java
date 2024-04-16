package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EducationAssignmentStatus implements ValuedEnum {
    Draft("draft"),
    Published("published"),
    Assigned("assigned"),
    UnknownFutureValue("unknownFutureValue"),
    Inactive("inactive");
    public final String value;
    EducationAssignmentStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EducationAssignmentStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "draft": return Draft;
            case "published": return Published;
            case "assigned": return Assigned;
            case "unknownFutureValue": return UnknownFutureValue;
            case "inactive": return Inactive;
            default: return null;
        }
    }
}
