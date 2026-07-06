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
public class AnalyzedEmailDeliveryDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AnalyzedEmailDeliveryDetail} and sets the default values.
     */
    public AnalyzedEmailDeliveryDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AnalyzedEmailDeliveryDetail}
     */
    @jakarta.annotation.Nonnull
    public static AnalyzedEmailDeliveryDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AnalyzedEmailDeliveryDetail();
    }
    /**
     * Gets the action property value. The delivery action of the email. The possible values are: unknown, deliveredToJunk, delivered, blocked, replaced, unknownFutureValue.
     * @return a {@link DeliveryAction}
     */
    @jakarta.annotation.Nullable
    public DeliveryAction getAction() {
        return this.backingStore.get("action");
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(DeliveryAction::forValue)); });
        deserializerMap.put("latestThreats", (n) -> { this.setLatestThreats(n.getStringValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getEnumValue(DeliveryLocation::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("originalThreats", (n) -> { this.setOriginalThreats(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the latestThreats property value. Latest known threat on the email.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLatestThreats() {
        return this.backingStore.get("latestThreats");
    }
    /**
     * Gets the location property value. The delivery location of the email. The possible values are: unknown, inboxfolder, junkFolder, deletedFolder, quarantine, onpremexternal, failed, dropped, others, unknownFutureValue.
     * @return a {@link DeliveryLocation}
     */
    @jakarta.annotation.Nullable
    public DeliveryLocation getLocation() {
        return this.backingStore.get("location");
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
     * Gets the originalThreats property value. Threats identified at the time of delivery.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOriginalThreats() {
        return this.backingStore.get("originalThreats");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeStringValue("latestThreats", this.getLatestThreats());
        writer.writeEnumValue("location", this.getLocation());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("originalThreats", this.getOriginalThreats());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. The delivery action of the email. The possible values are: unknown, deliveredToJunk, delivered, blocked, replaced, unknownFutureValue.
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final DeliveryAction value) {
        this.backingStore.set("action", value);
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
     * Sets the latestThreats property value. Latest known threat on the email.
     * @param value Value to set for the latestThreats property.
     */
    public void setLatestThreats(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("latestThreats", value);
    }
    /**
     * Sets the location property value. The delivery location of the email. The possible values are: unknown, inboxfolder, junkFolder, deletedFolder, quarantine, onpremexternal, failed, dropped, others, unknownFutureValue.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final DeliveryLocation value) {
        this.backingStore.set("location", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the originalThreats property value. Threats identified at the time of delivery.
     * @param value Value to set for the originalThreats property.
     */
    public void setOriginalThreats(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("originalThreats", value);
    }
}
