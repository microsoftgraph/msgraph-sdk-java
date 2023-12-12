package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BehaviorDuringRetentionPeriod implements ValuedEnum {
    DoNotRetain("doNotRetain"),
    Retain("retain"),
    RetainAsRecord("retainAsRecord"),
    RetainAsRegulatoryRecord("retainAsRegulatoryRecord"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BehaviorDuringRetentionPeriod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BehaviorDuringRetentionPeriod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "doNotRetain": return DoNotRetain;
            case "retain": return Retain;
            case "retainAsRecord": return RetainAsRecord;
            case "retainAsRegulatoryRecord": return RetainAsRegulatoryRecord;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
