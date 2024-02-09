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
public class Quota implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link Quota} and sets the default values.
     */
    public Quota() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Quota}
     */
    @jakarta.annotation.Nonnull
    public static Quota createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Quota();
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
     * Gets the deleted property value. Total space consumed by files in the recycle bin, in bytes. Read-only.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getDeleted() {
        return this.backingStore.get("deleted");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("deleted", (n) -> { this.setDeleted(n.getLongValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("remaining", (n) -> { this.setRemaining(n.getLongValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("storagePlanInformation", (n) -> { this.setStoragePlanInformation(n.getObjectValue(StoragePlanInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getLongValue()); });
        deserializerMap.put("used", (n) -> { this.setUsed(n.getLongValue()); });
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
     * Gets the remaining property value. Total space remaining before reaching the quota limit, in bytes. Read-only.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getRemaining() {
        return this.backingStore.get("remaining");
    }
    /**
     * Gets the state property value. Enumeration value that indicates the state of the storage space. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the storagePlanInformation property value. Information about the drive's storage quota plans. Only in Personal OneDrive.
     * @return a {@link StoragePlanInformation}
     */
    @jakarta.annotation.Nullable
    public StoragePlanInformation getStoragePlanInformation() {
        return this.backingStore.get("storagePlanInformation");
    }
    /**
     * Gets the total property value. Total allowed storage space, in bytes. Read-only.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotal() {
        return this.backingStore.get("total");
    }
    /**
     * Gets the used property value. Total space used, in bytes. Read-only.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getUsed() {
        return this.backingStore.get("used");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("deleted", this.getDeleted());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("remaining", this.getRemaining());
        writer.writeStringValue("state", this.getState());
        writer.writeObjectValue("storagePlanInformation", this.getStoragePlanInformation());
        writer.writeLongValue("total", this.getTotal());
        writer.writeLongValue("used", this.getUsed());
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
     * Sets the deleted property value. Total space consumed by files in the recycle bin, in bytes. Read-only.
     * @param value Value to set for the deleted property.
     */
    public void setDeleted(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("deleted", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the remaining property value. Total space remaining before reaching the quota limit, in bytes. Read-only.
     * @param value Value to set for the remaining property.
     */
    public void setRemaining(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("remaining", value);
    }
    /**
     * Sets the state property value. Enumeration value that indicates the state of the storage space. Read-only.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the storagePlanInformation property value. Information about the drive's storage quota plans. Only in Personal OneDrive.
     * @param value Value to set for the storagePlanInformation property.
     */
    public void setStoragePlanInformation(@jakarta.annotation.Nullable final StoragePlanInformation value) {
        this.backingStore.set("storagePlanInformation", value);
    }
    /**
     * Sets the total property value. Total allowed storage space, in bytes. Read-only.
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("total", value);
    }
    /**
     * Sets the used property value. Total space used, in bytes. Read-only.
     * @param value Value to set for the used property.
     */
    public void setUsed(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("used", value);
    }
}
