package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RetentionTrigger implements ValuedEnum {
    DateLabeled("dateLabeled"),
    DateCreated("dateCreated"),
    DateModified("dateModified"),
    DateOfEvent("dateOfEvent"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RetentionTrigger(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RetentionTrigger forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "dateLabeled": return DateLabeled;
            case "dateCreated": return DateCreated;
            case "dateModified": return DateModified;
            case "dateOfEvent": return DateOfEvent;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
