package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum OnlineMeetingProviderType implements ValuedEnum {
    Unknown("unknown"),
    SkypeForBusiness("skypeForBusiness"),
    SkypeForConsumer("skypeForConsumer"),
    TeamsForBusiness("teamsForBusiness");
    public final String value;
    OnlineMeetingProviderType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OnlineMeetingProviderType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "skypeForBusiness": return SkypeForBusiness;
            case "skypeForConsumer": return SkypeForConsumer;
            case "teamsForBusiness": return TeamsForBusiness;
            default: return null;
        }
    }
}
