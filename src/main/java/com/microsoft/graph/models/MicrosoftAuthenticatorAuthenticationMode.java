package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of authenticationMethodConfiguration entities. */
public enum MicrosoftAuthenticatorAuthenticationMode implements ValuedEnum {
    DeviceBasedPush("deviceBasedPush"),
    Push("push"),
    Any("any");
    public final String value;
    MicrosoftAuthenticatorAuthenticationMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MicrosoftAuthenticatorAuthenticationMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceBasedPush": return DeviceBasedPush;
            case "push": return Push;
            case "any": return Any;
            default: return null;
        }
    }
}
