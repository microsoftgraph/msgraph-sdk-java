package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FileStorageContainerTypeSettingsOverride implements ValuedEnum {
    UrlTemplate("urlTemplate"),
    IsDiscoverabilityEnabled("isDiscoverabilityEnabled"),
    IsSearchEnabled("isSearchEnabled"),
    IsItemVersioningEnabled("isItemVersioningEnabled"),
    ItemMajorVersionLimit("itemMajorVersionLimit"),
    MaxStoragePerContainerInBytes("maxStoragePerContainerInBytes"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    FileStorageContainerTypeSettingsOverride(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FileStorageContainerTypeSettingsOverride forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "urlTemplate": return UrlTemplate;
            case "isDiscoverabilityEnabled": return IsDiscoverabilityEnabled;
            case "isSearchEnabled": return IsSearchEnabled;
            case "isItemVersioningEnabled": return IsItemVersioningEnabled;
            case "itemMajorVersionLimit": return ItemMajorVersionLimit;
            case "maxStoragePerContainerInBytes": return MaxStoragePerContainerInBytes;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
