package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DataSourceScopes implements ValuedEnum {
    None("none"),
    AllTenantMailboxes("allTenantMailboxes"),
    AllTenantSites("allTenantSites"),
    AllCaseCustodians("allCaseCustodians"),
    AllCaseNoncustodialDataSources("allCaseNoncustodialDataSources"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DataSourceScopes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DataSourceScopes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "allTenantMailboxes": return AllTenantMailboxes;
            case "allTenantSites": return AllTenantSites;
            case "allCaseCustodians": return AllCaseCustodians;
            case "allCaseNoncustodialDataSources": return AllCaseNoncustodialDataSources;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
