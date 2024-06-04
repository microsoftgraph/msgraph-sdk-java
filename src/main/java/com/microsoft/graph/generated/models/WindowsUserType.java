package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsUserType implements ValuedEnum {
    /** Indicates that the user has administrator privileges. */
    Administrator("administrator"),
    /** Indicates that the user is a low-rights user without administrator privileges. */
    Standard("standard"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WindowsUserType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsUserType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "administrator": return Administrator;
            case "standard": return Standard;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
