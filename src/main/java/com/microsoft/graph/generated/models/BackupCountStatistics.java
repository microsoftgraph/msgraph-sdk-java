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
public class BackupCountStatistics implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link BackupCountStatistics} and sets the default values.
     */
    public BackupCountStatistics() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BackupCountStatistics}
     */
    @jakarta.annotation.Nonnull
    public static BackupCountStatistics createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BackupCountStatistics();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("lastComputedDateTime", (n) -> { this.setLastComputedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("offboardRequested", (n) -> { this.setOffboardRequested(n.getIntegerValue()); });
        deserializerMap.put("protectedCompleted", (n) -> { this.setProtectedCompleted(n.getIntegerValue()); });
        deserializerMap.put("protectedFailed", (n) -> { this.setProtectedFailed(n.getIntegerValue()); });
        deserializerMap.put("protectedInProgress", (n) -> { this.setProtectedInProgress(n.getIntegerValue()); });
        deserializerMap.put("removed", (n) -> { this.setRemoved(n.getIntegerValue()); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getIntegerValue()); });
        deserializerMap.put("unprotectedCompleted", (n) -> { this.setUnprotectedCompleted(n.getIntegerValue()); });
        deserializerMap.put("unprotectedFailed", (n) -> { this.setUnprotectedFailed(n.getIntegerValue()); });
        deserializerMap.put("unprotectedInProgress", (n) -> { this.setUnprotectedInProgress(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastComputedDateTime property value. The date and time when this metric was calculated. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastComputedDateTime() {
        return this.backingStore.get("lastComputedDateTime");
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
     * Gets the offboardRequested property value. The count of artifacts in offboardRequested state. This metric captures artifacts in protectionunitlevel offboarding and artifacts offboarded due to an unhealthy billing profile.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOffboardRequested() {
        return this.backingStore.get("offboardRequested");
    }
    /**
     * Gets the protectedCompleted property value. The count of artifacts in protected state.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getProtectedCompleted() {
        return this.backingStore.get("protectedCompleted");
    }
    /**
     * Gets the protectedFailed property value. The count of artifacts whose protection was attempted but failed. These artifacts typically have unprotected as their status.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getProtectedFailed() {
        return this.backingStore.get("protectedFailed");
    }
    /**
     * Gets the protectedInProgress property value. The count of artifacts whose protection attempt is currently in progress. This metric applies to artifacts for which the process to start or resume taking backups is still required.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getProtectedInProgress() {
        return this.backingStore.get("protectedInProgress");
    }
    /**
     * Gets the removed property value. The count of artifacts not associated with any policy. This property is always null for a policy-level report. Nullable.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRemoved() {
        return this.backingStore.get("removed");
    }
    /**
     * Gets the total property value. The count of artifacts in the specified entity. The currently supported entity is a backup policy.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotal() {
        return this.backingStore.get("total");
    }
    /**
     * Gets the unprotectedCompleted property value. The count of artifacts that are no longer actively protected. These artifacts have historical restore points, but no new backups are taken.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUnprotectedCompleted() {
        return this.backingStore.get("unprotectedCompleted");
    }
    /**
     * Gets the unprotectedFailed property value. The count of artifacts for which unprotection was attempted but didn&apos;t complete. These artifacts are typically in the protected state.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUnprotectedFailed() {
        return this.backingStore.get("unprotectedFailed");
    }
    /**
     * Gets the unprotectedInProgress property value. The count of artifacts for which unprotection is currently in progress.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUnprotectedInProgress() {
        return this.backingStore.get("unprotectedInProgress");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("lastComputedDateTime", this.getLastComputedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("offboardRequested", this.getOffboardRequested());
        writer.writeIntegerValue("protectedCompleted", this.getProtectedCompleted());
        writer.writeIntegerValue("protectedFailed", this.getProtectedFailed());
        writer.writeIntegerValue("protectedInProgress", this.getProtectedInProgress());
        writer.writeIntegerValue("removed", this.getRemoved());
        writer.writeIntegerValue("total", this.getTotal());
        writer.writeIntegerValue("unprotectedCompleted", this.getUnprotectedCompleted());
        writer.writeIntegerValue("unprotectedFailed", this.getUnprotectedFailed());
        writer.writeIntegerValue("unprotectedInProgress", this.getUnprotectedInProgress());
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
     * Sets the lastComputedDateTime property value. The date and time when this metric was calculated. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastComputedDateTime property.
     */
    public void setLastComputedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastComputedDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the offboardRequested property value. The count of artifacts in offboardRequested state. This metric captures artifacts in protectionunitlevel offboarding and artifacts offboarded due to an unhealthy billing profile.
     * @param value Value to set for the offboardRequested property.
     */
    public void setOffboardRequested(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("offboardRequested", value);
    }
    /**
     * Sets the protectedCompleted property value. The count of artifacts in protected state.
     * @param value Value to set for the protectedCompleted property.
     */
    public void setProtectedCompleted(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("protectedCompleted", value);
    }
    /**
     * Sets the protectedFailed property value. The count of artifacts whose protection was attempted but failed. These artifacts typically have unprotected as their status.
     * @param value Value to set for the protectedFailed property.
     */
    public void setProtectedFailed(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("protectedFailed", value);
    }
    /**
     * Sets the protectedInProgress property value. The count of artifacts whose protection attempt is currently in progress. This metric applies to artifacts for which the process to start or resume taking backups is still required.
     * @param value Value to set for the protectedInProgress property.
     */
    public void setProtectedInProgress(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("protectedInProgress", value);
    }
    /**
     * Sets the removed property value. The count of artifacts not associated with any policy. This property is always null for a policy-level report. Nullable.
     * @param value Value to set for the removed property.
     */
    public void setRemoved(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("removed", value);
    }
    /**
     * Sets the total property value. The count of artifacts in the specified entity. The currently supported entity is a backup policy.
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("total", value);
    }
    /**
     * Sets the unprotectedCompleted property value. The count of artifacts that are no longer actively protected. These artifacts have historical restore points, but no new backups are taken.
     * @param value Value to set for the unprotectedCompleted property.
     */
    public void setUnprotectedCompleted(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("unprotectedCompleted", value);
    }
    /**
     * Sets the unprotectedFailed property value. The count of artifacts for which unprotection was attempted but didn&apos;t complete. These artifacts are typically in the protected state.
     * @param value Value to set for the unprotectedFailed property.
     */
    public void setUnprotectedFailed(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("unprotectedFailed", value);
    }
    /**
     * Sets the unprotectedInProgress property value. The count of artifacts for which unprotection is currently in progress.
     * @param value Value to set for the unprotectedInProgress property.
     */
    public void setUnprotectedInProgress(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("unprotectedInProgress", value);
    }
}
