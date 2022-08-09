package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreementAcceptance entities. */
public enum RiskDetail implements ValuedEnum {
    None("none"),
    AdminGeneratedTemporaryPassword("adminGeneratedTemporaryPassword"),
    UserPerformedSecuredPasswordChange("userPerformedSecuredPasswordChange"),
    UserPerformedSecuredPasswordReset("userPerformedSecuredPasswordReset"),
    AdminConfirmedSigninSafe("adminConfirmedSigninSafe"),
    AiConfirmedSigninSafe("aiConfirmedSigninSafe"),
    UserPassedMFADrivenByRiskBasedPolicy("userPassedMFADrivenByRiskBasedPolicy"),
    AdminDismissedAllRiskForUser("adminDismissedAllRiskForUser"),
    AdminConfirmedSigninCompromised("adminConfirmedSigninCompromised"),
    Hidden("hidden"),
    AdminConfirmedUserCompromised("adminConfirmedUserCompromised"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RiskDetail(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RiskDetail forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "adminGeneratedTemporaryPassword": return AdminGeneratedTemporaryPassword;
            case "userPerformedSecuredPasswordChange": return UserPerformedSecuredPasswordChange;
            case "userPerformedSecuredPasswordReset": return UserPerformedSecuredPasswordReset;
            case "adminConfirmedSigninSafe": return AdminConfirmedSigninSafe;
            case "aiConfirmedSigninSafe": return AiConfirmedSigninSafe;
            case "userPassedMFADrivenByRiskBasedPolicy": return UserPassedMFADrivenByRiskBasedPolicy;
            case "adminDismissedAllRiskForUser": return AdminDismissedAllRiskForUser;
            case "adminConfirmedSigninCompromised": return AdminConfirmedSigninCompromised;
            case "hidden": return Hidden;
            case "adminConfirmedUserCompromised": return AdminConfirmedUserCompromised;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
