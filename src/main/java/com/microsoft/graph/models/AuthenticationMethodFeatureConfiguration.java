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
public class AuthenticationMethodFeatureConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new AuthenticationMethodFeatureConfiguration and sets the default values.
     */
    public AuthenticationMethodFeatureConfiguration() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuthenticationMethodFeatureConfiguration
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationMethodFeatureConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationMethodFeatureConfiguration();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the excludeTarget property value. A single entity that is excluded from this feature.
     * @return a FeatureTarget
     */
    @jakarta.annotation.Nullable
    public FeatureTarget getExcludeTarget() {
        return this.getBackingStore().get("excludeTarget");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("excludeTarget", (n) -> { this.setExcludeTarget(n.getObjectValue(FeatureTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("includeTarget", (n) -> { this.setIncludeTarget(n.getObjectValue(FeatureTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(AdvancedConfigState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the includeTarget property value. A single entity that is included in this feature.
     * @return a FeatureTarget
     */
    @jakarta.annotation.Nullable
    public FeatureTarget getIncludeTarget() {
        return this.getBackingStore().get("includeTarget");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Gets the state property value. Enable or disable the feature. Possible values are: default, enabled, disabled, unknownFutureValue. The default value is used when the configuration hasn't been explicitly set and uses the default behavior of Microsoft Entra ID for the setting. The default value is disabled.
     * @return a AdvancedConfigState
     */
    @jakarta.annotation.Nullable
    public AdvancedConfigState getState() {
        return this.getBackingStore().get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("excludeTarget", this.getExcludeTarget());
        writer.writeObjectValue("includeTarget", this.getIncludeTarget());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("state", this.getState());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the excludeTarget property value. A single entity that is excluded from this feature.
     * @param value Value to set for the excludeTarget property.
     */
    public void setExcludeTarget(@jakarta.annotation.Nullable final FeatureTarget value) {
        this.getBackingStore().set("excludeTarget", value);
    }
    /**
     * Sets the includeTarget property value. A single entity that is included in this feature.
     * @param value Value to set for the includeTarget property.
     */
    public void setIncludeTarget(@jakarta.annotation.Nullable final FeatureTarget value) {
        this.getBackingStore().set("includeTarget", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the state property value. Enable or disable the feature. Possible values are: default, enabled, disabled, unknownFutureValue. The default value is used when the configuration hasn't been explicitly set and uses the default behavior of Microsoft Entra ID for the setting. The default value is disabled.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final AdvancedConfigState value) {
        this.getBackingStore().set("state", value);
    }
}
