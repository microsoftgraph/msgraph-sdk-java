package com.microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AclType implements ValuedEnum {
    User("user"),
    Group("group"),
    Everyone("everyone"),
    EveryoneExceptGuests("everyoneExceptGuests"),
    ExternalGroup("externalGroup"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AclType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AclType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "group": return Group;
            case "everyone": return Everyone;
            case "everyoneExceptGuests": return EveryoneExceptGuests;
            case "externalGroup": return ExternalGroup;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
