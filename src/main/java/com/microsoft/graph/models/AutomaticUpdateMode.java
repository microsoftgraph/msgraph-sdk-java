package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for automatic update mode.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AutomaticUpdateMode implements ValuedEnum {
    /** User Defined, default value, no intent. */
    UserDefined("userDefined"),
    /** Notify on download. */
    NotifyDownload("notifyDownload"),
    /** Auto-install at maintenance time. */
    AutoInstallAtMaintenanceTime("autoInstallAtMaintenanceTime"),
    /** Auto-install and reboot at maintenance time. */
    AutoInstallAndRebootAtMaintenanceTime("autoInstallAndRebootAtMaintenanceTime"),
    /** Auto-install and reboot at scheduled time. */
    AutoInstallAndRebootAtScheduledTime("autoInstallAndRebootAtScheduledTime"),
    /** Auto-install and restart without end-user control */
    AutoInstallAndRebootWithoutEndUserControl("autoInstallAndRebootWithoutEndUserControl");
    public final String value;
    AutomaticUpdateMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AutomaticUpdateMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "notifyDownload": return NotifyDownload;
            case "autoInstallAtMaintenanceTime": return AutoInstallAtMaintenanceTime;
            case "autoInstallAndRebootAtMaintenanceTime": return AutoInstallAndRebootAtMaintenanceTime;
            case "autoInstallAndRebootAtScheduledTime": return AutoInstallAndRebootAtScheduledTime;
            case "autoInstallAndRebootWithoutEndUserControl": return AutoInstallAndRebootWithoutEndUserControl;
            default: return null;
        }
    }
}
