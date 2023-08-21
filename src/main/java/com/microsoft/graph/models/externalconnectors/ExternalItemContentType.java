package com.microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ExternalItemContentType implements ValuedEnum {
    Text("text"),
    Html("html"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ExternalItemContentType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ExternalItemContentType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "text": return Text;
            case "html": return Html;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
