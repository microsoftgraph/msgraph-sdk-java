package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DocumentSetContent implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Content type information of the file. */
    private ContentTypeInfo _contentType;
    /** Name of the file in resource folder that should be added as a default content or a template in the document set. */
    private String _fileName;
    /** Folder name in which the file will be placed when a new document set is created in the library. */
    private String _folderName;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new documentSetContent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DocumentSetContent() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.documentSetContent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a documentSetContent
     */
    @javax.annotation.Nonnull
    public static DocumentSetContent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DocumentSetContent();
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
     * Gets the contentType property value. Content type information of the file.
     * @return a contentTypeInfo
     */
    @javax.annotation.Nullable
    public ContentTypeInfo getContentType() {
        return this._contentType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DocumentSetContent currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("contentType", (n) -> { currentObject.setContentType(n.getObjectValue(ContentTypeInfo::createFromDiscriminatorValue)); });
            this.put("fileName", (n) -> { currentObject.setFileName(n.getStringValue()); });
            this.put("folderName", (n) -> { currentObject.setFolderName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the fileName property value. Name of the file in resource folder that should be added as a default content or a template in the document set.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileName() {
        return this._fileName;
    }
    /**
     * Gets the folderName property value. Folder name in which the file will be placed when a new document set is created in the library.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFolderName() {
        return this._folderName;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("contentType", this.getContentType());
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeStringValue("folderName", this.getFolderName());
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
        this._additionalData = value;
    }
    /**
     * Sets the contentType property value. Content type information of the file.
     * @param value Value to set for the contentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentType(@javax.annotation.Nullable final ContentTypeInfo value) {
        this._contentType = value;
    }
    /**
     * Sets the fileName property value. Name of the file in resource folder that should be added as a default content or a template in the document set.
     * @param value Value to set for the fileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileName(@javax.annotation.Nullable final String value) {
        this._fileName = value;
    }
    /**
     * Sets the folderName property value. Folder name in which the file will be placed when a new document set is created in the library.
     * @param value Value to set for the folderName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFolderName(@javax.annotation.Nullable final String value) {
        this._folderName = value;
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
}
