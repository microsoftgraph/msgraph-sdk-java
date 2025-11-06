package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Represents the moderation state of an Engage conversation message.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EngagementConversationModerationState implements ValuedEnum {
    /** The content is published. */
    Published("published"),
    /** The content is pending review by a moderator. */
    PendingReview("pendingReview"),
    /** he content has been rejected by a moderator. */
    Dismissed("dismissed"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EngagementConversationModerationState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EngagementConversationModerationState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "published": return Published;
            case "pendingReview": return PendingReview;
            case "dismissed": return Dismissed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
