package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible states associated with an Apple Volume Purchase Program token.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VppTokenState implements ValuedEnum {
    /** Default state. */
    Unknown("unknown"),
    /** Token is valid. */
    Valid("valid"),
    /** Token is expired. */
    Expired("expired"),
    /** Token is invalid. */
    Invalid("invalid"),
    /** Token is managed by another MDM Service. */
    AssignedToExternalMDM("assignedToExternalMDM");
    public final String value;
    VppTokenState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VppTokenState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "valid": return Valid;
            case "expired": return Expired;
            case "invalid": return Invalid;
            case "assignedToExternalMDM": return AssignedToExternalMDM;
            default: return null;
        }
    }
}
