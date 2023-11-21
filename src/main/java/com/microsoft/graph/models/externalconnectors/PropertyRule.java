package com.microsoft.graph.models.externalconnectors;

import com.microsoft.graph.models.BinaryOperator;
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
public class PropertyRule implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new PropertyRule and sets the default values.
     */
    public PropertyRule() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PropertyRule
     */
    @jakarta.annotation.Nonnull
    public static PropertyRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PropertyRule();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("operation", (n) -> { this.setOperation(n.getEnumValue(RuleOperation.class)); });
        deserializerMap.put("property", (n) -> { this.setProperty(n.getStringValue()); });
        deserializerMap.put("values", (n) -> { this.setValues(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("valuesJoinedBy", (n) -> { this.setValuesJoinedBy(n.getEnumValue(BinaryOperator.class)); });
        return deserializerMap;
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
     * Gets the operation property value. The operation property
     * @return a RuleOperation
     */
    @jakarta.annotation.Nullable
    public RuleOperation getOperation() {
        return this.backingStore.get("operation");
    }
    /**
     * Gets the property property value. The property from the externalItem schema. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProperty() {
        return this.backingStore.get("property");
    }
    /**
     * Gets the values property value. A collection with one or many strings. The specified string(s) will be matched with the specified property using the specified operation. Required.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getValues() {
        return this.backingStore.get("values");
    }
    /**
     * Gets the valuesJoinedBy property value. The valuesJoinedBy property
     * @return a BinaryOperator
     */
    @jakarta.annotation.Nullable
    public BinaryOperator getValuesJoinedBy() {
        return this.backingStore.get("valuesJoinedBy");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("operation", this.getOperation());
        writer.writeStringValue("property", this.getProperty());
        writer.writeCollectionOfPrimitiveValues("values", this.getValues());
        writer.writeEnumValue("valuesJoinedBy", this.getValuesJoinedBy());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the operation property value. The operation property
     * @param value Value to set for the operation property.
     */
    public void setOperation(@jakarta.annotation.Nullable final RuleOperation value) {
        this.backingStore.set("operation", value);
    }
    /**
     * Sets the property property value. The property from the externalItem schema. Required.
     * @param value Value to set for the property property.
     */
    public void setProperty(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("property", value);
    }
    /**
     * Sets the values property value. A collection with one or many strings. The specified string(s) will be matched with the specified property using the specified operation. Required.
     * @param value Value to set for the values property.
     */
    public void setValues(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("values", value);
    }
    /**
     * Sets the valuesJoinedBy property value. The valuesJoinedBy property
     * @param value Value to set for the valuesJoinedBy property.
     */
    public void setValuesJoinedBy(@jakarta.annotation.Nullable final BinaryOperator value) {
        this.backingStore.set("valuesJoinedBy", value);
    }
}
