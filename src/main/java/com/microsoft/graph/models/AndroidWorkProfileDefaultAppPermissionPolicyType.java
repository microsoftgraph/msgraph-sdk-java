package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Android Work Profile default app permission policy type.
 */
public enum AndroidWorkProfileDefaultAppPermissionPolicyType implements ValuedEnum {
    /** Device default value, no intent. */
    DeviceDefault("deviceDefault"),
    /** Prompt. */
    Prompt("prompt"),
    /** Auto grant. */
    AutoGrant("autoGrant"),
    /** Auto deny. */
    AutoDeny("autoDeny");
    public final String value;
    AndroidWorkProfileDefaultAppPermissionPolicyType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidWorkProfileDefaultAppPermissionPolicyType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceDefault": return DeviceDefault;
            case "prompt": return Prompt;
            case "autoGrant": return AutoGrant;
            case "autoDeny": return AutoDeny;
            default: return null;
        }
    }
}
