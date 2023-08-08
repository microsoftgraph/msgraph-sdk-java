package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ObjectDefinitionMetadata implements ValuedEnum {
    PropertyNameAccountEnabled("PropertyNameAccountEnabled"),
    PropertyNameSoftDeleted("PropertyNameSoftDeleted"),
    IsSoftDeletionSupported("IsSoftDeletionSupported"),
    IsSynchronizeAllSupported("IsSynchronizeAllSupported"),
    ConnectorDataStorageRequired("ConnectorDataStorageRequired"),
    Extensions("Extensions"),
    BaseObjectName("BaseObjectName");
    public final String value;
    ObjectDefinitionMetadata(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ObjectDefinitionMetadata forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "PropertyNameAccountEnabled": return PropertyNameAccountEnabled;
            case "PropertyNameSoftDeleted": return PropertyNameSoftDeleted;
            case "IsSoftDeletionSupported": return IsSoftDeletionSupported;
            case "IsSynchronizeAllSupported": return IsSynchronizeAllSupported;
            case "ConnectorDataStorageRequired": return ConnectorDataStorageRequired;
            case "Extensions": return Extensions;
            case "BaseObjectName": return BaseObjectName;
            default: return null;
        }
    }
}
