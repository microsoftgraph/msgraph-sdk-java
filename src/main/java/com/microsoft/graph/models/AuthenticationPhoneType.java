package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AuthenticationPhoneType implements ValuedEnum {
    Mobile("mobile"),
    AlternateMobile("alternateMobile"),
    Office("office"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuthenticationPhoneType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuthenticationPhoneType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "mobile": return Mobile;
            case "alternateMobile": return AlternateMobile;
            case "office": return Office;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
