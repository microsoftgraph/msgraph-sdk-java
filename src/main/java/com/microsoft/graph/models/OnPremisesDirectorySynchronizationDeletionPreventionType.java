package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum OnPremisesDirectorySynchronizationDeletionPreventionType implements ValuedEnum {
    Disabled("disabled"),
    EnabledForCount("enabledForCount"),
    EnabledForPercentage("enabledForPercentage"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OnPremisesDirectorySynchronizationDeletionPreventionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OnPremisesDirectorySynchronizationDeletionPreventionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "disabled": return Disabled;
            case "enabledForCount": return EnabledForCount;
            case "enabledForPercentage": return EnabledForPercentage;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
