package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum FreeBusyStatus implements ValuedEnum {
    Unknown("unknown"),
    Free("free"),
    Tentative("tentative"),
    Busy("busy"),
    Oof("oof"),
    WorkingElsewhere("workingElsewhere");
    public final String value;
    FreeBusyStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static FreeBusyStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "free": return Free;
            case "tentative": return Tentative;
            case "busy": return Busy;
            case "oof": return Oof;
            case "workingElsewhere": return WorkingElsewhere;
            default: return null;
        }
    }
}
