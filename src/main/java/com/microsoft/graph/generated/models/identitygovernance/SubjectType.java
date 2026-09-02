package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SubjectType implements ValuedEnum {
    User("user"),
    UnknownFutureValue("unknownFutureValue"),
    ProvisioningObject("provisioningObject");
    public final String value;
    SubjectType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SubjectType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "unknownFutureValue": return UnknownFutureValue;
            case "provisioningObject": return ProvisioningObject;
            default: return null;
        }
    }
}
