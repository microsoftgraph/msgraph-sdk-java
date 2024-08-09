package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ClickSource implements ValuedEnum {
    Unknown("unknown"),
    QrCode("qrCode"),
    PhishingUrl("phishingUrl"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ClickSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ClickSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "qrCode": return QrCode;
            case "phishingUrl": return PhishingUrl;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
