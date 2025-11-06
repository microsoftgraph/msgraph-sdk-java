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
public class EducationSpeakerCoachDeliverySettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link EducationSpeakerCoachDeliverySettings} and sets the default values.
     */
    public EducationSpeakerCoachDeliverySettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EducationSpeakerCoachDeliverySettings}
     */
    @jakarta.annotation.Nonnull
    public static EducationSpeakerCoachDeliverySettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSpeakerCoachDeliverySettings();
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
     * Gets the areFillerWordsEnabled property value. Indicates whether the student should receive feedback on their filler words from the Speaker Coach.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAreFillerWordsEnabled() {
        return this.backingStore.get("areFillerWordsEnabled");
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("areFillerWordsEnabled", (n) -> { this.setAreFillerWordsEnabled(n.getBooleanValue()); });
        deserializerMap.put("isPaceEnabled", (n) -> { this.setIsPaceEnabled(n.getBooleanValue()); });
        deserializerMap.put("isPitchEnabled", (n) -> { this.setIsPitchEnabled(n.getBooleanValue()); });
        deserializerMap.put("isPronunciationEnabled", (n) -> { this.setIsPronunciationEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isPaceEnabled property value. Indicates whether the student should receive feedback on their pace from the Speaker Coach.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPaceEnabled() {
        return this.backingStore.get("isPaceEnabled");
    }
    /**
     * Gets the isPitchEnabled property value. Indicates whether the student should receive feedback on their pitch from the Speaker Coach.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPitchEnabled() {
        return this.backingStore.get("isPitchEnabled");
    }
    /**
     * Gets the isPronunciationEnabled property value. Indicates whether the student should receive feedback on their pronunciation from the Speaker Coach. This is automatically enabled if isAiFeedbackEnabled is set to true on the educationSpeakerProgressResource, or if spokenLanguageLocale is set to a value besides en-US on the educationSpeakerProgressResource.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPronunciationEnabled() {
        return this.backingStore.get("isPronunciationEnabled");
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
        writer.writeBooleanValue("areFillerWordsEnabled", this.getAreFillerWordsEnabled());
        writer.writeBooleanValue("isPaceEnabled", this.getIsPaceEnabled());
        writer.writeBooleanValue("isPitchEnabled", this.getIsPitchEnabled());
        writer.writeBooleanValue("isPronunciationEnabled", this.getIsPronunciationEnabled());
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
     * Sets the areFillerWordsEnabled property value. Indicates whether the student should receive feedback on their filler words from the Speaker Coach.
     * @param value Value to set for the areFillerWordsEnabled property.
     */
    public void setAreFillerWordsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("areFillerWordsEnabled", value);
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
     * Sets the isPaceEnabled property value. Indicates whether the student should receive feedback on their pace from the Speaker Coach.
     * @param value Value to set for the isPaceEnabled property.
     */
    public void setIsPaceEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isPaceEnabled", value);
    }
    /**
     * Sets the isPitchEnabled property value. Indicates whether the student should receive feedback on their pitch from the Speaker Coach.
     * @param value Value to set for the isPitchEnabled property.
     */
    public void setIsPitchEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isPitchEnabled", value);
    }
    /**
     * Sets the isPronunciationEnabled property value. Indicates whether the student should receive feedback on their pronunciation from the Speaker Coach. This is automatically enabled if isAiFeedbackEnabled is set to true on the educationSpeakerProgressResource, or if spokenLanguageLocale is set to a value besides en-US on the educationSpeakerProgressResource.
     * @param value Value to set for the isPronunciationEnabled property.
     */
    public void setIsPronunciationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isPronunciationEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
