package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum IosUpdatesInstallStatus implements ValuedEnum {
    DeviceOsHigherThanDesiredOsVersion("deviceOsHigherThanDesiredOsVersion"),
    SharedDeviceUserLoggedInError("sharedDeviceUserLoggedInError"),
    NotSupportedOperation("notSupportedOperation"),
    InstallFailed("installFailed"),
    InstallPhoneCallInProgress("installPhoneCallInProgress"),
    InstallInsufficientPower("installInsufficientPower"),
    InstallInsufficientSpace("installInsufficientSpace"),
    Installing("installing"),
    DownloadInsufficientNetwork("downloadInsufficientNetwork"),
    DownloadInsufficientPower("downloadInsufficientPower"),
    DownloadInsufficientSpace("downloadInsufficientSpace"),
    DownloadRequiresComputer("downloadRequiresComputer"),
    DownloadFailed("downloadFailed"),
    Downloading("downloading"),
    Success("success"),
    Available("available"),
    Idle("idle"),
    Unknown("unknown");
    public final String value;
    IosUpdatesInstallStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static IosUpdatesInstallStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceOsHigherThanDesiredOsVersion": return DeviceOsHigherThanDesiredOsVersion;
            case "sharedDeviceUserLoggedInError": return SharedDeviceUserLoggedInError;
            case "notSupportedOperation": return NotSupportedOperation;
            case "installFailed": return InstallFailed;
            case "installPhoneCallInProgress": return InstallPhoneCallInProgress;
            case "installInsufficientPower": return InstallInsufficientPower;
            case "installInsufficientSpace": return InstallInsufficientSpace;
            case "installing": return Installing;
            case "downloadInsufficientNetwork": return DownloadInsufficientNetwork;
            case "downloadInsufficientPower": return DownloadInsufficientPower;
            case "downloadInsufficientSpace": return DownloadInsufficientSpace;
            case "downloadRequiresComputer": return DownloadRequiresComputer;
            case "downloadFailed": return DownloadFailed;
            case "downloading": return Downloading;
            case "success": return Success;
            case "available": return Available;
            case "idle": return Idle;
            case "unknown": return Unknown;
            default: return null;
        }
    }
}
