package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsHelloForBusinessPinUsage forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allowed": return Allowed;
            case "required": return Required;
            case "disallowed": return Disallowed;
            default: return null;
        }
    }
}
