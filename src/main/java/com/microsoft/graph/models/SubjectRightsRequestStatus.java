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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SubjectRightsRequestStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "closed": return Closed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
