package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PolicyPivotProperty implements ValuedEnum {
    None("none"),
    Activity("activity"),
    Location("location"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PolicyPivotProperty(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PolicyPivotProperty forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "activity": return Activity;
            case "location": return Location;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
