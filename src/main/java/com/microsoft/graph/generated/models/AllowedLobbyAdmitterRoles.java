package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AllowedLobbyAdmitterRoles implements ValuedEnum {
    OrganizerAndCoOrganizersAndPresenters("organizerAndCoOrganizersAndPresenters"),
    OrganizerAndCoOrganizers("organizerAndCoOrganizers"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AllowedLobbyAdmitterRoles(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AllowedLobbyAdmitterRoles forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "organizerAndCoOrganizersAndPresenters": return OrganizerAndCoOrganizersAndPresenters;
            case "organizerAndCoOrganizers": return OrganizerAndCoOrganizers;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
