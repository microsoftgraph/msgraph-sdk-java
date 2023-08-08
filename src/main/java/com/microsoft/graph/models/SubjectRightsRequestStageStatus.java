package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SubjectRightsRequestStageStatus implements ValuedEnum {
    NotStarted("notStarted"),
    Current("current"),
    Completed("completed"),
    Failed("failed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SubjectRightsRequestStageStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SubjectRightsRequestStageStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notStarted": return NotStarted;
            case "current": return Current;
            case "completed": return Completed;
            case "failed": return Failed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
