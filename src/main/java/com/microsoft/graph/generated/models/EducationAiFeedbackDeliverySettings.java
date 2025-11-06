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
public class EducationAiFeedbackDeliverySettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link EducationAiFeedbackDeliverySettings} and sets the default values.
     */
    public EducationAiFeedbackDeliverySettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EducationAiFeedbackDeliverySettings}
     */
    @jakarta.annotation.Nonnull
    public static EducationAiFeedbackDeliverySettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationAiFeedbackDeliverySettings();
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
     * Gets the areRhetoricalTechniquesEnabled property value. Indicates whether the student should receive feedback on their rhetorical techniques from the AI feedback.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAreRhetoricalTechniquesEnabled() {
        return this.backingStore.get("areRhetoricalTechniquesEnabled");
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("areRhetoricalTechniquesEnabled", (n) -> { this.setAreRhetoricalTechniquesEnabled(n.getBooleanValue()); });
        deserializerMap.put("isLanguageUseEnabled", (n) -> { this.setIsLanguageUseEnabled(n.getBooleanValue()); });
        deserializerMap.put("isStyleEnabled", (n) -> { this.setIsStyleEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isLanguageUseEnabled property value. Indicates whether the student should receive feedback on their language use from the AI feedback.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsLanguageUseEnabled() {
        return this.backingStore.get("isLanguageUseEnabled");
    }
    /**
     * Gets the isStyleEnabled property value. Indicates whether the student should receive feedback on their style from the AI feedback.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsStyleEnabled() {
        return this.backingStore.get("isStyleEnabled");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("areRhetoricalTechniquesEnabled", this.getAreRhetoricalTechniquesEnabled());
        writer.writeBooleanValue("isLanguageUseEnabled", this.getIsLanguageUseEnabled());
        writer.writeBooleanValue("isStyleEnabled", this.getIsStyleEnabled());
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
     * Sets the areRhetoricalTechniquesEnabled property value. Indicates whether the student should receive feedback on their rhetorical techniques from the AI feedback.
     * @param value Value to set for the areRhetoricalTechniquesEnabled property.
     */
    public void setAreRhetoricalTechniquesEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("areRhetoricalTechniquesEnabled", value);
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
     * Sets the isLanguageUseEnabled property value. Indicates whether the student should receive feedback on their language use from the AI feedback.
     * @param value Value to set for the isLanguageUseEnabled property.
     */
    public void setIsLanguageUseEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isLanguageUseEnabled", value);
    }
    /**
     * Sets the isStyleEnabled property value. Indicates whether the student should receive feedback on their style from the AI feedback.
     * @param value Value to set for the isStyleEnabled property.
     */
    public void setIsStyleEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isStyleEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
