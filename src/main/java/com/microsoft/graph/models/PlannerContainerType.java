package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PlannerContainerType implements ValuedEnum {
    Group("group"),
    UnknownFutureValue("unknownFutureValue"),
    Roster("roster");
    public final String value;
    PlannerContainerType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PlannerContainerType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "group": return Group;
            case "unknownFutureValue": return UnknownFutureValue;
            case "roster": return Roster;
            default: return null;
        }
    }
}
