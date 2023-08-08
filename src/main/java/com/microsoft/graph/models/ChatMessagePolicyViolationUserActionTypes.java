package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ChatMessagePolicyViolationUserActionTypes implements ValuedEnum {
    None("none"),
    Override("override"),
    ReportFalsePositive("reportFalsePositive");
    public final String value;
    ChatMessagePolicyViolationUserActionTypes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChatMessagePolicyViolationUserActionTypes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "override": return Override;
            case "reportFalsePositive": return ReportFalsePositive;
            default: return null;
        }
    }
}
