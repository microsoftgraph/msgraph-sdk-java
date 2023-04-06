package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Contains rule types for Win32 LOB apps. */
public enum Win32LobAppRuleType implements ValuedEnum {
    /** Detection rule. */
    Detection("detection"),
    /** Requirement rule. */
    Requirement("requirement");
    public final String value;
    Win32LobAppRuleType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Win32LobAppRuleType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "detection": return Detection;
            case "requirement": return Requirement;
            default: return null;
        }
    }
}
