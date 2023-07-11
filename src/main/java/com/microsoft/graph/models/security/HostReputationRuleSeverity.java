package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum HostReputationRuleSeverity implements ValuedEnum {
    Unknown("unknown"),
    Low("low"),
    Medium("medium"),
    High("high"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    HostReputationRuleSeverity(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static HostReputationRuleSeverity forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "low": return Low;
            case "medium": return Medium;
            case "high": return High;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
