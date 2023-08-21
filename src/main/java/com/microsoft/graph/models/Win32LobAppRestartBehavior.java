package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the type of restart action.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Win32LobAppRestartBehavior implements ValuedEnum {
    /** Intune will restart the device after running the app installation if the operation returns a reboot code. */
    BasedOnReturnCode("basedOnReturnCode"),
    /** Intune will not take any specific action on reboot codes resulting from app installations. Intune will not attempt to suppress restarts for MSI apps. */
    Allow("allow"),
    /** Intune will attempt to suppress restarts for MSI apps. */
    Suppress("suppress"),
    /** Intune will force the device to restart immediately after the app installation operation. */
    Force("force");
    public final String value;
    Win32LobAppRestartBehavior(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Win32LobAppRestartBehavior forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "basedOnReturnCode": return BasedOnReturnCode;
            case "allow": return Allow;
            case "suppress": return Suppress;
            case "force": return Force;
            default: return null;
        }
    }
}
