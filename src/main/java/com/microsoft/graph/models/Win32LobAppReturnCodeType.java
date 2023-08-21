package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the type of return code.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Win32LobAppReturnCodeType implements ValuedEnum {
    /** Failed. */
    Failed("failed"),
    /** Success. */
    Success("success"),
    /** Soft-reboot is required. */
    SoftReboot("softReboot"),
    /** Hard-reboot is required. */
    HardReboot("hardReboot"),
    /** Retry. */
    Retry("retry");
    public final String value;
    Win32LobAppReturnCodeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Win32LobAppReturnCodeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "failed": return Failed;
            case "success": return Success;
            case "softReboot": return SoftReboot;
            case "hardReboot": return HardReboot;
            case "retry": return Retry;
            default: return null;
        }
    }
}
