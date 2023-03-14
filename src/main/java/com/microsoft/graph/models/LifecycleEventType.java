package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum LifecycleEventType implements ValuedEnum {
    Missed("missed"),
    SubscriptionRemoved("subscriptionRemoved"),
    ReauthorizationRequired("reauthorizationRequired");
    public final String value;
    LifecycleEventType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static LifecycleEventType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "missed": return Missed;
            case "subscriptionRemoved": return SubscriptionRemoved;
            case "reauthorizationRequired": return ReauthorizationRequired;
            default: return null;
        }
    }
}
