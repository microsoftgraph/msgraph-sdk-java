package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AssignmentType implements ValuedEnum {
    Required("required"),
    Recommended("recommended"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AssignmentType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AssignmentType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "required": return Required;
            case "recommended": return Recommended;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
