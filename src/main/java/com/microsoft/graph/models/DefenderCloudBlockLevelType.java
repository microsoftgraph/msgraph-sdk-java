package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Possible values of Cloud Block Level */
public enum DefenderCloudBlockLevelType implements ValuedEnum {
    /** Default value, uses the default Windows Defender Antivirus blocking level and provides strong detection without increasing the risk of detecting legitimate files */
    NotConfigured("notConfigured"),
    /** High applies a strong level of detection. */
    High("high"),
    /** High + uses the High level and applies addition protection measures */
    HighPlus("highPlus"),
    /** Zero tolerance blocks all unknown executables */
    ZeroTolerance("zeroTolerance");
    public final String value;
    DefenderCloudBlockLevelType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DefenderCloudBlockLevelType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "high": return High;
            case "highPlus": return HighPlus;
            case "zeroTolerance": return ZeroTolerance;
            default: return null;
        }
    }
}
