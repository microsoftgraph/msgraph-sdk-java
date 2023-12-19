package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SendDtmfCompletionReason implements ValuedEnum {
    Unknown("unknown"),
    CompletedSuccessfully("completedSuccessfully"),
    MediaOperationCanceled("mediaOperationCanceled"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SendDtmfCompletionReason(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SendDtmfCompletionReason forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "completedSuccessfully": return CompletedSuccessfully;
            case "mediaOperationCanceled": return MediaOperationCanceled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
