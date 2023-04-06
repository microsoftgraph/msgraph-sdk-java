package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Partner App Type. */
public enum DeviceManagementPartnerAppType implements ValuedEnum {
    /** Partner App type is unknown. */
    Unknown("unknown"),
    /** Partner App is Single tenant in AAD. */
    SingleTenantApp("singleTenantApp"),
    /** Partner App is Multi tenant in AAD. */
    MultiTenantApp("multiTenantApp");
    public final String value;
    DeviceManagementPartnerAppType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementPartnerAppType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "singleTenantApp": return SingleTenantApp;
            case "multiTenantApp": return MultiTenantApp;
            default: return null;
        }
    }
}
