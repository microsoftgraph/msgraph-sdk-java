package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the auditLogRoot singleton. */
public enum GroupType implements ValuedEnum {
    UnifiedGroups("unifiedGroups"),
    AzureAD("azureAD"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    GroupType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static GroupType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unifiedGroups": return UnifiedGroups;
            case "azureAD": return AzureAD;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
