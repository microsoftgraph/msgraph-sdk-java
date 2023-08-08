package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum MeetingChatHistoryDefaultMode implements ValuedEnum {
    None("none"),
    All("all"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MeetingChatHistoryDefaultMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MeetingChatHistoryDefaultMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "all": return All;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
