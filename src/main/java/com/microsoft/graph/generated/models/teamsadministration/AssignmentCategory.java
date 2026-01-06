package com.microsoft.graph.models.teamsadministration;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AssignmentCategory implements ValuedEnum {
    Primary("primary"),
    Private("private"),
    Alternate("alternate"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AssignmentCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AssignmentCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "primary": return Primary;
            case "private": return Private;
            case "alternate": return Alternate;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
