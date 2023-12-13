package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Windows Hello for Business pin usage options
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsHelloForBusinessPinUsage implements ValuedEnum {
    /** Allowed the usage of certain pin rule */
    Allowed("allowed"),
    /** Enforce the usage of certain pin rule */
    Required("required"),
    /** Forbit the usage of certain pin rule */
    Disallowed("disallowed");
    public final String value;
    WindowsHelloForBusinessPinUsage(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsHelloForBusinessPinUsage forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allowed": return Allowed;
            case "required": return Required;
            case "disallowed": return Disallowed;
            default: return null;
        }
    }
}
