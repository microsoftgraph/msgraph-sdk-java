package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
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
    UnknownFutureValue("unknownFutureValue"),
    M365DAdminDismissedDetection("m365DAdminDismissedDetection"),
    AdminConfirmedServicePrincipalCompromised("adminConfirmedServicePrincipalCompromised"),
    AdminDismissedAllRiskForServicePrincipal("adminDismissedAllRiskForServicePrincipal");
    public final String value;
    RiskDetail(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RiskDetail forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
            case "m365DAdminDismissedDetection": return M365DAdminDismissedDetection;
            case "adminConfirmedServicePrincipalCompromised": return AdminConfirmedServicePrincipalCompromised;
            case "adminDismissedAllRiskForServicePrincipal": return AdminDismissedAllRiskForServicePrincipal;
            default: return null;
        }
    }
}
