package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DataSourceScopes forValue(@javax.annotation.Nonnull final String searchValue) {
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
