package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RoleType implements ValuedEnum {
    Active("active"),
    Eligible("eligible"),
    Application("application"),
    Delegated("delegated"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RoleType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RoleType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "eligible": return Eligible;
            case "application": return Application;
            case "delegated": return Delegated;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
