package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The {@link LifecycleEventType} enum for event status in the lifecycle.
 */
public enum LifecycleEventType implements ValuedEnum {
    Missed("missed"),
    SubscriptionRemoved("subscriptionRemoved"),
    ReauthorizationRequired("reauthorizationRequired");
    public final String value;
    LifecycleEventType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LifecycleEventType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "missed": return Missed;
            case "subscriptionRemoved": return SubscriptionRemoved;
            case "reauthorizationRequired": return ReauthorizationRequired;
            default: return null;
        }
    }
}
