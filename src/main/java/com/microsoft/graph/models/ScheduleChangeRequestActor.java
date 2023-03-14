package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ScheduleChangeRequestActor forValue(@javax.annotation.Nonnull final String searchValue) {
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
