package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ReferencedObject implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Name of the referenced object. Must match one of the objects in the directory definition.
     */
    private String referencedObjectName;
    /**
     * Currently not supported. Name of the property in the referenced object, the value for which is used as the reference.
     */
    private String referencedProperty;
    /**
     * Instantiates a new referencedObject and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ReferencedObject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a referencedObject
     */
    @javax.annotation.Nonnull
    public static ReferencedObject createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReferencedObject();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("referencedObjectName", (n) -> { this.setReferencedObjectName(n.getStringValue()); });
        deserializerMap.put("referencedProperty", (n) -> { this.setReferencedProperty(n.getStringValue()); });
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
     * Gets the referencedObjectName property value. Name of the referenced object. Must match one of the objects in the directory definition.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReferencedObjectName() {
        return this.referencedObjectName;
    }
    /**
     * Gets the referencedProperty property value. Currently not supported. Name of the property in the referenced object, the value for which is used as the reference.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReferencedProperty() {
        return this.referencedProperty;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("referencedObjectName", this.getReferencedObjectName());
        writer.writeStringValue("referencedProperty", this.getReferencedProperty());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the referencedObjectName property value. Name of the referenced object. Must match one of the objects in the directory definition.
     * @param value Value to set for the referencedObjectName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReferencedObjectName(@javax.annotation.Nullable final String value) {
        this.referencedObjectName = value;
    }
    /**
     * Sets the referencedProperty property value. Currently not supported. Name of the property in the referenced object, the value for which is used as the reference.
     * @param value Value to set for the referencedProperty property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReferencedProperty(@javax.annotation.Nullable final String value) {
        this.referencedProperty = value;
    }
}
