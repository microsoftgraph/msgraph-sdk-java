package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of chat entities. */
public enum TeamworkUserIdentityType implements ValuedEnum {
    AadUser("aadUser"),
    OnPremiseAadUser("onPremiseAadUser"),
    AnonymousGuest("anonymousGuest"),
    FederatedUser("federatedUser"),
    PersonalMicrosoftAccountUser("personalMicrosoftAccountUser"),
    SkypeUser("skypeUser"),
    PhoneUser("phoneUser"),
    UnknownFutureValue("unknownFutureValue"),
    EmailUser("emailUser");
    public final String value;
    TeamworkUserIdentityType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TeamworkUserIdentityType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "aadUser": return AadUser;
            case "onPremiseAadUser": return OnPremiseAadUser;
            case "anonymousGuest": return AnonymousGuest;
            case "federatedUser": return FederatedUser;
            case "personalMicrosoftAccountUser": return PersonalMicrosoftAccountUser;
            case "skypeUser": return SkypeUser;
            case "phoneUser": return PhoneUser;
            case "unknownFutureValue": return UnknownFutureValue;
            case "emailUser": return EmailUser;
            default: return null;
        }
    }
}
