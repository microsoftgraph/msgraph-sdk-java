package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SubjectRightsRequestStatus implements ValuedEnum {
    Active("active"),
    Closed("closed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SubjectRightsRequestStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SubjectRightsRequestStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "closed": return Closed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
