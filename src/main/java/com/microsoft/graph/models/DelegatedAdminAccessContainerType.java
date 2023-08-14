package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum DelegatedAdminAccessContainerType implements ValuedEnum {
    SecurityGroup("securityGroup"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DelegatedAdminAccessContainerType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DelegatedAdminAccessContainerType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "securityGroup": return SecurityGroup;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
