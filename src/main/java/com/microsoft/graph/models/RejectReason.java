package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum RejectReason implements ValuedEnum {
    None("none"),
    Busy("busy"),
    Forbidden("forbidden"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RejectReason(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RejectReason forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "busy": return Busy;
            case "forbidden": return Forbidden;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
