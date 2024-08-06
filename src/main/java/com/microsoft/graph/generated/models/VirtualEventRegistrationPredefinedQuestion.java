package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEventRegistrationPredefinedQuestion extends VirtualEventRegistrationQuestionBase implements Parsable {
    /**
     * Instantiates a new {@link VirtualEventRegistrationPredefinedQuestion} and sets the default values.
     */
    public VirtualEventRegistrationPredefinedQuestion() {
        super();
        this.setOdataType("#microsoft.graph.virtualEventRegistrationPredefinedQuestion");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VirtualEventRegistrationPredefinedQuestion}
     */
    @jakarta.annotation.Nonnull
    public static VirtualEventRegistrationPredefinedQuestion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventRegistrationPredefinedQuestion();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("label", (n) -> { this.setLabel(n.getEnumValue(VirtualEventRegistrationPredefinedQuestionLabel::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the label property value. Label of the predefined registration question. It accepts a single line of text: street, city, state, postalCode, countryOrRegion, industry, jobTitle, organization, and unknownFutureValue.
     * @return a {@link VirtualEventRegistrationPredefinedQuestionLabel}
     */
    @jakarta.annotation.Nullable
    public VirtualEventRegistrationPredefinedQuestionLabel getLabel() {
        return this.backingStore.get("label");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("label", this.getLabel());
    }
    /**
     * Sets the label property value. Label of the predefined registration question. It accepts a single line of text: street, city, state, postalCode, countryOrRegion, industry, jobTitle, organization, and unknownFutureValue.
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final VirtualEventRegistrationPredefinedQuestionLabel value) {
        this.backingStore.set("label", value);
    }
}
