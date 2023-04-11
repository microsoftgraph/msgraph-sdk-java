package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SharingDomainRestrictionMode implements ValuedEnum {
    None("none"),
    AllowList("allowList"),
    BlockList("blockList"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SharingDomainRestrictionMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SharingDomainRestrictionMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "allowList": return AllowList;
            case "blockList": return BlockList;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
