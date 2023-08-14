package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum BaseAuthenticationMethod implements ValuedEnum {
    Password("password"),
    Voice("voice"),
    HardwareOath("hardwareOath"),
    SoftwareOath("softwareOath"),
    Sms("sms"),
    Fido2("fido2"),
    WindowsHelloForBusiness("windowsHelloForBusiness"),
    MicrosoftAuthenticator("microsoftAuthenticator"),
    TemporaryAccessPass("temporaryAccessPass"),
    Email("email"),
    X509Certificate("x509Certificate"),
    Federation("federation"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BaseAuthenticationMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BaseAuthenticationMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "password": return Password;
            case "voice": return Voice;
            case "hardwareOath": return HardwareOath;
            case "softwareOath": return SoftwareOath;
            case "sms": return Sms;
            case "fido2": return Fido2;
            case "windowsHelloForBusiness": return WindowsHelloForBusiness;
            case "microsoftAuthenticator": return MicrosoftAuthenticator;
            case "temporaryAccessPass": return TemporaryAccessPass;
            case "email": return Email;
            case "x509Certificate": return X509Certificate;
            case "federation": return Federation;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
