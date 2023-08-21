package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum QuarantineReason implements ValuedEnum {
    EncounteredBaseEscrowThreshold("EncounteredBaseEscrowThreshold"),
    EncounteredTotalEscrowThreshold("EncounteredTotalEscrowThreshold"),
    EncounteredEscrowProportionThreshold("EncounteredEscrowProportionThreshold"),
    EncounteredQuarantineException("EncounteredQuarantineException"),
    Unknown("Unknown"),
    QuarantinedOnDemand("QuarantinedOnDemand"),
    TooManyDeletes("TooManyDeletes"),
    IngestionInterrupted("IngestionInterrupted");
    public final String value;
    QuarantineReason(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static QuarantineReason forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "EncounteredBaseEscrowThreshold": return EncounteredBaseEscrowThreshold;
            case "EncounteredTotalEscrowThreshold": return EncounteredTotalEscrowThreshold;
            case "EncounteredEscrowProportionThreshold": return EncounteredEscrowProportionThreshold;
            case "EncounteredQuarantineException": return EncounteredQuarantineException;
            case "Unknown": return Unknown;
            case "QuarantinedOnDemand": return QuarantinedOnDemand;
            case "TooManyDeletes": return TooManyDeletes;
            case "IngestionInterrupted": return IngestionInterrupted;
            default: return null;
        }
    }
}
