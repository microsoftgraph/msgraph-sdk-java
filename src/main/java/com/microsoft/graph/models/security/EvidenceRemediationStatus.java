package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EvidenceRemediationStatus forValue(@javax.annotation.Nonnull final String searchValue) {
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
