package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ProvisioningAction implements ValuedEnum {
    Other("other"),
    Create("create"),
    Delete("delete"),
    Disable("disable"),
    Update("update"),
    StagedDelete("stagedDelete"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ProvisioningAction(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ProvisioningAction forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "other": return Other;
            case "create": return Create;
            case "delete": return Delete;
            case "disable": return Disable;
            case "update": return Update;
            case "stagedDelete": return StagedDelete;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
