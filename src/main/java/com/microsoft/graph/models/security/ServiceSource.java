package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ServiceSource implements ValuedEnum {
    Unknown("unknown"),
    MicrosoftDefenderForEndpoint("microsoftDefenderForEndpoint"),
    MicrosoftDefenderForIdentity("microsoftDefenderForIdentity"),
    MicrosoftDefenderForCloudApps("microsoftDefenderForCloudApps"),
    MicrosoftDefenderForOffice365("microsoftDefenderForOffice365"),
    Microsoft365Defender("microsoft365Defender"),
    AzureAdIdentityProtection("azureAdIdentityProtection"),
    MicrosoftAppGovernance("microsoftAppGovernance"),
    DataLossPrevention("dataLossPrevention"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ServiceSource(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceSource forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "microsoftDefenderForEndpoint": return MicrosoftDefenderForEndpoint;
            case "microsoftDefenderForIdentity": return MicrosoftDefenderForIdentity;
            case "microsoftDefenderForCloudApps": return MicrosoftDefenderForCloudApps;
            case "microsoftDefenderForOffice365": return MicrosoftDefenderForOffice365;
            case "microsoft365Defender": return Microsoft365Defender;
            case "azureAdIdentityProtection": return AzureAdIdentityProtection;
            case "microsoftAppGovernance": return MicrosoftAppGovernance;
            case "dataLossPrevention": return DataLossPrevention;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
