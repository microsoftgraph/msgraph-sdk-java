package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccessPackageSubjectLifecycle implements ValuedEnum {
    NotDefined("notDefined"),
    NotGoverned("notGoverned"),
    Governed("governed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessPackageSubjectLifecycle(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessPackageSubjectLifecycle forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notDefined": return NotDefined;
            case "notGoverned": return NotGoverned;
            case "governed": return Governed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
