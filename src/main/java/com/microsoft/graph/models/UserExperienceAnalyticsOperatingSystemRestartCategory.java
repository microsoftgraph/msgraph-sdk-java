package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Operating System restart category.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserExperienceAnalyticsOperatingSystemRestartCategory implements ValuedEnum {
    /** Default. Set to unknown if device operating system restart category has not yet been calculated. */
    Unknown("unknown"),
    /** Indicates that the device operating system restart is along with an update. */
    RestartWithUpdate("restartWithUpdate"),
    /** Indicates that the device operating system restart is without update. */
    RestartWithoutUpdate("restartWithoutUpdate"),
    /** Indicates that the device operating system restart is due to a specific stop error. */
    BlueScreen("blueScreen"),
    /** Indicates that the device operating system restart is due to shutdown with update. */
    ShutdownWithUpdate("shutdownWithUpdate"),
    /** Indicates that the device operating system restart is due to shutdown without update. */
    ShutdownWithoutUpdate("shutdownWithoutUpdate"),
    /** Indicates that the device operating system restart is due to update long power-button press. */
    LongPowerButtonPress("longPowerButtonPress"),
    /** Indicates that the device operating system restart is due to boot error. */
    BootError("bootError"),
    /** Indicates that the device operating system restarted after an update. */
    Update("update"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserExperienceAnalyticsOperatingSystemRestartCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserExperienceAnalyticsOperatingSystemRestartCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "restartWithUpdate": return RestartWithUpdate;
            case "restartWithoutUpdate": return RestartWithoutUpdate;
            case "blueScreen": return BlueScreen;
            case "shutdownWithUpdate": return ShutdownWithUpdate;
            case "shutdownWithoutUpdate": return ShutdownWithoutUpdate;
            case "longPowerButtonPress": return LongPowerButtonPress;
            case "bootError": return BootError;
            case "update": return Update;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
