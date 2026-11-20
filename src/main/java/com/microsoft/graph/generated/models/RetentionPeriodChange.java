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
public class RetentionPeriodChange implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link RetentionPeriodChange} and sets the default values.
     */
    public RetentionPeriodChange() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RetentionPeriodChange}
     */
    @jakarta.annotation.Nonnull
    public static RetentionPeriodChange createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RetentionPeriodChange();
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
     * Gets the effectiveFromDateTime property value. The date and time from which the retention period change takes effect. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2026, is 2026-01-01T00:00:00Z. Nullable.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEffectiveFromDateTime() {
        return this.backingStore.get("effectiveFromDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("effectiveFromDateTime", (n) -> { this.setEffectiveFromDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(RetentionPeriodChangeStatus::forValue)); });
        deserializerMap.put("targetRetentionPeriodInDays", (n) -> { this.setTargetRetentionPeriodInDays(n.getIntegerValue()); });
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
     * Gets the status property value. The status property
     * @return a {@link RetentionPeriodChangeStatus}
     */
    @jakarta.annotation.Nullable
    public RetentionPeriodChangeStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the targetRetentionPeriodInDays property value. Specifies the retention period, in days, that applies after the change is completed. Nullable.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTargetRetentionPeriodInDays() {
        return this.backingStore.get("targetRetentionPeriodInDays");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("effectiveFromDateTime", this.getEffectiveFromDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeIntegerValue("targetRetentionPeriodInDays", this.getTargetRetentionPeriodInDays());
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
     * Sets the effectiveFromDateTime property value. The date and time from which the retention period change takes effect. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2026, is 2026-01-01T00:00:00Z. Nullable.
     * @param value Value to set for the effectiveFromDateTime property.
     */
    public void setEffectiveFromDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("effectiveFromDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final RetentionPeriodChangeStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the targetRetentionPeriodInDays property value. Specifies the retention period, in days, that applies after the change is completed. Nullable.
     * @param value Value to set for the targetRetentionPeriodInDays property.
     */
    public void setTargetRetentionPeriodInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("targetRetentionPeriodInDays", value);
    }
}
