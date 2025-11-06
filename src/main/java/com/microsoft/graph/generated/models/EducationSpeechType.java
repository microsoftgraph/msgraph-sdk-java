package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EducationSpeechType implements ValuedEnum {
    Informative("informative"),
    Personal("personal"),
    Persuasive("persuasive"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EducationSpeechType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EducationSpeechType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "informative": return Informative;
            case "personal": return Personal;
            case "persuasive": return Persuasive;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
