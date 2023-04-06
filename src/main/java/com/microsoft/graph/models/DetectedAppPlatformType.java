package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Indicates the operating system / platform of the discovered application.  Some possible values are Windows, iOS, macOS. The default value is unknown (0). */
public enum DetectedAppPlatformType implements ValuedEnum {
    /** Default. Set to unknown when platform cannot be determined. */
    Unknown("unknown"),
    /** Indicates that the platform of the detected application is Windows. */
    Windows("windows"),
    /** Indicates that the platform of the detected application is Windows Mobile. */
    WindowsMobile("windowsMobile"),
    /** Indicates that the platform of the detected application is Windows Holographic. */
    WindowsHolographic("windowsHolographic"),
    /** Indicates that the platform of the detected application is iOS. */
    Ios("ios"),
    /** Indicates that the platform of the detected application is macOS. */
    MacOS("macOS"),
    /** Indicates that the platform of the detected application is ChromeOS. */
    ChromeOS("chromeOS"),
    /** Indicates that the platform of the detected application is Android open source project. */
    AndroidOSP("androidOSP"),
    /** Indicates that the platform of the detected application is Android device administrator. */
    AndroidDeviceAdministrator("androidDeviceAdministrator"),
    /** Indicates that the platform of the detected application is Android work profile. */
    AndroidWorkProfile("androidWorkProfile"),
    /** Indicates that the platform of the detected application is Android dedicated and fully managed. */
    AndroidDedicatedAndFullyManaged("androidDedicatedAndFullyManaged");
    public final String value;
    DetectedAppPlatformType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DetectedAppPlatformType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "windows": return Windows;
            case "windowsMobile": return WindowsMobile;
            case "windowsHolographic": return WindowsHolographic;
            case "ios": return Ios;
            case "macOS": return MacOS;
            case "chromeOS": return ChromeOS;
            case "androidOSP": return AndroidOSP;
            case "androidDeviceAdministrator": return AndroidDeviceAdministrator;
            case "androidWorkProfile": return AndroidWorkProfile;
            case "androidDedicatedAndFullyManaged": return AndroidDedicatedAndFullyManaged;
            default: return null;
        }
    }
}
