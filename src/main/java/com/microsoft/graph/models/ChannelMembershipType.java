package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ChannelMembershipType implements ValuedEnum {
    Standard("standard"),
    PrivateEscaped("private"),
    UnknownFutureValue("unknownFutureValue"),
    Shared("shared");
    public final String value;
    ChannelMembershipType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ChannelMembershipType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "standard": return Standard;
            case "private": return PrivateEscaped;
            case "unknownFutureValue": return UnknownFutureValue;
            case "shared": return Shared;
            default: return null;
        }
    }
}
