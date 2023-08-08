package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SourceType implements ValuedEnum {
    Mailbox("mailbox"),
    Site("site"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SourceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SourceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "mailbox": return Mailbox;
            case "site": return Site;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
