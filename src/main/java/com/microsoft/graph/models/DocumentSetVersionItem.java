package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DocumentSetVersionItem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The unique identifier for the item. */
    private String _itemId;
    /** The OdataType property */
    private String _odataType;
    /** The title of the item. */
    private String _title;
    /** The version ID of the item. */
    private String _versionId;
    /**
     * Instantiates a new documentSetVersionItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DocumentSetVersionItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a documentSetVersionItem
     */
    @javax.annotation.Nonnull
    public static DocumentSetVersionItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DocumentSetVersionItem();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("itemId", (n) -> { this.setItemId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("versionId", (n) -> { this.setVersionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the itemId property value. The unique identifier for the item.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getItemId() {
        return this._itemId;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the title property value. The title of the item.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this._title;
    }
    /**
     * Gets the versionId property value. The version ID of the item.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersionId() {
        return this._versionId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("itemId", this.getItemId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("title", this.getTitle());
        writer.writeStringValue("versionId", this.getVersionId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the itemId property value. The unique identifier for the item.
     * @param value Value to set for the itemId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItemId(@javax.annotation.Nullable final String value) {
        this._itemId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the title property value. The title of the item.
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final String value) {
        this._title = value;
    }
    /**
     * Sets the versionId property value. The version ID of the item.
     * @param value Value to set for the versionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersionId(@javax.annotation.Nullable final String value) {
        this._versionId = value;
    }
}
