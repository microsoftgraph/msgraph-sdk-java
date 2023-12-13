package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ConditionalAccessPolicyState implements ValuedEnum {
    Enabled("enabled"),
    Disabled("disabled"),
    EnabledForReportingButNotEnforced("enabledForReportingButNotEnforced");
    public final String value;
    ConditionalAccessPolicyState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConditionalAccessPolicyState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "enabled": return Enabled;
            case "disabled": return Disabled;
            case "enabledForReportingButNotEnforced": return EnabledForReportingButNotEnforced;
            default: return null;
        }
    }
}
