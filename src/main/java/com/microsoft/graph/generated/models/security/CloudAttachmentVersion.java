package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudAttachmentVersion implements ValuedEnum {
    Latest("latest"),
    Recent10("recent10"),
    Recent100("recent100"),
    All("all"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudAttachmentVersion(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudAttachmentVersion forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "latest": return Latest;
            case "recent10": return Recent10;
            case "recent100": return Recent100;
            case "all": return All;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
