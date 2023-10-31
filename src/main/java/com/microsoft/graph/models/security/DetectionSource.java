package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
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
    MicrosoftDefenderForCloud("microsoftDefenderForCloud"),
    MicrosoftDefenderForIoT("microsoftDefenderForIoT"),
    MicrosoftDefenderForServers("microsoftDefenderForServers"),
    MicrosoftDefenderForStorage("microsoftDefenderForStorage"),
    MicrosoftDefenderForDNS("microsoftDefenderForDNS"),
    MicrosoftDefenderForDatabases("microsoftDefenderForDatabases"),
    MicrosoftDefenderForContainers("microsoftDefenderForContainers"),
    MicrosoftDefenderForNetwork("microsoftDefenderForNetwork"),
    MicrosoftDefenderForAppService("microsoftDefenderForAppService"),
    MicrosoftDefenderForKeyVault("microsoftDefenderForKeyVault"),
    MicrosoftDefenderForResourceManager("microsoftDefenderForResourceManager"),
    MicrosoftDefenderForApiManagement("microsoftDefenderForApiManagement"),
    NrtAlerts("nrtAlerts"),
    ScheduledAlerts("scheduledAlerts"),
    MicrosoftDefenderThreatIntelligenceAnalytics("microsoftDefenderThreatIntelligenceAnalytics"),
    BuiltInMl("builtInMl"),
    MicrosoftSentinel("microsoftSentinel");
    public final String value;
    DetectionSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DetectionSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
            case "microsoftDefenderForIoT": return MicrosoftDefenderForIoT;
            case "microsoftDefenderForServers": return MicrosoftDefenderForServers;
            case "microsoftDefenderForStorage": return MicrosoftDefenderForStorage;
            case "microsoftDefenderForDNS": return MicrosoftDefenderForDNS;
            case "microsoftDefenderForDatabases": return MicrosoftDefenderForDatabases;
            case "microsoftDefenderForContainers": return MicrosoftDefenderForContainers;
            case "microsoftDefenderForNetwork": return MicrosoftDefenderForNetwork;
            case "microsoftDefenderForAppService": return MicrosoftDefenderForAppService;
            case "microsoftDefenderForKeyVault": return MicrosoftDefenderForKeyVault;
            case "microsoftDefenderForResourceManager": return MicrosoftDefenderForResourceManager;
            case "microsoftDefenderForApiManagement": return MicrosoftDefenderForApiManagement;
            case "nrtAlerts": return NrtAlerts;
            case "scheduledAlerts": return ScheduledAlerts;
            case "microsoftDefenderThreatIntelligenceAnalytics": return MicrosoftDefenderThreatIntelligenceAnalytics;
            case "builtInMl": return BuiltInMl;
            case "microsoftSentinel": return MicrosoftSentinel;
            default: return null;
        }
    }
}
