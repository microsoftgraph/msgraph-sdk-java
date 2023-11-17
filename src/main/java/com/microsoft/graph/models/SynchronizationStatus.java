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
public class SynchronizationStatus implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new SynchronizationStatus and sets the default values.
     */
    public SynchronizationStatus() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SynchronizationStatus
     */
    @jakarta.annotation.Nonnull
    public static SynchronizationStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationStatus();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the code property value. The code property
     * @return a SynchronizationStatusCode
     */
    @jakarta.annotation.Nullable
    public SynchronizationStatusCode getCode() {
        return this.backingStore.get("code");
    }
    /**
     * Gets the countSuccessiveCompleteFailures property value. Number of consecutive times this job failed.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getCountSuccessiveCompleteFailures() {
        return this.backingStore.get("countSuccessiveCompleteFailures");
    }
    /**
     * Gets the escrowsPruned property value. true if the job's escrows (object-level errors) were pruned during initial synchronization. Escrows can be pruned if during the initial synchronization, you reach the threshold of errors that would normally put the job in quarantine. Instead of going into quarantine, the synchronization process clears the job's errors and continues until the initial synchronization is completed. When the initial synchronization is completed, the job will pause and wait for the customer to clean up the errors.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEscrowsPruned() {
        return this.backingStore.get("escrowsPruned");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("code", (n) -> { this.setCode(n.getEnumValue(SynchronizationStatusCode.class)); });
        deserializerMap.put("countSuccessiveCompleteFailures", (n) -> { this.setCountSuccessiveCompleteFailures(n.getLongValue()); });
        deserializerMap.put("escrowsPruned", (n) -> { this.setEscrowsPruned(n.getBooleanValue()); });
        deserializerMap.put("lastExecution", (n) -> { this.setLastExecution(n.getObjectValue(SynchronizationTaskExecution::createFromDiscriminatorValue)); });
        deserializerMap.put("lastSuccessfulExecution", (n) -> { this.setLastSuccessfulExecution(n.getObjectValue(SynchronizationTaskExecution::createFromDiscriminatorValue)); });
        deserializerMap.put("lastSuccessfulExecutionWithExports", (n) -> { this.setLastSuccessfulExecutionWithExports(n.getObjectValue(SynchronizationTaskExecution::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("progress", (n) -> { this.setProgress(n.getCollectionOfObjectValues(SynchronizationProgress::createFromDiscriminatorValue)); });
        deserializerMap.put("quarantine", (n) -> { this.setQuarantine(n.getObjectValue(SynchronizationQuarantine::createFromDiscriminatorValue)); });
        deserializerMap.put("steadyStateFirstAchievedTime", (n) -> { this.setSteadyStateFirstAchievedTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("steadyStateLastAchievedTime", (n) -> { this.setSteadyStateLastAchievedTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("synchronizedEntryCountByType", (n) -> { this.setSynchronizedEntryCountByType(n.getCollectionOfObjectValues(StringKeyLongValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("troubleshootingUrl", (n) -> { this.setTroubleshootingUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastExecution property value. Details of the last execution of the job.
     * @return a SynchronizationTaskExecution
     */
    @jakarta.annotation.Nullable
    public SynchronizationTaskExecution getLastExecution() {
        return this.backingStore.get("lastExecution");
    }
    /**
     * Gets the lastSuccessfulExecution property value. Details of the last execution of this job, which didn't have any errors.
     * @return a SynchronizationTaskExecution
     */
    @jakarta.annotation.Nullable
    public SynchronizationTaskExecution getLastSuccessfulExecution() {
        return this.backingStore.get("lastSuccessfulExecution");
    }
    /**
     * Gets the lastSuccessfulExecutionWithExports property value. Details of the last execution of the job, which exported objects into the target directory.
     * @return a SynchronizationTaskExecution
     */
    @jakarta.annotation.Nullable
    public SynchronizationTaskExecution getLastSuccessfulExecutionWithExports() {
        return this.backingStore.get("lastSuccessfulExecutionWithExports");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the progress property value. Details of the progress of a job toward completion.
     * @return a java.util.List<SynchronizationProgress>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SynchronizationProgress> getProgress() {
        return this.backingStore.get("progress");
    }
    /**
     * Gets the quarantine property value. If job is in quarantine, quarantine details.
     * @return a SynchronizationQuarantine
     */
    @jakarta.annotation.Nullable
    public SynchronizationQuarantine getQuarantine() {
        return this.backingStore.get("quarantine");
    }
    /**
     * Gets the steadyStateFirstAchievedTime property value. The time when steady state (no more changes to the process) was first achieved. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSteadyStateFirstAchievedTime() {
        return this.backingStore.get("steadyStateFirstAchievedTime");
    }
    /**
     * Gets the steadyStateLastAchievedTime property value. The time when steady state (no more changes to the process) was last achieved. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSteadyStateLastAchievedTime() {
        return this.backingStore.get("steadyStateLastAchievedTime");
    }
    /**
     * Gets the synchronizedEntryCountByType property value. Count of synchronized objects, listed by object type.
     * @return a java.util.List<StringKeyLongValuePair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<StringKeyLongValuePair> getSynchronizedEntryCountByType() {
        return this.backingStore.get("synchronizedEntryCountByType");
    }
    /**
     * Gets the troubleshootingUrl property value. In the event of an error, the URL with the troubleshooting steps for the issue.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTroubleshootingUrl() {
        return this.backingStore.get("troubleshootingUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("code", this.getCode());
        writer.writeLongValue("countSuccessiveCompleteFailures", this.getCountSuccessiveCompleteFailures());
        writer.writeBooleanValue("escrowsPruned", this.getEscrowsPruned());
        writer.writeObjectValue("lastExecution", this.getLastExecution());
        writer.writeObjectValue("lastSuccessfulExecution", this.getLastSuccessfulExecution());
        writer.writeObjectValue("lastSuccessfulExecutionWithExports", this.getLastSuccessfulExecutionWithExports());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("progress", this.getProgress());
        writer.writeObjectValue("quarantine", this.getQuarantine());
        writer.writeOffsetDateTimeValue("steadyStateFirstAchievedTime", this.getSteadyStateFirstAchievedTime());
        writer.writeOffsetDateTimeValue("steadyStateLastAchievedTime", this.getSteadyStateLastAchievedTime());
        writer.writeCollectionOfObjectValues("synchronizedEntryCountByType", this.getSynchronizedEntryCountByType());
        writer.writeStringValue("troubleshootingUrl", this.getTroubleshootingUrl());
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
     * Sets the code property value. The code property
     * @param value Value to set for the code property.
     */
    public void setCode(@jakarta.annotation.Nullable final SynchronizationStatusCode value) {
        this.backingStore.set("code", value);
    }
    /**
     * Sets the countSuccessiveCompleteFailures property value. Number of consecutive times this job failed.
     * @param value Value to set for the countSuccessiveCompleteFailures property.
     */
    public void setCountSuccessiveCompleteFailures(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("countSuccessiveCompleteFailures", value);
    }
    /**
     * Sets the escrowsPruned property value. true if the job's escrows (object-level errors) were pruned during initial synchronization. Escrows can be pruned if during the initial synchronization, you reach the threshold of errors that would normally put the job in quarantine. Instead of going into quarantine, the synchronization process clears the job's errors and continues until the initial synchronization is completed. When the initial synchronization is completed, the job will pause and wait for the customer to clean up the errors.
     * @param value Value to set for the escrowsPruned property.
     */
    public void setEscrowsPruned(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("escrowsPruned", value);
    }
    /**
     * Sets the lastExecution property value. Details of the last execution of the job.
     * @param value Value to set for the lastExecution property.
     */
    public void setLastExecution(@jakarta.annotation.Nullable final SynchronizationTaskExecution value) {
        this.backingStore.set("lastExecution", value);
    }
    /**
     * Sets the lastSuccessfulExecution property value. Details of the last execution of this job, which didn't have any errors.
     * @param value Value to set for the lastSuccessfulExecution property.
     */
    public void setLastSuccessfulExecution(@jakarta.annotation.Nullable final SynchronizationTaskExecution value) {
        this.backingStore.set("lastSuccessfulExecution", value);
    }
    /**
     * Sets the lastSuccessfulExecutionWithExports property value. Details of the last execution of the job, which exported objects into the target directory.
     * @param value Value to set for the lastSuccessfulExecutionWithExports property.
     */
    public void setLastSuccessfulExecutionWithExports(@jakarta.annotation.Nullable final SynchronizationTaskExecution value) {
        this.backingStore.set("lastSuccessfulExecutionWithExports", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the progress property value. Details of the progress of a job toward completion.
     * @param value Value to set for the progress property.
     */
    public void setProgress(@jakarta.annotation.Nullable final java.util.List<SynchronizationProgress> value) {
        this.backingStore.set("progress", value);
    }
    /**
     * Sets the quarantine property value. If job is in quarantine, quarantine details.
     * @param value Value to set for the quarantine property.
     */
    public void setQuarantine(@jakarta.annotation.Nullable final SynchronizationQuarantine value) {
        this.backingStore.set("quarantine", value);
    }
    /**
     * Sets the steadyStateFirstAchievedTime property value. The time when steady state (no more changes to the process) was first achieved. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the steadyStateFirstAchievedTime property.
     */
    public void setSteadyStateFirstAchievedTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("steadyStateFirstAchievedTime", value);
    }
    /**
     * Sets the steadyStateLastAchievedTime property value. The time when steady state (no more changes to the process) was last achieved. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the steadyStateLastAchievedTime property.
     */
    public void setSteadyStateLastAchievedTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("steadyStateLastAchievedTime", value);
    }
    /**
     * Sets the synchronizedEntryCountByType property value. Count of synchronized objects, listed by object type.
     * @param value Value to set for the synchronizedEntryCountByType property.
     */
    public void setSynchronizedEntryCountByType(@jakarta.annotation.Nullable final java.util.List<StringKeyLongValuePair> value) {
        this.backingStore.set("synchronizedEntryCountByType", value);
    }
    /**
     * Sets the troubleshootingUrl property value. In the event of an error, the URL with the troubleshooting steps for the issue.
     * @param value Value to set for the troubleshootingUrl property.
     */
    public void setTroubleshootingUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("troubleshootingUrl", value);
    }
}
