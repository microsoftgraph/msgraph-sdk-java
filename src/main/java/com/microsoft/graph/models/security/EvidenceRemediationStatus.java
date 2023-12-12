package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EvidenceRemediationStatus implements ValuedEnum {
    None("none"),
    Remediated("remediated"),
    Prevented("prevented"),
    Blocked("blocked"),
    NotFound("notFound"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EvidenceRemediationStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EvidenceRemediationStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "remediated": return Remediated;
            case "prevented": return Prevented;
            case "blocked": return Blocked;
            case "notFound": return NotFound;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
