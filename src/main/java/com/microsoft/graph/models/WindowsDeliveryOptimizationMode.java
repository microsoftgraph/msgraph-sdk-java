package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Delivery optimization mode for peer distribution */
public enum WindowsDeliveryOptimizationMode implements ValuedEnum {
    /** Allow the user to set. */
    UserDefined("userDefined"),
    /** HTTP only, no peering */
    HttpOnly("httpOnly"),
    /** OS default  Http blended with peering behind the same network address translator */
    HttpWithPeeringNat("httpWithPeeringNat"),
    /** HTTP blended with peering across a private group */
    HttpWithPeeringPrivateGroup("httpWithPeeringPrivateGroup"),
    /** HTTP blended with Internet peering */
    HttpWithInternetPeering("httpWithInternetPeering"),
    /** Simple download mode with no peering */
    SimpleDownload("simpleDownload"),
    /** Bypass mode. Do not use Delivery Optimization and use BITS instead */
    BypassMode("bypassMode");
    public final String value;
    WindowsDeliveryOptimizationMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsDeliveryOptimizationMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "httpOnly": return HttpOnly;
            case "httpWithPeeringNat": return HttpWithPeeringNat;
            case "httpWithPeeringPrivateGroup": return HttpWithPeeringPrivateGroup;
            case "httpWithInternetPeering": return HttpWithInternetPeering;
            case "simpleDownload": return SimpleDownload;
            case "bypassMode": return BypassMode;
            default: return null;
        }
    }
}
