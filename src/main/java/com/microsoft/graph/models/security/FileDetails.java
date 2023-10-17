package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FileDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The name of the file.
     */
    private String fileName;
    /**
     * The file path (location) of the file instance.
     */
    private String filePath;
    /**
     * The publisher of the file.
     */
    private String filePublisher;
    /**
     * The size of the file in bytes.
     */
    private Long fileSize;
    /**
     * The certificate authority (CA) that issued the certificate.
     */
    private String issuer;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The Sha1 cryptographic hash of the file content.
     */
    private String sha1;
    /**
     * The Sha256 cryptographic hash of the file content.
     */
    private String sha256;
    /**
     * The signer of the signed file.
     */
    private String signer;
    /**
     * Instantiates a new FileDetails and sets the default values.
     */
    public FileDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FileDetails
     */
    @jakarta.annotation.Nonnull
    public static FileDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileDetails();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
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
     * Gets the fileName property value. The name of the file.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.fileName;
    }
    /**
     * Gets the filePath property value. The file path (location) of the file instance.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFilePath() {
        return this.filePath;
    }
    /**
     * Gets the filePublisher property value. The publisher of the file.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFilePublisher() {
        return this.filePublisher;
    }
    /**
     * Gets the fileSize property value. The size of the file in bytes.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getFileSize() {
        return this.fileSize;
    }
    /**
     * Gets the issuer property value. The certificate authority (CA) that issued the certificate.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIssuer() {
        return this.issuer;
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
     * Gets the sha1 property value. The Sha1 cryptographic hash of the file content.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSha1() {
        return this.sha1;
    }
    /**
     * Gets the sha256 property value. The Sha256 cryptographic hash of the file content.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSha256() {
        return this.sha256;
    }
    /**
     * Gets the signer property value. The signer of the signed file.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSigner() {
        return this.signer;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the fileName property value. The name of the file.
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.fileName = value;
    }
    /**
     * Sets the filePath property value. The file path (location) of the file instance.
     * @param value Value to set for the filePath property.
     */
    public void setFilePath(@jakarta.annotation.Nullable final String value) {
        this.filePath = value;
    }
    /**
     * Sets the filePublisher property value. The publisher of the file.
     * @param value Value to set for the filePublisher property.
     */
    public void setFilePublisher(@jakarta.annotation.Nullable final String value) {
        this.filePublisher = value;
    }
    /**
     * Sets the fileSize property value. The size of the file in bytes.
     * @param value Value to set for the fileSize property.
     */
    public void setFileSize(@jakarta.annotation.Nullable final Long value) {
        this.fileSize = value;
    }
    /**
     * Sets the issuer property value. The certificate authority (CA) that issued the certificate.
     * @param value Value to set for the issuer property.
     */
    public void setIssuer(@jakarta.annotation.Nullable final String value) {
        this.issuer = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the sha1 property value. The Sha1 cryptographic hash of the file content.
     * @param value Value to set for the sha1 property.
     */
    public void setSha1(@jakarta.annotation.Nullable final String value) {
        this.sha1 = value;
    }
    /**
     * Sets the sha256 property value. The Sha256 cryptographic hash of the file content.
     * @param value Value to set for the sha256 property.
     */
    public void setSha256(@jakarta.annotation.Nullable final String value) {
        this.sha256 = value;
    }
    /**
     * Sets the signer property value. The signer of the signed file.
     * @param value Value to set for the signer property.
     */
    public void setSigner(@jakarta.annotation.Nullable final String value) {
        this.signer = value;
    }
}
