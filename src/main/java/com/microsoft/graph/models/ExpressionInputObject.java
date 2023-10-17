package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExpressionInputObject implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Definition of the test object.
     */
    private ObjectDefinition definition;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Property values of the test object.
     */
    private java.util.List<StringKeyObjectValuePair> properties;
    /**
     * Instantiates a new ExpressionInputObject and sets the default values.
     */
    public ExpressionInputObject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExpressionInputObject
     */
    @jakarta.annotation.Nonnull
    public static ExpressionInputObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExpressionInputObject();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the definition property value. Definition of the test object.
     * @return a ObjectDefinition
     */
    @jakarta.annotation.Nullable
    public ObjectDefinition getDefinition() {
        return this.definition;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("definition", (n) -> { this.setDefinition(n.getObjectValue(ObjectDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("properties", (n) -> { this.setProperties(n.getCollectionOfObjectValues(StringKeyObjectValuePair::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the properties property value. Property values of the test object.
     * @return a java.util.List<StringKeyObjectValuePair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<StringKeyObjectValuePair> getProperties() {
        return this.properties;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("definition", this.getDefinition());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("properties", this.getProperties());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the definition property value. Definition of the test object.
     * @param value Value to set for the definition property.
     */
    public void setDefinition(@jakarta.annotation.Nullable final ObjectDefinition value) {
        this.definition = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the properties property value. Property values of the test object.
     * @param value Value to set for the properties property.
     */
    public void setProperties(@jakarta.annotation.Nullable final java.util.List<StringKeyObjectValuePair> value) {
        this.properties = value;
    }
}
