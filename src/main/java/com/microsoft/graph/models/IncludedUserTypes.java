package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum IncludedUserTypes implements ValuedEnum {
    All("all"),
    Member("member"),
    Guest("guest"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IncludedUserTypes(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static IncludedUserTypes forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "all": return All;
            case "member": return Member;
            case "guest": return Guest;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
