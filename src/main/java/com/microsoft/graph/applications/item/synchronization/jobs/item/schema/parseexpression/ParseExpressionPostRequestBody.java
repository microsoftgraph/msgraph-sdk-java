package com.microsoft.graph.applications.item.synchronization.jobs.item.schema.parseexpression;

import com.microsoft.graph.models.AttributeDefinition;
import com.microsoft.graph.models.ExpressionInputObject;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ParseExpressionPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The expression property
     */
    private String expression;
    /**
     * The targetAttributeDefinition property
     */
    private AttributeDefinition targetAttributeDefinition;
    /**
     * The testInputObject property
     */
    private ExpressionInputObject testInputObject;
    /**
     * Instantiates a new parseExpressionPostRequestBody and sets the default values.
     */
    public ParseExpressionPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a parseExpressionPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ParseExpressionPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ParseExpressionPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the expression property value. The expression property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getExpression() {
        return this.expression;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("expression", (n) -> { this.setExpression(n.getStringValue()); });
        deserializerMap.put("targetAttributeDefinition", (n) -> { this.setTargetAttributeDefinition(n.getObjectValue(AttributeDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("testInputObject", (n) -> { this.setTestInputObject(n.getObjectValue(ExpressionInputObject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the targetAttributeDefinition property value. The targetAttributeDefinition property
     * @return a attributeDefinition
     */
    @jakarta.annotation.Nullable
    public AttributeDefinition getTargetAttributeDefinition() {
        return this.targetAttributeDefinition;
    }
    /**
     * Gets the testInputObject property value. The testInputObject property
     * @return a expressionInputObject
     */
    @jakarta.annotation.Nullable
    public ExpressionInputObject getTestInputObject() {
        return this.testInputObject;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("expression", this.getExpression());
        writer.writeObjectValue("targetAttributeDefinition", this.getTargetAttributeDefinition());
        writer.writeObjectValue("testInputObject", this.getTestInputObject());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the expression property value. The expression property
     * @param value Value to set for the expression property.
     */
    public void setExpression(@jakarta.annotation.Nullable final String value) {
        this.expression = value;
    }
    /**
     * Sets the targetAttributeDefinition property value. The targetAttributeDefinition property
     * @param value Value to set for the targetAttributeDefinition property.
     */
    public void setTargetAttributeDefinition(@jakarta.annotation.Nullable final AttributeDefinition value) {
        this.targetAttributeDefinition = value;
    }
    /**
     * Sets the testInputObject property value. The testInputObject property
     * @param value Value to set for the testInputObject property.
     */
    public void setTestInputObject(@jakarta.annotation.Nullable final ExpressionInputObject value) {
        this.testInputObject = value;
    }
}
