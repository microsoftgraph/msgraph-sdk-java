package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WhatIfAnalysisReasons implements ValuedEnum {
    NotSet("notSet"),
    NotEnoughInformation("notEnoughInformation"),
    InvalidCondition("invalidCondition"),
    Users("users"),
    WorkloadIdentities("workloadIdentities"),
    Application("application"),
    UserActions("userActions"),
    AuthenticationContext("authenticationContext"),
    DevicePlatform("devicePlatform"),
    Devices("devices"),
    ClientApps("clientApps"),
    Location("location"),
    SignInRisk("signInRisk"),
    EmptyPolicy("emptyPolicy"),
    InvalidPolicy("invalidPolicy"),
    PolicyNotEnabled("policyNotEnabled"),
    UserRisk("userRisk"),
    Time("time"),
    InsiderRisk("insiderRisk"),
    AuthenticationFlow("authenticationFlow"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WhatIfAnalysisReasons(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WhatIfAnalysisReasons forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notSet": return NotSet;
            case "notEnoughInformation": return NotEnoughInformation;
            case "invalidCondition": return InvalidCondition;
            case "users": return Users;
            case "workloadIdentities": return WorkloadIdentities;
            case "application": return Application;
            case "userActions": return UserActions;
            case "authenticationContext": return AuthenticationContext;
            case "devicePlatform": return DevicePlatform;
            case "devices": return Devices;
            case "clientApps": return ClientApps;
            case "location": return Location;
            case "signInRisk": return SignInRisk;
            case "emptyPolicy": return EmptyPolicy;
            case "invalidPolicy": return InvalidPolicy;
            case "policyNotEnabled": return PolicyNotEnabled;
            case "userRisk": return UserRisk;
            case "time": return Time;
            case "insiderRisk": return InsiderRisk;
            case "authenticationFlow": return AuthenticationFlow;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
