package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ConditionalAccessClientApp implements ValuedEnum {
    All("all"),
    Browser("browser"),
    MobileAppsAndDesktopClients("mobileAppsAndDesktopClients"),
    ExchangeActiveSync("exchangeActiveSync"),
    EasSupported("easSupported"),
    Other("other"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConditionalAccessClientApp(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConditionalAccessClientApp forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "all": return All;
            case "browser": return Browser;
            case "mobileAppsAndDesktopClients": return MobileAppsAndDesktopClients;
            case "exchangeActiveSync": return ExchangeActiveSync;
            case "easSupported": return EasSupported;
            case "other": return Other;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
