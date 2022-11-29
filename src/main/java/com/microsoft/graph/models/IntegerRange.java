package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IntegerRange implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The inclusive upper bound of the integer range. */
    private Long _end;
    /** The OdataType property */
    private String _odataType;
    /** The inclusive lower bound of the integer range. */
    private Long _start;
    /**
     * Instantiates a new integerRange and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IntegerRange() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a integerRange
     */
    @javax.annotation.Nonnull
    public static IntegerRange createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IntegerRange();
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
     * Gets the end property value. The inclusive upper bound of the integer range.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getEnd() {
        return this._end;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IntegerRange currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("end", (n) -> { currentObject.setEnd(n.getLongValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("start", (n) -> { currentObject.setStart(n.getLongValue()); });
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
     * Gets the start property value. The inclusive lower bound of the integer range.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getStart() {
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
        writer.writeLongValue("end", this.getEnd());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("start", this.getStart());
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
     * Sets the end property value. The inclusive upper bound of the integer range.
     * @param value Value to set for the end property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnd(@javax.annotation.Nullable final Long value) {
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
     * Sets the start property value. The inclusive lower bound of the integer range.
     * @param value Value to set for the start property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStart(@javax.annotation.Nullable final Long value) {
        this._start = value;
    }
}
