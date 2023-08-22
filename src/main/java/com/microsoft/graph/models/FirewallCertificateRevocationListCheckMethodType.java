package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for firewallCertificateRevocationListCheckMethod
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FirewallCertificateRevocationListCheckMethodType implements ValuedEnum {
    /** No value configured by Intune, do not override the user-configured device default value */
    DeviceDefault("deviceDefault"),
    /** Do not check certificate revocation list */
    None("none"),
    /** Attempt CRL check and allow a certificate only if the certificate is confirmed by the check */
    Attempt("attempt"),
    /** Require a successful CRL check before allowing a certificate */
    Require("require");
    public final String value;
    FirewallCertificateRevocationListCheckMethodType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FirewallCertificateRevocationListCheckMethodType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceDefault": return DeviceDefault;
            case "none": return None;
            case "attempt": return Attempt;
            case "require": return Require;
            default: return null;
        }
    }
}
