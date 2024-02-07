package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DelegateMeetingMessageDeliveryOptions implements ValuedEnum {
    SendToDelegateAndInformationToPrincipal("sendToDelegateAndInformationToPrincipal"),
    SendToDelegateAndPrincipal("sendToDelegateAndPrincipal"),
    SendToDelegateOnly("sendToDelegateOnly");
    public final String value;
    DelegateMeetingMessageDeliveryOptions(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DelegateMeetingMessageDeliveryOptions forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sendToDelegateAndInformationToPrincipal": return SendToDelegateAndInformationToPrincipal;
            case "sendToDelegateAndPrincipal": return SendToDelegateAndPrincipal;
            case "sendToDelegateOnly": return SendToDelegateOnly;
            default: return null;
        }
    }
}
