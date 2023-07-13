package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ContentFormat implements ValuedEnum {
    Text("text"),
    Html("html"),
    Markdown("markdown"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ContentFormat(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ContentFormat forValue(@javax.annotation.Nonnull final String searchValue) {
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
