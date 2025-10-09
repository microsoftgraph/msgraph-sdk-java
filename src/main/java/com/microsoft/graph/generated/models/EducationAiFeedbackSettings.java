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
public class EducationAiFeedbackSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link EducationAiFeedbackSettings} and sets the default values.
     */
    public EducationAiFeedbackSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EducationAiFeedbackSettings}
     */
    @jakarta.annotation.Nonnull
    public static EducationAiFeedbackSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationAiFeedbackSettings();
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
     * Gets the audienceEngagementSettings property value. The audience engagement related feedback types that students should receive from the AI feedback.
     * @return a {@link EducationAiFeedbackAudienceEngagementSettings}
     */
    @jakarta.annotation.Nullable
    public EducationAiFeedbackAudienceEngagementSettings getAudienceEngagementSettings() {
        return this.backingStore.get("audienceEngagementSettings");
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
     * Gets the contentSettings property value. The content related feedback types that students should receive from the AI feedback.
     * @return a {@link EducationAiFeedbackContentSettings}
     */
    @jakarta.annotation.Nullable
    public EducationAiFeedbackContentSettings getContentSettings() {
        return this.backingStore.get("contentSettings");
    }
    /**
     * Gets the deliverySettings property value. The delivery related feedback types that students should receive from the AI feedback.
     * @return a {@link EducationAiFeedbackDeliverySettings}
     */
    @jakarta.annotation.Nullable
    public EducationAiFeedbackDeliverySettings getDeliverySettings() {
        return this.backingStore.get("deliverySettings");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("audienceEngagementSettings", (n) -> { this.setAudienceEngagementSettings(n.getObjectValue(EducationAiFeedbackAudienceEngagementSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("contentSettings", (n) -> { this.setContentSettings(n.getObjectValue(EducationAiFeedbackContentSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("deliverySettings", (n) -> { this.setDeliverySettings(n.getObjectValue(EducationAiFeedbackDeliverySettings::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeObjectValue("audienceEngagementSettings", this.getAudienceEngagementSettings());
        writer.writeObjectValue("contentSettings", this.getContentSettings());
        writer.writeObjectValue("deliverySettings", this.getDeliverySettings());
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
     * Sets the audienceEngagementSettings property value. The audience engagement related feedback types that students should receive from the AI feedback.
     * @param value Value to set for the audienceEngagementSettings property.
     */
    public void setAudienceEngagementSettings(@jakarta.annotation.Nullable final EducationAiFeedbackAudienceEngagementSettings value) {
        this.backingStore.set("audienceEngagementSettings", value);
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
     * Sets the contentSettings property value. The content related feedback types that students should receive from the AI feedback.
     * @param value Value to set for the contentSettings property.
     */
    public void setContentSettings(@jakarta.annotation.Nullable final EducationAiFeedbackContentSettings value) {
        this.backingStore.set("contentSettings", value);
    }
    /**
     * Sets the deliverySettings property value. The delivery related feedback types that students should receive from the AI feedback.
     * @param value Value to set for the deliverySettings property.
     */
    public void setDeliverySettings(@jakarta.annotation.Nullable final EducationAiFeedbackDeliverySettings value) {
        this.backingStore.set("deliverySettings", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
