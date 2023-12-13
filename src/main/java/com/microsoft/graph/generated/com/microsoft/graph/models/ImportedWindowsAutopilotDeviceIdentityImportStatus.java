package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ImportedWindowsAutopilotDeviceIdentityImportStatus implements ValuedEnum {
    /** Unknown status. */
    Unknown("unknown"),
    /** Pending status. */
    Pending("pending"),
    /** Partial status. */
    Partial("partial"),
    /** Complete status. */
    Complete("complete"),
    /** Error status. */
    Error("error");
    public final String value;
    ImportedWindowsAutopilotDeviceIdentityImportStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ImportedWindowsAutopilotDeviceIdentityImportStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "pending": return Pending;
            case "partial": return Partial;
            case "complete": return Complete;
            case "error": return Error;
            default: return null;
        }
    }
}
