package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreementAcceptance entities. */
public enum SignInFrequencyInterval implements ValuedEnum {
    TimeBased("timeBased"),
    EveryTime("everyTime"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SignInFrequencyInterval(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SignInFrequencyInterval forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "timeBased": return TimeBased;
            case "everyTime": return EveryTime;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
