package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum MicrosoftAuthenticatorAuthenticationMode implements ValuedEnum {
    DeviceBasedPush("deviceBasedPush"),
    Push("push"),
    Any("any");
    public final String value;
    MicrosoftAuthenticatorAuthenticationMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MicrosoftAuthenticatorAuthenticationMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceBasedPush": return DeviceBasedPush;
            case "push": return Push;
            case "any": return Any;
            default: return null;
        }
    }
}
