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
public class VirtualEventRegistrationQuestionAnswer implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link VirtualEventRegistrationQuestionAnswer} and sets the default values.
     */
    public VirtualEventRegistrationQuestionAnswer() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VirtualEventRegistrationQuestionAnswer}
     */
    @jakarta.annotation.Nonnull
    public static VirtualEventRegistrationQuestionAnswer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventRegistrationQuestionAnswer();
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
     * Gets the booleanValue property value. Boolean answer of the virtual event registration question. Only appears when answerInputType is boolean.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBooleanValue() {
        return this.backingStore.get("booleanValue");
    }
    /**
     * Gets the displayName property value. Display name of the registration question.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("booleanValue", (n) -> { this.setBooleanValue(n.getBooleanValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("multiChoiceValues", (n) -> { this.setMultiChoiceValues(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("questionId", (n) -> { this.setQuestionId(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the multiChoiceValues property value. Collection of text answer of the virtual event registration question. Only appears when answerInputType is multiChoice.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMultiChoiceValues() {
        return this.backingStore.get("multiChoiceValues");
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
     * Gets the questionId property value. id of the virtual event registration question.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getQuestionId() {
        return this.backingStore.get("questionId");
    }
    /**
     * Gets the value property value. Text answer of the virtual event registration question. Appears when answerInputType is text, multilineText or singleChoice.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("booleanValue", this.getBooleanValue());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("multiChoiceValues", this.getMultiChoiceValues());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("questionId", this.getQuestionId());
        writer.writeStringValue("value", this.getValue());
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
     * Sets the booleanValue property value. Boolean answer of the virtual event registration question. Only appears when answerInputType is boolean.
     * @param value Value to set for the booleanValue property.
     */
    public void setBooleanValue(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("booleanValue", value);
    }
    /**
     * Sets the displayName property value. Display name of the registration question.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the multiChoiceValues property value. Collection of text answer of the virtual event registration question. Only appears when answerInputType is multiChoice.
     * @param value Value to set for the multiChoiceValues property.
     */
    public void setMultiChoiceValues(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("multiChoiceValues", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the questionId property value. id of the virtual event registration question.
     * @param value Value to set for the questionId property.
     */
    public void setQuestionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("questionId", value);
    }
    /**
     * Sets the value property value. Text answer of the virtual event registration question. Appears when answerInputType is text, multilineText or singleChoice.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("value", value);
    }
}
