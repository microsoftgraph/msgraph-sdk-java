package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Types of communityPrivacy.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CommunityPrivacy implements ValuedEnum {
    /** Any user from the tenant can join and participate in the community. */
    Public("public"),
    /** A community administrator must add tenant users to the community before they can participate. */
    Private("private"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CommunityPrivacy(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CommunityPrivacy forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "public": return Public;
            case "private": return Private;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
