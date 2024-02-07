package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SocialIdentitySourceType implements ValuedEnum {
    Facebook("facebook"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SocialIdentitySourceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SocialIdentitySourceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "facebook": return Facebook;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
