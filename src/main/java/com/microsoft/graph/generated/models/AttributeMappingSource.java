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
public class AttributeMappingSource implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AttributeMappingSource} and sets the default values.
     */
    public AttributeMappingSource() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AttributeMappingSource}
     */
    @jakarta.annotation.Nonnull
    public static AttributeMappingSource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttributeMappingSource();
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the expression property value. Equivalent expression representation of this attributeMappingSource object.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExpression() {
        return this.backingStore.get("expression");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("expression", (n) -> { this.setExpression(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("parameters", (n) -> { this.setParameters(n.getCollectionOfObjectValues(StringKeyAttributeMappingSourceValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(AttributeMappingSourceType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Name parameter of the mapping source. Depending on the type property value, this can be the name of the function, the name of the source attribute, or a constant value to be used.
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
     * Gets the parameters property value. If this object represents a function, lists function parameters. Parameters consist of attributeMappingSource objects themselves, allowing for complex expressions. If type isn't Function, this property is null/empty array.
     * @return a {@link java.util.List<StringKeyAttributeMappingSourceValuePair>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<StringKeyAttributeMappingSourceValuePair> getParameters() {
        return this.backingStore.get("parameters");
    }
    /**
     * Gets the type property value. The type property
     * @return a {@link AttributeMappingSourceType}
     */
    @jakarta.annotation.Nullable
    public AttributeMappingSourceType getType() {
        return this.backingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("expression", this.getExpression());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("parameters", this.getParameters());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the expression property value. Equivalent expression representation of this attributeMappingSource object.
     * @param value Value to set for the expression property.
     */
    public void setExpression(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("expression", value);
    }
    /**
     * Sets the name property value. Name parameter of the mapping source. Depending on the type property value, this can be the name of the function, the name of the source attribute, or a constant value to be used.
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
     * Sets the parameters property value. If this object represents a function, lists function parameters. Parameters consist of attributeMappingSource objects themselves, allowing for complex expressions. If type isn't Function, this property is null/empty array.
     * @param value Value to set for the parameters property.
     */
    public void setParameters(@jakarta.annotation.Nullable final java.util.List<StringKeyAttributeMappingSourceValuePair> value) {
        this.backingStore.set("parameters", value);
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final AttributeMappingSourceType value) {
        this.backingStore.set("type", value);
    }
}
