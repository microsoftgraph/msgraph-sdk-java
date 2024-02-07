package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values to specify which cookies are allowed in Microsoft Edge.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EdgeCookiePolicy implements ValuedEnum {
    /** Allow the user to set. */
    UserDefined("userDefined"),
    /** Allow. */
    Allow("allow"),
    /** Block only third party cookies. */
    BlockThirdParty("blockThirdParty"),
    /** Block all cookies. */
    BlockAll("blockAll");
    public final String value;
    EdgeCookiePolicy(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EdgeCookiePolicy forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "allow": return Allow;
            case "blockThirdParty": return BlockThirdParty;
            case "blockAll": return BlockAll;
            default: return null;
        }
    }
}
