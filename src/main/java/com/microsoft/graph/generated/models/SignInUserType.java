package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SignInUserType implements ValuedEnum {
    Member("member"),
    Guest("guest"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SignInUserType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SignInUserType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "member": return Member;
            case "guest": return Guest;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
