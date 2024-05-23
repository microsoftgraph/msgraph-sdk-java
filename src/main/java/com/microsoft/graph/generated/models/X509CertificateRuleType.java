package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum X509CertificateRuleType implements ValuedEnum {
    IssuerSubject("issuerSubject"),
    PolicyOID("policyOID"),
    UnknownFutureValue("unknownFutureValue"),
    IssuerSubjectAndPolicyOID("issuerSubjectAndPolicyOID");
    public final String value;
    X509CertificateRuleType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static X509CertificateRuleType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "issuerSubject": return IssuerSubject;
            case "policyOID": return PolicyOID;
            case "unknownFutureValue": return UnknownFutureValue;
            case "issuerSubjectAndPolicyOID": return IssuerSubjectAndPolicyOID;
            default: return null;
        }
    }
}
