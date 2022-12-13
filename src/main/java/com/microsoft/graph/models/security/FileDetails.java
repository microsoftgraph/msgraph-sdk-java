package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FileDetails implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The fileName property */
    private String _fileName;
    /** The filePath property */
    private String _filePath;
    /** The filePublisher property */
    private String _filePublisher;
    /** The fileSize property */
    private Long _fileSize;
    /** The issuer property */
    private String _issuer;
    /** The OdataType property */
    private String _odataType;
    /** The sha1 property */
    private String _sha1;
    /** The sha256 property */
    private String _sha256;
    /** The signer property */
    private String _signer;
    /**
     * Instantiates a new fileDetails and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public FileDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a fileDetails
     */
    @javax.annotation.Nonnull
    public static FileDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileDetails();
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(9);
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("filePath", (n) -> { this.setFilePath(n.getStringValue()); });
        deserializerMap.put("filePublisher", (n) -> { this.setFilePublisher(n.getStringValue()); });
        deserializerMap.put("fileSize", (n) -> { this.setFileSize(n.getLongValue()); });
        deserializerMap.put("issuer", (n) -> { this.setIssuer(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sha1", (n) -> { this.setSha1(n.getStringValue()); });
        deserializerMap.put("sha256", (n) -> { this.setSha256(n.getStringValue()); });
        deserializerMap.put("signer", (n) -> { this.setSigner(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileName property value. The fileName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileName() {
        return this._fileName;
    }
    /**
     * Gets the filePath property value. The filePath property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFilePath() {
        return this._filePath;
    }
    /**
     * Gets the filePublisher property value. The filePublisher property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFilePublisher() {
        return this._filePublisher;
    }
    /**
     * Gets the fileSize property value. The fileSize property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getFileSize() {
        return this._fileSize;
    }
    /**
     * Gets the issuer property value. The issuer property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIssuer() {
        return this._issuer;
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
     * Gets the sha1 property value. The sha1 property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSha1() {
        return this._sha1;
    }
    /**
     * Gets the sha256 property value. The sha256 property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSha256() {
        return this._sha256;
    }
    /**
     * Gets the signer property value. The signer property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSigner() {
        return this._signer;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeStringValue("filePath", this.getFilePath());
        writer.writeStringValue("filePublisher", this.getFilePublisher());
        writer.writeLongValue("fileSize", this.getFileSize());
        writer.writeStringValue("issuer", this.getIssuer());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sha1", this.getSha1());
        writer.writeStringValue("sha256", this.getSha256());
        writer.writeStringValue("signer", this.getSigner());
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
     * Sets the fileName property value. The fileName property
     * @param value Value to set for the fileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileName(@javax.annotation.Nullable final String value) {
        this._fileName = value;
    }
    /**
     * Sets the filePath property value. The filePath property
     * @param value Value to set for the filePath property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFilePath(@javax.annotation.Nullable final String value) {
        this._filePath = value;
    }
    /**
     * Sets the filePublisher property value. The filePublisher property
     * @param value Value to set for the filePublisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFilePublisher(@javax.annotation.Nullable final String value) {
        this._filePublisher = value;
    }
    /**
     * Sets the fileSize property value. The fileSize property
     * @param value Value to set for the fileSize property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileSize(@javax.annotation.Nullable final Long value) {
        this._fileSize = value;
    }
    /**
     * Sets the issuer property value. The issuer property
     * @param value Value to set for the issuer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIssuer(@javax.annotation.Nullable final String value) {
        this._issuer = value;
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
     * Sets the sha1 property value. The sha1 property
     * @param value Value to set for the sha1 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSha1(@javax.annotation.Nullable final String value) {
        this._sha1 = value;
    }
    /**
     * Sets the sha256 property value. The sha256 property
     * @param value Value to set for the sha256 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSha256(@javax.annotation.Nullable final String value) {
        this._sha256 = value;
    }
    /**
     * Sets the signer property value. The signer property
     * @param value Value to set for the signer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSigner(@javax.annotation.Nullable final String value) {
        this._signer = value;
    }
}
