package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum DetectionSource implements ValuedEnum {
    Unknown("unknown"),
    MicrosoftDefenderForEndpoint("microsoftDefenderForEndpoint"),
    Antivirus("antivirus"),
    SmartScreen("smartScreen"),
    CustomTi("customTi"),
    MicrosoftDefenderForOffice365("microsoftDefenderForOffice365"),
    AutomatedInvestigation("automatedInvestigation"),
    MicrosoftThreatExperts("microsoftThreatExperts"),
    CustomDetection("customDetection"),
    MicrosoftDefenderForIdentity("microsoftDefenderForIdentity"),
    CloudAppSecurity("cloudAppSecurity"),
    Microsoft365Defender("microsoft365Defender"),
    AzureAdIdentityProtection("azureAdIdentityProtection"),
    Manual("manual"),
    MicrosoftDataLossPrevention("microsoftDataLossPrevention"),
    AppGovernancePolicy("appGovernancePolicy"),
    AppGovernanceDetection("appGovernanceDetection"),
    UnknownFutureValue("unknownFutureValue"),
    MicrosoftDefenderForCloud("microsoftDefenderForCloud");
    public final String value;
    DetectionSource(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DetectionSource forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "microsoftDefenderForEndpoint": return MicrosoftDefenderForEndpoint;
            case "antivirus": return Antivirus;
            case "smartScreen": return SmartScreen;
            case "customTi": return CustomTi;
            case "microsoftDefenderForOffice365": return MicrosoftDefenderForOffice365;
            case "automatedInvestigation": return AutomatedInvestigation;
            case "microsoftThreatExperts": return MicrosoftThreatExperts;
            case "customDetection": return CustomDetection;
            case "microsoftDefenderForIdentity": return MicrosoftDefenderForIdentity;
            case "cloudAppSecurity": return CloudAppSecurity;
            case "microsoft365Defender": return Microsoft365Defender;
            case "azureAdIdentityProtection": return AzureAdIdentityProtection;
            case "manual": return Manual;
            case "microsoftDataLossPrevention": return MicrosoftDataLossPrevention;
            case "appGovernancePolicy": return AppGovernancePolicy;
            case "appGovernanceDetection": return AppGovernanceDetection;
            case "unknownFutureValue": return UnknownFutureValue;
            case "microsoftDefenderForCloud": return MicrosoftDefenderForCloud;
            default: return null;
        }
    }
}
