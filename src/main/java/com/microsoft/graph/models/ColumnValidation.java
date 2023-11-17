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
public class ColumnValidation implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore backingStore;
    /**
     * Instantiates a new ColumnValidation and sets the default values.
     */
    public ColumnValidation() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ColumnValidation
     */
    @jakarta.annotation.Nonnull
    public static ColumnValidation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ColumnValidation();
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
     * Gets the defaultLanguage property value. Default BCP 47 language tag for the description.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefaultLanguage() {
        return this.backingStore.get("defaultLanguage");
    }
    /**
     * Gets the descriptions property value. Localized messages that explain what is needed for this column's value to be considered valid. User will be prompted with this message if validation fails.
     * @return a java.util.List<DisplayNameLocalization>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DisplayNameLocalization> getDescriptions() {
        return this.backingStore.get("descriptions");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("defaultLanguage", (n) -> { this.setDefaultLanguage(n.getStringValue()); });
        deserializerMap.put("descriptions", (n) -> { this.setDescriptions(n.getCollectionOfObjectValues(DisplayNameLocalization::createFromDiscriminatorValue)); });
        deserializerMap.put("formula", (n) -> { this.setFormula(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the formula property value. The formula to validate column value. For examples, see Examples of common formulas in lists.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFormula() {
        return this.backingStore.get("formula");
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
        writer.writeStringValue("defaultLanguage", this.getDefaultLanguage());
        writer.writeCollectionOfObjectValues("descriptions", this.getDescriptions());
        writer.writeStringValue("formula", this.getFormula());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the defaultLanguage property value. Default BCP 47 language tag for the description.
     * @param value Value to set for the defaultLanguage property.
     */
    public void setDefaultLanguage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultLanguage", value);
    }
    /**
     * Sets the descriptions property value. Localized messages that explain what is needed for this column's value to be considered valid. User will be prompted with this message if validation fails.
     * @param value Value to set for the descriptions property.
     */
    public void setDescriptions(@jakarta.annotation.Nullable final java.util.List<DisplayNameLocalization> value) {
        this.backingStore.set("descriptions", value);
    }
    /**
     * Sets the formula property value. The formula to validate column value. For examples, see Examples of common formulas in lists.
     * @param value Value to set for the formula property.
     */
    public void setFormula(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("formula", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
