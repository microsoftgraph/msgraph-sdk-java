package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ImportedWindowsAutopilotDeviceIdentityUploadStatus implements ValuedEnum {
    /** No upload status. */
    NoUpload("noUpload"),
    /** Pending status. */
    Pending("pending"),
    /** Complete status. */
    Complete("complete"),
    /** Error status. */
    Error("error");
    public final String value;
    ImportedWindowsAutopilotDeviceIdentityUploadStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ImportedWindowsAutopilotDeviceIdentityUploadStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "noUpload": return NoUpload;
            case "pending": return Pending;
            case "complete": return Complete;
            case "error": return Error;
            default: return null;
        }
    }
}
