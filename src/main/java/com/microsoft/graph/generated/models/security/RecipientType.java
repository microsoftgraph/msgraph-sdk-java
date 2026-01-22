package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RecipientType implements ValuedEnum {
    User("user"),
    RoleGroup("roleGroup"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RecipientType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RecipientType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "roleGroup": return RoleGroup;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
