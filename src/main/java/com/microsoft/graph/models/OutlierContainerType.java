package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum OutlierContainerType implements ValuedEnum {
    Group("group"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OutlierContainerType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OutlierContainerType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "group": return Group;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
