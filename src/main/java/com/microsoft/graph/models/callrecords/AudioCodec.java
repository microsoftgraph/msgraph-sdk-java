package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the cloudCommunications singleton. */
public enum AudioCodec implements ValuedEnum {
    Unknown("unknown"),
    Invalid("invalid"),
    Cn("cn"),
    Pcma("pcma"),
    Pcmu("pcmu"),
    AmrWide("amrWide"),
    G722("g722"),
    G7221("g7221"),
    G7221c("g7221c"),
    G729("g729"),
    MultiChannelAudio("multiChannelAudio"),
    Muchv2("muchv2"),
    Opus("opus"),
    Satin("satin"),
    SatinFullband("satinFullband"),
    RtAudio8("rtAudio8"),
    RtAudio16("rtAudio16"),
    Silk("silk"),
    SilkNarrow("silkNarrow"),
    SilkWide("silkWide"),
    Siren("siren"),
    XmsRta("xmsRta"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AudioCodec(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AudioCodec forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "invalid": return Invalid;
            case "cn": return Cn;
            case "pcma": return Pcma;
            case "pcmu": return Pcmu;
            case "amrWide": return AmrWide;
            case "g722": return G722;
            case "g7221": return G7221;
            case "g7221c": return G7221c;
            case "g729": return G729;
            case "multiChannelAudio": return MultiChannelAudio;
            case "muchv2": return Muchv2;
            case "opus": return Opus;
            case "satin": return Satin;
            case "satinFullband": return SatinFullband;
            case "rtAudio8": return RtAudio8;
            case "rtAudio16": return RtAudio16;
            case "silk": return Silk;
            case "silkNarrow": return SilkNarrow;
            case "silkWide": return SilkWide;
            case "siren": return Siren;
            case "xmsRta": return XmsRta;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
