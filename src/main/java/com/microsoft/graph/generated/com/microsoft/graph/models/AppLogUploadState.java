package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * AppLogUploadStatus
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AppLogUploadState implements ValuedEnum {
    /** Default. Indicates that request is waiting to be processed or under processing. */
    Pending("pending"),
    /** Indicates that request is completed with file uploaded to Azure blob for download. */
    Completed("completed"),
    /** Indicates that request is completed with file uploaded to Azure blob for download. */
    Failed("failed"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AppLogUploadState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppLogUploadState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "completed": return Completed;
            case "failed": return Failed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
