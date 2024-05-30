package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SiteArchiveStatus implements ValuedEnum {
    RecentlyArchived("recentlyArchived"),
    FullyArchived("fullyArchived"),
    Reactivating("reactivating"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SiteArchiveStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SiteArchiveStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "recentlyArchived": return RecentlyArchived;
            case "fullyArchived": return FullyArchived;
            case "reactivating": return Reactivating;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
