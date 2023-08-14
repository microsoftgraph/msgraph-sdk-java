package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum EducationFeedbackResourceOutcomeStatus implements ValuedEnum {
    NotPublished("notPublished"),
    PendingPublish("pendingPublish"),
    Published("published"),
    FailedPublish("failedPublish"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EducationFeedbackResourceOutcomeStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EducationFeedbackResourceOutcomeStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notPublished": return NotPublished;
            case "pendingPublish": return PendingPublish;
            case "published": return Published;
            case "failedPublish": return FailedPublish;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
