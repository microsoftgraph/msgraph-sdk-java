package com.microsoft.graph.models.security;

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
public class AlertTemplate implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AlertTemplate} and sets the default values.
     */
    public AlertTemplate() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AlertTemplate}
     */
    @jakarta.annotation.Nonnull
    public static AlertTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AlertTemplate();
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
     * Gets the customDetails property value. Custom key-value detail pairs to include in the alert. Each value identifies the detection query column that supplies the corresponding custom detail.
     * @return a {@link AlertCustomDetails}
     */
    @jakarta.annotation.Nullable
    public AlertCustomDetails getCustomDetails() {
        return this.backingStore.get("customDetails");
    }
    /**
     * Gets the description property value. Description of the alert triggered by the custom detection rule.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the entityMappings property value. The entityMappings property
     * @return a {@link EntityMappingConfiguration}
     */
    @jakarta.annotation.Nullable
    public EntityMappingConfiguration getEntityMappings() {
        return this.backingStore.get("entityMappings");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("customDetails", (n) -> { this.setCustomDetails(n.getObjectValue(AlertCustomDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("entityMappings", (n) -> { this.setEntityMappings(n.getObjectValue(EntityMappingConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recommendedActions", (n) -> { this.setRecommendedActions(n.getStringValue()); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(AlertSeverity::forValue)); });
        deserializerMap.put("tactics", (n) -> { this.setTactics(n.getCollectionOfObjectValues(MitreTactic::createFromDiscriminatorValue)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
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
     * Gets the recommendedActions property value. Recommended actions to mitigate the threat related to the alert triggered by the custom detection rule.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecommendedActions() {
        return this.backingStore.get("recommendedActions");
    }
    /**
     * Gets the severity property value. The severity property
     * @return a {@link AlertSeverity}
     */
    @jakarta.annotation.Nullable
    public AlertSeverity getSeverity() {
        return this.backingStore.get("severity");
    }
    /**
     * Gets the tactics property value. The MITRE ATT&amp;CK tactics framing for this alert.
     * @return a {@link java.util.List<MitreTactic>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MitreTactic> getTactics() {
        return this.backingStore.get("tactics");
    }
    /**
     * Gets the title property value. Name of the alert triggered by the custom detection rule.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.backingStore.get("title");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("customDetails", this.getCustomDetails());
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("entityMappings", this.getEntityMappings());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("recommendedActions", this.getRecommendedActions());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeCollectionOfObjectValues("tactics", this.getTactics());
        writer.writeStringValue("title", this.getTitle());
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
     * Sets the customDetails property value. Custom key-value detail pairs to include in the alert. Each value identifies the detection query column that supplies the corresponding custom detail.
     * @param value Value to set for the customDetails property.
     */
    public void setCustomDetails(@jakarta.annotation.Nullable final AlertCustomDetails value) {
        this.backingStore.set("customDetails", value);
    }
    /**
     * Sets the description property value. Description of the alert triggered by the custom detection rule.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the entityMappings property value. The entityMappings property
     * @param value Value to set for the entityMappings property.
     */
    public void setEntityMappings(@jakarta.annotation.Nullable final EntityMappingConfiguration value) {
        this.backingStore.set("entityMappings", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the recommendedActions property value. Recommended actions to mitigate the threat related to the alert triggered by the custom detection rule.
     * @param value Value to set for the recommendedActions property.
     */
    public void setRecommendedActions(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recommendedActions", value);
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final AlertSeverity value) {
        this.backingStore.set("severity", value);
    }
    /**
     * Sets the tactics property value. The MITRE ATT&amp;CK tactics framing for this alert.
     * @param value Value to set for the tactics property.
     */
    public void setTactics(@jakarta.annotation.Nullable final java.util.List<MitreTactic> value) {
        this.backingStore.set("tactics", value);
    }
    /**
     * Sets the title property value. Name of the alert triggered by the custom detection rule.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("title", value);
    }
}
