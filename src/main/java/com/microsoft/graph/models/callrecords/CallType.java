package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the cloudCommunications singleton. */
public enum CallType implements ValuedEnum {
    Unknown("unknown"),
    GroupCall("groupCall"),
    PeerToPeer("peerToPeer"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CallType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CallType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "groupCall": return GroupCall;
            case "peerToPeer": return PeerToPeer;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
