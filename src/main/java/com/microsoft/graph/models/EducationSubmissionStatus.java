package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum EducationSubmissionStatus implements ValuedEnum {
    Working("working"),
    Submitted("submitted"),
    Released("released"),
    Returned("returned"),
    UnknownFutureValue("unknownFutureValue"),
    Reassigned("reassigned");
    public final String value;
    EducationSubmissionStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EducationSubmissionStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "working": return Working;
            case "submitted": return Submitted;
            case "released": return Released;
            case "returned": return Returned;
            case "unknownFutureValue": return UnknownFutureValue;
            case "reassigned": return Reassigned;
            default: return null;
        }
    }
}
