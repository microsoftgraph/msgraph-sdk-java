package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SharingCapabilities implements ValuedEnum {
    Disabled("disabled"),
    ExternalUserSharingOnly("externalUserSharingOnly"),
    ExternalUserAndGuestSharing("externalUserAndGuestSharing"),
    ExistingExternalUserSharingOnly("existingExternalUserSharingOnly"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SharingCapabilities(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SharingCapabilities forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "disabled": return Disabled;
            case "externalUserSharingOnly": return ExternalUserSharingOnly;
            case "externalUserAndGuestSharing": return ExternalUserAndGuestSharing;
            case "existingExternalUserSharingOnly": return ExistingExternalUserSharingOnly;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
