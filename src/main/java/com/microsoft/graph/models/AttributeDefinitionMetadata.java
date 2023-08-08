package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AttributeDefinitionMetadata implements ValuedEnum {
    BaseAttributeName("BaseAttributeName"),
    ComplexObjectDefinition("ComplexObjectDefinition"),
    IsContainer("IsContainer"),
    IsCustomerDefined("IsCustomerDefined"),
    IsDomainQualified("IsDomainQualified"),
    LinkPropertyNames("LinkPropertyNames"),
    LinkTypeName("LinkTypeName"),
    MaximumLength("MaximumLength"),
    ReferencedProperty("ReferencedProperty");
    public final String value;
    AttributeDefinitionMetadata(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AttributeDefinitionMetadata forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "BaseAttributeName": return BaseAttributeName;
            case "ComplexObjectDefinition": return ComplexObjectDefinition;
            case "IsContainer": return IsContainer;
            case "IsCustomerDefined": return IsCustomerDefined;
            case "IsDomainQualified": return IsDomainQualified;
            case "LinkPropertyNames": return LinkPropertyNames;
            case "LinkTypeName": return LinkTypeName;
            case "MaximumLength": return MaximumLength;
            case "ReferencedProperty": return ReferencedProperty;
            default: return null;
        }
    }
}
