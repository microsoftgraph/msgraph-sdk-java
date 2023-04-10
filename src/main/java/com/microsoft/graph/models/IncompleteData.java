package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IncompleteData implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The service does not have source data before the specified time. */
    private OffsetDateTime missingDataBeforeDateTime;
    /** The OdataType property */
    private String odataType;
    /** Some data was not recorded due to excessive activity. */
    private Boolean wasThrottled;
    /**
     * Instantiates a new incompleteData and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IncompleteData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a incompleteData
     */
    @javax.annotation.Nonnull
    public static IncompleteData createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IncompleteData();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("missingDataBeforeDateTime", (n) -> { this.setMissingDataBeforeDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("wasThrottled", (n) -> { this.setWasThrottled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the missingDataBeforeDateTime property value. The service does not have source data before the specified time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getMissingDataBeforeDateTime() {
        return this.missingDataBeforeDateTime;
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
     * Gets the wasThrottled property value. Some data was not recorded due to excessive activity.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWasThrottled() {
        return this.wasThrottled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("missingDataBeforeDateTime", this.getMissingDataBeforeDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("wasThrottled", this.getWasThrottled());
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
     * Sets the missingDataBeforeDateTime property value. The service does not have source data before the specified time.
     * @param value Value to set for the missingDataBeforeDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMissingDataBeforeDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.missingDataBeforeDateTime = value;
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
     * Sets the wasThrottled property value. Some data was not recorded due to excessive activity.
     * @param value Value to set for the wasThrottled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWasThrottled(@javax.annotation.Nullable final Boolean value) {
        this.wasThrottled = value;
    }
}
