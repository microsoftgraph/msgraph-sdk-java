package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccessPackageRequestState implements ValuedEnum {
    Submitted("submitted"),
    PendingApproval("pendingApproval"),
    Delivering("delivering"),
    Delivered("delivered"),
    DeliveryFailed("deliveryFailed"),
    Denied("denied"),
    Scheduled("scheduled"),
    Canceled("canceled"),
    PartiallyDelivered("partiallyDelivered"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessPackageRequestState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessPackageRequestState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "submitted": return Submitted;
            case "pendingApproval": return PendingApproval;
            case "delivering": return Delivering;
            case "delivered": return Delivered;
            case "deliveryFailed": return DeliveryFailed;
            case "denied": return Denied;
            case "scheduled": return Scheduled;
            case "canceled": return Canceled;
            case "partiallyDelivered": return PartiallyDelivered;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
