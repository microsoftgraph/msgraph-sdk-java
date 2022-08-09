package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreementAcceptance entities. */
public enum AgreementAcceptanceState implements ValuedEnum {
    Accepted("accepted"),
    Declined("declined"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AgreementAcceptanceState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AgreementAcceptanceState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "accepted": return Accepted;
            case "declined": return Declined;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
