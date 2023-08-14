package com.microsoft.graph.models.termstore;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum TermGroupScope implements ValuedEnum {
    Global("global"),
    System("system"),
    SiteCollection("siteCollection"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TermGroupScope(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TermGroupScope forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "global": return Global;
            case "system": return System;
            case "siteCollection": return SiteCollection;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
