package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the publishing state of an app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MobileAppPublishingState implements ValuedEnum {
    /** The app is not yet published. */
    NotPublished("notPublished"),
    /** The app is pending service-side processing. */
    Processing("processing"),
    /** The app is published. */
    Published("published");
    public final String value;
    MobileAppPublishingState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MobileAppPublishingState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notPublished": return NotPublished;
            case "processing": return Processing;
            case "published": return Published;
            default: return null;
        }
    }
}
