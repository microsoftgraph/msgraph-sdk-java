package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the policyRoot singleton.  */
public enum AllowInvitesFrom implements ValuedEnum {
    None("none"),
    AdminsAndGuestInviters("adminsAndGuestInviters"),
    AdminsGuestInvitersAndAllMembers("adminsGuestInvitersAndAllMembers"),
    Everyone("everyone"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AllowInvitesFrom(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AllowInvitesFrom forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "adminsAndGuestInviters": return AdminsAndGuestInviters;
            case "adminsGuestInvitersAndAllMembers": return AdminsGuestInvitersAndAllMembers;
            case "everyone": return Everyone;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
