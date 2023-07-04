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
     * The activityIdentifier property
     */
    private String activityIdentifier;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The countEntitled property
     */
    private Long countEntitled;
    /**
     * The countEntitledForProvisioning property
     */
    private Long countEntitledForProvisioning;
    /**
     * The countEscrowed property
     */
    private Long countEscrowed;
    /**
     * The countEscrowedRaw property
     */
    private Long countEscrowedRaw;
    /**
     * The countExported property
     */
    private Long countExported;
    /**
     * The countExports property
     */
    private Long countExports;
    /**
     * The countImported property
     */
    private Long countImported;
    /**
     * The countImportedDeltas property
     */
    private Long countImportedDeltas;
    /**
     * The countImportedReferenceDeltas property
     */
    private Long countImportedReferenceDeltas;
    /**
     * The error property
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
     * The timeBegan property
     */
    private OffsetDateTime timeBegan;
    /**
     * The timeEnded property
     */
    private OffsetDateTime timeEnded;
    /**
     * Instantiates a new synchronizationTaskExecution and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SynchronizationTaskExecution() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationTaskExecution
     */
    @javax.annotation.Nonnull
    public static SynchronizationTaskExecution createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationTaskExecution();
    }
    /**
     * Gets the activityIdentifier property value. The activityIdentifier property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivityIdentifier() {
        return this.activityIdentifier;
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
     * Gets the countEntitled property value. The countEntitled property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCountEntitled() {
        return this.countEntitled;
    }
    /**
     * Gets the countEntitledForProvisioning property value. The countEntitledForProvisioning property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCountEntitledForProvisioning() {
        return this.countEntitledForProvisioning;
    }
    /**
     * Gets the countEscrowed property value. The countEscrowed property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCountEscrowed() {
        return this.countEscrowed;
    }
    /**
     * Gets the countEscrowedRaw property value. The countEscrowedRaw property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCountEscrowedRaw() {
        return this.countEscrowedRaw;
    }
    /**
     * Gets the countExported property value. The countExported property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCountExported() {
        return this.countExported;
    }
    /**
     * Gets the countExports property value. The countExports property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCountExports() {
        return this.countExports;
    }
    /**
     * Gets the countImported property value. The countImported property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCountImported() {
        return this.countImported;
    }
    /**
     * Gets the countImportedDeltas property value. The countImportedDeltas property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCountImportedDeltas() {
        return this.countImportedDeltas;
    }
    /**
     * Gets the countImportedReferenceDeltas property value. The countImportedReferenceDeltas property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getCountImportedReferenceDeltas() {
        return this.countImportedReferenceDeltas;
    }
    /**
     * Gets the error property value. The error property
     * @return a synchronizationError
     */
    @javax.annotation.Nullable
    public SynchronizationError getError() {
        return this.error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the state property value. The state property
     * @return a SynchronizationTaskExecutionResult
     */
    @javax.annotation.Nullable
    public SynchronizationTaskExecutionResult getState() {
        return this.state;
    }
    /**
     * Gets the timeBegan property value. The timeBegan property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getTimeBegan() {
        return this.timeBegan;
    }
    /**
     * Gets the timeEnded property value. The timeEnded property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getTimeEnded() {
        return this.timeEnded;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the activityIdentifier property value. The activityIdentifier property
     * @param value Value to set for the activityIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivityIdentifier(@javax.annotation.Nullable final String value) {
        this.activityIdentifier = value;
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
     * Sets the countEntitled property value. The countEntitled property
     * @param value Value to set for the countEntitled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountEntitled(@javax.annotation.Nullable final Long value) {
        this.countEntitled = value;
    }
    /**
     * Sets the countEntitledForProvisioning property value. The countEntitledForProvisioning property
     * @param value Value to set for the countEntitledForProvisioning property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountEntitledForProvisioning(@javax.annotation.Nullable final Long value) {
        this.countEntitledForProvisioning = value;
    }
    /**
     * Sets the countEscrowed property value. The countEscrowed property
     * @param value Value to set for the countEscrowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountEscrowed(@javax.annotation.Nullable final Long value) {
        this.countEscrowed = value;
    }
    /**
     * Sets the countEscrowedRaw property value. The countEscrowedRaw property
     * @param value Value to set for the countEscrowedRaw property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountEscrowedRaw(@javax.annotation.Nullable final Long value) {
        this.countEscrowedRaw = value;
    }
    /**
     * Sets the countExported property value. The countExported property
     * @param value Value to set for the countExported property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountExported(@javax.annotation.Nullable final Long value) {
        this.countExported = value;
    }
    /**
     * Sets the countExports property value. The countExports property
     * @param value Value to set for the countExports property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountExports(@javax.annotation.Nullable final Long value) {
        this.countExports = value;
    }
    /**
     * Sets the countImported property value. The countImported property
     * @param value Value to set for the countImported property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountImported(@javax.annotation.Nullable final Long value) {
        this.countImported = value;
    }
    /**
     * Sets the countImportedDeltas property value. The countImportedDeltas property
     * @param value Value to set for the countImportedDeltas property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountImportedDeltas(@javax.annotation.Nullable final Long value) {
        this.countImportedDeltas = value;
    }
    /**
     * Sets the countImportedReferenceDeltas property value. The countImportedReferenceDeltas property
     * @param value Value to set for the countImportedReferenceDeltas property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountImportedReferenceDeltas(@javax.annotation.Nullable final Long value) {
        this.countImportedReferenceDeltas = value;
    }
    /**
     * Sets the error property value. The error property
     * @param value Value to set for the error property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setError(@javax.annotation.Nullable final SynchronizationError value) {
        this.error = value;
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
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final SynchronizationTaskExecutionResult value) {
        this.state = value;
    }
    /**
     * Sets the timeBegan property value. The timeBegan property
     * @param value Value to set for the timeBegan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimeBegan(@javax.annotation.Nullable final OffsetDateTime value) {
        this.timeBegan = value;
    }
    /**
     * Sets the timeEnded property value. The timeEnded property
     * @param value Value to set for the timeEnded property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimeEnded(@javax.annotation.Nullable final OffsetDateTime value) {
        this.timeEnded = value;
    }
}
