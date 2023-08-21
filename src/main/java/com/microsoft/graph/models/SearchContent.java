package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SearchContent implements ValuedEnum {
    SharedContent("sharedContent"),
    PrivateContent("privateContent"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SearchContent(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SearchContent forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sharedContent": return SharedContent;
            case "privateContent": return PrivateContent;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
