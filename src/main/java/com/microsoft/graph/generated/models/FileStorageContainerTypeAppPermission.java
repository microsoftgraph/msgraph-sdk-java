package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FileStorageContainerTypeAppPermission implements ValuedEnum {
    None("none"),
    ReadContent("readContent"),
    WriteContent("writeContent"),
    ManageContent("manageContent"),
    Create("create"),
    Delete("delete"),
    Read("read"),
    Write("write"),
    EnumeratePermissions("enumeratePermissions"),
    AddPermissions("addPermissions"),
    UpdatePermissions("updatePermissions"),
    DeletePermissions("deletePermissions"),
    DeleteOwnPermission("deleteOwnPermission"),
    ManagePermissions("managePermissions"),
    Full("full"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    FileStorageContainerTypeAppPermission(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FileStorageContainerTypeAppPermission forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "readContent": return ReadContent;
            case "writeContent": return WriteContent;
            case "manageContent": return ManageContent;
            case "create": return Create;
            case "delete": return Delete;
            case "read": return Read;
            case "write": return Write;
            case "enumeratePermissions": return EnumeratePermissions;
            case "addPermissions": return AddPermissions;
            case "updatePermissions": return UpdatePermissions;
            case "deletePermissions": return DeletePermissions;
            case "deleteOwnPermission": return DeleteOwnPermission;
            case "managePermissions": return ManagePermissions;
            case "full": return Full;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
