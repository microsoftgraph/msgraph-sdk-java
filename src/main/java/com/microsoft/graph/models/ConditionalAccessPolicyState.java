package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ConditionalAccessPolicyState implements ValuedEnum {
    Enabled("enabled"),
    Disabled("disabled"),
    EnabledForReportingButNotEnforced("enabledForReportingButNotEnforced");
    public final String value;
    ConditionalAccessPolicyState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ConditionalAccessPolicyState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "enabled": return Enabled;
            case "disabled": return Disabled;
            case "enabledForReportingButNotEnforced": return EnabledForReportingButNotEnforced;
            default: return null;
        }
    }
}
