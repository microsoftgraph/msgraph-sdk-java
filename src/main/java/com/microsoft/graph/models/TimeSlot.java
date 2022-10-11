package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TimeSlot implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The end property */
    private DateTimeTimeZone _end;
    /** The OdataType property */
    private String _odataType;
    /** The start property */
    private DateTimeTimeZone _start;
    /**
     * Instantiates a new timeSlot and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TimeSlot() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.timeSlot");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a timeSlot
     */
    @javax.annotation.Nonnull
    public static TimeSlot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeSlot();
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
     * Gets the end property value. The end property
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getEnd() {
        return this._end;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TimeSlot currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("end", (n) -> { currentObject.setEnd(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("start", (n) -> { currentObject.setStart(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
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
     * Gets the start property value. The start property
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getStart() {
        return this._start;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("end", this.getEnd());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("start", this.getStart());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the end property value. The end property
     * @param value Value to set for the end property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnd(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._end = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the start property value. The start property
     * @param value Value to set for the start property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStart(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this._start = value;
    }
}
