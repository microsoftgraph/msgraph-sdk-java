package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VideoCodec implements ValuedEnum {
    Unknown("unknown"),
    Invalid("invalid"),
    Av1("av1"),
    H263("h263"),
    H264("h264"),
    H264s("h264s"),
    H264uc("h264uc"),
    H265("h265"),
    Rtvc1("rtvc1"),
    RtVideo("rtVideo"),
    Xrtvc1("xrtvc1"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    VideoCodec(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VideoCodec forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "invalid": return Invalid;
            case "av1": return Av1;
            case "h263": return H263;
            case "h264": return H264;
            case "h264s": return H264s;
            case "h264uc": return H264uc;
            case "h265": return H265;
            case "rtvc1": return Rtvc1;
            case "rtVideo": return RtVideo;
            case "xrtvc1": return Xrtvc1;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
