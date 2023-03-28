package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ClientPlatform implements ValuedEnum {
    Unknown("unknown"),
    Windows("windows"),
    MacOS("macOS"),
    IOS("iOS"),
    Android("android"),
    Web("web"),
    IpPhone("ipPhone"),
    RoomSystem("roomSystem"),
    SurfaceHub("surfaceHub"),
    HoloLens("holoLens"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ClientPlatform(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ClientPlatform forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "windows": return Windows;
            case "macOS": return MacOS;
            case "iOS": return IOS;
            case "android": return Android;
            case "web": return Web;
            case "ipPhone": return IpPhone;
            case "roomSystem": return RoomSystem;
            case "surfaceHub": return SurfaceHub;
            case "holoLens": return HoloLens;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
