package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Device Exchange Access State.
 */
public enum DeviceManagementExchangeAccessState implements ValuedEnum {
    /** No access state discovered from Exchange */
    None("none"),
    /** Device access state to Exchange is unknown */
    Unknown("unknown"),
    /** Device has access to Exchange */
    Allowed("allowed"),
    /** Device is Blocked in Exchange */
    Blocked("blocked"),
    /** Device is Quarantined in Exchange */
    Quarantined("quarantined");
    public final String value;
    DeviceManagementExchangeAccessState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementExchangeAccessState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "unknown": return Unknown;
            case "allowed": return Allowed;
            case "blocked": return Blocked;
            case "quarantined": return Quarantined;
            default: return null;
        }
    }
}
