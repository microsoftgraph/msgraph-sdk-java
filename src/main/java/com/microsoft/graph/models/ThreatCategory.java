package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ThreatCategory implements ValuedEnum {
    Undefined("undefined"),
    Spam("spam"),
    Phishing("phishing"),
    Malware("malware"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ThreatCategory(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ThreatCategory forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "undefined": return Undefined;
            case "spam": return Spam;
            case "phishing": return Phishing;
            case "malware": return Malware;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
