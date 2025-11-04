package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WebApplicationFirewallProviderType implements ValuedEnum {
    Akamai("akamai"),
    Cloudflare("cloudflare"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WebApplicationFirewallProviderType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WebApplicationFirewallProviderType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "akamai": return Akamai;
            case "cloudflare": return Cloudflare;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
