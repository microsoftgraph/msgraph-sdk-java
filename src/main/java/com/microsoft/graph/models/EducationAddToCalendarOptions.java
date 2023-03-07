package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EducationAddToCalendarOptions forValue(@javax.annotation.Nonnull final String searchValue) {
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
