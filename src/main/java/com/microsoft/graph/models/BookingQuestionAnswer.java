package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BookingQuestionAnswer implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The answer given by the user in case the answerInputType is text. */
    private String answer;
    /** The expected answer type. The possible values are: text, radioButton, unknownFutureValue. */
    private AnswerInputType answerInputType;
    /** In case the answerInputType is radioButton, this will consists of a list of possible answer values. */
    private java.util.List<String> answerOptions;
    /** Indicates whether it is mandatory to answer the custom question. */
    private Boolean isRequired;
    /** The OdataType property */
    private String odataType;
    /** The question. */
    private String question;
    /** The ID of the custom question. */
    private String questionId;
    /** The answers selected by the user. */
    private java.util.List<String> selectedOptions;
    /**
     * Instantiates a new bookingQuestionAnswer and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BookingQuestionAnswer() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bookingQuestionAnswer
     */
    @javax.annotation.Nonnull
    public static BookingQuestionAnswer createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingQuestionAnswer();
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
     * Gets the answer property value. The answer given by the user in case the answerInputType is text.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAnswer() {
        return this.answer;
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
     * Gets the answerOptions property value. In case the answerInputType is radioButton, this will consists of a list of possible answer values.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAnswerOptions() {
        return this.answerOptions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("answer", (n) -> { this.setAnswer(n.getStringValue()); });
        deserializerMap.put("answerInputType", (n) -> { this.setAnswerInputType(n.getEnumValue(AnswerInputType.class)); });
        deserializerMap.put("answerOptions", (n) -> { this.setAnswerOptions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isRequired", (n) -> { this.setIsRequired(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("question", (n) -> { this.setQuestion(n.getStringValue()); });
        deserializerMap.put("questionId", (n) -> { this.setQuestionId(n.getStringValue()); });
        deserializerMap.put("selectedOptions", (n) -> { this.setSelectedOptions(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isRequired property value. Indicates whether it is mandatory to answer the custom question.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRequired() {
        return this.isRequired;
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
     * Gets the question property value. The question.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQuestion() {
        return this.question;
    }
    /**
     * Gets the questionId property value. The ID of the custom question.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQuestionId() {
        return this.questionId;
    }
    /**
     * Gets the selectedOptions property value. The answers selected by the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSelectedOptions() {
        return this.selectedOptions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("answer", this.getAnswer());
        writer.writeEnumValue("answerInputType", this.getAnswerInputType());
        writer.writeCollectionOfPrimitiveValues("answerOptions", this.getAnswerOptions());
        writer.writeBooleanValue("isRequired", this.getIsRequired());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("question", this.getQuestion());
        writer.writeStringValue("questionId", this.getQuestionId());
        writer.writeCollectionOfPrimitiveValues("selectedOptions", this.getSelectedOptions());
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
     * Sets the answer property value. The answer given by the user in case the answerInputType is text.
     * @param value Value to set for the answer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnswer(@javax.annotation.Nullable final String value) {
        this.answer = value;
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
     * Sets the answerOptions property value. In case the answerInputType is radioButton, this will consists of a list of possible answer values.
     * @param value Value to set for the answerOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnswerOptions(@javax.annotation.Nullable final java.util.List<String> value) {
        this.answerOptions = value;
    }
    /**
     * Sets the isRequired property value. Indicates whether it is mandatory to answer the custom question.
     * @param value Value to set for the isRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRequired(@javax.annotation.Nullable final Boolean value) {
        this.isRequired = value;
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
     * Sets the question property value. The question.
     * @param value Value to set for the question property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuestion(@javax.annotation.Nullable final String value) {
        this.question = value;
    }
    /**
     * Sets the questionId property value. The ID of the custom question.
     * @param value Value to set for the questionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuestionId(@javax.annotation.Nullable final String value) {
        this.questionId = value;
    }
    /**
     * Sets the selectedOptions property value. The answers selected by the user.
     * @param value Value to set for the selectedOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSelectedOptions(@javax.annotation.Nullable final java.util.List<String> value) {
        this.selectedOptions = value;
    }
}
