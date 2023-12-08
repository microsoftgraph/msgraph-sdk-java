package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Mobile device management authority.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MdmAuthority implements ValuedEnum {
    /** Unknown */
    Unknown("unknown"),
    /** Intune */
    Intune("intune"),
    /** SCCM */
    Sccm("sccm"),
    /** Office365 */
    Office365("office365");
    public final String value;
    MdmAuthority(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MdmAuthority forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "intune": return Intune;
            case "sccm": return Sccm;
            case "office365": return Office365;
            default: return null;
        }
    }
}
