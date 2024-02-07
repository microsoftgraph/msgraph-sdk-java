package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ChannelMembershipType implements ValuedEnum {
    Standard("standard"),
    Private("private"),
    UnknownFutureValue("unknownFutureValue"),
    Shared("shared");
    public final String value;
    ChannelMembershipType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChannelMembershipType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "standard": return Standard;
            case "private": return Private;
            case "unknownFutureValue": return UnknownFutureValue;
            case "shared": return Shared;
            default: return null;
        }
    }
}
