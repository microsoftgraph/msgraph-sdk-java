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
public class PayloadCoachmark implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new PayloadCoachmark and sets the default values.
     */
    public PayloadCoachmark() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PayloadCoachmark
     */
    @jakarta.annotation.Nonnull
    public static PayloadCoachmark createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PayloadCoachmark();
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
     * Gets the coachmarkLocation property value. The coachmark location.
     * @return a CoachmarkLocation
     */
    @jakarta.annotation.Nullable
    public CoachmarkLocation getCoachmarkLocation() {
        return this.backingStore.get("coachmarkLocation");
    }
    /**
     * Gets the description property value. The description about the coachmark.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("coachmarkLocation", (n) -> { this.setCoachmarkLocation(n.getObjectValue(CoachmarkLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("indicator", (n) -> { this.setIndicator(n.getStringValue()); });
        deserializerMap.put("isValid", (n) -> { this.setIsValid(n.getBooleanValue()); });
        deserializerMap.put("language", (n) -> { this.setLanguage(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("order", (n) -> { this.setOrder(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the indicator property value. The coachmark indicator.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIndicator() {
        return this.backingStore.get("indicator");
    }
    /**
     * Gets the isValid property value. Indicates whether the coachmark is valid or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsValid() {
        return this.backingStore.get("isValid");
    }
    /**
     * Gets the language property value. The coachmark language.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLanguage() {
        return this.backingStore.get("language");
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
     * Gets the order property value. The coachmark order.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOrder() {
        return this.backingStore.get("order");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("coachmarkLocation", this.getCoachmarkLocation());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("indicator", this.getIndicator());
        writer.writeBooleanValue("isValid", this.getIsValid());
        writer.writeStringValue("language", this.getLanguage());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("order", this.getOrder());
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
     * Sets the coachmarkLocation property value. The coachmark location.
     * @param value Value to set for the coachmarkLocation property.
     */
    public void setCoachmarkLocation(@jakarta.annotation.Nullable final CoachmarkLocation value) {
        this.backingStore.set("coachmarkLocation", value);
    }
    /**
     * Sets the description property value. The description about the coachmark.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the indicator property value. The coachmark indicator.
     * @param value Value to set for the indicator property.
     */
    public void setIndicator(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("indicator", value);
    }
    /**
     * Sets the isValid property value. Indicates whether the coachmark is valid or not.
     * @param value Value to set for the isValid property.
     */
    public void setIsValid(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isValid", value);
    }
    /**
     * Sets the language property value. The coachmark language.
     * @param value Value to set for the language property.
     */
    public void setLanguage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("language", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the order property value. The coachmark order.
     * @param value Value to set for the order property.
     */
    public void setOrder(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("order", value);
    }
}
