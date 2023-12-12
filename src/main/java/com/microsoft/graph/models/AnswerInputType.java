package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AnswerInputType implements ValuedEnum {
    Text("text"),
    RadioButton("radioButton"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AnswerInputType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AnswerInputType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "text": return Text;
            case "radioButton": return RadioButton;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
