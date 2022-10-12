package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum DelegateMeetingMessageDeliveryOptions implements ValuedEnum {
    SendToDelegateAndInformationToPrincipal("sendToDelegateAndInformationToPrincipal"),
    SendToDelegateAndPrincipal("sendToDelegateAndPrincipal"),
    SendToDelegateOnly("sendToDelegateOnly");
    public final String value;
    DelegateMeetingMessageDeliveryOptions(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DelegateMeetingMessageDeliveryOptions forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sendToDelegateAndInformationToPrincipal": return SendToDelegateAndInformationToPrincipal;
            case "sendToDelegateAndPrincipal": return SendToDelegateAndPrincipal;
            case "sendToDelegateOnly": return SendToDelegateOnly;
            default: return null;
        }
    }
}
