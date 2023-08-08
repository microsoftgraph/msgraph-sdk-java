package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ThreatAssessmentContentType implements ValuedEnum {
    Mail("mail"),
    Url("url"),
    File("file");
    public final String value;
    ThreatAssessmentContentType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ThreatAssessmentContentType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "mail": return Mail;
            case "url": return Url;
            case "file": return File;
            default: return null;
        }
    }
}
