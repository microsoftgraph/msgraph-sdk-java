package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AccessPackageAssignmentState implements ValuedEnum {
    Delivering("delivering"),
    PartiallyDelivered("partiallyDelivered"),
    Delivered("delivered"),
    Expired("expired"),
    DeliveryFailed("deliveryFailed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessPackageAssignmentState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessPackageAssignmentState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "delivering": return Delivering;
            case "partiallyDelivered": return PartiallyDelivered;
            case "delivered": return Delivered;
            case "expired": return Expired;
            case "deliveryFailed": return DeliveryFailed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
