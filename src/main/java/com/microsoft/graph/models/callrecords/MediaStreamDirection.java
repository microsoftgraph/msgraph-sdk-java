package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum MediaStreamDirection implements ValuedEnum {
    CallerToCallee("callerToCallee"),
    CalleeToCaller("calleeToCaller");
    public final String value;
    MediaStreamDirection(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MediaStreamDirection forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "callerToCallee": return CallerToCallee;
            case "calleeToCaller": return CalleeToCaller;
            default: return null;
        }
    }
}
