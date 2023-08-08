package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PersistentBrowserSessionMode implements ValuedEnum {
    Always("always"),
    Never("never");
    public final String value;
    PersistentBrowserSessionMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PersistentBrowserSessionMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "always": return Always;
            case "never": return Never;
            default: return null;
        }
    }
}
