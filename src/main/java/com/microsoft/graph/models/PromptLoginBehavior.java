package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PromptLoginBehavior implements ValuedEnum {
    TranslateToFreshPasswordAuthentication("translateToFreshPasswordAuthentication"),
    NativeSupport("nativeSupport"),
    Disabled("disabled"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PromptLoginBehavior(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PromptLoginBehavior forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "translateToFreshPasswordAuthentication": return TranslateToFreshPasswordAuthentication;
            case "nativeSupport": return NativeSupport;
            case "disabled": return Disabled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
