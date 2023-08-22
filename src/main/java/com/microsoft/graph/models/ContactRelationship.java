package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ContactRelationship implements ValuedEnum {
    Parent("parent"),
    Relative("relative"),
    Aide("aide"),
    Doctor("doctor"),
    Guardian("guardian"),
    Child("child"),
    Other("other"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ContactRelationship(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ContactRelationship forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "parent": return Parent;
            case "relative": return Relative;
            case "aide": return Aide;
            case "doctor": return Doctor;
            case "guardian": return Guardian;
            case "child": return Child;
            case "other": return Other;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
