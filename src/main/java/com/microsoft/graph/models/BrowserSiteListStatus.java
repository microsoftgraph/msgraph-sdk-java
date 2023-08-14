package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum BrowserSiteListStatus implements ValuedEnum {
    /** A site list that has not yet been published */
    Draft("draft"),
    /** A site list that has been published with no pending changes. */
    Published("published"),
    /** A site that has pending changes */
    Pending("pending"),
    /** Placeholder for evolvable enum, but this enum is never returned to the caller, so it shoudn't be necessary. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BrowserSiteListStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BrowserSiteListStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "draft": return Draft;
            case "published": return Published;
            case "pending": return Pending;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
