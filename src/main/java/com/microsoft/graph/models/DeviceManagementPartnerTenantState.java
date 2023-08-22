package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Partner state of this tenant.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementPartnerTenantState implements ValuedEnum {
    /** Partner state is unknown. */
    Unknown("unknown"),
    /** Partner is unavailable. */
    Unavailable("unavailable"),
    /** Partner is enabled. */
    Enabled("enabled"),
    /** Partner connection is terminated. */
    Terminated("terminated"),
    /** Partner messages are rejected. */
    Rejected("rejected"),
    /** Partner is unresponsive. */
    Unresponsive("unresponsive");
    public final String value;
    DeviceManagementPartnerTenantState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementPartnerTenantState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "unavailable": return Unavailable;
            case "enabled": return Enabled;
            case "terminated": return Terminated;
            case "rejected": return Rejected;
            case "unresponsive": return Unresponsive;
            default: return null;
        }
    }
}
