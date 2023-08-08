package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ActivityType implements ValuedEnum {
    Signin("signin"),
    User("user"),
    UnknownFutureValue("unknownFutureValue"),
    ServicePrincipal("servicePrincipal");
    public final String value;
    ActivityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ActivityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "signin": return Signin;
            case "user": return User;
            case "unknownFutureValue": return UnknownFutureValue;
            case "servicePrincipal": return ServicePrincipal;
            default: return null;
        }
    }
}
