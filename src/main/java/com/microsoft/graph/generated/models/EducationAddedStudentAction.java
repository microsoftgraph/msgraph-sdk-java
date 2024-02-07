package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EducationAddedStudentAction implements ValuedEnum {
    None("none"),
    AssignIfOpen("assignIfOpen"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EducationAddedStudentAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EducationAddedStudentAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "assignIfOpen": return AssignIfOpen;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
