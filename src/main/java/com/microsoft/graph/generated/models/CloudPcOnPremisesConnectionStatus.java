package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcOnPremisesConnectionStatus implements ValuedEnum {
    Pending("pending"),
    Running("running"),
    Passed("passed"),
    Failed("failed"),
    Warning("warning"),
    Informational("informational"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcOnPremisesConnectionStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcOnPremisesConnectionStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "running": return Running;
            case "passed": return Passed;
            case "failed": return Failed;
            case "warning": return Warning;
            case "informational": return Informational;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
