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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BookingCustomQuestion extends Entity implements Parsable {
    /**
     * Instantiates a new BookingCustomQuestion and sets the default values.
     */
    public BookingCustomQuestion() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BookingCustomQuestion
     */
    @jakarta.annotation.Nonnull
    public static BookingCustomQuestion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingCustomQuestion();
    }
    /**
     * Gets the answerInputType property value. The expected answer type. The possible values are: text, radioButton, unknownFutureValue.
     * @return a BookingCustomQuestionAnswerInputType
     */
    @jakarta.annotation.Nullable
    public BookingCustomQuestionAnswerInputType getAnswerInputType() {
        return this.backingStore.get("answerInputType");
    }
    /**
     * Gets the answerOptions property value. List of possible answer values.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAnswerOptions() {
        return this.backingStore.get("answerOptions");
    }
    /**
     * Gets the displayName property value. The question.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("answerInputType", (n) -> { this.setAnswerInputType(n.getEnumValue(BookingCustomQuestionAnswerInputType::forValue)); });
        deserializerMap.put("answerOptions", (n) -> { this.setAnswerOptions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("answerInputType", this.getAnswerInputType());
        writer.writeCollectionOfPrimitiveValues("answerOptions", this.getAnswerOptions());
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the answerInputType property value. The expected answer type. The possible values are: text, radioButton, unknownFutureValue.
     * @param value Value to set for the answerInputType property.
     */
    public void setAnswerInputType(@jakarta.annotation.Nullable final BookingCustomQuestionAnswerInputType value) {
        this.backingStore.set("answerInputType", value);
    }
    /**
     * Sets the answerOptions property value. List of possible answer values.
     * @param value Value to set for the answerOptions property.
     */
    public void setAnswerOptions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("answerOptions", value);
    }
    /**
     * Sets the displayName property value. The question.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
}
