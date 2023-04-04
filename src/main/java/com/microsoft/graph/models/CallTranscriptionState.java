package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CallTranscriptionState implements ValuedEnum {
    NotStarted("notStarted"),
    Active("active"),
    Inactive("inactive"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CallTranscriptionState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CallTranscriptionState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notStarted": return NotStarted;
            case "active": return Active;
            case "inactive": return Inactive;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
