package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VirtualEventRegistrationQuestionAnswerInputType implements ValuedEnum {
    Text("text"),
    MultilineText("multilineText"),
    SingleChoice("singleChoice"),
    MultiChoice("multiChoice"),
    Boolean("boolean"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    VirtualEventRegistrationQuestionAnswerInputType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VirtualEventRegistrationQuestionAnswerInputType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "text": return Text;
            case "multilineText": return MultilineText;
            case "singleChoice": return SingleChoice;
            case "multiChoice": return MultiChoice;
            case "boolean": return Boolean;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
