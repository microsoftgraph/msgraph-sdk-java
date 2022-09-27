package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ShiftAvailability implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** Specifies the pattern for recurrence */
    private PatternedRecurrence _recurrence;
    /** The time slot(s) preferred by the user. */
    private java.util.List<TimeRange> _timeSlots;
    /** Specifies the time zone for the indicated time. */
    private String _timeZone;
    /**
     * Instantiates a new shiftAvailability and sets the default values.
     * @return a void
     */
    public ShiftAvailability() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.shiftAvailability");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a shiftAvailability
     */
    @javax.annotation.Nonnull
    public static ShiftAvailability createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShiftAvailability();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ShiftAvailability currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("recurrence", (n) -> { currentObject.setRecurrence(n.getObjectValue(PatternedRecurrence::createFromDiscriminatorValue)); });
            this.put("timeSlots", (n) -> { currentObject.setTimeSlots(n.getCollectionOfObjectValues(TimeRange::createFromDiscriminatorValue)); });
            this.put("timeZone", (n) -> { currentObject.setTimeZone(n.getStringValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the recurrence property value. Specifies the pattern for recurrence
     * @return a patternedRecurrence
     */
    @javax.annotation.Nullable
    public PatternedRecurrence getRecurrence() {
        return this._recurrence;
    }
    /**
     * Gets the timeSlots property value. The time slot(s) preferred by the user.
     * @return a timeRange
     */
    @javax.annotation.Nullable
    public java.util.List<TimeRange> getTimeSlots() {
        return this._timeSlots;
    }
    /**
     * Gets the timeZone property value. Specifies the time zone for the indicated time.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTimeZone() {
        return this._timeZone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("recurrence", this.getRecurrence());
        writer.writeCollectionOfObjectValues("timeSlots", this.getTimeSlots());
        writer.writeStringValue("timeZone", this.getTimeZone());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the recurrence property value. Specifies the pattern for recurrence
     * @param value Value to set for the recurrence property.
     * @return a void
     */
    public void setRecurrence(@javax.annotation.Nullable final PatternedRecurrence value) {
        this._recurrence = value;
    }
    /**
     * Sets the timeSlots property value. The time slot(s) preferred by the user.
     * @param value Value to set for the timeSlots property.
     * @return a void
     */
    public void setTimeSlots(@javax.annotation.Nullable final java.util.List<TimeRange> value) {
        this._timeSlots = value;
    }
    /**
     * Sets the timeZone property value. Specifies the time zone for the indicated time.
     * @param value Value to set for the timeZone property.
     * @return a void
     */
    public void setTimeZone(@javax.annotation.Nullable final String value) {
        this._timeZone = value;
    }
}
