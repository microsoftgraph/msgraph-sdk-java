package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum NotificationDeliveryPreference implements ValuedEnum {
    Unknown("unknown"),
    DeliverImmedietly("deliverImmedietly"),
    DeliverAfterCampaignEnd("deliverAfterCampaignEnd"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    NotificationDeliveryPreference(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static NotificationDeliveryPreference forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "deliverImmedietly": return DeliverImmedietly;
            case "deliverAfterCampaignEnd": return DeliverAfterCampaignEnd;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
