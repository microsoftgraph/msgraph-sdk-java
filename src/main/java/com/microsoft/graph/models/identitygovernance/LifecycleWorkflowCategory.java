package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum LifecycleWorkflowCategory implements ValuedEnum {
    Joiner("joiner"),
    Leaver("leaver"),
    UnknownFutureValue("unknownFutureValue"),
    Mover("mover");
    public final String value;
    LifecycleWorkflowCategory(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static LifecycleWorkflowCategory forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "joiner": return Joiner;
            case "leaver": return Leaver;
            case "unknownFutureValue": return UnknownFutureValue;
            case "mover": return Mover;
            default: return null;
        }
    }
}
