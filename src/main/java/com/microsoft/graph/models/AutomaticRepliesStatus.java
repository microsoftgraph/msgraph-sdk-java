package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AutomaticRepliesStatus implements ValuedEnum {
    Disabled("disabled"),
    AlwaysEnabled("alwaysEnabled"),
    Scheduled("scheduled");
    public final String value;
    AutomaticRepliesStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AutomaticRepliesStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "disabled": return Disabled;
            case "alwaysEnabled": return AlwaysEnabled;
            case "scheduled": return Scheduled;
            default: return null;
        }
    }
}
