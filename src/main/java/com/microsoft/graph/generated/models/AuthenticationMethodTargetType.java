package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AuthenticationMethodTargetType implements ValuedEnum {
    User("user"),
    Group("group"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuthenticationMethodTargetType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuthenticationMethodTargetType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "group": return Group;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
