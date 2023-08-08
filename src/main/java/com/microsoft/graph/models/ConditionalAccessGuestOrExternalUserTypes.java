package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ConditionalAccessGuestOrExternalUserTypes implements ValuedEnum {
    None("none"),
    InternalGuest("internalGuest"),
    B2bCollaborationGuest("b2bCollaborationGuest"),
    B2bCollaborationMember("b2bCollaborationMember"),
    B2bDirectConnectUser("b2bDirectConnectUser"),
    OtherExternalUser("otherExternalUser"),
    ServiceProvider("serviceProvider"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConditionalAccessGuestOrExternalUserTypes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConditionalAccessGuestOrExternalUserTypes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "internalGuest": return InternalGuest;
            case "b2bCollaborationGuest": return B2bCollaborationGuest;
            case "b2bCollaborationMember": return B2bCollaborationMember;
            case "b2bDirectConnectUser": return B2bDirectConnectUser;
            case "otherExternalUser": return OtherExternalUser;
            case "serviceProvider": return ServiceProvider;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
