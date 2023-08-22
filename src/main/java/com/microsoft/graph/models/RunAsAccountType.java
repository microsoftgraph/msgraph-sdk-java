package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the type of execution context the app runs in.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RunAsAccountType implements ValuedEnum {
    /** System context */
    System("system"),
    /** User context */
    User("user");
    public final String value;
    RunAsAccountType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RunAsAccountType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "system": return System;
            case "user": return User;
            default: return null;
        }
    }
}
