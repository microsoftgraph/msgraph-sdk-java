package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a custom question of the business.
 */
public class BookingCustomQuestion extends Entity implements Parsable {
    /**
     * The expected answer type. The possible values are: text, radioButton, unknownFutureValue.
     */
    private AnswerInputType answerInputType;
    /**
     * List of possible answer values.
     */
    private java.util.List<String> answerOptions;
    /**
     * The question.
     */
    private String displayName;
    /**
     * Instantiates a new bookingCustomQuestion and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BookingCustomQuestion() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bookingCustomQuestion
     */
    @javax.annotation.Nonnull
    public static BookingCustomQuestion createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingCustomQuestion();
    }
    /**
     * Gets the answerInputType property value. The expected answer type. The possible values are: text, radioButton, unknownFutureValue.
     * @return a answerInputType
     */
    @javax.annotation.Nullable
    public AnswerInputType getAnswerInputType() {
        return this.answerInputType;
    }
    /**
     * Gets the answerOptions property value. List of possible answer values.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAnswerOptions() {
        return this.answerOptions;
    }
    /**
     * Gets the displayName property value. The question.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("answerInputType", (n) -> { this.setAnswerInputType(n.getEnumValue(AnswerInputType.class)); });
        deserializerMap.put("answerOptions", (n) -> { this.setAnswerOptions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("answerInputType", this.getAnswerInputType());
        writer.writeCollectionOfPrimitiveValues("answerOptions", this.getAnswerOptions());
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the answerInputType property value. The expected answer type. The possible values are: text, radioButton, unknownFutureValue.
     * @param value Value to set for the answerInputType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnswerInputType(@javax.annotation.Nullable final AnswerInputType value) {
        this.answerInputType = value;
    }
    /**
     * Sets the answerOptions property value. List of possible answer values.
     * @param value Value to set for the answerOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnswerOptions(@javax.annotation.Nullable final java.util.List<String> value) {
        this.answerOptions = value;
    }
    /**
     * Sets the displayName property value. The question.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
}
