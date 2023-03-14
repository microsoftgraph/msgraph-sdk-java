package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum FeatureTargetType implements ValuedEnum {
    Group("group"),
    AdministrativeUnit("administrativeUnit"),
    Role("role"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    FeatureTargetType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static FeatureTargetType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "group": return Group;
            case "administrativeUnit": return AdministrativeUnit;
            case "role": return Role;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
