package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudAppSecuritySessionControlType implements ValuedEnum {
    McasConfigured("mcasConfigured"),
    MonitorOnly("monitorOnly"),
    BlockDownloads("blockDownloads"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudAppSecuritySessionControlType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudAppSecuritySessionControlType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "mcasConfigured": return McasConfigured;
            case "monitorOnly": return MonitorOnly;
            case "blockDownloads": return BlockDownloads;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
