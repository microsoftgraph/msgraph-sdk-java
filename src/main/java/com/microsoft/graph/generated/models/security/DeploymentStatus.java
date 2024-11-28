package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeploymentStatus implements ValuedEnum {
    UpToDate("upToDate"),
    Outdated("outdated"),
    Updating("updating"),
    UpdateFailed("updateFailed"),
    NotConfigured("notConfigured"),
    Unreachable("unreachable"),
    Disconnected("disconnected"),
    StartFailure("startFailure"),
    Syncing("syncing"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeploymentStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeploymentStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "upToDate": return UpToDate;
            case "outdated": return Outdated;
            case "updating": return Updating;
            case "updateFailed": return UpdateFailed;
            case "notConfigured": return NotConfigured;
            case "unreachable": return Unreachable;
            case "disconnected": return Disconnected;
            case "startFailure": return StartFailure;
            case "syncing": return Syncing;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
