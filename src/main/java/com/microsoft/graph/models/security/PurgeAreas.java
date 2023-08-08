package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PurgeAreas implements ValuedEnum {
    Mailboxes("mailboxes"),
    TeamsMessages("teamsMessages"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PurgeAreas(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PurgeAreas forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "mailboxes": return Mailboxes;
            case "teamsMessages": return TeamsMessages;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
