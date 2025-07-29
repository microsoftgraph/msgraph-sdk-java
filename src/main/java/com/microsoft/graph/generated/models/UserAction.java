package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserAction implements ValuedEnum {
    RegisterSecurityInformation("registerSecurityInformation"),
    RegisterOrJoinDevices("registerOrJoinDevices"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "registerSecurityInformation": return RegisterSecurityInformation;
            case "registerOrJoinDevices": return RegisterOrJoinDevices;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
