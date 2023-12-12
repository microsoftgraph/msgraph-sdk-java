package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ScreenSharingRole implements ValuedEnum {
    Viewer("viewer"),
    Sharer("sharer");
    public final String value;
    ScreenSharingRole(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ScreenSharingRole forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "viewer": return Viewer;
            case "sharer": return Sharer;
            default: return null;
        }
    }
}
