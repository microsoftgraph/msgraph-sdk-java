package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SynchronizationTaskExecution implements AdditionalDataHolder, Parsable {
    /**
     * Identifier of the job run.
     */
    private String activityIdentifier;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Count of processed entries that were assigned for this application.
     */
    private Long countEntitled;
    /**
     * Count of processed entries that were assigned for provisioning.
     */
    private Long countEntitledForProvisioning;
    /**
     * Count of entries that were escrowed (errors).
     */
    private Long countEscrowed;
    /**
     * Count of entries that were escrowed, including system-generated escrows.
     */
    private Long countEscrowedRaw;
    /**
     * Count of exported entries.
     */
    private Long countExported;
    /**
     * Count of entries that were expected to be exported.
     */
    private Long countExports;
    /**
     * Count of imported entries.
     */
    private Long countImported;
    /**
     * Count of imported delta-changes.
     */
    private Long countImportedDeltas;
    /**
     * Count of imported delta-changes pertaining to reference changes.
     */
    private Long countImportedReferenceDeltas;
    /**
     * If an error was encountered, contains a synchronizationError object with details.
     */
    private SynchronizationError error;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The state property
     */
    private SynchronizationTaskExecutionResult state;
    /**
     * Time when this job run began. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime timeBegan;
    /**
     * Time when this job run ended. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime timeEnded;
    /**
     * Instantiates a new synchronizationTaskExecution and sets the default values.
     */
    public SynchronizationTaskExecution() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationTaskExecution
     */
    @jakarta.annotation.Nonnull
    public static SynchronizationTaskExecution createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationTaskExecution();
    }
    /**
     * Gets the activityIdentifier property value. Identifier of the job run.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getActivityIdentifier() {
        return this.activityIdentifier;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the countEntitled property value. Count of processed entries that were assigned for this application.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getCountEntitled() {
        return this.countEntitled;
    }
    /**
     * Gets the countEntitledForProvisioning property value. Count of processed entries that were assigned for provisioning.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getCountEntitledForProvisioning() {
        return this.countEntitledForProvisioning;
    }
    /**
     * Gets the countEscrowed property value. Count of entries that were escrowed (errors).
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getCountEscrowed() {
        return this.countEscrowed;
    }
    /**
     * Gets the countEscrowedRaw property value. Count of entries that were escrowed, including system-generated escrows.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getCountEscrowedRaw() {
        return this.countEscrowedRaw;
    }
    /**
     * Gets the countExported property value. Count of exported entries.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getCountExported() {
        return this.countExported;
    }
    /**
     * Gets the countExports property value. Count of entries that were expected to be exported.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getCountExports() {
        return this.countExports;
    }
    /**
     * Gets the countImported property value. Count of imported entries.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getCountImported() {
        return this.countImported;
    }
    /**
     * Gets the countImportedDeltas property value. Count of imported delta-changes.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getCountImportedDeltas() {
        return this.countImportedDeltas;
    }
    /**
     * Gets the countImportedReferenceDeltas property value. Count of imported delta-changes pertaining to reference changes.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getCountImportedReferenceDeltas() {
        return this.countImportedReferenceDeltas;
    }
    /**
     * Gets the error property value. If an error was encountered, contains a synchronizationError object with details.
     * @return a synchronizationError
     */
    @jakarta.annotation.Nullable
    public SynchronizationError getError() {
        return this.error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("activityIdentifier", (n) -> { this.setActivityIdentifier(n.getStringValue()); });
        deserializerMap.put("countEntitled", (n) -> { this.setCountEntitled(n.getLongValue()); });
        deserializerMap.put("countEntitledForProvisioning", (n) -> { this.setCountEntitledForProvisioning(n.getLongValue()); });
        deserializerMap.put("countEscrowed", (n) -> { this.setCountEscrowed(n.getLongValue()); });
        deserializerMap.put("countEscrowedRaw", (n) -> { this.setCountEscrowedRaw(n.getLongValue()); });
        deserializerMap.put("countExported", (n) -> { this.setCountExported(n.getLongValue()); });
        deserializerMap.put("countExports", (n) -> { this.setCountExports(n.getLongValue()); });
        deserializerMap.put("countImported", (n) -> { this.setCountImported(n.getLongValue()); });
        deserializerMap.put("countImportedDeltas", (n) -> { this.setCountImportedDeltas(n.getLongValue()); });
        deserializerMap.put("countImportedReferenceDeltas", (n) -> { this.setCountImportedReferenceDeltas(n.getLongValue()); });
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(SynchronizationError::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(SynchronizationTaskExecutionResult.class)); });
        deserializerMap.put("timeBegan", (n) -> { this.setTimeBegan(n.getOffsetDateTimeValue()); });
        deserializerMap.put("timeEnded", (n) -> { this.setTimeEnded(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the state property value. The state property
     * @return a synchronizationTaskExecutionResult
     */
    @jakarta.annotation.Nullable
    public SynchronizationTaskExecutionResult getState() {
        return this.state;
    }
    /**
     * Gets the timeBegan property value. Time when this job run began. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTimeBegan() {
        return this.timeBegan;
    }
    /**
     * Gets the timeEnded property value. Time when this job run ended. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTimeEnded() {
        return this.timeEnded;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("activityIdentifier", this.getActivityIdentifier());
        writer.writeLongValue("countEntitled", this.getCountEntitled());
        writer.writeLongValue("countEntitledForProvisioning", this.getCountEntitledForProvisioning());
        writer.writeLongValue("countEscrowed", this.getCountEscrowed());
        writer.writeLongValue("countEscrowedRaw", this.getCountEscrowedRaw());
        writer.writeLongValue("countExported", this.getCountExported());
        writer.writeLongValue("countExports", this.getCountExports());
        writer.writeLongValue("countImported", this.getCountImported());
        writer.writeLongValue("countImportedDeltas", this.getCountImportedDeltas());
        writer.writeLongValue("countImportedReferenceDeltas", this.getCountImportedReferenceDeltas());
        writer.writeObjectValue("error", this.getError());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("state", this.getState());
        writer.writeOffsetDateTimeValue("timeBegan", this.getTimeBegan());
        writer.writeOffsetDateTimeValue("timeEnded", this.getTimeEnded());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activityIdentifier property value. Identifier of the job run.
     * @param value Value to set for the activityIdentifier property.
     */
    public void setActivityIdentifier(@jakarta.annotation.Nullable final String value) {
        this.activityIdentifier = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the countEntitled property value. Count of processed entries that were assigned for this application.
     * @param value Value to set for the countEntitled property.
     */
    public void setCountEntitled(@jakarta.annotation.Nullable final Long value) {
        this.countEntitled = value;
    }
    /**
     * Sets the countEntitledForProvisioning property value. Count of processed entries that were assigned for provisioning.
     * @param value Value to set for the countEntitledForProvisioning property.
     */
    public void setCountEntitledForProvisioning(@jakarta.annotation.Nullable final Long value) {
        this.countEntitledForProvisioning = value;
    }
    /**
     * Sets the countEscrowed property value. Count of entries that were escrowed (errors).
     * @param value Value to set for the countEscrowed property.
     */
    public void setCountEscrowed(@jakarta.annotation.Nullable final Long value) {
        this.countEscrowed = value;
    }
    /**
     * Sets the countEscrowedRaw property value. Count of entries that were escrowed, including system-generated escrows.
     * @param value Value to set for the countEscrowedRaw property.
     */
    public void setCountEscrowedRaw(@jakarta.annotation.Nullable final Long value) {
        this.countEscrowedRaw = value;
    }
    /**
     * Sets the countExported property value. Count of exported entries.
     * @param value Value to set for the countExported property.
     */
    public void setCountExported(@jakarta.annotation.Nullable final Long value) {
        this.countExported = value;
    }
    /**
     * Sets the countExports property value. Count of entries that were expected to be exported.
     * @param value Value to set for the countExports property.
     */
    public void setCountExports(@jakarta.annotation.Nullable final Long value) {
        this.countExports = value;
    }
    /**
     * Sets the countImported property value. Count of imported entries.
     * @param value Value to set for the countImported property.
     */
    public void setCountImported(@jakarta.annotation.Nullable final Long value) {
        this.countImported = value;
    }
    /**
     * Sets the countImportedDeltas property value. Count of imported delta-changes.
     * @param value Value to set for the countImportedDeltas property.
     */
    public void setCountImportedDeltas(@jakarta.annotation.Nullable final Long value) {
        this.countImportedDeltas = value;
    }
    /**
     * Sets the countImportedReferenceDeltas property value. Count of imported delta-changes pertaining to reference changes.
     * @param value Value to set for the countImportedReferenceDeltas property.
     */
    public void setCountImportedReferenceDeltas(@jakarta.annotation.Nullable final Long value) {
        this.countImportedReferenceDeltas = value;
    }
    /**
     * Sets the error property value. If an error was encountered, contains a synchronizationError object with details.
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final SynchronizationError value) {
        this.error = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final SynchronizationTaskExecutionResult value) {
        this.state = value;
    }
    /**
     * Sets the timeBegan property value. Time when this job run began. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the timeBegan property.
     */
    public void setTimeBegan(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.timeBegan = value;
    }
    /**
     * Sets the timeEnded property value. Time when this job run ended. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the timeEnded property.
     */
    public void setTimeEnded(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.timeEnded = value;
    }
}
