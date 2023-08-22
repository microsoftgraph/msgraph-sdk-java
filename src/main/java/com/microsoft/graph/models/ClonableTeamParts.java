package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ClonableTeamParts implements ValuedEnum {
    Apps("apps"),
    Tabs("tabs"),
    Settings("settings"),
    Channels("channels"),
    Members("members");
    public final String value;
    ClonableTeamParts(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ClonableTeamParts forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "apps": return Apps;
            case "tabs": return Tabs;
            case "settings": return Settings;
            case "channels": return Channels;
            case "members": return Members;
            default: return null;
        }
    }
}
