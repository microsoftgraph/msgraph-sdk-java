package com.microsoft.graph.models.teamsadministration;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PortInStatus implements ValuedEnum {
    Completed("completed"),
    FirmOrderCommitmentAccepted("firmOrderCommitmentAccepted"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PortInStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PortInStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "completed": return Completed;
            case "firmOrderCommitmentAccepted": return FirmOrderCommitmentAccepted;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
