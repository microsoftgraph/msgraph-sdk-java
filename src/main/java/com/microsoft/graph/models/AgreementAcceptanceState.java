package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AgreementAcceptanceState implements ValuedEnum {
    Accepted("accepted"),
    Declined("declined"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AgreementAcceptanceState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AgreementAcceptanceState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "accepted": return Accepted;
            case "declined": return Declined;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
