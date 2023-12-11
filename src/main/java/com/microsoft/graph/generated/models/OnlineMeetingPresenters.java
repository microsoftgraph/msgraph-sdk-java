package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OnlineMeetingPresenters implements ValuedEnum {
    Everyone("everyone"),
    Organization("organization"),
    RoleIsPresenter("roleIsPresenter"),
    Organizer("organizer"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OnlineMeetingPresenters(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OnlineMeetingPresenters forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "everyone": return Everyone;
            case "organization": return Organization;
            case "roleIsPresenter": return RoleIsPresenter;
            case "organizer": return Organizer;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
