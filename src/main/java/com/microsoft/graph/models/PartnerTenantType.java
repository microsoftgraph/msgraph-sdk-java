package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PartnerTenantType implements ValuedEnum {
    MicrosoftSupport("microsoftSupport"),
    SyndicatePartner("syndicatePartner"),
    BreadthPartner("breadthPartner"),
    BreadthPartnerDelegatedAdmin("breadthPartnerDelegatedAdmin"),
    ResellerPartnerDelegatedAdmin("resellerPartnerDelegatedAdmin"),
    ValueAddedResellerPartnerDelegatedAdmin("valueAddedResellerPartnerDelegatedAdmin"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PartnerTenantType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PartnerTenantType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "microsoftSupport": return MicrosoftSupport;
            case "syndicatePartner": return SyndicatePartner;
            case "breadthPartner": return BreadthPartner;
            case "breadthPartnerDelegatedAdmin": return BreadthPartnerDelegatedAdmin;
            case "resellerPartnerDelegatedAdmin": return ResellerPartnerDelegatedAdmin;
            case "valueAddedResellerPartnerDelegatedAdmin": return ValueAddedResellerPartnerDelegatedAdmin;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
