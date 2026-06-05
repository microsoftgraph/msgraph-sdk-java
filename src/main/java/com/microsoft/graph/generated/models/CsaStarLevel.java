package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CsaStarLevel implements ValuedEnum {
    None("none"),
    Attestation("attestation"),
    Certification("certification"),
    ContinuousMonitoring("continuousMonitoring"),
    CStarAssessment("cStarAssessment"),
    SelfAssessment("selfAssessment"),
    NotSupported("notSupported"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CsaStarLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CsaStarLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "attestation": return Attestation;
            case "certification": return Certification;
            case "continuousMonitoring": return ContinuousMonitoring;
            case "cStarAssessment": return CStarAssessment;
            case "selfAssessment": return SelfAssessment;
            case "notSupported": return NotSupported;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
