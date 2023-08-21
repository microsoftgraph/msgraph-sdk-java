package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible types of an Apple Volume Purchase Program token.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VppTokenAccountType implements ValuedEnum {
    /** Apple Volume Purchase Program token associated with an business program. */
    Business("business"),
    /** Apple Volume Purchase Program token associated with an education program. */
    Education("education");
    public final String value;
    VppTokenAccountType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VppTokenAccountType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "business": return Business;
            case "education": return Education;
            default: return null;
        }
    }
}
