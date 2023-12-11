package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserPurpose implements ValuedEnum {
    User("user"),
    Linked("linked"),
    Shared("shared"),
    Room("room"),
    Equipment("equipment"),
    Others("others"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserPurpose(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserPurpose forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "linked": return Linked;
            case "shared": return Shared;
            case "room": return Room;
            case "equipment": return Equipment;
            case "others": return Others;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
