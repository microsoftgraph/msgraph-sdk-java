package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the appCatalogs singleton. */
public enum TeamsAppDistributionMethod implements ValuedEnum {
    Store("store"),
    Organization("organization"),
    Sideloaded("sideloaded"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamsAppDistributionMethod(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TeamsAppDistributionMethod forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "store": return Store;
            case "organization": return Organization;
            case "sideloaded": return Sideloaded;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
