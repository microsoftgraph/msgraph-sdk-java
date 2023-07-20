package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnPremisesAccidentalDeletionPrevention implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Threshold value which triggers accidental deletion prevention. The threshold is either an absolute number of objects or a percentage number of objects.
     */
    private Integer alertThreshold;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The status of the accidental deletion prevention feature. The possible values are: disabled, enabledForCount, enabledForPercentage, unknownFutureValue.
     */
    private OnPremisesDirectorySynchronizationDeletionPreventionType synchronizationPreventionType;
    /**
     * Instantiates a new onPremisesAccidentalDeletionPrevention and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnPremisesAccidentalDeletionPrevention() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onPremisesAccidentalDeletionPrevention
     */
    @javax.annotation.Nonnull
    public static OnPremisesAccidentalDeletionPrevention createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesAccidentalDeletionPrevention();
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
     * Gets the alertThreshold property value. Threshold value which triggers accidental deletion prevention. The threshold is either an absolute number of objects or a percentage number of objects.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAlertThreshold() {
        return this.alertThreshold;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("alertThreshold", (n) -> { this.setAlertThreshold(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("synchronizationPreventionType", (n) -> { this.setSynchronizationPreventionType(n.getEnumValue(OnPremisesDirectorySynchronizationDeletionPreventionType.class)); });
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
     * Gets the synchronizationPreventionType property value. The status of the accidental deletion prevention feature. The possible values are: disabled, enabledForCount, enabledForPercentage, unknownFutureValue.
     * @return a onPremisesDirectorySynchronizationDeletionPreventionType
     */
    @javax.annotation.Nullable
    public OnPremisesDirectorySynchronizationDeletionPreventionType getSynchronizationPreventionType() {
        return this.synchronizationPreventionType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("alertThreshold", this.getAlertThreshold());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("synchronizationPreventionType", this.getSynchronizationPreventionType());
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
     * Sets the alertThreshold property value. Threshold value which triggers accidental deletion prevention. The threshold is either an absolute number of objects or a percentage number of objects.
     * @param value Value to set for the alertThreshold property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertThreshold(@javax.annotation.Nullable final Integer value) {
        this.alertThreshold = value;
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
     * Sets the synchronizationPreventionType property value. The status of the accidental deletion prevention feature. The possible values are: disabled, enabledForCount, enabledForPercentage, unknownFutureValue.
     * @param value Value to set for the synchronizationPreventionType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSynchronizationPreventionType(@javax.annotation.Nullable final OnPremisesDirectorySynchronizationDeletionPreventionType value) {
        this.synchronizationPreventionType = value;
    }
}
