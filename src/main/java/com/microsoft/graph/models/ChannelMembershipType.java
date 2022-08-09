package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
public enum ChannelMembershipType implements ValuedEnum {
    Standard("standard"),
    Private_escaped("private_escaped"),
    UnknownFutureValue("unknownFutureValue"),
    Shared("shared");
    public final String value;
    ChannelMembershipType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ChannelMembershipType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "standard": return Standard;
            case "private": return Private_escaped;
            case "unknownFutureValue": return UnknownFutureValue;
            case "shared": return Shared;
            default: return null;
        }
    }
}
