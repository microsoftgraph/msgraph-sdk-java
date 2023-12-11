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
public class ChoiceColumn implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new ChoiceColumn and sets the default values.
     */
    public ChoiceColumn() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChoiceColumn
     */
    @jakarta.annotation.Nonnull
    public static ChoiceColumn createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChoiceColumn();
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
     * Gets the allowTextEntry property value. If true, allows custom values that aren't in the configured choices.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowTextEntry() {
        return this.backingStore.get("allowTextEntry");
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
     * Gets the choices property value. The list of values available for this column.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getChoices() {
        return this.backingStore.get("choices");
    }
    /**
     * Gets the displayAs property value. How the choices are to be presented in the UX. Must be one of checkBoxes, dropDownMenu, or radioButtons
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayAs() {
        return this.backingStore.get("displayAs");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("allowTextEntry", (n) -> { this.setAllowTextEntry(n.getBooleanValue()); });
        deserializerMap.put("choices", (n) -> { this.setChoices(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("displayAs", (n) -> { this.setDisplayAs(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowTextEntry", this.getAllowTextEntry());
        writer.writeCollectionOfPrimitiveValues("choices", this.getChoices());
        writer.writeStringValue("displayAs", this.getDisplayAs());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the allowTextEntry property value. If true, allows custom values that aren't in the configured choices.
     * @param value Value to set for the allowTextEntry property.
     */
    public void setAllowTextEntry(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowTextEntry", value);
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
     * Sets the choices property value. The list of values available for this column.
     * @param value Value to set for the choices property.
     */
    public void setChoices(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("choices", value);
    }
    /**
     * Sets the displayAs property value. How the choices are to be presented in the UX. Must be one of checkBoxes, dropDownMenu, or radioButtons
     * @param value Value to set for the displayAs property.
     */
    public void setDisplayAs(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayAs", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
