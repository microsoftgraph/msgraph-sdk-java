package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OnenoteSourceService implements ValuedEnum {
    Unknown("Unknown"),
    OneDrive("OneDrive"),
    OneDriveForBusiness("OneDriveForBusiness"),
    OnPremOneDriveForBusiness("OnPremOneDriveForBusiness");
    public final String value;
    OnenoteSourceService(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OnenoteSourceService forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Unknown": return Unknown;
            case "OneDrive": return OneDrive;
            case "OneDriveForBusiness": return OneDriveForBusiness;
            case "OnPremOneDriveForBusiness": return OnPremOneDriveForBusiness;
            default: return null;
        }
    }
}
