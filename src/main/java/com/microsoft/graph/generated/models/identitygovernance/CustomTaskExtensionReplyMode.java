package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CustomTaskExtensionReplyMode implements ValuedEnum {
    None("none"),
    Callback("callback"),
    Response("response"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CustomTaskExtensionReplyMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CustomTaskExtensionReplyMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "callback": return Callback;
            case "response": return Response;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
