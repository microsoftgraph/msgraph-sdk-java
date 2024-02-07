package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateAllowedCombinationsResult implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new UpdateAllowedCombinationsResult and sets the default values.
     */
    public UpdateAllowedCombinationsResult() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UpdateAllowedCombinationsResult
     */
    @jakarta.annotation.Nonnull
    public static UpdateAllowedCombinationsResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateAllowedCombinationsResult();
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
     * Gets the additionalInformation property value. Information about why the updateAllowedCombinations action was successful or failed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAdditionalInformation() {
        return this.backingStore.get("additionalInformation");
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
     * Gets the conditionalAccessReferences property value. References to existing Conditional Access policies that use this authentication strength.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getConditionalAccessReferences() {
        return this.backingStore.get("conditionalAccessReferences");
    }
    /**
     * Gets the currentCombinations property value. The list of current authentication method combinations allowed by the authentication strength.
     * @return a java.util.List<AuthenticationMethodModes>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationMethodModes> getCurrentCombinations() {
        return this.backingStore.get("currentCombinations");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("additionalInformation", (n) -> { this.setAdditionalInformation(n.getStringValue()); });
        deserializerMap.put("conditionalAccessReferences", (n) -> { this.setConditionalAccessReferences(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("currentCombinations", (n) -> { this.setCurrentCombinations(n.getCollectionOfEnumValues(AuthenticationMethodModes::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("previousCombinations", (n) -> { this.setPreviousCombinations(n.getCollectionOfEnumValues(AuthenticationMethodModes::forValue)); });
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
     * Gets the previousCombinations property value. The list of former authentication method combinations allowed by the authentication strength before they were updated through the updateAllowedCombinations action.
     * @return a java.util.List<AuthenticationMethodModes>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationMethodModes> getPreviousCombinations() {
        return this.backingStore.get("previousCombinations");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("additionalInformation", this.getAdditionalInformation());
        writer.writeCollectionOfPrimitiveValues("conditionalAccessReferences", this.getConditionalAccessReferences());
        writer.writeCollectionOfEnumValues("currentCombinations", this.getCurrentCombinations());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfEnumValues("previousCombinations", this.getPreviousCombinations());
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
     * Sets the additionalInformation property value. Information about why the updateAllowedCombinations action was successful or failed.
     * @param value Value to set for the additionalInformation property.
     */
    public void setAdditionalInformation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("additionalInformation", value);
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
     * Sets the conditionalAccessReferences property value. References to existing Conditional Access policies that use this authentication strength.
     * @param value Value to set for the conditionalAccessReferences property.
     */
    public void setConditionalAccessReferences(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("conditionalAccessReferences", value);
    }
    /**
     * Sets the currentCombinations property value. The list of current authentication method combinations allowed by the authentication strength.
     * @param value Value to set for the currentCombinations property.
     */
    public void setCurrentCombinations(@jakarta.annotation.Nullable final java.util.List<AuthenticationMethodModes> value) {
        this.backingStore.set("currentCombinations", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the previousCombinations property value. The list of former authentication method combinations allowed by the authentication strength before they were updated through the updateAllowedCombinations action.
     * @param value Value to set for the previousCombinations property.
     */
    public void setPreviousCombinations(@jakarta.annotation.Nullable final java.util.List<AuthenticationMethodModes> value) {
        this.backingStore.set("previousCombinations", value);
    }
}
