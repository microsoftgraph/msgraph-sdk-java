package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PatternedRecurrence implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The OdataType property */
    private String odataType;
    /** The frequency of an event.  For access reviews: Do not specify this property for a one-time access review.  Only interval, dayOfMonth, and type (weekly, absoluteMonthly) properties of recurrencePattern are supported. */
    private RecurrencePattern pattern;
    /** The duration of an event. */
    private RecurrenceRange range;
    /**
     * Instantiates a new patternedRecurrence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PatternedRecurrence() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a patternedRecurrence
     */
    @javax.annotation.Nonnull
    public static PatternedRecurrence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PatternedRecurrence();
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
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("pattern", (n) -> { this.setPattern(n.getObjectValue(RecurrencePattern::createFromDiscriminatorValue)); });
        deserializerMap.put("range", (n) -> { this.setRange(n.getObjectValue(RecurrenceRange::createFromDiscriminatorValue)); });
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
     * Gets the pattern property value. The frequency of an event.  For access reviews: Do not specify this property for a one-time access review.  Only interval, dayOfMonth, and type (weekly, absoluteMonthly) properties of recurrencePattern are supported.
     * @return a recurrencePattern
     */
    @javax.annotation.Nullable
    public RecurrencePattern getPattern() {
        return this.pattern;
    }
    /**
     * Gets the range property value. The duration of an event.
     * @return a recurrenceRange
     */
    @javax.annotation.Nullable
    public RecurrenceRange getRange() {
        return this.range;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("pattern", this.getPattern());
        writer.writeObjectValue("range", this.getRange());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the pattern property value. The frequency of an event.  For access reviews: Do not specify this property for a one-time access review.  Only interval, dayOfMonth, and type (weekly, absoluteMonthly) properties of recurrencePattern are supported.
     * @param value Value to set for the pattern property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPattern(@javax.annotation.Nullable final RecurrencePattern value) {
        this.pattern = value;
    }
    /**
     * Sets the range property value. The duration of an event.
     * @param value Value to set for the range property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRange(@javax.annotation.Nullable final RecurrenceRange value) {
        this.range = value;
    }
}
