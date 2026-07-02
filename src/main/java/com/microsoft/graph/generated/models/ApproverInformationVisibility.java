package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ApproverInformationVisibility implements ValuedEnum {
    Default("default"),
    NotVisible("notVisible"),
    Visible("visible"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ApproverInformationVisibility(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ApproverInformationVisibility forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default;
            case "notVisible": return NotVisible;
            case "visible": return Visible;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
