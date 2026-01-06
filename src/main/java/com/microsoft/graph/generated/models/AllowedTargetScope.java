package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AllowedTargetScope implements ValuedEnum {
    NotSpecified("notSpecified"),
    SpecificDirectoryUsers("specificDirectoryUsers"),
    SpecificConnectedOrganizationUsers("specificConnectedOrganizationUsers"),
    SpecificDirectoryServicePrincipals("specificDirectoryServicePrincipals"),
    AllMemberUsers("allMemberUsers"),
    AllDirectoryUsers("allDirectoryUsers"),
    AllDirectoryServicePrincipals("allDirectoryServicePrincipals"),
    AllConfiguredConnectedOrganizationUsers("allConfiguredConnectedOrganizationUsers"),
    AllExternalUsers("allExternalUsers"),
    AllDirectoryAgentIdentities("allDirectoryAgentIdentities"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AllowedTargetScope(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AllowedTargetScope forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notSpecified": return NotSpecified;
            case "specificDirectoryUsers": return SpecificDirectoryUsers;
            case "specificConnectedOrganizationUsers": return SpecificConnectedOrganizationUsers;
            case "specificDirectoryServicePrincipals": return SpecificDirectoryServicePrincipals;
            case "allMemberUsers": return AllMemberUsers;
            case "allDirectoryUsers": return AllDirectoryUsers;
            case "allDirectoryServicePrincipals": return AllDirectoryServicePrincipals;
            case "allConfiguredConnectedOrganizationUsers": return AllConfiguredConnectedOrganizationUsers;
            case "allExternalUsers": return AllExternalUsers;
            case "allDirectoryAgentIdentities": return AllDirectoryAgentIdentities;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
