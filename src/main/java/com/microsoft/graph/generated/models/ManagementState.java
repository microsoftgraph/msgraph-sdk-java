package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Management state of device in Microsoft Intune.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagementState implements ValuedEnum {
    /** The device is under management */
    Managed("managed"),
    /** A retire command is occuring on the device and in the process of unenrolling from management */
    RetirePending("retirePending"),
    /** Retire command failed on the device */
    RetireFailed("retireFailed"),
    /** A wipe command is occuring on the device and in the process of unenrolling from management */
    WipePending("wipePending"),
    /** Wipe command failed on the device */
    WipeFailed("wipeFailed"),
    /** The device is unhealthy. */
    Unhealthy("unhealthy"),
    /** A delete command is occuring on the device  */
    DeletePending("deletePending"),
    /** A retire command was issued for the device */
    RetireIssued("retireIssued"),
    /** A wipe command was issued for the device */
    WipeIssued("wipeIssued"),
    /** A wipe command for this device has been canceled */
    WipeCanceled("wipeCanceled"),
    /** A retire command for this device has been canceled */
    RetireCanceled("retireCanceled"),
    /** The device is discovered but not fully enrolled. */
    Discovered("discovered"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ManagementState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagementState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "managed": return Managed;
            case "retirePending": return RetirePending;
            case "retireFailed": return RetireFailed;
            case "wipePending": return WipePending;
            case "wipeFailed": return WipeFailed;
            case "unhealthy": return Unhealthy;
            case "deletePending": return DeletePending;
            case "retireIssued": return RetireIssued;
            case "wipeIssued": return WipeIssued;
            case "wipeCanceled": return WipeCanceled;
            case "retireCanceled": return RetireCanceled;
            case "discovered": return Discovered;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
