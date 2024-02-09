package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ParseExpressionResponse implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ParseExpressionResponse} and sets the default values.
     */
    public ParseExpressionResponse() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ParseExpressionResponse}
     */
    @jakarta.annotation.Nonnull
    public static ParseExpressionResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ParseExpressionResponse();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the error property value. Error details, if expression evaluation resulted in an error.
     * @return a {@link PublicError}
     */
    @jakarta.annotation.Nullable
    public PublicError getError() {
        return this.backingStore.get("error");
    }
    /**
     * Gets the evaluationResult property value. A collection of values produced by the evaluation of the expression.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEvaluationResult() {
        return this.backingStore.get("evaluationResult");
    }
    /**
     * Gets the evaluationSucceeded property value. true if the evaluation was successful.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEvaluationSucceeded() {
        return this.backingStore.get("evaluationSucceeded");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the parsedExpression property value. An attributeMappingSource object representing the parsed expression.
     * @return a {@link AttributeMappingSource}
     */
    @jakarta.annotation.Nullable
    public AttributeMappingSource getParsedExpression() {
        return this.backingStore.get("parsedExpression");
    }
    /**
     * Gets the parsingSucceeded property value. true if the expression was parsed successfully.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getParsingSucceeded() {
        return this.backingStore.get("parsingSucceeded");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the error property value. Error details, if expression evaluation resulted in an error.
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final PublicError value) {
        this.backingStore.set("error", value);
    }
    /**
     * Sets the evaluationResult property value. A collection of values produced by the evaluation of the expression.
     * @param value Value to set for the evaluationResult property.
     */
    public void setEvaluationResult(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("evaluationResult", value);
    }
    /**
     * Sets the evaluationSucceeded property value. true if the evaluation was successful.
     * @param value Value to set for the evaluationSucceeded property.
     */
    public void setEvaluationSucceeded(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("evaluationSucceeded", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the parsedExpression property value. An attributeMappingSource object representing the parsed expression.
     * @param value Value to set for the parsedExpression property.
     */
    public void setParsedExpression(@jakarta.annotation.Nullable final AttributeMappingSource value) {
        this.backingStore.set("parsedExpression", value);
    }
    /**
     * Sets the parsingSucceeded property value. true if the expression was parsed successfully.
     * @param value Value to set for the parsingSucceeded property.
     */
    public void setParsingSucceeded(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("parsingSucceeded", value);
    }
}
