package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TokenIssuerType implements ValuedEnum {
    AzureAD("AzureAD"),
    ADFederationServices("ADFederationServices"),
    UnknownFutureValue("UnknownFutureValue"),
    AzureADBackupAuth("AzureADBackupAuth"),
    ADFederationServicesMFAAdapter("ADFederationServicesMFAAdapter"),
    NPSExtension("NPSExtension");
    public final String value;
    TokenIssuerType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TokenIssuerType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "AzureAD": return AzureAD;
            case "ADFederationServices": return ADFederationServices;
            case "UnknownFutureValue": return UnknownFutureValue;
            case "AzureADBackupAuth": return AzureADBackupAuth;
            case "ADFederationServicesMFAAdapter": return ADFederationServicesMFAAdapter;
            case "NPSExtension": return NPSExtension;
            default: return null;
        }
    }
}
