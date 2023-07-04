package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ObjectMapping implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The attributeMappings property
     */
    private java.util.List<AttributeMapping> attributeMappings;
    /**
     * The enabled property
     */
    private Boolean enabled;
    /**
     * The flowTypes property
     */
    private ObjectFlowTypes flowTypes;
    /**
     * The metadata property
     */
    private java.util.List<ObjectMappingMetadataEntry> metadata;
    /**
     * The name property
     */
    private String name;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The scope property
     */
    private Filter scope;
    /**
     * The sourceObjectName property
     */
    private String sourceObjectName;
    /**
     * The targetObjectName property
     */
    private String targetObjectName;
    /**
     * Instantiates a new objectMapping and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ObjectMapping() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a objectMapping
     */
    @javax.annotation.Nonnull
    public static ObjectMapping createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ObjectMapping();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the attributeMappings property value. The attributeMappings property
     * @return a attributeMapping
     */
    @javax.annotation.Nullable
    public java.util.List<AttributeMapping> getAttributeMappings() {
        return this.attributeMappings;
    }
    /**
     * Gets the enabled property value. The enabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("attributeMappings", (n) -> { this.setAttributeMappings(n.getCollectionOfObjectValues(AttributeMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("flowTypes", (n) -> { this.setFlowTypes(n.getEnumValue(ObjectFlowTypes.class)); });
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
     * @return a ObjectFlowTypes
     */
    @javax.annotation.Nullable
    public ObjectFlowTypes getFlowTypes() {
        return this.flowTypes;
    }
    /**
     * Gets the metadata property value. The metadata property
     * @return a objectMappingMetadataEntry
     */
    @javax.annotation.Nullable
    public java.util.List<ObjectMappingMetadataEntry> getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the scope property value. The scope property
     * @return a filter
     */
    @javax.annotation.Nullable
    public Filter getScope() {
        return this.scope;
    }
    /**
     * Gets the sourceObjectName property value. The sourceObjectName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceObjectName() {
        return this.sourceObjectName;
    }
    /**
     * Gets the targetObjectName property value. The targetObjectName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetObjectName() {
        return this.targetObjectName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("attributeMappings", this.getAttributeMappings());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeEnumValue("flowTypes", this.getFlowTypes());
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the attributeMappings property value. The attributeMappings property
     * @param value Value to set for the attributeMappings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttributeMappings(@javax.annotation.Nullable final java.util.List<AttributeMapping> value) {
        this.attributeMappings = value;
    }
    /**
     * Sets the enabled property value. The enabled property
     * @param value Value to set for the enabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnabled(@javax.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the flowTypes property value. The flowTypes property
     * @param value Value to set for the flowTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFlowTypes(@javax.annotation.Nullable final ObjectFlowTypes value) {
        this.flowTypes = value;
    }
    /**
     * Sets the metadata property value. The metadata property
     * @param value Value to set for the metadata property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMetadata(@javax.annotation.Nullable final java.util.List<ObjectMappingMetadataEntry> value) {
        this.metadata = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the scope property value. The scope property
     * @param value Value to set for the scope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScope(@javax.annotation.Nullable final Filter value) {
        this.scope = value;
    }
    /**
     * Sets the sourceObjectName property value. The sourceObjectName property
     * @param value Value to set for the sourceObjectName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceObjectName(@javax.annotation.Nullable final String value) {
        this.sourceObjectName = value;
    }
    /**
     * Sets the targetObjectName property value. The targetObjectName property
     * @param value Value to set for the targetObjectName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetObjectName(@javax.annotation.Nullable final String value) {
        this.targetObjectName = value;
    }
}
