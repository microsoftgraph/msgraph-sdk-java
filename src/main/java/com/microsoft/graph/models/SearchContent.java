package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SearchContent implements ValuedEnum {
    SharedContent("sharedContent"),
    PrivateContent("privateContent"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SearchContent(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SearchContent forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sharedContent": return SharedContent;
            case "privateContent": return PrivateContent;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
