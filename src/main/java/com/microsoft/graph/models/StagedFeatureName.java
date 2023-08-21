package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum StagedFeatureName implements ValuedEnum {
    PassthroughAuthentication("passthroughAuthentication"),
    SeamlessSso("seamlessSso"),
    PasswordHashSync("passwordHashSync"),
    EmailAsAlternateId("emailAsAlternateId"),
    UnknownFutureValue("unknownFutureValue"),
    CertificateBasedAuthentication("certificateBasedAuthentication"),
    MultiFactorAuthentication("multiFactorAuthentication");
    public final String value;
    StagedFeatureName(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static StagedFeatureName forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "passthroughAuthentication": return PassthroughAuthentication;
            case "seamlessSso": return SeamlessSso;
            case "passwordHashSync": return PasswordHashSync;
            case "emailAsAlternateId": return EmailAsAlternateId;
            case "unknownFutureValue": return UnknownFutureValue;
            case "certificateBasedAuthentication": return CertificateBasedAuthentication;
            case "multiFactorAuthentication": return MultiFactorAuthentication;
            default: return null;
        }
    }
}
