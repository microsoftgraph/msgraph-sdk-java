package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum FollowupFlagStatus implements ValuedEnum {
    NotFlagged("notFlagged"),
    Complete("complete"),
    Flagged("flagged");
    public final String value;
    FollowupFlagStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static FollowupFlagStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notFlagged": return NotFlagged;
            case "complete": return Complete;
            case "flagged": return Flagged;
            default: return null;
        }
    }
}
