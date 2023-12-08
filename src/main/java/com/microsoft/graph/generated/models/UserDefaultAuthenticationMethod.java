package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserDefaultAuthenticationMethod implements ValuedEnum {
    Push("push"),
    Oath("oath"),
    VoiceMobile("voiceMobile"),
    VoiceAlternateMobile("voiceAlternateMobile"),
    VoiceOffice("voiceOffice"),
    Sms("sms"),
    None("none"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserDefaultAuthenticationMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserDefaultAuthenticationMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "push": return Push;
            case "oath": return Oath;
            case "voiceMobile": return VoiceMobile;
            case "voiceAlternateMobile": return VoiceAlternateMobile;
            case "voiceOffice": return VoiceOffice;
            case "sms": return Sms;
            case "none": return None;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
