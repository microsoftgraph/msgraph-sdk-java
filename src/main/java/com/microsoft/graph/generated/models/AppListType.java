package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values of the compliance app list.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AppListType implements ValuedEnum {
    /** Default value, no intent. */
    None("none"),
    /** The list represents the apps that will be considered compliant (only apps on the list are compliant). */
    AppsInListCompliant("appsInListCompliant"),
    /** The list represents the apps that will be considered non compliant (all apps are compliant except apps on the list). */
    AppsNotInListCompliant("appsNotInListCompliant");
    public final String value;
    AppListType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppListType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "appsInListCompliant": return AppsInListCompliant;
            case "appsNotInListCompliant": return AppsNotInListCompliant;
            default: return null;
        }
    }
}
