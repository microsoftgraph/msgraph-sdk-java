package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Defenders default action to take on detected Malware threats. */
public enum DefenderThreatAction implements ValuedEnum {
    /** Apply action based on the update definition. */
    DeviceDefault("deviceDefault"),
    /** Clean the detected threat. */
    Clean("clean"),
    /** Quarantine the detected threat. */
    Quarantine("quarantine"),
    /** Remove the detected threat. */
    Remove("remove"),
    /** Allow the detected threat. */
    Allow("allow"),
    /** Allow the user to determine the action to take with the detected threat. */
    UserDefined("userDefined"),
    /** Block the detected threat. */
    Block("block");
    public final String value;
    DefenderThreatAction(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DefenderThreatAction forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceDefault": return DeviceDefault;
            case "clean": return Clean;
            case "quarantine": return Quarantine;
            case "remove": return Remove;
            case "allow": return Allow;
            case "userDefined": return UserDefined;
            case "block": return Block;
            default: return null;
        }
    }
}
