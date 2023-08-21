package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BrowserSharedCookieStatus implements ValuedEnum {
    /** A sharedcookie that has been published */
    Published("published"),
    /** A sharedcookie that has been added pending publish */
    PendingAdd("pendingAdd"),
    /** A sharedcookie that has been edited pending publish */
    PendingEdit("pendingEdit"),
    /** A sharedcookie that has been deleted pending publish */
    PendingDelete("pendingDelete"),
    /** Placeholder for evolvable enum, but this enum is never returned to the caller, so it shouldn't be necessary. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BrowserSharedCookieStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BrowserSharedCookieStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "published": return Published;
            case "pendingAdd": return PendingAdd;
            case "pendingEdit": return PendingEdit;
            case "pendingDelete": return PendingDelete;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
