package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ActivationUserScopeType implements ValuedEnum {
    AllUsers("allUsers"),
    FailedUsers("failedUsers"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ActivationUserScopeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ActivationUserScopeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allUsers": return AllUsers;
            case "failedUsers": return FailedUsers;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
