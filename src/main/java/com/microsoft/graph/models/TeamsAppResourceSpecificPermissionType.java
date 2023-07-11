package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum TeamsAppResourceSpecificPermissionType implements ValuedEnum {
    Delegated("delegated"),
    Application("application"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamsAppResourceSpecificPermissionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TeamsAppResourceSpecificPermissionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "delegated": return Delegated;
            case "application": return Application;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
