package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the admin singleton. */
public enum WindowsArchitecture implements ValuedEnum {
    /** No flags set. */
    None("none"),
    /** Whether or not the X86 Windows architecture type is supported. */
    X86("x86"),
    /** Whether or not the X64 Windows architecture type is supported. */
    X64("x64"),
    /** Whether or not the Arm Windows architecture type is supported. */
    Arm("arm"),
    /** Whether or not the Neutral Windows architecture type is supported. */
    Neutral("neutral");
    public final String value;
    WindowsArchitecture(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsArchitecture forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "x86": return X86;
            case "x64": return X64;
            case "arm": return Arm;
            case "neutral": return Neutral;
            default: return null;
        }
    }
}
