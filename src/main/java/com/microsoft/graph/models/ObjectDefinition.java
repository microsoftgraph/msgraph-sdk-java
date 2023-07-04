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
     * The attributes property
     */
    private java.util.List<AttributeDefinition> attributes;
    /**
     * The metadata property
     */
    private java.util.List<ObjectDefinitionMetadataEntry> metadata;
    /**
     * The name property
     */
    private String name;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The supportedApis property
     */
    private java.util.List<String> supportedApis;
    /**
     * Instantiates a new objectDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ObjectDefinition() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a objectDefinition
     */
    @javax.annotation.Nonnull
    public static ObjectDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ObjectDefinition();
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
     * Gets the attributes property value. The attributes property
     * @return a attributeDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<AttributeDefinition> getAttributes() {
        return this.attributes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * Gets the metadata property value. The metadata property
     * @return a objectDefinitionMetadataEntry
     */
    @javax.annotation.Nullable
    public java.util.List<ObjectDefinitionMetadataEntry> getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
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
     * Gets the supportedApis property value. The supportedApis property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSupportedApis() {
        return this.supportedApis;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the attributes property value. The attributes property
     * @param value Value to set for the attributes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttributes(@javax.annotation.Nullable final java.util.List<AttributeDefinition> value) {
        this.attributes = value;
    }
    /**
     * Sets the metadata property value. The metadata property
     * @param value Value to set for the metadata property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMetadata(@javax.annotation.Nullable final java.util.List<ObjectDefinitionMetadataEntry> value) {
        this.metadata = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
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
     * Sets the supportedApis property value. The supportedApis property
     * @param value Value to set for the supportedApis property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportedApis(@javax.annotation.Nullable final java.util.List<String> value) {
        this.supportedApis = value;
    }
}
