package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EducationModuleStatus implements ValuedEnum {
    Draft("draft"),
    Published("published"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EducationModuleStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EducationModuleStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "draft": return Draft;
            case "published": return Published;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
