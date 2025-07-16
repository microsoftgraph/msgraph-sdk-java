package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum B2bIdentityProvidersType implements ValuedEnum {
    AzureActiveDirectory("azureActiveDirectory"),
    ExternalFederation("externalFederation"),
    SocialIdentityProviders("socialIdentityProviders"),
    EmailOneTimePasscode("emailOneTimePasscode"),
    MicrosoftAccount("microsoftAccount"),
    DefaultConfiguredIdp("defaultConfiguredIdp"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    B2bIdentityProvidersType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static B2bIdentityProvidersType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "azureActiveDirectory": return AzureActiveDirectory;
            case "externalFederation": return ExternalFederation;
            case "socialIdentityProviders": return SocialIdentityProviders;
            case "emailOneTimePasscode": return EmailOneTimePasscode;
            case "microsoftAccount": return MicrosoftAccount;
            case "defaultConfiguredIdp": return DefaultConfiguredIdp;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
