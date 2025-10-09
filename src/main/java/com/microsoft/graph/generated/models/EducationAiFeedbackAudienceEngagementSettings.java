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
public class EducationAiFeedbackAudienceEngagementSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link EducationAiFeedbackAudienceEngagementSettings} and sets the default values.
     */
    public EducationAiFeedbackAudienceEngagementSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EducationAiFeedbackAudienceEngagementSettings}
     */
    @jakarta.annotation.Nonnull
    public static EducationAiFeedbackAudienceEngagementSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationAiFeedbackAudienceEngagementSettings();
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
     * Gets the areEngagementStrategiesEnabled property value. Indicates whether the student should receive feedback on their engagement strategies from the AI feedback.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAreEngagementStrategiesEnabled() {
        return this.backingStore.get("areEngagementStrategiesEnabled");
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
        deserializerMap.put("areEngagementStrategiesEnabled", (n) -> { this.setAreEngagementStrategiesEnabled(n.getBooleanValue()); });
        deserializerMap.put("isCallToActionEnabled", (n) -> { this.setIsCallToActionEnabled(n.getBooleanValue()); });
        deserializerMap.put("isEmotionalAndIntellectualAppealEnabled", (n) -> { this.setIsEmotionalAndIntellectualAppealEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isCallToActionEnabled property value. Indicates whether the student should receive feedback on their call to action from the AI feedback.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCallToActionEnabled() {
        return this.backingStore.get("isCallToActionEnabled");
    }
    /**
     * Gets the isEmotionalAndIntellectualAppealEnabled property value. Indicates whether the student should receive feedback on their emotional and intellectual appeal from the AI feedback.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEmotionalAndIntellectualAppealEnabled() {
        return this.backingStore.get("isEmotionalAndIntellectualAppealEnabled");
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
        writer.writeBooleanValue("areEngagementStrategiesEnabled", this.getAreEngagementStrategiesEnabled());
        writer.writeBooleanValue("isCallToActionEnabled", this.getIsCallToActionEnabled());
        writer.writeBooleanValue("isEmotionalAndIntellectualAppealEnabled", this.getIsEmotionalAndIntellectualAppealEnabled());
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
     * Sets the areEngagementStrategiesEnabled property value. Indicates whether the student should receive feedback on their engagement strategies from the AI feedback.
     * @param value Value to set for the areEngagementStrategiesEnabled property.
     */
    public void setAreEngagementStrategiesEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("areEngagementStrategiesEnabled", value);
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
     * Sets the isCallToActionEnabled property value. Indicates whether the student should receive feedback on their call to action from the AI feedback.
     * @param value Value to set for the isCallToActionEnabled property.
     */
    public void setIsCallToActionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCallToActionEnabled", value);
    }
    /**
     * Sets the isEmotionalAndIntellectualAppealEnabled property value. Indicates whether the student should receive feedback on their emotional and intellectual appeal from the AI feedback.
     * @param value Value to set for the isEmotionalAndIntellectualAppealEnabled property.
     */
    public void setIsEmotionalAndIntellectualAppealEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEmotionalAndIntellectualAppealEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
