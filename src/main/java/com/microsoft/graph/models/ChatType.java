package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ChatType implements ValuedEnum {
    OneOnOne("oneOnOne"),
    Group("group"),
    Meeting("meeting"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ChatType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ChatType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "oneOnOne": return OneOnOne;
            case "group": return Group;
            case "meeting": return Meeting;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
