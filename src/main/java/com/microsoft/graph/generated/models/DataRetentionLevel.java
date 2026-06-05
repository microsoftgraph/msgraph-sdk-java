package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DataRetentionLevel implements ValuedEnum {
    None("none"),
    DataRetained("dataRetained"),
    DeletedImmediately("deletedImmediately"),
    DeletedWithin1Month("deletedWithin1Month"),
    DeletedWithin2Weeks("deletedWithin2Weeks"),
    DeletedWithin3Months("deletedWithin3Months"),
    DeletedWithinMoreThan3Months("deletedWithinMoreThan3Months"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DataRetentionLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DataRetentionLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "dataRetained": return DataRetained;
            case "deletedImmediately": return DeletedImmediately;
            case "deletedWithin1Month": return DeletedWithin1Month;
            case "deletedWithin2Weeks": return DeletedWithin2Weeks;
            case "deletedWithin3Months": return DeletedWithin3Months;
            case "deletedWithinMoreThan3Months": return DeletedWithinMoreThan3Months;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
