package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FollowupFlagStatus implements ValuedEnum {
    NotFlagged("notFlagged"),
    Complete("complete"),
    Flagged("flagged");
    public final String value;
    FollowupFlagStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FollowupFlagStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notFlagged": return NotFlagged;
            case "complete": return Complete;
            case "flagged": return Flagged;
            default: return null;
        }
    }
}
