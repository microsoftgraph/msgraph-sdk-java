package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ScheduleChangeRequestActor implements ValuedEnum {
    Sender("sender"),
    Recipient("recipient"),
    Manager("manager"),
    System("system"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ScheduleChangeRequestActor(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ScheduleChangeRequestActor forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sender": return Sender;
            case "recipient": return Recipient;
            case "manager": return Manager;
            case "system": return System;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
