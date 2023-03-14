package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AnswerInputType implements ValuedEnum {
    Text("text"),
    RadioButton("radioButton"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AnswerInputType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AnswerInputType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "text": return Text;
            case "radioButton": return RadioButton;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
