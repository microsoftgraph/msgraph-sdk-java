package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MediaStreamDirection implements ValuedEnum {
    CallerToCallee("callerToCallee"),
    CalleeToCaller("calleeToCaller");
    public final String value;
    MediaStreamDirection(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MediaStreamDirection forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "callerToCallee": return CallerToCallee;
            case "calleeToCaller": return CalleeToCaller;
            default: return null;
        }
    }
}
