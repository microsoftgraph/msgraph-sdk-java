package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WellknownListName implements ValuedEnum {
    None("none"),
    DefaultList("defaultList"),
    FlaggedEmails("flaggedEmails"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WellknownListName(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WellknownListName forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "defaultList": return DefaultList;
            case "flaggedEmails": return FlaggedEmails;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
