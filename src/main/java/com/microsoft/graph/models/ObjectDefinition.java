package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ObjectDefinition implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Defines attributes of the object.
     */
    private java.util.List<AttributeDefinition> attributes;
    /**
     * Metadata for the given object.
     */
    private java.util.List<ObjectDefinitionMetadataEntry> metadata;
    /**
     * Name of the object. Must be unique within a directory definition. Not nullable.
     */
    private String name;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The API that the provisioning service queries to retrieve data for synchronization.
     */
    private java.util.List<String> supportedApis;
    /**
     * Instantiates a new objectDefinition and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ObjectDefinition() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a objectDefinition
     */
    @jakarta.annotation.Nonnull
    public static ObjectDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ObjectDefinition();
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
     * Gets the attributes property value. Defines attributes of the object.
     * @return a attributeDefinition
     */
    @jakarta.annotation.Nullable
    public java.util.List<AttributeDefinition> getAttributes() {
        return this.attributes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("attributes", (n) -> { this.setAttributes(n.getCollectionOfObjectValues(AttributeDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getCollectionOfObjectValues(ObjectDefinitionMetadataEntry::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("supportedApis", (n) -> { this.setSupportedApis(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the metadata property value. Metadata for the given object.
     * @return a objectDefinitionMetadataEntry
     */
    @jakarta.annotation.Nullable
    public java.util.List<ObjectDefinitionMetadataEntry> getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the name property value. Name of the object. Must be unique within a directory definition. Not nullable.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
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
     * Gets the supportedApis property value. The API that the provisioning service queries to retrieve data for synchronization.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportedApis() {
        return this.supportedApis;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("attributes", this.getAttributes());
        writer.writeCollectionOfObjectValues("metadata", this.getMetadata());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("supportedApis", this.getSupportedApis());
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
     * Sets the attributes property value. Defines attributes of the object.
     * @param value Value to set for the attributes property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAttributes(@jakarta.annotation.Nullable final java.util.List<AttributeDefinition> value) {
        this.attributes = value;
    }
    /**
     * Sets the metadata property value. Metadata for the given object.
     * @param value Value to set for the metadata property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMetadata(@jakarta.annotation.Nullable final java.util.List<ObjectDefinitionMetadataEntry> value) {
        this.metadata = value;
    }
    /**
     * Sets the name property value. Name of the object. Must be unique within a directory definition. Not nullable.
     * @param value Value to set for the name property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
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
     * Sets the supportedApis property value. The API that the provisioning service queries to retrieve data for synchronization.
     * @param value Value to set for the supportedApis property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSupportedApis(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.supportedApis = value;
    }
}
