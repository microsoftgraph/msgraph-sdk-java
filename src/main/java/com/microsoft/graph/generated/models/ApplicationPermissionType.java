package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ApplicationPermissionType implements ValuedEnum {
    /** Represents a type of permission that is for an app only scenario. No user is involved. */
    Role("role"),
    /** Represents a type of permission that is for an app and user scenario. */
    Scope("scope"),
    /** This will help in making this enum evolable and adding more values in the future- */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ApplicationPermissionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ApplicationPermissionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "role": return Role;
            case "scope": return Scope;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
