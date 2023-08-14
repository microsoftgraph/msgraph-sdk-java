package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum RiskEventType implements ValuedEnum {
    UnlikelyTravel("unlikelyTravel"),
    AnonymizedIPAddress("anonymizedIPAddress"),
    MaliciousIPAddress("maliciousIPAddress"),
    UnfamiliarFeatures("unfamiliarFeatures"),
    MalwareInfectedIPAddress("malwareInfectedIPAddress"),
    SuspiciousIPAddress("suspiciousIPAddress"),
    LeakedCredentials("leakedCredentials"),
    InvestigationsThreatIntelligence("investigationsThreatIntelligence"),
    Generic("generic"),
    AdminConfirmedUserCompromised("adminConfirmedUserCompromised"),
    McasImpossibleTravel("mcasImpossibleTravel"),
    McasSuspiciousInboxManipulationRules("mcasSuspiciousInboxManipulationRules"),
    InvestigationsThreatIntelligenceSigninLinked("investigationsThreatIntelligenceSigninLinked"),
    MaliciousIPAddressValidCredentialsBlockedIP("maliciousIPAddressValidCredentialsBlockedIP"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RiskEventType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RiskEventType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unlikelyTravel": return UnlikelyTravel;
            case "anonymizedIPAddress": return AnonymizedIPAddress;
            case "maliciousIPAddress": return MaliciousIPAddress;
            case "unfamiliarFeatures": return UnfamiliarFeatures;
            case "malwareInfectedIPAddress": return MalwareInfectedIPAddress;
            case "suspiciousIPAddress": return SuspiciousIPAddress;
            case "leakedCredentials": return LeakedCredentials;
            case "investigationsThreatIntelligence": return InvestigationsThreatIntelligence;
            case "generic": return Generic;
            case "adminConfirmedUserCompromised": return AdminConfirmedUserCompromised;
            case "mcasImpossibleTravel": return McasImpossibleTravel;
            case "mcasSuspiciousInboxManipulationRules": return McasSuspiciousInboxManipulationRules;
            case "investigationsThreatIntelligenceSigninLinked": return InvestigationsThreatIntelligenceSigninLinked;
            case "maliciousIPAddressValidCredentialsBlockedIP": return MaliciousIPAddressValidCredentialsBlockedIP;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
