package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DataProtection implements ValuedEnum {
    None("none"),
    ImpactAssessments("impactAssessments"),
    Officers("officers"),
    SecureCrossBorderDataTransfer("secureCrossBorderDataTransfer"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DataProtection(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DataProtection forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "impactAssessments": return ImpactAssessments;
            case "officers": return Officers;
            case "secureCrossBorderDataTransfer": return SecureCrossBorderDataTransfer;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
