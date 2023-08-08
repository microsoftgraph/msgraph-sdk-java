package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FileSecurityState implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Complex type containing file hashes (cryptographic and location-sensitive).
     */
    private FileHash fileHash;
    /**
     * File name (without path).
     */
    private String name;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Full file path of the file/imageFile.
     */
    private String path;
    /**
     * Provider generated/calculated risk score of the alert file. Recommended value range of 0-1, which equates to a percentage.
     */
    private String riskScore;
    /**
     * Instantiates a new fileSecurityState and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public FileSecurityState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a fileSecurityState
     */
    @jakarta.annotation.Nonnull
    public static FileSecurityState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileSecurityState();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("fileHash", (n) -> { this.setFileHash(n.getObjectValue(FileHash::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("path", (n) -> { this.setPath(n.getStringValue()); });
        deserializerMap.put("riskScore", (n) -> { this.setRiskScore(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileHash property value. Complex type containing file hashes (cryptographic and location-sensitive).
     * @return a fileHash
     */
    @jakarta.annotation.Nullable
    public FileHash getFileHash() {
        return this.fileHash;
    }
    /**
     * Gets the name property value. File name (without path).
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
     * Gets the path property value. Full file path of the file/imageFile.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPath() {
        return this.path;
    }
    /**
     * Gets the riskScore property value. Provider generated/calculated risk score of the alert file. Recommended value range of 0-1, which equates to a percentage.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRiskScore() {
        return this.riskScore;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("fileHash", this.getFileHash());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("path", this.getPath());
        writer.writeStringValue("riskScore", this.getRiskScore());
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
     * Sets the fileHash property value. Complex type containing file hashes (cryptographic and location-sensitive).
     * @param value Value to set for the fileHash property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFileHash(@jakarta.annotation.Nullable final FileHash value) {
        this.fileHash = value;
    }
    /**
     * Sets the name property value. File name (without path).
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
     * Sets the path property value. Full file path of the file/imageFile.
     * @param value Value to set for the path property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPath(@jakarta.annotation.Nullable final String value) {
        this.path = value;
    }
    /**
     * Sets the riskScore property value. Provider generated/calculated risk score of the alert file. Recommended value range of 0-1, which equates to a percentage.
     * @param value Value to set for the riskScore property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRiskScore(@jakarta.annotation.Nullable final String value) {
        this.riskScore = value;
    }
}
