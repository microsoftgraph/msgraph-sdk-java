package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CrossTenantAccessPolicyTargetType implements ValuedEnum {
    User("user"),
    Group("group"),
    Application("application"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CrossTenantAccessPolicyTargetType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CrossTenantAccessPolicyTargetType forValue(@javax.annotation.Nonnull final String searchValue) {
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
