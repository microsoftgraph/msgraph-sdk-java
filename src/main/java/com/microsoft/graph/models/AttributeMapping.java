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
public class AttributeMapping implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new AttributeMapping and sets the default values.
     */
    public AttributeMapping() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AttributeMapping
     */
    @jakarta.annotation.Nonnull
    public static AttributeMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttributeMapping();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the defaultValue property value. Default value to be used in case the source property was evaluated to null. Optional.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefaultValue() {
        return this.backingStore.get("defaultValue");
    }
    /**
     * Gets the exportMissingReferences property value. For internal use only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getExportMissingReferences() {
        return this.backingStore.get("exportMissingReferences");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getStringValue()); });
        deserializerMap.put("exportMissingReferences", (n) -> { this.setExportMissingReferences(n.getBooleanValue()); });
        deserializerMap.put("flowBehavior", (n) -> { this.setFlowBehavior(n.getEnumValue(AttributeFlowBehavior.class)); });
        deserializerMap.put("flowType", (n) -> { this.setFlowType(n.getEnumValue(AttributeFlowType.class)); });
        deserializerMap.put("matchingPriority", (n) -> { this.setMatchingPriority(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getObjectValue(AttributeMappingSource::createFromDiscriminatorValue)); });
        deserializerMap.put("targetAttributeName", (n) -> { this.setTargetAttributeName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the flowBehavior property value. The flowBehavior property
     * @return a AttributeFlowBehavior
     */
    @jakarta.annotation.Nullable
    public AttributeFlowBehavior getFlowBehavior() {
        return this.backingStore.get("flowBehavior");
    }
    /**
     * Gets the flowType property value. The flowType property
     * @return a AttributeFlowType
     */
    @jakarta.annotation.Nullable
    public AttributeFlowType getFlowType() {
        return this.backingStore.get("flowType");
    }
    /**
     * Gets the matchingPriority property value. If higher than 0, this attribute will be used to perform an initial match of the objects between source and target directories. The synchronization engine will try to find the matching object using attribute with lowest value of matching priority first. If not found, the attribute with the next matching priority will be used, and so on a until match is found or no more matching attributes are left. Only attributes that are expected to have unique values, such as email, should be used as matching attributes.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMatchingPriority() {
        return this.backingStore.get("matchingPriority");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the source property value. Defines how a value should be extracted (or transformed) from the source object.
     * @return a AttributeMappingSource
     */
    @jakarta.annotation.Nullable
    public AttributeMappingSource getSource() {
        return this.backingStore.get("source");
    }
    /**
     * Gets the targetAttributeName property value. Name of the attribute on the target object.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTargetAttributeName() {
        return this.backingStore.get("targetAttributeName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("defaultValue", this.getDefaultValue());
        writer.writeBooleanValue("exportMissingReferences", this.getExportMissingReferences());
        writer.writeEnumValue("flowBehavior", this.getFlowBehavior());
        writer.writeEnumValue("flowType", this.getFlowType());
        writer.writeIntegerValue("matchingPriority", this.getMatchingPriority());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("source", this.getSource());
        writer.writeStringValue("targetAttributeName", this.getTargetAttributeName());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the defaultValue property value. Default value to be used in case the source property was evaluated to null. Optional.
     * @param value Value to set for the defaultValue property.
     */
    public void setDefaultValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultValue", value);
    }
    /**
     * Sets the exportMissingReferences property value. For internal use only.
     * @param value Value to set for the exportMissingReferences property.
     */
    public void setExportMissingReferences(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("exportMissingReferences", value);
    }
    /**
     * Sets the flowBehavior property value. The flowBehavior property
     * @param value Value to set for the flowBehavior property.
     */
    public void setFlowBehavior(@jakarta.annotation.Nullable final AttributeFlowBehavior value) {
        this.backingStore.set("flowBehavior", value);
    }
    /**
     * Sets the flowType property value. The flowType property
     * @param value Value to set for the flowType property.
     */
    public void setFlowType(@jakarta.annotation.Nullable final AttributeFlowType value) {
        this.backingStore.set("flowType", value);
    }
    /**
     * Sets the matchingPriority property value. If higher than 0, this attribute will be used to perform an initial match of the objects between source and target directories. The synchronization engine will try to find the matching object using attribute with lowest value of matching priority first. If not found, the attribute with the next matching priority will be used, and so on a until match is found or no more matching attributes are left. Only attributes that are expected to have unique values, such as email, should be used as matching attributes.
     * @param value Value to set for the matchingPriority property.
     */
    public void setMatchingPriority(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("matchingPriority", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the source property value. Defines how a value should be extracted (or transformed) from the source object.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final AttributeMappingSource value) {
        this.backingStore.set("source", value);
    }
    /**
     * Sets the targetAttributeName property value. Name of the attribute on the target object.
     * @param value Value to set for the targetAttributeName property.
     */
    public void setTargetAttributeName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetAttributeName", value);
    }
}
