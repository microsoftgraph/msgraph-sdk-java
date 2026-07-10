package com.microsoft.graph.models.entrarecoveryservices;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RecoveryStatus implements ValuedEnum {
    /** Represents a job that has been initialized but has not been started yet */
    Initialized("initialized"),
    /** Represents a job that is in progress */
    Running("running"),
    /** Represents a job that ran successfully and is now complete */
    Successful("successful"),
    /** Represents a job that we were not able to run successfully */
    Failed("failed"),
    /** Represents a job that was abandoned by the user */
    Abandoned("abandoned"),
    /** This will help in making this enum evolable and adding more values in the future- */
    UnknownFutureValue("unknownFutureValue"),
    /** Represents a job for which we have started calculating the diff/preview. */
    Calculating("calculating"),
    /** Represents a job for which we have started loading data of the snapshot. */
    LoadingData("loadingData");
    public final String value;
    RecoveryStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RecoveryStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "initialized": return Initialized;
            case "running": return Running;
            case "successful": return Successful;
            case "failed": return Failed;
            case "abandoned": return Abandoned;
            case "unknownFutureValue": return UnknownFutureValue;
            case "calculating": return Calculating;
            case "loadingData": return LoadingData;
            default: return null;
        }
    }
}
