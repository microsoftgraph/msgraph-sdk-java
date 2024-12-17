package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SiteLockState implements ValuedEnum {
    Unlocked("unlocked"),
    LockedReadOnly("lockedReadOnly"),
    LockedNoAccess("lockedNoAccess"),
    LockedNoAdditions("lockedNoAdditions"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SiteLockState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SiteLockState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unlocked": return Unlocked;
            case "lockedReadOnly": return LockedReadOnly;
            case "lockedNoAccess": return LockedNoAccess;
            case "lockedNoAdditions": return LockedNoAdditions;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
