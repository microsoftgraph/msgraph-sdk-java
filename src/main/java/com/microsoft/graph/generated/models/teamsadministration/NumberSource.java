package com.microsoft.graph.models.teamsadministration;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum NumberSource implements ValuedEnum {
    Online("online"),
    OnPremises("onPremises"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    NumberSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static NumberSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "online": return Online;
            case "onPremises": return OnPremises;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
