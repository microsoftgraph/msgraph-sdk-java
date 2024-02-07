package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ContentFormat implements ValuedEnum {
    Text("text"),
    Html("html"),
    Markdown("markdown"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ContentFormat(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ContentFormat forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "text": return Text;
            case "html": return Html;
            case "markdown": return Markdown;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
