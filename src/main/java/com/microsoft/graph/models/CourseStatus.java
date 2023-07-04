package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CourseStatus implements ValuedEnum {
    NotStarted("notStarted"),
    InProgress("inProgress"),
    Completed("completed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CourseStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CourseStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notStarted": return NotStarted;
            case "inProgress": return InProgress;
            case "completed": return Completed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
