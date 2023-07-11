package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum IncludedUserRoles implements ValuedEnum {
    All("all"),
    PrivilegedAdmin("privilegedAdmin"),
    Admin("admin"),
    User("user"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IncludedUserRoles(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static IncludedUserRoles forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "all": return All;
            case "privilegedAdmin": return PrivilegedAdmin;
            case "admin": return Admin;
            case "user": return User;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
