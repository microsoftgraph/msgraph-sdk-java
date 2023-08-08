package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SensitivityLabelAssignmentMethod implements ValuedEnum {
    Standard("standard"),
    Privileged("privileged"),
    Auto("auto"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SensitivityLabelAssignmentMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SensitivityLabelAssignmentMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "standard": return Standard;
            case "privileged": return Privileged;
            case "auto": return Auto;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
