package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EducationAddToCalendarOptions implements ValuedEnum {
    None("none"),
    StudentsAndPublisher("studentsAndPublisher"),
    StudentsAndTeamOwners("studentsAndTeamOwners"),
    UnknownFutureValue("unknownFutureValue"),
    StudentsOnly("studentsOnly");
    public final String value;
    EducationAddToCalendarOptions(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EducationAddToCalendarOptions forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "studentsAndPublisher": return StudentsAndPublisher;
            case "studentsAndTeamOwners": return StudentsAndTeamOwners;
            case "unknownFutureValue": return UnknownFutureValue;
            case "studentsOnly": return StudentsOnly;
            default: return null;
        }
    }
}
