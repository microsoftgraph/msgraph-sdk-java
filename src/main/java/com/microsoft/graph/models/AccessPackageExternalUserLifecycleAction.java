package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AccessPackageExternalUserLifecycleAction implements ValuedEnum {
    None("none"),
    BlockSignIn("blockSignIn"),
    BlockSignInAndDelete("blockSignInAndDelete"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessPackageExternalUserLifecycleAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessPackageExternalUserLifecycleAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "blockSignIn": return BlockSignIn;
            case "blockSignInAndDelete": return BlockSignInAndDelete;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
