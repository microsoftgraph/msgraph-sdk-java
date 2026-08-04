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
public class CloudVideoInteropInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CloudVideoInteropInfo} and sets the default values.
     */
    public CloudVideoInteropInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudVideoInteropInfo}
     */
    @jakarta.annotation.Nonnull
    public static CloudVideoInteropInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudVideoInteropInfo();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("moreInfoWebUrl", (n) -> { this.setMoreInfoWebUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("tenantKey", (n) -> { this.setTenantKey(n.getStringValue()); });
        deserializerMap.put("videoTeleconferenceId", (n) -> { this.setVideoTeleconferenceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the moreInfoWebUrl property value. Provides other video teleconferencing (VTC) dial-in options. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMoreInfoWebUrl() {
        return this.backingStore.get("moreInfoWebUrl");
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
     * Gets the tenantKey property value. The tenant key that is used to dial into the interactive voice response (IVR) of the partner CVI service.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantKey() {
        return this.backingStore.get("tenantKey");
    }
    /**
     * Gets the videoTeleconferenceId property value. The video teleconferencing ID. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVideoTeleconferenceId() {
        return this.backingStore.get("videoTeleconferenceId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("moreInfoWebUrl", this.getMoreInfoWebUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("tenantKey", this.getTenantKey());
        writer.writeStringValue("videoTeleconferenceId", this.getVideoTeleconferenceId());
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
     * Sets the moreInfoWebUrl property value. Provides other video teleconferencing (VTC) dial-in options. Read-only.
     * @param value Value to set for the moreInfoWebUrl property.
     */
    public void setMoreInfoWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("moreInfoWebUrl", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the tenantKey property value. The tenant key that is used to dial into the interactive voice response (IVR) of the partner CVI service.
     * @param value Value to set for the tenantKey property.
     */
    public void setTenantKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantKey", value);
    }
    /**
     * Sets the videoTeleconferenceId property value. The video teleconferencing ID. Read-only.
     * @param value Value to set for the videoTeleconferenceId property.
     */
    public void setVideoTeleconferenceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("videoTeleconferenceId", value);
    }
}
