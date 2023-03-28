package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum RegistryHive implements ValuedEnum {
    Unknown("unknown"),
    CurrentConfig("currentConfig"),
    CurrentUser("currentUser"),
    LocalMachineSam("localMachineSam"),
    LocalMachineSecurity("localMachineSecurity"),
    LocalMachineSoftware("localMachineSoftware"),
    LocalMachineSystem("localMachineSystem"),
    UsersDefault("usersDefault"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RegistryHive(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RegistryHive forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "currentConfig": return CurrentConfig;
            case "currentUser": return CurrentUser;
            case "localMachineSam": return LocalMachineSam;
            case "localMachineSecurity": return LocalMachineSecurity;
            case "localMachineSoftware": return LocalMachineSoftware;
            case "localMachineSystem": return LocalMachineSystem;
            case "usersDefault": return UsersDefault;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
