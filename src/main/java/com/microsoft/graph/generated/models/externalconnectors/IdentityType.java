package com.microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IdentityType implements ValuedEnum {
    User("user"),
    Group("group"),
    ExternalGroup("externalGroup"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IdentityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IdentityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "group": return Group;
            case "externalGroup": return ExternalGroup;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
