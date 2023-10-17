package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SynchronizationProgress implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The numerator of a progress ratio; the number of units of changes already processed.
     */
    private Long completedUnits;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The time of a progress observation as an offset in minutes from UTC.
     */
    private OffsetDateTime progressObservationDateTime;
    /**
     * The denominator of a progress ratio; a number of units of changes to be processed to accomplish synchronization.
     */
    private Long totalUnits;
    /**
     * An optional description of the units.
     */
    private String units;
    /**
     * Instantiates a new SynchronizationProgress and sets the default values.
     */
    public SynchronizationProgress() {
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
        return this.additionalData;
    }
    /**
     * Gets the completedUnits property value. The numerator of a progress ratio; the number of units of changes already processed.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getCompletedUnits() {
        return this.completedUnits;
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
        return this.odataType;
    }
    /**
     * Gets the progressObservationDateTime property value. The time of a progress observation as an offset in minutes from UTC.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getProgressObservationDateTime() {
        return this.progressObservationDateTime;
    }
    /**
     * Gets the totalUnits property value. The denominator of a progress ratio; a number of units of changes to be processed to accomplish synchronization.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getTotalUnits() {
        return this.totalUnits;
    }
    /**
     * Gets the units property value. An optional description of the units.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUnits() {
        return this.units;
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
        this.additionalData = value;
    }
    /**
     * Sets the completedUnits property value. The numerator of a progress ratio; the number of units of changes already processed.
     * @param value Value to set for the completedUnits property.
     */
    public void setCompletedUnits(@jakarta.annotation.Nullable final Long value) {
        this.completedUnits = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the progressObservationDateTime property value. The time of a progress observation as an offset in minutes from UTC.
     * @param value Value to set for the progressObservationDateTime property.
     */
    public void setProgressObservationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.progressObservationDateTime = value;
    }
    /**
     * Sets the totalUnits property value. The denominator of a progress ratio; a number of units of changes to be processed to accomplish synchronization.
     * @param value Value to set for the totalUnits property.
     */
    public void setTotalUnits(@jakarta.annotation.Nullable final Long value) {
        this.totalUnits = value;
    }
    /**
     * Sets the units property value. An optional description of the units.
     * @param value Value to set for the units property.
     */
    public void setUnits(@jakarta.annotation.Nullable final String value) {
        this.units = value;
    }
}
