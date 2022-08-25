package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
public enum LobbyBypassScope implements ValuedEnum {
    Organizer("organizer"),
    Organization("organization"),
    OrganizationAndFederated("organizationAndFederated"),
    Everyone("everyone"),
    UnknownFutureValue("unknownFutureValue"),
    Invited("invited"),
    OrganizationExcludingGuests("organizationExcludingGuests");
    public final String value;
    LobbyBypassScope(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static LobbyBypassScope forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "organizer": return Organizer;
            case "organization": return Organization;
            case "organizationAndFederated": return OrganizationAndFederated;
            case "everyone": return Everyone;
            case "unknownFutureValue": return UnknownFutureValue;
            case "invited": return Invited;
            case "organizationExcludingGuests": return OrganizationExcludingGuests;
            default: return null;
        }
    }
}
