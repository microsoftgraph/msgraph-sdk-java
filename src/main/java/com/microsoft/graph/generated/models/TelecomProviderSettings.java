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
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TelecomProviderSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link TelecomProviderSettings} and sets the default values.
     */
    public TelecomProviderSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TelecomProviderSettings}
     */
    @jakarta.annotation.Nonnull
    public static TelecomProviderSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TelecomProviderSettings();
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
     * Gets the appId property value. The application (client) ID used to authenticate to the telecom provider.
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getAppId() {
        return this.backingStore.get("appId");
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
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getUUIDValue()); });
        deserializerMap.put("isEvaluationModeEnabled", (n) -> { this.setIsEvaluationModeEnabled(n.getBooleanValue()); });
        deserializerMap.put("migrationPercentage", (n) -> { this.setMigrationPercentage(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEvaluationModeEnabled property value. true to run the telecom provider integration in evaluation (nonenforcing) mode; otherwise, false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEvaluationModeEnabled() {
        return this.backingStore.get("isEvaluationModeEnabled");
    }
    /**
     * Gets the migrationPercentage property value. The percentage of authentication traffic routed to the telecom provider. Valid values range from 0 through 100.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMigrationPercentage() {
        return this.backingStore.get("migrationPercentage");
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
     * Gets the url property value. The endpoint URL of the telecom provider integration.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.backingStore.get("url");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeUUIDValue("appId", this.getAppId());
        writer.writeBooleanValue("isEvaluationModeEnabled", this.getIsEvaluationModeEnabled());
        writer.writeIntegerValue("migrationPercentage", this.getMigrationPercentage());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("url", this.getUrl());
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
     * Sets the appId property value. The application (client) ID used to authenticate to the telecom provider.
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("appId", value);
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
     * Sets the isEvaluationModeEnabled property value. true to run the telecom provider integration in evaluation (nonenforcing) mode; otherwise, false.
     * @param value Value to set for the isEvaluationModeEnabled property.
     */
    public void setIsEvaluationModeEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEvaluationModeEnabled", value);
    }
    /**
     * Sets the migrationPercentage property value. The percentage of authentication traffic routed to the telecom provider. Valid values range from 0 through 100.
     * @param value Value to set for the migrationPercentage property.
     */
    public void setMigrationPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("migrationPercentage", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the url property value. The endpoint URL of the telecom provider integration.
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("url", value);
    }
}
