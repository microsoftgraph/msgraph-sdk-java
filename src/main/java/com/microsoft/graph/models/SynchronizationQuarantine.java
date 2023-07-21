package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SynchronizationQuarantine implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Date and time when the quarantine was last evaluated and imposed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime currentBegan;
    /**
     * Describes the error(s) that occurred when putting the synchronization job into quarantine.
     */
    private SynchronizationError error;
    /**
     * Date and time when the next attempt to re-evaluate the quarantine will be made. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime nextAttempt;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The reason property
     */
    private QuarantineReason reason;
    /**
     * Date and time when the quarantine was first imposed in this series (a series starts when a quarantine is first imposed, and is reset as soon as the quarantine is lifted). The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime seriesBegan;
    /**
     * Number of times in this series the quarantine was re-evaluated and left in effect (a series starts when quarantine is first imposed, and is reset as soon as quarantine is lifted).
     */
    private Long seriesCount;
    /**
     * Instantiates a new synchronizationQuarantine and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SynchronizationQuarantine() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationQuarantine
     */
    @javax.annotation.Nonnull
    public static SynchronizationQuarantine createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationQuarantine();
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
     * Gets the currentBegan property value. Date and time when the quarantine was last evaluated and imposed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCurrentBegan() {
        return this.currentBegan;
    }
    /**
     * Gets the error property value. Describes the error(s) that occurred when putting the synchronization job into quarantine.
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
    @javax.annotation.Nullable
    public OffsetDateTime getNextAttempt() {
        return this.nextAttempt;
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
     * Gets the reason property value. The reason property
     * @return a quarantineReason
     */
    @javax.annotation.Nullable
    public QuarantineReason getReason() {
        return this.reason;
    }
    /**
     * Gets the seriesBegan property value. Date and time when the quarantine was first imposed in this series (a series starts when a quarantine is first imposed, and is reset as soon as the quarantine is lifted). The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSeriesBegan() {
        return this.seriesBegan;
    }
    /**
     * Gets the seriesCount property value. Number of times in this series the quarantine was re-evaluated and left in effect (a series starts when quarantine is first imposed, and is reset as soon as quarantine is lifted).
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSeriesCount() {
        return this.seriesCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the currentBegan property value. Date and time when the quarantine was last evaluated and imposed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the currentBegan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrentBegan(@javax.annotation.Nullable final OffsetDateTime value) {
        this.currentBegan = value;
    }
    /**
     * Sets the error property value. Describes the error(s) that occurred when putting the synchronization job into quarantine.
     * @param value Value to set for the error property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setError(@javax.annotation.Nullable final SynchronizationError value) {
        this.error = value;
    }
    /**
     * Sets the nextAttempt property value. Date and time when the next attempt to re-evaluate the quarantine will be made. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the nextAttempt property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNextAttempt(@javax.annotation.Nullable final OffsetDateTime value) {
        this.nextAttempt = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the reason property value. The reason property
     * @param value Value to set for the reason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReason(@javax.annotation.Nullable final QuarantineReason value) {
        this.reason = value;
    }
    /**
     * Sets the seriesBegan property value. Date and time when the quarantine was first imposed in this series (a series starts when a quarantine is first imposed, and is reset as soon as the quarantine is lifted). The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the seriesBegan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSeriesBegan(@javax.annotation.Nullable final OffsetDateTime value) {
        this.seriesBegan = value;
    }
    /**
     * Sets the seriesCount property value. Number of times in this series the quarantine was re-evaluated and left in effect (a series starts when quarantine is first imposed, and is reset as soon as quarantine is lifted).
     * @param value Value to set for the seriesCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSeriesCount(@javax.annotation.Nullable final Long value) {
        this.seriesCount = value;
    }
}
