package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum MediaDirection implements ValuedEnum {
    Inactive("inactive"),
    SendOnly("sendOnly"),
    ReceiveOnly("receiveOnly"),
    SendReceive("sendReceive");
    public final String value;
    MediaDirection(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MediaDirection forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "inactive": return Inactive;
            case "sendOnly": return SendOnly;
            case "receiveOnly": return ReceiveOnly;
            case "sendReceive": return SendReceive;
            default: return null;
        }
    }
}
