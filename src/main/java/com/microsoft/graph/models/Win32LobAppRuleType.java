package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton. */
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
