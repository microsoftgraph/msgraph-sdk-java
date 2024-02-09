package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AttributeDefinition implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AttributeDefinition} and sets the default values.
     */
    public AttributeDefinition() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AttributeDefinition}
     */
    @jakarta.annotation.Nonnull
    public static AttributeDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttributeDefinition();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the anchor property value. true if the attribute should be used as the anchor for the object. Anchor attributes must have a unique value identifying an object, and must be immutable. Default is false. One, and only one, of the object's attributes must be designated as the anchor to support synchronization.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAnchor() {
        return this.backingStore.get("anchor");
    }
    /**
     * Gets the apiExpressions property value. The apiExpressions property
     * @return a {@link java.util.List<StringKeyStringValuePair>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<StringKeyStringValuePair> getApiExpressions() {
        return this.backingStore.get("apiExpressions");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the caseExact property value. true if value of this attribute should be treated as case-sensitive. This setting affects how the synchronization engine detects changes for the attribute.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCaseExact() {
        return this.backingStore.get("caseExact");
    }
    /**
     * Gets the defaultValue property value. The defaultValue property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultValue() {
        return this.backingStore.get("defaultValue");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("anchor", (n) -> { this.setAnchor(n.getBooleanValue()); });
        deserializerMap.put("apiExpressions", (n) -> { this.setApiExpressions(n.getCollectionOfObjectValues(StringKeyStringValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("caseExact", (n) -> { this.setCaseExact(n.getBooleanValue()); });
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getStringValue()); });
        deserializerMap.put("flowNullValues", (n) -> { this.setFlowNullValues(n.getBooleanValue()); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getCollectionOfObjectValues(AttributeDefinitionMetadataEntry::createFromDiscriminatorValue)); });
        deserializerMap.put("multivalued", (n) -> { this.setMultivalued(n.getBooleanValue()); });
        deserializerMap.put("mutability", (n) -> { this.setMutability(n.getEnumValue(Mutability::forValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("referencedObjects", (n) -> { this.setReferencedObjects(n.getCollectionOfObjectValues(ReferencedObject::createFromDiscriminatorValue)); });
        deserializerMap.put("required", (n) -> { this.setRequired(n.getBooleanValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(AttributeType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the flowNullValues property value. 'true' to allow null values for attributes.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFlowNullValues() {
        return this.backingStore.get("flowNullValues");
    }
    /**
     * Gets the metadata property value. Metadata for the given object.
     * @return a {@link java.util.List<AttributeDefinitionMetadataEntry>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AttributeDefinitionMetadataEntry> getMetadata() {
        return this.backingStore.get("metadata");
    }
    /**
     * Gets the multivalued property value. true if an attribute can have multiple values. Default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMultivalued() {
        return this.backingStore.get("multivalued");
    }
    /**
     * Gets the mutability property value. The mutability property
     * @return a {@link Mutability}
     */
    @jakarta.annotation.Nullable
    public Mutability getMutability() {
        return this.backingStore.get("mutability");
    }
    /**
     * Gets the name property value. Name of the attribute. Must be unique within the object definition. Not nullable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the referencedObjects property value. For attributes with reference type, lists referenced objects (for example, the manager attribute would list User as the referenced object).
     * @return a {@link java.util.List<ReferencedObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ReferencedObject> getReferencedObjects() {
        return this.backingStore.get("referencedObjects");
    }
    /**
     * Gets the required property value. true if attribute is required. Object can not be created if any of the required attributes are missing. If during synchronization, the required attribute has no value, the default value will be used. If default the value was not set, synchronization will record an error.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequired() {
        return this.backingStore.get("required");
    }
    /**
     * Gets the type property value. The type property
     * @return a {@link AttributeType}
     */
    @jakarta.annotation.Nullable
    public AttributeType getType() {
        return this.backingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("anchor", this.getAnchor());
        writer.writeCollectionOfObjectValues("apiExpressions", this.getApiExpressions());
        writer.writeBooleanValue("caseExact", this.getCaseExact());
        writer.writeStringValue("defaultValue", this.getDefaultValue());
        writer.writeBooleanValue("flowNullValues", this.getFlowNullValues());
        writer.writeCollectionOfObjectValues("metadata", this.getMetadata());
        writer.writeBooleanValue("multivalued", this.getMultivalued());
        writer.writeEnumValue("mutability", this.getMutability());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("referencedObjects", this.getReferencedObjects());
        writer.writeBooleanValue("required", this.getRequired());
        writer.writeEnumValue("type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the anchor property value. true if the attribute should be used as the anchor for the object. Anchor attributes must have a unique value identifying an object, and must be immutable. Default is false. One, and only one, of the object's attributes must be designated as the anchor to support synchronization.
     * @param value Value to set for the anchor property.
     */
    public void setAnchor(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("anchor", value);
    }
    /**
     * Sets the apiExpressions property value. The apiExpressions property
     * @param value Value to set for the apiExpressions property.
     */
    public void setApiExpressions(@jakarta.annotation.Nullable final java.util.List<StringKeyStringValuePair> value) {
        this.backingStore.set("apiExpressions", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the caseExact property value. true if value of this attribute should be treated as case-sensitive. This setting affects how the synchronization engine detects changes for the attribute.
     * @param value Value to set for the caseExact property.
     */
    public void setCaseExact(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("caseExact", value);
    }
    /**
     * Sets the defaultValue property value. The defaultValue property
     * @param value Value to set for the defaultValue property.
     */
    public void setDefaultValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultValue", value);
    }
    /**
     * Sets the flowNullValues property value. 'true' to allow null values for attributes.
     * @param value Value to set for the flowNullValues property.
     */
    public void setFlowNullValues(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("flowNullValues", value);
    }
    /**
     * Sets the metadata property value. Metadata for the given object.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final java.util.List<AttributeDefinitionMetadataEntry> value) {
        this.backingStore.set("metadata", value);
    }
    /**
     * Sets the multivalued property value. true if an attribute can have multiple values. Default is false.
     * @param value Value to set for the multivalued property.
     */
    public void setMultivalued(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("multivalued", value);
    }
    /**
     * Sets the mutability property value. The mutability property
     * @param value Value to set for the mutability property.
     */
    public void setMutability(@jakarta.annotation.Nullable final Mutability value) {
        this.backingStore.set("mutability", value);
    }
    /**
     * Sets the name property value. Name of the attribute. Must be unique within the object definition. Not nullable.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the referencedObjects property value. For attributes with reference type, lists referenced objects (for example, the manager attribute would list User as the referenced object).
     * @param value Value to set for the referencedObjects property.
     */
    public void setReferencedObjects(@jakarta.annotation.Nullable final java.util.List<ReferencedObject> value) {
        this.backingStore.set("referencedObjects", value);
    }
    /**
     * Sets the required property value. true if attribute is required. Object can not be created if any of the required attributes are missing. If during synchronization, the required attribute has no value, the default value will be used. If default the value was not set, synchronization will record an error.
     * @param value Value to set for the required property.
     */
    public void setRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("required", value);
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final AttributeType value) {
        this.backingStore.set("type", value);
    }
}
