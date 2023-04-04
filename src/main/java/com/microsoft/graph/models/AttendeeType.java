package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AttendeeType implements ValuedEnum {
    Required("required"),
    Optional("optional"),
    Resource("resource");
    public final String value;
    AttendeeType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AttendeeType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "required": return Required;
            case "optional": return Optional;
            case "resource": return Resource;
            default: return null;
        }
    }
}
