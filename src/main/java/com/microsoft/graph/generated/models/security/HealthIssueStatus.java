package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum HealthIssueStatus implements ValuedEnum {
    Open("open"),
    Closed("closed"),
    Suppressed("suppressed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    HealthIssueStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static HealthIssueStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "open": return Open;
            case "closed": return Closed;
            case "suppressed": return Suppressed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
