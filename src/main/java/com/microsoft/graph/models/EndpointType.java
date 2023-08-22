package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EndpointType implements ValuedEnum {
    Default("default"),
    Voicemail("voicemail"),
    SkypeForBusiness("skypeForBusiness"),
    SkypeForBusinessVoipPhone("skypeForBusinessVoipPhone"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EndpointType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EndpointType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default;
            case "voicemail": return Voicemail;
            case "skypeForBusiness": return SkypeForBusiness;
            case "skypeForBusinessVoipPhone": return SkypeForBusinessVoipPhone;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
