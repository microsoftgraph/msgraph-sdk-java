package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreementAcceptance entities. */
public enum EndpointType implements ValuedEnum {
    Default_escaped("default_escaped"),
    Voicemail("voicemail"),
    SkypeForBusiness("skypeForBusiness"),
    SkypeForBusinessVoipPhone("skypeForBusinessVoipPhone"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EndpointType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EndpointType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default_escaped;
            case "voicemail": return Voicemail;
            case "skypeForBusiness": return SkypeForBusiness;
            case "skypeForBusinessVoipPhone": return SkypeForBusinessVoipPhone;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
