package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FilterClause implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Name of the operator to be applied to the source and target operands. Must be one of the supported operators. Supported operators can be discovered.
     */
    private String operatorName;
    /**
     * Name of source operand (the operand being tested). The source operand name must match one of the attribute names on the source object.
     */
    private String sourceOperandName;
    /**
     * Values that the source operand will be tested against.
     */
    private FilterOperand targetOperand;
    /**
     * Instantiates a new filterClause and sets the default values.
     */
    public FilterClause() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a filterClause
     */
    @jakarta.annotation.Nonnull
    public static FilterClause createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FilterClause();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("operatorName", (n) -> { this.setOperatorName(n.getStringValue()); });
        deserializerMap.put("sourceOperandName", (n) -> { this.setSourceOperandName(n.getStringValue()); });
        deserializerMap.put("targetOperand", (n) -> { this.setTargetOperand(n.getObjectValue(FilterOperand::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the operatorName property value. Name of the operator to be applied to the source and target operands. Must be one of the supported operators. Supported operators can be discovered.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOperatorName() {
        return this.operatorName;
    }
    /**
     * Gets the sourceOperandName property value. Name of source operand (the operand being tested). The source operand name must match one of the attribute names on the source object.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSourceOperandName() {
        return this.sourceOperandName;
    }
    /**
     * Gets the targetOperand property value. Values that the source operand will be tested against.
     * @return a filterOperand
     */
    @jakarta.annotation.Nullable
    public FilterOperand getTargetOperand() {
        return this.targetOperand;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("operatorName", this.getOperatorName());
        writer.writeStringValue("sourceOperandName", this.getSourceOperandName());
        writer.writeObjectValue("targetOperand", this.getTargetOperand());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the operatorName property value. Name of the operator to be applied to the source and target operands. Must be one of the supported operators. Supported operators can be discovered.
     * @param value Value to set for the operatorName property.
     */
    public void setOperatorName(@jakarta.annotation.Nullable final String value) {
        this.operatorName = value;
    }
    /**
     * Sets the sourceOperandName property value. Name of source operand (the operand being tested). The source operand name must match one of the attribute names on the source object.
     * @param value Value to set for the sourceOperandName property.
     */
    public void setSourceOperandName(@jakarta.annotation.Nullable final String value) {
        this.sourceOperandName = value;
    }
    /**
     * Sets the targetOperand property value. Values that the source operand will be tested against.
     * @param value Value to set for the targetOperand property.
     */
    public void setTargetOperand(@jakarta.annotation.Nullable final FilterOperand value) {
        this.targetOperand = value;
    }
}
