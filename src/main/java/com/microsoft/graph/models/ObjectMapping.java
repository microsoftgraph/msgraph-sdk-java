package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ObjectMapping implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Attribute mappings define which attributes to map from the source object into the target object and how they should flow. A number of functions are available to support the transformation of the original source values.
     */
    private java.util.List<AttributeMapping> attributeMappings;
    /**
     * When true, this object mapping will be processed during synchronization. When false, this object mapping will be skipped.
     */
    private Boolean enabled;
    /**
     * The flowTypes property
     */
    private EnumSet<ObjectFlowTypes> flowTypes;
    /**
     * Additional extension properties. Unless mentioned explicitly, metadata values should not be changed.
     */
    private java.util.List<ObjectMappingMetadataEntry> metadata;
    /**
     * Human-friendly name of the object mapping.
     */
    private String name;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Defines a filter to be used when deciding whether a given object should be provisioned. For example, you might want to only provision users that are located in the US.
     */
    private Filter scope;
    /**
     * Name of the object in the source directory. Must match the object name from the source directory definition.
     */
    private String sourceObjectName;
    /**
     * Name of the object in target directory. Must match the object name from the target directory definition.
     */
    private String targetObjectName;
    /**
     * Instantiates a new objectMapping and sets the default values.
     */
    public ObjectMapping() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a objectMapping
     */
    @jakarta.annotation.Nonnull
    public static ObjectMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ObjectMapping();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the attributeMappings property value. Attribute mappings define which attributes to map from the source object into the target object and how they should flow. A number of functions are available to support the transformation of the original source values.
     * @return a attributeMapping
     */
    @jakarta.annotation.Nullable
    public java.util.List<AttributeMapping> getAttributeMappings() {
        return this.attributeMappings;
    }
    /**
     * Gets the enabled property value. When true, this object mapping will be processed during synchronization. When false, this object mapping will be skipped.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("attributeMappings", (n) -> { this.setAttributeMappings(n.getCollectionOfObjectValues(AttributeMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("flowTypes", (n) -> { this.setFlowTypes(n.getEnumSetValue(ObjectFlowTypes.class)); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getCollectionOfObjectValues(ObjectMappingMetadataEntry::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getObjectValue(Filter::createFromDiscriminatorValue)); });
        deserializerMap.put("sourceObjectName", (n) -> { this.setSourceObjectName(n.getStringValue()); });
        deserializerMap.put("targetObjectName", (n) -> { this.setTargetObjectName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the flowTypes property value. The flowTypes property
     * @return a objectFlowTypes
     */
    @jakarta.annotation.Nullable
    public EnumSet<ObjectFlowTypes> getFlowTypes() {
        return this.flowTypes;
    }
    /**
     * Gets the metadata property value. Additional extension properties. Unless mentioned explicitly, metadata values should not be changed.
     * @return a objectMappingMetadataEntry
     */
    @jakarta.annotation.Nullable
    public java.util.List<ObjectMappingMetadataEntry> getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the name property value. Human-friendly name of the object mapping.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the scope property value. Defines a filter to be used when deciding whether a given object should be provisioned. For example, you might want to only provision users that are located in the US.
     * @return a filter
     */
    @jakarta.annotation.Nullable
    public Filter getScope() {
        return this.scope;
    }
    /**
     * Gets the sourceObjectName property value. Name of the object in the source directory. Must match the object name from the source directory definition.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSourceObjectName() {
        return this.sourceObjectName;
    }
    /**
     * Gets the targetObjectName property value. Name of the object in target directory. Must match the object name from the target directory definition.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTargetObjectName() {
        return this.targetObjectName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("attributeMappings", this.getAttributeMappings());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeEnumSetValue("flowTypes", this.getFlowTypes());
        writer.writeCollectionOfObjectValues("metadata", this.getMetadata());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("scope", this.getScope());
        writer.writeStringValue("sourceObjectName", this.getSourceObjectName());
        writer.writeStringValue("targetObjectName", this.getTargetObjectName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the attributeMappings property value. Attribute mappings define which attributes to map from the source object into the target object and how they should flow. A number of functions are available to support the transformation of the original source values.
     * @param value Value to set for the attributeMappings property.
     */
    public void setAttributeMappings(@jakarta.annotation.Nullable final java.util.List<AttributeMapping> value) {
        this.attributeMappings = value;
    }
    /**
     * Sets the enabled property value. When true, this object mapping will be processed during synchronization. When false, this object mapping will be skipped.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the flowTypes property value. The flowTypes property
     * @param value Value to set for the flowTypes property.
     */
    public void setFlowTypes(@jakarta.annotation.Nullable final EnumSet<ObjectFlowTypes> value) {
        this.flowTypes = value;
    }
    /**
     * Sets the metadata property value. Additional extension properties. Unless mentioned explicitly, metadata values should not be changed.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final java.util.List<ObjectMappingMetadataEntry> value) {
        this.metadata = value;
    }
    /**
     * Sets the name property value. Human-friendly name of the object mapping.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the scope property value. Defines a filter to be used when deciding whether a given object should be provisioned. For example, you might want to only provision users that are located in the US.
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final Filter value) {
        this.scope = value;
    }
    /**
     * Sets the sourceObjectName property value. Name of the object in the source directory. Must match the object name from the source directory definition.
     * @param value Value to set for the sourceObjectName property.
     */
    public void setSourceObjectName(@jakarta.annotation.Nullable final String value) {
        this.sourceObjectName = value;
    }
    /**
     * Sets the targetObjectName property value. Name of the object in target directory. Must match the object name from the target directory definition.
     * @param value Value to set for the targetObjectName property.
     */
    public void setTargetObjectName(@jakarta.annotation.Nullable final String value) {
        this.targetObjectName = value;
    }
}
