package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates a collection of apps to target which can be one of several pre-defined lists of apps or a manually selected list of apps
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TargetedManagedAppGroupType implements ValuedEnum {
    /** Target the collection of apps manually selected by the admin. */
    SelectedPublicApps("selectedPublicApps"),
    /** Target the core set of Microsoft apps (Office, Edge, etc). */
    AllCoreMicrosoftApps("allCoreMicrosoftApps"),
    /** Target all apps with Microsoft as publisher. */
    AllMicrosoftApps("allMicrosoftApps"),
    /** Target all apps with an available assignment. */
    AllApps("allApps");
    public final String value;
    TargetedManagedAppGroupType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TargetedManagedAppGroupType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "selectedPublicApps": return SelectedPublicApps;
            case "allCoreMicrosoftApps": return AllCoreMicrosoftApps;
            case "allMicrosoftApps": return AllMicrosoftApps;
            case "allApps": return AllApps;
            default: return null;
        }
    }
}
