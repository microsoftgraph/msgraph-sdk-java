package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageMultipleChoiceQuestion extends AccessPackageQuestion implements Parsable {
    /**
     * List of answer choices.
     */
    private java.util.List<AccessPackageAnswerChoice> choices;
    /**
     * Indicates whether requestor can select multiple choices as their answer.
     */
    private Boolean isMultipleSelectionAllowed;
    /**
     * Instantiates a new accessPackageMultipleChoiceQuestion and sets the default values.
     */
    public AccessPackageMultipleChoiceQuestion() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageMultipleChoiceQuestion");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageMultipleChoiceQuestion
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageMultipleChoiceQuestion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageMultipleChoiceQuestion();
    }
    /**
     * Gets the choices property value. List of answer choices.
     * @return a accessPackageAnswerChoice
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageAnswerChoice> getChoices() {
        return this.choices;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("choices", (n) -> { this.setChoices(n.getCollectionOfObjectValues(AccessPackageAnswerChoice::createFromDiscriminatorValue)); });
        deserializerMap.put("isMultipleSelectionAllowed", (n) -> { this.setIsMultipleSelectionAllowed(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isMultipleSelectionAllowed property value. Indicates whether requestor can select multiple choices as their answer.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMultipleSelectionAllowed() {
        return this.isMultipleSelectionAllowed;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("choices", this.getChoices());
        writer.writeBooleanValue("isMultipleSelectionAllowed", this.getIsMultipleSelectionAllowed());
    }
    /**
     * Sets the choices property value. List of answer choices.
     * @param value Value to set for the choices property.
     */
    public void setChoices(@jakarta.annotation.Nullable final java.util.List<AccessPackageAnswerChoice> value) {
        this.choices = value;
    }
    /**
     * Sets the isMultipleSelectionAllowed property value. Indicates whether requestor can select multiple choices as their answer.
     * @param value Value to set for the isMultipleSelectionAllowed property.
     */
    public void setIsMultipleSelectionAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.isMultipleSelectionAllowed = value;
    }
}
