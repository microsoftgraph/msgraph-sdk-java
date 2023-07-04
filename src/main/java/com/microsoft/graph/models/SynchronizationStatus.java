package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SynchronizationStatus implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The code property
     */
    private SynchronizationStatusCode code;
    /**
     * The countSuccessiveCompleteFailures property
     */
    private Long countSuccessiveCompleteFailures;
    /**
     * The escrowsPruned property
     */
    private Boolean escrowsPruned;
    /**
     * The lastExecution property
     */
    private SynchronizationTaskExecution lastExecution;
    /**
     * The lastSuccessfulExecution property
     */
    private SynchronizationTaskExecution lastSuccessfulExecution;
    /**
     * The lastSuccessfulExecutionWithExports property
     */
    private SynchronizationTaskExecution lastSuccessfulExecutionWithExports;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The progress property
     */
    private java.util.List<SynchronizationProgress> progress;
    /**
     * The quarantine property
     */
    private SynchronizationQuarantine quarantine;
    /**
     * The steadyStateFirstAchievedTime property
     */
    private OffsetDateTime steadyStateFirstAchievedTime;
    /**
     * The steadyStateLastAchievedTime property
     */
    private OffsetDateTime steadyStateLastAchievedTime;
    /**
     * The synchronizedEntryCountByType property
     */
    private java.util.List<StringKeyLongValuePair> synchronizedEntryCountByType;
    /**
     * The troubleshootingUrl property
     */
    private String troubleshootingUrl;
    /**
     * Instantiates a new synchronizationStatus and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SynchronizationStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationStatus
     */
    @javax.annotation.Nonnull
    public static SynchronizationStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationStatus();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the code property value. The code property
     * @return a SynchronizationStatusCode
     */
    @javax.annotation.Nullable
    public SynchronizationStatusCode getCode() {
        return this.code;
    }
    /**
     * Gets the countSuccessiveCompleteFailures property value. The countSuccessiveCompleteFailures property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCountSuccessiveCompleteFailures() {
        return this.countSuccessiveCompleteFailures;
    }
    /**
     * Gets the escrowsPruned property value. The escrowsPruned property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEscrowsPruned() {
        return this.escrowsPruned;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * Gets the lastExecution property value. The lastExecution property
     * @return a synchronizationTaskExecution
     */
    @javax.annotation.Nullable
    public SynchronizationTaskExecution getLastExecution() {
        return this.lastExecution;
    }
    /**
     * Gets the lastSuccessfulExecution property value. The lastSuccessfulExecution property
     * @return a synchronizationTaskExecution
     */
    @javax.annotation.Nullable
    public SynchronizationTaskExecution getLastSuccessfulExecution() {
        return this.lastSuccessfulExecution;
    }
    /**
     * Gets the lastSuccessfulExecutionWithExports property value. The lastSuccessfulExecutionWithExports property
     * @return a synchronizationTaskExecution
     */
    @javax.annotation.Nullable
    public SynchronizationTaskExecution getLastSuccessfulExecutionWithExports() {
        return this.lastSuccessfulExecutionWithExports;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the progress property value. The progress property
     * @return a synchronizationProgress
     */
    @javax.annotation.Nullable
    public java.util.List<SynchronizationProgress> getProgress() {
        return this.progress;
    }
    /**
     * Gets the quarantine property value. The quarantine property
     * @return a synchronizationQuarantine
     */
    @javax.annotation.Nullable
    public SynchronizationQuarantine getQuarantine() {
        return this.quarantine;
    }
    /**
     * Gets the steadyStateFirstAchievedTime property value. The steadyStateFirstAchievedTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSteadyStateFirstAchievedTime() {
        return this.steadyStateFirstAchievedTime;
    }
    /**
     * Gets the steadyStateLastAchievedTime property value. The steadyStateLastAchievedTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSteadyStateLastAchievedTime() {
        return this.steadyStateLastAchievedTime;
    }
    /**
     * Gets the synchronizedEntryCountByType property value. The synchronizedEntryCountByType property
     * @return a stringKeyLongValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<StringKeyLongValuePair> getSynchronizedEntryCountByType() {
        return this.synchronizedEntryCountByType;
    }
    /**
     * Gets the troubleshootingUrl property value. The troubleshootingUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTroubleshootingUrl() {
        return this.troubleshootingUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the code property value. The code property
     * @param value Value to set for the code property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCode(@javax.annotation.Nullable final SynchronizationStatusCode value) {
        this.code = value;
    }
    /**
     * Sets the countSuccessiveCompleteFailures property value. The countSuccessiveCompleteFailures property
     * @param value Value to set for the countSuccessiveCompleteFailures property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountSuccessiveCompleteFailures(@javax.annotation.Nullable final Long value) {
        this.countSuccessiveCompleteFailures = value;
    }
    /**
     * Sets the escrowsPruned property value. The escrowsPruned property
     * @param value Value to set for the escrowsPruned property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEscrowsPruned(@javax.annotation.Nullable final Boolean value) {
        this.escrowsPruned = value;
    }
    /**
     * Sets the lastExecution property value. The lastExecution property
     * @param value Value to set for the lastExecution property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastExecution(@javax.annotation.Nullable final SynchronizationTaskExecution value) {
        this.lastExecution = value;
    }
    /**
     * Sets the lastSuccessfulExecution property value. The lastSuccessfulExecution property
     * @param value Value to set for the lastSuccessfulExecution property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSuccessfulExecution(@javax.annotation.Nullable final SynchronizationTaskExecution value) {
        this.lastSuccessfulExecution = value;
    }
    /**
     * Sets the lastSuccessfulExecutionWithExports property value. The lastSuccessfulExecutionWithExports property
     * @param value Value to set for the lastSuccessfulExecutionWithExports property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSuccessfulExecutionWithExports(@javax.annotation.Nullable final SynchronizationTaskExecution value) {
        this.lastSuccessfulExecutionWithExports = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the progress property value. The progress property
     * @param value Value to set for the progress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProgress(@javax.annotation.Nullable final java.util.List<SynchronizationProgress> value) {
        this.progress = value;
    }
    /**
     * Sets the quarantine property value. The quarantine property
     * @param value Value to set for the quarantine property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuarantine(@javax.annotation.Nullable final SynchronizationQuarantine value) {
        this.quarantine = value;
    }
    /**
     * Sets the steadyStateFirstAchievedTime property value. The steadyStateFirstAchievedTime property
     * @param value Value to set for the steadyStateFirstAchievedTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSteadyStateFirstAchievedTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.steadyStateFirstAchievedTime = value;
    }
    /**
     * Sets the steadyStateLastAchievedTime property value. The steadyStateLastAchievedTime property
     * @param value Value to set for the steadyStateLastAchievedTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSteadyStateLastAchievedTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.steadyStateLastAchievedTime = value;
    }
    /**
     * Sets the synchronizedEntryCountByType property value. The synchronizedEntryCountByType property
     * @param value Value to set for the synchronizedEntryCountByType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSynchronizedEntryCountByType(@javax.annotation.Nullable final java.util.List<StringKeyLongValuePair> value) {
        this.synchronizedEntryCountByType = value;
    }
    /**
     * Sets the troubleshootingUrl property value. The troubleshootingUrl property
     * @param value Value to set for the troubleshootingUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTroubleshootingUrl(@javax.annotation.Nullable final String value) {
        this.troubleshootingUrl = value;
    }
}
