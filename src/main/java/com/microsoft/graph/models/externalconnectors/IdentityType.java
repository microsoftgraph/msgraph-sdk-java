package microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of externalConnection entities. */
public enum IdentityType implements ValuedEnum {
    User("user"),
    Group("group"),
    ExternalGroup("externalGroup"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IdentityType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static IdentityType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "group": return Group;
            case "externalGroup": return ExternalGroup;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
