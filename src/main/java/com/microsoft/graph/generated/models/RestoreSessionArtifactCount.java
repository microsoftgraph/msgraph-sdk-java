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
public class RestoreSessionArtifactCount implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link RestoreSessionArtifactCount} and sets the default values.
     */
    public RestoreSessionArtifactCount() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RestoreSessionArtifactCount}
     */
    @jakarta.annotation.Nonnull
    public static RestoreSessionArtifactCount createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RestoreSessionArtifactCount();
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
     * Gets the completed property value. The number of artifacts whose restoration completed.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCompleted() {
        return this.backingStore.get("completed");
    }
    /**
     * Gets the failed property value. The number of artifacts whose restoration failed.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailed() {
        return this.backingStore.get("failed");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("completed", (n) -> { this.setCompleted(n.getIntegerValue()); });
        deserializerMap.put("failed", (n) -> { this.setFailed(n.getIntegerValue()); });
        deserializerMap.put("inProgress", (n) -> { this.setInProgress(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inProgress property value. The number of artifacts whose restoration is in progress.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getInProgress() {
        return this.backingStore.get("inProgress");
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
     * Gets the total property value. The number of artifacts present in the restore session.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotal() {
        return this.backingStore.get("total");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("completed", this.getCompleted());
        writer.writeIntegerValue("failed", this.getFailed());
        writer.writeIntegerValue("inProgress", this.getInProgress());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("total", this.getTotal());
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
     * Sets the completed property value. The number of artifacts whose restoration completed.
     * @param value Value to set for the completed property.
     */
    public void setCompleted(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("completed", value);
    }
    /**
     * Sets the failed property value. The number of artifacts whose restoration failed.
     * @param value Value to set for the failed property.
     */
    public void setFailed(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failed", value);
    }
    /**
     * Sets the inProgress property value. The number of artifacts whose restoration is in progress.
     * @param value Value to set for the inProgress property.
     */
    public void setInProgress(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("inProgress", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the total property value. The number of artifacts present in the restore session.
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("total", value);
    }
}
