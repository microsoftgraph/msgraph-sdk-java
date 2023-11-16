package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SynchronizationProgress implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new SynchronizationProgress and sets the default values.
     */
    public SynchronizationProgress() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SynchronizationProgress
     */
    @jakarta.annotation.Nonnull
    public static SynchronizationProgress createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationProgress();
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
     * Gets the completedUnits property value. The numerator of a progress ratio; the number of units of changes already processed.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getCompletedUnits() {
        return this.BackingStore.get("completedUnits");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("completedUnits", (n) -> { this.setCompletedUnits(n.getLongValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("progressObservationDateTime", (n) -> { this.setProgressObservationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("totalUnits", (n) -> { this.setTotalUnits(n.getLongValue()); });
        deserializerMap.put("units", (n) -> { this.setUnits(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the progressObservationDateTime property value. The time of a progress observation as an offset in minutes from UTC.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getProgressObservationDateTime() {
        return this.BackingStore.get("progressObservationDateTime");
    }
    /**
     * Gets the totalUnits property value. The denominator of a progress ratio; a number of units of changes to be processed to accomplish synchronization.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getTotalUnits() {
        return this.BackingStore.get("totalUnits");
    }
    /**
     * Gets the units property value. An optional description of the units.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUnits() {
        return this.BackingStore.get("units");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("completedUnits", this.getCompletedUnits());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("progressObservationDateTime", this.getProgressObservationDateTime());
        writer.writeLongValue("totalUnits", this.getTotalUnits());
        writer.writeStringValue("units", this.getUnits());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
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
     * Sets the completedUnits property value. The numerator of a progress ratio; the number of units of changes already processed.
     * @param value Value to set for the completedUnits property.
     */
    public void setCompletedUnits(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("completedUnits", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the progressObservationDateTime property value. The time of a progress observation as an offset in minutes from UTC.
     * @param value Value to set for the progressObservationDateTime property.
     */
    public void setProgressObservationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("progressObservationDateTime", value);
    }
    /**
     * Sets the totalUnits property value. The denominator of a progress ratio; a number of units of changes to be processed to accomplish synchronization.
     * @param value Value to set for the totalUnits property.
     */
    public void setTotalUnits(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("totalUnits", value);
    }
    /**
     * Sets the units property value. An optional description of the units.
     * @param value Value to set for the units property.
     */
    public void setUnits(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("units", value);
    }
}
