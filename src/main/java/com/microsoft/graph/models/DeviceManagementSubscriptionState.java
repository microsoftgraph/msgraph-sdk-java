package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Tenant mobile device management subscription state.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementSubscriptionState implements ValuedEnum {
    /** Pending */
    Pending("pending"),
    /** Active */
    Active("active"),
    /** Warning */
    Warning("warning"),
    /** Disabled */
    Disabled("disabled"),
    /** Deleted */
    Deleted("deleted"),
    /** Blocked */
    Blocked("blocked"),
    /** LockedOut */
    LockedOut("lockedOut");
    public final String value;
    DeviceManagementSubscriptionState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementSubscriptionState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "active": return Active;
            case "warning": return Warning;
            case "disabled": return Disabled;
            case "deleted": return Deleted;
            case "blocked": return Blocked;
            case "lockedOut": return LockedOut;
            default: return null;
        }
    }
}
