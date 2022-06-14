package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum AndroidRequiredPasswordType implements ValuedEnum {
    /** Device default value, no intent. */
    DeviceDefault("deviceDefault"),
    /** Alphabetic password required. */
    Alphabetic("alphabetic"),
    /** Alphanumeric password required. */
    Alphanumeric("alphanumeric"),
    /** Alphanumeric with symbols password required. */
    AlphanumericWithSymbols("alphanumericWithSymbols"),
    /** Low security biometrics based password required. */
    LowSecurityBiometric("lowSecurityBiometric"),
    /** Numeric password required. */
    Numeric("numeric"),
    /** Numeric complex password required. */
    NumericComplex("numericComplex"),
    /** A password or pattern is required, and any is acceptable. */
    Any("any");
    public final String value;
    AndroidRequiredPasswordType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidRequiredPasswordType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceDefault": return DeviceDefault;
            case "alphabetic": return Alphabetic;
            case "alphanumeric": return Alphanumeric;
            case "alphanumericWithSymbols": return AlphanumericWithSymbols;
            case "lowSecurityBiometric": return LowSecurityBiometric;
            case "numeric": return Numeric;
            case "numericComplex": return NumericComplex;
            case "any": return Any;
            default: return null;
        }
    }
}
