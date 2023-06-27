package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CollapseProperty implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Defines the collapse group to trim results. The properties in this collection must be sortable/refinable properties. Required.
     */
    private java.util.List<String> fields;
    /**
     * Defines a maximum limit count for this field. This numeric value must be a positive integer. Required.
     */
    private Integer limit;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new CollapseProperty and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CollapseProperty() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CollapseProperty
     */
    @javax.annotation.Nonnull
    public static CollapseProperty createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CollapseProperty();
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
        deserializerMap.put("fields", (n) -> { this.setFields(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fields property value. Defines the collapse group to trim results. The properties in this collection must be sortable/refinable properties. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getFields() {
        return this.fields;
    }
    /**
     * Gets the limit property value. Defines a maximum limit count for this field. This numeric value must be a positive integer. Required.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("fields", this.getFields());
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the fields property value. Defines the collapse group to trim results. The properties in this collection must be sortable/refinable properties. Required.
     * @param value Value to set for the fields property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFields(@javax.annotation.Nullable final java.util.List<String> value) {
        this.fields = value;
    }
    /**
     * Sets the limit property value. Defines a maximum limit count for this field. This numeric value must be a positive integer. Required.
     * @param value Value to set for the limit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLimit(@javax.annotation.Nullable final Integer value) {
        this.limit = value;
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
}
