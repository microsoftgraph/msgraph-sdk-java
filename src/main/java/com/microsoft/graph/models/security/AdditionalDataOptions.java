package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AdditionalDataOptions implements ValuedEnum {
    AllVersions("allVersions"),
    LinkedFiles("linkedFiles"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AdditionalDataOptions(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AdditionalDataOptions forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allVersions": return AllVersions;
            case "linkedFiles": return LinkedFiles;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
