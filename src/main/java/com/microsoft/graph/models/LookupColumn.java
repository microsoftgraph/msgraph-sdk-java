package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LookupColumn implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether multiple values can be selected from the source.
     */
    private Boolean allowMultipleValues;
    /**
     * Indicates whether values in the column should be able to exceed the standard limit of 255 characters.
     */
    private Boolean allowUnlimitedLength;
    /**
     * The name of the lookup source column.
     */
    private String columnName;
    /**
     * The unique identifier of the lookup source list.
     */
    private String listId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * If specified, this column is a secondary lookup, pulling an additional field from the list item looked up by the primary lookup. Use the list item looked up by the primary as the source for the column named here.
     */
    private String primaryLookupColumnId;
    /**
     * Instantiates a new lookupColumn and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public LookupColumn() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a lookupColumn
     */
    @javax.annotation.Nonnull
    public static LookupColumn createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LookupColumn();
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
     * Gets the allowMultipleValues property value. Indicates whether multiple values can be selected from the source.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowMultipleValues() {
        return this.allowMultipleValues;
    }
    /**
     * Gets the allowUnlimitedLength property value. Indicates whether values in the column should be able to exceed the standard limit of 255 characters.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowUnlimitedLength() {
        return this.allowUnlimitedLength;
    }
    /**
     * Gets the columnName property value. The name of the lookup source column.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getColumnName() {
        return this.columnName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("allowMultipleValues", (n) -> { this.setAllowMultipleValues(n.getBooleanValue()); });
        deserializerMap.put("allowUnlimitedLength", (n) -> { this.setAllowUnlimitedLength(n.getBooleanValue()); });
        deserializerMap.put("columnName", (n) -> { this.setColumnName(n.getStringValue()); });
        deserializerMap.put("listId", (n) -> { this.setListId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("primaryLookupColumnId", (n) -> { this.setPrimaryLookupColumnId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the listId property value. The unique identifier of the lookup source list.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getListId() {
        return this.listId;
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
     * Gets the primaryLookupColumnId property value. If specified, this column is a secondary lookup, pulling an additional field from the list item looked up by the primary lookup. Use the list item looked up by the primary as the source for the column named here.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrimaryLookupColumnId() {
        return this.primaryLookupColumnId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowMultipleValues", this.getAllowMultipleValues());
        writer.writeBooleanValue("allowUnlimitedLength", this.getAllowUnlimitedLength());
        writer.writeStringValue("columnName", this.getColumnName());
        writer.writeStringValue("listId", this.getListId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("primaryLookupColumnId", this.getPrimaryLookupColumnId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the allowMultipleValues property value. Indicates whether multiple values can be selected from the source.
     * @param value Value to set for the allowMultipleValues property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowMultipleValues(@javax.annotation.Nullable final Boolean value) {
        this.allowMultipleValues = value;
    }
    /**
     * Sets the allowUnlimitedLength property value. Indicates whether values in the column should be able to exceed the standard limit of 255 characters.
     * @param value Value to set for the allowUnlimitedLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowUnlimitedLength(@javax.annotation.Nullable final Boolean value) {
        this.allowUnlimitedLength = value;
    }
    /**
     * Sets the columnName property value. The name of the lookup source column.
     * @param value Value to set for the columnName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColumnName(@javax.annotation.Nullable final String value) {
        this.columnName = value;
    }
    /**
     * Sets the listId property value. The unique identifier of the lookup source list.
     * @param value Value to set for the listId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setListId(@javax.annotation.Nullable final String value) {
        this.listId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the primaryLookupColumnId property value. If specified, this column is a secondary lookup, pulling an additional field from the list item looked up by the primary lookup. Use the list item looked up by the primary as the source for the column named here.
     * @param value Value to set for the primaryLookupColumnId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrimaryLookupColumnId(@javax.annotation.Nullable final String value) {
        this.primaryLookupColumnId = value;
    }
}
