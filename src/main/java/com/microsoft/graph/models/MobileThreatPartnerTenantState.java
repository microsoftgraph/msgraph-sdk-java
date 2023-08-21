package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Partner state of this tenant.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MobileThreatPartnerTenantState implements ValuedEnum {
    /** Partner is unavailable. */
    Unavailable("unavailable"),
    /** Partner is available. */
    Available("available"),
    /** Partner is enabled. */
    Enabled("enabled"),
    /** Partner is unresponsive. */
    Unresponsive("unresponsive");
    public final String value;
    MobileThreatPartnerTenantState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MobileThreatPartnerTenantState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unavailable": return Unavailable;
            case "available": return Available;
            case "enabled": return Enabled;
            case "unresponsive": return Unresponsive;
            default: return null;
        }
    }
}
