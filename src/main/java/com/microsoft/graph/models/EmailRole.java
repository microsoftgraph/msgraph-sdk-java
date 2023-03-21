package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum EmailRole implements ValuedEnum {
    Unknown("unknown"),
    Sender("sender"),
    Recipient("recipient"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EmailRole(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EmailRole forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "sender": return Sender;
            case "recipient": return Recipient;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
