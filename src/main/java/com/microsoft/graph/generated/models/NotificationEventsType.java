package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum NotificationEventsType implements ValuedEnum {
    None("none"),
    RestoreAndPolicyUpdates("restoreAndPolicyUpdates"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    NotificationEventsType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static NotificationEventsType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "restoreAndPolicyUpdates": return RestoreAndPolicyUpdates;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
