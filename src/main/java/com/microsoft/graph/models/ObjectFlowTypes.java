package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ObjectFlowTypes implements ValuedEnum {
    None("None"),
    Add("Add"),
    Update("Update"),
    Delete("Delete");
    public final String value;
    ObjectFlowTypes(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ObjectFlowTypes forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "None": return None;
            case "Add": return Add;
            case "Update": return Update;
            case "Delete": return Delete;
            default: return null;
        }
    }
}
