package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TeamVisibilityType implements ValuedEnum {
    Private("private"),
    Public("public"),
    HiddenMembership("hiddenMembership"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamVisibilityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TeamVisibilityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "private": return Private;
            case "public": return Public;
            case "hiddenMembership": return HiddenMembership;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
