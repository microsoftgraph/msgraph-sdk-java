package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for pre-release features.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PrereleaseFeatures implements ValuedEnum {
    /** User Defined, default value, no intent. */
    UserDefined("userDefined"),
    /** Settings only pre-release features. */
    SettingsOnly("settingsOnly"),
    /** Settings and experimentations pre-release features. */
    SettingsAndExperimentations("settingsAndExperimentations"),
    /** Pre-release features not allowed. */
    NotAllowed("notAllowed");
    public final String value;
    PrereleaseFeatures(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PrereleaseFeatures forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "settingsOnly": return SettingsOnly;
            case "settingsAndExperimentations": return SettingsAndExperimentations;
            case "notAllowed": return NotAllowed;
            default: return null;
        }
    }
}
