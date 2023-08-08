package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CallState implements ValuedEnum {
    Incoming("incoming"),
    Establishing("establishing"),
    Established("established"),
    Hold("hold"),
    Transferring("transferring"),
    TransferAccepted("transferAccepted"),
    Redirecting("redirecting"),
    Terminating("terminating"),
    Terminated("terminated"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CallState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CallState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "incoming": return Incoming;
            case "establishing": return Establishing;
            case "established": return Established;
            case "hold": return Hold;
            case "transferring": return Transferring;
            case "transferAccepted": return TransferAccepted;
            case "redirecting": return Redirecting;
            case "terminating": return Terminating;
            case "terminated": return Terminated;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
