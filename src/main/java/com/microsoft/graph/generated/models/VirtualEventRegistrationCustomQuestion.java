package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEventRegistrationCustomQuestion extends VirtualEventRegistrationQuestionBase implements Parsable {
    /**
     * Instantiates a new {@link VirtualEventRegistrationCustomQuestion} and sets the default values.
     */
    public VirtualEventRegistrationCustomQuestion() {
        super();
        this.setOdataType("#microsoft.graph.virtualEventRegistrationCustomQuestion");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VirtualEventRegistrationCustomQuestion}
     */
    @jakarta.annotation.Nonnull
    public static VirtualEventRegistrationCustomQuestion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventRegistrationCustomQuestion();
    }
    /**
     * Gets the answerChoices property value. The answerChoices property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAnswerChoices() {
        return this.backingStore.get("answerChoices");
    }
    /**
     * Gets the answerInputType property value. The answerInputType property
     * @return a {@link VirtualEventRegistrationQuestionAnswerInputType}
     */
    @jakarta.annotation.Nullable
    public VirtualEventRegistrationQuestionAnswerInputType getAnswerInputType() {
        return this.backingStore.get("answerInputType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("answerChoices", (n) -> { this.setAnswerChoices(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("answerInputType", (n) -> { this.setAnswerInputType(n.getEnumValue(VirtualEventRegistrationQuestionAnswerInputType::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("answerChoices", this.getAnswerChoices());
        writer.writeEnumValue("answerInputType", this.getAnswerInputType());
    }
    /**
     * Sets the answerChoices property value. The answerChoices property
     * @param value Value to set for the answerChoices property.
     */
    public void setAnswerChoices(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("answerChoices", value);
    }
    /**
     * Sets the answerInputType property value. The answerInputType property
     * @param value Value to set for the answerInputType property.
     */
    public void setAnswerInputType(@jakarta.annotation.Nullable final VirtualEventRegistrationQuestionAnswerInputType value) {
        this.backingStore.set("answerInputType", value);
    }
}
