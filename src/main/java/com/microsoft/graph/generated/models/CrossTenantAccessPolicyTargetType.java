package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CrossTenantAccessPolicyTargetType implements ValuedEnum {
    User("user"),
    Group("group"),
    Application("application"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CrossTenantAccessPolicyTargetType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CrossTenantAccessPolicyTargetType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "group": return Group;
            case "application": return Application;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
