package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AttributeDefinitionMetadataEntry implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Possible values are: BaseAttributeName, ComplexObjectDefinition, IsContainer, IsCustomerDefined, IsDomainQualified, LinkPropertyNames, LinkTypeName, MaximumLength, ReferencedProperty.
     */
    private AttributeDefinitionMetadata key;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Value of the metadata property.
     */
    private String value;
    /**
     * Instantiates a new AttributeDefinitionMetadataEntry and sets the default values.
     */
    public AttributeDefinitionMetadataEntry() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AttributeDefinitionMetadataEntry
     */
    @jakarta.annotation.Nonnull
    public static AttributeDefinitionMetadataEntry createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttributeDefinitionMetadataEntry();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("key", (n) -> { this.setKey(n.getEnumValue(AttributeDefinitionMetadata.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the key property value. Possible values are: BaseAttributeName, ComplexObjectDefinition, IsContainer, IsCustomerDefined, IsDomainQualified, LinkPropertyNames, LinkTypeName, MaximumLength, ReferencedProperty.
     * @return a AttributeDefinitionMetadata
     */
    @jakarta.annotation.Nullable
    public AttributeDefinitionMetadata getKey() {
        return this.key;
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
     * Gets the value property value. Value of the metadata property.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("key", this.getKey());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("value", this.getValue());
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
     * Sets the key property value. Possible values are: BaseAttributeName, ComplexObjectDefinition, IsContainer, IsCustomerDefined, IsDomainQualified, LinkPropertyNames, LinkTypeName, MaximumLength, ReferencedProperty.
     * @param value Value to set for the key property.
     */
    public void setKey(@jakarta.annotation.Nullable final AttributeDefinitionMetadata value) {
        this.key = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the value property value. Value of the metadata property.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
