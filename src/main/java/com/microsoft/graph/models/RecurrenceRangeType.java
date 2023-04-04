package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum RecurrenceRangeType implements ValuedEnum {
    EndDate("endDate"),
    NoEnd("noEnd"),
    Numbered("numbered");
    public final String value;
    RecurrenceRangeType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RecurrenceRangeType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "endDate": return EndDate;
            case "noEnd": return NoEnd;
            case "numbered": return Numbered;
            default: return null;
        }
    }
}
