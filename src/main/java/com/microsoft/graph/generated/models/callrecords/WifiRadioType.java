package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WifiRadioType implements ValuedEnum {
    Unknown("unknown"),
    Wifi80211a("wifi80211a"),
    Wifi80211b("wifi80211b"),
    Wifi80211g("wifi80211g"),
    Wifi80211n("wifi80211n"),
    Wifi80211ac("wifi80211ac"),
    Wifi80211ax("wifi80211ax"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WifiRadioType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WifiRadioType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "wifi80211a": return Wifi80211a;
            case "wifi80211b": return Wifi80211b;
            case "wifi80211g": return Wifi80211g;
            case "wifi80211n": return Wifi80211n;
            case "wifi80211ac": return Wifi80211ac;
            case "wifi80211ax": return Wifi80211ax;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
