package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Android Work Profile required password type.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidWorkProfileRequiredPasswordType implements ValuedEnum {
    /** Device default value, no intent. */
    DeviceDefault("deviceDefault"),
    /** Low security biometrics based password required. */
    LowSecurityBiometric("lowSecurityBiometric"),
    /** Required. */
    Required("required"),
    /** At least numeric password required. */
    AtLeastNumeric("atLeastNumeric"),
    /** Numeric complex password required. */
    NumericComplex("numericComplex"),
    /** At least alphabetic password required. */
    AtLeastAlphabetic("atLeastAlphabetic"),
    /** At least alphanumeric password required. */
    AtLeastAlphanumeric("atLeastAlphanumeric"),
    /** At least alphanumeric with symbols password required. */
    AlphanumericWithSymbols("alphanumericWithSymbols");
    public final String value;
    AndroidWorkProfileRequiredPasswordType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidWorkProfileRequiredPasswordType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceDefault": return DeviceDefault;
            case "lowSecurityBiometric": return LowSecurityBiometric;
            case "required": return Required;
            case "atLeastNumeric": return AtLeastNumeric;
            case "numericComplex": return NumericComplex;
            case "atLeastAlphabetic": return AtLeastAlphabetic;
            case "atLeastAlphanumeric": return AtLeastAlphanumeric;
            case "alphanumericWithSymbols": return AlphanumericWithSymbols;
            default: return null;
        }
    }
}
