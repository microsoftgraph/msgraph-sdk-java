package com.microsoft.graph.models.externalconnectors;

import com.microsoft.graph.models.BinaryOperator;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PropertyRule implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The operation property
     */
    private RuleOperation operation;
    /**
     * The property from the externalItem schema. Required.
     */
    private String property;
    /**
     * A collection with one or many strings. The specified string(s) will be matched with the specified property using the specified operation. Required.
     */
    private java.util.List<String> values;
    /**
     * The valuesJoinedBy property
     */
    private BinaryOperator valuesJoinedBy;
    /**
     * Instantiates a new propertyRule and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public PropertyRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a propertyRule
     */
    @jakarta.annotation.Nonnull
    public static PropertyRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PropertyRule();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("operation", (n) -> { this.setOperation(n.getEnumValue(RuleOperation.class)); });
        deserializerMap.put("property", (n) -> { this.setProperty(n.getStringValue()); });
        deserializerMap.put("values", (n) -> { this.setValues(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("valuesJoinedBy", (n) -> { this.setValuesJoinedBy(n.getEnumValue(BinaryOperator.class)); });
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
     * Gets the operation property value. The operation property
     * @return a ruleOperation
     */
    @jakarta.annotation.Nullable
    public RuleOperation getOperation() {
        return this.operation;
    }
    /**
     * Gets the property property value. The property from the externalItem schema. Required.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getProperty() {
        return this.property;
    }
    /**
     * Gets the values property value. A collection with one or many strings. The specified string(s) will be matched with the specified property using the specified operation. Required.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getValues() {
        return this.values;
    }
    /**
     * Gets the valuesJoinedBy property value. The valuesJoinedBy property
     * @return a binaryOperator
     */
    @jakarta.annotation.Nullable
    public BinaryOperator getValuesJoinedBy() {
        return this.valuesJoinedBy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("operation", this.getOperation());
        writer.writeStringValue("property", this.getProperty());
        writer.writeCollectionOfPrimitiveValues("values", this.getValues());
        writer.writeEnumValue("valuesJoinedBy", this.getValuesJoinedBy());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the operation property value. The operation property
     * @param value Value to set for the operation property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOperation(@jakarta.annotation.Nullable final RuleOperation value) {
        this.operation = value;
    }
    /**
     * Sets the property property value. The property from the externalItem schema. Required.
     * @param value Value to set for the property property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setProperty(@jakarta.annotation.Nullable final String value) {
        this.property = value;
    }
    /**
     * Sets the values property value. A collection with one or many strings. The specified string(s) will be matched with the specified property using the specified operation. Required.
     * @param value Value to set for the values property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setValues(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.values = value;
    }
    /**
     * Sets the valuesJoinedBy property value. The valuesJoinedBy property
     * @param value Value to set for the valuesJoinedBy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setValuesJoinedBy(@jakarta.annotation.Nullable final BinaryOperator value) {
        this.valuesJoinedBy = value;
    }
}
