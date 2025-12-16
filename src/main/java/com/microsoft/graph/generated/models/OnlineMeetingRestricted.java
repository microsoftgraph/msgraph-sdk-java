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
public class OnlineMeetingRestricted implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link OnlineMeetingRestricted} and sets the default values.
     */
    public OnlineMeetingRestricted() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnlineMeetingRestricted}
     */
    @jakarta.annotation.Nonnull
    public static OnlineMeetingRestricted createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnlineMeetingRestricted();
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
     * Gets the contentSharingDisabled property value. Specifies the reason shared content from this participant is disabled. The possible values are: watermarkProtection, unknownFutureValue.
     * @return a {@link EnumSet<OnlineMeetingContentSharingDisabledReason>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<OnlineMeetingContentSharingDisabledReason> getContentSharingDisabled() {
        return this.backingStore.get("contentSharingDisabled");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("contentSharingDisabled", (n) -> { this.setContentSharingDisabled(n.getEnumSetValue(OnlineMeetingContentSharingDisabledReason::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("videoDisabled", (n) -> { this.setVideoDisabled(n.getEnumSetValue(OnlineMeetingVideoDisabledReason::forValue)); });
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
     * Gets the videoDisabled property value. Specifies the reason video from this participant is disabled. The possible values are: watermarkProtection, unknownFutureValue.
     * @return a {@link EnumSet<OnlineMeetingVideoDisabledReason>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<OnlineMeetingVideoDisabledReason> getVideoDisabled() {
        return this.backingStore.get("videoDisabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumSetValue("contentSharingDisabled", this.getContentSharingDisabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumSetValue("videoDisabled", this.getVideoDisabled());
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
     * Sets the contentSharingDisabled property value. Specifies the reason shared content from this participant is disabled. The possible values are: watermarkProtection, unknownFutureValue.
     * @param value Value to set for the contentSharingDisabled property.
     */
    public void setContentSharingDisabled(@jakarta.annotation.Nullable final EnumSet<OnlineMeetingContentSharingDisabledReason> value) {
        this.backingStore.set("contentSharingDisabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the videoDisabled property value. Specifies the reason video from this participant is disabled. The possible values are: watermarkProtection, unknownFutureValue.
     * @param value Value to set for the videoDisabled property.
     */
    public void setVideoDisabled(@jakarta.annotation.Nullable final EnumSet<OnlineMeetingVideoDisabledReason> value) {
        this.backingStore.set("videoDisabled", value);
    }
}
