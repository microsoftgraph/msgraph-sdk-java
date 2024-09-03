package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BackupServiceStatus implements ValuedEnum {
    Disabled("disabled"),
    Enabled("enabled"),
    ProtectionChangeLocked("protectionChangeLocked"),
    RestoreLocked("restoreLocked"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BackupServiceStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BackupServiceStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "disabled": return Disabled;
            case "enabled": return Enabled;
            case "protectionChangeLocked": return ProtectionChangeLocked;
            case "restoreLocked": return RestoreLocked;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
