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
public class SynchronizationQuarantine implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new SynchronizationQuarantine and sets the default values.
     */
    public SynchronizationQuarantine() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SynchronizationQuarantine
     */
    @jakarta.annotation.Nonnull
    public static SynchronizationQuarantine createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationQuarantine();
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
     * Gets the currentBegan property value. Date and time when the quarantine was last evaluated and imposed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCurrentBegan() {
        return this.BackingStore.get("currentBegan");
    }
    /**
     * Gets the error property value. Describes the error(s) that occurred when putting the synchronization job into quarantine.
     * @return a SynchronizationError
     */
    @jakarta.annotation.Nullable
    public SynchronizationError getError() {
        return this.BackingStore.get("error");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("currentBegan", (n) -> { this.setCurrentBegan(n.getOffsetDateTimeValue()); });
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(SynchronizationError::createFromDiscriminatorValue)); });
        deserializerMap.put("nextAttempt", (n) -> { this.setNextAttempt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getEnumValue(QuarantineReason.class)); });
        deserializerMap.put("seriesBegan", (n) -> { this.setSeriesBegan(n.getOffsetDateTimeValue()); });
        deserializerMap.put("seriesCount", (n) -> { this.setSeriesCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the nextAttempt property value. Date and time when the next attempt to re-evaluate the quarantine will be made. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getNextAttempt() {
        return this.BackingStore.get("nextAttempt");
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
     * Gets the reason property value. The reason property
     * @return a QuarantineReason
     */
    @jakarta.annotation.Nullable
    public QuarantineReason getReason() {
        return this.BackingStore.get("reason");
    }
    /**
     * Gets the seriesBegan property value. Date and time when the quarantine was first imposed in this series (a series starts when a quarantine is first imposed, and is reset as soon as the quarantine is lifted). The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSeriesBegan() {
        return this.BackingStore.get("seriesBegan");
    }
    /**
     * Gets the seriesCount property value. Number of times in this series the quarantine was re-evaluated and left in effect (a series starts when quarantine is first imposed, and is reset as soon as quarantine is lifted).
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSeriesCount() {
        return this.BackingStore.get("seriesCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("currentBegan", this.getCurrentBegan());
        writer.writeObjectValue("error", this.getError());
        writer.writeOffsetDateTimeValue("nextAttempt", this.getNextAttempt());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("reason", this.getReason());
        writer.writeOffsetDateTimeValue("seriesBegan", this.getSeriesBegan());
        writer.writeLongValue("seriesCount", this.getSeriesCount());
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
     * Sets the currentBegan property value. Date and time when the quarantine was last evaluated and imposed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the currentBegan property.
     */
    public void setCurrentBegan(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("currentBegan", value);
    }
    /**
     * Sets the error property value. Describes the error(s) that occurred when putting the synchronization job into quarantine.
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final SynchronizationError value) {
        this.BackingStore.set("error", value);
    }
    /**
     * Sets the nextAttempt property value. Date and time when the next attempt to re-evaluate the quarantine will be made. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the nextAttempt property.
     */
    public void setNextAttempt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("nextAttempt", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the reason property value. The reason property
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final QuarantineReason value) {
        this.BackingStore.set("reason", value);
    }
    /**
     * Sets the seriesBegan property value. Date and time when the quarantine was first imposed in this series (a series starts when a quarantine is first imposed, and is reset as soon as the quarantine is lifted). The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the seriesBegan property.
     */
    public void setSeriesBegan(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("seriesBegan", value);
    }
    /**
     * Sets the seriesCount property value. Number of times in this series the quarantine was re-evaluated and left in effect (a series starts when quarantine is first imposed, and is reset as soon as quarantine is lifted).
     * @param value Value to set for the seriesCount property.
     */
    public void setSeriesCount(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("seriesCount", value);
    }
}
