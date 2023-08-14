package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ChatMessagePolicyViolationVerdictDetailsTypes implements ValuedEnum {
    None("none"),
    AllowFalsePositiveOverride("allowFalsePositiveOverride"),
    AllowOverrideWithoutJustification("allowOverrideWithoutJustification"),
    AllowOverrideWithJustification("allowOverrideWithJustification");
    public final String value;
    ChatMessagePolicyViolationVerdictDetailsTypes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChatMessagePolicyViolationVerdictDetailsTypes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "allowFalsePositiveOverride": return AllowFalsePositiveOverride;
            case "allowOverrideWithoutJustification": return AllowOverrideWithoutJustification;
            case "allowOverrideWithJustification": return AllowOverrideWithJustification;
            default: return null;
        }
    }
}
