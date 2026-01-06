package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcUserAccountType implements ValuedEnum {
    StandardUser("standardUser"),
    Administrator("administrator"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcUserAccountType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcUserAccountType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "standardUser": return StandardUser;
            case "administrator": return Administrator;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
