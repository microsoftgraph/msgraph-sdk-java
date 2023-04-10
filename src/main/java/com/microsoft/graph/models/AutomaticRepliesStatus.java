package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AutomaticRepliesStatus implements ValuedEnum {
    Disabled("disabled"),
    AlwaysEnabled("alwaysEnabled"),
    Scheduled("scheduled");
    public final String value;
    AutomaticRepliesStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AutomaticRepliesStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "disabled": return Disabled;
            case "alwaysEnabled": return AlwaysEnabled;
            case "scheduled": return Scheduled;
            default: return null;
        }
    }
}
