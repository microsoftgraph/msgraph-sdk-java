package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreementAcceptance entities. */
public enum TeamVisibilityType implements ValuedEnum {
    Private_escaped("private_escaped"),
    Public_escaped("public_escaped"),
    HiddenMembership("hiddenMembership"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamVisibilityType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TeamVisibilityType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "private": return Private_escaped;
            case "public": return Public_escaped;
            case "hiddenMembership": return HiddenMembership;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
