package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum UserSignInRecommendationScope implements ValuedEnum {
    Tenant("tenant"),
    Application("application"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserSignInRecommendationScope(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static UserSignInRecommendationScope forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "tenant": return Tenant;
            case "application": return Application;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
