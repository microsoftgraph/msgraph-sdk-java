package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AuthenticationMethodModes implements ValuedEnum {
    Password("password"),
    Voice("voice"),
    HardwareOath("hardwareOath"),
    SoftwareOath("softwareOath"),
    Sms("sms"),
    Fido2("fido2"),
    WindowsHelloForBusiness("windowsHelloForBusiness"),
    MicrosoftAuthenticatorPush("microsoftAuthenticatorPush"),
    DeviceBasedPush("deviceBasedPush"),
    TemporaryAccessPassOneTime("temporaryAccessPassOneTime"),
    TemporaryAccessPassMultiUse("temporaryAccessPassMultiUse"),
    Email("email"),
    X509CertificateSingleFactor("x509CertificateSingleFactor"),
    X509CertificateMultiFactor("x509CertificateMultiFactor"),
    FederatedSingleFactor("federatedSingleFactor"),
    FederatedMultiFactor("federatedMultiFactor"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuthenticationMethodModes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuthenticationMethodModes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "password": return Password;
            case "voice": return Voice;
            case "hardwareOath": return HardwareOath;
            case "softwareOath": return SoftwareOath;
            case "sms": return Sms;
            case "fido2": return Fido2;
            case "windowsHelloForBusiness": return WindowsHelloForBusiness;
            case "microsoftAuthenticatorPush": return MicrosoftAuthenticatorPush;
            case "deviceBasedPush": return DeviceBasedPush;
            case "temporaryAccessPassOneTime": return TemporaryAccessPassOneTime;
            case "temporaryAccessPassMultiUse": return TemporaryAccessPassMultiUse;
            case "email": return Email;
            case "x509CertificateSingleFactor": return X509CertificateSingleFactor;
            case "x509CertificateMultiFactor": return X509CertificateMultiFactor;
            case "federatedSingleFactor": return FederatedSingleFactor;
            case "federatedMultiFactor": return FederatedMultiFactor;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
