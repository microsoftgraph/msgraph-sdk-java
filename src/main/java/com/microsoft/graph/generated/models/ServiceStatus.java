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
public class ServiceStatus implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ServiceStatus} and sets the default values.
     */
    public ServiceStatus() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ServiceStatus}
     */
    @jakarta.annotation.Nonnull
    public static ServiceStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceStatus();
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
     * Gets the backupServiceConsumer property value. The type of consumer. The possible values are: unknown, firstparty, thirdparty, unknownFutureValue.
     * @return a {@link BackupServiceConsumer}
     */
    @jakarta.annotation.Nullable
    public BackupServiceConsumer getBackupServiceConsumer() {
        return this.backingStore.get("backupServiceConsumer");
    }
    /**
     * Gets the disableReason property value. The reason the service is disabled. The possible values are: none, controllerServiceAppDeleted, invalidBillingProfile, userRequested, unknownFutureValue.
     * @return a {@link DisableReason}
     */
    @jakarta.annotation.Nullable
    public DisableReason getDisableReason() {
        return this.backingStore.get("disableReason");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("backupServiceConsumer", (n) -> { this.setBackupServiceConsumer(n.getEnumValue(BackupServiceConsumer::forValue)); });
        deserializerMap.put("disableReason", (n) -> { this.setDisableReason(n.getEnumValue(DisableReason::forValue)); });
        deserializerMap.put("gracePeriodDateTime", (n) -> { this.setGracePeriodDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("restoreAllowedTillDateTime", (n) -> { this.setRestoreAllowedTillDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(BackupServiceStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the gracePeriodDateTime property value. The expiration time of the grace period.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getGracePeriodDateTime() {
        return this.backingStore.get("gracePeriodDateTime");
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the person who last modified the entity.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. Timestamp of the last modification of the entity.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
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
     * Gets the restoreAllowedTillDateTime property value. The expiration time of the restoration allowed period.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRestoreAllowedTillDateTime() {
        return this.backingStore.get("restoreAllowedTillDateTime");
    }
    /**
     * Gets the status property value. Status of the service. This value indicates what capabilities can be used. The possible values are: disabled, enabled, protectionChangeLocked, restoreLocked, unknownFutureValue.
     * @return a {@link BackupServiceStatus}
     */
    @jakarta.annotation.Nullable
    public BackupServiceStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("backupServiceConsumer", this.getBackupServiceConsumer());
        writer.writeEnumValue("disableReason", this.getDisableReason());
        writer.writeOffsetDateTimeValue("gracePeriodDateTime", this.getGracePeriodDateTime());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("restoreAllowedTillDateTime", this.getRestoreAllowedTillDateTime());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the backupServiceConsumer property value. The type of consumer. The possible values are: unknown, firstparty, thirdparty, unknownFutureValue.
     * @param value Value to set for the backupServiceConsumer property.
     */
    public void setBackupServiceConsumer(@jakarta.annotation.Nullable final BackupServiceConsumer value) {
        this.backingStore.set("backupServiceConsumer", value);
    }
    /**
     * Sets the disableReason property value. The reason the service is disabled. The possible values are: none, controllerServiceAppDeleted, invalidBillingProfile, userRequested, unknownFutureValue.
     * @param value Value to set for the disableReason property.
     */
    public void setDisableReason(@jakarta.annotation.Nullable final DisableReason value) {
        this.backingStore.set("disableReason", value);
    }
    /**
     * Sets the gracePeriodDateTime property value. The expiration time of the grace period.
     * @param value Value to set for the gracePeriodDateTime property.
     */
    public void setGracePeriodDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("gracePeriodDateTime", value);
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the person who last modified the entity.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Timestamp of the last modification of the entity.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the restoreAllowedTillDateTime property value. The expiration time of the restoration allowed period.
     * @param value Value to set for the restoreAllowedTillDateTime property.
     */
    public void setRestoreAllowedTillDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("restoreAllowedTillDateTime", value);
    }
    /**
     * Sets the status property value. Status of the service. This value indicates what capabilities can be used. The possible values are: disabled, enabled, protectionChangeLocked, restoreLocked, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final BackupServiceStatus value) {
        this.backingStore.set("status", value);
    }
}
