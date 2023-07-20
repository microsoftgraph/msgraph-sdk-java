package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ParseExpressionResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Error details, if expression evaluation resulted in an error.
     */
    private PublicError error;
    /**
     * A collection of values produced by the evaluation of the expression.
     */
    private java.util.List<String> evaluationResult;
    /**
     * true if the evaluation was successful.
     */
    private Boolean evaluationSucceeded;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * An attributeMappingSource object representing the parsed expression.
     */
    private AttributeMappingSource parsedExpression;
    /**
     * true if the expression was parsed successfully.
     */
    private Boolean parsingSucceeded;
    /**
     * Instantiates a new parseExpressionResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ParseExpressionResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a parseExpressionResponse
     */
    @javax.annotation.Nonnull
    public static ParseExpressionResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ParseExpressionResponse();
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
     * Gets the error property value. Error details, if expression evaluation resulted in an error.
     * @return a publicError
     */
    @javax.annotation.Nullable
    public PublicError getError() {
        return this.error;
    }
    /**
     * Gets the evaluationResult property value. A collection of values produced by the evaluation of the expression.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEvaluationResult() {
        return this.evaluationResult;
    }
    /**
     * Gets the evaluationSucceeded property value. true if the evaluation was successful.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEvaluationSucceeded() {
        return this.evaluationSucceeded;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(PublicError::createFromDiscriminatorValue)); });
        deserializerMap.put("evaluationResult", (n) -> { this.setEvaluationResult(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("evaluationSucceeded", (n) -> { this.setEvaluationSucceeded(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("parsedExpression", (n) -> { this.setParsedExpression(n.getObjectValue(AttributeMappingSource::createFromDiscriminatorValue)); });
        deserializerMap.put("parsingSucceeded", (n) -> { this.setParsingSucceeded(n.getBooleanValue()); });
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
     * Gets the parsedExpression property value. An attributeMappingSource object representing the parsed expression.
     * @return a attributeMappingSource
     */
    @javax.annotation.Nullable
    public AttributeMappingSource getParsedExpression() {
        return this.parsedExpression;
    }
    /**
     * Gets the parsingSucceeded property value. true if the expression was parsed successfully.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getParsingSucceeded() {
        return this.parsingSucceeded;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("error", this.getError());
        writer.writeCollectionOfPrimitiveValues("evaluationResult", this.getEvaluationResult());
        writer.writeBooleanValue("evaluationSucceeded", this.getEvaluationSucceeded());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("parsedExpression", this.getParsedExpression());
        writer.writeBooleanValue("parsingSucceeded", this.getParsingSucceeded());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the error property value. Error details, if expression evaluation resulted in an error.
     * @param value Value to set for the error property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setError(@javax.annotation.Nullable final PublicError value) {
        this.error = value;
    }
    /**
     * Sets the evaluationResult property value. A collection of values produced by the evaluation of the expression.
     * @param value Value to set for the evaluationResult property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEvaluationResult(@javax.annotation.Nullable final java.util.List<String> value) {
        this.evaluationResult = value;
    }
    /**
     * Sets the evaluationSucceeded property value. true if the evaluation was successful.
     * @param value Value to set for the evaluationSucceeded property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEvaluationSucceeded(@javax.annotation.Nullable final Boolean value) {
        this.evaluationSucceeded = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the parsedExpression property value. An attributeMappingSource object representing the parsed expression.
     * @param value Value to set for the parsedExpression property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParsedExpression(@javax.annotation.Nullable final AttributeMappingSource value) {
        this.parsedExpression = value;
    }
    /**
     * Sets the parsingSucceeded property value. true if the expression was parsed successfully.
     * @param value Value to set for the parsingSucceeded property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParsingSucceeded(@javax.annotation.Nullable final Boolean value) {
        this.parsingSucceeded = value;
    }
}
