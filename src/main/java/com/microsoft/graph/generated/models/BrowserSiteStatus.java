package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BrowserSiteStatus implements ValuedEnum {
    /** A site that has been published */
    Published("published"),
    /** A site that has been added pending publish */
    PendingAdd("pendingAdd"),
    /** A site that has been edited pending publish */
    PendingEdit("pendingEdit"),
    /** A site that has been deleted pending publish */
    PendingDelete("pendingDelete"),
    /** Placeholder for evolvable enum, but this enum is never returned to the caller, so it shouldn't be necessary. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BrowserSiteStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BrowserSiteStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
