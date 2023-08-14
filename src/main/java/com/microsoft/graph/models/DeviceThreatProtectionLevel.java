package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Device threat protection levels for the Device Threat Protection API.
 */
public enum DeviceThreatProtectionLevel implements ValuedEnum {
    /** Default Value. Do not use. */
    Unavailable("unavailable"),
    /** Device Threat Level requirement: Secured. This is the most secure level, and represents that no threats were found on the device. */
    Secured("secured"),
    /** Device Threat Protection level requirement: Low. Low represents a severity of threat that poses minimal risk to the device or device data. */
    Low("low"),
    /** Device Threat Protection level requirement: Medium. Medium represents a severity of threat that poses moderate risk to the device or device data. */
    Medium("medium"),
    /** Device Threat Protection level requirement: High. High represents a severity of threat that poses severe risk to the device or device data. */
    High("high"),
    /** Device Threat Protection level requirement: Not Set. Not set represents that there is no requirement for the device to meet a Threat Protection level. */
    NotSet("notSet");
    public final String value;
    DeviceThreatProtectionLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceThreatProtectionLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unavailable": return Unavailable;
            case "secured": return Secured;
            case "low": return Low;
            case "medium": return Medium;
            case "high": return High;
            case "notSet": return NotSet;
            default: return null;
        }
    }
}
