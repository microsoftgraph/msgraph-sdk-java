package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ObjectMapping implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new ObjectMapping and sets the default values.
     */
    public ObjectMapping() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ObjectMapping
     */
    @jakarta.annotation.Nonnull
    public static ObjectMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ObjectMapping();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the attributeMappings property value. Attribute mappings define which attributes to map from the source object into the target object and how they should flow. A number of functions are available to support the transformation of the original source values.
     * @return a java.util.List<AttributeMapping>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AttributeMapping> getAttributeMappings() {
        return this.BackingStore.get("attributeMappings");
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the enabled property value. When true, this object mapping will be processed during synchronization. When false, this object mapping will be skipped.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.BackingStore.get("enabled");
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
     * @return a EnumSet<ObjectFlowTypes>
     */
    @jakarta.annotation.Nullable
    public EnumSet<ObjectFlowTypes> getFlowTypes() {
        return this.BackingStore.get("flowTypes");
    }
    /**
     * Gets the metadata property value. Additional extension properties. Unless mentioned explicitly, metadata values should not be changed.
     * @return a java.util.List<ObjectMappingMetadataEntry>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ObjectMappingMetadataEntry> getMetadata() {
        return this.BackingStore.get("metadata");
    }
    /**
     * Gets the name property value. Human-friendly name of the object mapping.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.BackingStore.get("name");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the scope property value. Defines a filter to be used when deciding whether a given object should be provisioned. For example, you might want to only provision users that are located in the US.
     * @return a Filter
     */
    @jakarta.annotation.Nullable
    public Filter getScope() {
        return this.BackingStore.get("scope");
    }
    /**
     * Gets the sourceObjectName property value. Name of the object in the source directory. Must match the object name from the source directory definition.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSourceObjectName() {
        return this.BackingStore.get("sourceObjectName");
    }
    /**
     * Gets the targetObjectName property value. Name of the object in target directory. Must match the object name from the target directory definition.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTargetObjectName() {
        return this.BackingStore.get("targetObjectName");
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the attributeMappings property value. Attribute mappings define which attributes to map from the source object into the target object and how they should flow. A number of functions are available to support the transformation of the original source values.
     * @param value Value to set for the attributeMappings property.
     */
    public void setAttributeMappings(@jakarta.annotation.Nullable final java.util.List<AttributeMapping> value) {
        this.BackingStore.set("attributeMappings", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the enabled property value. When true, this object mapping will be processed during synchronization. When false, this object mapping will be skipped.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("enabled", value);
    }
    /**
     * Sets the flowTypes property value. The flowTypes property
     * @param value Value to set for the flowTypes property.
     */
    public void setFlowTypes(@jakarta.annotation.Nullable final EnumSet<ObjectFlowTypes> value) {
        this.BackingStore.set("flowTypes", value);
    }
    /**
     * Sets the metadata property value. Additional extension properties. Unless mentioned explicitly, metadata values should not be changed.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final java.util.List<ObjectMappingMetadataEntry> value) {
        this.BackingStore.set("metadata", value);
    }
    /**
     * Sets the name property value. Human-friendly name of the object mapping.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("name", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the scope property value. Defines a filter to be used when deciding whether a given object should be provisioned. For example, you might want to only provision users that are located in the US.
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final Filter value) {
        this.BackingStore.set("scope", value);
    }
    /**
     * Sets the sourceObjectName property value. Name of the object in the source directory. Must match the object name from the source directory definition.
     * @param value Value to set for the sourceObjectName property.
     */
    public void setSourceObjectName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("sourceObjectName", value);
    }
    /**
     * Sets the targetObjectName property value. Name of the object in target directory. Must match the object name from the target directory definition.
     * @param value Value to set for the targetObjectName property.
     */
    public void setTargetObjectName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("targetObjectName", value);
    }
}
