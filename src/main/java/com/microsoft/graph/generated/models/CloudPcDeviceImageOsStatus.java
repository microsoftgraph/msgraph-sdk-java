package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcDeviceImageOsStatus implements ValuedEnum {
    Supported("supported"),
    SupportedWithWarning("supportedWithWarning"),
    Unknown("unknown"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcDeviceImageOsStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcDeviceImageOsStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "supported": return Supported;
            case "supportedWithWarning": return SupportedWithWarning;
            case "unknown": return Unknown;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
