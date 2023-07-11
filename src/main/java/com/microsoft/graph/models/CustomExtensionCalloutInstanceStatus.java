package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CustomExtensionCalloutInstanceStatus implements ValuedEnum {
    CalloutSent("calloutSent"),
    CallbackReceived("callbackReceived"),
    CalloutFailed("calloutFailed"),
    CallbackTimedOut("callbackTimedOut"),
    WaitingForCallback("waitingForCallback"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CustomExtensionCalloutInstanceStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CustomExtensionCalloutInstanceStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "calloutSent": return CalloutSent;
            case "callbackReceived": return CallbackReceived;
            case "calloutFailed": return CalloutFailed;
            case "callbackTimedOut": return CallbackTimedOut;
            case "waitingForCallback": return WaitingForCallback;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
