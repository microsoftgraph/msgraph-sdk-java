package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum DirectoryDefinitionDiscoverabilities implements ValuedEnum {
    None("None"),
    AttributeNames("AttributeNames"),
    AttributeDataTypes("AttributeDataTypes"),
    AttributeReadOnly("AttributeReadOnly"),
    ReferenceAttributes("ReferenceAttributes"),
    UnknownFutureValue("UnknownFutureValue");
    public final String value;
    DirectoryDefinitionDiscoverabilities(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DirectoryDefinitionDiscoverabilities forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "None": return None;
            case "AttributeNames": return AttributeNames;
            case "AttributeDataTypes": return AttributeDataTypes;
            case "AttributeReadOnly": return AttributeReadOnly;
            case "ReferenceAttributes": return ReferenceAttributes;
            case "UnknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
