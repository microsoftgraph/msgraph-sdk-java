package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
public enum RecurrencePatternType implements ValuedEnum {
    Daily("daily"),
    Weekly("weekly"),
    AbsoluteMonthly("absoluteMonthly"),
    RelativeMonthly("relativeMonthly"),
    AbsoluteYearly("absoluteYearly"),
    RelativeYearly("relativeYearly");
    public final String value;
    RecurrencePatternType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RecurrencePatternType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "daily": return Daily;
            case "weekly": return Weekly;
            case "absoluteMonthly": return AbsoluteMonthly;
            case "relativeMonthly": return RelativeMonthly;
            case "absoluteYearly": return AbsoluteYearly;
            case "relativeYearly": return RelativeYearly;
            default: return null;
        }
    }
}
