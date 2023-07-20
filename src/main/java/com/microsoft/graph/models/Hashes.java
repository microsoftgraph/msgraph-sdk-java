package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Hashes implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The CRC32 value of the file in little endian (if available). Read-only.
     */
    private String crc32Hash;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * A proprietary hash of the file that can be used to determine if the contents of the file have changed (if available). Read-only.
     */
    private String quickXorHash;
    /**
     * SHA1 hash for the contents of the file (if available). Read-only.
     */
    private String sha1Hash;
    /**
     * SHA256 hash for the contents of the file (if available). Read-only.
     */
    private String sha256Hash;
    /**
     * Instantiates a new hashes and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Hashes() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a hashes
     */
    @javax.annotation.Nonnull
    public static Hashes createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Hashes();
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
     * Gets the crc32Hash property value. The CRC32 value of the file in little endian (if available). Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCrc32Hash() {
        return this.crc32Hash;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("crc32Hash", (n) -> { this.setCrc32Hash(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("quickXorHash", (n) -> { this.setQuickXorHash(n.getStringValue()); });
        deserializerMap.put("sha1Hash", (n) -> { this.setSha1Hash(n.getStringValue()); });
        deserializerMap.put("sha256Hash", (n) -> { this.setSha256Hash(n.getStringValue()); });
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
     * Gets the quickXorHash property value. A proprietary hash of the file that can be used to determine if the contents of the file have changed (if available). Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQuickXorHash() {
        return this.quickXorHash;
    }
    /**
     * Gets the sha1Hash property value. SHA1 hash for the contents of the file (if available). Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSha1Hash() {
        return this.sha1Hash;
    }
    /**
     * Gets the sha256Hash property value. SHA256 hash for the contents of the file (if available). Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSha256Hash() {
        return this.sha256Hash;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("crc32Hash", this.getCrc32Hash());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("quickXorHash", this.getQuickXorHash());
        writer.writeStringValue("sha1Hash", this.getSha1Hash());
        writer.writeStringValue("sha256Hash", this.getSha256Hash());
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
     * Sets the crc32Hash property value. The CRC32 value of the file in little endian (if available). Read-only.
     * @param value Value to set for the crc32Hash property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCrc32Hash(@javax.annotation.Nullable final String value) {
        this.crc32Hash = value;
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
     * Sets the quickXorHash property value. A proprietary hash of the file that can be used to determine if the contents of the file have changed (if available). Read-only.
     * @param value Value to set for the quickXorHash property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuickXorHash(@javax.annotation.Nullable final String value) {
        this.quickXorHash = value;
    }
    /**
     * Sets the sha1Hash property value. SHA1 hash for the contents of the file (if available). Read-only.
     * @param value Value to set for the sha1Hash property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSha1Hash(@javax.annotation.Nullable final String value) {
        this.sha1Hash = value;
    }
    /**
     * Sets the sha256Hash property value. SHA256 hash for the contents of the file (if available). Read-only.
     * @param value Value to set for the sha256Hash property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSha256Hash(@javax.annotation.Nullable final String value) {
        this.sha256Hash = value;
    }
}
