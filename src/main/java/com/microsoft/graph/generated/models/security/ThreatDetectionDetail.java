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
public class ThreatDetectionDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ThreatDetectionDetail} and sets the default values.
     */
    public ThreatDetectionDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ThreatDetectionDetail}
     */
    @jakarta.annotation.Nonnull
    public static ThreatDetectionDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ThreatDetectionDetail();
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
     * Gets the confidenceLevel property value. Indicates the confidence level in the threat detection.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConfidenceLevel() {
        return this.backingStore.get("confidenceLevel");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("confidenceLevel", (n) -> { this.setConfidenceLevel(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("priorityAccountProtection", (n) -> { this.setPriorityAccountProtection(n.getStringValue()); });
        deserializerMap.put("threats", (n) -> { this.setThreats(n.getStringValue()); });
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
     * Gets the priorityAccountProtection property value. Indicates if the account has priority protection enabled.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPriorityAccountProtection() {
        return this.backingStore.get("priorityAccountProtection");
    }
    /**
     * Gets the threats property value. Lists the detected threats.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThreats() {
        return this.backingStore.get("threats");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("confidenceLevel", this.getConfidenceLevel());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("priorityAccountProtection", this.getPriorityAccountProtection());
        writer.writeStringValue("threats", this.getThreats());
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
     * Sets the confidenceLevel property value. Indicates the confidence level in the threat detection.
     * @param value Value to set for the confidenceLevel property.
     */
    public void setConfidenceLevel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("confidenceLevel", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the priorityAccountProtection property value. Indicates if the account has priority protection enabled.
     * @param value Value to set for the priorityAccountProtection property.
     */
    public void setPriorityAccountProtection(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("priorityAccountProtection", value);
    }
    /**
     * Sets the threats property value. Lists the detected threats.
     * @param value Value to set for the threats property.
     */
    public void setThreats(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("threats", value);
    }
}
