package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeliveryLocation implements ValuedEnum {
    Unknown("unknown"),
    Inbox_folder("inbox_folder"),
    JunkFolder("junkFolder"),
    DeletedFolder("deletedFolder"),
    Quarantine("quarantine"),
    Onprem_external("onprem_external"),
    Failed("failed"),
    Dropped("dropped"),
    Others("others"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeliveryLocation(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeliveryLocation forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "inbox_folder": return Inbox_folder;
            case "junkFolder": return JunkFolder;
            case "deletedFolder": return DeletedFolder;
            case "quarantine": return Quarantine;
            case "onprem_external": return Onprem_external;
            case "failed": return Failed;
            case "dropped": return Dropped;
            case "others": return Others;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
